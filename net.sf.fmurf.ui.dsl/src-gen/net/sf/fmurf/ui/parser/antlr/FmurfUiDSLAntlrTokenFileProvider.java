/*
* generated by Xtext
*/
package net.sf.fmurf.ui.parser.antlr;

import java.io.InputStream;

import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FmurfUiDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.tokens");
	}
}
