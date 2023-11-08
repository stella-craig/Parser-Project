// Generated from c:/Users/mayab/OneDrive - University of Missouri/Desktop/Coding Projects/School/Principles_of_Programming_Language/Parser-Project/MyLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MyLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MyLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MyLanguageParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MyLanguageParser.LiteralContext ctx);
}