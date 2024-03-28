// $ANTLR 3.5.3 DL.g 2024-02-25 16:03:23

package in.ac.iitm.cse.parser.dl;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "ALL", "AND", "B", 
		"BLOCK", "BRACHMAN_DL", "C", "COMMENT", "CONCEPT", "CONSTANT", "D", "DIV", 
		"E", "EQUIVALENT_TO", "ESC_SEQ", "EXISTS", "EXPONENT", "F", "FILLS", "FLOAT", 
		"G", "H", "HEX_DIGIT", "I", "INSTANCE_OF", "INTEGER", "J", "K", "L", "M", 
		"MOD", "MUL", "N", "NAME", "NEG", "O", "OCTAL_ESC", "P", "Q", "R", "ROLE", 
		"S", "STRING", "SUB", "SUBSUMED_BY", "T", "U", "UNICODE_ESC", "V", "W", 
		"WS", "X", "Y", "Z", "'('", "')'", "','", "':'", "';'", "'['", "']'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int A=4;
	public static final int ADD=5;
	public static final int ALL=6;
	public static final int AND=7;
	public static final int B=8;
	public static final int BLOCK=9;
	public static final int BRACHMAN_DL=10;
	public static final int C=11;
	public static final int COMMENT=12;
	public static final int CONCEPT=13;
	public static final int CONSTANT=14;
	public static final int D=15;
	public static final int DIV=16;
	public static final int E=17;
	public static final int EQUIVALENT_TO=18;
	public static final int ESC_SEQ=19;
	public static final int EXISTS=20;
	public static final int EXPONENT=21;
	public static final int F=22;
	public static final int FILLS=23;
	public static final int FLOAT=24;
	public static final int G=25;
	public static final int H=26;
	public static final int HEX_DIGIT=27;
	public static final int I=28;
	public static final int INSTANCE_OF=29;
	public static final int INTEGER=30;
	public static final int J=31;
	public static final int K=32;
	public static final int L=33;
	public static final int M=34;
	public static final int MOD=35;
	public static final int MUL=36;
	public static final int N=37;
	public static final int NAME=38;
	public static final int NEG=39;
	public static final int O=40;
	public static final int OCTAL_ESC=41;
	public static final int P=42;
	public static final int Q=43;
	public static final int R=44;
	public static final int ROLE=45;
	public static final int S=46;
	public static final int STRING=47;
	public static final int SUB=48;
	public static final int SUBSUMED_BY=49;
	public static final int T=50;
	public static final int U=51;
	public static final int UNICODE_ESC=52;
	public static final int V=53;
	public static final int W=54;
	public static final int WS=55;
	public static final int X=56;
	public static final int Y=57;
	public static final int Z=58;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "DL.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// DL.g:116:1
	public final DLParser.cunit_return cunit() throws RecognitionException {
		DLParser.cunit_return retval = new DLParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope sentence1 =null;

		AST EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// DL.g:116:13
			// DL.g:116:17
			{
			// DL.g:116:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONSTANT||LA1_0==FLOAT||LA1_0==INTEGER||LA1_0==NAME||LA1_0==STRING||(LA1_0 >= 63 && LA1_0 <= 64)||LA1_0==66) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// DL.g:116:17
					{
					pushFollow(FOLLOW_sentence_in_cunit152);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit155);  
			stream_EOF.add(EOF2);


			// AST REWRITE
			// elements: sentence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 116:31: -> ^( BRACHMAN_DL ( sentence )* )
			{
				// DL.g:116:34
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(BRACHMAN_DL, "BRACHMAN_DL"), root_1);
				// DL.g:116:48
				while ( stream_sentence.hasNext() ) {
					adaptor.addChild(root_1, stream_sentence.nextTree());
				}
				stream_sentence.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cunit"


	public static class sentence_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "sentence"
	// DL.g:118:1
	public final DLParser.sentence_return sentence() throws RecognitionException {
		DLParser.sentence_return retval = new DLParser.sentence_return();
		retval.start = input.LT(1);
		int sentence_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal3=null;
		Token char_literal5=null;
		Token char_literal7=null;
		ParserRuleReturnScope formula4 =null;
		ParserRuleReturnScope sentence6 =null;

		AST t_tree=null;
		AST char_literal3_tree=null;
		AST char_literal5_tree=null;
		AST char_literal7_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// DL.g:118:13
			int alt3=3;
			switch ( input.LA(1) ) {
			case 63:
				{
				alt3=1;
				}
				break;
			case CONSTANT:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case 64:
				{
				alt3=2;
				}
				break;
			case 66:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// DL.g:118:16
					{
					root_0 = (AST)adaptor.nil();


					char_literal3=(Token)match(input,63,FOLLOW_63_in_sentence177); 
					}
					break;
				case 2 :
					// DL.g:119:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_formula_in_sentence196);
					formula4=formula();
					state._fsp--;

					adaptor.addChild(root_0, formula4.getTree());

					char_literal5=(Token)match(input,63,FOLLOW_63_in_sentence198); 
					}
					break;
				case 3 :
					// DL.g:120:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,66,FOLLOW_66_in_sentence219); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,BLOCK); 
					// DL.g:120:47
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==CONSTANT||LA2_0==FLOAT||LA2_0==INTEGER||LA2_0==NAME||LA2_0==STRING||(LA2_0 >= 63 && LA2_0 <= 64)||LA2_0==66) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// DL.g:120:47
							{
							pushFollow(FOLLOW_sentence_in_sentence224);
							sentence6=sentence();
							state._fsp--;

							adaptor.addChild(root_0, sentence6.getTree());

							}
							break;

						default :
							break loop2;
						}
					}

					char_literal7=(Token)match(input,67,FOLLOW_67_in_sentence227); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sentence"


	public static class formula_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "formula"
	// DL.g:123:1
	public final DLParser.formula_return formula() throws RecognitionException {
		DLParser.formula_return retval = new DLParser.formula_return();
		retval.start = input.LT(1);
		int formula_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope conceptExpr8 =null;
		ParserRuleReturnScope instanceOf9 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// DL.g:123:13
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==NAME||LA4_0==64) ) {
				alt4=1;
			}
			else if ( (LA4_0==CONSTANT||LA4_0==FLOAT||LA4_0==INTEGER||LA4_0==STRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// DL.g:123:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_conceptExpr_in_formula255);
					conceptExpr8=conceptExpr();
					state._fsp--;

					adaptor.addChild(root_0, conceptExpr8.getTree());

					}
					break;
				case 2 :
					// DL.g:124:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_formula273);
					instanceOf9=instanceOf();
					state._fsp--;

					adaptor.addChild(root_0, instanceOf9.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formula"


	public static class conceptExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conceptExpr"
	// DL.g:127:1
	public final DLParser.conceptExpr_return conceptExpr() throws RecognitionException {
		DLParser.conceptExpr_return retval = new DLParser.conceptExpr_return();
		retval.start = input.LT(1);
		int conceptExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope concept10 =null;
		ParserRuleReturnScope ropr11 =null;
		ParserRuleReturnScope concept12 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// DL.g:127:13
			// DL.g:127:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_concept_in_conceptExpr296);
			concept10=concept();
			state._fsp--;

			adaptor.addChild(root_0, concept10.getTree());

			pushFollow(FOLLOW_ropr_in_conceptExpr298);
			ropr11=ropr();
			state._fsp--;

			root_0 = (AST)adaptor.becomeRoot(ropr11.getTree(), root_0);
			pushFollow(FOLLOW_concept_in_conceptExpr301);
			concept12=concept();
			state._fsp--;

			adaptor.addChild(root_0, concept12.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conceptExpr"


	public static class instanceOf_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// DL.g:129:1
	public final DLParser.instanceOf_return instanceOf() throws RecognitionException {
		DLParser.instanceOf_return retval = new DLParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal14=null;
		Token INSTANCE_OF16=null;
		ParserRuleReturnScope symbol13 =null;
		ParserRuleReturnScope symbol15 =null;
		ParserRuleReturnScope concept17 =null;

		AST char_literal14_tree=null;
		AST INSTANCE_OF16_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_INSTANCE_OF=new RewriteRuleTokenStream(adaptor,"token INSTANCE_OF");
		RewriteRuleSubtreeStream stream_symbol=new RewriteRuleSubtreeStream(adaptor,"rule symbol");
		RewriteRuleSubtreeStream stream_concept=new RewriteRuleSubtreeStream(adaptor,"rule concept");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// DL.g:129:13
			// DL.g:129:17
			{
			pushFollow(FOLLOW_symbol_in_instanceOf313);
			symbol13=symbol();
			state._fsp--;

			stream_symbol.add(symbol13.getTree());
			// DL.g:129:24
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==61) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// DL.g:129:25
					{
					char_literal14=(Token)match(input,61,FOLLOW_61_in_instanceOf316);  
					stream_61.add(char_literal14);

					pushFollow(FOLLOW_symbol_in_instanceOf318);
					symbol15=symbol();
					state._fsp--;

					stream_symbol.add(symbol15.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			INSTANCE_OF16=(Token)match(input,INSTANCE_OF,FOLLOW_INSTANCE_OF_in_instanceOf322);  
			stream_INSTANCE_OF.add(INSTANCE_OF16);

			pushFollow(FOLLOW_concept_in_instanceOf324);
			concept17=concept();
			state._fsp--;

			stream_concept.add(concept17.getTree());

			// AST REWRITE
			// elements: INSTANCE_OF, concept, symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 130:17: -> ( ^( INSTANCE_OF symbol concept ) )+
			{
				if ( !(stream_INSTANCE_OF.hasNext()||stream_concept.hasNext()||stream_symbol.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_INSTANCE_OF.hasNext()||stream_concept.hasNext()||stream_symbol.hasNext() ) {
					// DL.g:130:20
					{
					AST root_1 = (AST)adaptor.nil();
					root_1 = (AST)adaptor.becomeRoot(stream_INSTANCE_OF.nextNode(), root_1);
					adaptor.addChild(root_1, stream_symbol.nextTree());
					adaptor.addChild(root_1, stream_concept.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_INSTANCE_OF.reset();
				stream_concept.reset();
				stream_symbol.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class symbol_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "symbol"
	// DL.g:133:1
	public final DLParser.symbol_return symbol() throws RecognitionException {
		DLParser.symbol_return retval = new DLParser.symbol_return();
		retval.start = input.LT(1);
		int symbol_StartIndex = input.index();

		AST root_0 = null;

		Token set18=null;

		AST set18_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// DL.g:133:13
			// DL.g:
			{
			root_0 = (AST)adaptor.nil();


			set18=input.LT(1);
			if ( input.LA(1)==CONSTANT||input.LA(1)==FLOAT||input.LA(1)==INTEGER||input.LA(1)==STRING ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set18));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "symbol"


	public static class concept_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "concept"
	// DL.g:139:1
	public final DLParser.concept_return concept() throws RecognitionException {
		DLParser.concept_return retval = new DLParser.concept_return();
		retval.start = input.LT(1);
		int concept_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal19=null;
		Token FILLS20=null;
		Token char_literal23=null;
		Token char_literal24=null;
		Token ALL25=null;
		Token char_literal28=null;
		Token char_literal29=null;
		Token EXISTS30=null;
		Token INTEGER31=null;
		Token char_literal33=null;
		Token char_literal34=null;
		Token AND35=null;
		Token char_literal38=null;
		ParserRuleReturnScope role21 =null;
		ParserRuleReturnScope constant22 =null;
		ParserRuleReturnScope role26 =null;
		ParserRuleReturnScope concept27 =null;
		ParserRuleReturnScope role32 =null;
		ParserRuleReturnScope concept36 =null;
		ParserRuleReturnScope concept37 =null;

		AST t_tree=null;
		AST char_literal19_tree=null;
		AST FILLS20_tree=null;
		AST char_literal23_tree=null;
		AST char_literal24_tree=null;
		AST ALL25_tree=null;
		AST char_literal28_tree=null;
		AST char_literal29_tree=null;
		AST EXISTS30_tree=null;
		AST INTEGER31_tree=null;
		AST char_literal33_tree=null;
		AST char_literal34_tree=null;
		AST AND35_tree=null;
		AST char_literal38_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// DL.g:141:13
			int alt7=5;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==NAME) ) {
				alt7=1;
			}
			else if ( (LA7_0==64) ) {
				switch ( input.LA(2) ) {
				case FILLS:
					{
					alt7=2;
					}
					break;
				case ALL:
					{
					alt7=3;
					}
					break;
				case EXISTS:
					{
					alt7=4;
					}
					break;
				case AND:
					{
					alt7=5;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// DL.g:141:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_concept477); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,CONCEPT); 
					}
					break;
				case 2 :
					// DL.g:142:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal19=(Token)match(input,64,FOLLOW_64_in_concept497); 
					FILLS20=(Token)match(input,FILLS,FOLLOW_FILLS_in_concept500); 
					FILLS20_tree = (AST)adaptor.create(FILLS20);
					root_0 = (AST)adaptor.becomeRoot(FILLS20_tree, root_0);

					pushFollow(FOLLOW_role_in_concept504);
					role21=role();
					state._fsp--;

					adaptor.addChild(root_0, role21.getTree());

					pushFollow(FOLLOW_constant_in_concept506);
					constant22=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant22.getTree());

					char_literal23=(Token)match(input,65,FOLLOW_65_in_concept511); 
					}
					break;
				case 3 :
					// DL.g:143:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal24=(Token)match(input,64,FOLLOW_64_in_concept530); 
					ALL25=(Token)match(input,ALL,FOLLOW_ALL_in_concept533); 
					ALL25_tree = (AST)adaptor.create(ALL25);
					root_0 = (AST)adaptor.becomeRoot(ALL25_tree, root_0);

					pushFollow(FOLLOW_role_in_concept539);
					role26=role();
					state._fsp--;

					adaptor.addChild(root_0, role26.getTree());

					pushFollow(FOLLOW_concept_in_concept541);
					concept27=concept();
					state._fsp--;

					adaptor.addChild(root_0, concept27.getTree());

					char_literal28=(Token)match(input,65,FOLLOW_65_in_concept547); 
					}
					break;
				case 4 :
					// DL.g:144:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal29=(Token)match(input,64,FOLLOW_64_in_concept566); 
					EXISTS30=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_concept569); 
					EXISTS30_tree = (AST)adaptor.create(EXISTS30);
					root_0 = (AST)adaptor.becomeRoot(EXISTS30_tree, root_0);

					INTEGER31=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_concept572); 
					INTEGER31_tree = (AST)adaptor.create(INTEGER31);
					adaptor.addChild(root_0, INTEGER31_tree);

					pushFollow(FOLLOW_role_in_concept574);
					role32=role();
					state._fsp--;

					adaptor.addChild(root_0, role32.getTree());

					char_literal33=(Token)match(input,65,FOLLOW_65_in_concept580); 
					}
					break;
				case 5 :
					// DL.g:145:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal34=(Token)match(input,64,FOLLOW_64_in_concept599); 
					AND35=(Token)match(input,AND,FOLLOW_AND_in_concept602); 
					AND35_tree = (AST)adaptor.create(AND35);
					root_0 = (AST)adaptor.becomeRoot(AND35_tree, root_0);

					pushFollow(FOLLOW_concept_in_concept608);
					concept36=concept();
					state._fsp--;

					adaptor.addChild(root_0, concept36.getTree());

					// DL.g:145:38
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==NAME||LA6_0==64) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// DL.g:145:38
							{
							pushFollow(FOLLOW_concept_in_concept610);
							concept37=concept();
							state._fsp--;

							adaptor.addChild(root_0, concept37.getTree());

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					char_literal38=(Token)match(input,65,FOLLOW_65_in_concept613); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concept"


	public static class role_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "role"
	// DL.g:148:1
	public final DLParser.role_return role() throws RecognitionException {
		DLParser.role_return retval = new DLParser.role_return();
		retval.start = input.LT(1);
		int role_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal39=null;

		AST t_tree=null;
		AST char_literal39_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// DL.g:148:13
			// DL.g:148:17
			{
			root_0 = (AST)adaptor.nil();


			char_literal39=(Token)match(input,62,FOLLOW_62_in_role644); 
			t=(Token)match(input,NAME,FOLLOW_NAME_in_role649); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,ROLE); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "role"


	public static class constant_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// DL.g:150:1
	public final DLParser.constant_return constant() throws RecognitionException {
		DLParser.constant_return retval = new DLParser.constant_return();
		retval.start = input.LT(1);
		int constant_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulExpr40 =null;
		ParserRuleReturnScope opr141 =null;
		ParserRuleReturnScope mulExpr42 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// DL.g:150:13
			// DL.g:150:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_constant664);
			mulExpr40=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr40.getTree());

			// DL.g:150:25
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ADD||LA8_0==SUB) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// DL.g:150:26
					{
					pushFollow(FOLLOW_opr1_in_constant667);
					opr141=opr1();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr141.getTree(), root_0);
					pushFollow(FOLLOW_mulExpr_in_constant670);
					mulExpr42=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr42.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class mulExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// DL.g:151:1
	public final DLParser.mulExpr_return mulExpr() throws RecognitionException {
		DLParser.mulExpr_return retval = new DLParser.mulExpr_return();
		retval.start = input.LT(1);
		int mulExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negExpr43 =null;
		ParserRuleReturnScope opr244 =null;
		ParserRuleReturnScope negExpr45 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// DL.g:151:13
			// DL.g:151:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negExpr_in_mulExpr686);
			negExpr43=negExpr();
			state._fsp--;

			adaptor.addChild(root_0, negExpr43.getTree());

			// DL.g:151:25
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIV||(LA9_0 >= MOD && LA9_0 <= MUL)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// DL.g:151:26
					{
					pushFollow(FOLLOW_opr2_in_mulExpr689);
					opr244=opr2();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr244.getTree(), root_0);
					pushFollow(FOLLOW_negExpr_in_mulExpr692);
					negExpr45=negExpr();
					state._fsp--;

					adaptor.addChild(root_0, negExpr45.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class negExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "negExpr"
	// DL.g:152:1
	public final DLParser.negExpr_return negExpr() throws RecognitionException {
		DLParser.negExpr_return retval = new DLParser.negExpr_return();
		retval.start = input.LT(1);
		int negExpr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atom46 =null;
		ParserRuleReturnScope atom47 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// DL.g:152:13
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==CONSTANT||LA10_0==FLOAT||LA10_0==INTEGER||LA10_0==STRING||LA10_0==59) ) {
				alt10=1;
			}
			else if ( (LA10_0==SUB) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// DL.g:152:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_negExpr708);
					atom46=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom46.getTree());

					}
					break;
				case 2 :
					// DL.g:153:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_negExpr728); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NEG); 
					pushFollow(FOLLOW_atom_in_negExpr733);
					atom47=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negExpr"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// DL.g:155:1
	public final DLParser.atom_return atom() throws RecognitionException {
		DLParser.atom_return retval = new DLParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token CONSTANT48=null;
		Token STRING49=null;
		Token INTEGER50=null;
		Token FLOAT51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope constant53 =null;

		AST CONSTANT48_tree=null;
		AST STRING49_tree=null;
		AST INTEGER50_tree=null;
		AST FLOAT51_tree=null;
		AST char_literal52_tree=null;
		AST char_literal54_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// DL.g:155:13
			int alt11=5;
			switch ( input.LA(1) ) {
			case CONSTANT:
				{
				alt11=1;
				}
				break;
			case STRING:
				{
				alt11=2;
				}
				break;
			case INTEGER:
				{
				alt11=3;
				}
				break;
			case FLOAT:
				{
				alt11=4;
				}
				break;
			case 59:
				{
				alt11=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// DL.g:155:17
					{
					root_0 = (AST)adaptor.nil();


					CONSTANT48=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom762); 
					CONSTANT48_tree = (AST)adaptor.create(CONSTANT48);
					adaptor.addChild(root_0, CONSTANT48_tree);

					}
					break;
				case 2 :
					// DL.g:156:17
					{
					root_0 = (AST)adaptor.nil();


					STRING49=(Token)match(input,STRING,FOLLOW_STRING_in_atom780); 
					STRING49_tree = (AST)adaptor.create(STRING49);
					adaptor.addChild(root_0, STRING49_tree);

					}
					break;
				case 3 :
					// DL.g:157:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER50=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom798); 
					INTEGER50_tree = (AST)adaptor.create(INTEGER50);
					adaptor.addChild(root_0, INTEGER50_tree);

					}
					break;
				case 4 :
					// DL.g:158:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT51=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atom816); 
					FLOAT51_tree = (AST)adaptor.create(FLOAT51);
					adaptor.addChild(root_0, FLOAT51_tree);

					}
					break;
				case 5 :
					// DL.g:159:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal52=(Token)match(input,59,FOLLOW_59_in_atom834); 
					pushFollow(FOLLOW_constant_in_atom837);
					constant53=constant();
					state._fsp--;

					adaptor.addChild(root_0, constant53.getTree());

					char_literal54=(Token)match(input,60,FOLLOW_60_in_atom839); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class ropr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "ropr"
	// DL.g:162:1
	public final DLParser.ropr_return ropr() throws RecognitionException {
		DLParser.ropr_return retval = new DLParser.ropr_return();
		retval.start = input.LT(1);
		int ropr_StartIndex = input.index();

		AST root_0 = null;

		Token set55=null;

		AST set55_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// DL.g:162:13
			// DL.g:
			{
			root_0 = (AST)adaptor.nil();


			set55=input.LT(1);
			if ( input.LA(1)==EQUIVALENT_TO||input.LA(1)==SUBSUMED_BY ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set55));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ropr"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// DL.g:163:1
	public final DLParser.opr1_return opr1() throws RecognitionException {
		DLParser.opr1_return retval = new DLParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token set56=null;

		AST set56_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// DL.g:163:13
			// DL.g:
			{
			root_0 = (AST)adaptor.nil();


			set56=input.LT(1);
			if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set56));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "opr1"


	public static class opr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr2"
	// DL.g:164:1
	public final DLParser.opr2_return opr2() throws RecognitionException {
		DLParser.opr2_return retval = new DLParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token set57=null;

		AST set57_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// DL.g:164:13
			// DL.g:
			{
			root_0 = (AST)adaptor.nil();


			set57=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set57));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "opr2"

	// Delegated rules



	public static final BitSet FOLLOW_sentence_in_cunit152 = new BitSet(new long[]{0x8000804041004000L,0x0000000000000005L});
	public static final BitSet FOLLOW_EOF_in_cunit155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_sentence177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_sentence196 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_sentence198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_sentence219 = new BitSet(new long[]{0x8000804041004000L,0x000000000000000DL});
	public static final BitSet FOLLOW_sentence_in_sentence224 = new BitSet(new long[]{0x8000804041004000L,0x000000000000000DL});
	public static final BitSet FOLLOW_67_in_sentence227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conceptExpr_in_formula255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_formula273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concept_in_conceptExpr296 = new BitSet(new long[]{0x0002000000040000L});
	public static final BitSet FOLLOW_ropr_in_conceptExpr298 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_concept_in_conceptExpr301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_in_instanceOf313 = new BitSet(new long[]{0x2000000020000000L});
	public static final BitSet FOLLOW_61_in_instanceOf316 = new BitSet(new long[]{0x0000800041004000L});
	public static final BitSet FOLLOW_symbol_in_instanceOf318 = new BitSet(new long[]{0x2000000020000000L});
	public static final BitSet FOLLOW_INSTANCE_OF_in_instanceOf322 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_concept_in_instanceOf324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_concept477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_concept497 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_FILLS_in_concept500 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_role_in_concept504 = new BitSet(new long[]{0x0801800041004000L});
	public static final BitSet FOLLOW_constant_in_concept506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_concept511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_concept530 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ALL_in_concept533 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_role_in_concept539 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_concept_in_concept541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_concept547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_concept566 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_EXISTS_in_concept569 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_INTEGER_in_concept572 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_role_in_concept574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_concept580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_concept599 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_AND_in_concept602 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_concept_in_concept608 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_concept_in_concept610 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000003L});
	public static final BitSet FOLLOW_65_in_concept613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_role644 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_NAME_in_role649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_constant664 = new BitSet(new long[]{0x0001000000000022L});
	public static final BitSet FOLLOW_opr1_in_constant667 = new BitSet(new long[]{0x0801800041004000L});
	public static final BitSet FOLLOW_mulExpr_in_constant670 = new BitSet(new long[]{0x0001000000000022L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr686 = new BitSet(new long[]{0x0000001800010002L});
	public static final BitSet FOLLOW_opr2_in_mulExpr689 = new BitSet(new long[]{0x0801800041004000L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr692 = new BitSet(new long[]{0x0000001800010002L});
	public static final BitSet FOLLOW_atom_in_negExpr708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_negExpr728 = new BitSet(new long[]{0x0800800041004000L});
	public static final BitSet FOLLOW_atom_in_negExpr733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_atom762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atom798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atom816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_atom834 = new BitSet(new long[]{0x0801800041004000L});
	public static final BitSet FOLLOW_constant_in_atom837 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_atom839 = new BitSet(new long[]{0x0000000000000002L});
}
