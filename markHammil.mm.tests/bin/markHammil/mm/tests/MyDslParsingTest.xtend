/*
 * generated by Xtext 2.12.0
 */
package markHammil.mm.tests

import com.google.inject.Inject
import markHammil.mm.myDsl.File
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<File> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
