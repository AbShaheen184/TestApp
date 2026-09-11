package org.mozilla.javascript;

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class TokenStream implements Parser.CurrentPositionReporter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char BYTE_ORDER_MARK = 65279;
    private static final int EOF_CHAR = -1;
    private static final char NUMERIC_SEPARATOR = '_';
    private static final int REPORT_NUMBER_FORMAT_ERROR = -2;
    private BigInteger bigInt;
    Token.CommentType commentType;
    int cursor;
    private boolean dirtyLine;
    private boolean isBinary;
    private boolean isHex;
    private boolean isOctal;
    private boolean isOldOctal;
    private int lastLineEnd;
    int lineno;
    private double number;
    private Parser parser;
    private int quoteChar;
    String regExpFlags;
    private char[] sourceBuffer;
    int sourceCursor;
    private int sourceEnd;
    private Reader sourceReader;
    private String sourceString;
    private int stringBufferTop;
    int tokenBeg;
    int tokenEnd;
    private int tokenStartLastLineEnd;
    private int tokenStartLineno;
    private int ungetCursor;
    private boolean xmlIsAttribute;
    private boolean xmlIsTagContent;
    private int xmlOpenTagsCount;
    private StringBuilder rawString = new StringBuilder();
    private String string = "";
    private char[] stringBuffer = new char[128];
    private final HashMap<String, String> allStrings = new HashMap<>();
    private final int[] ungetBuffer = new int[3];
    private boolean hitEOF = false;
    private int lineStart = 0;
    private int lineEndChar = -1;
    private String commentPrefix = "";
    private int commentCursor = -1;

    public TokenStream(Parser parser, Reader reader, String str, int i) {
        this.parser = parser;
        this.lineno = i;
        if (reader != null) {
            if (str != null) {
                Kit.codeBug();
            }
            this.sourceReader = reader;
            this.sourceBuffer = new char[512];
            this.sourceEnd = 0;
        } else {
            if (str == null) {
                Kit.codeBug();
            }
            this.sourceString = str;
            this.sourceEnd = str.length();
        }
        this.cursor = 0;
        this.sourceCursor = 0;
    }

    private void addToString(int i) {
        int i2 = this.stringBufferTop;
        int iCharCount = Character.charCount(i);
        int i3 = i2 + iCharCount;
        char[] cArr = this.stringBuffer;
        if (i3 >= cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.stringBuffer = cArr2;
        }
        char[] cArr3 = this.stringBuffer;
        if (iCharCount == 1) {
            cArr3[i2] = (char) i;
        } else {
            cArr3[i2] = Character.highSurrogate(i);
            this.stringBuffer[i2 + 1] = Character.lowSurrogate(i);
        }
        this.stringBufferTop = i3;
    }

    private boolean canUngetChar() {
        int i = this.ungetCursor;
        return i == 0 || this.ungetBuffer[i - 1] != 10;
    }

    private final int charAt(int i) {
        if (i < 0) {
            return -1;
        }
        String str = this.sourceString;
        int i2 = this.sourceEnd;
        if (str != null) {
            if (i >= i2) {
                return -1;
            }
            return str.charAt(i);
        }
        if (i >= i2) {
            int i3 = this.sourceCursor;
            try {
                if (!fillSourceBuffer()) {
                    return -1;
                }
                i -= i3 - this.sourceCursor;
            } catch (IOException unused) {
                return -1;
            }
        }
        return this.sourceBuffer[i];
    }

    private static String convertLastCharToHex(String str) {
        int length = str.length() - 1;
        StringBuilder sb = new StringBuilder(str.substring(0, length));
        sb.append("\\u");
        String hexString = Integer.toHexString(str.charAt(length));
        for (int i = 0; i < 4 - hexString.length(); i++) {
            sb.append('0');
        }
        sb.append(hexString);
        return sb.toString();
    }

    private boolean fillSourceBuffer() throws IOException {
        if (this.sourceString != null) {
            Kit.codeBug();
        }
        if (this.sourceEnd == this.sourceBuffer.length) {
            if (this.lineStart == 0 || isMarkingComment()) {
                char[] cArr = this.sourceBuffer;
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, this.sourceEnd);
                this.sourceBuffer = cArr2;
            } else {
                char[] cArr3 = this.sourceBuffer;
                int i = this.lineStart;
                System.arraycopy(cArr3, i, cArr3, 0, this.sourceEnd - i);
                int i2 = this.sourceEnd;
                int i3 = this.lineStart;
                this.sourceEnd = i2 - i3;
                this.sourceCursor -= i3;
                this.lineStart = 0;
            }
        }
        Reader reader = this.sourceReader;
        char[] cArr4 = this.sourceBuffer;
        int i4 = this.sourceEnd;
        int i5 = reader.read(cArr4, i4, cArr4.length - i4);
        if (i5 < 0) {
            return false;
        }
        this.sourceEnd += i5;
        return true;
    }

    private int getChar(boolean z, boolean z2) {
        int i;
        int i2;
        int i3 = this.ungetCursor;
        if (i3 != 0) {
            this.cursor++;
            int[] iArr = this.ungetBuffer;
            int i4 = i3 - 1;
            this.ungetCursor = i4;
            return iArr[i4];
        }
        while (true) {
            String str = this.sourceString;
            int i5 = this.sourceCursor;
            if (str != null) {
                if (i5 == this.sourceEnd) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                int iCodePointAt = str.codePointAt(i5);
                this.sourceCursor = Character.charCount(iCodePointAt) + this.sourceCursor;
                i = iCodePointAt;
            } else {
                if (i5 == this.sourceEnd && !fillSourceBuffer()) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                char[] cArr = this.sourceBuffer;
                int i6 = this.sourceCursor;
                this.sourceCursor = i6 + 1;
                i = cArr[i6];
            }
            if (!z2 && (i2 = this.lineEndChar) >= 0) {
                if (i2 == 13 && i == 10) {
                    this.lineEndChar = 10;
                } else {
                    this.lineEndChar = -1;
                    this.lineStart = this.sourceCursor - 1;
                    this.lastLineEnd = this.tokenEnd;
                    this.lineno++;
                }
            }
            if (i <= 127) {
                if (i == 10 || i == 13) {
                    this.lineEndChar = i;
                    return 10;
                }
            } else if (i != 65279) {
                if (!z || !isJSFormatChar(i)) {
                    if (ScriptRuntime.isJSLineTerminator(i)) {
                        this.lineEndChar = i;
                        return 10;
                    }
                }
            }
            return i;
        }
    }

    private int getCharIgnoreLineEnd() {
        return getChar(true, true);
    }

    private String getStringFromBuffer() {
        this.tokenEnd = this.cursor;
        return new String(this.stringBuffer, 0, this.stringBufferTop);
    }

    private int getTemplateLiteralChar() {
        int charIgnoreLineEnd = getCharIgnoreLineEnd(false);
        if (charIgnoreLineEnd == 10) {
            int i = this.lineEndChar;
            if (i != 13) {
                if (i == 8232 || i == 8233) {
                    charIgnoreLineEnd = i;
                }
            } else if (charAt(this.cursor) == 10) {
                getCharIgnoreLineEnd(false);
            }
            this.lineEndChar = -1;
            this.lineStart = this.sourceCursor - 1;
            this.lineno++;
        }
        this.rawString.append((char) charIgnoreLineEnd);
        return charIgnoreLineEnd;
    }

    private String internString(String str) {
        String strPutIfAbsent = this.allStrings.putIfAbsent(str, str);
        return strPutIfAbsent == null ? str : strPutIfAbsent;
    }

    private static boolean isAlpha(int i) {
        if (i <= 90) {
            return 65 <= i;
        }
        return 97 <= i && i <= 122;
    }

    private static boolean isDigit(int i, int i2) {
        if (i == 10 && isDigit(i2)) {
            return true;
        }
        if (i == 16 && isHexDigit(i2)) {
            return true;
        }
        if (i == 8 && isOctalDigit(i2)) {
            return true;
        }
        return i == 2 && isDualDigit(i2);
    }

    private static boolean isDualDigit(int i) {
        return 48 == i || i == 49;
    }

    private static boolean isHexDigit(int i) {
        if (48 <= i && i <= 57) {
            return true;
        }
        if (97 > i || i > 102) {
            return 65 <= i && i <= 70;
        }
        return true;
    }

    private static boolean isJSFormatChar(int i) {
        return i > 127 && Character.getType((char) i) == 16;
    }

    private static boolean isJSSpace(int i) {
        if (i <= 127) {
            return i == 32 || i == 9 || i == 12 || i == 11;
        }
        return i == 160 || i == 65279 || Character.getType((char) i) == 12;
    }

    public static boolean isKeyword(String str, int i, boolean z) {
        return stringToKeyword(str, i, z) != 0;
    }

    private boolean isMarkingComment() {
        return this.commentCursor != -1;
    }

    private static boolean isOctalDigit(int i) {
        return 48 <= i && i <= 55;
    }

    private static boolean isValidIdentifierName(String str) {
        int[] array = str.codePoints().toArray();
        int length = array.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = array[i];
            int i4 = i2 + 1;
            if (i2 == 0) {
                if (i3 != 36 && i3 != 95 && !Character.isUnicodeIdentifierStart(i3)) {
                    return false;
                }
            } else if (i3 != 36 && i3 != 8204 && i3 != 8205 && !Character.isUnicodeIdentifierPart(i3)) {
                return false;
            }
            i++;
            i2 = i4;
        }
        return true;
    }

    private void markCommentStart(String str) {
        if (!this.parser.compilerEnv.isRecordingComments() || this.sourceReader == null) {
            return;
        }
        this.commentPrefix = str;
        this.commentCursor = this.sourceCursor - 1;
    }

    private boolean matchChar(int i) {
        int charIgnoreLineEnd = getCharIgnoreLineEnd();
        if (charIgnoreLineEnd == i) {
            this.tokenEnd = this.cursor;
            return true;
        }
        ungetCharIgnoreLineEnd(charIgnoreLineEnd);
        return false;
    }

    private boolean matchTemplateLiteralChar(int i) {
        int templateLiteralChar = getTemplateLiteralChar();
        if (templateLiteralChar == i) {
            return true;
        }
        ungetTemplateLiteralChar(templateLiteralChar);
        return false;
    }

    private int peekChar() {
        int i = getChar();
        ungetChar(i);
        return i;
    }

    private int peekTemplateLiteralChar() {
        int templateLiteralChar = getTemplateLiteralChar();
        ungetTemplateLiteralChar(templateLiteralChar);
        return templateLiteralChar;
    }

    private boolean readCDATA() {
        int i = getChar();
        while (i != -1) {
            addToString(i);
            if (i == 93 && peekChar() == 93) {
                i = getChar();
                addToString(i);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private int readDigits(int i, int i2) {
        if (isDigit(i, i2)) {
            addToString(i2);
            i2 = getChar();
            if (i2 == -1) {
                return -1;
            }
            while (true) {
                if (i2 == 95) {
                    i2 = getChar();
                    if (i2 == 10 || i2 == -1) {
                        return -2;
                    }
                    if (!isDigit(i, i2)) {
                        ungetChar(i2);
                        return 95;
                    }
                    addToString(95);
                } else if (isDigit(i, i2)) {
                    addToString(i2);
                    i2 = getChar();
                    if (i2 == -1) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    private boolean readEntity() {
        int i = getChar();
        int i2 = 1;
        while (i != -1) {
            addToString(i);
            if (i == 60) {
                i2++;
            } else if (i == 62 && (i2 = i2 - 1) == 0) {
                return true;
            }
            i = getChar();
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readPI() {
        while (true) {
            int i = getChar();
            if (i == -1) {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
            addToString(i);
            if (i == 63 && peekChar() == 62) {
                addToString(getChar());
                return true;
            }
        }
    }

    private boolean readQuotedString(int i) {
        int i2;
        do {
            i2 = getChar();
            if (i2 == -1) {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
            addToString(i2);
        } while (i2 != i);
        return true;
    }

    private boolean readXmlComment() {
        int i = getChar();
        while (i != -1) {
            addToString(i);
            if (i == 45 && peekChar() == 45) {
                i = getChar();
                addToString(i);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private void skipLine() {
        int i;
        do {
            i = getChar();
            if (i == -1) {
                break;
            }
        } while (i != 10);
        ungetChar(i);
        this.tokenEnd = this.cursor;
    }

    private static int stringToKeyword(String str, int i, boolean z) {
        return i < 200 ? stringToKeywordForJS(str) : stringToKeywordForES(str, z);
    }

    private static int stringToKeywordForES(String str, boolean z) {
        str.getClass();
        int i = 32;
        switch (str) {
            case "delete":
                i = 31;
                break;
            case "extends":
            case "export":
            case "import":
            case "enum":
            case "await":
            case "class":
                i = 140;
                break;
            case "public":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "return":
                i = 4;
                break;
            case "implements":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "static":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "switch":
                i = 127;
                break;
            case "typeof":
                break;
            case "finally":
                i = Token.FINALLY;
                break;
            case "package":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "protected":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "continue":
                i = Token.CONTINUE;
                break;
            case "private":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "do":
                i = Token.DO;
                break;
            case "if":
                i = Token.IF;
                break;
            case "in":
                i = 57;
                break;
            case "for":
                i = Token.FOR;
                break;
            case "let":
                i = Token.LET;
                break;
            case "new":
                i = 30;
                break;
            case "try":
                i = 90;
                break;
            case "var":
                i = Token.VAR;
                break;
            case "case":
                i = 128;
                break;
            case "else":
                i = Token.ELSE;
                break;
            case "null":
                i = 47;
                break;
            case "this":
                i = 48;
                break;
            case "true":
                i = 50;
                break;
            case "void":
                i = Token.VOID;
                break;
            case "with":
                i = Token.WITH;
                break;
            case "break":
                i = Token.BREAK;
                break;
            case "catch":
                i = Token.CATCH;
                break;
            case "const":
                i = Token.CONST;
                break;
            case "false":
                i = 49;
                break;
            case "super":
                i = 79;
                break;
            case "throw":
                i = 55;
                break;
            case "while":
                i = 130;
                break;
            case "yield":
                i = 78;
                break;
            case "interface":
                if (!z) {
                    i = 0;
                    break;
                } else {
                    i = 140;
                    break;
                }
                break;
            case "debugger":
                i = Token.DEBUGGER;
                break;
            case "instanceof":
                i = 58;
                break;
            case "function":
                i = Token.FUNCTION;
                break;
            case "default":
                i = Token.DEFAULT;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 0;
        }
        return i & 255;
    }

    private static int stringToKeywordForJS(String str) {
        str.getClass();
        int i = 58;
        switch (str) {
            case "volatile":
            case "synchronized":
            case "double":
            case "extends":
            case "export":
            case "import":
            case "native":
            case "public":
            case "implements":
            case "static":
            case "throws":
            case "package":
            case "protected":
            case "private":
            case "int":
            case "byte":
            case "char":
            case "enum":
            case "goto":
            case "long":
            case "boolean":
            case "class":
            case "final":
            case "float":
            case "short":
            case "super":
            case "interface":
            case "transient":
            case "abstract":
                i = 140;
                break;
            case "delete":
                i = 31;
                break;
            case "return":
                i = 4;
                break;
            case "switch":
                i = 127;
                break;
            case "typeof":
                i = 32;
                break;
            case "finally":
                i = Token.FINALLY;
                break;
            case "continue":
                i = Token.CONTINUE;
                break;
            case "do":
                i = Token.DO;
                break;
            case "if":
                i = Token.IF;
                break;
            case "in":
                i = 57;
                break;
            case "for":
                i = Token.FOR;
                break;
            case "let":
                i = Token.LET;
                break;
            case "new":
                i = 30;
                break;
            case "try":
                i = 90;
                break;
            case "var":
                i = Token.VAR;
                break;
            case "case":
                i = 128;
                break;
            case "else":
                i = Token.ELSE;
                break;
            case "null":
                i = 47;
                break;
            case "this":
                i = 48;
                break;
            case "true":
                i = 50;
                break;
            case "void":
                i = Token.VOID;
                break;
            case "with":
                i = Token.WITH;
                break;
            case "break":
                i = Token.BREAK;
                break;
            case "catch":
                i = Token.CATCH;
                break;
            case "const":
                i = Token.CONST;
                break;
            case "false":
                i = 49;
                break;
            case "throw":
                i = 55;
                break;
            case "while":
                i = 130;
                break;
            case "yield":
                i = 78;
                break;
            case "debugger":
                i = Token.DEBUGGER;
                break;
            case "instanceof":
                break;
            case "function":
                i = Token.FUNCTION;
                break;
            case "default":
                i = Token.DEFAULT;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 0;
        }
        return i & 255;
    }

    private final String substring(int i, int i2) {
        String str = this.sourceString;
        if (str != null) {
            return str.substring(i, i2);
        }
        return new String(this.sourceBuffer, i, i2 - i);
    }

    private void ungetChar(int i) {
        int i2 = this.ungetCursor;
        if (i2 != 0 && this.ungetBuffer[i2 - 1] == 10) {
            Kit.codeBug();
        }
        int[] iArr = this.ungetBuffer;
        int i3 = this.ungetCursor;
        this.ungetCursor = i3 + 1;
        iArr[i3] = i;
        this.cursor--;
    }

    private void ungetCharIgnoreLineEnd(int i) {
        int[] iArr = this.ungetBuffer;
        int i2 = this.ungetCursor;
        this.ungetCursor = i2 + 1;
        iArr[i2] = i;
        this.cursor--;
    }

    private void ungetTemplateLiteralChar(int i) {
        ungetCharIgnoreLineEnd(i);
        StringBuilder sb = this.rawString;
        sb.setLength(sb.length() - 1);
    }

    public final boolean eof() {
        return this.hitEOF;
    }

    public final String getAndResetCurrentComment() {
        if (this.sourceString != null) {
            if (isMarkingComment()) {
                Kit.codeBug();
            }
            return this.sourceString.substring(this.tokenBeg, this.tokenEnd);
        }
        if (!isMarkingComment()) {
            Kit.codeBug();
        }
        StringBuilder sb = new StringBuilder(this.commentPrefix);
        sb.append(this.sourceBuffer, this.commentCursor, getTokenLength() - this.commentPrefix.length());
        this.commentCursor = -1;
        return sb.toString();
    }

    public final BigInteger getBigInt() {
        return this.bigInt;
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public int getCursor() {
        return this.cursor;
    }

    public int getFirstXMLToken() {
        this.xmlOpenTagsCount = 0;
        this.xmlIsAttribute = false;
        this.xmlIsTagContent = false;
        if (!canUngetChar()) {
            return -1;
        }
        ungetChar(60);
        return getNextXMLToken();
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    public final String getLine(int i, int[] iArr) {
        int i2 = (this.cursor + this.ungetCursor) - i;
        int i3 = this.sourceCursor;
        if (i2 > i3) {
            return null;
        }
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            int iCharAt = charAt(i3 - 1);
            if (ScriptRuntime.isJSLineTerminator(iCharAt)) {
                if (iCharAt == 10 && charAt(i3 - 2) == 13) {
                    i2--;
                    i3--;
                }
                i4++;
                i5 = i3 - 1;
            }
            i2--;
            i3--;
        }
        int i6 = 0;
        while (true) {
            if (i3 <= 0) {
                i3 = 0;
                break;
            }
            if (ScriptRuntime.isJSLineTerminator(charAt(i3 - 1))) {
                break;
            }
            i3--;
            i6++;
        }
        iArr[0] = (this.lineno - i4) + (this.lineEndChar >= 0 ? 1 : 0);
        iArr[1] = i6;
        return i4 == 0 ? getLine() : substring(i3, i5);
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getLineno() {
        return this.lineno;
    }

    public int getNextXMLToken() {
        this.tokenStartLastLineEnd = this.lastLineEnd;
        this.tokenStartLineno = this.lineno;
        this.tokenBeg = this.cursor;
        this.stringBufferTop = 0;
        while (true) {
            int i = getChar();
            if (i == -1) {
                this.tokenEnd = this.cursor;
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return -1;
            }
            if (this.xmlIsTagContent) {
                if (i == 9 || i == 10 || i == 13 || i == 32) {
                    addToString(i);
                } else if (i == 34 || i == 39) {
                    addToString(i);
                    if (!readQuotedString(i)) {
                        return -1;
                    }
                } else if (i == 47) {
                    addToString(i);
                    if (peekChar() == 62) {
                        addToString(getChar());
                        this.xmlIsTagContent = false;
                        this.xmlOpenTagsCount--;
                    }
                } else {
                    if (i == 123) {
                        ungetChar(i);
                        this.string = getStringFromBuffer();
                        return Token.XML;
                    }
                    if (i == 61) {
                        addToString(i);
                        this.xmlIsAttribute = true;
                    } else if (i != 62) {
                        addToString(i);
                        this.xmlIsAttribute = false;
                    } else {
                        addToString(i);
                        this.xmlIsTagContent = false;
                        this.xmlIsAttribute = false;
                    }
                }
                if (!this.xmlIsTagContent && this.xmlOpenTagsCount == 0) {
                    this.string = getStringFromBuffer();
                    int i2 = this.sourceCursor;
                    this.cursor = i2;
                    this.tokenEnd = i2;
                    return Token.XMLEND;
                }
            } else if (i == 60) {
                addToString(i);
                int iPeekChar = peekChar();
                if (iPeekChar == 33) {
                    addToString(getChar());
                    int iPeekChar2 = peekChar();
                    if (iPeekChar2 == 45) {
                        addToString(getChar());
                        int i3 = getChar();
                        if (i3 != 45) {
                            this.stringBufferTop = 0;
                            this.string = null;
                            this.parser.addError("msg.XML.bad.form");
                            return -1;
                        }
                        addToString(i3);
                        if (!readXmlComment()) {
                            return -1;
                        }
                    } else if (iPeekChar2 == 91) {
                        addToString(getChar());
                        if (getChar() != 67 || getChar() != 68 || getChar() != 65 || getChar() != 84 || getChar() != 65 || getChar() != 91) {
                            this.stringBufferTop = 0;
                            this.string = null;
                            this.parser.addError("msg.XML.bad.form");
                            return -1;
                        }
                        addToString(67);
                        addToString(68);
                        addToString(65);
                        addToString(84);
                        addToString(65);
                        addToString(91);
                        if (!readCDATA()) {
                            return -1;
                        }
                    } else if (!readEntity()) {
                        return -1;
                    }
                } else if (iPeekChar == 47) {
                    addToString(getChar());
                    int i4 = this.xmlOpenTagsCount;
                    if (i4 == 0) {
                        this.stringBufferTop = 0;
                        this.string = null;
                        this.parser.addError("msg.XML.bad.form");
                        return -1;
                    }
                    this.xmlIsTagContent = true;
                    this.xmlOpenTagsCount = i4 - 1;
                } else if (iPeekChar != 63) {
                    this.xmlIsTagContent = true;
                    this.xmlOpenTagsCount++;
                } else {
                    addToString(getChar());
                    if (!readPI()) {
                        return -1;
                    }
                }
            } else {
                if (i == 123) {
                    ungetChar(i);
                    this.string = getStringFromBuffer();
                    return Token.XML;
                }
                addToString(i);
            }
        }
    }

    public final double getNumber() {
        return this.number;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getOffset() {
        int i = this.sourceCursor - this.lineStart;
        return this.lineEndChar >= 0 ? i - 1 : i;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getPosition() {
        return this.tokenBeg;
    }

    public final char getQuoteChar() {
        return (char) this.quoteChar;
    }

    public String getRawString() {
        return this.rawString.length() == 0 ? "" : this.rawString.toString();
    }

    public final String getSourceString() {
        return this.sourceString;
    }

    public final String getString() {
        return this.string;
    }

    /* JADX WARN: Code duplicated, block: B:281:0x0389 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x038c  */
    /* JADX WARN: Code duplicated, block: B:401:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:589:0x070b  */
    /* JADX WARN: Code duplicated, block: B:592:0x0714  */
    /* JADX WARN: Code duplicated, block: B:594:0x0718  */
    /* JADX WARN: Code duplicated, block: B:598:0x0728  */
    /* JADX WARN: Code duplicated, block: B:600:0x0732  */
    /* JADX WARN: Code duplicated, block: B:606:0x0741  */
    /* JADX WARN: Code duplicated, block: B:637:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x071d A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x0389 -> B:274:0x036f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final int getToken() {
        /*
            Method dump skipped, instruction units count: 1922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getToken():int");
    }

    public int getTokenBeg() {
        return this.tokenBeg;
    }

    public int getTokenColumn() {
        return (this.tokenBeg - this.tokenStartLastLineEnd) + 1;
    }

    public int getTokenEnd() {
        return this.tokenEnd;
    }

    public int getTokenLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    public int getTokenStartLineno() {
        return this.tokenStartLineno;
    }

    public final boolean isNumericBinary() {
        return this.isBinary;
    }

    public final boolean isNumericHex() {
        return this.isHex;
    }

    public final boolean isNumericOctal() {
        return this.isOctal;
    }

    public final boolean isNumericOldOctal() {
        return this.isOldOctal;
    }

    public boolean isXMLAttribute() {
        return this.xmlIsAttribute;
    }

    public String readAndClearRegExpFlags() {
        String str = this.regExpFlags;
        this.regExpFlags = null;
        return str;
    }

    public void readRegExp(int i) {
        int i2;
        int i3 = this.tokenBeg;
        this.stringBufferTop = 0;
        if (i == 111) {
            addToString(61);
        } else {
            if (i != 24) {
                Kit.codeBug();
            }
            if (peekChar() == 42) {
                this.tokenEnd = this.cursor - 1;
                this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
                this.parser.reportError("msg.unterminated.re.lit");
                return;
            }
        }
        boolean z = false;
        while (true) {
            i2 = getChar();
            if (i2 == 47 && !z) {
                int i4 = this.stringBufferTop;
                while (true) {
                    if (!matchChar(Token.ASSIGN_BITAND)) {
                        if (!matchChar(Token.ASSIGN_LSH)) {
                            if (!matchChar(Token.ASSIGN_SUB)) {
                                if (!matchChar(Token.HOOK)) {
                                    if (!matchChar(Token.DOT)) {
                                        break;
                                    } else {
                                        addToString(Token.DOT);
                                    }
                                } else {
                                    addToString(Token.HOOK);
                                }
                            } else {
                                addToString(Token.ASSIGN_SUB);
                            }
                        } else {
                            addToString(Token.ASSIGN_LSH);
                        }
                    } else {
                        addToString(Token.ASSIGN_BITAND);
                    }
                }
                this.tokenEnd = i3 + this.stringBufferTop + 2;
                if (isAlpha(peekChar())) {
                    this.parser.reportError("msg.invalid.re.flag", String.valueOf(Character.toChars(peekChar())));
                }
                this.string = new String(this.stringBuffer, 0, i4);
                this.regExpFlags = new String(this.stringBuffer, i4, this.stringBufferTop - i4);
                return;
            }
            if (i2 == 10 || i2 == -1) {
                break;
            }
            if (i2 == 92) {
                addToString(i2);
                i2 = getChar();
                if (i2 == 10 || i2 == -1) {
                    ungetChar(i2);
                    this.tokenEnd = this.cursor - 1;
                    this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
                    this.parser.reportError("msg.unterminated.re.lit");
                    return;
                }
            } else if (i2 == 91) {
                z = true;
            } else if (i2 == 93) {
                z = false;
            }
            addToString(i2);
        }
        ungetChar(i2);
        this.tokenEnd = this.cursor - 1;
        this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
        this.parser.reportError("msg.unterminated.re.lit");
    }

    public int readTemplateLiteral(boolean z) {
        this.rawString.setLength(0);
        this.stringBufferTop = 0;
        boolean z2 = false;
        while (true) {
            int templateLiteralChar = getTemplateLiteralChar();
            if (templateLiteralChar == -1) {
                this.string = z2 ? null : getStringFromBuffer();
                this.tokenEnd = this.cursor - 1;
                this.parser.reportError("msg.unexpected.eof");
                return -1;
            }
            if (templateLiteralChar == 36) {
                if (matchTemplateLiteralChar(Token.EXPORT)) {
                    StringBuilder sb = this.rawString;
                    sb.setLength(sb.length() - 2);
                    this.string = z2 ? null : getStringFromBuffer();
                    this.tokenEnd = this.cursor - 1;
                    return Token.TEMPLATE_LITERAL_SUBST;
                }
                addToString(templateLiteralChar);
            } else if (templateLiteralChar == 92) {
                int templateLiteralChar2 = getTemplateLiteralChar();
                if (templateLiteralChar2 == 10) {
                    continue;
                } else {
                    if (templateLiteralChar2 == 98) {
                        templateLiteralChar2 = 8;
                    } else if (templateLiteralChar2 == 102) {
                        templateLiteralChar2 = 12;
                    } else if (templateLiteralChar2 == 110) {
                        templateLiteralChar2 = 10;
                    } else if (templateLiteralChar2 == 114) {
                        templateLiteralChar2 = 13;
                    } else if (templateLiteralChar2 == 120) {
                        int i = 0;
                        int iXDigitToInt = 0;
                        while (true) {
                            if (i >= 2) {
                                templateLiteralChar2 = iXDigitToInt;
                            } else if (peekTemplateLiteralChar() == 96) {
                                templateLiteralChar2 = -1;
                            } else {
                                iXDigitToInt = Kit.xDigitToInt(getTemplateLiteralChar(), iXDigitToInt);
                                i++;
                            }
                        }
                        if (templateLiteralChar2 < 0) {
                            if (!z) {
                                this.parser.reportError("msg.syntax");
                                return -1;
                            }
                            z2 = true;
                        }
                    } else if (templateLiteralChar2 != 8232 && templateLiteralChar2 != 8233) {
                        switch (templateLiteralChar2) {
                            case Token.THIS /* 48 */:
                                int iPeekTemplateLiteralChar = peekTemplateLiteralChar();
                                if (iPeekTemplateLiteralChar >= 48 && iPeekTemplateLiteralChar <= 57) {
                                    if (!z) {
                                        this.parser.reportError("msg.syntax");
                                        return -1;
                                    }
                                    z2 = true;
                                } else {
                                    templateLiteralChar2 = 0;
                                }
                                break;
                            case Token.FALSE /* 49 */:
                            case Token.TRUE /* 50 */:
                            case Token.SHEQ /* 51 */:
                            case Token.SHNE /* 52 */:
                            case Token.REGEXP /* 53 */:
                            case Token.BINDNAME /* 54 */:
                            case Token.THROW /* 55 */:
                            case Token.RETHROW /* 56 */:
                            case Token.IN /* 57 */:
                                if (!z) {
                                    this.parser.reportError("msg.syntax");
                                    return -1;
                                }
                                z2 = true;
                                break;
                            default:
                                switch (templateLiteralChar2) {
                                    case Token.COLON /* 116 */:
                                        templateLiteralChar2 = 9;
                                        break;
                                    case Token.OR /* 117 */:
                                        if (!matchTemplateLiteralChar(Token.EXPORT)) {
                                            int i2 = 0;
                                            int iXDigitToInt2 = 0;
                                            while (true) {
                                                if (i2 >= 4) {
                                                    templateLiteralChar2 = iXDigitToInt2;
                                                } else if (peekTemplateLiteralChar() == 96) {
                                                    templateLiteralChar2 = -1;
                                                } else {
                                                    iXDigitToInt2 = Kit.xDigitToInt(getTemplateLiteralChar(), iXDigitToInt2);
                                                    i2++;
                                                }
                                            }
                                            if (templateLiteralChar2 < 0) {
                                                if (!z) {
                                                    this.parser.reportError("msg.syntax");
                                                    return -1;
                                                }
                                                z2 = true;
                                            }
                                        } else {
                                            templateLiteralChar2 = 0;
                                            while (true) {
                                                if (peekTemplateLiteralChar() == 96) {
                                                    templateLiteralChar2 = -1;
                                                } else {
                                                    int templateLiteralChar3 = getTemplateLiteralChar();
                                                    if (templateLiteralChar3 == -1) {
                                                        this.parser.reportError("msg.syntax");
                                                        return -1;
                                                    }
                                                    if (templateLiteralChar3 != 125) {
                                                        templateLiteralChar2 = Kit.xDigitToInt(templateLiteralChar3, templateLiteralChar2);
                                                    }
                                                }
                                            }
                                            if (templateLiteralChar2 < 0 || templateLiteralChar2 > 1114111) {
                                                if (!z) {
                                                    this.parser.reportError("msg.syntax");
                                                    return -1;
                                                }
                                                z2 = true;
                                            } else if (templateLiteralChar2 > 65535) {
                                                addToString(Character.highSurrogate(templateLiteralChar2));
                                                addToString(Character.lowSurrogate(templateLiteralChar2));
                                            }
                                        }
                                        break;
                                    case Token.AND /* 118 */:
                                        templateLiteralChar2 = 11;
                                        break;
                                    default:
                                        break;
                                }
                                break;
                        }
                    }
                    addToString(templateLiteralChar2);
                }
            } else {
                if (templateLiteralChar == 96) {
                    StringBuilder sb2 = this.rawString;
                    sb2.setLength(sb2.length() - 1);
                    this.string = z2 ? null : getStringFromBuffer();
                    int i3 = this.sourceCursor;
                    this.cursor = i3;
                    this.tokenEnd = i3;
                    return 180;
                }
                addToString(templateLiteralChar);
            }
        }
    }

    public String tokenToString(int i) {
        return "";
    }

    private int getCharIgnoreLineEnd(boolean z) {
        return getChar(z, true);
    }

    private void markCommentStart() {
        markCommentStart("");
    }

    private static boolean isDigit(int i) {
        return 48 <= i && i <= 57;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public String getLine() {
        int i;
        int i2 = this.sourceCursor;
        int i3 = this.lineEndChar;
        if (i3 >= 0) {
            i = i2 - 1;
            if (i3 == 10 && charAt(i2 - 2) == 13) {
                i = i2 - 2;
            }
        } else {
            int i4 = i2 - this.lineStart;
            while (true) {
                int iCharAt = charAt(this.lineStart + i4);
                if (iCharAt == -1 || ScriptRuntime.isJSLineTerminator(iCharAt)) {
                    break;
                }
                i4++;
            }
            i = this.lineStart + i4;
        }
        return substring(this.lineStart, i);
    }

    private int getChar(boolean z) {
        return getChar(z, false);
    }

    private int getChar() {
        return getChar(true, false);
    }
}
