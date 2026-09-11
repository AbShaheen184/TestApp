package okhttp3.internal.url;

import java.io.EOFException;
import kotlin.text.k;
import okhttp3.internal.e;
import okio.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return b(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) throws EOFException {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || k.U(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                f fVar = new f();
                fVar.t0(i4, iCharCount, str);
                f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            fVar.u0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            fVar.u0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || k.U(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            fVar2.v0(iCodePointAt2);
                            while (!fVar2.X()) {
                                byte b = fVar2.readByte();
                                fVar.o0(37);
                                char[] cArr = a;
                                fVar.o0(cArr[((b & 255) >> 4) & 15]);
                                fVar.o0(cArr[b & 15]);
                            }
                        } else {
                            fVar.v0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return fVar.i0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static final boolean c(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && e.n(str.charAt(i + 1)) != -1 && e.n(str.charAt(i3)) != -1;
    }

    public static String d(int i, String str, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                f fVar = new f();
                fVar.t0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iN = e.n(str.charAt(iCharCount + 1));
                        int iN2 = e.n(str.charAt(i4));
                        if (iN == -1 || iN2 == -1) {
                            fVar.v0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fVar.o0((iN << 4) + iN2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        fVar.o0(32);
                        iCharCount++;
                    } else {
                        fVar.v0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return fVar.i0();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }
}
