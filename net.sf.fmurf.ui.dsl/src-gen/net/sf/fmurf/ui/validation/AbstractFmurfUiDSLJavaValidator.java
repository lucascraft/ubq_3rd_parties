package net.sf.fmurf.ui.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractFmurfUiDSLJavaValidator extends AbstractDeclarativeValidator {

@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(net.sf.fmurf.ui.fmurfUiDSL.FmurfUiDSLPackage.eINSTANCE);
		return result;
	}

}
