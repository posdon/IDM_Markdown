/*
 * generated by Xtext 2.12.0
 */
package org.xtext.markhamill.mh.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.markhamill.mh.ui.internal.MhActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HamillDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MhActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MhActivator.getInstance().getInjector(MhActivator.ORG_XTEXT_MARKHAMILL_MH_HAMILLDSL);
	}
	
}