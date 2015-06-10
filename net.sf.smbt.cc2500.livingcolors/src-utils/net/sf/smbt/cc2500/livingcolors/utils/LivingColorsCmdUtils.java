/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.cc2500.livingcolors.utils;

import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Factory;
import net.sf.smbt.cc2250.ezlivingcolors1.Ezlivingcolors1Package;
import net.sf.smbt.cc2250.ezlivingcolors1.LivinColorsClearLampsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsAddLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsInitCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetAddressCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsSetRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnLampOnRGBCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.LivingColorsTurnOffLampCmd;
import net.sf.smbt.cc2250.ezlivingcolors1.impl.LivingColorsTurnLampOnRGBCmdImpl;

public class LivingColorsCmdUtils {
	public final static LivingColorsCmdUtils INSTANCE = new LivingColorsCmdUtils();
	
	public LivingColorsCmd createLIIVNG_COLORS_INIT_CMD(){
		LivingColorsCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsInitCmd();
		message.setHex(Byte.decode("0x69")); // i :	print info
		return message;
	};
	
	/*
	 * Command 	Function
	 * r 	reset
	 * wn-rrr-ggg-bbb 	r, g and b are numbers 000 to 255. Example "w000-255-000\" for bright green. n is the lamp number.
	 * hn-hhh-sss-iii 	h, s and i are numbers 000 to 255. No example for now. n is the lamp number.
	 * i 	print info
	 * nn 	turn lamp number n on
	 * fn 	turn lamp number n off
	 * ee 	e = 0 echo off, e = 1 echo on.
	 * l 	listen for addresses. Use i to list addresses.
	 * saabbccddeeffgghhii 	store address in a..i. 9 numbers as 2 digit hex
	 * ? 	dummy command.
	 */
	
	
//	public LivingColorsCmd createLIIVNG_COLORS_SEND_COMMAND_CMD(byte addr, int cmd, int h, int s, int v){
//		LiivngColorsSendCommandCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLiivngColorsSendCommandCmd();
////		message.setHex(Byte.decode("0x69")); // i :	print info
//		message.setAddr(addr);
//		message.setCmd(cmd);
//		message.setH(h);
//		message.setS(s);
//		message.setV(v);
//		return message;
//	};
	
	public LivingColorsCmd createLIVIN_COLORS_CLEAR_LAMPS_CMD(){
		LivingColorsCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivinColorsClearLampsCmd();
		message.setHex(Byte.decode("0x72")); // r : reset
		return message;
	};
	
	public LivingColorsCmd createLIVING_COLORS_ADD_LAMP_CMD(int index){
		LivingColorsAddLampCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsAddLampCmd();
		message.setHex(Byte.decode("0x61")); // annn : select lamp (Example \"a001\" to select lamp 1.")
		
		Byte zeroByteVal = new Integer(0).byteValue();
		byte[] bIdx = new byte[3];
		if (index < 10) {
			Byte iByteVal2 = Byte.decode(index + "");
			bIdx[0] = zeroByteVal;
			bIdx[1] = zeroByteVal;
			bIdx[2] = iByteVal2;
		} else if (index < 100) {
			Byte iByteVal1 = Byte.decode(index/10 + "");
			Byte iByteVal2 = Byte.decode(index%10 + "");
			bIdx[0] = zeroByteVal;
			bIdx[1] = iByteVal1;
			bIdx[2] = iByteVal2;
		} else {
			Byte iByteVal0 = Byte.decode(index/100 + "");
			Byte iByteVal1 = Byte.decode(index/10 + "");
			Byte iByteVal2 = Byte.decode(index%10 + "");
			bIdx[0] = iByteVal0;
			bIdx[1] = iByteVal1;
			bIdx[2] = iByteVal2;
		}
		
		message.setAddr(bIdx);
		return message;
	};
	
//	public LivingColorsCmd createLIVING_COLORS_GET_LAMP_CMD(byte array[]){
//		LivingColorsGetLampCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsGetLampCmd();
//		message.setResult(array);
//		return message;
//	};
	
//	public LivingColorsCmd createLIVING_COLORS_GET_MAX_NUM_LAMPS_CMD(int num){
//		LivingColorsGetMaxNumLampsCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsGetMaxNumLampsCmd();
//		message.setResult(num);
//		return message;
//	};
	
//	public LivingColorsCmd createLIVING_COLORS_LEARN_LAMPS_CMD(){
//		LivingColorsCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsLearnLampsCmd();
//		return message;
//	};
	
	public LivingColorsCmd createLIVING_COLORS_SET_ADDRESS_CMD(String addr){
		
		if (addr==null || addr.toCharArray().length!=18) throw new UnsupportedOperationException();
		byte[] addrAs18bits = new byte[9];

		for (int i=0;i<18;i+=2) {
			String hex = addr.substring(i, i+1);
			addrAs18bits[i/2] = Byte.decode("0x"+hex);
		}
		
		LivingColorsSetAddressCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsSetAddressCmd();
		message.setHex(Byte.decode("0x73")); // saabbccddeeffgghhii : store adress in a..i. 9 numbers as 2 digit hex
		message.setAddr(addrAs18bits);
		return message;
	};
	
//	public LivingColorsCmd createLIVING_COLORS_SET_HSV_CMD(byte addr, int h, int s, int v){
//		LivingColorsSetHSVCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsSetHSVCmd();
//		message.setHex(Byte.decode("0x68")); // hl-hhh-sss-iii : h, s and i are numbers 000 to 255. No example for now..
//		message.setAddr(addr);
//		message.setH(h);
//		message.setS(s);
//		message.setV(v);
//		return message;
//	};
	
	public LivingColorsCmd createLIVING_COLORS_SET_RGB_CMD(byte addr, int index, int r, int g, int b){
		LivingColorsSetRGBCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsSetRGBCmd();
		message.setHex(Byte.decode("0x77")); // wl-rrr-ggg-bbb : r, g and b are numbers 000 to 255. Example \"w000-255-000\" for bright green.
		message.setAddr(addr);
		message.setIndex(index);
		message.setR(r);
		message.setG(g);
		message.setB(b);
		return message;
	};
	
//	public LivingColorsCmd createLIVING_COLORS_TURN_LAMP_ON_HSV_CMD(int index, int h, int s, int v){
//		LivingColorsTurnLampOnHSVCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsTurnLampOnHSVCmd();
//		message.setIndex(index);
//		message.setH(h);
//		message.setS(s);
//		message.setV(v);
//		return message;
//	};
//	
	public LivingColorsCmd createLIVING_COLORS_TURN_LAMP_ON_RGB_CMD(int index, int r, int g, int b){
		LivingColorsTurnLampOnRGBCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsTurnLampOnRGBCmd();
		message.setHex(Byte.decode("0x6e")); // nl-rrr-ggg-bbb : turn lamp on
		message.setIndex(index);
		message.setR(r);
		message.setG(g);
		message.setB(b);
		return message;
	};
	
	public LivingColorsCmd createLIVING_COLORS_TURN_OFF_LAMP_CMD(int index){
		LivingColorsTurnOffLampCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsTurnOffLampCmd();
		message.setHex(Byte.decode("0x66")); // fl : turn lamp off
		message.setIndex(index);
		return message;
	};
	
//	public LivingColorsCmd createLIVING_COLORS_CHECK_ADDRESS_CMD(byte addr[]){
//		LivingColorsCheckAddressCmd message =  Ezlivingcolors1Factory.eINSTANCE.createLivingColorsCheckAddressCmd();
//		message.setAddr(addr);
//		return message;
//	};
	
	//
	// Dump to byte[] utilities 
	//
	
	public byte[] dumpLivingColorsCmd(LivingColorsCmd cmd) {
		if (cmd instanceof LivingColorsCmd) {
			switch(cmd.eClass().getClassifierID()) {
//			case Ezlivingcolors1Package.LIIVNG_COLORS_SEND_COMMAND_CMD:
//				break;
			case Ezlivingcolors1Package.LIVIN_COLORS_CLEAR_LAMPS_CMD:
				return dumpLIVIN_COLORS_CLEAR_LAMPS_CMD(cmd);
			case Ezlivingcolors1Package.LIVING_COLORS_ADD_LAMP_CMD:
				return dumpLIVING_COLORS_ADD_LAMP_CMD(cmd);
//			case Ezlivingcolors1Package.LIVING_COLORS_CHECK_ADDRESS_CMD:
//				break;
//			case Ezlivingcolors1Package.LIVING_COLORS_GET_LAMP_CMD:
//				break;
//			case Ezlivingcolors1Package.LIVING_COLORS_GET_MAX_NUM_LAMPS_CMD:
//				break;
			case Ezlivingcolors1Package.LIVING_COLORS_INIT_CMD:
				return dumpLIVING_COLORS_INIT_CMD(cmd);
//			case Ezlivingcolors1Package.LIVING_COLORS_LEARN_LAMPS_CMD:
//				break;
			case Ezlivingcolors1Package.LIVING_COLORS_SET_ADDRESS_CMD:
				return dumpLIVING_COLORS_SET_ADDRESS_CMD(cmd);
//			case Ezlivingcolors1Package.LIVING_COLORS_SET_HSV_CMD:
//				break;
			case Ezlivingcolors1Package.LIVING_COLORS_SET_RGB_CMD:
				return dumpLIVING_COLORS_SET_RGB_CMD(cmd);
//			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_HSV_CMD:
//				break;
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_LAMP_ON_RGB_CMD:
				return dumpLIVING_COLORS_TURN_LAMP_ON_RGB_CMD(cmd);
			case Ezlivingcolors1Package.LIVING_COLORS_TURN_OFF_LAMP_CMD:
				return dumpLIVING_COLORS_TURN_OFF_LAMP_CMD(cmd);
			}
			// FIXME : look deeper at the protocol doc before going further
		}
		return new byte[0];
	}
	
	//
	// dump utilities
	//
	
	private byte[] dumpLIVING_COLORS_SET_RGB_CMD(LivingColorsCmd cmd) {
		if (cmd instanceof LivingColorsSetRGBCmd) {
			LivingColorsSetRGBCmd setAddrCmd = (LivingColorsSetRGBCmd) cmd;
			return new byte[] { 
				setAddrCmd.getHex(),  
				Byte.decode(setAddrCmd.getIndex() + ""),
				Byte.decode(setAddrCmd.getR() + ""),  
				Byte.decode(setAddrCmd.getG() + ""),  
				Byte.decode(setAddrCmd.getB() + "")
			};
		}
		return new byte[0];
	}
	
	private byte[] dumpLIVING_COLORS_TURN_LAMP_ON_RGB_CMD(LivingColorsCmd cmd) {
		if (cmd instanceof LivingColorsTurnLampOnRGBCmdImpl) {
			LivingColorsTurnLampOnRGBCmdImpl setAddrCmd = (LivingColorsTurnLampOnRGBCmdImpl) cmd;
			return new byte[] { 
				setAddrCmd.getHex(),  
				Byte.decode(setAddrCmd.getIndex() + ""),
				Byte.decode(setAddrCmd.getR() + ""),  
				Byte.decode(setAddrCmd.getG() + ""),  
				Byte.decode(setAddrCmd.getB() + "")
			};
		}
		return new byte[0];
	}
	
	private byte[] dumpLIVING_COLORS_TURN_OFF_LAMP_CMD(LivingColorsCmd cmd) {
		return cmd instanceof LivingColorsTurnOffLampCmd ? new byte[] { cmd.getHex() } : new byte[0];
	}
	
	private byte[] dumpLIVING_COLORS_INIT_CMD(LivingColorsCmd cmd) {
		return cmd instanceof LivingColorsInitCmd ? new byte[] { cmd.getHex() } : new byte[0];
	}

	private byte[] dumpLIVING_COLORS_SET_ADDRESS_CMD(LivingColorsCmd cmd) {
		if (cmd instanceof LivingColorsSetAddressCmd) {
			LivingColorsSetAddressCmd setAddrCmd = (LivingColorsSetAddressCmd) cmd;
			if (setAddrCmd.getAddr() != null && setAddrCmd.getAddr().length==9)
			return new byte[] { 
				setAddrCmd.getHex(),  
				setAddrCmd.getAddr()[0],  
				setAddrCmd.getAddr()[1],  
				setAddrCmd.getAddr()[2],  
				setAddrCmd.getAddr()[3],  
				setAddrCmd.getAddr()[4],  
				setAddrCmd.getAddr()[5],  
				setAddrCmd.getAddr()[6],  
				setAddrCmd.getAddr()[7],  
				setAddrCmd.getAddr()[8]  
			};
		}
		return new byte[0];
	}

	private byte[] dumpLIVING_COLORS_ADD_LAMP_CMD(LivingColorsCmd cmd) {
		if (cmd instanceof LivingColorsAddLampCmd) {
			LivingColorsAddLampCmd addLampCmd = (LivingColorsAddLampCmd) cmd;
			if (addLampCmd.getAddr() != null && addLampCmd.getAddr().length==3)
			return new byte[] { 
				addLampCmd.getHex(),  
				addLampCmd.getAddr()[0],  
				addLampCmd.getAddr()[1],  
				addLampCmd.getAddr()[2]  
			};
		}
		return new byte[0];
	}

	private byte[] dumpLIVIN_COLORS_CLEAR_LAMPS_CMD(LivingColorsCmd cmd) {
		return cmd instanceof LivinColorsClearLampsCmd ? new byte[] { cmd.getHex() } : new byte[0];
	}
	
	/**
	 * @return a Float
	 */
	/*
	private Object readFloat() {
		byte[] floatBytes = new byte[4];
		byte[] bytes = new byte[4];
		int streamPosition = 0;
		floatBytes[0] = bytes[streamPosition++];
		floatBytes[1] = bytes[streamPosition++];
		floatBytes[2] = bytes[streamPosition++];
		floatBytes[3] = bytes[streamPosition++];

		int floatBits = 
			((floatBytes[3] & 0xFF) ) +
			((floatBytes[2] & 0xFF) << 8) +
			((floatBytes[1] & 0xFF) << 16) +
			((floatBytes[0] & 0xFF) << 24);
		
		return new Float(Float.intBitsToFloat(floatBits));
	}
	*/

}
