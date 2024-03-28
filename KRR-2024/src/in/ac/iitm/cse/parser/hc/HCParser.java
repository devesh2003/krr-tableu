// $ANTLR 3.5.3 HC.g 2024-02-25 16:03:25

package in.ac.iitm.cse.parser.hc;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HCParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ADD", "B", "C", "COMMENT", 
		"CONS", "CONSTANT", "CUT", "D", "DIV", "E", "EQ", "EQUIV", "ESC_SEQ", 
		"EXPONENT", "F", "FACT", "FALSE", "FLOAT", "FUNCTION", "G", "GE", "GT", 
		"H", "HEAD", "HEX_DIGIT", "I", "INTEGER", "IS", "J", "K", "L", "LE", "LT", 
		"M", "MOD", "MUL", "N", "NAME", "NE", "NEG", "NIL", "NOT", "NOTEQUIV", 
		"NOTUNIFIES", "O", "OCTAL_ESC", "P", "PREDICATE", "PROGRAM", "Q", "QUERY", 
		"R", "RULE", "S", "STRING", "SUB", "T", "TRUE", "U", "UNICODE_ESC", "UNIFIES", 
		"V", "VARIABLE", "W", "WS", "X", "Y", "Z", "'!'", "'('", "')'", "','", 
		"'.'", "':-'", "'?'", "'['", "']'", "'|'"
	};
	public static final int EOF=-1;
	public static final int T__73=73;
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
	public static final int B=6;
	public static final int C=7;
	public static final int COMMENT=8;
	public static final int CONS=9;
	public static final int CONSTANT=10;
	public static final int CUT=11;
	public static final int D=12;
	public static final int DIV=13;
	public static final int E=14;
	public static final int EQ=15;
	public static final int EQUIV=16;
	public static final int ESC_SEQ=17;
	public static final int EXPONENT=18;
	public static final int F=19;
	public static final int FACT=20;
	public static final int FALSE=21;
	public static final int FLOAT=22;
	public static final int FUNCTION=23;
	public static final int G=24;
	public static final int GE=25;
	public static final int GT=26;
	public static final int H=27;
	public static final int HEAD=28;
	public static final int HEX_DIGIT=29;
	public static final int I=30;
	public static final int INTEGER=31;
	public static final int IS=32;
	public static final int J=33;
	public static final int K=34;
	public static final int L=35;
	public static final int LE=36;
	public static final int LT=37;
	public static final int M=38;
	public static final int MOD=39;
	public static final int MUL=40;
	public static final int N=41;
	public static final int NAME=42;
	public static final int NE=43;
	public static final int NEG=44;
	public static final int NIL=45;
	public static final int NOT=46;
	public static final int NOTEQUIV=47;
	public static final int NOTUNIFIES=48;
	public static final int O=49;
	public static final int OCTAL_ESC=50;
	public static final int P=51;
	public static final int PREDICATE=52;
	public static final int PROGRAM=53;
	public static final int Q=54;
	public static final int QUERY=55;
	public static final int R=56;
	public static final int RULE=57;
	public static final int S=58;
	public static final int STRING=59;
	public static final int SUB=60;
	public static final int T=61;
	public static final int TRUE=62;
	public static final int U=63;
	public static final int UNICODE_ESC=64;
	public static final int UNIFIES=65;
	public static final int V=66;
	public static final int VARIABLE=67;
	public static final int W=68;
	public static final int WS=69;
	public static final int X=70;
	public static final int Y=71;
	public static final int Z=72;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HCParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HCParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[21+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HCParser.tokenNames; }
	@Override public String getGrammarFileName() { return "HC.g"; }


	    void setType(AST t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// HC.g:138:1
	public final HCParser.cunit_return cunit() throws RecognitionException {
		HCParser.cunit_return retval = new HCParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope hornClause1 =null;

		AST EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_hornClause=new RewriteRuleSubtreeStream(adaptor,"rule hornClause");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// HC.g:138:13
			// HC.g:138:17
			{
			// HC.g:138:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= FALSE && LA1_0 <= FLOAT)||LA1_0==INTEGER||LA1_0==NAME||LA1_0==NOT||(LA1_0 >= STRING && LA1_0 <= SUB)||LA1_0==TRUE||LA1_0==VARIABLE||(LA1_0 >= 73 && LA1_0 <= 74)||LA1_0==80) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// HC.g:138:17
					{
					pushFollow(FOLLOW_hornClause_in_cunit189);
					hornClause1=hornClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_hornClause.add(hornClause1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_cunit192); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);


			// AST REWRITE
			// elements: hornClause
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 138:33: -> ^( PROGRAM ( hornClause )* )
			{
				// HC.g:138:36
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// HC.g:138:46
				while ( stream_hornClause.hasNext() ) {
					adaptor.addChild(root_1, stream_hornClause.nextTree());
				}
				stream_hornClause.reset();

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


	public static class hornClause_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "hornClause"
	// HC.g:144:1
	public final HCParser.hornClause_return hornClause() throws RecognitionException {
		HCParser.hornClause_return retval = new HCParser.hornClause_return();
		retval.start = input.LT(1);
		int hornClause_StartIndex = input.index();

		AST root_0 = null;

		Token string_literal4=null;
		Token char_literal6=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope predicate3 =null;
		ParserRuleReturnScope body5 =null;
		ParserRuleReturnScope predicate7 =null;
		ParserRuleReturnScope body9 =null;

		AST string_literal4_tree=null;
		AST char_literal6_tree=null;
		AST char_literal8_tree=null;
		AST char_literal10_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// HC.g:144:13
			int alt2=3;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==NAME) ) {
				int LA2_1 = input.LA(2);
				if ( (synpred1_HC()) ) {
					alt2=1;
				}
				else if ( (synpred2_HC()) ) {
					alt2=2;
				}
				else if ( (true) ) {
					alt2=3;
				}

			}
			else if ( ((LA2_0 >= FALSE && LA2_0 <= FLOAT)||LA2_0==INTEGER||LA2_0==NOT||(LA2_0 >= STRING && LA2_0 <= SUB)||LA2_0==TRUE||LA2_0==VARIABLE||(LA2_0 >= 73 && LA2_0 <= 74)||LA2_0==80) ) {
				alt2=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// HC.g:144:17
					{
					pushFollow(FOLLOW_predicate_in_hornClause225);
					predicate3=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(predicate3.getTree());
					string_literal4=(Token)match(input,78,FOLLOW_78_in_hornClause227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(string_literal4);

					pushFollow(FOLLOW_body_in_hornClause229);
					body5=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_body.add(body5.getTree());
					char_literal6=(Token)match(input,77,FOLLOW_77_in_hornClause231); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal6);


					// AST REWRITE
					// elements: body, predicate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 144:61: -> ^( RULE predicate body )
					{
						// HC.g:144:64
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(RULE, "RULE"), root_1);
						adaptor.addChild(root_1, stream_predicate.nextTree());
						adaptor.addChild(root_1, stream_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// HC.g:145:17
					{
					pushFollow(FOLLOW_predicate_in_hornClause268);
					predicate7=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(predicate7.getTree());
					char_literal8=(Token)match(input,77,FOLLOW_77_in_hornClause270); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal8);


					// AST REWRITE
					// elements: predicate
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 145:61: -> ^( FACT predicate )
					{
						// HC.g:145:64
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FACT, "FACT"), root_1);
						adaptor.addChild(root_1, stream_predicate.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// HC.g:146:17
					{
					pushFollow(FOLLOW_body_in_hornClause306);
					body9=body();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_body.add(body9.getTree());
					char_literal10=(Token)match(input,79,FOLLOW_79_in_hornClause308); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal10);


					// AST REWRITE
					// elements: body
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 146:61: -> ^( QUERY body )
					{
						// HC.g:146:64
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(QUERY, "QUERY"), root_1);
						adaptor.addChild(root_1, stream_body.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 2, hornClause_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "hornClause"


	public static class body_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "body"
	// HC.g:167:1
	public final HCParser.body_return body() throws RecognitionException {
		HCParser.body_return retval = new HCParser.body_return();
		retval.start = input.LT(1);
		int body_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal12=null;
		ParserRuleReturnScope subgoal11 =null;
		ParserRuleReturnScope subgoal13 =null;

		AST char_literal12_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// HC.g:167:13
			// HC.g:167:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_subgoal_in_body387);
			subgoal11=subgoal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subgoal11.getTree());

			// HC.g:167:25
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==76) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// HC.g:167:27
					{
					char_literal12=(Token)match(input,76,FOLLOW_76_in_body391); if (state.failed) return retval;
					pushFollow(FOLLOW_subgoal_in_body394);
					subgoal13=subgoal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subgoal13.getTree());

					}
					break;

				default :
					break loop3;
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
			if ( state.backtracking>0 ) { memoize(input, 3, body_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "body"


	public static class subgoal_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "subgoal"
	// HC.g:169:1
	public final HCParser.subgoal_return subgoal() throws RecognitionException {
		HCParser.subgoal_return retval = new HCParser.subgoal_return();
		retval.start = input.LT(1);
		int subgoal_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token NOT15=null;
		ParserRuleReturnScope atom14 =null;
		ParserRuleReturnScope atom16 =null;

		AST t_tree=null;
		AST NOT15_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// HC.g:169:13
			int alt4=3;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt4=1;
				}
				break;
			case FALSE:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case SUB:
			case TRUE:
			case VARIABLE:
			case 74:
			case 80:
				{
				alt4=2;
				}
				break;
			case NOT:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// HC.g:169:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,73,FOLLOW_73_in_subgoal414); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CUT); }
					}
					break;
				case 2 :
					// HC.g:170:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_subgoal434);
					atom14=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom14.getTree());

					}
					break;
				case 3 :
					// HC.g:171:15
					{
					root_0 = (AST)adaptor.nil();


					NOT15=(Token)match(input,NOT,FOLLOW_NOT_in_subgoal450); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT15_tree = (AST)adaptor.create(NOT15);
					root_0 = (AST)adaptor.becomeRoot(NOT15_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_subgoal453);
					atom16=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom16.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 4, subgoal_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "subgoal"


	public static class atom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// HC.g:174:1
	public final HCParser.atom_return atom() throws RecognitionException {
		HCParser.atom_return retval = new HCParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token TRUE17=null;
		Token FALSE18=null;
		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope comparison19 =null;
		ParserRuleReturnScope predicate20 =null;
		ParserRuleReturnScope atom22 =null;

		AST TRUE17_tree=null;
		AST FALSE18_tree=null;
		AST char_literal21_tree=null;
		AST char_literal23_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// HC.g:174:13
			int alt5=5;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TRUE) ) {
				alt5=1;
			}
			else if ( (LA5_0==FALSE) ) {
				alt5=2;
			}
			else if ( (LA5_0==INTEGER) && (synpred3_HC())) {
				alt5=3;
			}
			else if ( (LA5_0==FLOAT) && (synpred3_HC())) {
				alt5=3;
			}
			else if ( (LA5_0==STRING) && (synpred3_HC())) {
				alt5=3;
			}
			else if ( (LA5_0==NAME) ) {
				int LA5_6 = input.LA(2);
				if ( (synpred3_HC()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=4;
				}

			}
			else if ( (LA5_0==VARIABLE) && (synpred3_HC())) {
				alt5=3;
			}
			else if ( (LA5_0==74) ) {
				int LA5_8 = input.LA(2);
				if ( (synpred3_HC()) ) {
					alt5=3;
				}
				else if ( (true) ) {
					alt5=5;
				}

			}
			else if ( (LA5_0==SUB) && (synpred3_HC())) {
				alt5=3;
			}
			else if ( (LA5_0==80) && (synpred3_HC())) {
				alt5=3;
			}

			switch (alt5) {
				case 1 :
					// HC.g:174:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE17=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom483); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE17_tree = (AST)adaptor.create(TRUE17);
					adaptor.addChild(root_0, TRUE17_tree);
					}

					}
					break;
				case 2 :
					// HC.g:175:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE18=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom501); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE18_tree = (AST)adaptor.create(FALSE18);
					adaptor.addChild(root_0, FALSE18_tree);
					}

					}
					break;
				case 3 :
					// HC.g:176:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_comparison_in_atom524);
					comparison19=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison19.getTree());

					}
					break;
				case 4 :
					// HC.g:177:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_predicate_in_atom545);
					predicate20=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate20.getTree());

					}
					break;
				case 5 :
					// HC.g:178:15
					{
					root_0 = (AST)adaptor.nil();


					char_literal21=(Token)match(input,74,FOLLOW_74_in_atom580); if (state.failed) return retval;
					pushFollow(FOLLOW_atom_in_atom583);
					atom22=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom22.getTree());

					char_literal23=(Token)match(input,75,FOLLOW_75_in_atom585); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 5, atom_StartIndex); }

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
	// HC.g:180:1
	public final HCParser.comparison_return comparison() throws RecognitionException {
		HCParser.comparison_return retval = new HCParser.comparison_return();
		retval.start = input.LT(1);
		int comparison_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope term24 =null;
		ParserRuleReturnScope copr25 =null;
		ParserRuleReturnScope term26 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// HC.g:180:13
			// HC.g:180:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_comparison623);
			term24=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term24.getTree());

			pushFollow(FOLLOW_copr_in_comparison625);
			copr25=copr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(copr25.getTree(), root_0);
			pushFollow(FOLLOW_term_in_comparison628);
			term26=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 6, comparison_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class predicate_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// HC.g:181:1
	public final HCParser.predicate_return predicate() throws RecognitionException {
		HCParser.predicate_return retval = new HCParser.predicate_return();
		retval.start = input.LT(1);
		int predicate_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal27=null;
		Token char_literal29=null;
		ParserRuleReturnScope termList28 =null;

		AST t_tree=null;
		AST char_literal27_tree=null;
		AST char_literal29_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// HC.g:181:13
			// HC.g:181:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_predicate642); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
			}

			if ( state.backtracking==0 ) { setType(t,PREDICATE); }
			char_literal27=(Token)match(input,74,FOLLOW_74_in_predicate647); if (state.failed) return retval;
			pushFollow(FOLLOW_termList_in_predicate650);
			termList28=termList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, termList28.getTree());

			char_literal29=(Token)match(input,75,FOLLOW_75_in_predicate652); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 7, predicate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class copr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "copr"
	// HC.g:183:1
	public final HCParser.copr_return copr() throws RecognitionException {
		HCParser.copr_return retval = new HCParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token set30=null;

		AST set30_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// HC.g:183:13
			// HC.g:
			{
			root_0 = (AST)adaptor.nil();


			set30=input.LT(1);
			if ( (input.LA(1) >= EQ && input.LA(1) <= EQUIV)||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==IS||(input.LA(1) >= LE && input.LA(1) <= LT)||input.LA(1)==NE||(input.LA(1) >= NOTEQUIV && input.LA(1) <= NOTUNIFIES)||input.LA(1)==UNIFIES ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set30));
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
			if ( state.backtracking>0 ) { memoize(input, 8, copr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "copr"


	public static class termList_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "termList"
	// HC.g:194:1
	public final HCParser.termList_return termList() throws RecognitionException {
		HCParser.termList_return retval = new HCParser.termList_return();
		retval.start = input.LT(1);
		int termList_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal32=null;
		ParserRuleReturnScope term31 =null;
		ParserRuleReturnScope term33 =null;

		AST char_literal32_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// HC.g:194:13
			// HC.g:194:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_term_in_termList925);
			term31=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term31.getTree());

			// HC.g:194:22
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==76) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// HC.g:194:23
					{
					char_literal32=(Token)match(input,76,FOLLOW_76_in_termList928); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_termList931);
					term33=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term33.getTree());

					}
					break;

				default :
					break loop6;
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
			if ( state.backtracking>0 ) { memoize(input, 9, termList_StartIndex); }

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
	// HC.g:195:1
	public final HCParser.term_return term() throws RecognitionException {
		HCParser.term_return retval = new HCParser.term_return();
		retval.start = input.LT(1);
		int term_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope addTerm34 =null;
		ParserRuleReturnScope list35 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// HC.g:195:13
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==FLOAT||LA7_0==INTEGER||LA7_0==NAME||(LA7_0 >= STRING && LA7_0 <= SUB)||LA7_0==VARIABLE||LA7_0==74) ) {
				alt7=1;
			}
			else if ( (LA7_0==80) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// HC.g:195:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_addTerm_in_term950);
					addTerm34=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm34.getTree());

					}
					break;
				case 2 :
					// HC.g:195:27
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_list_in_term954);
					list35=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, list35.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 10, term_StartIndex); }

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
	// HC.g:197:1
	public final HCParser.addTerm_return addTerm() throws RecognitionException {
		HCParser.addTerm_return retval = new HCParser.addTerm_return();
		retval.start = input.LT(1);
		int addTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulTerm36 =null;
		ParserRuleReturnScope opr137 =null;
		ParserRuleReturnScope mulTerm38 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// HC.g:197:13
			// HC.g:197:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulTerm_in_addTerm969);
			mulTerm36=mulTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm36.getTree());

			// HC.g:197:25
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ADD||LA8_0==SUB) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// HC.g:197:27
					{
					pushFollow(FOLLOW_opr1_in_addTerm973);
					opr137=opr1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr137.getTree(), root_0);
					pushFollow(FOLLOW_mulTerm_in_addTerm976);
					mulTerm38=mulTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mulTerm38.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 11, addTerm_StartIndex); }

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
	// HC.g:198:1
	public final HCParser.mulTerm_return mulTerm() throws RecognitionException {
		HCParser.mulTerm_return retval = new HCParser.mulTerm_return();
		retval.start = input.LT(1);
		int mulTerm_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negTerm39 =null;
		ParserRuleReturnScope opr240 =null;
		ParserRuleReturnScope negTerm41 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// HC.g:198:13
			// HC.g:198:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negTerm_in_mulTerm993);
			negTerm39=negTerm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm39.getTree());

			// HC.g:198:25
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIV||(LA9_0 >= MOD && LA9_0 <= MUL)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// HC.g:198:27
					{
					pushFollow(FOLLOW_opr2_in_mulTerm997);
					opr240=opr2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(opr240.getTree(), root_0);
					pushFollow(FOLLOW_negTerm_in_mulTerm1000);
					negTerm41=negTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negTerm41.getTree());

					}
					break;

				default :
					break loop9;
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
			if ( state.backtracking>0 ) { memoize(input, 12, mulTerm_StartIndex); }

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
	// HC.g:199:1
	public final HCParser.negTerm_return negTerm() throws RecognitionException {
		HCParser.negTerm_return retval = new HCParser.negTerm_return();
		retval.start = input.LT(1);
		int negTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope atomicTerm42 =null;
		ParserRuleReturnScope atomicTerm43 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// HC.g:199:13
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==FLOAT||LA10_0==INTEGER||LA10_0==NAME||LA10_0==STRING||LA10_0==VARIABLE||LA10_0==74) ) {
				alt10=1;
			}
			else if ( (LA10_0==SUB) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// HC.g:199:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicTerm_in_negTerm1017);
					atomicTerm42=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm42.getTree());

					}
					break;
				case 2 :
					// HC.g:200:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_negTerm1037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,NEG); }
					pushFollow(FOLLOW_atomicTerm_in_negTerm1042);
					atomicTerm43=atomicTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTerm43.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 13, negTerm_StartIndex); }

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
	// HC.g:203:1
	public final HCParser.atomicTerm_return atomicTerm() throws RecognitionException {
		HCParser.atomicTerm_return retval = new HCParser.atomicTerm_return();
		retval.start = input.LT(1);
		int atomicTerm_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token INTEGER44=null;
		Token FLOAT45=null;
		Token STRING46=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token VARIABLE50=null;
		Token char_literal51=null;
		Token char_literal53=null;
		ParserRuleReturnScope termList48 =null;
		ParserRuleReturnScope addTerm52 =null;

		AST t_tree=null;
		AST INTEGER44_tree=null;
		AST FLOAT45_tree=null;
		AST STRING46_tree=null;
		AST char_literal47_tree=null;
		AST char_literal49_tree=null;
		AST VARIABLE50_tree=null;
		AST char_literal51_tree=null;
		AST char_literal53_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// HC.g:205:13
			int alt12=7;
			switch ( input.LA(1) ) {
			case INTEGER:
				{
				alt12=1;
				}
				break;
			case FLOAT:
				{
				alt12=2;
				}
				break;
			case STRING:
				{
				alt12=3;
				}
				break;
			case NAME:
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4==EOF||LA12_4==ADD||LA12_4==DIV||(LA12_4 >= EQ && LA12_4 <= EQUIV)||(LA12_4 >= GE && LA12_4 <= GT)||LA12_4==IS||(LA12_4 >= LE && LA12_4 <= LT)||(LA12_4 >= MOD && LA12_4 <= MUL)||LA12_4==NE||(LA12_4 >= NOTEQUIV && LA12_4 <= NOTUNIFIES)||LA12_4==SUB||LA12_4==UNIFIES||(LA12_4 >= 75 && LA12_4 <= 77)||LA12_4==79||(LA12_4 >= 81 && LA12_4 <= 82)) ) {
					alt12=4;
				}
				else if ( (LA12_4==74) ) {
					alt12=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARIABLE:
				{
				alt12=6;
				}
				break;
			case 74:
				{
				alt12=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// HC.g:205:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER44=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomicTerm1084); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTEGER44_tree = (AST)adaptor.create(INTEGER44);
					adaptor.addChild(root_0, INTEGER44_tree);
					}

					}
					break;
				case 2 :
					// HC.g:206:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT45=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomicTerm1102); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOAT45_tree = (AST)adaptor.create(FLOAT45);
					adaptor.addChild(root_0, FLOAT45_tree);
					}

					}
					break;
				case 3 :
					// HC.g:207:17
					{
					root_0 = (AST)adaptor.nil();


					STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_atomicTerm1120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING46_tree = (AST)adaptor.create(STRING46);
					adaptor.addChild(root_0, STRING46_tree);
					}

					}
					break;
				case 4 :
					// HC.g:208:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1140); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,CONSTANT); }
					}
					break;
				case 5 :
					// HC.g:209:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicTerm1163); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);
					}

					if ( state.backtracking==0 ) { setType(t,FUNCTION); }
					char_literal47=(Token)match(input,74,FOLLOW_74_in_atomicTerm1168); if (state.failed) return retval;
					// HC.g:209:56
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==FLOAT||LA11_0==INTEGER||LA11_0==NAME||(LA11_0 >= STRING && LA11_0 <= SUB)||LA11_0==VARIABLE||LA11_0==74||LA11_0==80) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// HC.g:209:56
							{
							pushFollow(FOLLOW_termList_in_atomicTerm1171);
							termList48=termList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, termList48.getTree());

							}
							break;

					}

					char_literal49=(Token)match(input,75,FOLLOW_75_in_atomicTerm1174); if (state.failed) return retval;
					}
					break;
				case 6 :
					// HC.g:210:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE50=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atomicTerm1193); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE50_tree = (AST)adaptor.create(VARIABLE50);
					adaptor.addChild(root_0, VARIABLE50_tree);
					}

					}
					break;
				case 7 :
					// HC.g:211:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal51=(Token)match(input,74,FOLLOW_74_in_atomicTerm1211); if (state.failed) return retval;
					pushFollow(FOLLOW_addTerm_in_atomicTerm1214);
					addTerm52=addTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addTerm52.getTree());

					char_literal53=(Token)match(input,75,FOLLOW_75_in_atomicTerm1216); if (state.failed) return retval;
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
			if ( state.backtracking>0 ) { memoize(input, 14, atomicTerm_StartIndex); }

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
	// HC.g:214:1
	public final HCParser.list_return list() throws RecognitionException {
		HCParser.list_return retval = new HCParser.list_return();
		retval.start = input.LT(1);
		int list_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal54=null;
		ParserRuleReturnScope listTail55 =null;

		AST t_tree=null;
		AST char_literal54_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// HC.g:216:13
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==80) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==81) ) {
					alt13=1;
				}
				else if ( (LA13_1==FLOAT||LA13_1==INTEGER||LA13_1==NAME||(LA13_1 >= STRING && LA13_1 <= SUB)||LA13_1==VARIABLE||LA13_1==74||LA13_1==80) ) {
					alt13=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// HC.g:216:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_list1261); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);
					}

					if ( state.backtracking==0 ) { setType(t,NIL); }
					char_literal54=(Token)match(input,81,FOLLOW_81_in_list1266); if (state.failed) return retval;
					}
					break;
				case 2 :
					// HC.g:217:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,80,FOLLOW_80_in_list1287); if (state.failed) return retval;
					pushFollow(FOLLOW_listTail_in_list1290);
					listTail55=listTail();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, listTail55.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 15, list_StartIndex); }

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
	// HC.g:220:1
	public final HCParser.listTail_return listTail() throws RecognitionException {
		HCParser.listTail_return retval = new HCParser.listTail_return();
		retval.start = input.LT(1);
		int listTail_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token VARIABLE57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope term56 =null;
		ParserRuleReturnScope list59 =null;
		ParserRuleReturnScope listTail61 =null;

		AST t_tree=null;
		AST VARIABLE57_tree=null;
		AST char_literal58_tree=null;
		AST char_literal60_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_listTail=new RewriteRuleSubtreeStream(adaptor,"rule listTail");
		RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// HC.g:220:13
			// HC.g:220:17
			{
			pushFollow(FOLLOW_term_in_listTail1316);
			term56=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term56.getTree());
			// HC.g:221:13
			int alt14=4;
			switch ( input.LA(1) ) {
			case 82:
				{
				int LA14_1 = input.LA(2);
				if ( (LA14_1==VARIABLE) ) {
					alt14=1;
				}
				else if ( (LA14_1==80) ) {
					alt14=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 76:
				{
				alt14=3;
				}
				break;
			case 81:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// HC.g:222:17
					{
					t=(Token)match(input,82,FOLLOW_82_in_listTail1360); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(t);

					VARIABLE57=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_listTail1362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE57);

					char_literal58=(Token)match(input,81,FOLLOW_81_in_listTail1364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal58);


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
					// 222:36: -> ^( CONS[$t] term VARIABLE )
					{
						// HC.g:222:39
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
					// HC.g:223:17
					{
					t=(Token)match(input,82,FOLLOW_82_in_listTail1395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(t);

					pushFollow(FOLLOW_list_in_listTail1397);
					list59=list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_list.add(list59.getTree());
					char_literal60=(Token)match(input,81,FOLLOW_81_in_listTail1399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal60);


					// AST REWRITE
					// elements: list, term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 223:36: -> ^( CONS[$t] term list )
					{
						// HC.g:223:39
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
					// HC.g:224:17
					{
					t=(Token)match(input,76,FOLLOW_76_in_listTail1434); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(t);

					pushFollow(FOLLOW_listTail_in_listTail1436);
					listTail61=listTail();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_listTail.add(listTail61.getTree());

					// AST REWRITE
					// elements: term, listTail
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 224:36: -> ^( CONS[$t] term listTail )
					{
						// HC.g:224:39
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
					// HC.g:225:17
					{
					t=(Token)match(input,81,FOLLOW_81_in_listTail1471); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(t);


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
					// 225:36: -> ^( CONS[$t] term NIL[$t] )
					{
						// HC.g:225:39
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
			if ( state.backtracking>0 ) { memoize(input, 16, listTail_StartIndex); }

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
	// HC.g:229:1
	public final HCParser.opr1_return opr1() throws RecognitionException {
		HCParser.opr1_return retval = new HCParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token set62=null;

		AST set62_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// HC.g:229:13
			// HC.g:
			{
			root_0 = (AST)adaptor.nil();


			set62=input.LT(1);
			if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set62));
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
			if ( state.backtracking>0 ) { memoize(input, 17, opr1_StartIndex); }

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
	// HC.g:230:1
	public final HCParser.opr2_return opr2() throws RecognitionException {
		HCParser.opr2_return retval = new HCParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token set63=null;

		AST set63_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// HC.g:230:13
			// HC.g:
			{
			root_0 = (AST)adaptor.nil();


			set63=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MUL) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set63));
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
			if ( state.backtracking>0 ) { memoize(input, 18, opr2_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "opr2"

	// $ANTLR start synpred1_HC
	public final void synpred1_HC_fragment() throws RecognitionException {
		// HC.g:144:17
		// HC.g:144:18
		{
		pushFollow(FOLLOW_predicate_in_synpred1_HC218);
		predicate();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred1_HC220); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_HC

	// $ANTLR start synpred2_HC
	public final void synpred2_HC_fragment() throws RecognitionException {
		// HC.g:145:17
		// HC.g:145:18
		{
		pushFollow(FOLLOW_predicate_in_synpred2_HC260);
		predicate();
		state._fsp--;
		if (state.failed) return;

		match(input,77,FOLLOW_77_in_synpred2_HC262); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_HC

	// $ANTLR start synpred3_HC
	public final void synpred3_HC_fragment() throws RecognitionException {
		// HC.g:176:17
		// HC.g:176:18
		{
		pushFollow(FOLLOW_comparison_in_synpred3_HC520);
		comparison();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_HC

	// Delegated rules

	public final boolean synpred1_HC() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_HC_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_HC() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_HC_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_HC() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_HC_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_hornClause_in_cunit189 = new BitSet(new long[]{0x5800440080600000L,0x0000000000010608L});
	public static final BitSet FOLLOW_EOF_in_cunit192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_hornClause225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_hornClause227 = new BitSet(new long[]{0x5800440080600000L,0x0000000000010608L});
	public static final BitSet FOLLOW_body_in_hornClause229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_hornClause231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_hornClause268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_hornClause270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_body_in_hornClause306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_hornClause308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subgoal_in_body387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_body391 = new BitSet(new long[]{0x5800440080600000L,0x0000000000010608L});
	public static final BitSet FOLLOW_subgoal_in_body394 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_73_in_subgoal414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_subgoal434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_subgoal450 = new BitSet(new long[]{0x5800040080600000L,0x0000000000010408L});
	public static final BitSet FOLLOW_atom_in_subgoal453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_atom483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atom501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_atom524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_atom545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_atom580 = new BitSet(new long[]{0x5800040080600000L,0x0000000000010408L});
	public static final BitSet FOLLOW_atom_in_atom583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atom585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_comparison623 = new BitSet(new long[]{0x0001883106018000L,0x0000000000000002L});
	public static final BitSet FOLLOW_copr_in_comparison625 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010408L});
	public static final BitSet FOLLOW_term_in_comparison628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_predicate642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_predicate647 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010408L});
	public static final BitSet FOLLOW_termList_in_predicate650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_predicate652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_termList925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_termList928 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010408L});
	public static final BitSet FOLLOW_term_in_termList931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_addTerm_in_term950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_term954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm969 = new BitSet(new long[]{0x1000000000000022L});
	public static final BitSet FOLLOW_opr1_in_addTerm973 = new BitSet(new long[]{0x1800040080400000L,0x0000000000000408L});
	public static final BitSet FOLLOW_mulTerm_in_addTerm976 = new BitSet(new long[]{0x1000000000000022L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm993 = new BitSet(new long[]{0x0000018000002002L});
	public static final BitSet FOLLOW_opr2_in_mulTerm997 = new BitSet(new long[]{0x1800040080400000L,0x0000000000000408L});
	public static final BitSet FOLLOW_negTerm_in_mulTerm1000 = new BitSet(new long[]{0x0000018000002002L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_negTerm1037 = new BitSet(new long[]{0x0800040080400000L,0x0000000000000408L});
	public static final BitSet FOLLOW_atomicTerm_in_negTerm1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomicTerm1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomicTerm1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atomicTerm1120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicTerm1163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_atomicTerm1168 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010C08L});
	public static final BitSet FOLLOW_termList_in_atomicTerm1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atomicTerm1174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atomicTerm1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_atomicTerm1211 = new BitSet(new long[]{0x1800040080400000L,0x0000000000000408L});
	public static final BitSet FOLLOW_addTerm_in_atomicTerm1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_atomicTerm1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_list1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_list1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_list1287 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010408L});
	public static final BitSet FOLLOW_listTail_in_list1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_listTail1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000061000L});
	public static final BitSet FOLLOW_82_in_listTail1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_in_listTail1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_listTail1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_listTail1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_list_in_listTail1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_listTail1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_listTail1434 = new BitSet(new long[]{0x1800040080400000L,0x0000000000010408L});
	public static final BitSet FOLLOW_listTail_in_listTail1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_listTail1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred1_HC218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred1_HC220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_predicate_in_synpred2_HC260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_synpred2_HC262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_synpred3_HC520 = new BitSet(new long[]{0x0000000000000002L});
}
