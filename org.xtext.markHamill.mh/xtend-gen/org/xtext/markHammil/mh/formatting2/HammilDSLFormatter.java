/**
 * generated by Xtext 2.12.0
 */
package org.xtext.markHammil.mh.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import markdown.EmphasisExpression;
import markdown.Expression;
import markdown.File;
import markdown.HeaderDepth1Expression;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.markHammil.mh.services.HammilDSLGrammarAccess;

@SuppressWarnings("all")
public class HammilDSLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private HammilDSLGrammarAccess _hammilDSLGrammarAccess;
  
  protected void _format(final File file, @Extension final IFormattableDocument document) {
    EList<Expression> _expression = file.getExpression();
    for (final Expression expression : _expression) {
      document.<Expression>format(expression);
    }
  }
  
  protected void _format(final HeaderDepth1Expression headerDepth1Expression, @Extension final IFormattableDocument document) {
    document.<EmphasisExpression>format(headerDepth1Expression.getTitle());
  }
  
  public void format(final Object headerDepth1Expression, final IFormattableDocument document) {
    if (headerDepth1Expression instanceof HeaderDepth1Expression) {
      _format((HeaderDepth1Expression)headerDepth1Expression, document);
      return;
    } else if (headerDepth1Expression instanceof XtextResource) {
      _format((XtextResource)headerDepth1Expression, document);
      return;
    } else if (headerDepth1Expression instanceof File) {
      _format((File)headerDepth1Expression, document);
      return;
    } else if (headerDepth1Expression instanceof EObject) {
      _format((EObject)headerDepth1Expression, document);
      return;
    } else if (headerDepth1Expression == null) {
      _format((Void)null, document);
      return;
    } else if (headerDepth1Expression != null) {
      _format(headerDepth1Expression, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(headerDepth1Expression, document).toString());
    }
  }
}