package com.grack.nanojson;

import androidx.constraintlayout.core.g;
import com.app.mlounge.emulator.LibretroCore;
import java.io.IOException;
import java.io.StringReader;
import org.mozilla.javascript.Token;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final char[] m = {'r', 'u', 'e'};
    public static final char[] n = {'a', 'l', 's', 'e'};
    public static final char[] o = {'u', 'l', 'l'};
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public final StringReader h;
    public int j;
    public boolean l;
    public int a = 1;
    public final char[] i = new char[32768];
    public final StringBuilder k = new StringBuilder();

    public f(StringReader stringReader) throws d {
        int iF;
        this.h = stringReader;
        this.f = i();
        do {
            iF = f(LibretroCore.SCREEN_WIDTH);
            for (int i = 0; i < iF; i++) {
                char c = this.i[this.g];
                if (!h(c)) {
                    g();
                    return;
                }
                if (c == '\n') {
                    this.a++;
                    this.b = this.g + 1 + this.c;
                    this.d = 0;
                }
                this.g++;
            }
        } while (iF > 0);
        this.f = true;
    }

    public static boolean h(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final int a() {
        if (this.f) {
            return -1;
        }
        int i = this.g;
        char c = this.i[i];
        if (c == '\n') {
            this.a++;
            this.b = i + 1 + this.c;
            this.d = 0;
        }
        int i2 = i + 1;
        this.g = i2;
        if (i2 >= this.j) {
            this.f = i();
        }
        return c;
    }

    public final void b(char c, char[] cArr) throws d {
        int i = 0;
        if (f(cArr.length) < cArr.length) {
            throw d(c, cArr, 0);
        }
        while (true) {
            int length = cArr.length;
            char[] cArr2 = this.i;
            if (i >= length) {
                g();
                byte b = this.f ? (byte) -1 : cArr2[this.g];
                if (b != 9 && b != 10 && b != 13 && b != 32 && b != 44 && b != 58 && b != 91 && b != 93 && b != 123 && b != 125) {
                    throw d(c, cArr, cArr.length);
                }
                return;
            }
            int i2 = this.g;
            this.g = i2 + 1;
            if (cArr2[i2] != cArr[i]) {
                throw d(c, cArr, i);
            }
            i++;
        }
    }

    public final void c() throws d {
        int i;
        char[] cArr;
        int i2;
        int i3;
        StringBuilder sb = this.k;
        sb.setLength(0);
        loop0: while (true) {
            int i4 = LibretroCore.SCREEN_WIDTH;
            int iF = f(LibretroCore.SCREEN_WIDTH);
            if (iF == 0) {
                throw e(null, "String was not terminated before end of input", true);
            }
            i = 0;
            while (true) {
                cArr = this.i;
                if (i < iF) {
                    char cJ = j();
                    if (h(cJ)) {
                        break loop0;
                    }
                    char c = ':';
                    if (cJ == ':') {
                        break loop0;
                    }
                    char c2 = '\\';
                    if (cJ == '\\') {
                        sb.append(cArr, (this.g - i) - 1, i);
                        this.g--;
                        while (true) {
                            int iF2 = f(i4);
                            if (iF2 == 0) {
                                throw e(null, "String was not terminated before end of input", true);
                            }
                            int i5 = this.g + iF2;
                            while (true) {
                                i2 = this.g;
                                if (i2 < i5) {
                                    char cJ2 = j();
                                    if (cJ2 != '\t' && cJ2 != '\n' && cJ2 != '\r' && cJ2 != ' ') {
                                        if (cJ2 != ',') {
                                            if (cJ2 != c) {
                                                if (cJ2 != '{' && cJ2 != '}') {
                                                    switch (cJ2) {
                                                        case Token.SEMI /* 91 */:
                                                        case Token.RB /* 93 */:
                                                            break;
                                                        case Token.LB /* 92 */:
                                                            if (i5 - this.g < 5) {
                                                                int iF3 = f(5);
                                                                int i6 = this.g;
                                                                int i7 = i6 + iF3;
                                                                if (cArr[i6] == 'u' && iF3 < 5) {
                                                                    this.g = this.j;
                                                                    throw e(null, "EOF encountered in the middle of a string escape", false);
                                                                }
                                                                i5 = i7;
                                                            }
                                                            int i8 = this.g;
                                                            this.g = i8 + 1;
                                                            char c3 = cArr[i8];
                                                            if (c3 != '\"' && c3 != '/' && c3 != c2) {
                                                                if (c3 == 'b') {
                                                                    c3 = '\b';
                                                                } else if (c3 == 'f') {
                                                                    c3 = '\f';
                                                                } else if (c3 == 'n') {
                                                                    c3 = '\n';
                                                                } else if (c3 == 'r') {
                                                                    c3 = '\r';
                                                                } else if (c3 == 't') {
                                                                    c3 = '\t';
                                                                } else {
                                                                    if (c3 != 'u') {
                                                                        throw e(null, "Invalid escape: \\" + c3, false);
                                                                    }
                                                                    int i9 = 0;
                                                                    for (int i10 = 0; i10 < 4; i10++) {
                                                                        int i11 = i9 << 4;
                                                                        int i12 = this.g;
                                                                        this.g = i12 + 1;
                                                                        char c4 = cArr[i12];
                                                                        if (c4 >= '0' && c4 <= '9') {
                                                                            i3 = c4 - '0';
                                                                        } else if (c4 >= 'A' && c4 <= 'F') {
                                                                            i3 = c4 - '7';
                                                                        } else {
                                                                            if (c4 < 'a' || c4 > 'f') {
                                                                                StringBuilder sb2 = new StringBuilder("Expected unicode hex escape character: ");
                                                                                sb2.append(c4);
                                                                                sb2.append(" (");
                                                                                sb2.append((int) c4);
                                                                                sb2.append(")");
                                                                                throw e(null, sb2.toString(), false);
                                                                            }
                                                                            i3 = c4 - 'W';
                                                                        }
                                                                        i9 = i11 | i3;
                                                                    }
                                                                    c3 = (char) i9;
                                                                }
                                                            }
                                                            sb.append(c3);
                                                            c2 = '\\';
                                                            c = ':';
                                                            break;
                                                        default:
                                                            sb.append(cJ2);
                                                            c2 = '\\';
                                                            c = ':';
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                        throw e(null, "Invalid character in semi-string: " + cJ2, false);
                                    }
                                    g();
                                    return;
                                }
                            }
                            int i13 = this.j;
                            if (i2 > i13) {
                                this.g = i13;
                                throw e(null, "EOF encountered in the middle of a string escape", false);
                            }
                            i4 = LibretroCore.SCREEN_WIDTH;
                            c2 = '\\';
                            c = ':';
                        }
                    } else {
                        if (cJ == '[' || cJ == ']' || cJ == '{' || cJ == '}' || cJ == ',') {
                            throw e(null, "Invalid character in semi-string: " + cJ, false);
                        }
                        i++;
                    }
                }
            }
            sb.append(cArr, this.g - iF, iF);
        }
        sb.append(cArr, (this.g - i) - 1, i);
        g();
    }

    public final d d(char c, char[] cArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        String str = "";
        sb.append(cArr == null ? "" : new String(cArr, 0, i));
        StringBuilder sb2 = new StringBuilder(sb.toString());
        while (true) {
            byte b = this.f ? (byte) -1 : this.i[this.g];
            if (((b < 65 || b > 90) && (b < 97 || b > 122)) || sb2.length() >= 15) {
                break;
            }
            sb2.append((char) a());
        }
        StringBuilder sb3 = new StringBuilder("Unexpected token '");
        sb3.append((Object) sb2);
        sb3.append("'");
        if (cArr != null) {
            str = ". Did you mean '" + c + new String(cArr) + "'?";
        }
        sb3.append(str);
        return e(null, sb3.toString(), true);
    }

    public final d e(Exception exc, String str, boolean z) {
        if (z) {
            StringBuilder sbD = g.d(str, " on line ");
            sbD.append(this.a);
            sbD.append(", char ");
            sbD.append(this.e);
            return new d(sbD.toString(), exc);
        }
        int iMax = Math.max(1, ((this.g + this.c) - this.b) - this.d);
        StringBuilder sbD2 = g.d(str, " on line ");
        sbD2.append(this.a);
        sbD2.append(", char ");
        sbD2.append(iMax);
        return new d(sbD2.toString(), exc);
    }

    public final int f(int i) throws d {
        int i2;
        int i3 = this.j;
        int i4 = i3 - i;
        int i5 = this.g;
        if (i4 >= i5) {
            return i;
        }
        char[] cArr = this.i;
        if (i5 > 0) {
            this.c += i5;
            int i6 = i3 - i5;
            this.j = i6;
            System.arraycopy(cArr, i5, cArr, 0, i6);
            this.g = 0;
        }
        do {
            try {
                int length = cArr.length;
                int i7 = this.j;
                if (length <= i7) {
                    throw new IOException("Unexpected internal error");
                }
                int i8 = this.h.read(cArr, i7, cArr.length - i7);
                int i9 = this.j;
                if (i8 <= 0) {
                    return i9 - this.g;
                }
                i2 = i9 + i8;
                this.j = i2;
            } catch (IOException e) {
                throw e(e, "IOException", true);
            }
        } while (i2 <= i);
        return i2 - this.g;
    }

    public final void g() {
        if (this.g >= this.j) {
            this.f = i();
        }
    }

    public final boolean i() throws d {
        try {
            StringReader stringReader = this.h;
            char[] cArr = this.i;
            int i = stringReader.read(cArr, 0, cArr.length);
            if (i <= 0) {
                return true;
            }
            this.c += this.j;
            this.g = 0;
            this.j = i;
            return false;
        } catch (IOException e) {
            throw e(e, "IOException", true);
        }
    }

    public final char j() throws d {
        int i = this.g;
        this.g = i + 1;
        char c = this.i[i];
        if (c >= ' ') {
            return c;
        }
        if (c == '\n') {
            this.a++;
            this.b = i + 2 + this.c;
            this.d = 0;
        }
        throw e(null, "Strings may not contain control characters: 0x" + Integer.toString(c, 16), false);
    }
}
