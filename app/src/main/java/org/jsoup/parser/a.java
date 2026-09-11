package org.jsoup.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable {
    public static final com.google.common.util.concurrent.g0 K = new com.google.common.util.concurrent.g0(new org.jsoup.internal.c(4));
    public static final com.google.common.util.concurrent.g0 L = new com.google.common.util.concurrent.g0(new org.jsoup.internal.c(5));
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public ArrayList G;
    public int H;
    public String I;
    public int J;
    public String[] e;
    public Reader y;
    public char[] z;

    public a(Reader reader) {
        this.C = 0;
        this.E = -1;
        this.G = null;
        this.H = 1;
        this.y = reader;
        this.z = (char[]) L.m();
        this.e = (String[]) K.m();
        g();
    }

    public static String m(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i3; i6++) {
            i5 = (i5 * 31) + cArr[i6];
        }
        int i7 = i5 & 511;
        String str = strArr[i7];
        if (str != null && i2 == str.length()) {
            int i8 = i;
            int i9 = i2;
            while (true) {
                int i10 = i9 - 1;
                if (i9 == 0) {
                    return str;
                }
                int i11 = i8 + 1;
                int i12 = i4 + 1;
                if (cArr[i8] == str.charAt(i4)) {
                    i8 = i11;
                    i9 = i10;
                    i4 = i12;
                }
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i7] = str2;
        return str2;
    }

    public final String L() {
        g();
        int i = this.A;
        int i2 = this.B;
        char[] cArr = this.z;
        int i3 = i;
        while (i3 < i2 && Character.isLetter(cArr[i3])) {
            i3++;
        }
        this.A = i3;
        return i3 > i ? m(this.z, this.e, i, i3 - i) : "";
    }

    public final String N(net.luminis.tls.engine.impl.c cVar) {
        g();
        int i = this.A;
        int i2 = this.B;
        char[] cArr = this.z;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            cVar.getClass();
            if (!((c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '>') ? false : true)) {
                break;
            }
            i3++;
        }
        this.A = i3;
        return i3 > i ? m(this.z, this.e, i, i3 - i) : "";
    }

    public final String X(char c) {
        int i;
        g();
        int i2 = this.A;
        while (true) {
            if (i2 >= this.B) {
                i = -1;
                break;
            }
            if (c == this.z[i2]) {
                i = i2 - this.A;
                break;
            }
            i2++;
        }
        if (i == -1) {
            return a0();
        }
        String strM = m(this.z, this.e, this.A, i);
        this.A += i;
        return strM;
    }

    public final String Y(char... cArr) {
        g();
        int i = this.A;
        int i2 = this.B;
        char[] cArr2 = this.z;
        int i3 = i;
        loop0: while (i3 < i2) {
            char c = cArr2[i3];
            for (char c2 : cArr) {
                if (c == c2) {
                    break loop0;
                }
            }
            i3++;
        }
        this.A = i3;
        return i3 > i ? m(this.z, this.e, i, i3 - i) : "";
    }

    public final String Z(char... cArr) {
        g();
        int i = this.A;
        int i2 = this.B;
        char[] cArr2 = this.z;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.A = i3;
        return i3 > i ? m(this.z, this.e, i, i3 - i) : "";
    }

    public final void a() {
        this.A++;
    }

    public final String a0() {
        g();
        char[] cArr = this.z;
        String[] strArr = this.e;
        int i = this.A;
        String strM = m(cArr, strArr, i, this.B - i);
        this.A = this.B;
        return strM;
    }

    public final char b0() {
        g();
        int i = this.A;
        if (i >= this.B) {
            return (char) 65535;
        }
        return this.z[i];
    }

    public final boolean c0() {
        g();
        return this.A >= this.B;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        com.google.common.util.concurrent.g0 g0Var = K;
        com.google.common.util.concurrent.g0 g0Var2 = L;
        Reader reader = this.y;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.y = null;
            Arrays.fill(this.z, (char) 0);
            g0Var2.z(this.z);
            this.z = null;
            g0Var.z(this.e);
        } catch (IOException unused) {
            this.y = null;
            Arrays.fill(this.z, (char) 0);
            g0Var2.z(this.z);
            this.z = null;
            g0Var.z(this.e);
        } finally {
            this.y = null;
            Arrays.fill(this.z, (char) 0);
            g0Var2.z(this.z);
            this.z = null;
            g0Var.z(this.e);
            this.e = null;
        }
    }

    public final int d0(int i) {
        ArrayList arrayList = this.G;
        if (arrayList == null) {
            return 0;
        }
        int iBinarySearch = Collections.binarySearch(arrayList, Integer.valueOf(i));
        return iBinarySearch < -1 ? Math.abs(iBinarySearch) - 2 : iBinarySearch;
    }

    public final boolean e0(String str) {
        g();
        g();
        int length = str.length();
        if (length <= this.B - this.A) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.z[this.A + i]) {
                }
            }
            this.A = str.length() + this.A;
            return true;
        }
        return false;
    }

    public final boolean f0(String str) {
        if (!j0(str)) {
            return false;
        }
        this.A = str.length() + this.A;
        return true;
    }

    public final void g() {
        int i;
        if (this.F || (i = this.A) < this.C || this.E != -1) {
            return;
        }
        this.D += i;
        int i2 = this.B - i;
        this.B = i2;
        if (i2 > 0) {
            char[] cArr = this.z;
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        this.A = 0;
        while (true) {
            int i3 = this.B;
            if (i3 >= 2048) {
                break;
            }
            try {
                Reader reader = this.y;
                char[] cArr2 = this.z;
                int i4 = reader.read(cArr2, i3, cArr2.length - i3);
                if (i4 == -1) {
                    this.F = true;
                    break;
                } else if (i4 == 0) {
                    break;
                } else {
                    this.B += i4;
                }
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
        this.C = Math.min(this.B, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        ArrayList arrayList = this.G;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                int iD0 = d0(this.D);
                if (iD0 == -1) {
                    iD0 = 0;
                }
                Integer num = (Integer) this.G.get(iD0);
                num.getClass();
                this.H += iD0;
                this.G.clear();
                this.G.add(num);
            }
            for (int i5 = this.A; i5 < this.B; i5++) {
                if (this.z[i5] == '\n') {
                    this.G.add(Integer.valueOf(this.D + 1 + i5));
                }
            }
        }
        this.I = null;
    }

    public final boolean g0(char c) {
        return !c0() && this.z[this.A] == c;
    }

    public final boolean h0(char... cArr) {
        if (!c0()) {
            g();
            char c = this.z[this.A];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i0() {
        if (c0()) {
            return false;
        }
        return org.jsoup.internal.k.e(this.z[this.A]);
    }

    public final boolean j0(String str) {
        g();
        int length = str.length();
        if (length > this.B - this.A) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            char c = this.z[this.A + i];
            if (cCharAt != c && Character.toUpperCase(cCharAt) != Character.toUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    public final int k0(String str) {
        g();
        char cCharAt = str.charAt(0);
        int i = this.A;
        while (i < this.B) {
            if (cCharAt != this.z[i]) {
                do {
                    i++;
                    if (i >= this.B) {
                        break;
                    }
                } while (cCharAt != this.z[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.B;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == this.z[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.A;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final int l0() {
        return this.D + this.A;
    }

    public final String m0() {
        int iD0;
        StringBuilder sb = new StringBuilder();
        int iL0 = l0();
        int i = 1;
        if (this.G != null) {
            int iD1 = d0(iL0);
            int i2 = this.H;
            i = iD1 == -1 ? i2 : 1 + iD1 + i2;
        }
        sb.append(i);
        sb.append(":");
        int iL1 = l0();
        if (this.G != null && (iD0 = d0(iL1)) != -1) {
            iL1 -= ((Integer) this.G.get(iD0)).intValue();
        }
        sb.append(iL1 + 1);
        return sb.toString();
    }

    public final void n0() {
        int i = this.E;
        if (i == -1) {
            throw new UncheckedIOException(new IOException("Mark invalid"));
        }
        this.A = i;
        this.E = -1;
    }

    public final void o0() {
        int i = this.A;
        if (i < 1) {
            throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
        }
        this.A = i - 1;
    }

    public final String toString() {
        int i = this.B;
        int i2 = this.A;
        return i - i2 < 0 ? "" : new String(this.z, i2, i - i2);
    }

    public final char w() {
        g();
        int i = this.A;
        char c = i >= this.B ? (char) 65535 : this.z[i];
        this.A = i + 1;
        return c;
    }

    public final String z() {
        g();
        int i = this.A;
        int i2 = this.B;
        char[] cArr = this.z;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (!((c == '&' || c == '<' || c == 0) ? false : true)) {
                break;
            }
            i3++;
        }
        this.A = i3;
        return i3 > i ? m(this.z, this.e, i, i3 - i) : "";
    }

    public a(String str) {
        this(new StringReader(str));
    }
}
