/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robot.perdu.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import robot.flotCtrl.AndExp;
import robot.flotCtrl.BoolExp;
import robot.flotCtrl.Expression;
import robot.flotCtrl.IfBlock;
import robot.flotCtrl.NegExp;
import robot.flotCtrl.WhileLoop;
import robot.robot.Bip;
import robot.robot.Command;
import robot.robot.HasTurnedCmd;
import robot.robot.MoveCmd;
import robot.robot.ObstacleCmd;
import robot.robot.PrintCmd;
import robot.robot.ProgramUnit;
import robot.robot.SetTurnAngleCmd;
import robot.robot.StopEngineCmd;
import robot.robot.StopProgramCmd;
import robot.robot.TurnCmd;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource res, final IFileSystemAccess2 fsa, final IGeneratorContext ctx) {
    fsa.generateFile(res.getURI().trimFileExtension().appendFileExtension("nxc").lastSegment(), 
      this.compile(IterableExtensions.<ProgramUnit>head(IteratorExtensions.<ProgramUnit>toIterable(Iterators.<ProgramUnit>filter(res.getAllContents(), ProgramUnit.class)))).toString());
  }
  
  protected CharSequence _compile(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this expression is not supported:");
    _builder.append(exp);
    return _builder;
  }
  
  protected CharSequence _compile(final BoolExp exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this boolean expression is not supported:\'");
    _builder.append(exp);
    return _builder;
  }
  
  protected CharSequence _compile(final Command command) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this command is not supported:");
    _builder.append(command);
    return _builder;
  }
  
  protected CharSequence _compile(final ProgramUnit program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"NXCDefs.h\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("task main(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("SetSensorLowspeed(S4);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int angle;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while(1){");
    _builder.newLine();
    {
      EList<Expression> _block = program.getBlock();
      for(final Expression exp : _block) {
        _builder.append("\t\t\t");
        Object _compile = this.compile(exp);
        _builder.append(_compile, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    return _builder;
  }
  
  protected CharSequence _compile(final WhileLoop whileLoop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while(");
    Object _compile = this.compile(whileLoop.getLoopCond());
    _builder.append(_compile);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Expression> _block = whileLoop.getBlock();
      for(final Expression exp : _block) {
        _builder.append("\t");
        Object _compile_1 = this.compile(exp);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final NegExp negExp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!(");
    Object _compile = this.compile(negExp.getExp());
    _builder.append(_compile);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final AndExp andExp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(andExp.getLeftExp());
    _builder.append(_compile);
    _builder.append(" && ");
    Object _compile_1 = this.compile(andExp.getRightExp());
    _builder.append(_compile_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compile(final IfBlock ifBlock) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    Object _compile = this.compile(ifBlock.getCondition());
    _builder.append(_compile);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    {
      EList<Expression> _thenBlock = ifBlock.getThenBlock();
      for(final Expression exp : _thenBlock) {
        _builder.append("\t");
        Object _compile_1 = this.compile(exp);
        _builder.append(_compile_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}else{");
    _builder.newLine();
    {
      EList<Expression> _elseBlock = ifBlock.getElseBlock();
      for(final Expression exp_1 : _elseBlock) {
        _builder.append("\t");
        Object _compile_2 = this.compile(exp_1);
        _builder.append(_compile_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _compile(final PrintCmd printCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TextOut(");
    Integer _line = printCmd.getLine();
    _builder.append(_line);
    _builder.append(",LCD_LINE");
    Integer _col = printCmd.getCol();
    _builder.append(_col);
    _builder.append(",");
    String _msg = printCmd.getMsg();
    _builder.append(_msg);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Wait(");
    Integer _duration = printCmd.getDuration();
    _builder.append(_duration, "\t");
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _compile(final StopEngineCmd stopEngineCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Off(OUT_BC);");
    return _builder;
  }
  
  protected CharSequence _compile(final StopProgramCmd stopProgramCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Stop(true);");
    return _builder;
  }
  
  protected CharSequence _compile(final TurnCmd turnCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("OnFwdSync(OUT_B,");
    Double _power = turnCmd.getPower();
    _builder.append(_power);
    _builder.append(",");
    Double _angle = turnCmd.getAngle();
    _builder.append(_angle);
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _compile(final HasTurnedCmd hasTurn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("angle>=");
    Double _angle = hasTurn.getAngle();
    _builder.append(_angle);
    return _builder;
  }
  
  protected CharSequence _compile(final ObstacleCmd obstacleCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SensorUS(S4)<");
    Double _distance = obstacleCmd.getDistance();
    _builder.append(_distance);
    return _builder;
  }
  
  protected CharSequence _compile(final Bip bip) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("PlayToneEx(");
    Double _power = bip.getPower();
    _builder.append(_power);
    _builder.append(",");
    Integer _duration = bip.getDuration();
    _builder.append(_duration);
    _builder.append(",");
    Double _power_1 = bip.getPower();
    _builder.append(_power_1);
    _builder.append(",");
    Boolean _repet = bip.getRepet();
    _builder.append(_repet);
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _compile(final SetTurnAngleCmd setTurnAngleCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("angle=");
    Double _angle = setTurnAngleCmd.getAngle();
    _builder.append(_angle);
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _compile(final MoveCmd moveCmd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("OnFwdSync(OUT_B,");
    Double _power = moveCmd.getPower();
    _builder.append(_power);
    _builder.append(",0);");
    return _builder;
  }
  
  public CharSequence compile(final EObject andExp) {
    if (andExp instanceof AndExp) {
      return _compile((AndExp)andExp);
    } else if (andExp instanceof NegExp) {
      return _compile((NegExp)andExp);
    } else if (andExp instanceof Bip) {
      return _compile((Bip)andExp);
    } else if (andExp instanceof HasTurnedCmd) {
      return _compile((HasTurnedCmd)andExp);
    } else if (andExp instanceof MoveCmd) {
      return _compile((MoveCmd)andExp);
    } else if (andExp instanceof ObstacleCmd) {
      return _compile((ObstacleCmd)andExp);
    } else if (andExp instanceof PrintCmd) {
      return _compile((PrintCmd)andExp);
    } else if (andExp instanceof SetTurnAngleCmd) {
      return _compile((SetTurnAngleCmd)andExp);
    } else if (andExp instanceof StopEngineCmd) {
      return _compile((StopEngineCmd)andExp);
    } else if (andExp instanceof StopProgramCmd) {
      return _compile((StopProgramCmd)andExp);
    } else if (andExp instanceof TurnCmd) {
      return _compile((TurnCmd)andExp);
    } else if (andExp instanceof BoolExp) {
      return _compile((BoolExp)andExp);
    } else if (andExp instanceof IfBlock) {
      return _compile((IfBlock)andExp);
    } else if (andExp instanceof WhileLoop) {
      return _compile((WhileLoop)andExp);
    } else if (andExp instanceof Command) {
      return _compile((Command)andExp);
    } else if (andExp instanceof Expression) {
      return _compile((Expression)andExp);
    } else if (andExp instanceof ProgramUnit) {
      return _compile((ProgramUnit)andExp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(andExp).toString());
    }
  }
}