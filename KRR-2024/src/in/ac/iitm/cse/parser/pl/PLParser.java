// $ANTLR 3.5.3 PL.g 2024-02-25 16:03:24

package in.ac.iitm.cse.parser.pl;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AND", "B", "BLOCK", "C", 
		"COMMENT", "D", "E", "F", "FALSE", "G", "H", "I", "IFF", "IMPLIED_BY", 
		"IMPLIES", "J", "K", "L", "M", "N", "NAME", "NOT", "O", "OR", "P", "PL", 
		"Q", "R", "S", "T", "TRUE", "U", "V", "VARIABLE", "W", "WS", "WS_2", "X", 
		"Y", "Z", "'('", "')'", "';'", "'['", "']'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int A=4;
	public static final int AND=5;
	public static final int B=6;
	public static final int BLOCK=7;
	public static final int C=8;
	public static final int COMMENT=9;
	public static final int D=10;
	public static final int E=11;
	public static final int F=12;
	public static final int FALSE=13;
	public static final int G=14;
	public static final int H=15;
	public static final int I=16;
	public static final int IFF=17;
	public static final int IMPLIED_BY=18;
	public static final int IMPLIES=19;
	public static final int J=20;
	public static final int K=21;
	public static final int L=22;
	public static final int M=23;
	public static final int N=24;
	public static final int NAME=25;
	public static final int NOT=26;
	public static final int O=27;
	public static final int OR=28;
	public static final int P=29;
	public static final int PL=30;
	public static final int Q=31;
	public static final int R=32;
	public static final int S=33;
	public static final int T=34;
	public static final int TRUE=35;
	public static final int U=36;
	public static final int V=37;
	public static final int VARIABLE=38;
	public static final int W=39;
	public static final int WS=40;
	public static final int WS_2=41;
	public static final int X=42;
	public static final int Y=43;
	public static final int Z=44;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "PL.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// PL.g:110:1
	public final PLParser.cunit_return cunit() throws RecognitionException {
		PLParser.cunit_return retval = new PLParser.cunit_return();
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

			// PL.g:110:13
			// PL.g:110:17
			{
			// PL.g:110:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==FALSE||(LA1_0 >= NAME && LA1_0 <= NOT)||LA1_0==TRUE||LA1_0==45||(LA1_0 >= 47 && LA1_0 <= 48)||LA1_0==50) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// PL.g:110:17
					{
					pushFollow(FOLLOW_sentence_in_cunit139);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit142);  
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
			// 110:31: -> ^( PL ( sentence )* )
			{
				// PL.g:110:34
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PL, "PL"), root_1);
				// PL.g:110:39
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
	// PL.g:116:1
	public final PLParser.sentence_return sentence() throws RecognitionException {
		PLParser.sentence_return retval = new PLParser.sentence_return();
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

			// PL.g:116:13
			int alt3=3;
			switch ( input.LA(1) ) {
			case 47:
				{
				alt3=1;
				}
				break;
			case FALSE:
			case NAME:
			case NOT:
			case TRUE:
			case 45:
			case 48:
				{
				alt3=2;
				}
				break;
			case 50:
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
					// PL.g:116:16
					{
					root_0 = (AST)adaptor.nil();


					char_literal3=(Token)match(input,47,FOLLOW_47_in_sentence168); 
					}
					break;
				case 2 :
					// PL.g:117:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_formula_in_sentence187);
					formula4=formula();
					state._fsp--;

					adaptor.addChild(root_0, formula4.getTree());

					char_literal5=(Token)match(input,47,FOLLOW_47_in_sentence189); 
					}
					break;
				case 3 :
					// PL.g:118:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,50,FOLLOW_50_in_sentence210); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,BLOCK); 
					// PL.g:118:47
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==FALSE||(LA2_0 >= NAME && LA2_0 <= NOT)||LA2_0==TRUE||LA2_0==45||(LA2_0 >= 47 && LA2_0 <= 48)||LA2_0==50) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// PL.g:118:47
							{
							pushFollow(FOLLOW_sentence_in_sentence215);
							sentence6=sentence();
							state._fsp--;

							adaptor.addChild(root_0, sentence6.getTree());

							}
							break;

						default :
							break loop2;
						}
					}

					char_literal7=(Token)match(input,51,FOLLOW_51_in_sentence218); 
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
	// PL.g:121:1
	public final PLParser.formula_return formula() throws RecognitionException {
		PLParser.formula_return retval = new PLParser.formula_return();
		retval.start = input.LT(1);
		int formula_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope iffExpr8 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// PL.g:121:17
			// PL.g:121:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_iffExpr_in_formula250);
			iffExpr8=iffExpr();
			state._fsp--;

			adaptor.addChild(root_0, iffExpr8.getTree());

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


	public static class iffExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "iffExpr"
	// PL.g:122:1
	public final PLParser.iffExpr_return iffExpr() throws RecognitionException {
		PLParser.iffExpr_return retval = new PLParser.iffExpr_return();
		retval.start = input.LT(1);
		int iffExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IFF10=null;
		ParserRuleReturnScope impliedByExpr9 =null;
		ParserRuleReturnScope iffExpr11 =null;

		AST IFF10_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// PL.g:122:17
			// PL.g:122:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_impliedByExpr_in_iffExpr268);
			impliedByExpr9=impliedByExpr();
			state._fsp--;

			adaptor.addChild(root_0, impliedByExpr9.getTree());

			// PL.g:122:35
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IFF) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// PL.g:122:37
					{
					IFF10=(Token)match(input,IFF,FOLLOW_IFF_in_iffExpr272); 
					IFF10_tree = (AST)adaptor.create(IFF10);
					root_0 = (AST)adaptor.becomeRoot(IFF10_tree, root_0);

					pushFollow(FOLLOW_iffExpr_in_iffExpr282);
					iffExpr11=iffExpr();
					state._fsp--;

					adaptor.addChild(root_0, iffExpr11.getTree());

					}
					break;

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
	// $ANTLR end "iffExpr"


	public static class impliedByExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "impliedByExpr"
	// PL.g:123:1
	public final PLParser.impliedByExpr_return impliedByExpr() throws RecognitionException {
		PLParser.impliedByExpr_return retval = new PLParser.impliedByExpr_return();
		retval.start = input.LT(1);
		int impliedByExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IMPLIED_BY13=null;
		ParserRuleReturnScope impliesExpr12 =null;
		ParserRuleReturnScope impliesExpr14 =null;

		AST IMPLIED_BY13_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// PL.g:123:17
			// PL.g:123:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_impliesExpr_in_impliedByExpr301);
			impliesExpr12=impliesExpr();
			state._fsp--;

			adaptor.addChild(root_0, impliesExpr12.getTree());

			// PL.g:123:35
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==IMPLIED_BY) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// PL.g:123:37
					{
					IMPLIED_BY13=(Token)match(input,IMPLIED_BY,FOLLOW_IMPLIED_BY_in_impliedByExpr307); 
					IMPLIED_BY13_tree = (AST)adaptor.create(IMPLIED_BY13);
					root_0 = (AST)adaptor.becomeRoot(IMPLIED_BY13_tree, root_0);

					pushFollow(FOLLOW_impliesExpr_in_impliedByExpr310);
					impliesExpr14=impliesExpr();
					state._fsp--;

					adaptor.addChild(root_0, impliesExpr14.getTree());

					}
					break;

				default :
					break loop5;
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
	// $ANTLR end "impliedByExpr"


	public static class impliesExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "impliesExpr"
	// PL.g:124:1
	public final PLParser.impliesExpr_return impliesExpr() throws RecognitionException {
		PLParser.impliesExpr_return retval = new PLParser.impliesExpr_return();
		retval.start = input.LT(1);
		int impliesExpr_StartIndex = input.index();

		AST root_0 = null;

		Token IMPLIES16=null;
		ParserRuleReturnScope orExpr15 =null;
		ParserRuleReturnScope impliesExpr17 =null;

		AST IMPLIES16_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// PL.g:124:17
			// PL.g:124:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_orExpr_in_impliesExpr327);
			orExpr15=orExpr();
			state._fsp--;

			adaptor.addChild(root_0, orExpr15.getTree());

			// PL.g:124:35
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IMPLIES) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// PL.g:124:37
					{
					IMPLIES16=(Token)match(input,IMPLIES,FOLLOW_IMPLIES_in_impliesExpr338); 
					IMPLIES16_tree = (AST)adaptor.create(IMPLIES16);
					root_0 = (AST)adaptor.becomeRoot(IMPLIES16_tree, root_0);

					pushFollow(FOLLOW_impliesExpr_in_impliesExpr344);
					impliesExpr17=impliesExpr();
					state._fsp--;

					adaptor.addChild(root_0, impliesExpr17.getTree());

					}
					break;

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
	// $ANTLR end "impliesExpr"


	public static class orExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "orExpr"
	// PL.g:125:1
	public final PLParser.orExpr_return orExpr() throws RecognitionException {
		PLParser.orExpr_return retval = new PLParser.orExpr_return();
		retval.start = input.LT(1);
		int orExpr_StartIndex = input.index();

		AST root_0 = null;

		Token OR19=null;
		ParserRuleReturnScope andExpr18 =null;
		ParserRuleReturnScope andExpr20 =null;

		AST OR19_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// PL.g:125:17
			// PL.g:125:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_orExpr366);
			andExpr18=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr18.getTree());

			// PL.g:125:35
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==OR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// PL.g:125:37
					{
					OR19=(Token)match(input,OR,FOLLOW_OR_in_orExpr376); 
					OR19_tree = (AST)adaptor.create(OR19);
					root_0 = (AST)adaptor.becomeRoot(OR19_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_orExpr387);
					andExpr20=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr20.getTree());

					}
					break;

				default :
					break loop7;
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
	// $ANTLR end "orExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// PL.g:126:1
	public final PLParser.andExpr_return andExpr() throws RecognitionException {
		PLParser.andExpr_return retval = new PLParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		AST root_0 = null;

		Token AND22=null;
		ParserRuleReturnScope atom21 =null;
		ParserRuleReturnScope atom23 =null;

		AST AND22_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// PL.g:126:17
			// PL.g:126:21
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_atom_in_andExpr412);
			atom21=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom21.getTree());

			// PL.g:126:35
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// PL.g:126:37
					{
					AND22=(Token)match(input,AND,FOLLOW_AND_in_andExpr425); 
					AND22_tree = (AST)adaptor.create(AND22);
					root_0 = (AST)adaptor.becomeRoot(AND22_tree, root_0);

					pushFollow(FOLLOW_atom_in_andExpr435);
					atom23=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom23.getTree());

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
	// $ANTLR end "andExpr"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// PL.g:128:1
	public final PLParser.atom_return atom() throws RecognitionException {
		PLParser.atom_return retval = new PLParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token TRUE24=null;
		Token FALSE25=null;
		Token NOT26=null;
		Token char_literal28=null;
		Token char_literal30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope atom27 =null;
		ParserRuleReturnScope formula29 =null;
		ParserRuleReturnScope formula32 =null;

		AST t_tree=null;
		AST TRUE24_tree=null;
		AST FALSE25_tree=null;
		AST NOT26_tree=null;
		AST char_literal28_tree=null;
		AST char_literal30_tree=null;
		AST char_literal31_tree=null;
		AST char_literal33_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// PL.g:128:13
			int alt9=6;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt9=1;
				}
				break;
			case FALSE:
				{
				alt9=2;
				}
				break;
			case NAME:
				{
				alt9=3;
				}
				break;
			case NOT:
				{
				alt9=4;
				}
				break;
			case 48:
				{
				alt9=5;
				}
				break;
			case 45:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// PL.g:128:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE24=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom463); 
					TRUE24_tree = (AST)adaptor.create(TRUE24);
					adaptor.addChild(root_0, TRUE24_tree);

					}
					break;
				case 2 :
					// PL.g:129:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE25=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom481); 
					FALSE25_tree = (AST)adaptor.create(FALSE25);
					adaptor.addChild(root_0, FALSE25_tree);

					}
					break;
				case 3 :
					// PL.g:130:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atom501); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,VARIABLE); 
					}
					break;
				case 4 :
					// PL.g:131:17
					{
					root_0 = (AST)adaptor.nil();


					NOT26=(Token)match(input,NOT,FOLLOW_NOT_in_atom521); 
					NOT26_tree = (AST)adaptor.create(NOT26);
					root_0 = (AST)adaptor.becomeRoot(NOT26_tree, root_0);

					pushFollow(FOLLOW_atom_in_atom524);
					atom27=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom27.getTree());

					}
					break;
				case 5 :
					// PL.g:132:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal28=(Token)match(input,48,FOLLOW_48_in_atom542); 
					pushFollow(FOLLOW_formula_in_atom545);
					formula29=formula();
					state._fsp--;

					adaptor.addChild(root_0, formula29.getTree());

					char_literal30=(Token)match(input,49,FOLLOW_49_in_atom547); 
					}
					break;
				case 6 :
					// PL.g:133:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal31=(Token)match(input,45,FOLLOW_45_in_atom568); 
					pushFollow(FOLLOW_formula_in_atom571);
					formula32=formula();
					state._fsp--;

					adaptor.addChild(root_0, formula32.getTree());

					char_literal33=(Token)match(input,46,FOLLOW_46_in_atom573); 
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

	// Delegated rules



	public static final BitSet FOLLOW_sentence_in_cunit139 = new BitSet(new long[]{0x0005A00806002000L});
	public static final BitSet FOLLOW_EOF_in_cunit142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_sentence168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formula_in_sentence187 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_sentence189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_sentence210 = new BitSet(new long[]{0x000DA00806002000L});
	public static final BitSet FOLLOW_sentence_in_sentence215 = new BitSet(new long[]{0x000DA00806002000L});
	public static final BitSet FOLLOW_51_in_sentence218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iffExpr_in_formula250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliedByExpr_in_iffExpr268 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_IFF_in_iffExpr272 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_iffExpr_in_iffExpr282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_impliesExpr_in_impliedByExpr301 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_IMPLIED_BY_in_impliedByExpr307 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_impliesExpr_in_impliedByExpr310 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_orExpr_in_impliesExpr327 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_IMPLIES_in_impliesExpr338 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_impliesExpr_in_impliesExpr344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_orExpr366 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_OR_in_orExpr376 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_andExpr_in_orExpr387 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_atom_in_andExpr412 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_andExpr425 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_atom_in_andExpr435 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_TRUE_in_atom463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_atom521 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_atom_in_atom524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_atom542 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_formula_in_atom545 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_atom547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_atom568 = new BitSet(new long[]{0x0001200806002000L});
	public static final BitSet FOLLOW_formula_in_atom571 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_atom573 = new BitSet(new long[]{0x0000000000000002L});
}
