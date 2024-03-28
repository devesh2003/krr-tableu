// $ANTLR 3.5.3 PL.g 2024-02-25 16:03:24

package in.ac.iitm.cse.parser.pl;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PLLexer extends Lexer {
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

	    String stripQuotes(String t) { return t.substring(1,t.length()-1); }

	    public Map<Integer,String> textAttribute() {
	        Map<Integer,String> map = new HashMap<Integer,String>();
	        map.put(VARIABLE,"name");
	        return map;
	    }

	    public Set<Integer> simpleTokens() {
	        Set<Integer> set = new HashSet<Integer>();

	        set.add(PL);
	        set.add(BLOCK);

	        set.add(TRUE);
	        set.add(FALSE);

	        set.add(IFF);
	        set.add(IMPLIES);
	        set.add(IMPLIED_BY);

	        set.add(OR);
	//      set.add(XOR);

	        set.add(AND);
	//      set.add(NAND);

	        set.add(NOT);
	//      set.add(NOR);
	//      set.add(XNOR);

	        return set;
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PLLexer() {} 
	public PLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "PL.g"; }

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:50:7
			// PL.g:50:9
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:51:7
			// PL.g:51:9
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:52:7
			// PL.g:52:9
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:53:7
			// PL.g:53:9
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:54:7
			// PL.g:54:9
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:55:7
			// PL.g:55:9
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:56:7
			// PL.g:56:9
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:140:13
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='T'||LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='\u22A4') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// PL.g:140:17
					{
					mT(); 

					mR(); 

					mU(); 

					mE(); 

					}
					break;
				case 2 :
					// PL.g:140:27
					{
					match('\u22A4'); 
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
			// PL.g:141:13
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='F'||LA2_0=='f') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\u22A5') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// PL.g:141:17
					{
					mF(); 

					mA(); 

					mL(); 

					mS(); 

					mE(); 

					}
					break;
				case 2 :
					// PL.g:141:29
					{
					match('\u22A5'); 
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
			// PL.g:143:13
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='=') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\u2283') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// PL.g:143:17
					{
					match("=>"); 

					}
					break;
				case 2 :
					// PL.g:143:25
					{
					match('\u2283'); 
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
			// PL.g:144:13
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='<') ) {
				alt4=1;
			}
			else if ( (LA4_0=='\u2282') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// PL.g:144:17
					{
					match("<="); 

					}
					break;
				case 2 :
					// PL.g:144:25
					{
					match('\u2282'); 
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
			// PL.g:145:13
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='<') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\u2261') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// PL.g:145:17
					{
					match("<=>"); 

					}
					break;
				case 2 :
					// PL.g:145:25
					{
					match('\u2261'); 
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
			// PL.g:147:13
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='O'||LA6_0=='o') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\u2228') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// PL.g:147:17
					{
					mO(); 

					mR(); 

					}
					break;
				case 2 :
					// PL.g:147:25
					{
					match('\u2228'); 
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
			// PL.g:148:13
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='A'||LA7_0=='a') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\u2227') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// PL.g:148:17
					{
					mA(); 

					mN(); 

					mD(); 

					}
					break;
				case 2 :
					// PL.g:148:25
					{
					match('\u2227'); 
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
			// PL.g:149:13
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
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// PL.g:149:17
					{
					mN(); 

					mO(); 

					mT(); 

					}
					break;
				case 2 :
					// PL.g:149:25
					{
					match('~'); 
					}
					break;
				case 3 :
					// PL.g:149:31
					{
					match('\u00AC'); 
					}
					break;
				case 4 :
					// PL.g:149:37
					{
					match('\uFFE2'); 
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

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:156:13
			// PL.g:156:17
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// PL.g:156:37
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// PL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
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

	// $ANTLR start "WS_2"
	public final void mWS_2() throws RecognitionException {
		try {
			int _type = WS_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PL.g:160:13
			// PL.g:160:17
			{
			mWS(); 

			_channel=HIDDEN;
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
			// PL.g:161:13
			// PL.g:161:17
			{
			match('#'); 
			// PL.g:161:21
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// PL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			// PL.g:161:35
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='\n'||LA12_0=='\r') ) {
				alt12=1;
			}

			else {
				alt12=2;
			}

			switch (alt12) {
				case 1 :
					// PL.g:161:36
					{
					// PL.g:161:36
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// PL.g:161:36
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// PL.g:161:47
					{
					match(EOF); 

					}
					break;

			}

			_channel=HIDDEN;
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
			// PL.g:167:13
			// PL.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
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

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// PL.g:168:13
			// PL.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
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
			// PL.g:169:13
			// PL.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
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
			// PL.g:170:13
			// PL.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
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
			// PL.g:171:13
			// PL.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
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
			// PL.g:172:13
			// PL.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
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
			// PL.g:173:13
			// PL.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
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
			// PL.g:174:13
			// PL.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
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
			// PL.g:175:13
			// PL.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
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
			// PL.g:176:13
			// PL.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
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
			// PL.g:177:13
			// PL.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
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
			// PL.g:178:13
			// PL.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
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
			// PL.g:179:13
			// PL.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
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
			// PL.g:180:13
			// PL.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
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
			// PL.g:181:13
			// PL.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
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
			// PL.g:182:13
			// PL.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
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
			// PL.g:183:13
			// PL.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
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
			// PL.g:184:13
			// PL.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
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
			// PL.g:185:13
			// PL.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
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
			// PL.g:186:13
			// PL.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
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
			// PL.g:187:13
			// PL.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
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
			// PL.g:188:13
			// PL.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
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
			// PL.g:189:13
			// PL.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
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
			// PL.g:190:13
			// PL.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
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
			// PL.g:191:13
			// PL.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
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
			// PL.g:192:13
			// PL.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
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
			// PL.g:193:13
			// PL.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
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
		// PL.g:1:8
		int alt13=18;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt13=1;
			}
			break;
		case ')':
			{
			alt13=2;
			}
			break;
		case ';':
			{
			alt13=3;
			}
			break;
		case '[':
			{
			alt13=4;
			}
			break;
		case ']':
			{
			alt13=5;
			}
			break;
		case '{':
			{
			alt13=6;
			}
			break;
		case '}':
			{
			alt13=7;
			}
			break;
		case 'T':
		case 't':
			{
			int LA13_8 = input.LA(2);
			if ( (LA13_8=='R'||LA13_8=='r') ) {
				int LA13_25 = input.LA(3);
				if ( (LA13_25=='U'||LA13_25=='u') ) {
					int LA13_31 = input.LA(4);
					if ( (LA13_31=='E'||LA13_31=='e') ) {
						int LA13_35 = input.LA(5);
						if ( ((LA13_35 >= '0' && LA13_35 <= '9')||(LA13_35 >= 'A' && LA13_35 <= 'Z')||LA13_35=='_'||(LA13_35 >= 'a' && LA13_35 <= 'z')) ) {
							alt13=16;
						}

						else {
							alt13=8;
						}

					}

					else {
						alt13=16;
					}

				}

				else {
					alt13=16;
				}

			}

			else {
				alt13=16;
			}

			}
			break;
		case '\u22A4':
			{
			alt13=8;
			}
			break;
		case 'F':
		case 'f':
			{
			int LA13_10 = input.LA(2);
			if ( (LA13_10=='A'||LA13_10=='a') ) {
				int LA13_26 = input.LA(3);
				if ( (LA13_26=='L'||LA13_26=='l') ) {
					int LA13_32 = input.LA(4);
					if ( (LA13_32=='S'||LA13_32=='s') ) {
						int LA13_36 = input.LA(5);
						if ( (LA13_36=='E'||LA13_36=='e') ) {
							int LA13_37 = input.LA(6);
							if ( ((LA13_37 >= '0' && LA13_37 <= '9')||(LA13_37 >= 'A' && LA13_37 <= 'Z')||LA13_37=='_'||(LA13_37 >= 'a' && LA13_37 <= 'z')) ) {
								alt13=16;
							}

							else {
								alt13=9;
							}

						}

						else {
							alt13=16;
						}

					}

					else {
						alt13=16;
					}

				}

				else {
					alt13=16;
				}

			}

			else {
				alt13=16;
			}

			}
			break;
		case '\u22A5':
			{
			alt13=9;
			}
			break;
		case '=':
		case '\u2283':
			{
			alt13=10;
			}
			break;
		case '<':
			{
			int LA13_13 = input.LA(2);
			if ( (LA13_13=='=') ) {
				int LA13_27 = input.LA(3);
				if ( (LA13_27=='>') ) {
					alt13=12;
				}

				else {
					alt13=11;
				}

			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 13, 13, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\u2282':
			{
			alt13=11;
			}
			break;
		case '\u2261':
			{
			alt13=12;
			}
			break;
		case 'O':
		case 'o':
			{
			int LA13_16 = input.LA(2);
			if ( (LA13_16=='R'||LA13_16=='r') ) {
				int LA13_28 = input.LA(3);
				if ( ((LA13_28 >= '0' && LA13_28 <= '9')||(LA13_28 >= 'A' && LA13_28 <= 'Z')||LA13_28=='_'||(LA13_28 >= 'a' && LA13_28 <= 'z')) ) {
					alt13=16;
				}

				else {
					alt13=13;
				}

			}

			else {
				alt13=16;
			}

			}
			break;
		case '\u2228':
			{
			alt13=13;
			}
			break;
		case 'A':
		case 'a':
			{
			int LA13_18 = input.LA(2);
			if ( (LA13_18=='N'||LA13_18=='n') ) {
				int LA13_29 = input.LA(3);
				if ( (LA13_29=='D'||LA13_29=='d') ) {
					int LA13_33 = input.LA(4);
					if ( ((LA13_33 >= '0' && LA13_33 <= '9')||(LA13_33 >= 'A' && LA13_33 <= 'Z')||LA13_33=='_'||(LA13_33 >= 'a' && LA13_33 <= 'z')) ) {
						alt13=16;
					}

					else {
						alt13=14;
					}

				}

				else {
					alt13=16;
				}

			}

			else {
				alt13=16;
			}

			}
			break;
		case '\u2227':
			{
			alt13=14;
			}
			break;
		case 'N':
		case 'n':
			{
			int LA13_20 = input.LA(2);
			if ( (LA13_20=='O'||LA13_20=='o') ) {
				int LA13_30 = input.LA(3);
				if ( (LA13_30=='T'||LA13_30=='t') ) {
					int LA13_34 = input.LA(4);
					if ( ((LA13_34 >= '0' && LA13_34 <= '9')||(LA13_34 >= 'A' && LA13_34 <= 'Z')||LA13_34=='_'||(LA13_34 >= 'a' && LA13_34 <= 'z')) ) {
						alt13=16;
					}

					else {
						alt13=15;
					}

				}

				else {
					alt13=16;
				}

			}

			else {
				alt13=16;
			}

			}
			break;
		case '~':
		case '\u00AC':
		case '\uFFE2':
			{
			alt13=15;
			}
			break;
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt13=16;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt13=17;
			}
			break;
		case '#':
			{
			alt13=18;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 13, 0, input);
			throw nvae;
		}
		switch (alt13) {
			case 1 :
				// PL.g:1:10
				{
				mT__45(); 

				}
				break;
			case 2 :
				// PL.g:1:16
				{
				mT__46(); 

				}
				break;
			case 3 :
				// PL.g:1:22
				{
				mT__47(); 

				}
				break;
			case 4 :
				// PL.g:1:28
				{
				mT__48(); 

				}
				break;
			case 5 :
				// PL.g:1:34
				{
				mT__49(); 

				}
				break;
			case 6 :
				// PL.g:1:40
				{
				mT__50(); 

				}
				break;
			case 7 :
				// PL.g:1:46
				{
				mT__51(); 

				}
				break;
			case 8 :
				// PL.g:1:52
				{
				mTRUE(); 

				}
				break;
			case 9 :
				// PL.g:1:57
				{
				mFALSE(); 

				}
				break;
			case 10 :
				// PL.g:1:63
				{
				mIMPLIES(); 

				}
				break;
			case 11 :
				// PL.g:1:71
				{
				mIMPLIED_BY(); 

				}
				break;
			case 12 :
				// PL.g:1:82
				{
				mIFF(); 

				}
				break;
			case 13 :
				// PL.g:1:86
				{
				mOR(); 

				}
				break;
			case 14 :
				// PL.g:1:89
				{
				mAND(); 

				}
				break;
			case 15 :
				// PL.g:1:93
				{
				mNOT(); 

				}
				break;
			case 16 :
				// PL.g:1:97
				{
				mNAME(); 

				}
				break;
			case 17 :
				// PL.g:1:102
				{
				mWS_2(); 

				}
				break;
			case 18 :
				// PL.g:1:107
				{
				mCOMMENT(); 

				}
				break;

		}
	}



}
