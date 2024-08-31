// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: C:/Users/Javier C/OneDrive - Universidad Francisco Marroquin/Clases/Cloud/Proyecto-Compi/class/compiler/scanner/Prueba2/Lexer.flex

package Prueba2;
import static Prueba2.Tokens.*;


@SuppressWarnings("fallthrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\4"+
    "\3\0\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\11\21\1\0\1\22"+
    "\1\23\1\24\1\25\2\0\6\26\21\27\1\30\2\27"+
    "\1\31\1\0\1\32\1\0\1\33\1\0\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\27"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\27\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\27"+
    "\1\63\1\64\1\65\7\0\1\3\u01a2\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\1\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\4\22\1\23\1\26\1\23\1\26\4\23\1\27\1\1"+
    "\1\30\1\31\1\32\1\0\1\33\1\34\1\2\1\0"+
    "\1\35\1\36\1\37\1\40\14\23\1\41\12\23\1\42"+
    "\1\43\1\44\13\23\1\45\1\46\15\23\1\47\2\23"+
    "\1\50\1\51\6\23\1\52\1\53\1\0\1\54\1\23"+
    "\1\55\1\23\1\56\1\23\1\57\1\23\1\60\5\23"+
    "\1\0\1\61\3\23\1\0\3\23\1\62\1\0\1\63"+
    "\1\64\1\23\1\0\1\65\1\0\1\66\1\0\1\67"+
    "\2\0\1\70\2\0\1\71\1\0\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\66\0\330\0\u010e\0\66"+
    "\0\66\0\66\0\u0144\0\66\0\u017a\0\66\0\u01b0\0\u01e6"+
    "\0\u021c\0\66\0\u0252\0\u0288\0\u02be\0\u02f4\0\u02f4\0\u032a"+
    "\0\66\0\u02f4\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e"+
    "\0\u04a4\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\66\0\u05e8"+
    "\0\66\0\66\0\66\0\u061e\0\66\0\66\0\u0654\0\u068a"+
    "\0\66\0\66\0\66\0\66\0\u06c0\0\u06f6\0\u072c\0\u0762"+
    "\0\u0798\0\u07ce\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912"+
    "\0\u02f4\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c"+
    "\0\u0ac2\0\u0af8\0\u0b2e\0\66\0\66\0\u068a\0\u0b64\0\u0b9a"+
    "\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a"+
    "\0\u0d80\0\u02f4\0\u02f4\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e"+
    "\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e"+
    "\0\u02f4\0\u1074\0\u10aa\0\u02f4\0\u02f4\0\u10e0\0\u1116\0\u114c"+
    "\0\u1182\0\u11b8\0\u11ee\0\u02f4\0\u02f4\0\u1224\0\u02f4\0\u125a"+
    "\0\u02f4\0\u1290\0\u02f4\0\u12c6\0\u02f4\0\u12fc\0\u02f4\0\u1332"+
    "\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440\0\u02f4\0\u1476\0\u14ac"+
    "\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u02f4\0\u15f0\0\u02f4"+
    "\0\u02f4\0\u1626\0\u165c\0\u02f4\0\u1692\0\u02f4\0\u16c8\0\u02f4"+
    "\0\u16fe\0\u1734\0\66\0\u176a\0\u17a0\0\66\0\u17d6\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\2\27\1\30"+
    "\1\31\1\2\1\32\1\33\1\34\1\26\1\35\1\36"+
    "\1\27\1\32\1\37\1\27\1\40\1\41\2\27\1\42"+
    "\1\43\1\27\1\44\1\27\1\45\1\46\2\27\1\47"+
    "\1\50\1\51\67\0\2\3\107\0\1\52\47\0\1\53"+
    "\105\0\3\54\3\0\27\54\27\0\1\55\65\0\1\56"+
    "\60\0\1\57\66\0\2\21\6\0\1\60\30\0\1\60"+
    "\24\0\2\21\70\0\1\61\65\0\1\62\65\0\1\63"+
    "\61\0\2\27\4\0\3\27\3\0\27\27\35\0\1\64"+
    "\53\0\2\27\4\0\3\27\3\0\12\27\1\65\2\27"+
    "\1\66\1\27\1\67\7\27\23\0\2\27\4\0\3\27"+
    "\3\0\1\70\6\27\1\71\2\27\1\72\2\27\1\73"+
    "\11\27\23\0\2\27\4\0\3\27\3\0\12\27\1\74"+
    "\12\27\1\75\1\27\23\0\2\27\4\0\3\27\3\0"+
    "\1\76\7\27\1\77\4\27\1\100\11\27\23\0\2\27"+
    "\4\0\3\27\3\0\5\27\1\101\6\27\1\102\12\27"+
    "\23\0\2\27\4\0\3\27\3\0\10\27\1\103\16\27"+
    "\23\0\2\27\4\0\3\27\3\0\4\27\1\104\22\27"+
    "\23\0\2\27\4\0\3\27\3\0\17\27\1\105\7\27"+
    "\23\0\2\27\4\0\3\27\3\0\4\27\1\106\22\27"+
    "\23\0\2\27\4\0\3\27\3\0\17\27\1\107\6\27"+
    "\1\110\23\0\2\27\4\0\3\27\3\0\1\111\14\27"+
    "\1\112\11\27\23\0\2\27\4\0\3\27\3\0\7\27"+
    "\1\113\17\27\67\0\1\114\10\0\1\115\56\0\2\57"+
    "\2\0\62\57\20\0\2\116\4\0\1\116\5\0\6\116"+
    "\44\0\2\27\4\0\3\27\3\0\15\27\1\117\11\27"+
    "\23\0\2\27\4\0\3\27\3\0\15\27\1\120\11\27"+
    "\23\0\2\27\4\0\3\27\3\0\4\27\1\121\22\27"+
    "\23\0\2\27\4\0\3\27\3\0\12\27\1\122\14\27"+
    "\23\0\2\27\4\0\3\27\3\0\1\123\26\27\23\0"+
    "\2\27\4\0\3\27\3\0\1\124\26\27\23\0\2\27"+
    "\4\0\3\27\3\0\14\27\1\125\12\27\23\0\2\27"+
    "\4\0\3\27\3\0\20\27\1\126\6\27\23\0\2\27"+
    "\4\0\3\27\3\0\16\27\1\127\10\27\23\0\2\27"+
    "\4\0\3\27\3\0\12\27\1\130\14\27\23\0\2\27"+
    "\4\0\3\27\3\0\4\27\1\131\22\27\23\0\2\27"+
    "\4\0\3\27\3\0\17\27\1\132\7\27\23\0\2\27"+
    "\4\0\3\27\3\0\21\27\1\133\5\27\23\0\2\27"+
    "\4\0\3\27\3\0\21\27\1\134\5\27\23\0\2\27"+
    "\4\0\3\27\3\0\21\27\1\135\5\27\23\0\2\27"+
    "\4\0\3\27\3\0\15\27\1\136\11\27\23\0\2\27"+
    "\4\0\3\27\3\0\21\27\1\137\5\27\23\0\2\27"+
    "\4\0\3\27\3\0\22\27\1\140\4\27\23\0\2\27"+
    "\4\0\3\27\3\0\16\27\1\141\10\27\23\0\2\27"+
    "\4\0\3\27\3\0\17\27\1\142\7\27\23\0\2\27"+
    "\4\0\3\27\3\0\10\27\1\143\16\27\23\0\2\27"+
    "\4\0\3\27\3\0\10\27\1\144\16\27\23\0\2\27"+
    "\4\0\3\27\3\0\2\27\1\145\24\27\23\0\2\27"+
    "\4\0\3\27\3\0\12\27\1\146\14\27\23\0\2\27"+
    "\4\0\3\27\3\0\1\147\26\27\23\0\2\27\4\0"+
    "\3\27\3\0\12\27\1\150\14\27\23\0\2\27\4\0"+
    "\3\27\3\0\17\27\1\151\7\27\23\0\2\27\4\0"+
    "\3\27\3\0\20\27\1\152\6\27\23\0\2\27\4\0"+
    "\3\27\3\0\21\27\1\153\5\27\23\0\2\27\4\0"+
    "\3\27\3\0\4\27\1\154\22\27\23\0\2\27\4\0"+
    "\3\27\3\0\17\27\1\155\7\27\23\0\2\27\4\0"+
    "\3\27\3\0\20\27\1\156\6\27\23\0\2\27\4\0"+
    "\3\27\3\0\12\27\1\157\14\27\23\0\2\27\4\0"+
    "\3\27\3\0\4\27\1\160\22\27\23\0\2\27\4\0"+
    "\3\27\3\0\7\27\1\161\17\27\23\0\2\27\4\0"+
    "\3\27\3\0\6\27\1\162\20\27\23\0\2\27\4\0"+
    "\3\27\3\0\22\27\1\163\4\27\23\0\2\27\4\0"+
    "\3\27\3\0\4\27\1\164\22\27\23\0\2\27\4\0"+
    "\3\27\3\0\4\27\1\165\22\27\23\0\2\27\4\0"+
    "\3\27\2\0\1\166\27\27\23\0\2\27\4\0\3\27"+
    "\3\0\3\27\1\167\23\27\23\0\2\27\4\0\3\27"+
    "\3\0\12\27\1\170\14\27\23\0\2\27\4\0\3\27"+
    "\3\0\11\27\1\171\15\27\23\0\2\27\4\0\3\27"+
    "\3\0\4\27\1\172\22\27\23\0\2\27\4\0\3\27"+
    "\3\0\11\27\1\173\15\27\23\0\2\27\4\0\3\27"+
    "\3\0\15\27\1\174\11\27\23\0\2\27\4\0\3\27"+
    "\3\0\20\27\1\175\6\27\23\0\2\27\4\0\3\27"+
    "\3\0\10\27\1\176\16\27\23\0\2\27\4\0\3\27"+
    "\3\0\4\27\1\177\22\27\23\0\2\27\4\0\3\27"+
    "\3\0\3\27\1\200\23\27\23\0\2\27\4\0\3\27"+
    "\3\0\17\27\1\201\7\27\23\0\2\27\4\0\3\27"+
    "\3\0\15\27\1\202\11\27\23\0\2\27\4\0\3\27"+
    "\3\0\17\27\1\203\7\27\23\0\2\27\4\0\3\27"+
    "\3\0\17\27\1\204\7\27\42\0\1\205\46\0\2\27"+
    "\4\0\3\27\3\0\4\27\1\206\22\27\23\0\2\27"+
    "\4\0\3\27\3\0\1\207\26\27\23\0\2\27\4\0"+
    "\3\27\3\0\22\27\1\210\4\27\23\0\2\27\4\0"+
    "\3\27\3\0\14\27\1\211\12\27\23\0\2\27\4\0"+
    "\3\27\2\0\1\212\27\27\23\0\2\27\4\0\3\27"+
    "\3\0\1\213\26\27\23\0\2\27\4\0\3\27\3\0"+
    "\3\27\1\214\23\27\23\0\2\27\4\0\3\27\3\0"+
    "\1\215\26\27\23\0\2\27\4\0\3\27\3\0\14\27"+
    "\1\216\12\27\43\0\1\217\45\0\2\27\4\0\3\27"+
    "\3\0\14\27\1\220\12\27\23\0\2\27\4\0\3\27"+
    "\3\0\21\27\1\221\5\27\23\0\2\27\4\0\3\27"+
    "\3\0\22\27\1\222\4\27\42\0\1\223\46\0\2\27"+
    "\4\0\3\27\3\0\12\27\1\224\14\27\23\0\2\27"+
    "\4\0\3\27\2\0\1\225\27\27\23\0\2\27\4\0"+
    "\3\27\3\0\13\27\1\226\13\27\41\0\1\227\47\0"+
    "\2\27\4\0\3\27\3\0\4\27\1\230\22\27\43\0"+
    "\1\231\64\0\1\232\74\0\1\233\55\0\1\234\67\0"+
    "\1\235\73\0\1\236\55\0\1\237\75\0\1\240\17\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[6156];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\3\11\1\1\1\11"+
    "\1\1\1\11\3\1\1\11\6\1\1\11\15\1\1\11"+
    "\1\1\3\11\1\0\2\11\1\1\1\0\4\11\27\1"+
    "\2\11\50\1\1\0\16\1\1\0\4\1\1\0\4\1"+
    "\1\0\3\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\2\0\1\11\2\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[160];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Tokens yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return Tokens.ERROR;
            }
          // fall through
          case 59: break;
          case 2:
            { /*Ignore*/
            }
          // fall through
          case 60: break;
          case 3:
            { return NOT;
            }
          // fall through
          case 61: break;
          case 4:
            { return MOD;
            }
          // fall through
          case 62: break;
          case 5:
            { return OPEN_PAREN;
            }
          // fall through
          case 63: break;
          case 6:
            { return CLOSE_PAREN;
            }
          // fall through
          case 64: break;
          case 7:
            { return MULTIPLICATION;
            }
          // fall through
          case 65: break;
          case 8:
            { return SUM;
            }
          // fall through
          case 66: break;
          case 9:
            { return COMMA;
            }
          // fall through
          case 67: break;
          case 10:
            { return SUS;
            }
          // fall through
          case 68: break;
          case 11:
            { return DOT;
            }
          // fall through
          case 69: break;
          case 12:
            { return DIVIDE;
            }
          // fall through
          case 70: break;
          case 13:
            { lexeme=yytext(); return INT_LITERAL;
            }
          // fall through
          case 71: break;
          case 14:
            { return SEMICOLON;
            }
          // fall through
          case 72: break;
          case 15:
            { return LESS_THAN;
            }
          // fall through
          case 73: break;
          case 16:
            { return ASIGN;
            }
          // fall through
          case 74: break;
          case 17:
            { return MORE_THAN;
            }
          // fall through
          case 75: break;
          case 18:
            { lexeme=yytext(); return HEX_DIGIT;
            }
          // fall through
          case 76: break;
          case 19:
            { lexeme=yytext(); return ID;
            }
          // fall through
          case 77: break;
          case 20:
            { return OPEN_BRACKET;
            }
          // fall through
          case 78: break;
          case 21:
            { return CLOSE_BRACKET;
            }
          // fall through
          case 79: break;
          case 22:
            { lexeme=yytext(); return STRING_LITERAL;
            }
          // fall through
          case 80: break;
          case 23:
            { return OPEN_BRACE;
            }
          // fall through
          case 81: break;
          case 24:
            { return CLOSE_BRACE;
            }
          // fall through
          case 82: break;
          case 25:
            { return DIFFERENT;
            }
          // fall through
          case 83: break;
          case 26:
            { return AND;
            }
          // fall through
          case 84: break;
          case 27:
            { return SUM_ASIGN;
            }
          // fall through
          case 85: break;
          case 28:
            { return SUS_ASIGN;
            }
          // fall through
          case 86: break;
          case 29:
            { return LESS_THAN_OR_EQUAL;
            }
          // fall through
          case 87: break;
          case 30:
            { return EQUAL;
            }
          // fall through
          case 88: break;
          case 31:
            { return MORE_THAN_OR_EQUAL;
            }
          // fall through
          case 89: break;
          case 32:
            { return BRACES;
            }
          // fall through
          case 90: break;
          case 33:
            { return IF;
            }
          // fall through
          case 91: break;
          case 34:
            { return OR;
            }
          // fall through
          case 92: break;
          case 35:
            { lexeme=yytext(); return CHAR_LITERAL;
            }
          // fall through
          case 93: break;
          case 36:
            { lexeme=yytext(); return HEX_LITERAL;
            }
          // fall through
          case 94: break;
          case 37:
            { return FOR;
            }
          // fall through
          case 95: break;
          case 38:
            { return INT;
            }
          // fall through
          case 96: break;
          case 39:
            { return CHAR;
            }
          // fall through
          case 97: break;
          case 40:
            { return ELSE;
            }
          // fall through
          case 98: break;
          case 41:
            { return EXPR;
            }
          // fall through
          case 99: break;
          case 42:
            { return TRUE;
            }
          // fall through
          case 100: break;
          case 43:
            { return TYPE;
            }
          // fall through
          case 101: break;
          case 44:
            { return VOID;
            }
          // fall through
          case 102: break;
          case 45:
            { return BLOCK;
            }
          // fall through
          case 103: break;
          case 46:
            { return BREAK;
            }
          // fall through
          case 104: break;
          case 47:
            { return CLASS;
            }
          // fall through
          case 105: break;
          case 48:
            { return FALSE;
            }
          // fall through
          case 106: break;
          case 49:
            { return WHILE;
            }
          // fall through
          case 107: break;
          case 50:
            { return RETURN;
            }
          // fall through
          case 108: break;
          case 51:
            { return BOOLEAN;
            }
          // fall through
          case 109: break;
          case 52:
            { return CALLOUT;
            }
          // fall through
          case 110: break;
          case 53:
            { return LITERAL;
            }
          // fall through
          case 111: break;
          case 54:
            { return PROGRAM;
            }
          // fall through
          case 112: break;
          case 55:
            { return CONTINUE;
            }
          // fall through
          case 113: break;
          case 56:
            { return VAR_DECL;
            }
          // fall through
          case 114: break;
          case 57:
            { return FIELD_DECL;
            }
          // fall through
          case 115: break;
          case 58:
            { return METHOD_DECL;
            }
          // fall through
          case 116: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
