/**
 * generated by Xtext 2.12.0
 */
package markHammil.mm.myDsl.impl;

import markHammil.mm.myDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.FILE: return createFile();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.BREAK_LINE_EXPRESSION: return createBreakLineExpression();
      case MyDslPackage.TEXT_EXPRESSION: return createTextExpression();
      case MyDslPackage.QUOTE_EXPRESSION: return createQuoteExpression();
      case MyDslPackage.CODE_EXPRESSION: return createCodeExpression();
      case MyDslPackage.REF_EXPRESSION: return createRefExpression();
      case MyDslPackage.LINK_EXPRESSION: return createLinkExpression();
      case MyDslPackage.IMAGE_EXPRESSION: return createImageExpression();
      case MyDslPackage.VIDEO_EXPRESSION: return createVideoExpression();
      case MyDslPackage.HEADER_EXPRESSION: return createHeaderExpression();
      case MyDslPackage.HEADER1_EXPRESSION: return createHeader1Expression();
      case MyDslPackage.HEADER2_EXPRESSION: return createHeader2Expression();
      case MyDslPackage.HEADER3_EXPRESSION: return createHeader3Expression();
      case MyDslPackage.HEADER4_EXPRESSION: return createHeader4Expression();
      case MyDslPackage.HEADER5_EXPRESSION: return createHeader5Expression();
      case MyDslPackage.HEADER6_EXPRESSION: return createHeader6Expression();
      case MyDslPackage.EMPHASIS_EXPRESSION: return createEmphasisExpression();
      case MyDslPackage.BREAK_LINE_EXPRESSION_B: return createBreakLineExpressionB();
      case MyDslPackage.STRONG_EXPRESSION: return createStrongExpression();
      case MyDslPackage.ITALIC_EXPRESSION: return createItalicExpression();
      case MyDslPackage.SCRATCH_EXPRESSION: return createScratchExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakLineExpression createBreakLineExpression()
  {
    BreakLineExpressionImpl breakLineExpression = new BreakLineExpressionImpl();
    return breakLineExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextExpression createTextExpression()
  {
    TextExpressionImpl textExpression = new TextExpressionImpl();
    return textExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuoteExpression createQuoteExpression()
  {
    QuoteExpressionImpl quoteExpression = new QuoteExpressionImpl();
    return quoteExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeExpression createCodeExpression()
  {
    CodeExpressionImpl codeExpression = new CodeExpressionImpl();
    return codeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefExpression createRefExpression()
  {
    RefExpressionImpl refExpression = new RefExpressionImpl();
    return refExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkExpression createLinkExpression()
  {
    LinkExpressionImpl linkExpression = new LinkExpressionImpl();
    return linkExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageExpression createImageExpression()
  {
    ImageExpressionImpl imageExpression = new ImageExpressionImpl();
    return imageExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoExpression createVideoExpression()
  {
    VideoExpressionImpl videoExpression = new VideoExpressionImpl();
    return videoExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderExpression createHeaderExpression()
  {
    HeaderExpressionImpl headerExpression = new HeaderExpressionImpl();
    return headerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header1Expression createHeader1Expression()
  {
    Header1ExpressionImpl header1Expression = new Header1ExpressionImpl();
    return header1Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header2Expression createHeader2Expression()
  {
    Header2ExpressionImpl header2Expression = new Header2ExpressionImpl();
    return header2Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header3Expression createHeader3Expression()
  {
    Header3ExpressionImpl header3Expression = new Header3ExpressionImpl();
    return header3Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header4Expression createHeader4Expression()
  {
    Header4ExpressionImpl header4Expression = new Header4ExpressionImpl();
    return header4Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header5Expression createHeader5Expression()
  {
    Header5ExpressionImpl header5Expression = new Header5ExpressionImpl();
    return header5Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header6Expression createHeader6Expression()
  {
    Header6ExpressionImpl header6Expression = new Header6ExpressionImpl();
    return header6Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmphasisExpression createEmphasisExpression()
  {
    EmphasisExpressionImpl emphasisExpression = new EmphasisExpressionImpl();
    return emphasisExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreakLineExpressionB createBreakLineExpressionB()
  {
    BreakLineExpressionBImpl breakLineExpressionB = new BreakLineExpressionBImpl();
    return breakLineExpressionB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrongExpression createStrongExpression()
  {
    StrongExpressionImpl strongExpression = new StrongExpressionImpl();
    return strongExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItalicExpression createItalicExpression()
  {
    ItalicExpressionImpl italicExpression = new ItalicExpressionImpl();
    return italicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScratchExpression createScratchExpression()
  {
    ScratchExpressionImpl scratchExpression = new ScratchExpressionImpl();
    return scratchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
