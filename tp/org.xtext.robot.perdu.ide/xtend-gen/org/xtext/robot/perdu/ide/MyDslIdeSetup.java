/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robot.perdu.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.robot.perdu.MyDslRuntimeModule;
import org.xtext.robot.perdu.MyDslStandaloneSetup;
import org.xtext.robot.perdu.ide.MyDslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDslIdeSetup extends MyDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDslRuntimeModule _myDslRuntimeModule = new MyDslRuntimeModule();
    MyDslIdeModule _myDslIdeModule = new MyDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_myDslRuntimeModule, _myDslIdeModule));
  }
}
