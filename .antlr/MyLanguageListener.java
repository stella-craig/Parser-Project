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
	 * Enter a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLanguageParser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link MyLanguageParser#array_begin}.
	 * @param ctx the parse tree
	 */
	void enterArray_begin(MyLanguageParser.Array_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#array_begin}.
	 * @param ctx the parse tree
	 */
	void exitArray_begin(MyLanguageParser.Array_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#continue_array}.
	 * @param ctx the parse tree
	 */
	void enterContinue_array(MyLanguageParser.Continue_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#continue_array}.
	 * @param ctx the parse tree
	 */
	void exitContinue_array(MyLanguageParser.Continue_arrayContext ctx);
}