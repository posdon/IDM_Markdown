/*
 * generated by Xtext 2.12.0
 */
package markHammil.mm.ui.tests;

import com.google.inject.Injector;
import markHammil.mm.ui.internal.MmActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MmActivator.getInstance().getInjector("markHammil.mm.MyDsl");
	}

}