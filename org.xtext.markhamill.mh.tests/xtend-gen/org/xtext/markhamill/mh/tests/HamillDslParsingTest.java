/**
 * generated by Xtext 2.12.0
 */
package org.xtext.markhamill.mh.tests;

import com.google.inject.Inject;
import markdown.File;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.markhamill.mh.tests.HamillDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(HamillDslInjectorProvider.class)
@SuppressWarnings("all")
public class HamillDslParsingTest {
  @Inject
  private ParseHelper<File> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final File result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}