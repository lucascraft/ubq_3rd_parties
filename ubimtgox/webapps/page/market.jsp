<%@page contentType="text/html;charset=UTF-8" %>

<%@ page import="java.util.*"%>
<%@ page import="net.sf.smbt.btc.BitcoinMarket"%>
<%@ page import="net.sf.smbt.btc.mtgox.FetchValue"%>
<%@ page import="com.ubiquisense.ubibot.timed.LinkedFinancialTimedValue"%>
<%@ page import="com.ubiquisense.ubibot.timed.TimeDuration"%>
<%@ page import="com.ubiquisense.ubibot.timed.TimeRange"%>
<%@ page import="com.ubiquisense.ubibot.timed.CandleStickManager"%>
<%@ page import="com.ubiquisense.ubibot.timed.CandleStickData"%>
<%@ page import="net.sf.smbt.btc.BitcoinMarket"%>
<%@ page import="net.sf.smbt.btc.mtgox.MTGox"%>
<%@ page import="net.sf.smbt.btc.mtgox.MTGoxDataManager"%>
<%@ page import="com.ubiquisense.ubibot.MTGoxWebSocketCommunicatorThread"%>
<%@ page import="com.ubiquisense.ubibot.MtGoxJettyBotServer"%>
<%@ page import="java.text.SimpleDateFormat"%>

<html>
 <head>
 	<title>Market</title>
 </head>
 <body>

	<head>

<!-- nav bar -->

		<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
		<meta charset="utf-8">
		<link href="../page/css3_menu_demo/style.css" media="screen"  rel="stylesheet" type="text/css" />
		<link href="../page/css3_menu_demo/iconic.css" media="screen" rel="stylesheet" type="text/css" />
		<script src="../page/css3_menu_demo/prefix-free.js"></script>
		
		
		
<!-- chart -->
        	<% 
      SimpleDateFormat READABLE_DATE_FORMAT	= new SimpleDateFormat("dd/MM/yyyy");
      READABLE_DATE_FORMAT.setLenient(true);
      READABLE_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0:00")); // UTC

        		String dataAsStr = "";
				List<LinkedFinancialTimedValue> timedValues = new ArrayList<LinkedFinancialTimedValue>();
				
				MTGoxWebSocketCommunicatorThread t = MtGoxJettyBotServer.INSTANCE.getMTGoxWebSocketCommunicatorThread();
  				MTGoxDataManager dataManager = t.getMtgoxDataManager();
  				MTGox mtgox = dataManager.getMtGox();
				
  				CandleStickManager candleStickManager = new CandleStickManager(timedValues);
				List<FetchValue> values = mtgox.getFetchs();
				for (int i=0; i<values.size();i+=1) {
					FetchValue order = values.get(i);
					if (order!=null) {
						Date d = new Date(order.getStamp());
						LinkedFinancialTimedValue v = new LinkedFinancialTimedValue(order.getPrice(), d, order.getAmount(), LinkedFinancialTimedValue.UP);
						candleStickManager.getTimedRange().setTimedValue(v);
						timedValues.add(v);
						if (i-1>=0 && timedValues.get(i-1) != null && !timedValues.isEmpty()) {
							LinkedFinancialTimedValue p = timedValues.get(i-1);
							v.setPrec(p);
							p.setNext(v);
						}
					}
				}
        		
				candleStickManager.updateCandles(800, 300);
        		
				String data = "[";
        		int idx=0;
        		for (CandleStickData csd : candleStickManager.getCandles()) {
        			String chunk = "{ \"DateString\": \""+READABLE_DATE_FORMAT.format(csd.getRange().begins)+"\", \"Open\": " + csd.getOpen() + ", \"High\": " + csd.getHigh() + ", \"Low\": " + csd.getLow() + ", \"Close\": " + csd.getClose() + " }";
        			data += (chunk + (idx<(candleStickManager.getCandles().size()-1) ? ", " : ""));
        			idx++;
        		}
        		data += "]";
        	
        		//System.out.println(data);
        		
        	%>

		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
		<script type="text/javascript">
$(function() {
	$.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-ohlcv.json&callback=?', function(data) {

			// split the data set into ohlc and volume
			var ohlc = [],
				volume = [];
			<%	for (CandleStickData csd : candleStickManager.getCandles()) { 
					if (csd.getOpen() > 1 && csd.getHigh() > 1 && csd.getLow() > 1 && csd.getClose() > 1) {
			%>
			//for (i = 0; i < dataLength; i++) {
				ohlc.push([
					<%=csd.getRange().begins.getTime()%>,						//data[i][0], // the date
					<%="".format("%.2f", csd.getOpen()).replace(",",".")%>, 	//data[i][1], // open
					<%="".format("%.2f", csd.getHigh()).replace(",",".")%>, 	//data[i][2], // high
					<%="".format("%.2f", csd.getLow()).replace(",",".")%>,		//data[i][3], // low
					<%="".format("%.2f", csd.getClose()).replace(",",".")%>		//data[i][4] // close
					
					<%
						System.out.println("{ \"Time\": \""+csd.getRange().begins.getTime() + " : " + "\", \"Open\": " + "".format("%.2f", csd.getOpen()) + ", \"High\": " + "".format("%.2f", csd.getHigh()) + ", \"Low\": " + "".format("%.2f", csd.getLow()) + ", \"Close\": " + "".format("%.2f", csd.getClose()) + " }");
					%>
				]);
				
				volume.push([
					<%=csd.getRange().begins.getTime()%>,	//data[i][0], // the date
					<%="".format("%.2f", csd.getVolume()).replace(",",".")%>	//data[i][5] // the volume
				])
			//}
			<% 		}
				}
			%>
	
			// set the allowed units for data grouping
			var groupingUnits = [[
				'week',                         // unit name
				[1]                             // allowed multiples
			], [
				'month',
				[1, 2, 3, 4, 6]
			]];
	
			// create the chart
			$('#container').highcharts('StockChart', {
			    
			    rangeSelector: {
			        selected: 1
			    },
	
			    title: {
			        text: 'MTGox BTC/EUR'
			    },
	
			    yAxis: [{
			        title: {
			            text: 'OHLC'
			        },
			        height: 200,
			        lineWidth: 2
			    }, {
			        title: {
			            text: 'Volume'
			        },
			        top: 300,
			        height: 100,
			        offset: 0,
			        lineWidth: 2
			    }],
			    
			    series: [{
			        type: 'candlestick',
			        name: 'BTC/EUR',
			        data: ohlc,
			        dataGrouping: {
						units: groupingUnits
			        }
			    }, {
			        type: 'column',
			        name: 'Volume',
			        data: volume,
			        yAxis: 1,
			        dataGrouping: {
						units: groupingUnits
			        }
			    }]
			});
	});
});
		</script>
		
		
		
	</head>
	<div class="wrap">
	<nav>
		<ul class="menu">
			<li><a href="/"><span class="iconic home"></span> Home</a></li>
			<li><a href="../page/market.jsp"><span class="iconic plus-alt"></span> MtGox</a></li>
			<li><a href="../page/robots.jsp"><span class="iconic clock"></span> Robots</a></li>
			<li><a href="../page/notifications.jsp"><span class="iconic bolt"></span> Notifications</a></li>
			<li><a href="../page/wallet.jsp"><span class="iconic locked"></span> Wallet</a></li>
			<li><a href="../page/admin.jsp"><span class="iconic book"></span> Admin</a></li>
			<li><a href="../page/security.jsp"><span class="iconic key"></span> Security</a></li>
			<!--<li><a href="../page/contact.jsp"><span class="iconic mail"></span> Contact</a></li>-->
		</ul>
		<div class="clearfix"></div>
	</nav>
	</div>
	
           
<script src="../page/Highstock-1.3.1/js/highstock.js"></script>
<script src="../page/Highstock-1.3.1/js/modules/exporting.js"></script>

	<div align="center" id="container" style="height: 500px; min-width: 500px; width: 70%; right: 15%; left: 15%; position: absolute;"></div>
 </body>
</html>