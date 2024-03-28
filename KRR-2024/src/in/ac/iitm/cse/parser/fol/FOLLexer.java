// $ANTLR 3.5.3 FOL.g 2024-02-25 16:03:24

package in.ac.iitm.cse.parser.fol;
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
public class FOLLexer extends Lexer {
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

	    String stripQuotes(String t) { return t.substring(1,t.length()-1); }

	    public Map<Integer,String> textAttribute() {
	        Map<Integer,String> map = new HashMap<Integer,String>();
	      //map.put(BOOLEAN_VAR,"name");
	        map.put(PREDICATE,"name");
	        map.put(FUNCTION,"name");
	        map.put(BLOCK,"label");
	        return map;
	    }

	    public Set<Integer> simpleTokens() {
	        Set<Integer> set = new HashSet<Integer>();

	        set.add(FOL);
	        set.add(BLOCK);

	        set.add(CONS);
	        set.add(NIL);
	        set.add(VAR_LIST);

	        set.add(NEG);
	        set.add(MUL);
	        set.add(DIV);
	        set.add(MOD);
	        set.add(ADD);
	        set.add(SUB);

	        set.add(TRUE);
	        set.add(FALSE);

	        set.add(FORALL);
	        set.add(EXISTS);
	        set.add(EXACTLY_ONE);

	        set.add(LT);
	        set.add(LE);
	        set.add(EQ);
	        set.add(GE);
	        set.add(GT);
	        set.add(NE);

	        set.add(IFF);
	        set.add(IMPLIES);
	        set.add(IMPLIED_BY);

	        set.add(AND);
	        set.add(OR);
	        set.add(NOT);

	        return set;
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public FOLLexer() {} 
	public FOLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public FOLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "FOL.g"; }

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:69:7
			// FOL.g:69:9
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:70:7
			// FOL.g:70:9
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:71:7
			// FOL.g:71:9
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:72:7
			// FOL.g:72:9
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:73:7
			// FOL.g:73:9
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
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:74:7
			// FOL.g:74:9
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
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:75:7
			// FOL.g:75:9
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:76:7
			// FOL.g:76:9
			{
			match('|'); if (state.failed) return;
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
			// FOL.g:77:7
			// FOL.g:77:9
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
	// $ANTLR end "T__82"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:257:13
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='T'||LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='\u22A4') ) {
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
					// FOL.g:257:17
					{
					mT(); if (state.failed) return;

					mR(); if (state.failed) return;

					mU(); if (state.failed) return;

					mE(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:257:27
					{
					match('\u22A4'); if (state.failed) return;
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
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:258:13
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='F'||LA2_0=='f') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\u22A5') ) {
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
					// FOL.g:258:17
					{
					mF(); if (state.failed) return;

					mA(); if (state.failed) return;

					mL(); if (state.failed) return;

					mS(); if (state.failed) return;

					mE(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:258:29
					{
					match('\u22A5'); if (state.failed) return;
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
	// $ANTLR end "FALSE"

	// $ANTLR start "IMPLIES"
	public final void mIMPLIES() throws RecognitionException {
		try {
			int _type = IMPLIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:260:13
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='=') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\u2283') ) {
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
					// FOL.g:260:17
					{
					match("=>"); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:260:25
					{
					match('\u2283'); if (state.failed) return;
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
	// $ANTLR end "IMPLIES"

	// $ANTLR start "IMPLIED_BY"
	public final void mIMPLIED_BY() throws RecognitionException {
		try {
			int _type = IMPLIED_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:261:13
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='<') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\u2282') ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// FOL.g:261:17
					{
					match("<="); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:261:25
					{
					match('\u2282'); if (state.failed) return;
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
	// $ANTLR end "IMPLIED_BY"

	// $ANTLR start "IFF"
	public final void mIFF() throws RecognitionException {
		try {
			int _type = IFF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:262:13
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='<') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\u2261') ) {
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
					// FOL.g:262:17
					{
					match("<=>"); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:262:25
					{
					match('\u2261'); if (state.failed) return;
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
	// $ANTLR end "IFF"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:264:13
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='O'||LA6_0=='o') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\u2228') ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// FOL.g:264:17
					{
					mO(); if (state.failed) return;

					mR(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:264:25
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
			// FOL.g:265:13
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='A'||LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\u2227') ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// FOL.g:265:17
					{
					mA(); if (state.failed) return;

					mN(); if (state.failed) return;

					mD(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:265:25
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
			// FOL.g:266:13
			int alt8=4;
			switch ( input.LA(1) ) {
			case 'N':
			case 'n':
				{
				alt8=1;
				}
				break;
			case '~':
				{
				alt8=2;
				}
				break;
			case '\u00AC':
				{
				alt8=3;
				}
				break;
			case '\uFFE2':
				{
				alt8=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// FOL.g:266:17
					{
					mN(); if (state.failed) return;

					mO(); if (state.failed) return;

					mT(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:266:25
					{
					match('~'); if (state.failed) return;
					}
					break;
				case 3 :
					// FOL.g:266:31
					{
					match('\u00AC'); if (state.failed) return;
					}
					break;
				case 4 :
					// FOL.g:266:37
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

	// $ANTLR start "FORALL"
	public final void mFORALL() throws RecognitionException {
		try {
			int _type = FORALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:268:13
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='F'||LA9_0=='f') ) {
				alt9=1;
			}
			else if ( (LA9_0=='\u2200') ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// FOL.g:268:17
					{
					mF(); if (state.failed) return;

					mO(); if (state.failed) return;

					mR(); if (state.failed) return;

					mA(); if (state.failed) return;

					mL(); if (state.failed) return;

					mL(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:268:31
					{
					match('\u2200'); if (state.failed) return;
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
	// $ANTLR end "FORALL"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:269:13
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='E'||LA10_0=='e') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\u2203') ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// FOL.g:269:17
					{
					mE(); if (state.failed) return;

					mX(); if (state.failed) return;

					mI(); if (state.failed) return;

					mS(); if (state.failed) return;

					mT(); if (state.failed) return;

					mS(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:269:31
					{
					match('\u2203'); if (state.failed) return;
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
	// $ANTLR end "EXISTS"

	// $ANTLR start "EXACTLY_ONE"
	public final void mEXACTLY_ONE() throws RecognitionException {
		try {
			int _type = EXACTLY_ONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:270:13
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='E'||LA12_0=='e') ) {
				alt12=1;
			}
			else if ( (LA12_0=='\u2203') ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// FOL.g:270:17
					{
					mE(); if (state.failed) return;

					mX(); if (state.failed) return;

					mA(); if (state.failed) return;

					mC(); if (state.failed) return;

					mT(); if (state.failed) return;

					mL(); if (state.failed) return;

					mY(); if (state.failed) return;

					mO(); if (state.failed) return;

					mN(); if (state.failed) return;

					mE(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:270:39
					{
					match('\u2203'); if (state.failed) return;
					// FOL.g:270:43
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// FOL.g:
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
							}
							break;

						default :
							break loop11;
						}
					}

					match('!'); if (state.failed) return;
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
	// $ANTLR end "EXACTLY_ONE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:272:13
			// FOL.g:272:17
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
			// FOL.g:273:6
			// FOL.g:273:10
			{
			match("=<"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:274:13
			// FOL.g:274:17
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

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:275:13
			// FOL.g:275:17
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
			// FOL.g:276:13
			// FOL.g:276:17
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

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:277:13
			// FOL.g:277:17
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

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:279:13
			// FOL.g:279:17
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
			// FOL.g:280:13
			// FOL.g:280:17
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

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:282:13
			// FOL.g:282:17
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
			// FOL.g:283:13
			// FOL.g:283:17
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
			// FOL.g:284:13
			// FOL.g:284:17
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

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:286:13
			// FOL.g:286:17
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
			// FOL.g:286:28
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop13;
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
			// FOL.g:287:13
			// FOL.g:287:17
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
			// FOL.g:287:28
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'A' && LA14_0 <= 'Z')||LA14_0=='_'||(LA14_0 >= 'a' && LA14_0 <= 'z')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// FOL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop14;
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

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:289:13
			// FOL.g:289:17
			{
			// FOL.g:289:17
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// FOL.g:
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
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
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
			// FOL.g:290:13
			int alt23=3;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// FOL.g:290:17
					{
					match('.'); if (state.failed) return;
					// FOL.g:290:21
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// FOL.g:
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
							if ( cnt16 >= 1 ) break loop16;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					// FOL.g:290:33
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='E'||LA17_0=='e') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// FOL.g:290:33
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 2 :
					// FOL.g:291:17
					{
					// FOL.g:291:50
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// FOL.g:
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
							if ( cnt18 >= 1 ) break loop18;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match('.'); if (state.failed) return;
					// FOL.g:291:66
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// FOL.g:
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
							if ( cnt19 >= 1 ) break loop19;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					// FOL.g:291:78
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0=='E'||LA20_0=='e') ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// FOL.g:291:78
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 3 :
					// FOL.g:292:17
					{
					// FOL.g:292:17
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// FOL.g:
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
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					// FOL.g:292:29
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0=='E'||LA22_0=='e') ) {
						alt22=1;
					}

					else {
						alt22=2;
					}

					switch (alt22) {
						case 1 :
							// FOL.g:292:31
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;
						case 2 :
							// FOL.g:292:42
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
			// FOL.g:295:13
			// FOL.g:295:17
			{
			match('\''); if (state.failed) return;
			// FOL.g:295:22
			loop24:
			while (true) {
				int alt24=3;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='\\') ) {
					alt24=1;
				}
				else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')||(LA24_0 >= '(' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
					alt24=2;
				}

				switch (alt24) {
				case 1 :
					// FOL.g:295:24
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// FOL.g:295:34
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
					break loop24;
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

	// $ANTLR start "WS_2"
	public final void mWS_2() throws RecognitionException {
		try {
			int _type = WS_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:300:13
			// FOL.g:300:17
			{
			mWS(); if (state.failed) return;

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS_2"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// FOL.g:301:13
			// FOL.g:301:17
			{
			match('#'); if (state.failed) return;
			// FOL.g:301:21
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= '\u0000' && LA25_0 <= '\t')||(LA25_0 >= '\u000B' && LA25_0 <= '\f')||(LA25_0 >= '\u000E' && LA25_0 <= '\uFFFF')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// FOL.g:
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
					break loop25;
				}
			}

			// FOL.g:301:35
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='\n'||LA27_0=='\r') ) {
				alt27=1;
			}

			else {
				alt27=2;
			}

			switch (alt27) {
				case 1 :
					// FOL.g:301:36
					{
					// FOL.g:301:36
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0=='\r') ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// FOL.g:301:36
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					}
					break;
				case 2 :
					// FOL.g:301:47
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			// FOL.g:307:13
			// FOL.g:
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
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// FOL.g:311:13
			// FOL.g:311:17
			{
			mE(); if (state.failed) return;

			// FOL.g:311:19
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='+'||LA28_0=='-') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// FOL.g:
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

			// FOL.g:311:30
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= '0' && LA29_0 <= '9')) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// FOL.g:
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
					if ( cnt29 >= 1 ) break loop29;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
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
			// FOL.g:314:13
			// FOL.g:
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
			// FOL.g:317:13
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='\\') ) {
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
					alt30=1;
					}
					break;
				case 'u':
					{
					alt30=2;
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
					alt30=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// FOL.g:317:17
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
					// FOL.g:318:17
					{
					mUNICODE_ESC(); if (state.failed) return;

					}
					break;
				case 3 :
					// FOL.g:319:17
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
			// FOL.g:322:13
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='\\') ) {
				int LA31_1 = input.LA(2);
				if ( ((LA31_1 >= '0' && LA31_1 <= '3')) ) {
					int LA31_2 = input.LA(3);
					if ( ((LA31_2 >= '0' && LA31_2 <= '7')) ) {
						int LA31_4 = input.LA(4);
						if ( ((LA31_4 >= '0' && LA31_4 <= '7')) ) {
							alt31=1;
						}

						else {
							alt31=2;
						}

					}

					else {
						alt31=3;
					}

				}
				else if ( ((LA31_1 >= '4' && LA31_1 <= '7')) ) {
					int LA31_3 = input.LA(3);
					if ( ((LA31_3 >= '0' && LA31_3 <= '7')) ) {
						alt31=2;
					}

					else {
						alt31=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// FOL.g:322:17
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
					// FOL.g:323:17
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
					// FOL.g:324:17
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
			// FOL.g:327:13
			// FOL.g:327:17
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
			// FOL.g:328:13
			// FOL.g:
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
			// FOL.g:329:13
			// FOL.g:
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
			// FOL.g:330:13
			// FOL.g:
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
			// FOL.g:331:13
			// FOL.g:
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
			// FOL.g:332:13
			// FOL.g:
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
			// FOL.g:333:13
			// FOL.g:
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
			// FOL.g:334:13
			// FOL.g:
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
			// FOL.g:335:13
			// FOL.g:
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
			// FOL.g:336:13
			// FOL.g:
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
			// FOL.g:337:13
			// FOL.g:
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
			// FOL.g:338:13
			// FOL.g:
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
			// FOL.g:339:13
			// FOL.g:
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
			// FOL.g:340:13
			// FOL.g:
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
			// FOL.g:341:13
			// FOL.g:
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
			// FOL.g:342:13
			// FOL.g:
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
			// FOL.g:343:13
			// FOL.g:
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
			// FOL.g:344:13
			// FOL.g:
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
			// FOL.g:345:13
			// FOL.g:
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
			// FOL.g:346:13
			// FOL.g:
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
			// FOL.g:347:13
			// FOL.g:
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
			// FOL.g:348:13
			// FOL.g:
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
			// FOL.g:349:13
			// FOL.g:
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
			// FOL.g:350:13
			// FOL.g:
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
			// FOL.g:351:13
			// FOL.g:
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
			// FOL.g:352:13
			// FOL.g:
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
			// FOL.g:353:13
			// FOL.g:
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
		// FOL.g:1:8
		int alt32=38;
		alt32 = dfa32.predict(input);
		switch (alt32) {
			case 1 :
				// FOL.g:1:10
				{
				mT__74(); if (state.failed) return;

				}
				break;
			case 2 :
				// FOL.g:1:16
				{
				mT__75(); if (state.failed) return;

				}
				break;
			case 3 :
				// FOL.g:1:22
				{
				mT__76(); if (state.failed) return;

				}
				break;
			case 4 :
				// FOL.g:1:28
				{
				mT__77(); if (state.failed) return;

				}
				break;
			case 5 :
				// FOL.g:1:34
				{
				mT__78(); if (state.failed) return;

				}
				break;
			case 6 :
				// FOL.g:1:40
				{
				mT__79(); if (state.failed) return;

				}
				break;
			case 7 :
				// FOL.g:1:46
				{
				mT__80(); if (state.failed) return;

				}
				break;
			case 8 :
				// FOL.g:1:52
				{
				mT__81(); if (state.failed) return;

				}
				break;
			case 9 :
				// FOL.g:1:58
				{
				mT__82(); if (state.failed) return;

				}
				break;
			case 10 :
				// FOL.g:1:64
				{
				mTRUE(); if (state.failed) return;

				}
				break;
			case 11 :
				// FOL.g:1:69
				{
				mFALSE(); if (state.failed) return;

				}
				break;
			case 12 :
				// FOL.g:1:75
				{
				mIMPLIES(); if (state.failed) return;

				}
				break;
			case 13 :
				// FOL.g:1:83
				{
				mIMPLIED_BY(); if (state.failed) return;

				}
				break;
			case 14 :
				// FOL.g:1:94
				{
				mIFF(); if (state.failed) return;

				}
				break;
			case 15 :
				// FOL.g:1:98
				{
				mOR(); if (state.failed) return;

				}
				break;
			case 16 :
				// FOL.g:1:101
				{
				mAND(); if (state.failed) return;

				}
				break;
			case 17 :
				// FOL.g:1:105
				{
				mNOT(); if (state.failed) return;

				}
				break;
			case 18 :
				// FOL.g:1:109
				{
				mFORALL(); if (state.failed) return;

				}
				break;
			case 19 :
				// FOL.g:1:116
				{
				mEXISTS(); if (state.failed) return;

				}
				break;
			case 20 :
				// FOL.g:1:123
				{
				mEXACTLY_ONE(); if (state.failed) return;

				}
				break;
			case 21 :
				// FOL.g:1:135
				{
				mLT(); if (state.failed) return;

				}
				break;
			case 22 :
				// FOL.g:1:138
				{
				mLE(); if (state.failed) return;

				}
				break;
			case 23 :
				// FOL.g:1:141
				{
				mEQ(); if (state.failed) return;

				}
				break;
			case 24 :
				// FOL.g:1:144
				{
				mGE(); if (state.failed) return;

				}
				break;
			case 25 :
				// FOL.g:1:147
				{
				mGT(); if (state.failed) return;

				}
				break;
			case 26 :
				// FOL.g:1:150
				{
				mNE(); if (state.failed) return;

				}
				break;
			case 27 :
				// FOL.g:1:153
				{
				mADD(); if (state.failed) return;

				}
				break;
			case 28 :
				// FOL.g:1:157
				{
				mSUB(); if (state.failed) return;

				}
				break;
			case 29 :
				// FOL.g:1:161
				{
				mMUL(); if (state.failed) return;

				}
				break;
			case 30 :
				// FOL.g:1:165
				{
				mDIV(); if (state.failed) return;

				}
				break;
			case 31 :
				// FOL.g:1:169
				{
				mMOD(); if (state.failed) return;

				}
				break;
			case 32 :
				// FOL.g:1:173
				{
				mNAME(); if (state.failed) return;

				}
				break;
			case 33 :
				// FOL.g:1:178
				{
				mVARIABLE(); if (state.failed) return;

				}
				break;
			case 34 :
				// FOL.g:1:187
				{
				mINTEGER(); if (state.failed) return;

				}
				break;
			case 35 :
				// FOL.g:1:195
				{
				mFLOAT(); if (state.failed) return;

				}
				break;
			case 36 :
				// FOL.g:1:201
				{
				mSTRING(); if (state.failed) return;

				}
				break;
			case 37 :
				// FOL.g:1:208
				{
				mWS_2(); if (state.failed) return;

				}
				break;
			case 38 :
				// FOL.g:1:213
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_FOL
	public final void synpred1_FOL_fragment() throws RecognitionException {
		// FOL.g:291:17
		// FOL.g:291:18
		{
		// FOL.g:291:18
		int cnt33=0;
		loop33:
		while (true) {
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
				alt33=1;
			}

			switch (alt33) {
			case 1 :
				// FOL.g:
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
				if ( cnt33 >= 1 ) break loop33;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(33, input);
				throw eee;
			}
			cnt33++;
		}

		match('.'); if (state.failed) return;
		// FOL.g:291:34
		int cnt34=0;
		loop34:
		while (true) {
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( ((LA34_0 >= '0' && LA34_0 <= '9')) ) {
				alt34=1;
			}

			switch (alt34) {
			case 1 :
				// FOL.g:
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
				if ( cnt34 >= 1 ) break loop34;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(34, input);
				throw eee;
			}
			cnt34++;
		}

		}

	}
	// $ANTLR end synpred1_FOL

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


	protected DFA23 dfa23 = new DFA23(this);
	protected DFA32 dfa32 = new DFA32(this);
	static final String DFA23_eotS =
		"\2\uffff\1\4\2\uffff";
	static final String DFA23_eofS =
		"\5\uffff";
	static final String DFA23_minS =
		"\1\56\1\uffff\1\56\2\uffff";
	static final String DFA23_maxS =
		"\1\71\1\uffff\1\71\2\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\1\3";
	static final String DFA23_specialS =
		"\2\uffff\1\0\2\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1\1\uffff\12\2",
			"",
			"\1\3\1\uffff\12\2",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "290:1: FLOAT : ( '.' ( '0' .. '9' )+ ( EXPONENT )? | ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )=> ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ ( EXPONENT |) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_2 = input.LA(1);
						 
						int index23_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA23_2=='.') && (synpred1_FOL())) {s = 3;}
						else if ( ((LA23_2 >= '0' && LA23_2 <= '9')) ) {s = 2;}
						else s = 4;
						 
						input.seek(index23_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA32_eotS =
		"\12\uffff\1\50\1\uffff\1\50\1\uffff\1\63\1\uffff\1\66\2\uffff\1\50\1\uffff"+
		"\1\50\1\uffff\1\50\2\uffff\1\50\1\73\1\76\5\uffff\6\51\2\uffff\1\106\4"+
		"\uffff\3\50\2\uffff\1\21\2\uffff\1\24\3\50\4\uffff\3\51\1\24\3\51\1\uffff"+
		"\3\50\1\26\1\30\2\50\3\51\1\26\1\30\2\51\1\13\4\50\1\13\4\51\1\15\3\50"+
		"\1\15\3\51\1\31\1\73\1\50\1\31\1\73\1\51\1\50\1\51\1\50\1\51\1\50\1\51"+
		"\2\74";
	static final String DFA32_eofS =
		"\165\uffff";
	static final String DFA32_minS =
		"\1\11\11\uffff\1\122\1\uffff\1\101\1\uffff\1\74\1\uffff\1\75\2\uffff\1"+
		"\122\1\uffff\1\116\1\uffff\1\117\2\uffff\1\130\1\11\1\75\5\uffff\1\122"+
		"\1\101\1\122\1\116\1\117\1\130\2\uffff\1\56\4\uffff\1\125\1\114\1\122"+
		"\2\uffff\1\76\2\uffff\1\60\1\104\1\124\1\101\4\uffff\1\125\1\114\1\122"+
		"\1\60\1\104\1\124\1\101\1\uffff\1\105\1\123\1\101\2\60\1\123\1\103\1\105"+
		"\1\123\1\101\2\60\1\123\1\103\1\60\1\105\1\114\2\124\1\60\1\105\1\114"+
		"\2\124\1\60\1\114\1\123\1\114\1\60\1\114\1\123\1\114\2\60\1\131\2\60\1"+
		"\131\2\117\2\116\2\105\2\60";
	static final String DFA32_maxS =
		"\1\uffe2\11\uffff\1\162\1\uffff\1\157\1\uffff\1\76\1\uffff\1\76\2\uffff"+
		"\1\162\1\uffff\1\156\1\uffff\1\157\2\uffff\1\170\1\41\1\75\5\uffff\1\162"+
		"\1\157\1\162\1\156\1\157\1\170\2\uffff\1\145\4\uffff\1\165\1\154\1\162"+
		"\2\uffff\1\76\2\uffff\1\172\1\144\1\164\1\151\4\uffff\1\165\1\154\1\162"+
		"\1\172\1\144\1\164\1\151\1\uffff\1\145\1\163\1\141\2\172\1\163\1\143\1"+
		"\145\1\163\1\141\2\172\1\163\1\143\1\172\1\145\1\154\2\164\1\172\1\145"+
		"\1\154\2\164\1\172\1\154\1\163\1\154\1\172\1\154\1\163\1\154\2\172\1\171"+
		"\2\172\1\171\2\157\2\156\2\145\2\172";
	static final String DFA32_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\uffff\1"+
		"\13\1\uffff\1\14\1\uffff\1\15\1\16\1\uffff\1\17\1\uffff\1\20\1\uffff\1"+
		"\21\1\22\3\uffff\1\33\1\34\1\35\1\36\1\37\6\uffff\1\40\1\41\1\uffff\1"+
		"\43\1\44\1\45\1\46\3\uffff\1\26\1\27\1\uffff\1\32\1\25\4\uffff\1\23\1"+
		"\24\1\30\1\31\7\uffff\1\42\56\uffff";
	static final String DFA32_specialS =
		"\165\uffff}>";
	static final String[] DFA32_transitionS = {
			"\2\55\2\uffff\1\55\22\uffff\1\55\2\uffff\1\56\1\uffff\1\41\1\uffff\1"+
			"\54\1\1\1\2\1\37\1\35\1\3\1\36\1\53\1\40\12\52\1\uffff\1\4\1\20\1\16"+
			"\1\34\2\uffff\1\45\3\51\1\47\1\43\7\51\1\46\1\44\4\51\1\42\6\51\1\5\1"+
			"\uffff\1\6\3\uffff\1\25\3\50\1\32\1\14\7\50\1\27\1\23\4\50\1\12\6\50"+
			"\1\7\1\10\1\11\1\30\55\uffff\1\30\u2153\uffff\1\31\2\uffff\1\33\43\uffff"+
			"\1\26\1\24\70\uffff\1\22\40\uffff\1\21\1\17\40\uffff\1\13\1\15\udd3c"+
			"\uffff\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57\37\uffff\1\57",
			"",
			"\1\60\15\uffff\1\61\21\uffff\1\60\15\uffff\1\61",
			"",
			"\1\62\1\uffff\1\17",
			"",
			"\1\64\1\65",
			"",
			"",
			"\1\67\37\uffff\1\67",
			"",
			"\1\70\37\uffff\1\70",
			"",
			"\1\71\37\uffff\1\71",
			"",
			"",
			"\1\72\37\uffff\1\72",
			"\2\74\2\uffff\1\74\22\uffff\2\74",
			"\1\75",
			"",
			"",
			"",
			"",
			"",
			"\1\77\37\uffff\1\77",
			"\1\100\15\uffff\1\101\21\uffff\1\100\15\uffff\1\101",
			"\1\102\37\uffff\1\102",
			"\1\103\37\uffff\1\103",
			"\1\104\37\uffff\1\104",
			"\1\105\37\uffff\1\105",
			"",
			"",
			"\1\53\1\uffff\12\52\13\uffff\1\53\37\uffff\1\53",
			"",
			"",
			"",
			"",
			"\1\107\37\uffff\1\107",
			"\1\110\37\uffff\1\110",
			"\1\111\37\uffff\1\111",
			"",
			"",
			"\1\22",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\112\37\uffff\1\112",
			"\1\113\37\uffff\1\113",
			"\1\115\7\uffff\1\114\27\uffff\1\115\7\uffff\1\114",
			"",
			"",
			"",
			"",
			"\1\116\37\uffff\1\116",
			"\1\117\37\uffff\1\117",
			"\1\120\37\uffff\1\120",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\121\37\uffff\1\121",
			"\1\122\37\uffff\1\122",
			"\1\124\7\uffff\1\123\27\uffff\1\124\7\uffff\1\123",
			"",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\37\uffff\1\127",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\130\37\uffff\1\130",
			"\1\131\37\uffff\1\131",
			"\1\132\37\uffff\1\132",
			"\1\133\37\uffff\1\133",
			"\1\134\37\uffff\1\134",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\135\37\uffff\1\135",
			"\1\136\37\uffff\1\136",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\137\37\uffff\1\137",
			"\1\140\37\uffff\1\140",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\143\37\uffff\1\143",
			"\1\144\37\uffff\1\144",
			"\1\145\37\uffff\1\145",
			"\1\146\37\uffff\1\146",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\147\37\uffff\1\147",
			"\1\150\37\uffff\1\150",
			"\1\151\37\uffff\1\151",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\152\37\uffff\1\152",
			"\1\153\37\uffff\1\153",
			"\1\154\37\uffff\1\154",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\155\37\uffff\1\155",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
			"\1\156\37\uffff\1\156",
			"\1\157\37\uffff\1\157",
			"\1\160\37\uffff\1\160",
			"\1\161\37\uffff\1\161",
			"\1\162\37\uffff\1\162",
			"\1\163\37\uffff\1\163",
			"\1\164\37\uffff\1\164",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51"
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | TRUE | FALSE | IMPLIES | IMPLIED_BY | IFF | OR | AND | NOT | FORALL | EXISTS | EXACTLY_ONE | LT | LE | EQ | GE | GT | NE | ADD | SUB | MUL | DIV | MOD | NAME | VARIABLE | INTEGER | FLOAT | STRING | WS_2 | COMMENT );";
		}
	}

}
