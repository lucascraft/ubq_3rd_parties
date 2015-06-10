package net.sf.smbt.afdx.utils;


import net.sf.smbt.ezafdx.AFDXFrame;
import net.sf.smbt.ezafdx.AFDXPayload;
import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdx.EzafdxFactory;
import net.sf.smbt.ezafdxtopology.AFDXTopology;
import net.sf.xqz.model.cmd.Cmd;

public class AFDXUtils {
	public final static AFDXUtils INSTANCE = new AFDXUtils();
	
	public Cmd frame2cmd(byte[] frame) {
		if (frame != null && frame.length>67) {
			AFDXPayload payload = EzafdxFactory.eINSTANCE.createAFDXPayload();
			payload.setData(createAFDXFrameFromBytes(frame));
			//payload.setVl(...); see it later
			return payload;
		}
		return null;
	}
	
	
	public AFDXFrame createAFDXFrameFromBytes(byte[] frame) {
		AFDXFrame afdxFrame = EzafdxFactory.eINSTANCE.createAFDXFrame();

		//
		// Preamble : 0-6 (7)
		//
		byte[] preamble = new byte[7];
		System.arraycopy(frame, 0, preamble, 0, 7);
		afdxFrame.setPreamble(preamble);
		
		//
		// SFD : 7 (1)
		//
		afdxFrame.setSfd(frame[7]);
		
		//
		// macDest 8-13 (6)
		//
		byte[] macDest = new byte[6];
		System.arraycopy(frame, 8, macDest, 0, 6);
		afdxFrame.setMacDest(macDest);
		
		//
		// macSrc : 14-19 (6)
		//
		byte[] macSrc = new byte[6];
		System.arraycopy(frame, 14, macSrc, 0, 6);
		afdxFrame.setMacSrc(macSrc);
		
		//
		// eth type 20-22 (2)
		//
		byte[] ethType = new byte[2];
		System.arraycopy(frame, 20, ethType, 0, 2);
		afdxFrame.setMacSrc(ethType);
		
		//
		// ipHeader 23-42 (20)
		//
		byte[] ipHeader = new byte[20];
		System.arraycopy(frame, 23, ipHeader, 0, 20);
		afdxFrame.setIpHeader(ipHeader);
		
		//
		// udpHeader 43-50 (8)
		//
		byte[] udpHeader = new byte[8];
		System.arraycopy(frame, 43, udpHeader, 0, 8);
		afdxFrame.setUdpHeader(udpHeader);
		
		
		
		//
		// Data 51..(size-17)
		//
		int payloadLength = frame.length-51-17;
		byte[] payload = new byte[payloadLength];
		System.arraycopy(frame, 51, payload, 0, payloadLength);
		afdxFrame.setPayload(payload);
		
		//
		// udpHeader 51 (1)
		//
		afdxFrame.setRsn(frame[52]);
		
		//
		// fcs 52-55 (4)
		//
		byte[] fcs = new byte[4];
		System.arraycopy(frame, 53+payloadLength, fcs, 0, 4);
		afdxFrame.setUdpHeader(fcs);

		//
		// udpHeader 56-67 (12)
		//
		byte[] ifg = new byte[12];
		System.arraycopy(frame, 58+payloadLength, ifg, 0, 12);
		afdxFrame.setUdpHeader(ifg);
		
		
		return afdxFrame;
	}
	
	public AFDXVirtualLink getVirtualLinkFromID(AFDXTopology topology, String vlinkID) {
		for (AFDXVirtualLink vlink : topology.getVirtualLinks()) {
			if (vlink.getVirtLnkID().equals(vlinkID)) {
				return vlink;
			}
		}
		return null;
	}

}
