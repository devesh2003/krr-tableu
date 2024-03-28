// $ANTLR 3.5.3 PSYS.g 2024-02-25 16:03:25

package in.ac.iitm.cse.parser.psys;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class PSYSLexer extends Lexer {
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

	    String stripQuotes(String t) { return t.substring(1,t.length()-1); }

	    public Map<Integer,String> textAttribute() {
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(ATTRIBUTE,"name");
	        return map;
	    }

	    public Set<Integer> simpleTokens() {
	        Set<Integer> set = new HashSet<Integer>();

	        set.add(PROGRAM);

	        set.add(CONDITIONS);
	        set.add(ACTIONS);
	        set.add(RULE);
	        set.add(WME);
	        set.add(WME_CTOR);
	        set.add(WME_TEST);
	        set.add(TEST);

	        set.add(IF);
	        set.add(THEN);
	        set.add(INSERT);
	        set.add(MODIFY);
	        set.add(REMOVE);

	        set.add(AND);
	        set.add(OR);
	        set.add(NOT);

	        set.add(EQ);
	        set.add(NE);
	        set.add(LT);
	        set.add(LE);
	        set.add(GE);
	        set.add(GT);

	        set.add(UNDEFINED);
	        set.add(DEFINED);
	        set.add(TRUE);
	        set.add(FALSE);

	        set.add(NEG);
	        set.add(MUL);
	        set.add(DIV);
	        set.add(MOD);
	        set.add(ADD);
	        set.add(SUB);

	        return set;
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PSYSLexer() {} 
	public PSYSLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PSYSLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "PSYS.g"; }

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:69:7
			// PSYS.g:69:9
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:70:7
			// PSYS.g:70:9
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:71:7
			// PSYS.g:71:9
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:72:7
			// PSYS.g:72:9
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:73:7
			// PSYS.g:73:9
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:74:7
			// PSYS.g:74:9
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:75:7
			// PSYS.g:75:9
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:76:7
			// PSYS.g:76:9
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "UNDEFINED"
	public final void mUNDEFINED() throws RecognitionException {
		try {
			int _type = UNDEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:261:13
			// PSYS.g:261:17
			{
			mN(); if (state.failed) return;

			mU(); if (state.failed) return;

			mL(); if (state.failed) return;

			mL(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDEFINED"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:262:13
			// PSYS.g:262:17
			{
			mT(); if (state.failed) return;

			mR(); if (state.failed) return;

			mU(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:263:13
			// PSYS.g:263:17
			{
			mF(); if (state.failed) return;

			mA(); if (state.failed) return;

			mL(); if (state.failed) return;

			mS(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:265:13
			// PSYS.g:265:17
			{
			mI(); if (state.failed) return;

			mF(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:266:13
			// PSYS.g:266:17
			{
			mT(); if (state.failed) return;

			mH(); if (state.failed) return;

			mE(); if (state.failed) return;

			mN(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:267:13
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='A'||LA1_0=='a') ) {
				alt1=1;
			}
			else if ( (LA1_0=='I'||LA1_0=='i') ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// PSYS.g:267:17
					{
					mA(); if (state.failed) return;

					mD(); if (state.failed) return;

					mD(); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:267:25
					{
					mI(); if (state.failed) return;

					mN(); if (state.failed) return;

					mS(); if (state.failed) return;

					mE(); if (state.failed) return;

					mR(); if (state.failed) return;

					mT(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "MODIFY"
	public final void mMODIFY() throws RecognitionException {
		try {
			int _type = MODIFY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:268:13
			// PSYS.g:268:17
			{
			mM(); if (state.failed) return;

			mO(); if (state.failed) return;

			mD(); if (state.failed) return;

			mI(); if (state.failed) return;

			mF(); if (state.failed) return;

			mY(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODIFY"

	// $ANTLR start "REMOVE"
	public final void mREMOVE() throws RecognitionException {
		try {
			int _type = REMOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:269:13
			// PSYS.g:269:17
			{
			mR(); if (state.failed) return;

			mE(); if (state.failed) return;

			mM(); if (state.failed) return;

			mO(); if (state.failed) return;

			mV(); if (state.failed) return;

			mE(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REMOVE"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:271:13
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='O'||LA2_0=='o') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\u2228') ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// PSYS.g:271:17
					{
					mO(); if (state.failed) return;

					mR(); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:271:25
					{
					match('\u2228'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:272:13
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='A'||LA3_0=='a') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\u2227') ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// PSYS.g:272:17
					{
					mA(); if (state.failed) return;

					mN(); if (state.failed) return;

					mD(); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:272:25
					{
					match('\u2227'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:273:13
			int alt4=4;
			switch ( input.LA(1) ) {
			case 'N':
			case 'n':
				{
				alt4=1;
				}
				break;
			case '~':
				{
				alt4=2;
				}
				break;
			case '\u00AC':
				{
				alt4=3;
				}
				break;
			case '\uFFE2':
				{
				alt4=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// PSYS.g:273:17
					{
					mN(); if (state.failed) return;

					mO(); if (state.failed) return;

					mT(); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:273:25
					{
					match('~'); if (state.failed) return;
					}
					break;
				case 3 :
					// PSYS.g:273:31
					{
					match('\u00AC'); if (state.failed) return;
					}
					break;
				case 4 :
					// PSYS.g:273:37
					{
					match('\uFFE2'); if (state.failed) return;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:275:13
			// PSYS.g:275:17
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:276:13
			// PSYS.g:276:17
			{
			match("<>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:277:13
			// PSYS.g:277:17
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:278:13
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='=') ) {
				alt5=1;
			}
			else if ( (LA5_0=='<') ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// PSYS.g:278:17
					{
					match("=<"); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:278:24
					{
					match("<="); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:279:13
			// PSYS.g:279:17
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:280:13
			// PSYS.g:280:17
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:282:13
			// PSYS.g:282:17
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:283:13
			// PSYS.g:283:17
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:284:13
			// PSYS.g:284:17
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:286:13
			// PSYS.g:286:17
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:287:13
			// PSYS.g:287:17
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:289:13
			// PSYS.g:289:17
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// PSYS.g:289:28
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='-'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// PSYS.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:290:13
			// PSYS.g:290:17
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// PSYS.g:290:28
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='-'||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// PSYS.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "DEFINED"
	public final void mDEFINED() throws RecognitionException {
		try {
			int _type = DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:291:13
			// PSYS.g:291:16
			{
			match('_'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINED"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:293:13
			// PSYS.g:293:17
			{
			// PSYS.g:293:17
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// PSYS.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:294:13
			int alt16=3;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// PSYS.g:294:17
					{
					match('.'); if (state.failed) return;
					// PSYS.g:294:21
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// PSYS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// PSYS.g:294:33
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// PSYS.g:294:33
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 2 :
					// PSYS.g:295:17
					{
					// PSYS.g:295:50
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// PSYS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match('.'); if (state.failed) return;
					// PSYS.g:295:66
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// PSYS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// PSYS.g:295:78
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// PSYS.g:295:78
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 3 :
					// PSYS.g:296:17
					{
					// PSYS.g:296:17
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// PSYS.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					// PSYS.g:296:29
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='E'||LA15_0=='e') ) {
						alt15=1;
					}

					else {
						alt15=2;
					}

					switch (alt15) {
						case 1 :
							// PSYS.g:296:31
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;
						case 2 :
							// PSYS.g:296:42
							{
							if ( state.backtracking==0 ) { _type=INTEGER; }
							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:299:13
			// PSYS.g:299:17
			{
			match('\''); if (state.failed) return;
			// PSYS.g:299:22
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\\') ) {
					alt17=1;
				}
				else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// PSYS.g:299:24
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// PSYS.g:299:34
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop17;
				}
			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:304:13
			// PSYS.g:304:17
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PSYS.g:305:13
			// PSYS.g:305:17
			{
			match('#'); if (state.failed) return;
			// PSYS.g:305:21
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\u0000' && LA18_0 <= '\t')||(LA18_0 >= '\u000B' && LA18_0 <= '\f')||(LA18_0 >= '\u000E' && LA18_0 <= '\uFFFF')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// PSYS.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			// PSYS.g:305:35
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\n'||LA20_0=='\r') ) {
				alt20=1;
			}

			else {
				alt20=2;
			}

			switch (alt20) {
				case 1 :
					// PSYS.g:305:36
					{
					// PSYS.g:305:36
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0=='\r') ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// PSYS.g:305:36
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					}
					break;
				case 2 :
					// PSYS.g:305:47
					{
					match(EOF); if (state.failed) return;

					}
					break;

			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// PSYS.g:313:13
			// PSYS.g:313:17
			{
			mE(); if (state.failed) return;

			// PSYS.g:313:19
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='+'||LA21_0=='-') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// PSYS.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// PSYS.g:313:30
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// PSYS.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// PSYS.g:316:13
			// PSYS.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// PSYS.g:319:13
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt23=1;
					}
					break;
				case 'u':
					{
					alt23=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt23=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// PSYS.g:319:17
					{
					match('\\'); if (state.failed) return;
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// PSYS.g:320:17
					{
					mUNICODE_ESC(); if (state.failed) return;

					}
					break;
				case 3 :
					// PSYS.g:321:17
					{
					mOCTAL_ESC(); if (state.failed) return;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// PSYS.g:324:13
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='\\') ) {
				int LA24_1 = input.LA(2);
				if ( ((LA24_1 >= '0' && LA24_1 <= '3')) ) {
					int LA24_2 = input.LA(3);
					if ( ((LA24_2 >= '0' && LA24_2 <= '7')) ) {
						int LA24_4 = input.LA(4);
						if ( ((LA24_4 >= '0' && LA24_4 <= '7')) ) {
							alt24=1;
						}

						else {
							alt24=2;
						}

					}

					else {
						alt24=3;
					}

				}
				else if ( ((LA24_1 >= '4' && LA24_1 <= '7')) ) {
					int LA24_3 = input.LA(3);
					if ( ((LA24_3 >= '0' && LA24_3 <= '7')) ) {
						alt24=2;
					}

					else {
						alt24=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// PSYS.g:324:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// PSYS.g:325:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// PSYS.g:326:17
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// PSYS.g:329:13
			// PSYS.g:329:17
			{
			match('\\'); if (state.failed) return;
			match('u'); if (state.failed) return;
			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// PSYS.g:330:13
			// PSYS.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// PSYS.g:331:13
			// PSYS.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// PSYS.g:332:13
			// PSYS.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// PSYS.g:333:13
			// PSYS.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// PSYS.g:334:13
			// PSYS.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// PSYS.g:335:13
			// PSYS.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// PSYS.g:336:13
			// PSYS.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// PSYS.g:337:13
			// PSYS.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// PSYS.g:338:13
			// PSYS.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// PSYS.g:339:13
			// PSYS.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// PSYS.g:340:13
			// PSYS.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// PSYS.g:341:13
			// PSYS.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// PSYS.g:342:13
			// PSYS.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// PSYS.g:343:13
			// PSYS.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// PSYS.g:344:13
			// PSYS.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// PSYS.g:345:13
			// PSYS.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// PSYS.g:346:13
			// PSYS.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// PSYS.g:347:13
			// PSYS.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// PSYS.g:348:13
			// PSYS.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// PSYS.g:349:13
			// PSYS.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// PSYS.g:350:13
			// PSYS.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// PSYS.g:351:13
			// PSYS.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// PSYS.g:352:13
			// PSYS.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// PSYS.g:353:13
			// PSYS.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// PSYS.g:354:13
			// PSYS.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// PSYS.g:355:13
			// PSYS.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	@Override
	public void mTokens() throws RecognitionException {
		// PSYS.g:1:8
		int alt25=38;
		alt25 = dfa25.predict(input);
		switch (alt25) {
			case 1 :
				// PSYS.g:1:10
				{
				mT__77(); if (state.failed) return;

				}
				break;
			case 2 :
				// PSYS.g:1:16
				{
				mT__78(); if (state.failed) return;

				}
				break;
			case 3 :
				// PSYS.g:1:22
				{
				mT__79(); if (state.failed) return;

				}
				break;
			case 4 :
				// PSYS.g:1:28
				{
				mT__80(); if (state.failed) return;

				}
				break;
			case 5 :
				// PSYS.g:1:34
				{
				mT__81(); if (state.failed) return;

				}
				break;
			case 6 :
				// PSYS.g:1:40
				{
				mT__82(); if (state.failed) return;

				}
				break;
			case 7 :
				// PSYS.g:1:46
				{
				mT__83(); if (state.failed) return;

				}
				break;
			case 8 :
				// PSYS.g:1:52
				{
				mT__84(); if (state.failed) return;

				}
				break;
			case 9 :
				// PSYS.g:1:58
				{
				mUNDEFINED(); if (state.failed) return;

				}
				break;
			case 10 :
				// PSYS.g:1:68
				{
				mTRUE(); if (state.failed) return;

				}
				break;
			case 11 :
				// PSYS.g:1:73
				{
				mFALSE(); if (state.failed) return;

				}
				break;
			case 12 :
				// PSYS.g:1:79
				{
				mIF(); if (state.failed) return;

				}
				break;
			case 13 :
				// PSYS.g:1:82
				{
				mTHEN(); if (state.failed) return;

				}
				break;
			case 14 :
				// PSYS.g:1:87
				{
				mINSERT(); if (state.failed) return;

				}
				break;
			case 15 :
				// PSYS.g:1:94
				{
				mMODIFY(); if (state.failed) return;

				}
				break;
			case 16 :
				// PSYS.g:1:101
				{
				mREMOVE(); if (state.failed) return;

				}
				break;
			case 17 :
				// PSYS.g:1:108
				{
				mOR(); if (state.failed) return;

				}
				break;
			case 18 :
				// PSYS.g:1:111
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 19 :
				// PSYS.g:1:115
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 20 :
				// PSYS.g:1:119
				{
				mEQ(); if (state.failed) return;

				}
				break;
			case 21 :
				// PSYS.g:1:122
				{
				mNE(); if (state.failed) return;

				}
				break;
			case 22 :
				// PSYS.g:1:125
				{
				mLT(); if (state.failed) return;

				}
				break;
			case 23 :
				// PSYS.g:1:128
				{
				mLE(); if (state.failed) return;

				}
				break;
			case 24 :
				// PSYS.g:1:131
				{
				mGE(); if (state.failed) return;

				}
				break;
			case 25 :
				// PSYS.g:1:134
				{
				mGT(); if (state.failed) return;

				}
				break;
			case 26 :
				// PSYS.g:1:137
				{
				mMUL(); if (state.failed) return;

				}
				break;
			case 27 :
				// PSYS.g:1:141
				{
				mDIV(); if (state.failed) return;

				}
				break;
			case 28 :
				// PSYS.g:1:145
				{
				mMOD(); if (state.failed) return;

				}
				break;
			case 29 :
				// PSYS.g:1:149
				{
				mADD(); if (state.failed) return;

				}
				break;
			case 30 :
				// PSYS.g:1:153
				{
				mSUB(); if (state.failed) return;

				}
				break;
			case 31 :
				// PSYS.g:1:157
				{
				mNAME(); if (state.failed) return;

				}
				break;
			case 32 :
				// PSYS.g:1:162
				{
				mVARIABLE(); if (state.failed) return;

				}
				break;
			case 33 :
				// PSYS.g:1:171
				{
				mDEFINED(); if (state.failed) return;

				}
				break;
			case 34 :
				// PSYS.g:1:179
				{
				mINTEGER(); if (state.failed) return;

				}
				break;
			case 35 :
				// PSYS.g:1:187
				{
				mFLOAT(); if (state.failed) return;

				}
				break;
			case 36 :
				// PSYS.g:1:193
				{
				mSTRING(); if (state.failed) return;

				}
				break;
			case 37 :
				// PSYS.g:1:200
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 38 :
				// PSYS.g:1:203
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_PSYS
	public final void synpred1_PSYS_fragment() throws RecognitionException {
		// PSYS.g:295:17
		// PSYS.g:295:18
		{
		// PSYS.g:295:18
		int cnt26=0;
		loop26:
		while (true) {
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
				alt26=1;
			}

			switch (alt26) {
			case 1 :
				// PSYS.g:
				{
				if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				if ( cnt26 >= 1 ) break loop26;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(26, input);
				throw eee;
			}
			cnt26++;
		}

		match('.'); if (state.failed) return;
		// PSYS.g:295:34
		int cnt27=0;
		loop27:
		while (true) {
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
				alt27=1;
			}

			switch (alt27) {
			case 1 :
				// PSYS.g:
				{
				if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
					input.consume();
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					recover(mse);
					throw mse;
				}
				}
				break;

			default :
				if ( cnt27 >= 1 ) break loop27;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(27, input);
				throw eee;
			}
			cnt27++;
		}

		}

	}
	// $ANTLR end synpred1_PSYS

	public final boolean synpred1_PSYS() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_PSYS_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA16 dfa16 = new DFA16(this);
	protected DFA25 dfa25 = new DFA25(this);
	static final String DFA16_eotS =
		"\2\uffff\1\4\2\uffff";
	static final String DFA16_eofS =
		"\5\uffff";
	static final String DFA16_minS =
		"\1\56\1\uffff\1\56\2\uffff";
	static final String DFA16_maxS =
		"\1\71\1\uffff\1\71\2\uffff";
	static final String DFA16_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\3";
	static final String DFA16_specialS =
		"\2\uffff\1\0\2\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1\1\uffff\12\2",
			"",
			"\1\3\1\uffff\12\2",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "294:1: FLOAT : ( '.' ( '0' .. '9' )+ ( EXPONENT )? | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )=> ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT |) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_2 = input.LA(1);
						 
						int index16_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA16_2=='.') && (synpred1_PSYS())) {s = 3;}
						else if ( ((LA16_2 >= '0' && LA16_2 <= '9')) ) {s = 2;}
						else s = 4;
						 
						input.seek(index16_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS =
		"\11\uffff\10\44\3\uffff\1\71\1\73\1\75\5\uffff\10\45\3\uffff\1\112\4\uffff"+
		"\5\44\1\120\5\44\1\21\6\uffff\5\45\1\120\5\45\1\21\1\uffff\1\44\1\23\3"+
		"\44\1\uffff\1\44\1\145\1\22\2\44\1\45\1\23\4\45\1\145\1\22\2\45\1\157"+
		"\1\160\1\161\2\44\1\uffff\2\44\1\157\1\160\1\161\4\45\3\uffff\1\172\3"+
		"\44\1\172\3\45\1\uffff\1\145\1\u0081\1\u0082\1\145\1\u0081\1\u0082\2\uffff";
	static final String DFA25_eofS =
		"\u0083\uffff";
	static final String DFA25_minS =
		"\1\11\10\uffff\1\117\1\110\1\101\1\106\1\104\1\117\1\105\1\122\3\uffff"+
		"\1\74\2\75\5\uffff\1\117\1\110\1\101\1\106\1\104\1\117\1\105\1\122\3\uffff"+
		"\1\56\4\uffff\1\114\1\124\1\125\1\105\1\114\1\55\1\123\3\104\1\115\1\55"+
		"\6\uffff\1\114\1\124\1\125\1\105\1\114\1\55\1\123\3\104\1\115\1\55\1\uffff"+
		"\1\114\1\55\1\105\1\116\1\123\1\uffff\1\105\2\55\1\111\1\117\1\114\1\55"+
		"\1\105\1\116\1\123\1\105\2\55\1\111\1\117\3\55\1\105\1\122\1\uffff\1\106"+
		"\1\126\3\55\1\105\1\122\1\106\1\126\3\uffff\1\55\1\124\1\131\1\105\1\55"+
		"\1\124\1\131\1\105\1\uffff\6\55\2\uffff";
	static final String DFA25_maxS =
		"\1\uffe2\10\uffff\1\165\1\162\1\141\2\156\1\157\1\145\1\162\3\uffff\1"+
		"\74\1\76\1\75\5\uffff\1\165\1\162\1\141\2\156\1\157\1\145\1\162\3\uffff"+
		"\1\145\4\uffff\1\154\1\164\1\165\1\145\1\154\1\172\1\163\3\144\1\155\1"+
		"\172\6\uffff\1\154\1\164\1\165\1\145\1\154\1\172\1\163\3\144\1\155\1\172"+
		"\1\uffff\1\154\1\172\1\145\1\156\1\163\1\uffff\1\145\2\172\1\151\1\157"+
		"\1\154\1\172\1\145\1\156\1\163\1\145\2\172\1\151\1\157\3\172\1\145\1\162"+
		"\1\uffff\1\146\1\166\3\172\1\145\1\162\1\146\1\166\3\uffff\1\172\1\164"+
		"\1\171\1\145\1\172\1\164\1\171\1\145\1\uffff\6\172\2\uffff";
	static final String DFA25_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\10\uffff\1\21\1\22\1\23\3\uffff"+
		"\1\32\1\33\1\34\1\35\1\36\10\uffff\1\37\1\40\1\41\1\uffff\1\43\1\44\1"+
		"\45\1\46\14\uffff\1\27\1\24\1\25\1\26\1\30\1\31\14\uffff\1\42\5\uffff"+
		"\1\14\24\uffff\1\16\11\uffff\1\11\1\12\1\15\10\uffff\1\13\6\uffff\1\17"+
		"\1\20";
	static final String DFA25_specialS =
		"\u0083\uffff}>";
	static final String[] DFA25_transitionS = {
			"\2\52\2\uffff\1\52\22\uffff\1\52\2\uffff\1\53\1\uffff\1\31\1\uffff\1"+
			"\51\1\1\1\2\1\27\1\32\1\uffff\1\33\1\50\1\30\12\47\1\3\1\4\1\25\1\24"+
			"\1\26\2\uffff\1\40\4\45\1\36\2\45\1\37\3\45\1\41\1\34\1\43\2\45\1\42"+
			"\1\45\1\35\6\45\1\5\1\uffff\1\6\1\uffff\1\46\1\uffff\1\15\4\44\1\13\2"+
			"\44\1\14\3\44\1\16\1\11\1\20\2\44\1\17\1\44\1\12\6\44\1\7\1\uffff\1\10"+
			"\1\23\55\uffff\1\23\u217a\uffff\1\22\1\21\uddb9\uffff\1\23",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55\5\uffff\1\54\31\uffff\1\55\5\uffff\1\54",
			"\1\57\11\uffff\1\56\25\uffff\1\57\11\uffff\1\56",
			"\1\60\37\uffff\1\60",
			"\1\61\7\uffff\1\62\27\uffff\1\61\7\uffff\1\62",
			"\1\63\11\uffff\1\64\25\uffff\1\63\11\uffff\1\64",
			"\1\65\37\uffff\1\65",
			"\1\66\37\uffff\1\66",
			"\1\67\37\uffff\1\67",
			"",
			"",
			"",
			"\1\70",
			"\1\70\1\72",
			"\1\74",
			"",
			"",
			"",
			"",
			"",
			"\1\77\5\uffff\1\76\31\uffff\1\77\5\uffff\1\76",
			"\1\101\11\uffff\1\100\25\uffff\1\101\11\uffff\1\100",
			"\1\102\37\uffff\1\102",
			"\1\103\7\uffff\1\104\27\uffff\1\103\7\uffff\1\104",
			"\1\105\11\uffff\1\106\25\uffff\1\105\11\uffff\1\106",
			"\1\107\37\uffff\1\107",
			"\1\110\37\uffff\1\110",
			"\1\111\37\uffff\1\111",
			"",
			"",
			"",
			"\1\50\1\uffff\12\47\13\uffff\1\50\37\uffff\1\50",
			"",
			"",
			"",
			"",
			"\1\113\37\uffff\1\113",
			"\1\114\37\uffff\1\114",
			"\1\115\37\uffff\1\115",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\121\37\uffff\1\121",
			"\1\122\37\uffff\1\122",
			"\1\123\37\uffff\1\123",
			"\1\124\37\uffff\1\124",
			"\1\125\37\uffff\1\125",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
			"\1\137\37\uffff\1\137",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			"\1\140\37\uffff\1\140",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\143\37\uffff\1\143",
			"",
			"\1\144\37\uffff\1\144",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\146\37\uffff\1\146",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\151\37\uffff\1\151",
			"\1\152\37\uffff\1\152",
			"\1\153\37\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\155\37\uffff\1\155",
			"\1\156\37\uffff\1\156",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\162\37\uffff\1\162",
			"\1\163\37\uffff\1\163",
			"",
			"\1\164\37\uffff\1\164",
			"\1\165\37\uffff\1\165",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\166\37\uffff\1\166",
			"\1\167\37\uffff\1\167",
			"\1\170\37\uffff\1\170",
			"\1\171\37\uffff\1\171",
			"",
			"",
			"",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\173\37\uffff\1\173",
			"\1\174\37\uffff\1\174",
			"\1\175\37\uffff\1\175",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\176\37\uffff\1\176",
			"\1\177\37\uffff\1\177",
			"\1\u0080\37\uffff\1\u0080",
			"",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\44\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"\1\45\2\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | UNDEFINED | TRUE | FALSE | IF | THEN | INSERT | MODIFY | REMOVE | OR | AND | NOT | EQ | NE | LT | LE | GE | GT | MUL | DIV | MOD | ADD | SUB | NAME | VARIABLE | DEFINED | INTEGER | FLOAT | STRING | WS | COMMENT );";
		}
	}

}
