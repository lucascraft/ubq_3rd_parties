package net.sf.smbt.afdx.cmd;

import net.sf.smbt.afdx.utils.AFDXUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;

public class AFDXFrameInterpreter extends AbstractFrameInterpreterImpl {

	@Override
	public Cmd byteArray2Cmd(byte[] frame) {
		return AFDXUtils.INSTANCE.frame2cmd(frame);
	}
}
