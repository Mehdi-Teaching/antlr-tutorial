// Generated from Math.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MathParser}.
 */
public interface MathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MathParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(MathParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(MathParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MathParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MathParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MathParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MathParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MathParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MathParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MathParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MathParser.OperatorContext ctx);
}