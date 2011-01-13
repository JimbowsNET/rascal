package org.rascalmpl.semantics.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.IInteger;
import org.eclipse.imp.pdb.facts.IList;
import org.eclipse.imp.pdb.facts.IListWriter;
import org.eclipse.imp.pdb.facts.IMapWriter;
import org.eclipse.imp.pdb.facts.INode;
import org.eclipse.imp.pdb.facts.ISet;
import org.eclipse.imp.pdb.facts.ISetWriter;
import org.eclipse.imp.pdb.facts.IString;
import org.eclipse.imp.pdb.facts.IValue;
import org.eclipse.imp.pdb.facts.exceptions.UndeclaredFieldException;
import org.eclipse.imp.pdb.facts.type.Type;
import org.rascalmpl.ast.ASTFactory;
import org.rascalmpl.ast.BasicType;
import org.rascalmpl.ast.Field;
import org.rascalmpl.ast.Label;
import org.rascalmpl.ast.Mapping_Expression;
import org.rascalmpl.ast.Name;
import org.rascalmpl.ast.NullASTVisitor;
import org.rascalmpl.ast.Parameters;
import org.rascalmpl.ast.Statement;
import org.rascalmpl.interpreter.BasicTypeEvaluator;
import org.rascalmpl.interpreter.BooleanEvaluator;
import org.rascalmpl.interpreter.Evaluator;
import org.rascalmpl.interpreter.PatternEvaluator;
import org.rascalmpl.interpreter.TypeEvaluator;
import org.rascalmpl.interpreter.TypeReifier;
import org.rascalmpl.interpreter.asserts.Ambiguous;
import org.rascalmpl.interpreter.asserts.ImplementationError;
import org.rascalmpl.interpreter.callbacks.IModulesLoaded;
import org.rascalmpl.interpreter.control_exceptions.InterruptException;
import org.rascalmpl.interpreter.control_exceptions.Throw;
import org.rascalmpl.interpreter.env.Environment;
import org.rascalmpl.interpreter.matching.AndResult;
import org.rascalmpl.interpreter.matching.AntiPattern;
import org.rascalmpl.interpreter.matching.BasicBooleanResult;
import org.rascalmpl.interpreter.matching.ConcreteApplicationPattern;
import org.rascalmpl.interpreter.matching.ConcreteListPattern;
import org.rascalmpl.interpreter.matching.ConcreteListVariablePattern;
import org.rascalmpl.interpreter.matching.ConcreteOptPattern;
import org.rascalmpl.interpreter.matching.DescendantPattern;
import org.rascalmpl.interpreter.matching.EnumeratorResult;
import org.rascalmpl.interpreter.matching.EquivalenceResult;
import org.rascalmpl.interpreter.matching.GuardedPattern;
import org.rascalmpl.interpreter.matching.IBooleanResult;
import org.rascalmpl.interpreter.matching.IMatchingResult;
import org.rascalmpl.interpreter.matching.ListPattern;
import org.rascalmpl.interpreter.matching.MatchResult;
import org.rascalmpl.interpreter.matching.MultiVariablePattern;
import org.rascalmpl.interpreter.matching.NodePattern;
import org.rascalmpl.interpreter.matching.NotPattern;
import org.rascalmpl.interpreter.matching.NotResult;
import org.rascalmpl.interpreter.matching.OrResult;
import org.rascalmpl.interpreter.matching.QualifiedNamePattern;
import org.rascalmpl.interpreter.matching.ReifiedTypePattern;
import org.rascalmpl.interpreter.matching.SetPattern;
import org.rascalmpl.interpreter.matching.TuplePattern;
import org.rascalmpl.interpreter.matching.TypedVariablePattern;
import org.rascalmpl.interpreter.matching.VariableBecomesPattern;
import org.rascalmpl.interpreter.result.AbstractFunction;
import org.rascalmpl.interpreter.result.BoolResult;
import org.rascalmpl.interpreter.result.OverloadedFunctionResult;
import org.rascalmpl.interpreter.result.RascalFunction;
import org.rascalmpl.interpreter.result.Result;
import org.rascalmpl.interpreter.staticErrors.ItOutsideOfReducer;
import org.rascalmpl.interpreter.staticErrors.NonVoidTypeRequired;
import org.rascalmpl.interpreter.staticErrors.SyntaxError;
import org.rascalmpl.interpreter.staticErrors.UndeclaredFieldError;
import org.rascalmpl.interpreter.staticErrors.UndeclaredVariableError;
import org.rascalmpl.interpreter.staticErrors.UnexpectedTypeError;
import org.rascalmpl.interpreter.staticErrors.UninitializedVariableError;
import org.rascalmpl.interpreter.staticErrors.UnsupportedOperationError;
import org.rascalmpl.interpreter.staticErrors.UnsupportedPatternError;
import org.rascalmpl.interpreter.strategy.IStrategyContext;
import org.rascalmpl.interpreter.types.FunctionType;
import org.rascalmpl.interpreter.types.NonTerminalType;
import org.rascalmpl.interpreter.types.RascalTypeFactory;
import org.rascalmpl.parser.RascalActionExecutor;

public abstract class Expression extends org.rascalmpl.ast.Expression {

	public Expression(INode __param1) {
		super(__param1);
	}

	static public class ReifiedType extends org.rascalmpl.ast.Expression.ReifiedType {

		public ReifiedType(INode __param1, BasicType __param2, java.util.List<org.rascalmpl.ast.Expression> __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			BasicType basic = this.getBasicType();
			java.util.List<org.rascalmpl.ast.Expression> args = this.getArguments();
			Type[] fieldTypes = new Type[args.size()];
			IValue[] fieldValues = new IValue[args.size()];

			int i = 0;
			boolean valued = false;
			for (org.rascalmpl.ast.Expression a : args) {
				Result<IValue> argResult = a.__evaluate(__eval);
				Type argType = argResult.getType();

				if (argType instanceof org.rascalmpl.interpreter.types.ReifiedType) {
					fieldTypes[i] = argType.getTypeParameters().getFieldType(0);
					i++;
				} else {
					valued = true;
					fieldValues[i] = argResult.getValue();
					i++;
				}
			}

			Type type = basic.__evaluate(new BasicTypeEvaluator(__eval.getCurrentEnvt(), valued ? null : org.rascalmpl.interpreter.Evaluator.__getTf().tupleType(fieldTypes), valued ? fieldValues
					: null));

			return type.accept(new TypeReifier(__eval, __eval.__getVf()));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			BasicType basic = this.getBasicType();
			java.util.List<IMatchingResult> args = __eval.visitElements(this.getArguments());

			return new ReifiedTypePattern(__eval.__getCtx(), this, basic, args);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}

	static public class StepRange extends org.rascalmpl.ast.Expression.StepRange {

		public StepRange(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3, org.rascalmpl.ast.Expression __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> from = this.getFirst().__evaluate(__eval);
			Result<IValue> to = this.getLast().__evaluate(__eval);
			Result<IValue> second = this.getSecond().__evaluate(__eval);
			return from.makeStepRange(to, second);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class And extends org.rascalmpl.ast.Expression.And {

		public And(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new AndResult(__eval.__getCtx(), this.getLhs().__evaluate(__eval), this.getRhs().__evaluate(__eval));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class TransitiveClosure extends org.rascalmpl.ast.Expression.TransitiveClosure {

		public TransitiveClosure(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getArgument().__evaluate(__eval).transitiveClosure();

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class MultiVariable extends org.rascalmpl.ast.Expression.MultiVariable {

		public MultiVariable(INode __param1, org.rascalmpl.ast.QualifiedName __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Name name = this.getName();
			Result<IValue> variable = __eval.getCurrentEnvt().getVariable(name);

			if (variable == null) {
				throw new UndeclaredVariableError(org.rascalmpl.interpreter.utils.Names.name(name), name);
			}

			if (variable.getValue() == null) {
				throw new UninitializedVariableError(org.rascalmpl.interpreter.utils.Names.name(name), name);
			}

			return variable;

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return new MultiVariablePattern(__eval.__getCtx(), this, this.getQualifiedName());

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

	}

	static public class LessThan extends org.rascalmpl.ast.Expression.LessThan {

		public LessThan(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.lessThan(right);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class NotIn extends org.rascalmpl.ast.Expression.NotIn {

		public NotIn(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return right.notIn(left);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class CallOrTree extends org.rascalmpl.ast.Expression.CallOrTree {

		private Result<IValue> cachedPrefix = null;
		private boolean registeredCacheHandler = false;
		
		public CallOrTree(INode __param1, org.rascalmpl.ast.Expression __param2, java.util.List<org.rascalmpl.ast.Expression> __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			org.rascalmpl.ast.Expression nameExpr = this.getExpression();
			if (__eval.isConcreteSyntaxList(this)) {
				org.rascalmpl.ast.Expression.List args = (org.rascalmpl.ast.Expression.List) this.getArguments().get(1);
				// TODO what if somebody writes a variable in the list
				// production itself?
				return new ConcreteListPattern(__eval.__getCtx(), this, __eval.visitElements(args.getElements()));
			}
			if (__eval.isConcreteSyntaxOptional(this)) {
				org.rascalmpl.ast.Expression.List args = (org.rascalmpl.ast.Expression.List) this.getArguments().get(1);
				return new ConcreteOptPattern(__eval.__getCtx(), this, __eval.visitElements(args.getElements()));
			}
			if (__eval.isConcreteSyntaxAppl(this)) {
				if (org.rascalmpl.values.uptr.TreeAdapter.isLexical((IConstructor) this.getTree())) {
					return new ConcreteApplicationPattern(__eval.__getCtx(), this, __eval.visitConcreteLexicalArguments(this));
				}

				return new ConcreteApplicationPattern(__eval.__getCtx(), this, __eval.visitConcreteArguments(this));
			}
			if (__eval.isConcreteSyntaxAmb(this)) {
				new Ambiguous((IConstructor) this.getTree());
				// return new AbstractPatternConcreteAmb(vf, new
				// EvaluatorContext(ctx.getEvaluator(), this), this,
				// visitArguments(this));
			}

			if (nameExpr.isQualifiedName()) {
				// If the name expression is just a name, enable caching of the name lookup result.
				// Also, if we have not yet registered a handler when we cache the result, do so now.
				Result<IValue> prefix = this.cachedPrefix;
				if (prefix == null) {
					this.cachedPrefix = prefix = __eval.__getCtx().getCurrentEnvt().getVariable(nameExpr.getQualifiedName());
					
					if (!registeredCacheHandler) {
						__eval.getEvaluator().registerGenericLoadListener(new IModulesLoaded() {
							public void handleGenericLoadEvent() {
								cachedPrefix = null;
							}
						});
						registeredCacheHandler = true;
					}
				}

				// TODO: get rid of __eval if-then-else by introducing
				// subclasses for NodePattern for each case.
				if (nameExpr.isQualifiedName() && prefix == null) {
					return new NodePattern(__eval.__getCtx(), this, null, nameExpr.getQualifiedName(), __eval.visitArguments(this));
				} else if (nameExpr.isQualifiedName() && ((prefix instanceof AbstractFunction) || prefix instanceof OverloadedFunctionResult)) {
					return new NodePattern(__eval.__getCtx(), this, null, nameExpr.getQualifiedName(), __eval.visitArguments(this));
				}
			}

			return new NodePattern(__eval.__getCtx(), this, nameExpr.__evaluate(__eval), null, __eval.visitArguments(this));

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			if (__eval.__getInterrupt())
				throw new InterruptException(__eval.getStackTrace());

			__eval.setCurrentAST(this);

			Result<IValue> function = this.cachedPrefix;

			// If the name expression is just a name, enable caching of the name lookup result.
			// Also, if we have not yet registered a handler when we cache the result, do so now.
			// NOTE: We verify that this is a constructor type, since we don't cache functions
			// at this point.
			// TODO: Split the function name lookup from the closure formation, so we can cache
			// the lookup without having problems with closure formation and scoping for nested
			// functions.
			if (function == null) {
				this.cachedPrefix = function = this.getExpression().__evaluate(__eval);
				if (!function.getType().isConstructorType()) this.cachedPrefix = null;
				
				if (this.cachedPrefix != null && !registeredCacheHandler) {
					__eval.getEvaluator().registerGenericLoadListener(new IModulesLoaded() {
						public void handleGenericLoadEvent() {
							cachedPrefix = null;
						}
					});
					registeredCacheHandler = true;
				}
			}

			java.util.List<org.rascalmpl.ast.Expression> args = this.getArguments();

			IValue[] actuals = new IValue[args.size()];
			Type[] types = new Type[args.size()];

			for (int i = 0; i < args.size(); i++) {
				Result<IValue> resultElem = args.get(i).__evaluate(__eval);
				types[i] = resultElem.getType();
				actuals[i] = resultElem.getValue();
			}

			Result<IValue> res = function.call(types, actuals);

			// we need to update the strategy context when the function is of
			// type Strategy
			IStrategyContext strategyContext = __eval.getStrategyContext();
			if (strategyContext != null) {
				if (function.getValue() instanceof AbstractFunction) {
					AbstractFunction f = (AbstractFunction) function.getValue();
					if (f.isTypePreserving()) {
						strategyContext.update(actuals[0], res.getValue());
					}
				} else if (function.getValue() instanceof OverloadedFunctionResult) {
					OverloadedFunctionResult fun = (OverloadedFunctionResult) function.getValue();

					for (AbstractFunction f : fun.iterable()) {
						if (f.isTypePreserving()) {
							strategyContext.update(actuals[0], res.getValue());
						}
					}
				}
			}
			return res;

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

	}

	static public class List extends org.rascalmpl.ast.Expression.List {

		public List(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return new ListPattern(__eval.__getCtx(), this, __eval.visitElements(this.getElements()));

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			java.util.List<org.rascalmpl.ast.Expression> elements = this.getElements();

			Type elementType = org.rascalmpl.interpreter.Evaluator.__getTf().voidType();
			java.util.List<IValue> results = new ArrayList<IValue>();

			// Splicing is true for the complete list; a terrible, terrible
			// hack.
			boolean splicing = __eval.__getConcreteListsShouldBeSpliced();
			boolean first = true;
			int skip = 0;

			for (org.rascalmpl.ast.Expression expr : elements) {
				Result<IValue> resultElem = expr.__evaluate(__eval);

				if (resultElem.getType().isVoidType())
					throw new NonVoidTypeRequired(expr);

				if (skip > 0) {
					skip--;
					continue;
				}

				Type resultType = resultElem.getType();
				if (splicing && resultType instanceof NonTerminalType) {
					IConstructor sym = ((NonTerminalType) resultType).getSymbol();

					if (org.rascalmpl.values.uptr.SymbolAdapter.isAnyList(sym)) {
						IConstructor appl = ((IConstructor) resultElem.getValue());
						IList listElems = org.rascalmpl.values.uptr.TreeAdapter.getArgs(appl);
						// Splice elements in list if element types permit
						// __eval

						if (!listElems.isEmpty()) {
							for (IValue val : listElems) {
								elementType = elementType.lub(val.getType());
								results.add(val);
							}
						} else {
							// make sure to remove surrounding sep
							if (!first) {
								if (org.rascalmpl.values.uptr.SymbolAdapter.isIterStarSeps(sym)) {
									for (@SuppressWarnings("unused")
									IValue sep : org.rascalmpl.values.uptr.SymbolAdapter.getSeparators(sym)) {
										results.remove(results.size() - 1);
									}
								}
							} else {
								if (org.rascalmpl.values.uptr.SymbolAdapter.isIterStarSeps(sym)) {
									skip = org.rascalmpl.values.uptr.SymbolAdapter.getSeparators(sym).length();
								}
							}
						}
					} else {
						// Just add it.
						elementType = elementType.lub(resultElem.getType());
						results.add(results.size(), resultElem.getValue());
					}
				} else {
					/* = no concrete syntax */
					if (resultElem.getType().isListType() && !expr.isList() && elementType.isSubtypeOf(resultElem.getType().getElementType())) {
						/*
						 * Splice elements in list if element types permit
						 * __eval
						 */
						for (IValue val : ((IList) resultElem.getValue())) {
							elementType = elementType.lub(val.getType());
							results.add(val);
						}
					} else {
						elementType = elementType.lub(resultElem.getType());

						results.add(results.size(), resultElem.getValue());
					}
				}

				first = false;
			}
			Type resultType = org.rascalmpl.interpreter.Evaluator.__getTf().listType(elementType);
			IListWriter w = resultType.writer(__eval.__getVf());
			w.appendAll(results);
			// Was: return makeResult(resultType, applyRules(w.done()));
			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(resultType, w.done(), __eval);

		}

	}

	static public class Map extends org.rascalmpl.ast.Expression.Map {

		public Map(INode __param1, java.util.List<Mapping_Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			java.util.List<Mapping_Expression> mappings = this.getMappings();
			java.util.Map<IValue, IValue> result = new HashMap<IValue, IValue>();
			Type keyType = org.rascalmpl.interpreter.Evaluator.__getTf().voidType();
			Type valueType = org.rascalmpl.interpreter.Evaluator.__getTf().voidType();

			for (Mapping_Expression mapping : mappings) {
				Result<IValue> keyResult = mapping.getFrom().__evaluate(__eval);
				Result<IValue> valueResult = mapping.getTo().__evaluate(__eval);

				if (keyResult.getType().isVoidType())
					throw new NonVoidTypeRequired(mapping.getFrom());

				if (valueResult.getType().isVoidType())
					throw new NonVoidTypeRequired(mapping.getTo());

				keyType = keyType.lub(keyResult.getType());
				valueType = valueType.lub(valueResult.getType());

				IValue keyValue = result.get(keyResult.getValue());
				if (keyValue != null) {
					throw org.rascalmpl.interpreter.utils.RuntimeExceptionFactory.MultipleKey(keyValue, mapping.getFrom(), __eval.getStackTrace());
				}

				result.put(keyResult.getValue(), valueResult.getValue());
			}

			Type type = org.rascalmpl.interpreter.Evaluator.__getTf().mapType(keyType, valueType);
			IMapWriter w = type.writer(__eval.__getVf());
			w.putAll(result);

			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(type, w.done(), __eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new ImplementationError("Map in pattern not yet implemented");

		}

	}

	static public class ReifyType extends org.rascalmpl.ast.Expression.ReifyType {

		public ReifyType(INode __param1, org.rascalmpl.ast.Type __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Type t = new TypeEvaluator(__eval.getCurrentEnvt(), __eval.__getHeap()).eval(this.getType());
			return t.accept(new TypeReifier(__eval, __eval.__getVf()));

		}

	}

	static public class QualifiedName extends org.rascalmpl.ast.Expression.QualifiedName {

		public QualifiedName(INode __param1, org.rascalmpl.ast.QualifiedName __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			org.rascalmpl.ast.QualifiedName name = this.getQualifiedName();
			Type signature = org.rascalmpl.interpreter.PatternEvaluator.__getTf().tupleType(new Type[0]);

			Result<IValue> r = __eval.__getCtx().getEvaluator().getCurrentEnvt().getVariable(name);

			if (r != null) {
				if (r.getValue() != null) {
					// Previously declared and initialized variable
					return new QualifiedNamePattern(__eval.__getCtx(), this, name);
				}

				Type type = r.getType();
				if (type instanceof NonTerminalType) {
					NonTerminalType cType = (NonTerminalType) type;
					if (cType.isConcreteListType()) {
						return new ConcreteListVariablePattern(__eval.__getCtx(), this, type, org.rascalmpl.interpreter.utils.Names.lastName(name));
					}
				}

				return new QualifiedNamePattern(__eval.__getCtx(), this, name);
			}

			if (__eval.__getCtx().getCurrentEnvt().isTreeConstructorName(name, signature)) {
				return new NodePattern(__eval.__getCtx(), this, null, name, new ArrayList<IMatchingResult>());
			}

			// Completely fresh variable
			return new QualifiedNamePattern(__eval.__getCtx(), this, name);
			// return new AbstractPatternTypedVariable(vf, env,
			// ev.tf.valueType(), name);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			org.rascalmpl.ast.QualifiedName name = this.getQualifiedName();
			Result<IValue> variable = __eval.getCurrentEnvt().getVariable(name);

			if (variable == null) {
				throw new UndeclaredVariableError(org.rascalmpl.interpreter.utils.Names.fullName(name), name);
			}

			if (variable.getValue() == null) {
				throw new UninitializedVariableError(org.rascalmpl.interpreter.utils.Names.fullName(name), name);
			}

			return variable;

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

	}

	static public class VoidClosure extends org.rascalmpl.ast.Expression.VoidClosure {

		public VoidClosure(INode __param1, Parameters __param2, java.util.List<Statement> __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Type formals = new TypeEvaluator(__eval.getCurrentEnvt(), __eval.__getHeap()).eval(this.getParameters());
			RascalTypeFactory RTF = org.rascalmpl.interpreter.types.RascalTypeFactory.getInstance();
			return new RascalFunction(this, __eval, (FunctionType) RTF.functionType(org.rascalmpl.interpreter.Evaluator.__getTf().voidType(), formals), this.getParameters().isVarArgs(),
					this.getStatements(), __eval.getCurrentEnvt(), __eval.__getAccumulators());

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class TypedVariable extends org.rascalmpl.ast.Expression.TypedVariable {

		public TypedVariable(INode __param1, org.rascalmpl.ast.Type __param2, Name __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			Type type = new TypeEvaluator(__eval.__getCtx().getCurrentEnvt(), __eval.__getCtx().getHeap()).eval(this.getType());

			if (type instanceof NonTerminalType) {
				NonTerminalType cType = (NonTerminalType) type;
				if (cType.isConcreteListType()) {
					return new ConcreteListVariablePattern(__eval.__getCtx(), this, type, this.getName());
				}
			}
			return new TypedVariablePattern(__eval.__getCtx(), this, type, this.getName());

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UninitializedVariableError(this.toString(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			// TODO: should allow qualified names in TypeVariables?!?
			Result<IValue> result = __eval.getCurrentEnvt().getVariable(org.rascalmpl.interpreter.utils.Names.name(this.getName()));

			if (result != null && result.getValue() != null) {
				return result;
			}

			throw new UninitializedVariableError(org.rascalmpl.interpreter.utils.Names.name(this.getName()), this);

		}

	}

	static public class Match extends org.rascalmpl.ast.Expression.Match {

		public Match(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new MatchResult(__eval.__getCtx(), this.getPattern(), true, this.getExpression());

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Guarded extends org.rascalmpl.ast.Expression.Guarded {

		public Guarded(INode __param1, org.rascalmpl.ast.Type __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			Type type = new TypeEvaluator(__eval.__getCtx().getCurrentEnvt(), __eval.__getCtx().getHeap()).eval(this.getType());
			IMatchingResult absPat = this.getPattern().__evaluate(__eval);
			return new GuardedPattern(__eval.__getCtx(), this, type, absPat);

		}

		@Override
		public IMatchingResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> result = this.getPattern().__evaluate(__eval);
			Type expected = new TypeEvaluator(__eval.getCurrentEnvt(), __eval.__getHeap()).eval(this.getType());

			// TODO: clean up __eval hack
			if (expected instanceof NonTerminalType && result.getType().isSubtypeOf(org.rascalmpl.interpreter.Evaluator.__getTf().stringType())) {
				String command = '(' + expected.toString() + ')' + '`' + ((IString) result.getValue()).getValue() + '`';
				__eval.__setInterrupt(false);
				IConstructor tree = __eval.__getParser().parseCommand(this.getLocation().getURI(), command, new RascalActionExecutor(__eval, __eval.__getParser().getInfo()));

				tree = (IConstructor) org.rascalmpl.values.uptr.TreeAdapter.getArgs(tree).get(1); // top
																									// command
																									// expression
				tree = (IConstructor) org.rascalmpl.values.uptr.TreeAdapter.getArgs(tree).get(0); // typed
																									// quoted
																									// embedded
																									// fragment
				tree = (IConstructor) org.rascalmpl.values.uptr.TreeAdapter.getArgs(tree).get(8); // wrapped
																									// string
																									// between
																									// `...`
				return org.rascalmpl.interpreter.result.ResultFactory.makeResult(expected, tree, __eval);
			}
			if (!result.getType().isSubtypeOf(expected)) {
				throw new UnexpectedTypeError(expected, result.getType(), this.getPattern());
			}

			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(expected, result.getValue(), __eval);

		}

	}

	static public class NoMatch extends org.rascalmpl.ast.Expression.NoMatch {

		public NoMatch(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new MatchResult(__eval.__getCtx(), this.getPattern(), false, this.getExpression());

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Comprehension extends org.rascalmpl.ast.Expression.Comprehension {

		public Comprehension(INode __param1, org.rascalmpl.ast.Comprehension __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getComprehension().__evaluate(__eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Enumerator extends org.rascalmpl.ast.Expression.Enumerator {

		public Enumerator(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new EnumeratorResult(__eval.__getCtx(), this.getPattern().__evaluate(__eval.__getPe()), this.getExpression());

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Environment old = __eval.getCurrentEnvt();
			try {
				IBooleanResult gen = __eval.makeBooleanResult(this);
				gen.init();
				__eval.pushEnv();
				if (gen.hasNext() && gen.next()) {
					return org.rascalmpl.interpreter.result.ResultFactory.bool(true, __eval);
				}
				return org.rascalmpl.interpreter.result.ResultFactory.bool(false, __eval);
			} finally {
				__eval.unwind(old);
			}

		}

	}

	static public class Visit extends org.rascalmpl.ast.Expression.Visit {

		public Visit(INode __param1, Label __param2, org.rascalmpl.ast.Visit __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getVisit().__evaluate(__eval);

		}

	}

	static public class Subscript extends org.rascalmpl.ast.Expression.Subscript {

		public Subscript(INode __param1, org.rascalmpl.ast.Expression __param2, java.util.List<org.rascalmpl.ast.Expression> __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> expr = this.getExpression().__evaluate(__eval);
			int nSubs = this.getSubscripts().size();
			Result<?> subscripts[] = new Result<?>[nSubs];
			for (int i = 0; i < nSubs; i++) {
				org.rascalmpl.ast.Expression subsExpr = this.getSubscripts().get(i);
				subscripts[i] = __eval.isWildCard(subsExpr.toString()) ? null : subsExpr.__evaluate(__eval);
			}
			return expr.subscript(subscripts);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class GreaterThanOrEq extends org.rascalmpl.ast.Expression.GreaterThanOrEq {

		public GreaterThanOrEq(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.greaterThanOrEqual(right);

		}

	}

	static public class Intersection extends org.rascalmpl.ast.Expression.Intersection {

		public Intersection(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.intersect(right);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Tuple extends org.rascalmpl.ast.Expression.Tuple {

		public Tuple(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return new TuplePattern(__eval.__getCtx(), this, __eval.visitElements(this.getElements()));

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			java.util.List<org.rascalmpl.ast.Expression> elements = this.getElements();

			IValue[] values = new IValue[elements.size()];
			Type[] types = new Type[elements.size()];

			for (int i = 0; i < elements.size(); i++) {
				Result<IValue> resultElem = elements.get(i).__evaluate(__eval);
				types[i] = resultElem.getType();
				values[i] = resultElem.getValue();
			}

			// return makeResult(tf.tupleType(types),
			// applyRules(vf.tuple(values)));
			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(org.rascalmpl.interpreter.Evaluator.__getTf().tupleType(types), __eval.__getVf().tuple(values), __eval);

		}

	}

	static public class Reducer extends org.rascalmpl.ast.Expression.Reducer {

		public Reducer(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3, java.util.List<org.rascalmpl.ast.Expression> __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalReducer(this.getInit(), this.getResult(), this.getGenerators());

		}

	}

	static public class IfThenElse extends org.rascalmpl.ast.Expression.IfThenElse {

		public IfThenElse(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3, org.rascalmpl.ast.Expression __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Environment old = __eval.getCurrentEnvt();
			__eval.pushEnv();

			try {
				Result<IValue> cval = this.getCondition().__evaluate(__eval);

				if (!cval.getType().isBoolType()) {
					throw new UnexpectedTypeError(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), cval.getType(), this);
				}

				if (cval.isTrue()) {
					return this.getThenExp().__evaluate(__eval);
				}

				return this.getElseExp().__evaluate(__eval);
			} finally {
				__eval.unwind(old);
			}

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class SetAnnotation extends org.rascalmpl.ast.Expression.SetAnnotation {

		public SetAnnotation(INode __param1, org.rascalmpl.ast.Expression __param2, Name __param3, org.rascalmpl.ast.Expression __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> base = this.getExpression().__evaluate(__eval);
			String annoName = org.rascalmpl.interpreter.utils.Names.name(this.getName());
			Result<IValue> anno = this.getValue().__evaluate(__eval);
			return base.setAnnotation(annoName, anno, __eval.getCurrentEnvt());

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class VariableBecomes extends org.rascalmpl.ast.Expression.VariableBecomes {

		public VariableBecomes(INode __param1, Name __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			IMatchingResult pat = this.getPattern().__evaluate(__eval);
			LinkedList<Name> names = new LinkedList<Name>();
			names.add(this.getName());
			IMatchingResult var = new QualifiedNamePattern(__eval.__getCtx(), this, org.rascalmpl.ast.ASTFactoryFactory.getASTFactory().makeQualifiedNameDefault(this.getTree(), names));
			return new VariableBecomesPattern(__eval.__getCtx(), this, var, pat);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getPattern().__evaluate(__eval);

		}

		@Override
		public IMatchingResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

	}

	static public class Modulo extends org.rascalmpl.ast.Expression.Modulo {

		public Modulo(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.modulo(right);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Negative extends org.rascalmpl.ast.Expression.Negative {

		public Negative(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> arg = this.getArgument().__evaluate(__eval);
			return arg.negative();

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Subtraction extends org.rascalmpl.ast.Expression.Subtraction {

		public Subtraction(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.subtract(right);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class TransitiveReflexiveClosure extends org.rascalmpl.ast.Expression.TransitiveReflexiveClosure {

		public TransitiveReflexiveClosure(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getArgument().__evaluate(__eval).transitiveReflexiveClosure();

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Closure extends org.rascalmpl.ast.Expression.Closure {

		public Closure(INode __param1, org.rascalmpl.ast.Type __param2, Parameters __param3, java.util.List<Statement> __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Type formals = new TypeEvaluator(__eval.getCurrentEnvt(), __eval.__getHeap()).eval(this.getParameters());
			Type returnType = __eval.evalType(this.getType());
			RascalTypeFactory RTF = org.rascalmpl.interpreter.types.RascalTypeFactory.getInstance();
			return new RascalFunction(this, __eval, (FunctionType) RTF.functionType(returnType, formals), this.getParameters().isVarArgs(), this.getStatements(), __eval.getCurrentEnvt(),
					__eval.__getAccumulators());

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Implication extends org.rascalmpl.ast.Expression.Implication {

		public Implication(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new OrResult(__eval.__getCtx(), new NotResult(__eval.__getCtx(), this.getLhs().__evaluate(__eval)), this.getRhs().__evaluate(__eval));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class GreaterThan extends org.rascalmpl.ast.Expression.GreaterThan {

		public GreaterThan(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.greaterThan(right);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class IsDefined extends org.rascalmpl.ast.Expression.IsDefined {

		public IsDefined(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			try {
				this.getArgument().__evaluate(__eval); // wait for exception
				return org.rascalmpl.interpreter.result.ResultFactory.makeResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(true), __eval);

			} catch (Throw e) {
				// TODO For now we __evaluate any Throw here, restrict to
				// NoSuchKey and NoSuchAnno?
				return org.rascalmpl.interpreter.result.ResultFactory.makeResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(false), __eval);
			}

		}

	}

	static public class FieldProject extends org.rascalmpl.ast.Expression.FieldProject {

		public FieldProject(INode __param1, org.rascalmpl.ast.Expression __param2, java.util.List<Field> __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			// TODO: move to result classes
			Result<IValue> base = this.getExpression().__evaluate(__eval);

			Type baseType = base.getType();
			if (!baseType.isTupleType() && !baseType.isRelationType() && !baseType.isMapType()) {
				throw new UnsupportedOperationError("projection", baseType, this);
			}

			java.util.List<Field> fields = this.getFields();
			int nFields = fields.size();
			int selectedFields[] = new int[nFields];

			for (int i = 0; i < nFields; i++) {
				Field f = fields.get(i);
				if (f.isIndex()) {
					selectedFields[i] = ((IInteger) f.getFieldIndex().__evaluate(__eval).getValue()).intValue();
				} else {
					String fieldName = org.rascalmpl.interpreter.utils.Names.name(f.getFieldName());
					try {
						selectedFields[i] = baseType.getFieldIndex(fieldName);
					} catch (UndeclaredFieldException e) {
						throw new UndeclaredFieldError(fieldName, baseType, this);
					}
				}

				if (!baseType.isMapType() && !baseType.getElementType().isVoidType()) {
					if (selectedFields[i] < 0 || selectedFields[i] > baseType.getArity()) {
						throw org.rascalmpl.interpreter.utils.RuntimeExceptionFactory.indexOutOfBounds(__eval.__getVf().integer(i), __eval.getCurrentAST(), __eval.getStackTrace());
					}
				} else if (baseType.isMapType() && selectedFields[i] < 0 || selectedFields[i] > 1) {
					throw org.rascalmpl.interpreter.utils.RuntimeExceptionFactory.indexOutOfBounds(__eval.__getVf().integer(i), __eval.getCurrentAST(), __eval.getStackTrace());
				}
			}

			return base.fieldSelect(selectedFields);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Equals extends org.rascalmpl.ast.Expression.Equals {

		public Equals(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.equals(right);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class FieldAccess extends org.rascalmpl.ast.Expression.FieldAccess {

		public FieldAccess(INode __param1, org.rascalmpl.ast.Expression __param2, Name __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> expr = this.getExpression().__evaluate(__eval);
			String field = org.rascalmpl.interpreter.utils.Names.name(this.getField());

			return expr.fieldAccess(field, __eval.getCurrentEnvt().getStore());

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Range extends org.rascalmpl.ast.Expression.Range {

		public Range(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			// IListWriter w = vf.listWriter(tf.integerType());
			Result<IValue> from = this.getFirst().__evaluate(__eval);
			Result<IValue> to = this.getLast().__evaluate(__eval);
			return from.makeRange(to);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Descendant extends org.rascalmpl.ast.Expression.Descendant {

		public Descendant(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			// TODO: what would be the value of a descendant pattern???
			return org.rascalmpl.interpreter.result.ResultFactory.nothing();

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			IMatchingResult absPat = this.getPattern().__evaluate(__eval);
			return new DescendantPattern(__eval.__getCtx(), this, absPat);

		}

		@Override
		public IMatchingResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

	}

	static public class Addition extends org.rascalmpl.ast.Expression.Addition {

		public Addition(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.add(right);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class FieldUpdate extends org.rascalmpl.ast.Expression.FieldUpdate {

		public FieldUpdate(INode __param1, org.rascalmpl.ast.Expression __param2, Name __param3, org.rascalmpl.ast.Expression __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> expr = this.getExpression().__evaluate(__eval);
			Result<IValue> repl = this.getReplacement().__evaluate(__eval);
			String name = org.rascalmpl.interpreter.utils.Names.name(this.getKey());
			return expr.fieldUpdate(name, repl, __eval.getCurrentEnvt().getStore());

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Or extends org.rascalmpl.ast.Expression.Or {

		public Or(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new OrResult(__eval.__getCtx(), this.getLhs().__evaluate(__eval), this.getRhs().__evaluate(__eval));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Anti extends org.rascalmpl.ast.Expression.Anti {

		public Anti(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			IMatchingResult absPat = this.getPattern().__evaluate(__eval);
			return new AntiPattern(__eval.__getCtx(), this, absPat);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			// TODO: what would be the value of an anti expression???
			return org.rascalmpl.interpreter.result.ResultFactory.nothing();

		}

		@Override
		public IMatchingResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

	}

	static public class Set extends org.rascalmpl.ast.Expression.Set {

		public Set(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return new SetPattern(__eval.__getCtx(), this, __eval.visitElements(this.getElements()));

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			java.util.List<org.rascalmpl.ast.Expression> elements = this.getElements();

			Type elementType = org.rascalmpl.interpreter.Evaluator.__getTf().voidType();
			java.util.List<IValue> results = new ArrayList<IValue>();

			for (org.rascalmpl.ast.Expression expr : elements) {
				Result<IValue> resultElem = expr.__evaluate(__eval);
				if (resultElem.getType().isVoidType())
					throw new NonVoidTypeRequired(expr);

				if (resultElem.getType().isSetType() && !expr.isSet() && elementType.isSubtypeOf(resultElem.getType().getElementType())) {
					/*
					 * Splice the elements in the set if element types permit
					 * __eval.
					 */
					for (IValue val : ((ISet) resultElem.getValue())) {
						elementType = elementType.lub(val.getType());
						results.add(val);
					}
				} else {
					elementType = elementType.lub(resultElem.getType());
					results.add(results.size(), resultElem.getValue());
				}
			}
			Type resultType = org.rascalmpl.interpreter.Evaluator.__getTf().setType(elementType);
			ISetWriter w = resultType.writer(__eval.__getVf());
			w.insertAll(results);
			// Was: return makeResult(resultType, applyRules(w.done()));
			return org.rascalmpl.interpreter.result.ResultFactory.makeResult(resultType, w.done(), __eval);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

	}

	static public class All extends org.rascalmpl.ast.Expression.All {

		public All(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result __evaluate(Evaluator __eval) {

			java.util.List<org.rascalmpl.ast.Expression> producers = this.getGenerators();
			int size = producers.size();
			IBooleanResult[] gens = new IBooleanResult[size];
			Environment[] olds = new Environment[size];
			Environment old = __eval.getCurrentEnvt();
			int i = 0;

			try {
				gens[0] = __eval.makeBooleanResult(producers.get(0));
				gens[0].init();
				olds[0] = __eval.getCurrentEnvt();
				__eval.pushEnv();

				while (i >= 0 && i < size) {
					if (__eval.__getInterrupt())
						throw new InterruptException(__eval.getStackTrace());
					if (gens[i].hasNext()) {
						if (!gens[i].next()) {
							return new BoolResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(false), __eval);
						}

						if (i == size - 1) {
							__eval.unwind(olds[i]);
							__eval.pushEnv();
						} else {
							i++;
							gens[i] = __eval.makeBooleanResult(producers.get(i));
							gens[i].init();
							olds[i] = __eval.getCurrentEnvt();
							__eval.pushEnv();
						}
					} else {
						__eval.unwind(olds[i]);
						i--;
					}
				}
			} finally {
				__eval.unwind(old);
			}

			return new BoolResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(true), __eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class TypedVariableBecomes extends org.rascalmpl.ast.Expression.TypedVariableBecomes {

		public TypedVariableBecomes(INode __param1, org.rascalmpl.ast.Type __param2, Name __param3, org.rascalmpl.ast.Expression __param4) {
			super(__param1, __param2, __param3, __param4);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getPattern().__evaluate(__eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new SyntaxError(this.toString(), this.getLocation());

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			Type type = new TypeEvaluator(__eval.__getCtx().getCurrentEnvt(), __eval.__getCtx().getHeap()).eval(this.getType());
			IMatchingResult pat = this.getPattern().__evaluate(__eval);
			IMatchingResult var = new TypedVariablePattern(__eval.__getCtx(), this, type, this.getName());
			return new VariableBecomesPattern(__eval.__getCtx(), this, var, pat);

		}

	}

	static public class In extends org.rascalmpl.ast.Expression.In {

		public In(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return right.in(left);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class GetAnnotation extends org.rascalmpl.ast.Expression.GetAnnotation {

		public GetAnnotation(INode __param1, org.rascalmpl.ast.Expression __param2, Name __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> base = this.getExpression().__evaluate(__eval);
			String annoName = org.rascalmpl.interpreter.utils.Names.name(this.getName());
			return base.getAnnotation(annoName, __eval.getCurrentEnvt());

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Negation extends org.rascalmpl.ast.Expression.Negation {

		public Negation(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new NotResult(__eval.__getCtx(), this.getArgument().__evaluate(__eval));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return new NotPattern(__eval.__getCtx(), this, this.getArgument().__evaluate(__eval));

		}

	}

	static public class It extends org.rascalmpl.ast.Expression.It {

		public It(INode __param1) {
			super(__param1);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> v = __eval.getCurrentEnvt().getVariable(org.rascalmpl.interpreter.Evaluator.IT);
			if (v == null) {
				throw new ItOutsideOfReducer(this);
			}
			return v;

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}

	static public class Composition extends org.rascalmpl.ast.Expression.Composition {

		public Composition(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.compose(right);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Join extends org.rascalmpl.ast.Expression.Join {

		public Join(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.join(right);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}

	static public class LessThanOrEq extends org.rascalmpl.ast.Expression.LessThanOrEq {

		public LessThanOrEq(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.lessThanOrEqual(right);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Bracket extends org.rascalmpl.ast.Expression.Bracket {

		public Bracket(INode __param1, org.rascalmpl.ast.Expression __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return this.getExpression().__evaluate(__eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return this.getExpression().__evaluate(__eval);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getExpression().__evaluate(__eval);

		}

	}

	static public class IfDefinedOtherwise extends org.rascalmpl.ast.Expression.IfDefinedOtherwise {

		public IfDefinedOtherwise(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			try {
				return this.getLhs().__evaluate(__eval);
			} catch (UninitializedVariableError e) {
				return this.getRhs().__evaluate(__eval);
			} catch (Throw e) {
				// TODO For now we __evaluate any Throw here, restrict to
				// NoSuchKey and NoSuchAnno?
				return this.getRhs().__evaluate(__eval);
			}

		}

	}

	static public class Literal extends org.rascalmpl.ast.Expression.Literal {

		public Literal(INode __param1, org.rascalmpl.ast.Literal __param2) {
			super(__param1, __param2);
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			return this.getLiteral().__evaluate(__eval);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			if (this.getLiteral().isBoolean()) {
				return new BasicBooleanResult(__eval.__getCtx(), this);
			}
			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return this.getLiteral().__evaluate(__eval);

		}

	}

	static public class Product extends org.rascalmpl.ast.Expression.Product {

		public Product(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.multiply(right);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Ambiguity extends org.rascalmpl.ast.Expression.Ambiguity {

		public Ambiguity(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new ImplementationError("Ambiguity in expression: " + this);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new Ambiguous((IConstructor) this.getTree());

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			throw new Ambiguous((IConstructor) this.getTree());

		}

	}

	static public class Division extends org.rascalmpl.ast.Expression.Division {

		public Division(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.divide(right);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			throw new UnexpectedTypeError(__eval.__getTf().boolType(), this.__evaluate(__eval.__getCtx().getEvaluator()).getType(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class NonEmptyBlock extends org.rascalmpl.ast.Expression.NonEmptyBlock {

		public NonEmptyBlock(INode __param1, java.util.List<Statement> __param2) {
			super(__param1, __param2);
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			ASTFactory factory = org.rascalmpl.ast.ASTFactoryFactory.getASTFactory();
			return factory.makeStatementNonEmptyBlock(this.getTree(), factory.makeLabelEmpty(this.getTree()), this.getStatements()).__evaluate(__eval);

		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

	}

	static public class Any extends org.rascalmpl.ast.Expression.Any {

		public Any(INode __param1, java.util.List<org.rascalmpl.ast.Expression> __param2) {
			super(__param1, __param2);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result __evaluate(Evaluator __eval) {

			java.util.List<org.rascalmpl.ast.Expression> generators = this.getGenerators();
			int size = generators.size();
			IBooleanResult[] gens = new IBooleanResult[size];

			int i = 0;
			gens[0] = __eval.makeBooleanResult(generators.get(0));
			gens[0].init();
			while (i >= 0 && i < size) {
				if (__eval.__getInterrupt())
					throw new InterruptException(__eval.getStackTrace());
				if (gens[i].hasNext() && gens[i].next()) {
					if (i == size - 1) {
						return new BoolResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(true), __eval);
					}

					i++;
					gens[i] = __eval.makeBooleanResult(generators.get(i));
					gens[i].init();
				} else {
					i--;
				}
			}
			return new BoolResult(org.rascalmpl.interpreter.Evaluator.__getTf().boolType(), __eval.__getVf().bool(false), __eval);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class Equivalence extends org.rascalmpl.ast.Expression.Equivalence {

		public Equivalence(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			return __eval.evalBooleanExpression(this);

		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new EquivalenceResult(__eval.__getCtx(), this.getLhs().__evaluate(__eval), this.getRhs().__evaluate(__eval));

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}

	static public class NonEquals extends org.rascalmpl.ast.Expression.NonEquals {

		public NonEquals(INode __param1, org.rascalmpl.ast.Expression __param2, org.rascalmpl.ast.Expression __param3) {
			super(__param1, __param2, __param3);
		}

		@Override
		public <T> T __evaluate(NullASTVisitor<T> __eval) {
			return null;
		}

		@Override
		public IBooleanResult __evaluate(BooleanEvaluator __eval) {

			return new BasicBooleanResult(__eval.__getCtx(), this);

		}

		@Override
		public Result<IValue> __evaluate(Evaluator __eval) {

			Result<IValue> left = this.getLhs().__evaluate(__eval);
			Result<IValue> right = this.getRhs().__evaluate(__eval);
			return left.nonEquals(right);

		}

		@Override
		public IMatchingResult __evaluate(PatternEvaluator __eval) {

			throw new UnsupportedPatternError(this.toString(), this);

		}

	}
}