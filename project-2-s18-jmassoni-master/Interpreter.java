import java.util.HashMap;

public class Interpreter {
	
	// Environment is the current local scope
	HashMap<String, Object> environment;
	
	public Interpreter() {
		this.environment = new HashMap<String, Object>();
	}
	

    //*** The evaluation of an integer expression is just its value ***//
	public Integer evalInteger(Expr.IntegerValue n) {
		return (Integer) n.value;
	}


	//*** Evaluate a single atom value ***//
	public Object evalAtom(Expr e) {

		// Integer
	    if (e instanceof Expr.IntegerValue) {
			return evalInteger((Expr.IntegerValue) e);
		}

		// Var name
		else if (e instanceof Expr.VarAccess) {
			String name = ((Expr.VarAccess) e).name;
			
			if (!this.environment.containsKey(name)) {
				Driver.error("Unknown variable name " + name + ".");
			}
			
			return this.environment.get(name);
		}
		
		// Nested expression
		else {
			return evalExpr(e);
		}
	}


    //*** Unary negation ***//
	public Object evalNegExpr(Expr.NegExpr expr) {
	    if (expr.hasNegative) {
	    	Object value = evalNegExpr((Expr.NegExpr) expr.expr);
	  	    return -((Integer) value);
	    } else {
	    	return evalAtom(expr.expr);
	    }
	}


	//*** Multiplication expression ***//
	public Object evalMultExpr(Expr.MultExpr expr) {
		Object left = evalNegExpr((Expr.NegExpr) expr.left);

		// If there is a right-hand part, evaluate it and then apply the
		// appropriate operator
		Object right = null;
		if (expr.right != null) {
			right = evalMultExpr((Expr.MultExpr) expr.right);

			if (expr.operator == Tokens.TIMES) {
				return (Integer) left * (Integer) right;
			} else if (expr.operator == Tokens.DIVIDE) {
				return (Integer) left / (Integer) right;
			} else if (expr.operator == Tokens.MOD) {
				return (Integer) left % (Integer) right;
			}
		}

		// Default: return the left value by itself
		return left;
	}
	
	//*** Comparison expression ***//
	public Object evalCompareExpr(Expr.CompareExpr expr) {
		Object left = evalAddExpr((Expr.AddExpr) expr.left);
		Object right = evalAddExpr((Expr.AddExpr) expr.right);
		
		if(expr.operator == Tokens.EQUAL) {
			if((Integer) left == (Integer) right) {
				return true;
			}
		} else if(expr.operator == Tokens.NOT_EQUAL) {
			if((Integer) left != (Integer) right) {
				return true;
			}
		} else if(expr.operator == Tokens.GREATER_THAN) {
			if((Integer) left > (Integer) right) {
				return true;
			}
		} else if(expr.operator == Tokens.LESS_THAN) {
			if((Integer) left < (Integer) right) {
				return true;
			}
		} else if(expr.operator == Tokens.GREATER_THAN_OR_EQUAL) {
			if((Integer) left >= (Integer)right) {
				return true;
			}
		} else if(expr.operator == Tokens.LESS_THAN_OR_EQUAL) {
			if((Integer) left <= (Integer) right) {
				return true;
			}
		}
		return false;
	}

	//*** Addition expression ***//
	public Object evalAddExpr(Expr.AddExpr expr) {
		Object left = evalMultExpr((Expr.MultExpr) expr.left);

		// If there is a right-hand part, evaluate it and then apply the
		// appropriate operator
		Object right = null;
		if (expr.right != null) {
			right = evalAddExpr((Expr.AddExpr) expr.right);

			if (expr.operator == Tokens.PLUS) {
				return (Integer) left + (Integer) right;
			} else if (expr.operator == Tokens.MINUS) {
				return (Integer) left - (Integer) right;
			}
		}

		// Default: return the left value by itself
		return left;
	}


	//*** Wrapper for expression evaluations ***//
	public Object evalExpr(Expr e) {
		if(e instanceof Expr.StringExpr) {
			return ((Expr.StringExpr) e).value;
		} else {
			return evalAddExpr((Expr.AddExpr) e);
		}
	}


	//*** Print statememt: evaluate expression and print result ***//
	public void evalPrintStmt(Stmt.PrintStmt stmt) {
		Object result = evalExpr(stmt.expr);
		System.out.println(result);
	}


	//*** Evaluate a single statement ***//
	public void evalStmt(Stmt stmt) {
		if (stmt instanceof Stmt.PrintStmt) {
			evalPrintStmt((Stmt.PrintStmt) stmt);
		} else if (stmt instanceof Stmt.AssignStmt) {
			evalAssignStmt((Stmt.AssignStmt) stmt);
		} else if (stmt instanceof Stmt.IfStmt) {
			evalIfStmt((Stmt.IfStmt) stmt);
		} else if (stmt instanceof Stmt.WhileStmt) {
			evalWhileStmt((Stmt.WhileStmt) stmt);
		}
		// Add cases for other kinds of statements
	}
	
	//*** If statement  ***//
	public void evalIfStmt(Stmt.IfStmt stmt) {
		Object c = evalCompareExpr((Expr.CompareExpr) stmt.comp);
		
		if(c == true) {
			evalBlock((Stmt.Block) stmt.block);
		}
	}
	
	//*** While statement  ***//
	public void evalWhileStmt(Stmt.WhileStmt stmt) {
		Object c = evalCompareExpr((Expr.CompareExpr) stmt.comp);
		
		while(evalCompareExpr((Expr.CompareExpr) stmt.comp) == true) {
			evalBlock((Stmt.Block) stmt.block);
		}
	}


	//*** Assign statement: update mapping in environment table ***//
	public void evalAssignStmt(Stmt.AssignStmt stmt) {
	    String name = stmt.name;
	    Object value = evalExpr(stmt.expr);
	    this.environment.put(name, value);
	}

    //*** Evaluate a block of statements ***//
	public void evalBlock(Stmt.Block block) {
		for (Stmt stmt : block.statements) {
		    evalStmt(stmt);
		}
	}


	//*** Evaluate a program by evluating its body ***//
	public void evalProgram(Program program) {
		evalBlock(program.body);
	}

}