/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robot.perdu.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.robot.perdu.services.MyDslGrammarAccess;
import robot.flotCtrl.BoolExp;
import robot.flotCtrl.Expression;
import robot.flotCtrl.WhileLoop;
import robot.robot.ProgramUnit;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final ProgramUnit programUnit, @Extension final IFormattableDocument document) {
    EList<Expression> _block = programUnit.getBlock();
    for (final Expression expression : _block) {
      document.<Expression>format(expression);
    }
  }
  
  protected void _format(final WhileLoop whileLoop, @Extension final IFormattableDocument document) {
    document.<BoolExp>format(whileLoop.getLoopCond());
    EList<Expression> _block = whileLoop.getBlock();
    for (final Expression expression : _block) {
      document.<Expression>format(expression);
    }
  }
  
  public void format(final Object whileLoop, final IFormattableDocument document) {
    if (whileLoop instanceof XtextResource) {
      _format((XtextResource)whileLoop, document);
      return;
    } else if (whileLoop instanceof WhileLoop) {
      _format((WhileLoop)whileLoop, document);
      return;
    } else if (whileLoop instanceof ProgramUnit) {
      _format((ProgramUnit)whileLoop, document);
      return;
    } else if (whileLoop instanceof EObject) {
      _format((EObject)whileLoop, document);
      return;
    } else if (whileLoop == null) {
      _format((Void)null, document);
      return;
    } else if (whileLoop != null) {
      _format(whileLoop, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(whileLoop, document).toString());
    }
  }
}
