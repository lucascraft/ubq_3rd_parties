/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package com.ubiquisense.ubibot;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.ws.rs.core.Application;

import net.sf.smbt.btc.mtgox.server.TradeProcessingUtils;
import net.sf.smbt.btc.wallet.BtcWalletHandler;
import net.sf.smbt.btc.wallet.BtcWalletUtils;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;
import org.eclipse.jetty.security.ConstraintMapping;
import org.eclipse.jetty.security.ConstraintSecurityHandler;
import org.eclipse.jetty.security.HashLoginService;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.security.authentication.BasicAuthenticator;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Credential;
import org.eclipse.jetty.webapp.WebAppContext;

import com.google.bitcoin.core.Block;
import com.google.bitcoin.core.DownloadListener;
import com.google.bitcoin.core.Peer;
import com.mongodb.jee.jaxrs.JaxrsMongoApplication;
import com.ubiquisense.ubibot.ctx.TradeBotsFacadeCtxHandler;
import com.ubiquisense.ubibot.websocket.UbiWeSocketIOServer;
import com.ubiquisense.ubibot.backend.TradeBotEngineThread;

public class MtGoxJettyBotServer {
	public final static MtGoxJettyBotServer INSTANCE = new MtGoxJettyBotServer();
	private MTGoxWebSocketCommunicatorThread mtgoxSocket;
	private UbiWeSocketIOServer wsServer;
	private TradeBotEngineThread engineThread;
	private BtcWalletHandler walletHandler;
	private File storageDir;
	private TradeProcessingUtils tradeProcessingUtils;
	public MtGoxJettyBotServer() {
		tradeProcessingUtils = new TradeProcessingUtils(false);
	}
	public UbiWeSocketIOServer getWsServer() {
		return wsServer;
	}
	public File getStorageDir() {
		return storageDir;
	}
	public BtcWalletHandler getWalletHandler() {
		return walletHandler;
	}
	public void setMTGoxWebSocketCommunicatorThread(MTGoxWebSocketCommunicatorThread mtgoxSocket) {
		this.mtgoxSocket = mtgoxSocket;
	}
	public MTGoxWebSocketCommunicatorThread getMTGoxWebSocketCommunicatorThread() {
		return mtgoxSocket;
	}
	
	public void launch(String[] args) throws Exception {
		org.apache.commons.cli.Options options = new org.apache.commons.cli.Options();
		
		Option opServerPort		= new Option("sp", "serverPort", true, "Ubiquisense server websocket IO port (8001)");
		opServerPort.setRequired(false);
		options.addOption(opServerPort);

		Option opJettyPort		= new Option("jp", "jettyPort", true, "Ubiquisense jetty server port (8090)");
		opJettyPort.setRequired(false);
		options.addOption(opJettyPort);

		Option opSecretKey		= new Option("sk", "secretKey", true, "MtGOX secret key");
		opSecretKey.setRequired(true);
		options.addOption(opSecretKey);
		
		Option opApiKey			= new Option("ak", "apiKey", true, "MtGOX API key");
		opApiKey.setRequired(true);
		options.addOption(opApiKey);
		
		Option opWsAddr			= new Option("ws", "wsAddr", true, "MtGOX websocket address (ws://socketio.mtgox.com/socket.io/1/websocket/)");
		opWsAddr.setRequired(true);
		options.addOption(opWsAddr);
		
		Option opVerbose		= new Option("v", "verbose", true, "verbose toggle option");
		opVerbose.setRequired(false);
		options.addOption(opVerbose);
		
		Option opLog			= new Option("l", "log", true, "logging level option INFO/WARN/ERROR");
		opLog.setRequired(false);
		options.addOption(opLog);

		Option opRepo			= new Option("r", "repo", true, "Storage directory (DB/Repo)");
		opRepo.setRequired(true);
		options.addOption(opRepo);
		
		BasicParser lineParser = new BasicParser();
		CommandLine cmd = null;
	    try {
	        cmd = lineParser.parse( options, args );
	    } catch( ParseException exp ) {
	        new HelpFormatter().printHelp("ubiquisense", options);
	    }

		String port			= cmd.getOptionValue("serverPort");
		int wsPort			= Integer.parseInt(port);
		String jport		= cmd.getOptionValue("jettyPort");
		int jettyPort		= Integer.parseInt(jport);
		String apiKey		= cmd.getOptionValue("apiKey");
		String secretKey	= cmd.getOptionValue("secretKey");  
		String wsAddr		= cmd.getOptionValue("wsAddr");
		String verboseStr	= cmd.getOptionValue("verbose");
		Boolean verbose		= Boolean.valueOf(verboseStr);
		String logStr		= cmd.getOptionValue("log");
		String store		= cmd.getOptionValue("repo");
		
		initRepoIfNeeded(store);
		
		//initWallets();
		
		MTGoxWebSocketCommunicatorThread t = new MTGoxWebSocketCommunicatorThread(
			wsAddr,
			apiKey, 
			secretKey,
			verbose
		);
		setMTGoxWebSocketCommunicatorThread(t);
		t.connect();

		wsServer = new UbiWeSocketIOServer(new InetSocketAddress(wsPort), verbose);
		wsServer.start();

        Server server = new Server(jettyPort);
        
        HandlerList handlerList = new HandlerList();
        
        //
        // simplistic Json bots facade
        //
        final TradeBotsFacadeCtxHandler ctxHandler = new TradeBotsFacadeCtxHandler(wsServer, t.getMtgoxDataManager().getMtGox(), tradeProcessingUtils, storageDir); 
        
        handlerList.addHandler(ctxHandler);
        
        //
        // JSPs 
        //
        final String WEBAPPDIR	= "com/ubiquisense/ubibot/webapps/ubiquisense.war";
        final URL warUrl = MtGoxJettyBotServer.class.getClassLoader().getResource(WEBAPPDIR);
        WebAppContext webapp = new WebAppContext(warUrl.toExternalForm(), "/");
        handlerList.addHandler(webapp);

        
        //
        // Security
        //
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setSecurityHandler(basicAuth("root", "root", "ubiquisense"));
        context.setContextPath("/");
        
        handlerList.addHandler(context);
        
        
        //
        // JAX-RS
        //
        
        final Application application = new JaxrsMongoApplication();
    	final CXFNonSpringJaxrsServlet jaxrsServlet = new CXFNonSpringJaxrsServlet() {
			private static final long serialVersionUID = -680716028116195766L;

			@Override
    		protected Object createSingletonInstance(final Class<?> cls, final Map<String, List<String>> props, final ServletConfig sc) throws ServletException {
	    		// workaround to not have CXF try to create the application instance but pass in one
	    		return application;
    		}
    	};

    	final ServletHolder servletHolder = new ServletHolder(jaxrsServlet);

    	final Map<String, String> params = new HashMap<String, String>();
    	params.put("javax.ws.rs.Application", application.getClass().getCanonicalName());
    		
    	servletHolder.setInitParameters(params);

    	ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
    	contextHandler.setSessionHandler(new SessionHandler());
    	contextHandler.setContextPath("/rest");
    	contextHandler.addServlet(servletHolder, "/*");

    	handlerList.addHandler(contextHandler);
    	
    	
        //
        // Stupid Servlet
        //
    	/*	
        ServletContextHandler context2 = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context2.setContextPath("/simple");
        handlerList.addHandler(context);
        
        context2.addServlet(new ServletHolder(new UbiServlet()),"/stupid/*");
        */
        
        
        server.setHandler(handlerList);
		
        
        /*
        LifeCycle.Listener l = new LifeCycle.Listener() {
			@Override
			public void lifeCycleStopping(LifeCycle arg0) {
		        URL rootURL = getClass().getClassLoader().getResource(".");
		        String path = rootURL.getPath();
		        BTCResourceUtils.INSTANCE.save(ctxHandler.getTradeBotsConfig(), path);
			}
			@Override
			public void lifeCycleStopped(LifeCycle arg0) {}
			@Override
			public void lifeCycleStarting(LifeCycle arg0) {}
			@Override
			public void lifeCycleStarted(LifeCycle arg0) {}
			@Override
			public void lifeCycleFailure(LifeCycle arg0, Throwable arg1) {}
		};
        server.addLifeCycleListener(l);
        */
        
        server.start();

        engineThread = new TradeBotEngineThread(this, ctxHandler, tradeProcessingUtils);
        engineThread.start();

        engineThread.join();
         
        server.join();
	}
	
	 private static final SecurityHandler basicAuth(String username, String password, String realm) {
	     HashLoginService l = new HashLoginService();
	        l.putUser(username, Credential.getCredential(password), new String[] {"user"});
	        l.setName(realm);
	        
	        Constraint constraint = new Constraint();
	        constraint.setName(Constraint.__BASIC_AUTH);
	        constraint.setRoles(new String[]{"user"});
	        constraint.setAuthenticate(true);
	         
	        ConstraintMapping cm = new ConstraintMapping();
	        cm.setConstraint(constraint);
	        cm.setPathSpec("/*");
	        
	        ConstraintSecurityHandler csh = new ConstraintSecurityHandler();
	        csh.setAuthenticator(new BasicAuthenticator());
	        csh.setRealmName("ubiquisense");
	        csh.addConstraintMapping(cm);
	        csh.setLoginService(l);
	        
	        return csh;
	    
	}
	
    public static void main(String[] args) throws Exception {
    	INSTANCE.launch(args);
    }
    
	private void initRepoIfNeeded(String store) {
		storageDir = new File(store);
		if (!storageDir.exists()) {
			boolean ret = storageDir.mkdir();
			if (ret) {
				System.out.println("Storage directory " + store + " successfully created !");
			} else {
				System.err.println("Storage directory " + store + " wasn't created !");
				System.exit(-1);
			}
		} else {
			if (!storageDir.isDirectory()) {
				System.err.println("File " + store + " is not a directory : exit !");
				System.exit(-1);
			} else {
				System.out.println("Storage directory " + store + " is valid !");
			}
		}
	}
	
	private void initWallets() {
		boolean gotAWallet = false;
		try {
			System.out.println("scan for wallet now");
			File storageDir = MtGoxJettyBotServer.INSTANCE.getStorageDir();
			if (storageDir != null && storageDir.exists() && storageDir.isDirectory()) {
				for (File f : storageDir.listFiles()) {
					if (f != null && f.isFile() && f.canRead()) {
						if (f.getName().endsWith(".wallet")) {
							gotAWallet = true;
							String canonicalPath = f.getCanonicalPath();
							System.out.println("Found " + canonicalPath + " wallet : initialize now ..."); 
							walletHandler = BtcWalletUtils.INSTANCE.initWallet(storageDir, f.getName());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (!gotAWallet) {
			System.out.println("Didn't get an already existing wallet : create a brand new one !!!");
			try {
				walletHandler = BtcWalletUtils.INSTANCE.initWallet(storageDir, "ubiquisense");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
		if (walletHandler != null) {
			walletHandler.setDownloadListener(new DownloadListener(){
				@Override
				public void onChainDownloadStarted(Peer peer, int blocksLeft) {
					String txt = "onChainDownloadStarted " + " : " + blocksLeft + " blocs max.";
					System.out.println(txt);
					super.onChainDownloadStarted(peer, blocksLeft);
				}
				@Override
				public void onBlocksDownloaded(final Peer peer, final Block block, final int blocksLeft) {
					String txt = "onBlocksDownloaded " + peer.getAddress().toString() + " : " + blocksLeft + " blocs left.";
					System.out.println(txt);
				}
			});
			walletHandler.getPeerGroup().startBlockChainDownload(walletHandler.getDownloadListener());
		}
	}
}
