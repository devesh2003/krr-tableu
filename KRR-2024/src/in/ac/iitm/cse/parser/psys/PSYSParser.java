// $ANTLR 3.5.3 PSYS.g 2024-02-25 16:03:25

package in.ac.iitm.cse.parser.psys;
import  in.ac.iitm.cse.tree.AST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PSYSParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ACTIONS", "ADD", "AND", 
		"ATTRIBUTE", "B", "C", "COMMENT", "CONDITIONS", "CONSTANT", "D", "DEFINED", 
		"DIV", "E", "EQ", "ESC_SEQ", "EXPONENT", "F", "FALSE", "FLOAT", "G", "GE", 
		"GT", "H", "HEX_DIGIT", "I", "IF", "INSERT", "INTEGER", "J", "K", "L", 
		"LE", "LT", "M", "MOD", "MODIFY", "MUL", "N", "NAME", "NE", "NEG", "NOT", 
		"O", "OCTAL_ESC", "OR", "P", "PROGRAM", "Q", "R", "REMOVE", "RULE", "S", 
		"STRING", "SUB", "T", "TEST", "THEN", "TRUE", "TYPE", "U", "UNDEFINED", 
		"UNICODE_ESC", "V", "VARIABLE", "W", "WME", "WME_CTOR", "WME_TEST", "WS", 
		"X", "Y", "Z", "'('", "')'", "':'", "';'", "'['", "']'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int A=4;
	public static final int ACTIONS=5;
	public static final int ADD=6;
	public static final int AND=7;
	public static final int ATTRIBUTE=8;
	public static final int B=9;
	public static final int C=10;
	public static final int COMMENT=11;
	public static final int CONDITIONS=12;
	public static final int CONSTANT=13;
	public static final int D=14;
	public static final int DEFINED=15;
	public static final int DIV=16;
	public static final int E=17;
	public static final int EQ=18;
	public static final int ESC_SEQ=19;
	public static final int EXPONENT=20;
	public static final int F=21;
	public static final int FALSE=22;
	public static final int FLOAT=23;
	public static final int G=24;
	public static final int GE=25;
	public static final int GT=26;
	public static final int H=27;
	public static final int HEX_DIGIT=28;
	public static final int I=29;
	public static final int IF=30;
	public static final int INSERT=31;
	public static final int INTEGER=32;
	public static final int J=33;
	public static final int K=34;
	public static final int L=35;
	public static final int LE=36;
	public static final int LT=37;
	public static final int M=38;
	public static final int MOD=39;
	public static final int MODIFY=40;
	public static final int MUL=41;
	public static final int N=42;
	public static final int NAME=43;
	public static final int NE=44;
	public static final int NEG=45;
	public static final int NOT=46;
	public static final int O=47;
	public static final int OCTAL_ESC=48;
	public static final int OR=49;
	public static final int P=50;
	public static final int PROGRAM=51;
	public static final int Q=52;
	public static final int R=53;
	public static final int REMOVE=54;
	public static final int RULE=55;
	public static final int S=56;
	public static final int STRING=57;
	public static final int SUB=58;
	public static final int T=59;
	public static final int TEST=60;
	public static final int THEN=61;
	public static final int TRUE=62;
	public static final int TYPE=63;
	public static final int U=64;
	public static final int UNDEFINED=65;
	public static final int UNICODE_ESC=66;
	public static final int V=67;
	public static final int VARIABLE=68;
	public static final int W=69;
	public static final int WME=70;
	public static final int WME_CTOR=71;
	public static final int WME_TEST=72;
	public static final int WS=73;
	public static final int X=74;
	public static final int Y=75;
	public static final int Z=76;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PSYSParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PSYSParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PSYSParser.tokenNames; }
	@Override public String getGrammarFileName() { return "PSYS.g"; }


	    void setType(CommonTree t, int type) { t.getToken().setType(type); }
	    void setType(Token t, int type) { t.setType(type); }

	    private Token curAttribute=null;
	    private AST curAttrTree() {
	        return (AST) adaptor.create(curAttribute);
	    }


	public static class cunit_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cunit"
	// PSYS.g:145:1
	public final PSYSParser.cunit_return cunit() throws RecognitionException {
		PSYSParser.cunit_return retval = new PSYSParser.cunit_return();
		retval.start = input.LT(1);
		int cunit_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope sentence1 =null;

		RewriteRuleSubtreeStream stream_sentence=new RewriteRuleSubtreeStream(adaptor,"rule sentence");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// PSYS.g:145:13
			// PSYS.g:145:17
			{
			// PSYS.g:145:17
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IF||LA1_0==77) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// PSYS.g:145:17
					{
					pushFollow(FOLLOW_sentence_in_cunit215);
					sentence1=sentence();
					state._fsp--;

					stream_sentence.add(sentence1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}


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
			// 145:27: -> ^( PROGRAM ( sentence )* )
			{
				// PSYS.g:145:30
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// PSYS.g:145:40
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
	// PSYS.g:147:1
	public final PSYSParser.sentence_return sentence() throws RecognitionException {
		PSYSParser.sentence_return retval = new PSYSParser.sentence_return();
		retval.start = input.LT(1);
		int sentence_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal3=null;
		Token char_literal5=null;
		ParserRuleReturnScope rule2 =null;
		ParserRuleReturnScope wme4 =null;

		AST char_literal3_tree=null;
		AST char_literal5_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// PSYS.g:147:13
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==IF) ) {
				alt2=1;
			}
			else if ( (LA2_0==77) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// PSYS.g:147:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_rule_in_sentence239);
					rule2=rule();
					state._fsp--;

					adaptor.addChild(root_0, rule2.getTree());

					char_literal3=(Token)match(input,80,FOLLOW_80_in_sentence242); 
					}
					break;
				case 2 :
					// PSYS.g:148:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_wme_in_sentence261);
					wme4=wme();
					state._fsp--;

					adaptor.addChild(root_0, wme4.getTree());

					char_literal5=(Token)match(input,80,FOLLOW_80_in_sentence265); 
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


	public static class rule_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "rule"
	// PSYS.g:151:1
	public final PSYSParser.rule_return rule() throws RecognitionException {
		PSYSParser.rule_return retval = new PSYSParser.rule_return();
		retval.start = input.LT(1);
		int rule_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token THEN7=null;
		ParserRuleReturnScope conditions6 =null;
		ParserRuleReturnScope actions8 =null;

		AST t_tree=null;
		AST THEN7_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// PSYS.g:151:13
			// PSYS.g:151:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,IF,FOLLOW_IF_in_rule298); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,RULE); 
			pushFollow(FOLLOW_conditions_in_rule303);
			conditions6=conditions();
			state._fsp--;

			adaptor.addChild(root_0, conditions6.getTree());

			THEN7=(Token)match(input,THEN,FOLLOW_THEN_in_rule305); 
			pushFollow(FOLLOW_actions_in_rule308);
			actions8=actions();
			state._fsp--;

			adaptor.addChild(root_0, actions8.getTree());

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
	// $ANTLR end "rule"


	public static class conditions_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conditions"
	// PSYS.g:153:1
	public final PSYSParser.conditions_return conditions() throws RecognitionException {
		PSYSParser.conditions_return retval = new PSYSParser.conditions_return();
		retval.start = input.LT(1);
		int conditions_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope condition9 =null;

		RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// PSYS.g:153:13
			// PSYS.g:153:17
			{
			// PSYS.g:153:17
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==SUB||LA3_0==77) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// PSYS.g:153:17
					{
					pushFollow(FOLLOW_condition_in_conditions320);
					condition9=condition();
					state._fsp--;

					stream_condition.add(condition9.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}


			// AST REWRITE
			// elements: condition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 153:29: -> ^( CONDITIONS ( condition )+ )
			{
				// PSYS.g:153:32
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITIONS, "CONDITIONS"), root_1);
				if ( !(stream_condition.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_condition.hasNext() ) {
					adaptor.addChild(root_1, stream_condition.nextTree());
				}
				stream_condition.reset();

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
	// $ANTLR end "conditions"


	public static class actions_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "actions"
	// PSYS.g:154:1
	public final PSYSParser.actions_return actions() throws RecognitionException {
		PSYSParser.actions_return retval = new PSYSParser.actions_return();
		retval.start = input.LT(1);
		int actions_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope action10 =null;

		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// PSYS.g:154:13
			// PSYS.g:154:17
			{
			// PSYS.g:154:17
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==INSERT||LA4_0==MODIFY||LA4_0==REMOVE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// PSYS.g:154:17
					{
					pushFollow(FOLLOW_action_in_actions345);
					action10=action();
					state._fsp--;

					stream_action.add(action10.getTree());
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}


			// AST REWRITE
			// elements: action
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 154:29: -> ^( ACTIONS ( action )+ )
			{
				// PSYS.g:154:32
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(ACTIONS, "ACTIONS"), root_1);
				if ( !(stream_action.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_1, stream_action.nextTree());
				}
				stream_action.reset();

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
	// $ANTLR end "actions"


	public static class condition_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// PSYS.g:156:1
	public final PSYSParser.condition_return condition() throws RecognitionException {
		PSYSParser.condition_return retval = new PSYSParser.condition_return();
		retval.start = input.LT(1);
		int condition_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope wmeTest11 =null;
		ParserRuleReturnScope wmeTest12 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// PSYS.g:156:13
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==77) ) {
				alt5=1;
			}
			else if ( (LA5_0==SUB) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// PSYS.g:156:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_wmeTest_in_condition372);
					wmeTest11=wmeTest();
					state._fsp--;

					adaptor.addChild(root_0, wmeTest11.getTree());

					}
					break;
				case 2 :
					// PSYS.g:157:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_condition392); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NOT); 
					pushFollow(FOLLOW_wmeTest_in_condition397);
					wmeTest12=wmeTest();
					state._fsp--;

					adaptor.addChild(root_0, wmeTest12.getTree());

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
	// $ANTLR end "condition"


	public static class action_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "action"
	// PSYS.g:160:1
	public final PSYSParser.action_return action() throws RecognitionException {
		PSYSParser.action_return retval = new PSYSParser.action_return();
		retval.start = input.LT(1);
		int action_StartIndex = input.index();

		AST root_0 = null;

		Token INSERT13=null;
		Token MODIFY15=null;
		Token INTEGER16=null;
		Token char_literal17=null;
		Token char_literal19=null;
		Token REMOVE20=null;
		Token INTEGER21=null;
		ParserRuleReturnScope wmeCtor14 =null;
		ParserRuleReturnScope attrCtor18 =null;

		AST INSERT13_tree=null;
		AST MODIFY15_tree=null;
		AST INTEGER16_tree=null;
		AST char_literal17_tree=null;
		AST char_literal19_tree=null;
		AST REMOVE20_tree=null;
		AST INTEGER21_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// PSYS.g:160:13
			int alt6=3;
			switch ( input.LA(1) ) {
			case INSERT:
				{
				alt6=1;
				}
				break;
			case MODIFY:
				{
				alt6=2;
				}
				break;
			case REMOVE:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// PSYS.g:160:17
					{
					root_0 = (AST)adaptor.nil();


					INSERT13=(Token)match(input,INSERT,FOLLOW_INSERT_in_action425); 
					INSERT13_tree = (AST)adaptor.create(INSERT13);
					root_0 = (AST)adaptor.becomeRoot(INSERT13_tree, root_0);

					pushFollow(FOLLOW_wmeCtor_in_action428);
					wmeCtor14=wmeCtor();
					state._fsp--;

					adaptor.addChild(root_0, wmeCtor14.getTree());

					}
					break;
				case 2 :
					// PSYS.g:161:17
					{
					root_0 = (AST)adaptor.nil();


					MODIFY15=(Token)match(input,MODIFY,FOLLOW_MODIFY_in_action446); 
					MODIFY15_tree = (AST)adaptor.create(MODIFY15);
					root_0 = (AST)adaptor.becomeRoot(MODIFY15_tree, root_0);

					INTEGER16=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_action449); 
					INTEGER16_tree = (AST)adaptor.create(INTEGER16);
					adaptor.addChild(root_0, INTEGER16_tree);

					char_literal17=(Token)match(input,77,FOLLOW_77_in_action451); 
					pushFollow(FOLLOW_attrCtor_in_action454);
					attrCtor18=attrCtor();
					state._fsp--;

					adaptor.addChild(root_0, attrCtor18.getTree());

					char_literal19=(Token)match(input,78,FOLLOW_78_in_action456); 
					}
					break;
				case 3 :
					// PSYS.g:162:17
					{
					root_0 = (AST)adaptor.nil();


					REMOVE20=(Token)match(input,REMOVE,FOLLOW_REMOVE_in_action475); 
					REMOVE20_tree = (AST)adaptor.create(REMOVE20);
					root_0 = (AST)adaptor.becomeRoot(REMOVE20_tree, root_0);

					INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_action478); 
					INTEGER21_tree = (AST)adaptor.create(INTEGER21);
					adaptor.addChild(root_0, INTEGER21_tree);

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
	// $ANTLR end "action"


	public static class wme_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "wme"
	// PSYS.g:165:1
	public final PSYSParser.wme_return wme() throws RecognitionException {
		PSYSParser.wme_return retval = new PSYSParser.wme_return();
		retval.start = input.LT(1);
		int wme_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal24=null;
		ParserRuleReturnScope type22 =null;
		ParserRuleReturnScope attrValue23 =null;

		AST t_tree=null;
		AST char_literal24_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// PSYS.g:165:13
			// PSYS.g:165:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,77,FOLLOW_77_in_wme511); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,WME); 
			pushFollow(FOLLOW_type_in_wme521);
			type22=type();
			state._fsp--;

			adaptor.addChild(root_0, type22.getTree());

			// PSYS.g:165:55
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==NAME) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// PSYS.g:165:55
					{
					pushFollow(FOLLOW_attrValue_in_wme523);
					attrValue23=attrValue();
					state._fsp--;

					adaptor.addChild(root_0, attrValue23.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			char_literal24=(Token)match(input,78,FOLLOW_78_in_wme526); 
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
	// $ANTLR end "wme"


	public static class wmeTest_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "wmeTest"
	// PSYS.g:166:1
	public final PSYSParser.wmeTest_return wmeTest() throws RecognitionException {
		PSYSParser.wmeTest_return retval = new PSYSParser.wmeTest_return();
		retval.start = input.LT(1);
		int wmeTest_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal27=null;
		ParserRuleReturnScope type25 =null;
		ParserRuleReturnScope attrTest26 =null;

		AST t_tree=null;
		AST char_literal27_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// PSYS.g:166:13
			// PSYS.g:166:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,77,FOLLOW_77_in_wmeTest543); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,WME_TEST); 
			pushFollow(FOLLOW_type_in_wmeTest548);
			type25=type();
			state._fsp--;

			adaptor.addChild(root_0, type25.getTree());

			// PSYS.g:166:55
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==NAME) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// PSYS.g:166:55
					{
					pushFollow(FOLLOW_attrTest_in_wmeTest550);
					attrTest26=attrTest();
					state._fsp--;

					adaptor.addChild(root_0, attrTest26.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			char_literal27=(Token)match(input,78,FOLLOW_78_in_wmeTest554); 
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
	// $ANTLR end "wmeTest"


	public static class wmeCtor_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "wmeCtor"
	// PSYS.g:167:1
	public final PSYSParser.wmeCtor_return wmeCtor() throws RecognitionException {
		PSYSParser.wmeCtor_return retval = new PSYSParser.wmeCtor_return();
		retval.start = input.LT(1);
		int wmeCtor_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal30=null;
		ParserRuleReturnScope type28 =null;
		ParserRuleReturnScope attrCtor29 =null;

		AST t_tree=null;
		AST char_literal30_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// PSYS.g:167:13
			// PSYS.g:167:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,77,FOLLOW_77_in_wmeCtor571); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,WME_CTOR); 
			pushFollow(FOLLOW_type_in_wmeCtor576);
			type28=type();
			state._fsp--;

			adaptor.addChild(root_0, type28.getTree());

			// PSYS.g:167:55
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==NAME) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// PSYS.g:167:55
					{
					pushFollow(FOLLOW_attrCtor_in_wmeCtor578);
					attrCtor29=attrCtor();
					state._fsp--;

					adaptor.addChild(root_0, attrCtor29.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			char_literal30=(Token)match(input,78,FOLLOW_78_in_wmeCtor582); 
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
	// $ANTLR end "wmeCtor"


	public static class attrValue_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attrValue"
	// PSYS.g:169:1
	public final PSYSParser.attrValue_return attrValue() throws RecognitionException {
		PSYSParser.attrValue_return retval = new PSYSParser.attrValue_return();
		retval.start = input.LT(1);
		int attrValue_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal32=null;
		ParserRuleReturnScope attr31 =null;
		ParserRuleReturnScope constExpr233 =null;

		AST char_literal32_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// PSYS.g:169:13
			// PSYS.g:169:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_attr_in_attrValue596);
			attr31=attr();
			state._fsp--;

			root_0 = (AST)adaptor.becomeRoot(attr31.getTree(), root_0);
			char_literal32=(Token)match(input,79,FOLLOW_79_in_attrValue599); 
			pushFollow(FOLLOW_constExpr2_in_attrValue602);
			constExpr233=constExpr2();
			state._fsp--;

			adaptor.addChild(root_0, constExpr233.getTree());

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
	// $ANTLR end "attrValue"


	public static class attrCtor_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attrCtor"
	// PSYS.g:170:1
	public final PSYSParser.attrCtor_return attrCtor() throws RecognitionException {
		PSYSParser.attrCtor_return retval = new PSYSParser.attrCtor_return();
		retval.start = input.LT(1);
		int attrCtor_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal35=null;
		ParserRuleReturnScope attr34 =null;
		ParserRuleReturnScope evalExpr236 =null;

		AST char_literal35_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// PSYS.g:170:13
			// PSYS.g:170:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_attr_in_attrCtor615);
			attr34=attr();
			state._fsp--;

			root_0 = (AST)adaptor.becomeRoot(attr34.getTree(), root_0);
			char_literal35=(Token)match(input,79,FOLLOW_79_in_attrCtor618); 
			pushFollow(FOLLOW_evalExpr2_in_attrCtor621);
			evalExpr236=evalExpr2();
			state._fsp--;

			adaptor.addChild(root_0, evalExpr236.getTree());

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
	// $ANTLR end "attrCtor"


	public static class attrTest_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attrTest"
	// PSYS.g:171:1
	public final PSYSParser.attrTest_return attrTest() throws RecognitionException {
		PSYSParser.attrTest_return retval = new PSYSParser.attrTest_return();
		retval.start = input.LT(1);
		int attrTest_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal38=null;
		Token UNDEFINED39=null;
		Token char_literal41=null;
		Token DEFINED42=null;
		Token char_literal44=null;
		Token char_literal48=null;
		ParserRuleReturnScope attr37 =null;
		ParserRuleReturnScope attr40 =null;
		ParserRuleReturnScope attr43 =null;
		ParserRuleReturnScope evalExpr245 =null;
		ParserRuleReturnScope testExpr246 =null;
		ParserRuleReturnScope attr47 =null;
		ParserRuleReturnScope testExpr249 =null;

		AST char_literal38_tree=null;
		AST UNDEFINED39_tree=null;
		AST char_literal41_tree=null;
		AST DEFINED42_tree=null;
		AST char_literal44_tree=null;
		AST char_literal48_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// PSYS.g:172:13
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NAME) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==79) ) {
					switch ( input.LA(3) ) {
					case UNDEFINED:
						{
						alt11=1;
						}
						break;
					case DEFINED:
						{
						alt11=2;
						}
						break;
					case FALSE:
					case FLOAT:
					case INTEGER:
					case NAME:
					case STRING:
					case TRUE:
					case VARIABLE:
					case 81:
						{
						alt11=3;
						}
						break;
					case 83:
						{
						alt11=4;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// PSYS.g:172:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_attr_in_attrTest650);
					attr37=attr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(attr37.getTree(), root_0);
					char_literal38=(Token)match(input,79,FOLLOW_79_in_attrTest653); 
					UNDEFINED39=(Token)match(input,UNDEFINED,FOLLOW_UNDEFINED_in_attrTest656); 
					UNDEFINED39_tree = (AST)adaptor.create(UNDEFINED39);
					adaptor.addChild(root_0, UNDEFINED39_tree);

					}
					break;
				case 2 :
					// PSYS.g:173:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_attr_in_attrTest674);
					attr40=attr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(attr40.getTree(), root_0);
					char_literal41=(Token)match(input,79,FOLLOW_79_in_attrTest677); 
					DEFINED42=(Token)match(input,DEFINED,FOLLOW_DEFINED_in_attrTest680); 
					DEFINED42_tree = (AST)adaptor.create(DEFINED42);
					adaptor.addChild(root_0, DEFINED42_tree);

					}
					break;
				case 3 :
					// PSYS.g:174:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_attr_in_attrTest698);
					attr43=attr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(attr43.getTree(), root_0);
					char_literal44=(Token)match(input,79,FOLLOW_79_in_attrTest701); 
					pushFollow(FOLLOW_evalExpr2_in_attrTest704);
					evalExpr245=evalExpr2();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr245.getTree());

					// PSYS.g:174:38
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==83) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// PSYS.g:174:38
							{
							pushFollow(FOLLOW_testExpr2_in_attrTest706);
							testExpr246=testExpr2();
							state._fsp--;

							adaptor.addChild(root_0, testExpr246.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// PSYS.g:175:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_attr_in_attrTest725);
					attr47=attr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(attr47.getTree(), root_0);
					char_literal48=(Token)match(input,79,FOLLOW_79_in_attrTest728); 
					pushFollow(FOLLOW_testExpr2_in_attrTest731);
					testExpr249=testExpr2();
					state._fsp--;

					adaptor.addChild(root_0, testExpr249.getTree());

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
	// $ANTLR end "attrTest"


	public static class testExpr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "testExpr2"
	// PSYS.g:178:1
	public final PSYSParser.testExpr2_return testExpr2() throws RecognitionException {
		PSYSParser.testExpr2_return retval = new PSYSParser.testExpr2_return();
		retval.start = input.LT(1);
		int testExpr2_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token char_literal51=null;
		ParserRuleReturnScope testExpr50 =null;

		AST t_tree=null;
		AST char_literal51_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// PSYS.g:178:13
			// PSYS.g:178:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,83,FOLLOW_83_in_testExpr2758); 
			t_tree = (AST)adaptor.create(t);
			root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

			 setType(t,TEST); 
			pushFollow(FOLLOW_testExpr_in_testExpr2763);
			testExpr50=testExpr();
			state._fsp--;

			adaptor.addChild(root_0, testExpr50.getTree());

			char_literal51=(Token)match(input,84,FOLLOW_84_in_testExpr2765); 
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
	// $ANTLR end "testExpr2"


	public static class testExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "testExpr"
	// PSYS.g:179:1
	public final PSYSParser.testExpr_return testExpr() throws RecognitionException {
		PSYSParser.testExpr_return retval = new PSYSParser.testExpr_return();
		retval.start = input.LT(1);
		int testExpr_StartIndex = input.index();

		AST root_0 = null;

		Token OR53=null;
		ParserRuleReturnScope andTest52 =null;
		ParserRuleReturnScope andTest54 =null;

		AST OR53_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// PSYS.g:179:13
			// PSYS.g:179:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andTest_in_testExpr779);
			andTest52=andTest();
			state._fsp--;

			adaptor.addChild(root_0, andTest52.getTree());

			// PSYS.g:179:26
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==OR) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// PSYS.g:179:28
					{
					OR53=(Token)match(input,OR,FOLLOW_OR_in_testExpr784); 
					OR53_tree = (AST)adaptor.create(OR53);
					root_0 = (AST)adaptor.becomeRoot(OR53_tree, root_0);

					pushFollow(FOLLOW_andTest_in_testExpr789);
					andTest54=andTest();
					state._fsp--;

					adaptor.addChild(root_0, andTest54.getTree());

					}
					break;

				default :
					break loop12;
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
	// $ANTLR end "testExpr"


	public static class andTest_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andTest"
	// PSYS.g:180:1
	public final PSYSParser.andTest_return andTest() throws RecognitionException {
		PSYSParser.andTest_return retval = new PSYSParser.andTest_return();
		retval.start = input.LT(1);
		int andTest_StartIndex = input.index();

		AST root_0 = null;

		Token AND56=null;
		ParserRuleReturnScope notTest55 =null;
		ParserRuleReturnScope notTest57 =null;

		AST AND56_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// PSYS.g:180:13
			// PSYS.g:180:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_notTest_in_andTest806);
			notTest55=notTest();
			state._fsp--;

			adaptor.addChild(root_0, notTest55.getTree());

			// PSYS.g:180:26
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==AND) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// PSYS.g:180:28
					{
					AND56=(Token)match(input,AND,FOLLOW_AND_in_andTest811); 
					AND56_tree = (AST)adaptor.create(AND56);
					root_0 = (AST)adaptor.becomeRoot(AND56_tree, root_0);

					pushFollow(FOLLOW_notTest_in_andTest815);
					notTest57=notTest();
					state._fsp--;

					adaptor.addChild(root_0, notTest57.getTree());

					}
					break;

				default :
					break loop13;
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
	// $ANTLR end "andTest"


	public static class notTest_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "notTest"
	// PSYS.g:181:1
	public final PSYSParser.notTest_return notTest() throws RecognitionException {
		PSYSParser.notTest_return retval = new PSYSParser.notTest_return();
		retval.start = input.LT(1);
		int notTest_StartIndex = input.index();

		AST root_0 = null;

		Token NOT59=null;
		ParserRuleReturnScope testAtom58 =null;
		ParserRuleReturnScope notTest60 =null;

		AST NOT59_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// PSYS.g:181:13
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EQ||(LA14_0 >= GE && LA14_0 <= GT)||(LA14_0 >= LE && LA14_0 <= LT)||LA14_0==NE||LA14_0==77) ) {
				alt14=1;
			}
			else if ( (LA14_0==NOT) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// PSYS.g:181:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_testAtom_in_notTest832);
					testAtom58=testAtom();
					state._fsp--;

					adaptor.addChild(root_0, testAtom58.getTree());

					}
					break;
				case 2 :
					// PSYS.g:182:17
					{
					root_0 = (AST)adaptor.nil();


					NOT59=(Token)match(input,NOT,FOLLOW_NOT_in_notTest850); 
					NOT59_tree = (AST)adaptor.create(NOT59);
					root_0 = (AST)adaptor.becomeRoot(NOT59_tree, root_0);

					pushFollow(FOLLOW_notTest_in_notTest853);
					notTest60=notTest();
					state._fsp--;

					adaptor.addChild(root_0, notTest60.getTree());

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
	// $ANTLR end "notTest"


	public static class testAtom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "testAtom"
	// PSYS.g:184:1
	public final PSYSParser.testAtom_return testAtom() throws RecognitionException {
		PSYSParser.testAtom_return retval = new PSYSParser.testAtom_return();
		retval.start = input.LT(1);
		int testAtom_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal63=null;
		Token char_literal65=null;
		ParserRuleReturnScope copr61 =null;
		ParserRuleReturnScope evalExpr262 =null;
		ParserRuleReturnScope testExpr64 =null;

		AST char_literal63_tree=null;
		AST char_literal65_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_copr=new RewriteRuleSubtreeStream(adaptor,"rule copr");
		RewriteRuleSubtreeStream stream_evalExpr2=new RewriteRuleSubtreeStream(adaptor,"rule evalExpr2");
		RewriteRuleSubtreeStream stream_testExpr=new RewriteRuleSubtreeStream(adaptor,"rule testExpr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// PSYS.g:184:13
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==EQ||(LA15_0 >= GE && LA15_0 <= GT)||(LA15_0 >= LE && LA15_0 <= LT)||LA15_0==NE) ) {
				alt15=1;
			}
			else if ( (LA15_0==77) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// PSYS.g:184:17
					{
					pushFollow(FOLLOW_copr_in_testAtom878);
					copr61=copr();
					state._fsp--;

					stream_copr.add(copr61.getTree());
					pushFollow(FOLLOW_evalExpr2_in_testAtom880);
					evalExpr262=evalExpr2();
					state._fsp--;

					stream_evalExpr2.add(evalExpr262.getTree());

					// AST REWRITE
					// elements: evalExpr2, copr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 184:32: -> ^( copr evalExpr2 )
					{
						// PSYS.g:184:35
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_copr.nextNode(), root_1);
						adaptor.addChild(root_1, curAttrTree());
						adaptor.addChild(root_1, stream_evalExpr2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// PSYS.g:185:17
					{
					char_literal63=(Token)match(input,77,FOLLOW_77_in_testAtom908);  
					stream_77.add(char_literal63);

					pushFollow(FOLLOW_testExpr_in_testAtom910);
					testExpr64=testExpr();
					state._fsp--;

					stream_testExpr.add(testExpr64.getTree());
					char_literal65=(Token)match(input,78,FOLLOW_78_in_testAtom912);  
					stream_78.add(char_literal65);


					// AST REWRITE
					// elements: testExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 185:34: -> testExpr
					{
						adaptor.addChild(root_0, stream_testExpr.nextTree());
					}


					retval.tree = root_0;

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
	// $ANTLR end "testAtom"


	public static class evalExpr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "evalExpr2"
	// PSYS.g:207:1
	public final PSYSParser.evalExpr2_return evalExpr2() throws RecognitionException {
		PSYSParser.evalExpr2_return retval = new PSYSParser.evalExpr2_return();
		retval.start = input.LT(1);
		int evalExpr2_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope atomic66 =null;
		ParserRuleReturnScope evalExpr68 =null;

		AST char_literal67_tree=null;
		AST char_literal69_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// PSYS.g:207:13
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= FALSE && LA16_0 <= FLOAT)||LA16_0==INTEGER||LA16_0==NAME||LA16_0==STRING||LA16_0==TRUE||LA16_0==VARIABLE) ) {
				alt16=1;
			}
			else if ( (LA16_0==81) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// PSYS.g:207:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomic_in_evalExpr2944);
					atomic66=atomic();
					state._fsp--;

					adaptor.addChild(root_0, atomic66.getTree());

					}
					break;
				case 2 :
					// PSYS.g:208:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal67=(Token)match(input,81,FOLLOW_81_in_evalExpr2962); 
					pushFollow(FOLLOW_evalExpr_in_evalExpr2965);
					evalExpr68=evalExpr();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr68.getTree());

					char_literal69=(Token)match(input,82,FOLLOW_82_in_evalExpr2967); 
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
	// $ANTLR end "evalExpr2"


	public static class evalExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "evalExpr"
	// PSYS.g:210:1
	public final PSYSParser.evalExpr_return evalExpr() throws RecognitionException {
		PSYSParser.evalExpr_return retval = new PSYSParser.evalExpr_return();
		retval.start = input.LT(1);
		int evalExpr_StartIndex = input.index();

		AST root_0 = null;

		Token OR71=null;
		ParserRuleReturnScope andExpr70 =null;
		ParserRuleReturnScope andExpr72 =null;

		AST OR71_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// PSYS.g:210:13
			// PSYS.g:210:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andExpr_in_evalExpr993);
			andExpr70=andExpr();
			state._fsp--;

			adaptor.addChild(root_0, andExpr70.getTree());

			// PSYS.g:210:26
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==OR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// PSYS.g:210:28
					{
					OR71=(Token)match(input,OR,FOLLOW_OR_in_evalExpr998); 
					OR71_tree = (AST)adaptor.create(OR71);
					root_0 = (AST)adaptor.becomeRoot(OR71_tree, root_0);

					pushFollow(FOLLOW_andExpr_in_evalExpr1003);
					andExpr72=andExpr();
					state._fsp--;

					adaptor.addChild(root_0, andExpr72.getTree());

					}
					break;

				default :
					break loop17;
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
	// $ANTLR end "evalExpr"


	public static class andExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andExpr"
	// PSYS.g:211:1
	public final PSYSParser.andExpr_return andExpr() throws RecognitionException {
		PSYSParser.andExpr_return retval = new PSYSParser.andExpr_return();
		retval.start = input.LT(1);
		int andExpr_StartIndex = input.index();

		AST root_0 = null;

		Token AND74=null;
		ParserRuleReturnScope relExpr73 =null;
		ParserRuleReturnScope relExpr75 =null;

		AST AND74_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// PSYS.g:211:13
			// PSYS.g:211:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_relExpr_in_andExpr1020);
			relExpr73=relExpr();
			state._fsp--;

			adaptor.addChild(root_0, relExpr73.getTree());

			// PSYS.g:211:26
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==AND) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// PSYS.g:211:28
					{
					AND74=(Token)match(input,AND,FOLLOW_AND_in_andExpr1025); 
					AND74_tree = (AST)adaptor.create(AND74);
					root_0 = (AST)adaptor.becomeRoot(AND74_tree, root_0);

					pushFollow(FOLLOW_relExpr_in_andExpr1029);
					relExpr75=relExpr();
					state._fsp--;

					adaptor.addChild(root_0, relExpr75.getTree());

					}
					break;

				default :
					break loop18;
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


	public static class relExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "relExpr"
	// PSYS.g:212:1
	public final PSYSParser.relExpr_return relExpr() throws RecognitionException {
		PSYSParser.relExpr_return retval = new PSYSParser.relExpr_return();
		retval.start = input.LT(1);
		int relExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope sumExpr76 =null;
		ParserRuleReturnScope copr77 =null;
		ParserRuleReturnScope sumExpr78 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// PSYS.g:212:13
			// PSYS.g:212:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_sumExpr_in_relExpr1046);
			sumExpr76=sumExpr();
			state._fsp--;

			adaptor.addChild(root_0, sumExpr76.getTree());

			// PSYS.g:212:26
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==EQ||(LA19_0 >= GE && LA19_0 <= GT)||(LA19_0 >= LE && LA19_0 <= LT)||LA19_0==NE) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// PSYS.g:212:28
					{
					pushFollow(FOLLOW_copr_in_relExpr1051);
					copr77=copr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(copr77.getTree(), root_0);
					pushFollow(FOLLOW_sumExpr_in_relExpr1054);
					sumExpr78=sumExpr();
					state._fsp--;

					adaptor.addChild(root_0, sumExpr78.getTree());

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
	// $ANTLR end "relExpr"


	public static class sumExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "sumExpr"
	// PSYS.g:213:1
	public final PSYSParser.sumExpr_return sumExpr() throws RecognitionException {
		PSYSParser.sumExpr_return retval = new PSYSParser.sumExpr_return();
		retval.start = input.LT(1);
		int sumExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulExpr79 =null;
		ParserRuleReturnScope opr180 =null;
		ParserRuleReturnScope mulExpr81 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// PSYS.g:213:13
			// PSYS.g:213:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_sumExpr1071);
			mulExpr79=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr79.getTree());

			// PSYS.g:213:26
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==ADD||LA20_0==SUB) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// PSYS.g:213:28
					{
					pushFollow(FOLLOW_opr1_in_sumExpr1076);
					opr180=opr1();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr180.getTree(), root_0);
					pushFollow(FOLLOW_mulExpr_in_sumExpr1079);
					mulExpr81=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr81.getTree());

					}
					break;

				default :
					break loop20;
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
	// $ANTLR end "sumExpr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// PSYS.g:214:1
	public final PSYSParser.mulExpr_return mulExpr() throws RecognitionException {
		PSYSParser.mulExpr_return retval = new PSYSParser.mulExpr_return();
		retval.start = input.LT(1);
		int mulExpr_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negExpr82 =null;
		ParserRuleReturnScope opr283 =null;
		ParserRuleReturnScope negExpr84 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// PSYS.g:214:13
			// PSYS.g:214:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negExpr_in_mulExpr1096);
			negExpr82=negExpr();
			state._fsp--;

			adaptor.addChild(root_0, negExpr82.getTree());

			// PSYS.g:214:26
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==DIV||LA21_0==MOD||LA21_0==MUL) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// PSYS.g:214:28
					{
					pushFollow(FOLLOW_opr2_in_mulExpr1101);
					opr283=opr2();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr283.getTree(), root_0);
					pushFollow(FOLLOW_negExpr_in_mulExpr1104);
					negExpr84=negExpr();
					state._fsp--;

					adaptor.addChild(root_0, negExpr84.getTree());

					}
					break;

				default :
					break loop21;
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
	// PSYS.g:215:1
	public final PSYSParser.negExpr_return negExpr() throws RecognitionException {
		PSYSParser.negExpr_return retval = new PSYSParser.negExpr_return();
		retval.start = input.LT(1);
		int negExpr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token NOT87=null;
		ParserRuleReturnScope atom85 =null;
		ParserRuleReturnScope atom86 =null;
		ParserRuleReturnScope negExpr88 =null;

		AST t_tree=null;
		AST NOT87_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// PSYS.g:215:13
			int alt22=3;
			switch ( input.LA(1) ) {
			case FALSE:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case TRUE:
			case VARIABLE:
			case 77:
				{
				alt22=1;
				}
				break;
			case SUB:
				{
				alt22=2;
				}
				break;
			case NOT:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// PSYS.g:215:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atom_in_negExpr1121);
					atom85=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom85.getTree());

					}
					break;
				case 2 :
					// PSYS.g:216:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_negExpr1141); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NEG); 
					pushFollow(FOLLOW_atom_in_negExpr1146);
					atom86=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom86.getTree());

					}
					break;
				case 3 :
					// PSYS.g:217:17
					{
					root_0 = (AST)adaptor.nil();


					NOT87=(Token)match(input,NOT,FOLLOW_NOT_in_negExpr1164); 
					NOT87_tree = (AST)adaptor.create(NOT87);
					root_0 = (AST)adaptor.becomeRoot(NOT87_tree, root_0);

					pushFollow(FOLLOW_negExpr_in_negExpr1167);
					negExpr88=negExpr();
					state._fsp--;

					adaptor.addChild(root_0, negExpr88.getTree());

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
	// PSYS.g:219:1
	public final PSYSParser.atom_return atom() throws RecognitionException {
		PSYSParser.atom_return retval = new PSYSParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal90=null;
		Token char_literal92=null;
		ParserRuleReturnScope atomic89 =null;
		ParserRuleReturnScope evalExpr91 =null;

		AST char_literal90_tree=null;
		AST char_literal92_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// PSYS.g:219:13
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= FALSE && LA23_0 <= FLOAT)||LA23_0==INTEGER||LA23_0==NAME||LA23_0==STRING||LA23_0==TRUE||LA23_0==VARIABLE) ) {
				alt23=1;
			}
			else if ( (LA23_0==77) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// PSYS.g:219:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomic_in_atom1196);
					atomic89=atomic();
					state._fsp--;

					adaptor.addChild(root_0, atomic89.getTree());

					}
					break;
				case 2 :
					// PSYS.g:220:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal90=(Token)match(input,77,FOLLOW_77_in_atom1214); 
					pushFollow(FOLLOW_evalExpr_in_atom1217);
					evalExpr91=evalExpr();
					state._fsp--;

					adaptor.addChild(root_0, evalExpr91.getTree());

					char_literal92=(Token)match(input,78,FOLLOW_78_in_atom1219); 
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


	public static class atomic_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atomic"
	// PSYS.g:222:1
	public final PSYSParser.atomic_return atomic() throws RecognitionException {
		PSYSParser.atomic_return retval = new PSYSParser.atomic_return();
		retval.start = input.LT(1);
		int atomic_StartIndex = input.index();

		AST root_0 = null;

		Token VARIABLE94=null;
		ParserRuleReturnScope atomicConst93 =null;

		AST VARIABLE94_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// PSYS.g:222:13
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= FALSE && LA24_0 <= FLOAT)||LA24_0==INTEGER||LA24_0==NAME||LA24_0==STRING||LA24_0==TRUE) ) {
				alt24=1;
			}
			else if ( (LA24_0==VARIABLE) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// PSYS.g:222:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicConst_in_atomic1247);
					atomicConst93=atomicConst();
					state._fsp--;

					adaptor.addChild(root_0, atomicConst93.getTree());

					}
					break;
				case 2 :
					// PSYS.g:223:17
					{
					root_0 = (AST)adaptor.nil();


					VARIABLE94=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_atomic1265); 
					VARIABLE94_tree = (AST)adaptor.create(VARIABLE94);
					adaptor.addChild(root_0, VARIABLE94_tree);

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
	// $ANTLR end "atomic"


	public static class constExpr2_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constExpr2"
	// PSYS.g:226:1
	public final PSYSParser.constExpr2_return constExpr2() throws RecognitionException {
		PSYSParser.constExpr2_return retval = new PSYSParser.constExpr2_return();
		retval.start = input.LT(1);
		int constExpr2_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope atomicConst95 =null;
		ParserRuleReturnScope constExpr97 =null;

		AST char_literal96_tree=null;
		AST char_literal98_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// PSYS.g:226:13
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= FALSE && LA25_0 <= FLOAT)||LA25_0==INTEGER||LA25_0==NAME||LA25_0==STRING||LA25_0==TRUE) ) {
				alt25=1;
			}
			else if ( (LA25_0==81) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// PSYS.g:226:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicConst_in_constExpr21289);
					atomicConst95=atomicConst();
					state._fsp--;

					adaptor.addChild(root_0, atomicConst95.getTree());

					}
					break;
				case 2 :
					// PSYS.g:227:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal96=(Token)match(input,81,FOLLOW_81_in_constExpr21307); 
					pushFollow(FOLLOW_constExpr_in_constExpr21310);
					constExpr97=constExpr();
					state._fsp--;

					adaptor.addChild(root_0, constExpr97.getTree());

					char_literal98=(Token)match(input,82,FOLLOW_82_in_constExpr21312); 
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
	// $ANTLR end "constExpr2"


	public static class constExpr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constExpr"
	// PSYS.g:229:1
	public final PSYSParser.constExpr_return constExpr() throws RecognitionException {
		PSYSParser.constExpr_return retval = new PSYSParser.constExpr_return();
		retval.start = input.LT(1);
		int constExpr_StartIndex = input.index();

		AST root_0 = null;

		Token OR100=null;
		ParserRuleReturnScope andConst99 =null;
		ParserRuleReturnScope andConst101 =null;

		AST OR100_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// PSYS.g:229:13
			// PSYS.g:229:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_andConst_in_constExpr1337);
			andConst99=andConst();
			state._fsp--;

			adaptor.addChild(root_0, andConst99.getTree());

			// PSYS.g:229:27
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==OR) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// PSYS.g:229:29
					{
					OR100=(Token)match(input,OR,FOLLOW_OR_in_constExpr1342); 
					OR100_tree = (AST)adaptor.create(OR100);
					root_0 = (AST)adaptor.becomeRoot(OR100_tree, root_0);

					pushFollow(FOLLOW_andConst_in_constExpr1347);
					andConst101=andConst();
					state._fsp--;

					adaptor.addChild(root_0, andConst101.getTree());

					}
					break;

				default :
					break loop26;
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
	// $ANTLR end "constExpr"


	public static class andConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "andConst"
	// PSYS.g:230:1
	public final PSYSParser.andConst_return andConst() throws RecognitionException {
		PSYSParser.andConst_return retval = new PSYSParser.andConst_return();
		retval.start = input.LT(1);
		int andConst_StartIndex = input.index();

		AST root_0 = null;

		Token AND103=null;
		ParserRuleReturnScope relConst102 =null;
		ParserRuleReturnScope relConst104 =null;

		AST AND103_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// PSYS.g:230:13
			// PSYS.g:230:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_relConst_in_andConst1363);
			relConst102=relConst();
			state._fsp--;

			adaptor.addChild(root_0, relConst102.getTree());

			// PSYS.g:230:27
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==AND) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// PSYS.g:230:29
					{
					AND103=(Token)match(input,AND,FOLLOW_AND_in_andConst1368); 
					AND103_tree = (AST)adaptor.create(AND103);
					root_0 = (AST)adaptor.becomeRoot(AND103_tree, root_0);

					pushFollow(FOLLOW_relConst_in_andConst1372);
					relConst104=relConst();
					state._fsp--;

					adaptor.addChild(root_0, relConst104.getTree());

					}
					break;

				default :
					break loop27;
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
	// $ANTLR end "andConst"


	public static class relConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "relConst"
	// PSYS.g:231:1
	public final PSYSParser.relConst_return relConst() throws RecognitionException {
		PSYSParser.relConst_return retval = new PSYSParser.relConst_return();
		retval.start = input.LT(1);
		int relConst_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope sumConst105 =null;
		ParserRuleReturnScope copr106 =null;
		ParserRuleReturnScope sumConst107 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// PSYS.g:231:13
			// PSYS.g:231:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_sumConst_in_relConst1388);
			sumConst105=sumConst();
			state._fsp--;

			adaptor.addChild(root_0, sumConst105.getTree());

			// PSYS.g:231:27
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==EQ||(LA28_0 >= GE && LA28_0 <= GT)||(LA28_0 >= LE && LA28_0 <= LT)||LA28_0==NE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// PSYS.g:231:29
					{
					pushFollow(FOLLOW_copr_in_relConst1393);
					copr106=copr();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(copr106.getTree(), root_0);
					pushFollow(FOLLOW_sumConst_in_relConst1396);
					sumConst107=sumConst();
					state._fsp--;

					adaptor.addChild(root_0, sumConst107.getTree());

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
	// $ANTLR end "relConst"


	public static class sumConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "sumConst"
	// PSYS.g:232:1
	public final PSYSParser.sumConst_return sumConst() throws RecognitionException {
		PSYSParser.sumConst_return retval = new PSYSParser.sumConst_return();
		retval.start = input.LT(1);
		int sumConst_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope mulConst108 =null;
		ParserRuleReturnScope opr1109 =null;
		ParserRuleReturnScope mulConst110 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// PSYS.g:232:13
			// PSYS.g:232:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_mulConst_in_sumConst1412);
			mulConst108=mulConst();
			state._fsp--;

			adaptor.addChild(root_0, mulConst108.getTree());

			// PSYS.g:232:27
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==ADD||LA29_0==SUB) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// PSYS.g:232:29
					{
					pushFollow(FOLLOW_opr1_in_sumConst1417);
					opr1109=opr1();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr1109.getTree(), root_0);
					pushFollow(FOLLOW_mulConst_in_sumConst1420);
					mulConst110=mulConst();
					state._fsp--;

					adaptor.addChild(root_0, mulConst110.getTree());

					}
					break;

				default :
					break loop29;
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
	// $ANTLR end "sumConst"


	public static class mulConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "mulConst"
	// PSYS.g:233:1
	public final PSYSParser.mulConst_return mulConst() throws RecognitionException {
		PSYSParser.mulConst_return retval = new PSYSParser.mulConst_return();
		retval.start = input.LT(1);
		int mulConst_StartIndex = input.index();

		AST root_0 = null;

		ParserRuleReturnScope negConst111 =null;
		ParserRuleReturnScope opr2112 =null;
		ParserRuleReturnScope negConst113 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// PSYS.g:233:13
			// PSYS.g:233:17
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_negConst_in_mulConst1436);
			negConst111=negConst();
			state._fsp--;

			adaptor.addChild(root_0, negConst111.getTree());

			// PSYS.g:233:27
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==DIV||LA30_0==MOD||LA30_0==MUL) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// PSYS.g:233:29
					{
					pushFollow(FOLLOW_opr2_in_mulConst1441);
					opr2112=opr2();
					state._fsp--;

					root_0 = (AST)adaptor.becomeRoot(opr2112.getTree(), root_0);
					pushFollow(FOLLOW_negConst_in_mulConst1444);
					negConst113=negConst();
					state._fsp--;

					adaptor.addChild(root_0, negConst113.getTree());

					}
					break;

				default :
					break loop30;
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
	// $ANTLR end "mulConst"


	public static class negConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "negConst"
	// PSYS.g:234:1
	public final PSYSParser.negConst_return negConst() throws RecognitionException {
		PSYSParser.negConst_return retval = new PSYSParser.negConst_return();
		retval.start = input.LT(1);
		int negConst_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		ParserRuleReturnScope constAtom114 =null;
		ParserRuleReturnScope constAtom115 =null;
		ParserRuleReturnScope negConst116 =null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// PSYS.g:234:13
			int alt31=3;
			switch ( input.LA(1) ) {
			case FALSE:
			case FLOAT:
			case INTEGER:
			case NAME:
			case STRING:
			case TRUE:
			case 77:
				{
				alt31=1;
				}
				break;
			case SUB:
				{
				alt31=2;
				}
				break;
			case NOT:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// PSYS.g:234:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_constAtom_in_negConst1460);
					constAtom114=constAtom();
					state._fsp--;

					adaptor.addChild(root_0, constAtom114.getTree());

					}
					break;
				case 2 :
					// PSYS.g:235:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,SUB,FOLLOW_SUB_in_negConst1480); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					 setType(t,NEG); 
					pushFollow(FOLLOW_constAtom_in_negConst1485);
					constAtom115=constAtom();
					state._fsp--;

					adaptor.addChild(root_0, constAtom115.getTree());

					}
					break;
				case 3 :
					// PSYS.g:236:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NOT,FOLLOW_NOT_in_negConst1505); 
					t_tree = (AST)adaptor.create(t);
					root_0 = (AST)adaptor.becomeRoot(t_tree, root_0);

					pushFollow(FOLLOW_negConst_in_negConst1508);
					negConst116=negConst();
					state._fsp--;

					adaptor.addChild(root_0, negConst116.getTree());

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
	// $ANTLR end "negConst"


	public static class constAtom_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constAtom"
	// PSYS.g:238:1
	public final PSYSParser.constAtom_return constAtom() throws RecognitionException {
		PSYSParser.constAtom_return retval = new PSYSParser.constAtom_return();
		retval.start = input.LT(1);
		int constAtom_StartIndex = input.index();

		AST root_0 = null;

		Token char_literal118=null;
		Token char_literal120=null;
		ParserRuleReturnScope atomicConst117 =null;
		ParserRuleReturnScope constExpr119 =null;

		AST char_literal118_tree=null;
		AST char_literal120_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// PSYS.g:238:13
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= FALSE && LA32_0 <= FLOAT)||LA32_0==INTEGER||LA32_0==NAME||LA32_0==STRING||LA32_0==TRUE) ) {
				alt32=1;
			}
			else if ( (LA32_0==77) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// PSYS.g:238:17
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_atomicConst_in_constAtom1532);
					atomicConst117=atomicConst();
					state._fsp--;

					adaptor.addChild(root_0, atomicConst117.getTree());

					}
					break;
				case 2 :
					// PSYS.g:239:17
					{
					root_0 = (AST)adaptor.nil();


					char_literal118=(Token)match(input,77,FOLLOW_77_in_constAtom1550); 
					pushFollow(FOLLOW_constExpr_in_constAtom1553);
					constExpr119=constExpr();
					state._fsp--;

					adaptor.addChild(root_0, constExpr119.getTree());

					char_literal120=(Token)match(input,78,FOLLOW_78_in_constAtom1555); 
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
	// $ANTLR end "constAtom"


	public static class atomicConst_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atomicConst"
	// PSYS.g:242:1
	public final PSYSParser.atomicConst_return atomicConst() throws RecognitionException {
		PSYSParser.atomicConst_return retval = new PSYSParser.atomicConst_return();
		retval.start = input.LT(1);
		int atomicConst_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;
		Token TRUE121=null;
		Token FALSE122=null;
		Token INTEGER123=null;
		Token FLOAT124=null;

		AST t_tree=null;
		AST TRUE121_tree=null;
		AST FALSE122_tree=null;
		AST INTEGER123_tree=null;
		AST FLOAT124_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// PSYS.g:242:13
			int alt33=6;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt33=1;
				}
				break;
			case FALSE:
				{
				alt33=2;
				}
				break;
			case INTEGER:
				{
				alt33=3;
				}
				break;
			case FLOAT:
				{
				alt33=4;
				}
				break;
			case STRING:
				{
				alt33=5;
				}
				break;
			case NAME:
				{
				alt33=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// PSYS.g:242:17
					{
					root_0 = (AST)adaptor.nil();


					TRUE121=(Token)match(input,TRUE,FOLLOW_TRUE_in_atomicConst1579); 
					TRUE121_tree = (AST)adaptor.create(TRUE121);
					adaptor.addChild(root_0, TRUE121_tree);

					}
					break;
				case 2 :
					// PSYS.g:243:17
					{
					root_0 = (AST)adaptor.nil();


					FALSE122=(Token)match(input,FALSE,FOLLOW_FALSE_in_atomicConst1597); 
					FALSE122_tree = (AST)adaptor.create(FALSE122);
					adaptor.addChild(root_0, FALSE122_tree);

					}
					break;
				case 3 :
					// PSYS.g:244:17
					{
					root_0 = (AST)adaptor.nil();


					INTEGER123=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atomicConst1615); 
					INTEGER123_tree = (AST)adaptor.create(INTEGER123);
					adaptor.addChild(root_0, INTEGER123_tree);

					}
					break;
				case 4 :
					// PSYS.g:245:17
					{
					root_0 = (AST)adaptor.nil();


					FLOAT124=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_atomicConst1633); 
					FLOAT124_tree = (AST)adaptor.create(FLOAT124);
					adaptor.addChild(root_0, FLOAT124_tree);

					}
					break;
				case 5 :
					// PSYS.g:246:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,STRING,FOLLOW_STRING_in_atomicConst1653); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,CONSTANT); 
					}
					break;
				case 6 :
					// PSYS.g:247:17
					{
					root_0 = (AST)adaptor.nil();


					t=(Token)match(input,NAME,FOLLOW_NAME_in_atomicConst1676); 
					t_tree = (AST)adaptor.create(t);
					adaptor.addChild(root_0, t_tree);

					 setType(t,CONSTANT); 
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
	// $ANTLR end "atomicConst"


	public static class type_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "type"
	// PSYS.g:250:1
	public final PSYSParser.type_return type() throws RecognitionException {
		PSYSParser.type_return retval = new PSYSParser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// PSYS.g:250:13
			// PSYS.g:250:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_type1710); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,TYPE); 
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
	// $ANTLR end "type"


	public static class attr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "attr"
	// PSYS.g:251:1
	public final PSYSParser.attr_return attr() throws RecognitionException {
		PSYSParser.attr_return retval = new PSYSParser.attr_return();
		retval.start = input.LT(1);
		int attr_StartIndex = input.index();

		AST root_0 = null;

		Token t=null;

		AST t_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// PSYS.g:251:13
			// PSYS.g:251:17
			{
			root_0 = (AST)adaptor.nil();


			t=(Token)match(input,NAME,FOLLOW_NAME_in_attr1731); 
			t_tree = (AST)adaptor.create(t);
			adaptor.addChild(root_0, t_tree);

			 setType(t,ATTRIBUTE); 
			 curAttribute=t; 
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
	// $ANTLR end "attr"


	public static class copr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "copr"
	// PSYS.g:253:1
	public final PSYSParser.copr_return copr() throws RecognitionException {
		PSYSParser.copr_return retval = new PSYSParser.copr_return();
		retval.start = input.LT(1);
		int copr_StartIndex = input.index();

		AST root_0 = null;

		Token set125=null;

		AST set125_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// PSYS.g:253:13
			// PSYS.g:
			{
			root_0 = (AST)adaptor.nil();


			set125=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||(input.LA(1) >= LE && input.LA(1) <= LT)||input.LA(1)==NE ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set125));
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
	// $ANTLR end "copr"


	public static class opr1_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "opr1"
	// PSYS.g:254:1
	public final PSYSParser.opr1_return opr1() throws RecognitionException {
		PSYSParser.opr1_return retval = new PSYSParser.opr1_return();
		retval.start = input.LT(1);
		int opr1_StartIndex = input.index();

		AST root_0 = null;

		Token set126=null;

		AST set126_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// PSYS.g:254:13
			// PSYS.g:
			{
			root_0 = (AST)adaptor.nil();


			set126=input.LT(1);
			if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set126));
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
	// PSYS.g:255:1
	public final PSYSParser.opr2_return opr2() throws RecognitionException {
		PSYSParser.opr2_return retval = new PSYSParser.opr2_return();
		retval.start = input.LT(1);
		int opr2_StartIndex = input.index();

		AST root_0 = null;

		Token set127=null;

		AST set127_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// PSYS.g:255:13
			// PSYS.g:
			{
			root_0 = (AST)adaptor.nil();


			set127=input.LT(1);
			if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MUL ) {
				input.consume();
				adaptor.addChild(root_0, (AST)adaptor.create(set127));
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



	public static final BitSet FOLLOW_sentence_in_cunit215 = new BitSet(new long[]{0x0000000040000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_rule_in_sentence239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_sentence242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wme_in_sentence261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_sentence265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_rule298 = new BitSet(new long[]{0x0400000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conditions_in_rule303 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_THEN_in_rule305 = new BitSet(new long[]{0x0040010080000000L});
	public static final BitSet FOLLOW_actions_in_rule308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_conditions320 = new BitSet(new long[]{0x0400000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_action_in_actions345 = new BitSet(new long[]{0x0040010080000002L});
	public static final BitSet FOLLOW_wmeTest_in_condition372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_condition392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_wmeTest_in_condition397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_action425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_wmeCtor_in_action428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MODIFY_in_action446 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INTEGER_in_action449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_action451 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_attrCtor_in_action454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_action456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REMOVE_in_action475 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INTEGER_in_action478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_wme511 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_type_in_wme521 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_attrValue_in_wme523 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_wme526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_wmeTest543 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_type_in_wmeTest548 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_attrTest_in_wmeTest550 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_wmeTest554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_wmeCtor571 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_type_in_wmeCtor576 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_attrCtor_in_wmeCtor578 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_wmeCtor582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrValue596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrValue599 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000020000L});
	public static final BitSet FOLLOW_constExpr2_in_attrValue602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrCtor615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrCtor618 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000020010L});
	public static final BitSet FOLLOW_evalExpr2_in_attrCtor621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrTest650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrTest653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_UNDEFINED_in_attrTest656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrTest674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrTest677 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_DEFINED_in_attrTest680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrTest698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrTest701 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000020010L});
	public static final BitSet FOLLOW_evalExpr2_in_attrTest704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_testExpr2_in_attrTest706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attr_in_attrTest725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_attrTest728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_testExpr2_in_attrTest731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_testExpr2758 = new BitSet(new long[]{0x0000503006040000L,0x0000000000002000L});
	public static final BitSet FOLLOW_testExpr_in_testExpr2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_testExpr2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andTest_in_testExpr779 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_OR_in_testExpr784 = new BitSet(new long[]{0x0000503006040000L,0x0000000000002000L});
	public static final BitSet FOLLOW_andTest_in_testExpr789 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_notTest_in_andTest806 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_andTest811 = new BitSet(new long[]{0x0000503006040000L,0x0000000000002000L});
	public static final BitSet FOLLOW_notTest_in_andTest815 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_testAtom_in_notTest832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_notTest850 = new BitSet(new long[]{0x0000503006040000L,0x0000000000002000L});
	public static final BitSet FOLLOW_notTest_in_notTest853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_copr_in_testAtom878 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000020010L});
	public static final BitSet FOLLOW_evalExpr2_in_testAtom880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_testAtom908 = new BitSet(new long[]{0x0000503006040000L,0x0000000000002000L});
	public static final BitSet FOLLOW_testExpr_in_testAtom910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_testAtom912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_in_evalExpr2944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_evalExpr2962 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_evalExpr_in_evalExpr2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_evalExpr2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andExpr_in_evalExpr993 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_OR_in_evalExpr998 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_andExpr_in_evalExpr1003 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_relExpr_in_andExpr1020 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_andExpr1025 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_relExpr_in_andExpr1029 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_sumExpr_in_relExpr1046 = new BitSet(new long[]{0x0000103006040002L});
	public static final BitSet FOLLOW_copr_in_relExpr1051 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_sumExpr_in_relExpr1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_sumExpr1071 = new BitSet(new long[]{0x0400000000000042L});
	public static final BitSet FOLLOW_opr1_in_sumExpr1076 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_mulExpr_in_sumExpr1079 = new BitSet(new long[]{0x0400000000000042L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr1096 = new BitSet(new long[]{0x0000028000010002L});
	public static final BitSet FOLLOW_opr2_in_mulExpr1101 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_negExpr_in_mulExpr1104 = new BitSet(new long[]{0x0000028000010002L});
	public static final BitSet FOLLOW_atom_in_negExpr1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_negExpr1141 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_atom_in_negExpr1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_negExpr1164 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_negExpr_in_negExpr1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomic_in_atom1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_atom1214 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002010L});
	public static final BitSet FOLLOW_evalExpr_in_atom1217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_atom1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicConst_in_atomic1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_atomic1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicConst_in_constExpr21289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_constExpr21307 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_constExpr_in_constExpr21310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_constExpr21312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andConst_in_constExpr1337 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_OR_in_constExpr1342 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_andConst_in_constExpr1347 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_relConst_in_andConst1363 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_andConst1368 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_relConst_in_andConst1372 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_sumConst_in_relConst1388 = new BitSet(new long[]{0x0000103006040002L});
	public static final BitSet FOLLOW_copr_in_relConst1393 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_sumConst_in_relConst1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulConst_in_sumConst1412 = new BitSet(new long[]{0x0400000000000042L});
	public static final BitSet FOLLOW_opr1_in_sumConst1417 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_mulConst_in_sumConst1420 = new BitSet(new long[]{0x0400000000000042L});
	public static final BitSet FOLLOW_negConst_in_mulConst1436 = new BitSet(new long[]{0x0000028000010002L});
	public static final BitSet FOLLOW_opr2_in_mulConst1441 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_negConst_in_mulConst1444 = new BitSet(new long[]{0x0000028000010002L});
	public static final BitSet FOLLOW_constAtom_in_negConst1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_negConst1480 = new BitSet(new long[]{0x4200080100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_constAtom_in_negConst1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_negConst1505 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_negConst_in_negConst1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicConst_in_constAtom1532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_constAtom1550 = new BitSet(new long[]{0x4600480100C00000L,0x0000000000002000L});
	public static final BitSet FOLLOW_constExpr_in_constAtom1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_constAtom1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_atomicConst1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_atomicConst1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_atomicConst1615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_atomicConst1633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atomicConst1653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atomicConst1676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_type1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_attr1731 = new BitSet(new long[]{0x0000000000000002L});
}
