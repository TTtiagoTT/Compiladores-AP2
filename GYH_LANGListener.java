// Generated from GYH_LANG.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GYH_LANGParser}.
 */
public interface GYH_LANGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GYH_LANGParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GYH_LANGParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(GYH_LANGParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(GYH_LANGParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GYH_LANGParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GYH_LANGParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(GYH_LANGParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(GYH_LANGParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GYH_LANGParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GYH_LANGParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GYH_LANGParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GYH_LANGParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GYH_LANGParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GYH_LANGParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYH_LANGParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(GYH_LANGParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYH_LANGParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(GYH_LANGParser.TermoAritmeticoContext ctx);
}