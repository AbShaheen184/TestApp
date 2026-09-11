package com.google.gson.stream;

import com.google.android.gms.measurement.internal.c0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {
    public long E;
    public int F;
    public String G;
    public int[] H;
    public String[] J;
    public int[] K;
    public final Reader e;
    public int L = 2;
    public final char[] y = new char[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
    public int z = 0;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int D = 0;
    public int I = 1;

    static {
        c0.H = new c0(13);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.H = iArr;
        iArr[0] = 6;
        this.J = new String[32];
        this.K = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.e = reader;
    }

    public void L() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 2) {
            throw v0("END_OBJECT");
        }
        int i = this.I;
        int i2 = i - 1;
        this.I = i2;
        this.J[i2] = null;
        int[] iArr = this.K;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.D = 0;
    }

    public final boolean N(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.C;
        int i5 = this.z;
        this.C = i4 - i5;
        int i6 = this.A;
        char[] cArr = this.y;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.A = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.A = 0;
        }
        this.z = 0;
        do {
            int i8 = this.A;
            int i9 = this.e.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.A + i9;
            this.A = i2;
            if (this.B == 0 && (i3 = this.C) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.z++;
                this.C = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public String X() {
        return Y(false);
    }

    public final String Y(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.I;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.H[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.K[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.J[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    net.luminis.tls.engine.impl.c.m(androidx.privacysandbox.ads.adservices.java.internal.a.l(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public String Z() {
        return Y(true);
    }

    public void a() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 3) {
            throw v0("BEGIN_ARRAY");
        }
        o0(1);
        this.K[this.I - 1] = 0;
        this.D = 0;
    }

    public boolean a0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        return (iW == 2 || iW == 4 || iW == 17) ? false : true;
    }

    public final boolean b0(char c) throws c {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case Token.SEMI /* 91 */:
                        case Token.RB /* 93 */:
                            return false;
                        case Token.LB /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m();
        return false;
    }

    final String c0() {
        StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w(" at line ", " column ", this.B + 1, " path ", (this.z - this.C) + 1);
        sbW.append(X());
        return sbW.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.D = 0;
        this.H[0] = 8;
        this.I = 1;
        this.e.close();
    }

    public boolean d0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 5) {
            this.D = 0;
            int[] iArr = this.K;
            int i = this.I - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iW != 6) {
            throw v0("a boolean");
        }
        this.D = 0;
        int[] iArr2 = this.K;
        int i2 = this.I - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double e0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i = this.I - 1;
            iArr[i] = iArr[i] + 1;
            return this.E;
        }
        if (iW == 16) {
            this.G = new String(this.y, this.z, this.F);
            this.z += this.F;
        } else if (iW == 8 || iW == 9) {
            this.G = k0(iW == 8 ? '\'' : '\"');
        } else if (iW == 10) {
            this.G = m0();
        } else if (iW != 11) {
            throw v0("a double");
        }
        this.D = 11;
        double d = Double.parseDouble(this.G);
        if (this.L != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            u0("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.G = null;
        this.D = 0;
        int[] iArr2 = this.K;
        int i2 = this.I - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int f0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            long j = this.E;
            int i = (int) j;
            if (j == i) {
                this.D = 0;
                int[] iArr = this.K;
                int i2 = this.I - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.E + c0());
        }
        if (iW == 16) {
            this.G = new String(this.y, this.z, this.F);
            this.z += this.F;
        } else {
            if (iW != 8 && iW != 9 && iW != 10) {
                throw v0("an int");
            }
            if (iW == 10) {
                this.G = m0();
            } else {
                this.G = k0(iW == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i4 = this.I - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.D = 11;
        double d = Double.parseDouble(this.G);
        int i5 = (int) d;
        if (i5 == d) {
            this.G = null;
            this.D = 0;
            int[] iArr3 = this.K;
            int i6 = this.I - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.G + c0());
    }

    public void g() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 1) {
            throw v0("BEGIN_OBJECT");
        }
        o0(3);
        this.D = 0;
    }

    public long g0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 15) {
            this.D = 0;
            int[] iArr = this.K;
            int i = this.I - 1;
            iArr[i] = iArr[i] + 1;
            return this.E;
        }
        if (iW == 16) {
            this.G = new String(this.y, this.z, this.F);
            this.z += this.F;
        } else {
            if (iW != 8 && iW != 9 && iW != 10) {
                throw v0("a long");
            }
            if (iW == 10) {
                this.G = m0();
            } else {
                this.G = k0(iW == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.G);
                this.D = 0;
                int[] iArr2 = this.K;
                int i2 = this.I - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.D = 11;
        double d = Double.parseDouble(this.G);
        long j2 = (long) d;
        if (j2 == d) {
            this.G = null;
            this.D = 0;
            int[] iArr3 = this.K;
            int i3 = this.I - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.G + c0());
    }

    public String h0() throws IOException {
        String strK0;
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 14) {
            strK0 = m0();
        } else if (iW == 12) {
            strK0 = k0('\'');
        } else {
            if (iW != 13) {
                throw v0("a name");
            }
            strK0 = k0('\"');
        }
        this.D = 0;
        this.J[this.I - 1] = strK0;
        return strK0;
    }

    public final int i0(boolean z) throws IOException {
        int i = this.z;
        int i2 = this.A;
        while (true) {
            if (i == i2) {
                this.z = i;
                if (!N(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(c0()));
                    }
                    return -1;
                }
                i = this.z;
                i2 = this.A;
            }
            int i3 = i + 1;
            char[] cArr = this.y;
            char c = cArr[i];
            if (c == '\n') {
                this.B++;
                this.C = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.z = i3;
                    if (i3 == i2) {
                        this.z = i;
                        boolean zN = N(2);
                        this.z++;
                        if (!zN) {
                        }
                        return c;
                    }
                    m();
                    int i4 = this.z;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.z = i4 + 1;
                        while (true) {
                            if (this.z + 2 > this.A && !N(2)) {
                                u0("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.z;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.z;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.A;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.B++;
                                this.C = i5 + 1;
                            }
                            this.z++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.z = i4 + 1;
                        r0();
                        i = this.z;
                        i2 = this.A;
                    }
                } else {
                    if (c != '#') {
                        this.z = i3;
                        return c;
                    }
                    this.z = i3;
                    m();
                    r0();
                    i = this.z;
                    i2 = this.A;
                }
            }
            i = i3;
        }
    }

    public void j0() {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 7) {
            throw v0("null");
        }
        this.D = 0;
        int[] iArr = this.K;
        int i = this.I - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final String k0(char c) throws IOException {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.z;
            int i3 = this.A;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.y;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (this.L == 3 && c2 < ' ') {
                            u0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.z = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.z = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(p0());
                            i2 = this.z;
                            i3 = this.A;
                        } else {
                            if (c2 == '\n') {
                                this.B++;
                                this.C = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.z = i2;
        } while (N(1));
        u0("Unterminated string");
        throw null;
    }

    public String l0() throws IOException {
        String str;
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW == 10) {
            str = m0();
        } else if (iW == 8) {
            str = k0('\'');
        } else if (iW == 9) {
            str = k0('\"');
        } else if (iW == 11) {
            str = this.G;
            this.G = null;
        } else if (iW == 15) {
            str = Long.toString(this.E);
        } else {
            if (iW != 16) {
                throw v0("a string");
            }
            str = new String(this.y, this.z, this.F);
            this.z += this.F;
        }
        this.D = 0;
        int[] iArr = this.K;
        int i = this.I - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final void m() throws c {
        if (this.L == 1) {
            return;
        }
        u0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    public final String m0() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.z + i2;
                int i4 = this.A;
                char[] cArr = this.y;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Token.SEMI /* 91 */:
                                                case Token.RB /* 93 */:
                                                    break;
                                                case Token.LB /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.z, i2);
                    this.z += i2;
                    if (!N(1)) {
                    }
                } else if (!N(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.z;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.z += i;
                return string;
            }
        }
    }

    public int n0() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        switch (iW) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void o0(int i) throws c {
        int i2 = this.I;
        if (i2 - 1 >= 255) {
            throw new c("Nesting limit 255 reached".concat(c0()));
        }
        int[] iArr = this.H;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.H = Arrays.copyOf(iArr, i3);
            this.K = Arrays.copyOf(this.K, i3);
            this.J = (String[]) Arrays.copyOf(this.J, i3);
        }
        int[] iArr2 = this.H;
        int i4 = this.I;
        this.I = i4 + 1;
        iArr2[i4] = i;
    }

    public final char p0() throws IOException {
        int i;
        if (this.z == this.A && !N(1)) {
            u0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.z;
        int i3 = i2 + 1;
        this.z = i3;
        char[] cArr = this.y;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            u0("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.A && !N(4)) {
                            u0("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.z;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    u0("Malformed Unicode escape \\u".concat(new String(cArr, this.z, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.z += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.L == 3) {
            u0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.B++;
        this.C = i3;
        if (this.L == 3) {
            u0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void q0(char c) throws IOException {
        do {
            int i = this.z;
            int i2 = this.A;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.y[i];
                if (c2 == c) {
                    this.z = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.z = i3;
                    p0();
                    i = this.z;
                    i2 = this.A;
                } else {
                    if (c2 == '\n') {
                        this.B++;
                        this.C = i3;
                    }
                    i = i3;
                }
            }
            this.z = i;
        } while (N(1));
        u0("Unterminated string");
        throw null;
    }

    public final void r0() throws IOException {
        char c;
        do {
            if (this.z >= this.A && !N(1)) {
                return;
            }
            int i = this.z;
            int i2 = i + 1;
            this.z = i2;
            c = this.y[i];
            if (c == '\n') {
                this.B++;
                this.C = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void s0() throws c {
        do {
            int i = 0;
            while (true) {
                int i2 = this.z + i;
                if (i2 < this.A) {
                    char c = this.y[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Token.SEMI /* 91 */:
                                                case Token.RB /* 93 */:
                                                    break;
                                                case Token.LB /* 92 */:
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m();
                    }
                    this.z += i;
                    return;
                }
                this.z = i2;
            }
        } while (N(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void t0() throws IOException {
        int i = 0;
        do {
            int iW = this.D;
            if (iW == 0) {
                iW = w();
            }
            switch (iW) {
                case 1:
                    o0(3);
                    i++;
                    this.D = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.J[this.I - 1] = null;
                    }
                    this.I--;
                    i--;
                    this.D = 0;
                    break;
                case 3:
                    o0(1);
                    i++;
                    this.D = 0;
                    break;
                case 4:
                    this.I--;
                    i--;
                    this.D = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.D = 0;
                    break;
                case 8:
                    q0('\'');
                    this.D = 0;
                    break;
                case 9:
                    q0('\"');
                    this.D = 0;
                    break;
                case 10:
                    s0();
                    this.D = 0;
                    break;
                case 12:
                    q0('\'');
                    if (i == 0) {
                        this.J[this.I - 1] = "<skipped>";
                    }
                    this.D = 0;
                    break;
                case 13:
                    q0('\"');
                    if (i == 0) {
                        this.J[this.I - 1] = "<skipped>";
                    }
                    this.D = 0;
                    break;
                case 14:
                    s0();
                    if (i == 0) {
                        this.J[this.I - 1] = "<skipped>";
                    }
                    this.D = 0;
                    break;
                case 16:
                    this.z += this.F;
                    this.D = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.K;
        int i2 = this.I - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public String toString() {
        return getClass().getSimpleName().concat(c0());
    }

    public final void u0(String str) throws c {
        StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(str);
        sbN.append(c0());
        sbN.append("\nSee ");
        sbN.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbN.toString());
    }

    public final IllegalStateException v0(String str) throws IOException {
        String str2 = n0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Expected ", str, " but was ");
        sbX.append(com.google.android.datatransport.runtime.backends.c.x(n0()));
        sbX.append(c0());
        sbX.append("\nSee ");
        sbX.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbX.toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0142  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0197  */
    /* JADX WARN: Code duplicated, block: B:127:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ae A[PHI: r4 r14
  0x01ae: PHI (r4v9 int) = (r4v8 int), (r4v14 int) binds: [B:123:0x0195, B:130:0x01a8] A[DONT_GENERATE, DONT_INLINE]
  0x01ae: PHI (r14v6 int) = (r14v5 int), (r14v7 int) binds: [B:123:0x0195, B:130:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x0219  */
    /* JADX WARN: Code duplicated, block: B:174:0x021b  */
    /* JADX WARN: Code duplicated, block: B:186:0x023c A[DONT_INVERT, PHI: r13
  0x023c: PHI (r13v25 int) = (r13v24 int), (r13v26 int) binds: [B:172:0x0217, B:178:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x023e  */
    /* JADX WARN: Code duplicated, block: B:200:0x025b  */
    /* JADX WARN: Code duplicated, block: B:202:0x025e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x026c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:210:0x026d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0277  */
    /* JADX WARN: Code duplicated, block: B:214:0x027d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0283  */
    /* JADX WARN: Code duplicated, block: B:218:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0288  */
    /* JADX WARN: Code duplicated, block: B:221:0x028c  */
    /* JADX WARN: Code duplicated, block: B:231:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:233:0x02af  */
    /* JADX WARN: Code duplicated, block: B:268:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    public final int w() throws IOException {
        int iI0;
        int i;
        int iI1;
        char c;
        String str;
        String str2;
        int i2;
        int i3;
        int length;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        char c3;
        int i11;
        int i12;
        int[] iArr = this.H;
        int i13 = this.I - 1;
        int i14 = iArr[i13];
        char[] cArr = this.y;
        if (i14 == 1) {
            iArr[i13] = 2;
        } else if (i14 == 2) {
            int iI2 = i0(true);
            if (iI2 != 44) {
                if (iI2 != 59) {
                    if (iI2 == 93) {
                        this.D = 4;
                        return 4;
                    }
                    u0("Unterminated array");
                    throw null;
                }
                m();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13] = 4;
                if (i14 == 5 && (iI0 = i0(true)) != 44) {
                    if (iI0 != 59) {
                        if (iI0 == 125) {
                            this.D = 2;
                            return 2;
                        }
                        u0("Unterminated object");
                        throw null;
                    }
                    m();
                }
                int iI3 = i0(true);
                if (iI3 == 34) {
                    this.D = 13;
                    return 13;
                }
                if (iI3 == 39) {
                    m();
                    this.D = 12;
                    return 12;
                }
                if (iI3 == 125) {
                    if (i14 != 5) {
                        this.D = 2;
                        return 2;
                    }
                    u0("Expected name");
                    throw null;
                }
                m();
                this.z--;
                if (b0((char) iI3)) {
                    this.D = 14;
                    return 14;
                }
                u0("Expected name");
                throw null;
            }
            if (i14 != 4) {
                if (i14 == 6) {
                    if (this.L == 1) {
                        i0(true);
                        int i15 = this.z;
                        this.z = i15 - 1;
                        if (i15 + 4 <= this.A || N(5)) {
                            int i16 = this.z;
                            if (cArr[i16] == ')' && cArr[i16 + 1] == ']' && cArr[i16 + 2] == '}' && cArr[i16 + 3] == '\'' && cArr[i16 + 4] == '\n') {
                                this.z = i16 + 5;
                            }
                        }
                    }
                    this.H[this.I - 1] = 7;
                } else if (i14 == 7) {
                    i = 0;
                    if (i0(false) == -1) {
                        this.D = 17;
                        return 17;
                    }
                    m();
                    this.z--;
                } else {
                    i = 0;
                    if (i14 == 8) {
                        net.luminis.tls.engine.impl.c.r("JsonReader is closed");
                        return 0;
                    }
                }
                iI1 = i0(true);
                if (iI1 != 34) {
                    this.D = 9;
                    return 9;
                }
                if (iI1 != 39) {
                    m();
                    this.D = 8;
                    return 8;
                }
                if (iI1 != 44 && iI1 != 59) {
                    if (iI1 != 91) {
                        this.D = 3;
                        return 3;
                    }
                    if (iI1 != 93) {
                        if (iI1 != 123) {
                            this.D = 1;
                            return 1;
                        }
                        int i17 = this.z - 1;
                        this.z = i17;
                        c = cArr[i17];
                        if (c != 't' || c == 'T') {
                            str = "true";
                            str2 = "TRUE";
                            i2 = 5;
                        } else {
                            if (c != 'f' && c != 'F') {
                                if (c != 'n' && c != 'N') {
                                    i2 = i;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i2 = 7;
                                if (i2 != 0) {
                                    return i2;
                                }
                                int i18 = this.z;
                                i7 = this.A;
                                i8 = i;
                                i9 = i8;
                                int i19 = i9;
                                i10 = i18;
                                z = true;
                                long j = 0;
                                while (true) {
                                    if (i10 + i9 != i7) {
                                        c3 = cArr[i10 + i9];
                                        if (c3 != '+') {
                                            if (c3 != 'E' || c3 == 'e') {
                                                if (i8 != 2 || i8 == 4) {
                                                    i8 = 5;
                                                    i9++;
                                                }
                                            } else if (c3 == '-') {
                                                if (i8 == 0) {
                                                    i8 = 1;
                                                    i19 = 1;
                                                } else {
                                                    if (i8 != 5) {
                                                    }
                                                    i8 = 6;
                                                }
                                                i9++;
                                            } else if (c3 != '.') {
                                                if (c3 >= '0' && c3 <= '9') {
                                                    if (i8 == 1 || i8 == 0) {
                                                        j = -(c3 - '0');
                                                        i8 = 2;
                                                    } else if (i8 == 2) {
                                                        if (j != 0) {
                                                            long j2 = (10 * j) - ((long) (c3 - '0'));
                                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                            j = j2;
                                                        }
                                                    } else if (i8 == 3) {
                                                        i8 = 4;
                                                    } else if (i8 == 5 || i8 == 6) {
                                                        i8 = 7;
                                                    }
                                                    i9++;
                                                } else if (!b0(c3)) {
                                                    i12 = 2;
                                                    if (i8 != 2) {
                                                        if (i8 != i12 || i8 == 4 || i8 == 7) {
                                                            this.F = i9;
                                                            i11 = 16;
                                                            this.D = 16;
                                                        }
                                                    } else if (z || ((j == Long.MIN_VALUE && i19 == 0) || (j == 0 && i19 != 0))) {
                                                        i12 = 2;
                                                        if (i8 != i12) {
                                                        }
                                                        this.F = i9;
                                                        i11 = 16;
                                                        this.D = 16;
                                                    } else {
                                                        if (i19 == 0) {
                                                            j = -j;
                                                        }
                                                        this.E = j;
                                                        this.z += i9;
                                                        i11 = 15;
                                                        this.D = 15;
                                                    }
                                                }
                                            } else if (i8 == 2) {
                                                i8 = 3;
                                                i9++;
                                            }
                                            if (i11 != 0) {
                                                return i11;
                                            }
                                            if (b0(cArr[this.z])) {
                                                u0("Expected value");
                                                throw null;
                                            }
                                            m();
                                            this.D = 10;
                                            return 10;
                                        }
                                        if (i8 != 5) {
                                        }
                                        i8 = 6;
                                        i9++;
                                    } else if (i9 != cArr.length) {
                                        if (N(i9 + 1)) {
                                            i10 = this.z;
                                            i7 = this.A;
                                            c3 = cArr[i10 + i9];
                                            if (c3 != '+') {
                                                if (c3 != 'E') {
                                                    if (i8 != 2) {
                                                    }
                                                    i8 = 5;
                                                    i9++;
                                                } else {
                                                    if (i8 != 2) {
                                                    }
                                                    i8 = 5;
                                                    i9++;
                                                }
                                                if (i11 != 0) {
                                                    return i11;
                                                }
                                                if (b0(cArr[this.z])) {
                                                    u0("Expected value");
                                                    throw null;
                                                }
                                                m();
                                                this.D = 10;
                                                return 10;
                                            }
                                            if (i8 != 5) {
                                            }
                                            i8 = 6;
                                            i9++;
                                        }
                                        i12 = 2;
                                        if (i8 != 2) {
                                            if (i8 != i12) {
                                            }
                                            this.F = i9;
                                            i11 = 16;
                                            this.D = 16;
                                        } else {
                                            if (z) {
                                            }
                                            i12 = 2;
                                            if (i8 != i12) {
                                            }
                                            this.F = i9;
                                            i11 = 16;
                                            this.D = 16;
                                        }
                                        if (i11 != 0) {
                                            return i11;
                                        }
                                        if (b0(cArr[this.z])) {
                                            u0("Expected value");
                                            throw null;
                                        }
                                        m();
                                        this.D = 10;
                                        return 10;
                                    }
                                    i11 = 0;
                                    if (i11 != 0) {
                                        return i11;
                                    }
                                    if (b0(cArr[this.z])) {
                                        u0("Expected value");
                                        throw null;
                                    }
                                    m();
                                    this.D = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i2 = 6;
                        }
                        if (this.L != 3) {
                            i3 = 1;
                        } else {
                            i3 = i;
                        }
                        length = str.length();
                        i4 = i;
                        while (true) {
                            i5 = this.z;
                            i6 = this.A;
                            if (i4 >= length) {
                                if ((i5 + length < i6 && !N(length + 1)) || !b0(cArr[this.z + length])) {
                                    this.z += length;
                                    this.D = i2;
                                    break;
                                }
                                break;
                            }
                            if ((i5 + i4 >= i6 || N(i4 + 1)) && ((c2 = cArr[this.z + i4]) == str.charAt(i4) || (i3 != 0 && c2 == str2.charAt(i4)))) {
                            }
                            i2 = i;
                            break;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        int i110 = this.z;
                        i7 = this.A;
                        i8 = i;
                        i9 = i8;
                        int i111 = i9;
                        i10 = i110;
                        z = true;
                        long j3 = 0;
                        while (true) {
                            if (i10 + i9 != i7) {
                                c3 = cArr[i10 + i9];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (i8 != 2) {
                                        }
                                        i8 = 5;
                                        i9++;
                                    } else {
                                        if (i8 != 2) {
                                        }
                                        i8 = 5;
                                        i9++;
                                    }
                                    if (i11 != 0) {
                                        return i11;
                                    }
                                    if (b0(cArr[this.z])) {
                                        u0("Expected value");
                                        throw null;
                                    }
                                    m();
                                    this.D = 10;
                                    return 10;
                                }
                                if (i8 != 5) {
                                }
                                i8 = 6;
                                i9++;
                            } else if (i9 != cArr.length) {
                                if (N(i9 + 1)) {
                                    i10 = this.z;
                                    i7 = this.A;
                                    c3 = cArr[i10 + i9];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (i8 != 2) {
                                            }
                                            i8 = 5;
                                            i9++;
                                        } else {
                                            if (i8 != 2) {
                                            }
                                            i8 = 5;
                                            i9++;
                                        }
                                        if (i11 != 0) {
                                            return i11;
                                        }
                                        if (b0(cArr[this.z])) {
                                            u0("Expected value");
                                            throw null;
                                        }
                                        m();
                                        this.D = 10;
                                        return 10;
                                    }
                                    if (i8 != 5) {
                                    }
                                    i8 = 6;
                                    i9++;
                                }
                                i12 = 2;
                                if (i8 != 2) {
                                    if (i8 != i12) {
                                    }
                                    this.F = i9;
                                    i11 = 16;
                                    this.D = 16;
                                } else {
                                    if (z) {
                                    }
                                    i12 = 2;
                                    if (i8 != i12) {
                                    }
                                    this.F = i9;
                                    i11 = 16;
                                    this.D = 16;
                                }
                                if (i11 != 0) {
                                    return i11;
                                }
                                if (b0(cArr[this.z])) {
                                    u0("Expected value");
                                    throw null;
                                }
                                m();
                                this.D = 10;
                                return 10;
                            }
                            i11 = 0;
                            if (i11 != 0) {
                                return i11;
                            }
                            if (b0(cArr[this.z])) {
                                u0("Expected value");
                                throw null;
                            }
                            m();
                            this.D = 10;
                            return 10;
                        }
                    }
                    if (i14 == 1) {
                        this.D = 4;
                        return 4;
                    }
                }
                if (i14 == 1 && i14 != 2) {
                    u0("Unexpected value");
                    throw null;
                }
                m();
                this.z--;
                this.D = 7;
                return 7;
            }
            iArr[i13] = 5;
            int iI4 = i0(true);
            if (iI4 != 58) {
                if (iI4 != 61) {
                    u0("Expected ':'");
                    throw null;
                }
                m();
                if (this.z < this.A || N(1)) {
                    int i20 = this.z;
                    if (cArr[i20] == '>') {
                        this.z = i20 + 1;
                    }
                }
            }
        }
        i = 0;
        iI1 = i0(true);
        if (iI1 != 34) {
            this.D = 9;
            return 9;
        }
        if (iI1 != 39) {
            m();
            this.D = 8;
            return 8;
        }
        if (iI1 != 44) {
            if (iI1 != 91) {
                this.D = 3;
                return 3;
            }
            if (iI1 != 93) {
                if (iI1 != 123) {
                    this.D = 1;
                    return 1;
                }
                int i112 = this.z - 1;
                this.z = i112;
                c = cArr[i112];
                if (c != 't') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                    if (this.L != 3) {
                        i3 = 1;
                    } else {
                        i3 = i;
                    }
                    length = str.length();
                    i4 = i;
                    while (true) {
                        i5 = this.z;
                        i6 = this.A;
                        if (i4 >= length) {
                            if (i5 + length < i6) {
                            }
                            this.z += length;
                            this.D = i2;
                            break;
                        }
                        i4 = i5 + i4 >= i6 ? i4 + 1 : i4 + 1;
                    }
                    if (i2 != 0) {
                        return i2;
                    }
                    int i113 = this.z;
                    i7 = this.A;
                    i8 = i;
                    i9 = i8;
                    int i114 = i9;
                    i10 = i113;
                    z = true;
                    long j4 = 0;
                    while (true) {
                        if (i10 + i9 != i7) {
                            c3 = cArr[i10 + i9];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                } else {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                }
                                if (i11 != 0) {
                                    return i11;
                                }
                                if (b0(cArr[this.z])) {
                                    u0("Expected value");
                                    throw null;
                                }
                                m();
                                this.D = 10;
                                return 10;
                            }
                            if (i8 != 5) {
                            }
                            i8 = 6;
                            i9++;
                        } else if (i9 != cArr.length) {
                            if (N(i9 + 1)) {
                                i10 = this.z;
                                i7 = this.A;
                                c3 = cArr[i10 + i9];
                                if (c3 != '+') {
                                    if (c3 != 'E') {
                                        if (i8 != 2) {
                                        }
                                        i8 = 5;
                                        i9++;
                                    } else {
                                        if (i8 != 2) {
                                        }
                                        i8 = 5;
                                        i9++;
                                    }
                                    if (i11 != 0) {
                                        return i11;
                                    }
                                    if (b0(cArr[this.z])) {
                                        u0("Expected value");
                                        throw null;
                                    }
                                    m();
                                    this.D = 10;
                                    return 10;
                                }
                                if (i8 != 5) {
                                }
                                i8 = 6;
                                i9++;
                            }
                            i12 = 2;
                            if (i8 != 2) {
                                if (i8 != i12) {
                                }
                                this.F = i9;
                                i11 = 16;
                                this.D = 16;
                            } else {
                                if (z) {
                                }
                                i12 = 2;
                                if (i8 != i12) {
                                }
                                this.F = i9;
                                i11 = 16;
                                this.D = 16;
                            }
                            if (i11 != 0) {
                                return i11;
                            }
                            if (b0(cArr[this.z])) {
                                u0("Expected value");
                                throw null;
                            }
                            m();
                            this.D = 10;
                            return 10;
                        }
                        i11 = 0;
                        if (i11 != 0) {
                            return i11;
                        }
                        if (b0(cArr[this.z])) {
                            u0("Expected value");
                            throw null;
                        }
                        m();
                        this.D = 10;
                        return 10;
                    }
                }
                str = "true";
                str2 = "TRUE";
                i2 = 5;
                if (this.L != 3) {
                    i3 = 1;
                } else {
                    i3 = i;
                }
                length = str.length();
                i4 = i;
                while (true) {
                    i5 = this.z;
                    i6 = this.A;
                    if (i4 >= length) {
                        if (i5 + length < i6) {
                        }
                        this.z += length;
                        this.D = i2;
                        break;
                    }
                    if (i5 + i4 >= i6) {
                    }
                }
                if (i2 != 0) {
                    return i2;
                }
                int i115 = this.z;
                i7 = this.A;
                i8 = i;
                i9 = i8;
                int i116 = i9;
                i10 = i115;
                z = true;
                long j5 = 0;
                while (true) {
                    if (i10 + i9 != i7) {
                        c3 = cArr[i10 + i9];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (i8 != 2) {
                                }
                                i8 = 5;
                                i9++;
                            } else {
                                if (i8 != 2) {
                                }
                                i8 = 5;
                                i9++;
                            }
                            if (i11 != 0) {
                                return i11;
                            }
                            if (b0(cArr[this.z])) {
                                u0("Expected value");
                                throw null;
                            }
                            m();
                            this.D = 10;
                            return 10;
                        }
                        if (i8 != 5) {
                        }
                        i8 = 6;
                        i9++;
                    } else if (i9 != cArr.length) {
                        if (N(i9 + 1)) {
                            i10 = this.z;
                            i7 = this.A;
                            c3 = cArr[i10 + i9];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                } else {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                }
                                if (i11 != 0) {
                                    return i11;
                                }
                                if (b0(cArr[this.z])) {
                                    u0("Expected value");
                                    throw null;
                                }
                                m();
                                this.D = 10;
                                return 10;
                            }
                            if (i8 != 5) {
                            }
                            i8 = 6;
                            i9++;
                        }
                        i12 = 2;
                        if (i8 != 2) {
                            if (i8 != i12) {
                            }
                            this.F = i9;
                            i11 = 16;
                            this.D = 16;
                        } else {
                            if (z) {
                            }
                            i12 = 2;
                            if (i8 != i12) {
                            }
                            this.F = i9;
                            i11 = 16;
                            this.D = 16;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        if (b0(cArr[this.z])) {
                            u0("Expected value");
                            throw null;
                        }
                        m();
                        this.D = 10;
                        return 10;
                    }
                    i11 = 0;
                    if (i11 != 0) {
                        return i11;
                    }
                    if (b0(cArr[this.z])) {
                        u0("Expected value");
                        throw null;
                    }
                    m();
                    this.D = 10;
                    return 10;
                }
                i2 = i;
                if (i2 != 0) {
                    return i2;
                }
                int i117 = this.z;
                i7 = this.A;
                i8 = i;
                i9 = i8;
                int i118 = i9;
                i10 = i117;
                z = true;
                long j6 = 0;
                while (true) {
                    if (i10 + i9 != i7) {
                        c3 = cArr[i10 + i9];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (i8 != 2) {
                                }
                                i8 = 5;
                                i9++;
                            } else {
                                if (i8 != 2) {
                                }
                                i8 = 5;
                                i9++;
                            }
                            if (i11 != 0) {
                                return i11;
                            }
                            if (b0(cArr[this.z])) {
                                u0("Expected value");
                                throw null;
                            }
                            m();
                            this.D = 10;
                            return 10;
                        }
                        if (i8 != 5) {
                        }
                        i8 = 6;
                        i9++;
                    } else if (i9 != cArr.length) {
                        if (N(i9 + 1)) {
                            i10 = this.z;
                            i7 = this.A;
                            c3 = cArr[i10 + i9];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                } else {
                                    if (i8 != 2) {
                                    }
                                    i8 = 5;
                                    i9++;
                                }
                                if (i11 != 0) {
                                    return i11;
                                }
                                if (b0(cArr[this.z])) {
                                    u0("Expected value");
                                    throw null;
                                }
                                m();
                                this.D = 10;
                                return 10;
                            }
                            if (i8 != 5) {
                            }
                            i8 = 6;
                            i9++;
                        }
                        i12 = 2;
                        if (i8 != 2) {
                            if (i8 != i12) {
                            }
                            this.F = i9;
                            i11 = 16;
                            this.D = 16;
                        } else {
                            if (z) {
                            }
                            i12 = 2;
                            if (i8 != i12) {
                            }
                            this.F = i9;
                            i11 = 16;
                            this.D = 16;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        if (b0(cArr[this.z])) {
                            u0("Expected value");
                            throw null;
                        }
                        m();
                        this.D = 10;
                        return 10;
                    }
                    i11 = 0;
                    if (i11 != 0) {
                        return i11;
                    }
                    if (b0(cArr[this.z])) {
                        u0("Expected value");
                        throw null;
                    }
                    m();
                    this.D = 10;
                    return 10;
                }
            }
            if (i14 == 1) {
                this.D = 4;
                return 4;
            }
        }
        if (i14 == 1) {
        }
        m();
        this.z--;
        this.D = 7;
        return 7;
    }

    public void z() throws IOException {
        int iW = this.D;
        if (iW == 0) {
            iW = w();
        }
        if (iW != 4) {
            throw v0("END_ARRAY");
        }
        int i = this.I;
        this.I = i - 1;
        int[] iArr = this.K;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.D = 0;
    }
}
