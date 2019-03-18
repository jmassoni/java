import java.util.ArrayList;

abstract class Stmt {

    static class Block extends Stmt {
    	ArrayList<Stmt> statements;

    	public Block(ArrayList<Stmt> statements) {
    		this.statements = statements;
    	}
    }

    // If Statement
    static class IfStmt extends Stmt {
        Expr.CompareExpr comp;
        Stmt.Block block;

        public IfStmt(Expr.CompareExpr comp, Stmt.Block block) {
            this.comp = comp;
            this.block = block;
        }
    }
    
    // While Statement
    static class WhileStmt extends Stmt {
        Expr.CompareExpr comp;
        Stmt.Block block;

        public WhileStmt(Expr.CompareExpr comp, Stmt.Block block) {
            this.comp = comp;
            this.block = block;
        }
    }

    static class PrintStmt extends Stmt {
    	Expr expr;

    	public PrintStmt(Expr expr) {
    		this.expr = expr;
    	}
    }
    
    
    static class AssignStmt extends Stmt {
        String name;
        Expr expr;
        
        public AssignStmt (String name, Expr expr) {
            this.name = name;
            this.expr = expr;
        }
    }
}