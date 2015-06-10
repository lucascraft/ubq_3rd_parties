<%-- Ceci est un commentaire JSP --%>
<%@page contentType="text/html;charset=ISO-8859-1" %>
<%-- <%@page errorPage="erreur.jsp"%> --%> 

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
<%@ page import="net.sf.smbt.btc.utils.BTCResourceUtils"%>
<%@ page import="net.sf.smbt.trading.TradeBotsConfig"%>
<%@ page import="com.ubiquisense.ubibot.MTGoxWebSocketCommunicatorThread"%>
<%@ page import="com.ubiquisense.ubibot.MtGoxJettyBotServer"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.io.File;"%>



<html>
	<head>
		<title>Robots</title>
	</head>

 <body>
	<head>
		<link href='http://fonts.googleapis.com/css?family=Droid+Sans' rel='stylesheet' type='text/css'>
		<meta charset="utf-8">
		<link href="../page/css3_menu_demo/style.css" media="screen"  rel="stylesheet" type="text/css" />
		<link href="../page/css3_menu_demo/iconic.css" media="screen" rel="stylesheet" type="text/css" />
		<script src="../page/css3_menu_demo/prefix-free.js"></script>
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
	
	
	<%
		MTGoxWebSocketCommunicatorThread t = MtGoxJettyBotServer.INSTANCE.getMTGoxWebSocketCommunicatorThread();
  		MTGoxDataManager dataManager = t.getMtgoxDataManager();
  		MTGox mtgox = dataManager.getMtGox();
	
		File storageDir = MtGoxJettyBotServer.INSTANCE.getStorageDir();
		
		if (storageDir != null && storageDir.exists() && storageDir.isDirectory()) {
		%>
		<table align="center">
		<%
			for (File f : storageDir.listFiles()) {
				if (f != null && f.isFile() && f.canRead()) {
					if (f.getName().endsWith(".bots")) {
						String canonicalPath = f.getCanonicalPath();
						TradeBotsConfig cfg = BTCResourceUtils.INSTANCE.load(canonicalPath);
						String msg = "???";
						if (cfg != null) {
							msg = cfg.getBots().size() + " bots definitions.";
						}
					%>
						<tr align="center"><td align="center">
						<a href=""><h2><%=f.getName()%></h2></a>
						</td><td align="center"><%=msg%></td></tr>
					<%		
					}
				}
			}
		}
		%>
		</table>
		<%
	%>
	
	
	
	
	
	
	
	
	
	
 </body>
</html>