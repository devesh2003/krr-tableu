// $ANTLR 3.5.3 FOL.g 2024-02-25 16:03:24

package in.ac.iitm.cse.parser.fol;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class FOLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "AND", "B", "BLOCK", 
		"C", "COMMENT", "CONS", "CONSTANT", "D", "DIV", "E", "EQ", "ESC_SEQ", 
		"EXACTLY_ONE", "EXISTS", "EXPONENT", "F", "FALSE", "FLOAT", "FOL", "FORALL", 
		"FUNCTION", "G", "GE", "GT", "H", "HEX_DIGIT", "I", "IFF", "IMPLIED_BY", 
		"IMPLIES", "INTEGER", "J", "K", "L", "LE", "LT", "M", "MOD", "MUL", "N", 
		"NAME", "NE", "NEG", "NIL", "NOT", "O", "OCTAL_ESC", "OR", "P", "PREDICATE", 
		"Q", "R", "S", "STRING", "SUB", "T", "TRUE", "U", "UNICODE_ESC", "V", 
		"VARIABLE", "VAR_LIST", "W", "WS", "WS_2", "X", "Y", "Z", "'('", "')'", 
		"','", "';'", "'['", "']'", "'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int A=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int B=7;
	public static final int BLOCK=8;
	public static final int C=9;
	public static final int COMMENT=10;
	public static final int CONS=11;
	public static final int CONSTANT=12;
	public static final int D=13;
	public static final int DIV=14;
	public static final int E=15;
	public static final int EQ=16;
	public static final int ESC_SEQ=17;
	public static final int EXACTLY_ONE=18;
	public static final int EXISTS=19;
	public static final int EXPONENT=20;
	public static final int F=21;
	public static final int FALSE=22;
	public static final int FLOAT=23;
	public static final int FOL=24;
	public static final int FORALL=25;
	public static final int FUNCTION=26;
	public static final int G=27;
	public static final int GE=28;
	public static final int GT=29;
	public static final int H=30;
	public static final int HEX_DIGIT=31;
	public static final int I=32;
	public static final int IFF=33;
	public static final int IMPLIED_BY=34;
	public static final int IMPLIES=35;
	public static final int INTEGER=36;
	public static final int J=37;
	public static final int K=38;
	public static final int L=39;
	public static final int LE=40;
	public static final int LT=41;
	public static final int M=42;
	public static final int MOD=43;
	public static final int MUL=44;
	public static final int N=45;
	public static final int NAME=46;
	public static final int NE=47;
	public static final int NEG=48;
	public static final int NIL=49;
	public static final int NOT=50;
	public static final int O=51;
	public static final int OCTAL_ESC=52;
	public static final int OR=53;
	public static final int P=54;
	public static final int PREDICATE=55;
	public static final int Q=56;
	public static final int R=57;
	public static final int S=58;
	public static final int STRING=59;
	public static final int SUB=60;
	public static final int T=61;
	public static final int TRUE=62;
	public static final int U=63;
	public static final int UNICODE_ESC=64;
	public static final int V=65;
	public static final int VARIABLE=66;
	public static final int VAR_LIST=67;
	public static final int W=68;
	public static final int WS=69;
	public static final int WS_2=70;
	public static final int X=71;
	public static final int Y=72;
	public static final int Z=73;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public FOLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public FOLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[24+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return FOLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "FOL.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// FOL.g:160:1
	public final FOLParser.cunit_return cunit() throws RecognitionException {
		FOLParser.cunit_return retval = new FOLParser.cunit_return();
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

			// FOL.g:160:13
			// FOL.g:160:17
			{
			// FOL.g:160:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= EXACTLY_ONE && LA1_0 <= EXISTS)||(LA1_0 >= FALSE && LA1_0 <= FLOAT)||LA1_0==FORALL||LA1_0==INTEGER||LA1_0==NAME||LA1_0==NOT||(LA1_0 >= STRING && LA1_0 <= SUB)||LA1_0==TRUE||LA1_0==VARIABLE||LA1_0==74||(LA1_0 >= 77 && LA1_0 <= 78)||LA1_0==80) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// FOL.g:160:17
					{
					pushFollow(FOLLOW_sentence_in_cunit188);
					sentence1=sentence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit191); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);


			// AST REWRITE
			// elements: sentence
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 160:31: -> ^( FOL ( sentence )* )
			{
				// FOL.g:160:34
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FOL, "FOL"), root_1);
				// FOL.g:160:40
				while ( stream_sentence.hasNext() ) {
					adaptor.addChild(root_1, stream_sentence.nextTree());
				}
				stream_sentence.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, cunit_StartIndex); }

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
	// FOL.g:166:1
	public final FOLParser.sentence_return sentence() throws RecognitionException {
		FOLParser.sentence_return retval = new FOLParser.sentence_return();
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

			// FOL.g:166:13
			int alt3=3;
			switch ( input.LA(1) ) {
			case 77:
				{
				alt3=1;
				}
				break;
			case EXACTLY_ONE:
			case EXISTS:
			case FALSE:
			case FLOAT:
			case FORALL:
			case INTEGER:
			case NAME:
			case NOT:
			case STRING:
			case SUB:
			case TRUE:
			case VARIABLE:
			case 74:
			case 78:
				{
				alt3=2;
				}
				break;
			case 80:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// FOL.g:166:16
					{
					root_0 = (AST)adaptor.nil();


					char_literal3=(Token)match(input,77,FOLLOW_77_in_sentence217); if (state.failed) return retval;
					}
					break;
				case 2 :
					// FOL.g:167:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_formula_in_sentence236);
					formula4=formula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formula4.getTree());

					char_literal5=(Token)match(input,77,FOLLOW_77_in_sentence238); if (state.failed) return retval;
					}
					break;
				case 3 :
					// FOL.g:168:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_sentence259); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,BLOCK); }
					// FOL.g:168:47
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= EXACTLY_ONE && LA2_0 <= EXISTS)||(LA2_0 >= FALSE && LA2_0 <= FLOAT)||LA2_0==FORALL||LA2_0==INTEGER||LA2_0==NAME||LA2_0==NOT||(LA2_0 >= STRING && LA2_0 <= SUB)||LA2_0==TRUE||LA2_0==VARIABLE||LA2_0==74||(LA2_0 >= 77 && LA2_0 <= 78)||LA2_0==80) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// FOL.g:168:47
							{
							pushFollow(FOLLOW_sentence_in_sentence264);
							sentence6=sentence();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sentence6.getTree());

							}
							break;

						default :
							break loop2;
						}
					}

					char_literal7=(Token)match(input,82,FOLLOW_82_in_sentence267); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, sentence_StartIndex); }

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
	// FOL.g:171:1
	public final FOLParser.formula_return formula() throws RecognitionException {
		FOLParser.formula_return retval = new FOLParser.formula_return();
		retval.start = input.LT(1);
		int formula_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope iffExpr8 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// FOL.g:171:17
			// FOL.g:171:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_iffExpr_in_formula299);
			iffExpr8=iffExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, iffExpr8.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, formula_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "formula"


	public static class iffExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "iffExpr"
	// FOL.g:172:1
	public final FOLParser.iffExpr_return iffExpr() throws RecognitionException {
		FOLParser.iffExpr_return retval = new FOLParser.iffExpr_return();
		retval.start = input.LT(1);
		int iffExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IFF10=null;
		ParserRuleReturnScope impliedByExpr9 =null;
		ParserRuleReturnScope iffExpr11 =null;

		AST IFF10_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// FOL.g:172:17
			// FOL.g:172:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_impliedByExpr_in_iffExpr317);
			impliedByExpr9=impliedByExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, impliedByExpr9.getTree());

			// FOL.g:172:35
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IFF) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// FOL.g:172:37
					{
					IFF10=(Token)match(input,IFF,FOLLOW_IFF_in_iffExpr321); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IFF10_tree = (AST)adaptor.create(IFF10);
					root_0 = (AST)adaptor.becomeRoot(IFF10_tree, root_0);
					}

					pushFollow(FOLLOW_iffExpr_in_iffExpr331);
					iffExpr11=iffExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, iffExpr11.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, iffExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "iffExpr"


	public static class impliedByExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "impliedByExpr"
	// FOL.g:173:1
	public final FOLParser.impliedByExpr_return impliedByExpr() throws RecognitionException {
		FOLParser.impliedByExpr_return retval = new FOLParser.impliedByExpr_return();
		retval.start = input.LT(1);
		int impliedByExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IMPLIED_BY13=null;
		ParserRuleReturnScope impliesExpr12 =null;
		ParserRuleReturnScope impliesExpr14 =null;

		AST IMPLIED_BY13_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// FOL.g:173:17
			// FOL.g:173:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_impliesExpr_in_impliedByExpr350);
			impliesExpr12=impliesExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, impliesExpr12.getTree());

			// FOL.g:173:35
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==IMPLIED_BY) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// FOL.g:173:37
					{
					IMPLIED_BY13=(Token)match(input,IMPLIED_BY,FOLLOW_IMPLIED_BY_in_impliedByExpr356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IMPLIED_BY13_tree = (AST)adaptor.create(IMPLIED_BY13);
					root_0 = (AST)adaptor.becomeRoot(IMPLIED_BY13_tree, root_0);
					}

					pushFollow(FOLLOW_impliesExpr_in_impliedByExpr359);
					impliesExpr14=impliesExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, impliesExpr14.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, impliedByExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "impliedByExpr"


	public static class impliesExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "impliesExpr"
	// FOL.g:174:1
	public final FOLParser.impliesExpr_return impliesExpr() throws RecognitionException {
		FOLParser.impliesExpr_return retval = new FOLParser.impliesExpr_return();
		retval.start = input.LT(1);
		int impliesExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IMPLIES16=null;
		ParserRuleReturnScope orExpr15 =null;
		ParserRuleReturnScope impliesExpr17 =null;

		AST IMPLIES16_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// FOL.g:174:17
			// FOL.g:174:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_orExpr_in_impliesExpr376);
			orExpr15=orExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpr15.getTree());

			// FOL.g:174:35
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IMPLIES) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// FOL.g:174:37
					{
					IMPLIES16=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_impliesExpr387); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IMPLIES16_tree = (AST)adaptor.create(IMPLIES16);
					root_0 = (AST)adaptor.becomeRoot(IMPLIES16_tree, root_0);
					}

					pushFollow(FOLLOW_impliesExpr_in_impliesExpr393);
					impliesExpr17=impliesExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, impliesExpr17.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, impliesExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "impliesExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// FOL.g:175:1
	public final FOLParser.orExpr_return orExpr() throws RecognitionException {
		FOLParser.orExpr_return retval = new FOLParser.orExpr_return();
		retval.start = input.LT(1);
		int orExpr_StartIndex = input.index();

		AST root_0 = null;

		Token OR19=null;
		ParserRuleReturnScope andExpr18 =null;
		ParserRuleReturnScope andExpr20 =null;

		AST OR19_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// FOL.g:175:17
			// FOL.g:175:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr415);
			andExpr18=andExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr18.getTree());

			// FOL.g:175:35
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==OR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// FOL.g:175:37
					{
					OR19=(Token)match(input,OR,FOLLOW_OR_in_orExpr425); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR19_tree = (AST)adaptor.create(OR19);
					root_0 = (AST)adaptor.becomeRoot(OR19_tree, root_0);
					}

					pushFollow(FOLLOW_andExpr_in_orExpr436);
					andExpr20=andExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr20.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, orExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// FOL.g:176:1
	public final FOLParser.andExpr_return andExpr() throws RecognitionException {
		FOLParser.andExpr_return retval = new FOLParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		AST root_0 = null;

		Token AND22=null;
		ParserRuleReturnScope atom21 =null;
		ParserRuleReturnScope atom23 =null;

		AST AND22_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// FOL.g:176:17
			// FOL.g:176:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_atom_in_andExpr461);
			atom21=atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atom21.getTree());

			// FOL.g:176:35
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// FOL.g:176:37
					{
					AND22=(Token)match(input,AND,FOLLOW_AND_in_andExpr474); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND22_tree = (AST)adaptor.create(AND22);
					root_0 = (AST)adaptor.becomeRoot(AND22_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_andExpr484);
					atom23=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom23.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, andExpr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "andExpr"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// FOL.g:178:1
	public final FOLParser.atom_return atom() throws RecognitionException {
		FOLParser.atom_return retval = new FOLParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token TRUE24=null;
		Token FALSE25=null;
		Token FORALL26=null;
		Token EXISTS29=null;
		Token EXACTLY_ONE32=null;
		Token NOT35=null;
		Token char_literal39=null;
		Token char_literal41=null;
		ParserRuleReturnScope varList27 =null;
		ParserRuleReturnScope atom28 =null;
		ParserRuleReturnScope varList30 =null;
		ParserRuleReturnScope atom31 =null;
		ParserRuleReturnScope varList33 =null;
		ParserRuleReturnScope atom34 =null;
		ParserRuleReturnScope atom36 =null;
		ParserRuleReturnScope comparison37 =null;
		ParserRuleReturnScope predicate38 =null;
		ParserRuleReturnScope formula40 =null;

		AST TRUE24_tree=null;
		AST FALSE25_tree=null;
		AST FORALL26_tree=null;
		AST EXISTS29_tree=null;
		AST EXACTLY_ONE32_tree=null;
		AST NOT35_tree=null;
		AST char_literal39_tree=null;
		AST char_literal41_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// FOL.g:178:13
			int alt9=9;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==TRUE) ) {
				alt9=1;
			}
			else if ( (LA9_0==FALSE) ) {
				alt9=2;
			}
			else if ( (LA9_0==FORALL) ) {
				alt9=3;
			}
			else if ( (LA9_0==EXISTS) ) {
				alt9=4;
			}
			else if ( (LA9_0==EXACTLY_ONE) ) {
				alt9=5;
			}
			else if ( (LA9_0==NOT) ) {
				alt9=6;
			}
			else if ( (LA9_0==INTEGER) && (synpred1_FOL())) {
				alt9=7;
			}
			else if ( (LA9_0==FLOAT) && (synpred1_FOL())) {
				alt9=7;
			}
			else if ( (LA9_0==STRING) && (synpred1_FOL())) {
				alt9=7;
			}
			else if ( (LA9_0==NAME) ) {
				int LA9_10 = input.LA(2);
				if ( (synpred1_FOL()) ) {
					alt9=7;
				}
				else if ( (true) ) {
					alt9=8;
				}

			}
			else if ( (LA9_0==VARIABLE) && (synpred1_FOL())) {
				alt9=7;
			}
			else if ( (LA9_0==74) ) {
				int LA9_12 = input.LA(2);
				if ( (synpred1_FOL()) ) {
					alt9=7;
				}
				else if ( (true) ) {
					alt9=9;
				}

			}
			else if ( (LA9_0==SUB) && (synpred1_FOL())) {
				alt9=7;
			}
			else if ( (LA9_0==78) && (synpred1_FOL())) {
				alt9=7;
			}

			switch (alt9) {
				case 1 :
					// FOL.g:178:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE24=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom512); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE24_tree = (AST)adaptor.create(TRUE24);
					adaptor.addChild(root_0, TRUE24_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:179:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE25=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom530); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE25_tree = (AST)adaptor.create(FALSE25);
					adaptor.addChild(root_0, FALSE25_tree);
					}

					}
					break;
				case 3 :
					// FOL.g:180:17
					{
					root_0 = (AST)adaptor.nil();


					FORALL26=(Token)match(input,FORALL,FOLLOW_FORALL_in_atom548); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FORALL26_tree = (AST)adaptor.create(FORALL26);
					root_0 = (AST)adaptor.becomeRoot(FORALL26_tree, root_0);
					}

					pushFollow(FOLLOW_varList_in_atom551);
					varList27=varList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varList27.getTree());

					pushFollow(FOLLOW_atom_in_atom553);
					atom28=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom28.getTree());

					}
					break;
				case 4 :
					// FOL.g:181:17
					{
					root_0 = (AST)adaptor.nil();


					EXISTS29=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_atom571); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXISTS29_tree = (AST)adaptor.create(EXISTS29);
					root_0 = (AST)adaptor.becomeRoot(EXISTS29_tree, root_0);
					}

					pushFollow(FOLLOW_varList_in_atom574);
					varList30=varList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varList30.getTree());

					pushFollow(FOLLOW_atom_in_atom576);
					atom31=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom31.getTree());

					}
					break;
				case 5 :
					// FOL.g:182:17
					{
					root_0 = (AST)adaptor.nil();


					EXACTLY_ONE32=(Token)match(input,EXACTLY_ONE,FOLLOW_EXACTLY_ONE_in_atom594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXACTLY_ONE32_tree = (AST)adaptor.create(EXACTLY_ONE32);
					root_0 = (AST)adaptor.becomeRoot(EXACTLY_ONE32_tree, root_0);
					}

					pushFollow(FOLLOW_varList_in_atom597);
					varList33=varList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varList33.getTree());

					pushFollow(FOLLOW_atom_in_atom599);
					atom34=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom34.getTree());

					}
					break;
				case 6 :
					// FOL.g:183:17
					{
					root_0 = (AST)adaptor.nil();


					NOT35=(Token)match(input,NOT,FOLLOW_NOT_in_atom617); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT35_tree = (AST)adaptor.create(NOT35);
					root_0 = (AST)adaptor.becomeRoot(NOT35_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_atom620);
					atom36=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom36.getTree());

					}
					break;
				case 7 :
					// FOL.g:186:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_atom657);
					comparison37=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison37.getTree());

					}
					break;
				case 8 :
					// FOL.g:187:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_atom676);
					predicate38=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate38.getTree());

					}
					break;
				case 9 :
					// FOL.g:188:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal39=(Token)match(input,74,FOLLOW_74_in_atom711); if (state.failed) return retval;
					pushFollow(FOLLOW_formula_in_atom714);
					formula40=formula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formula40.getTree());

					char_literal41=(Token)match(input,75,FOLLOW_75_in_atom716); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class comparison_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// FOL.g:191:1
	public final FOLParser.comparison_return comparison() throws RecognitionException {
		FOLParser.comparison_return retval = new FOLParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope term42 =null;
		ParserRuleReturnScope copr43 =null;
		ParserRuleReturnScope term44 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// FOL.g:191:13
			// FOL.g:191:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_comparison750);
			term42=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term42.getTree());

			pushFollow(FOLLOW_copr_in_comparison752);
			copr43=copr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(copr43.getTree(), root_0);
			pushFollow(FOLLOW_term_in_comparison755);
			term44=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term44.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class copr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "copr"
	// FOL.g:192:1
	public final FOLParser.copr_return copr() throws RecognitionException {
		FOLParser.copr_return retval = new FOLParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token set45=null;

		AST set45_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// FOL.g:192:13
			// FOL.g:
			{
			root_0 = (AST)adaptor.nil();


			set45=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||(input.LA(1) >= LE && input.LA(1) <= LT)||input.LA(1)==NE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set45));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, copr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "copr"


	public static class predicate_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// FOL.g:194:1
	public final FOLParser.predicate_return predicate() throws RecognitionException {
		FOLParser.predicate_return retval = new FOLParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal46=null;
		Token char_literal48=null;
		ParserRuleReturnScope termList47 =null;

		AST t_tree=null;
		AST char_literal46_tree=null;
		AST char_literal48_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// FOL.g:194:13
			// FOL.g:194:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_predicate807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
			}

			char_literal46=(Token)match(input,74,FOLLOW_74_in_predicate810); if (state.failed) return retval;
			pushFollow(FOLLOW_termList_in_predicate813);
			termList47=termList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termList47.getTree());

			char_literal48=(Token)match(input,75,FOLLOW_75_in_predicate815); if (state.failed) return retval;
			if ( state.backtracking==0 ) { setType(t,PREDICATE); }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class varList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "varList"
	// FOL.g:209:1
	public final FOLParser.varList_return varList() throws RecognitionException {
		FOLParser.varList_return retval = new FOLParser.varList_return();
		retval.start = input.LT(1);
		int varList_StartIndex = input.index();

		AST root_0 = null;

		Token VARIABLE49=null;
		Token VARIABLE50=null;
		Token char_literal51=null;
		Token VARIABLE52=null;

		AST VARIABLE49_tree=null;
		AST VARIABLE50_tree=null;
		AST char_literal51_tree=null;
		AST VARIABLE52_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// FOL.g:211:13
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==VARIABLE) ) {
				int LA11_1 = input.LA(2);
				if ( ((LA11_1 >= EXACTLY_ONE && LA11_1 <= EXISTS)||(LA11_1 >= FALSE && LA11_1 <= FLOAT)||LA11_1==FORALL||LA11_1==INTEGER||LA11_1==NAME||LA11_1==NOT||(LA11_1 >= STRING && LA11_1 <= SUB)||LA11_1==TRUE||LA11_1==VARIABLE||LA11_1==74||LA11_1==78) ) {
					alt11=1;
				}
				else if ( (LA11_1==76) ) {
					alt11=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// FOL.g:211:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE49=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList867); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE49_tree = (AST)adaptor.create(VARIABLE49);
					adaptor.addChild(root_0, VARIABLE49_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:212:17
					{
					VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE50);

					// FOL.g:212:26
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==76) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// FOL.g:212:28
							{
							char_literal51=(Token)match(input,76,FOLLOW_76_in_varList889); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_76.add(char_literal51);

							VARIABLE52=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_varList891); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE52);

							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}


					// AST REWRITE
					// elements: VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 212:44: -> ^( VAR_LIST ( VARIABLE )+ )
					{
						// FOL.g:212:47
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR_LIST, "VAR_LIST"), root_1);
						if ( !(stream_VARIABLE.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_VARIABLE.hasNext() ) {
							adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						}
						stream_VARIABLE.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, varList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "varList"


	public static class termList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "termList"
	// FOL.g:215:1
	public final FOLParser.termList_return termList() throws RecognitionException {
		FOLParser.termList_return retval = new FOLParser.termList_return();
		retval.start = input.LT(1);
		int termList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal54=null;
		ParserRuleReturnScope term53 =null;
		ParserRuleReturnScope term55 =null;

		AST char_literal54_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// FOL.g:215:13
			// FOL.g:215:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_termList929);
			term53=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term53.getTree());

			// FOL.g:215:22
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==76) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// FOL.g:215:24
					{
					char_literal54=(Token)match(input,76,FOLLOW_76_in_termList933); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_termList936);
					term55=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term55.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, termList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "termList"


	public static class term_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "term"
	// FOL.g:216:1
	public final FOLParser.term_return term() throws RecognitionException {
		FOLParser.term_return retval = new FOLParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope addTerm56 =null;
		ParserRuleReturnScope list57 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// FOL.g:216:13
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==FLOAT||LA13_0==INTEGER||LA13_0==NAME||(LA13_0 >= STRING && LA13_0 <= SUB)||LA13_0==VARIABLE||LA13_0==74) ) {
				alt13=1;
			}
			else if ( (LA13_0==78) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// FOL.g:216:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_addTerm_in_term956);
					addTerm56=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm56.getTree());

					}
					break;
				case 2 :
					// FOL.g:216:27
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_list_in_term960);
					list57=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list57.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, term_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "term"


	public static class addTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "addTerm"
	// FOL.g:218:1
	public final FOLParser.addTerm_return addTerm() throws RecognitionException {
		FOLParser.addTerm_return retval = new FOLParser.addTerm_return();
		retval.start = input.LT(1);
		int addTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulTerm58 =null;
		ParserRuleReturnScope opr159 =null;
		ParserRuleReturnScope mulTerm60 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// FOL.g:218:13
			// FOL.g:218:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulTerm_in_addTerm975);
			mulTerm58=mulTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm58.getTree());

			// FOL.g:218:25
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ADD||LA14_0==SUB) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// FOL.g:218:27
					{
					pushFollow(FOLLOW_opr1_in_addTerm979);
					opr159=opr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr159.getTree(), root_0);
					pushFollow(FOLLOW_mulTerm_in_addTerm982);
					mulTerm60=mulTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm60.getTree());

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, addTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "addTerm"


	public static class mulTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulTerm"
	// FOL.g:219:1
	public final FOLParser.mulTerm_return mulTerm() throws RecognitionException {
		FOLParser.mulTerm_return retval = new FOLParser.mulTerm_return();
		retval.start = input.LT(1);
		int mulTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negTerm61 =null;
		ParserRuleReturnScope opr262 =null;
		ParserRuleReturnScope negTerm63 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// FOL.g:219:13
			// FOL.g:219:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negTerm_in_mulTerm999);
			negTerm61=negTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm61.getTree());

			// FOL.g:219:25
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==DIV||(LA15_0 >= MOD && LA15_0 <= MUL)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// FOL.g:219:27
					{
					pushFollow(FOLLOW_opr2_in_mulTerm1003);
					opr262=opr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr262.getTree(), root_0);
					pushFollow(FOLLOW_negTerm_in_mulTerm1006);
					negTerm63=negTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm63.getTree());

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, mulTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mulTerm"


	public static class negTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "negTerm"
	// FOL.g:220:1
	public final FOLParser.negTerm_return negTerm() throws RecognitionException {
		FOLParser.negTerm_return retval = new FOLParser.negTerm_return();
		retval.start = input.LT(1);
		int negTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atomicTerm64 =null;
		ParserRuleReturnScope atomicTerm65 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// FOL.g:220:13
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==FLOAT||LA16_0==INTEGER||LA16_0==NAME||LA16_0==STRING||LA16_0==VARIABLE||LA16_0==74) ) {
				alt16=1;
			}
			else if ( (LA16_0==SUB) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// FOL.g:220:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicTerm_in_negTerm1023);
					atomicTerm64=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm64.getTree());

					}
					break;
				case 2 :
					// FOL.g:221:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_negTerm1043); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,NEG); }
					pushFollow(FOLLOW_atomicTerm_in_negTerm1048);
					atomicTerm65=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm65.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, negTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "negTerm"


	public static class atomicTerm_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atomicTerm"
	// FOL.g:224:1
	public final FOLParser.atomicTerm_return atomicTerm() throws RecognitionException {
		FOLParser.atomicTerm_return retval = new FOLParser.atomicTerm_return();
		retval.start = input.LT(1);
		int atomicTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token INTEGER66=null;
		Token FLOAT67=null;
		Token STRING68=null;
		Token char_literal69=null;
		Token char_literal71=null;
		Token VARIABLE72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		ParserRuleReturnScope termList70 =null;
		ParserRuleReturnScope addTerm74 =null;

		AST t_tree=null;
		AST INTEGER66_tree=null;
		AST FLOAT67_tree=null;
		AST STRING68_tree=null;
		AST char_literal69_tree=null;
		AST char_literal71_tree=null;
		AST VARIABLE72_tree=null;
		AST char_literal73_tree=null;
		AST char_literal75_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// FOL.g:226:13
			int alt18=7;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt18=1;
				}
				break;
			case FLOAT:
				{
				alt18=2;
				}
				break;
			case STRING:
				{
				alt18=3;
				}
				break;
			case NAME:
				{
				int LA18_4 = input.LA(2);
				if ( (LA18_4==EOF||(LA18_4 >= ADD && LA18_4 <= AND)||LA18_4==DIV||LA18_4==EQ||(LA18_4 >= GE && LA18_4 <= GT)||(LA18_4 >= IFF && LA18_4 <= IMPLIES)||(LA18_4 >= LE && LA18_4 <= LT)||(LA18_4 >= MOD && LA18_4 <= MUL)||LA18_4==NE||LA18_4==OR||LA18_4==SUB||(LA18_4 >= 75 && LA18_4 <= 77)||LA18_4==79||LA18_4==81) ) {
					alt18=4;
				}
				else if ( (LA18_4==74) ) {
					alt18=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARIABLE:
				{
				alt18=6;
				}
				break;
			case 74:
				{
				alt18=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// FOL.g:226:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER66=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomicTerm1091); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER66_tree = (AST)adaptor.create(INTEGER66);
					adaptor.addChild(root_0, INTEGER66_tree);
					}

					}
					break;
				case 2 :
					// FOL.g:227:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT67=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomicTerm1109); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT67_tree = (AST)adaptor.create(FLOAT67);
					adaptor.addChild(root_0, FLOAT67_tree);
					}

					}
					break;
				case 3 :
					// FOL.g:228:17
					{
					root_0 = (AST)adaptor.nil();


					STRING68=(Token)match(input,STRING,FOLLOW_STRING_in_atomicTerm1127); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING68_tree = (AST)adaptor.create(STRING68);
					adaptor.addChild(root_0, STRING68_tree);
					}

					}
					break;
				case 4 :
					// FOL.g:229:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1147); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CONSTANT); }
					}
					break;
				case 5 :
					// FOL.g:230:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1170); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,FUNCTION); }
					char_literal69=(Token)match(input,74,FOLLOW_74_in_atomicTerm1175); if (state.failed) return retval;
					// FOL.g:230:56
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==FLOAT||LA17_0==INTEGER||LA17_0==NAME||(LA17_0 >= STRING && LA17_0 <= SUB)||LA17_0==VARIABLE||LA17_0==74||LA17_0==78) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// FOL.g:230:56
							{
							pushFollow(FOLLOW_termList_in_atomicTerm1178);
							termList70=termList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, termList70.getTree());

							}
							break;

					}

					char_literal71=(Token)match(input,75,FOLLOW_75_in_atomicTerm1181); if (state.failed) return retval;
					}
					break;
				case 6 :
					// FOL.g:231:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE72=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atomicTerm1200); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE72_tree = (AST)adaptor.create(VARIABLE72);
					adaptor.addChild(root_0, VARIABLE72_tree);
					}

					}
					break;
				case 7 :
					// FOL.g:232:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal73=(Token)match(input,74,FOLLOW_74_in_atomicTerm1218); if (state.failed) return retval;
					pushFollow(FOLLOW_addTerm_in_atomicTerm1221);
					addTerm74=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm74.getTree());

					char_literal75=(Token)match(input,75,FOLLOW_75_in_atomicTerm1223); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, atomicTerm_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atomicTerm"


	public static class list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "list"
	// FOL.g:235:1
	public final FOLParser.list_return list() throws RecognitionException {
		FOLParser.list_return retval = new FOLParser.list_return();
		retval.start = input.LT(1);
		int list_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal76=null;
		ParserRuleReturnScope listTail77 =null;

		AST t_tree=null;
		AST char_literal76_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// FOL.g:237:13
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==78) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==79) ) {
					alt19=1;
				}
				else if ( (LA19_1==FLOAT||LA19_1==INTEGER||LA19_1==NAME||(LA19_1 >= STRING && LA19_1 <= SUB)||LA19_1==VARIABLE||LA19_1==74||LA19_1==78) ) {
					alt19=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// FOL.g:237:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,78,FOLLOW_78_in_list1268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NIL); }
					char_literal76=(Token)match(input,79,FOLLOW_79_in_list1273); if (state.failed) return retval;
					}
					break;
				case 2 :
					// FOL.g:238:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,78,FOLLOW_78_in_list1294); if (state.failed) return retval;
					pushFollow(FOLLOW_listTail_in_list1297);
					listTail77=listTail();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listTail77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "list"


	public static class listTail_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "listTail"
	// FOL.g:241:1
	public final FOLParser.listTail_return listTail() throws RecognitionException {
		FOLParser.listTail_return retval = new FOLParser.listTail_return();
		retval.start = input.LT(1);
		int listTail_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token VARIABLE79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		ParserRuleReturnScope term78 =null;
		ParserRuleReturnScope list81 =null;
		ParserRuleReturnScope listTail83 =null;

		AST t_tree=null;
		AST VARIABLE79_tree=null;
		AST char_literal80_tree=null;
		AST char_literal82_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_listTail=new RewriteRuleSubtreeStream(adaptor,"rule listTail");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// FOL.g:241:13
			// FOL.g:241:17
			{
			pushFollow(FOLLOW_term_in_listTail1323);
			term78=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term78.getTree());
			// FOL.g:242:13
			int alt20=4;
			switch ( input.LA(1) ) {
			case 81:
				{
				int LA20_1 = input.LA(2);
				if ( (LA20_1==VARIABLE) ) {
					alt20=1;
				}
				else if ( (LA20_1==78) ) {
					alt20=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 76:
				{
				alt20=3;
				}
				break;
			case 79:
				{
				alt20=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// FOL.g:243:17
					{
					t=(Token)match(input,81,FOLLOW_81_in_listTail1367); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(t);

					VARIABLE79=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_listTail1369); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE79);

					char_literal80=(Token)match(input,79,FOLLOW_79_in_listTail1371); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal80);


					// AST REWRITE
					// elements: VARIABLE, term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 243:36: -> ^( CONS[$t] term VARIABLE )
					{
						// FOL.g:243:39
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONS, t), root_1);
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FOL.g:244:17
					{
					t=(Token)match(input,81,FOLLOW_81_in_listTail1402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(t);

					pushFollow(FOLLOW_list_in_listTail1404);
					list81=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list81.getTree());
					char_literal82=(Token)match(input,79,FOLLOW_79_in_listTail1406); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal82);


					// AST REWRITE
					// elements: term, list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 244:36: -> ^( CONS[$t] term list )
					{
						// FOL.g:244:39
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONS, t), root_1);
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_1, stream_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FOL.g:245:17
					{
					t=(Token)match(input,76,FOLLOW_76_in_listTail1441); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(t);

					pushFollow(FOLLOW_listTail_in_listTail1443);
					listTail83=listTail();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_listTail.add(listTail83.getTree());

					// AST REWRITE
					// elements: listTail, term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 245:36: -> ^( CONS[$t] term listTail )
					{
						// FOL.g:245:39
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONS, t), root_1);
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_1, stream_listTail.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FOL.g:246:17
					{
					t=(Token)match(input,79,FOLLOW_79_in_listTail1478); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(t);


					// AST REWRITE
					// elements: term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 246:36: -> ^( CONS[$t] term NIL[$t] )
					{
						// FOL.g:246:39
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONS, t), root_1);
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_1, (AST)adaptor.create(NIL, t));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, listTail_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "listTail"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// FOL.g:250:1
	public final FOLParser.opr1_return opr1() throws RecognitionException {
		FOLParser.opr1_return retval = new FOLParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token set84=null;

		AST set84_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// FOL.g:250:13
			// FOL.g:
			{
			root_0 = (AST)adaptor.nil();


			set84=input.LT(1);
			if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set84));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, opr1_StartIndex); }

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
	// FOL.g:251:1
	public final FOLParser.opr2_return opr2() throws RecognitionException {
		FOLParser.opr2_return retval = new FOLParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token set85=null;

		AST set85_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// FOL.g:251:13
			// FOL.g:
			{
			root_0 = (AST)adaptor.nil();


			set85=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set85));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, opr2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "opr2"

	// $ANTLR start synpred1_FOL
	public final void synpred1_FOL_fragment() throws RecognitionException {
		// FOL.g:186:17
		// FOL.g:186:18
		{
		pushFollow(FOLLOW_comparison_in_synpred1_FOL653);
		comparison();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_FOL

	// Delegated rules

	public final boolean synpred1_FOL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_FOL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_sentence_in_cunit188 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000016404L});
	public static final BitSet FOLLOW_EOF_in_cunit191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_sentence217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_sentence236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_sentence238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_sentence259 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000056404L});
	public static final BitSet FOLLOW_sentence_in_sentence264 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000056404L});
	public static final BitSet FOLLOW_82_in_sentence267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iffExpr_in_formula299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliedByExpr_in_iffExpr317 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_IFF_in_iffExpr321 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_iffExpr_in_iffExpr331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliesExpr_in_impliedByExpr350 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_IMPLIED_BY_in_impliedByExpr356 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_impliesExpr_in_impliedByExpr359 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_orExpr_in_impliesExpr376 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_IMPLIES_in_impliesExpr387 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_impliesExpr_in_impliesExpr393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr415 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_OR_in_orExpr425 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_andExpr_in_orExpr436 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_atom_in_andExpr461 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_andExpr474 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_atom_in_andExpr484 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_TRUE_in_atom512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FORALL_in_atom548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_varList_in_atom551 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_atom_in_atom553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXISTS_in_atom571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_varList_in_atom574 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_atom_in_atom576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXACTLY_ONE_in_atom594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_varList_in_atom597 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_atom_in_atom599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_atom617 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_atom_in_atom620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_atom657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_atom676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_atom711 = new BitSet(new long[]{0x5804401002CC0000L,0x0000000000004404L});
	public static final BitSet FOLLOW_formula_in_atom714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atom716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_comparison750 = new BitSet(new long[]{0x0000830030010000L});
	public static final BitSet FOLLOW_copr_in_comparison752 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004404L});
	public static final BitSet FOLLOW_term_in_comparison755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_predicate810 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004404L});
	public static final BitSet FOLLOW_termList_in_predicate813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_predicate815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_varList867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_varList885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_varList889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VARIABLE_in_varList891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_term_in_termList929 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_termList933 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004404L});
	public static final BitSet FOLLOW_term_in_termList936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_addTerm_in_term956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_term960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm975 = new BitSet(new long[]{0x1000000000000022L});
	public static final BitSet FOLLOW_opr1_in_addTerm979 = new BitSet(new long[]{0x1800401000800000L,0x0000000000000404L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm982 = new BitSet(new long[]{0x1000000000000022L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm999 = new BitSet(new long[]{0x0000180000004002L});
	public static final BitSet FOLLOW_opr2_in_mulTerm1003 = new BitSet(new long[]{0x1800401000800000L,0x0000000000000404L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1006 = new BitSet(new long[]{0x0000180000004002L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_negTerm1043 = new BitSet(new long[]{0x0800401000800000L,0x0000000000000404L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomicTerm1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomicTerm1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atomicTerm1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_atomicTerm1175 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004C04L});
	public static final BitSet FOLLOW_termList_in_atomicTerm1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atomicTerm1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atomicTerm1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_atomicTerm1218 = new BitSet(new long[]{0x1800401000800000L,0x0000000000000404L});
	public static final BitSet FOLLOW_addTerm_in_atomicTerm1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atomicTerm1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_list1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_list1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_list1294 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004404L});
	public static final BitSet FOLLOW_listTail_in_list1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_listTail1323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000029000L});
	public static final BitSet FOLLOW_81_in_listTail1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_VARIABLE_in_listTail1369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_listTail1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_listTail1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_list_in_listTail1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_listTail1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_listTail1441 = new BitSet(new long[]{0x1800401000800000L,0x0000000000004404L});
	public static final BitSet FOLLOW_listTail_in_listTail1443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_listTail1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_synpred1_FOL653 = new BitSet(new long[]{0x0000000000000002L});
}
