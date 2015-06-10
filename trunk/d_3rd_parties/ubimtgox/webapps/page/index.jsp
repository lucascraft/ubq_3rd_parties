<%-- Ceci est un commentaire JSP --%>
<%@page contentType="text/html;charset=ISO-8859-1" %>
<%@page errorPage="erreur.jsp"%>
<%-- Importation d'un paquetage (package) --%>

<%@ page import="java.io.*,java.util.*" %>
<%@ page import="net.sf.smbt.btc.BitcoinMarket"%>
<%@ page import="net.sf.smbt.btc.mtgox.MTGox"%>
<%@ page import="net.sf.smbt.btc.mtgox.MTGoxDataManager"%>
<%@ page import="com.ubiquisense.ubibot.MTGoxWebSocketCommunicatorThread"%>
<%@ page import="com.ubiquisense.ubibot.MtGoxJettyBotServer"%>


<html>
 <META HTTP-EQUIV="Refresh" CONTENT="3">
 <head><title>MtGox Markets Robot Trading</title></head>
 <body>
	<head>
		<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
		<meta charset="utf-8">
		<link href="../page/css3_menu_demo/style.css" media="screen"  rel="stylesheet" type="text/css" />
		<link href="../page/css3_menu_demo/iconic.css" media="screen" rel="stylesheet" type="text/css" />
		<script src="../page/css3_menu_demo/prefix-free.js"></script>
	</head>
 <%
  	MTGoxWebSocketCommunicatorThread t = MtGoxJettyBotServer.INSTANCE.getMTGoxWebSocketCommunicatorThread();
  	MTGoxDataManager dataManager = t.getMtgoxDataManager();
  	MTGox mtgox = dataManager.getMtGox();
  	BitcoinMarket market = mtgox.getMarket();
  	
  	String mtgoxTicker = market.getBroker() + "("+market.getCurrency()+"/"+"BTC) : Buy ("+
	market.getBuy()+" : "+market.getSell()+") Sell | Low ("+market.getLow()+" : "+
	market.getHigh()+") High | Last :"+market.getLast();
  	
    Date date = new Date();
  %>

  	<H2><img src="page/ubiquisense-64_med.png"/><%= mtgoxTicker %></H2>

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


<%
   // Set refresh, autoload time as 5 seconds
   response.setIntHeader("Refresh", 5);
   // Get current time
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   int second = calendar.get(Calendar.SECOND);
   if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
   else
      am_pm = "PM";
   String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
   out.println("Current Time: " + CT + "\n");
%>
 </body>
</html>