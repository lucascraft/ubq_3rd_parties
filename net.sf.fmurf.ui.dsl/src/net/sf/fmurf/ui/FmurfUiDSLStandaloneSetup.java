
package net.sf.fmurf.ui;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FmurfUiDSLStandaloneSetup extends FmurfUiDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new FmurfUiDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

