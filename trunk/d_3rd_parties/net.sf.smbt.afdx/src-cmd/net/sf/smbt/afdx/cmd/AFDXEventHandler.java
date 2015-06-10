package net.sf.smbt.afdx.cmd;

import net.sf.smbt.afdx.utils.AFDXRouter;
import net.sf.smbt.ezafdx.AFDXPayload;
import net.sf.smbt.ezafdx.AFDXVirtualLink;
import net.sf.smbt.ezafdxtopology.EzafdxtopologyFactory;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public class AFDXEventHandler extends AbstractQxEventHandlerImpl {
	
	private AFDXRouter afdxRouter;
	public AFDXEventHandler() {
		afdxRouter = new AFDXRouter(EzafdxtopologyFactory.eINSTANCE.createAFDXTopology()); // hem ...
	}
	
	@Override
	public void handleQxEvent(Event event) {
		// On route par ici vers ailleurs ...
		if (event.getCmd() instanceof AFDXPayload) {
			if (event.getKind() == EVENT_KIND.RX_READY) {
				AFDXPayload payload = (AFDXPayload) event.getCmd();
				AFDXVirtualLink vlnk = payload.getVl();
				vlnk.getVirtLnkID();
				afdxRouter.toString();
			}
		}
		
		super.handleQxEvent(event);
	}
}
