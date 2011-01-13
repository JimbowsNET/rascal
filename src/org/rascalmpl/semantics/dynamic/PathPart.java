package org.rascalmpl.semantics.dynamic;

import java.lang.StringBuilder;
import java.util.List;
import org.eclipse.imp.pdb.facts.INode;
import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.rascalmpl.ast.Expression;
import org.rascalmpl.ast.NullASTVisitor;
import org.rascalmpl.ast.PathChars;
import org.rascalmpl.ast.PathTail;
import org.rascalmpl.ast.PrePathChars;
import org.rascalmpl.interpreter.Evaluator;
import org.rascalmpl.interpreter.result.Result;

public abstract class PathPart extends org.rascalmpl.ast.PathPart {

	public PathPart(INode __param1) {
		super(__param1);
	}

	static public class Interpolated extends org.rascalmpl.ast.PathPart.Interpolated {

		public Interpolated(INode __param1, PrePathChars __param2, Expression __param3, PathTail __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> pre = this.getPre().__evaluate(__eval);
			Result<IValue> expr = this.getExpression().__evaluate(__eval);
			Result<IValue> tail = this.getTail().__evaluate(__eval);
			StringBuilder result = new StringBuilder();

			result.append(((IString) pre.getValue()).getValue());
			__eval.appendToString(expr.getValue(), result);
			result.append(((IString) tail.getValue()).getValue());

			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(org.rascalmpl.interpreter.Evaluator.__getTf().stringType(), __eval.__getVf().string(result.toString()), __eval);

		}

	}

	static public class NonInterpolated extends org.rascalmpl.ast.PathPart.NonInterpolated {

		public NonInterpolated(INode __param1, PathChars __param2) {
			super(__param1, __param2);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getPathChars().__evaluate(__eval);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}

	static public class Ambiguity extends org.rascalmpl.ast.PathPart.Ambiguity {

		public Ambiguity(INode __param1, List<org.rascalmpl.ast.PathPart> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}
}