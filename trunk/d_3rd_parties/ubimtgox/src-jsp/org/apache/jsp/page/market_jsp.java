package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.mtgox.FetchValue;
import com.ubiquisense.ubibot.timed.LinkedFinancialTimedValue;
import com.ubiquisense.ubibot.timed.TimeDuration;
import com.ubiquisense.ubibot.timed.TimeRange;
import com.ubiquisense.ubibot.timed.CandleStickManager;
import com.ubiquisense.ubibot.timed.CandleStickData;
import net.sf.smbt.btc.BitcoinMarket;
import net.sf.smbt.btc.mtgox.MTGox;
import net.sf.smbt.btc.mtgox.MTGoxDataManager;
import com.ubiquisense.ubibot.MTGoxWebSocketCommunicatorThread;
import com.ubiquisense.ubibot.MtGoxJettyBotServer;
import java.text.SimpleDateFormat;

public final class market_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n<html>\n <head>\n \t<title>Market</title>\n </head>\n <body>\n\n\t<head>\n\n<!-- nav bar -->\n\n\t\t<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>\n\t\t<meta charset=\"utf-8\">\n\t\t<link href=\"../page/css3_menu_demo/style.css\" media=\"screen\"  rel=\"stylesheet\" type=\"text/css\" />\n\t\t<link href=\"../page/css3_menu_demo/iconic.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />\n\t\t<script src=\"../page/css3_menu_demo/prefix-free.js\"></script>\n\t\t\n\t\t\n\t\t\n<!-- chart -->\n        \t");
 
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
        		
        	
      out.write("\n\n\t\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\n\t\t<script type=\"text/javascript\">\n$(function() {\n\t$.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-ohlcv.json&callback=?', function(data) {\n\n\t\t\t// split the data set into ohlc and volume\n\t\t\tvar ohlc = [],\n\t\t\t\tvolume = [];\n\t\t\t");
	for (CandleStickData csd : candleStickManager.getCandles()) { 
					if (csd.getOpen() > 1 && csd.getHigh() > 1 && csd.getLow() > 1 && csd.getClose() > 1) {
			
      out.write("\n\t\t\t//for (i = 0; i < dataLength; i++) {\n\t\t\t\tohlc.push([\n\t\t\t\t\t");
      out.print(csd.getRange().begins.getTime());
      out.write(",\t\t\t\t\t\t//data[i][0], // the date\n\t\t\t\t\t");
      out.print("".format("%.2f", csd.getOpen()).replace(",","."));
      out.write(", \t//data[i][1], // open\n\t\t\t\t\t");
      out.print("".format("%.2f", csd.getHigh()).replace(",","."));
      out.write(", \t//data[i][2], // high\n\t\t\t\t\t");
      out.print("".format("%.2f", csd.getLow()).replace(",","."));
      out.write(",\t\t//data[i][3], // low\n\t\t\t\t\t");
      out.print("".format("%.2f", csd.getClose()).replace(",","."));
      out.write("\t\t//data[i][4] // close\n\t\t\t\t\t\n\t\t\t\t\t");

						System.out.println("{ \"Time\": \""+csd.getRange().begins.getTime() + " : " + "\", \"Open\": " + "".format("%.2f", csd.getOpen()) + ", \"High\": " + "".format("%.2f", csd.getHigh()) + ", \"Low\": " + "".format("%.2f", csd.getLow()) + ", \"Close\": " + "".format("%.2f", csd.getClose()) + " }");
					
      out.write("\n\t\t\t\t]);\n\t\t\t\t\n\t\t\t\tvolume.push([\n\t\t\t\t\t");
      out.print(csd.getRange().begins.getTime());
      out.write(",\t//data[i][0], // the date\n\t\t\t\t\t");
      out.print("".format("%.2f", csd.getVolume()).replace(",","."));
      out.write("\t//data[i][5] // the volume\n\t\t\t\t])\n\t\t\t//}\n\t\t\t");
 		}
				}
			
      out.write("\n\t\n\t\t\t// set the allowed units for data grouping\n\t\t\tvar groupingUnits = [[\n\t\t\t\t'week',                         // unit name\n\t\t\t\t[1]                             // allowed multiples\n\t\t\t], [\n\t\t\t\t'month',\n\t\t\t\t[1, 2, 3, 4, 6]\n\t\t\t]];\n\t\n\t\t\t// create the chart\n\t\t\t$('#container').highcharts('StockChart', {\n\t\t\t    \n\t\t\t    rangeSelector: {\n\t\t\t        selected: 1\n\t\t\t    },\n\t\n\t\t\t    title: {\n\t\t\t        text: 'MTGox BTC/EUR'\n\t\t\t    },\n\t\n\t\t\t    yAxis: [{\n\t\t\t        title: {\n\t\t\t            text: 'OHLC'\n\t\t\t        },\n\t\t\t        height: 200,\n\t\t\t        lineWidth: 2\n\t\t\t    }, {\n\t\t\t        title: {\n\t\t\t            text: 'Volume'\n\t\t\t        },\n\t\t\t        top: 300,\n\t\t\t        height: 100,\n\t\t\t        offset: 0,\n\t\t\t        lineWidth: 2\n\t\t\t    }],\n\t\t\t    \n\t\t\t    series: [{\n\t\t\t        type: 'candlestick',\n\t\t\t        name: 'BTC/EUR',\n\t\t\t        data: ohlc,\n\t\t\t        dataGrouping: {\n\t\t\t\t\t\tunits: groupingUnits\n\t\t\t        }\n\t\t\t    }, {\n\t\t\t        type: 'column',\n\t\t\t        name: 'Volume',\n\t\t\t        data: volume,\n\t\t\t        yAxis: 1,\n\t\t\t        dataGrouping: {\n");
      out.write("\t\t\t\t\t\tunits: groupingUnits\n\t\t\t        }\n\t\t\t    }]\n\t\t\t});\n\t});\n});\n\t\t</script>\n\t\t\n\t\t\n\t\t\n\t</head>\n\t<div class=\"wrap\">\n\t<nav>\n\t\t<ul class=\"menu\">\n\t\t\t<li><a href=\"/\"><span class=\"iconic home\"></span> Home</a></li>\n\t\t\t<li><a href=\"../page/market.jsp\"><span class=\"iconic plus-alt\"></span> MtGox</a></li>\n\t\t\t<li><a href=\"../page/robots.jsp\"><span class=\"iconic clock\"></span> Robots</a></li>\n\t\t\t<li><a href=\"../page/notifications.jsp\"><span class=\"iconic bolt\"></span> Notifications</a></li>\n\t\t\t<li><a href=\"../page/wallet.jsp\"><span class=\"iconic locked\"></span> Wallet</a></li>\n\t\t\t<li><a href=\"../page/admin.jsp\"><span class=\"iconic book\"></span> Admin</a></li>\n\t\t\t<li><a href=\"../page/security.jsp\"><span class=\"iconic key\"></span> Security</a></li>\n\t\t\t<!--<li><a href=\"../page/contact.jsp\"><span class=\"iconic mail\"></span> Contact</a></li>-->\n\t\t</ul>\n\t\t<div class=\"clearfix\"></div>\n\t</nav>\n\t</div>\n\t\n           \n<script src=\"../page/Highstock-1.3.1/js/highstock.js\"></script>\n<script src=\"../page/Highstock-1.3.1/js/modules/exporting.js\"></script>\n");
      out.write("\n\t<div align=\"center\" id=\"container\" style=\"height: 500px; min-width: 500px; width: 70%; right: 15%; left: 15%; position: absolute;\"></div>\n </body>\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
