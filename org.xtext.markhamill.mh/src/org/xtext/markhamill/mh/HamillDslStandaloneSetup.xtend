/*
 * generated by Xtext 2.12.0
 */
package org.xtext.markhamill.mh


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class HamillDslStandaloneSetup extends HamillDslStandaloneSetupGenerated {

	def static void doSetup() {
		new HamillDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
