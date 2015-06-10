package net.sf.smbt.afdx.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdxtopology.AFDXTopology;
import net.sf.xqz.model.engine.EngineApplication;

public class AFDXRouter {
		/**
		 * En out cas, 1 virtual link == 1 EngineApplication ... Ca paraît naturel ...
		 */
		Map<String, EngineApplication> virtualLinksQxChannelsMap;
		public AFDXRouter(AFDXTopology afdxTopology) {
			virtualLinksQxChannelsMap = new HashMap<String, EngineApplication>();
			for (AFDXVirtualLink vlink : afdxTopology.getVirtualLinks()) {
				if (AFDXUtils.INSTANCE.getVirtualLinkFromID(afdxTopology, vlink.getVirtLnkID()) == null) {
//					CmdEngine e = QuanticMojo.INSTANCE.openUdpPipe(COMM_PROTOCOL.AFDX, vlink.getIpDst()+":"+vlink.getUdpDestPort());
//					AppEngineUtil.INSTANCE.
				}
				/// un truc comme ça .... A voir 
			}
		}
	}