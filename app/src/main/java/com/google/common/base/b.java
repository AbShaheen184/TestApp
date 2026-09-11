package com.google.common.base;

import com.google.firebase.sessions.e1;
import java.io.Closeable;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static e1 a;

    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : com.google.android.material.resources.c.d(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static long c(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(androidx.privacysandbox.ads.adservices.java.internal.a.n(j2, ")", androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "overflow: checkedAdd(", ", ")));
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                kotlin.a.a(th, th2);
            }
        }
    }

    public static final void e(int i, int i2) {
        if (i <= i2) {
            return;
        }
        com.google.gson.b.d(i, "toIndex (", ") is greater than size (", i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long f(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (com.google.common.math.e.a[roundingMode.ordinal()]) {
            case 1:
                c.f(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    public static final long g(long j) {
        long j2 = (j << 1) + 1;
        kotlin.time.a.y.getClass();
        int i = kotlin.time.b.a;
        return j2;
    }

    public static boolean h(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static long k(long j, long j2) {
        c.e("a", j);
        c.e("b", j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean o(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean p(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static final void q() {
        try {
            if (a == null) {
                e1 e1Var = (e1) ((com.google.firebase.sessions.i) ((com.google.firebase.sessions.q) com.google.firebase.g.c().b(com.google.firebase.sessions.q.class))).o.get();
                e1Var.getClass();
                a = e1Var;
            }
            e1 e1Var2 = a;
            if (e1Var2 == null) {
                kotlin.jvm.internal.l.f("sharedSessionRepository");
                throw null;
            }
            if (e1Var2.i) {
                if (e1Var2 != null) {
                    e1Var2.b();
                } else {
                    kotlin.jvm.internal.l.f("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0170  */
    /* JADX WARN: Code duplicated, block: B:103:0x017c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0197 A[LOOP:7: B:108:0x0195->B:109:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x0223  */
    /* JADX WARN: Code duplicated, block: B:140:0x0227  */
    /* JADX WARN: Code duplicated, block: B:142:0x022b  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0231  */
    /* JADX WARN: Code duplicated, block: B:146:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x0237  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024e  */
    /* JADX WARN: Code duplicated, block: B:158:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x025d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0270  */
    /* JADX WARN: Code duplicated, block: B:187:0x0214 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0190 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:91:0x013b  */
    /* JADX WARN: Code duplicated, block: B:98:0x015a A[LOOP:5: B:97:0x0158->B:98:0x015a, LOOP_END] */
    public static long s(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        char cCharAt;
        kotlin.time.c cVar;
        int i7;
        char cCharAt2;
        kotlin.time.c cVar2;
        long jA;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jG;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        if (str.length() == 0) {
            net.luminis.tls.engine.impl.c.o("The string is empty");
            return 0L;
        }
        char cCharAt7 = str.charAt(0);
        char c = '-';
        char c2 = '+';
        if (cCharAt7 != '+') {
            i2 = cCharAt7 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            net.luminis.tls.engine.impl.c.o("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            net.luminis.tls.engine.impl.c.o("");
            return 0L;
        }
        int i17 = i2 + 1;
        if (i17 == str.length()) {
            net.luminis.tls.engine.impl.c.o("");
            return 0L;
        }
        boolean z = false;
        kotlin.time.c cVar3 = null;
        long jG2 = 0;
        long j2 = 0;
        while (i17 < str.length()) {
            char cCharAt8 = str.charAt(i17);
            if (cCharAt8 != 'T') {
                kotlin.time.d dVar = kotlin.time.d.e;
                if (dVar.b) {
                    char cCharAt9 = str.charAt(i17);
                    if (cCharAt9 == c2) {
                        i3 = i17 + 1;
                        i4 = 1;
                    } else if (cCharAt9 != c) {
                        i3 = i17;
                        i4 = 1;
                    } else {
                        i3 = i17 + 1;
                        i4 = -1;
                    }
                } else {
                    i3 = i17;
                    i4 = 1;
                }
                while (i3 < str.length() && str.charAt(i3) == '0') {
                    i3++;
                }
                long j3 = 0;
                while (true) {
                    if (i3 < str.length()) {
                        char cCharAt10 = str.charAt(i3);
                        i5 = i17;
                        if ('0' <= cCharAt10 && cCharAt10 < ':') {
                            int i18 = cCharAt10 - '0';
                            i6 = i;
                            long j4 = dVar.c;
                            if (j3 > j4 || (j3 == j4 && i18 > dVar.d)) {
                                while (i3 < str.length() && '0' <= (cCharAt6 = str.charAt(i3)) && cCharAt6 < ':') {
                                    i3++;
                                }
                                if (i3 != str.length()) {
                                    if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? 1 : 0)) {
                                        j = dVar.a;
                                        cCharAt = str.charAt(i3);
                                        cVar = kotlin.time.c.SECONDS;
                                        i7 = i6;
                                        if (cCharAt == '.') {
                                            i8 = i3 + 1;
                                            iMin = Math.min(i3 + 7, str.length());
                                            i10 = 0;
                                            for (i9 = i8; i9 < iMin; i9++) {
                                                cCharAt5 = str.charAt(i9);
                                                if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                                    for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                                        i10 = (i10 << 1) + (i10 << 3);
                                                    }
                                                    iMin2 = Math.min(i9 + 9, str.length());
                                                    i12 = i9;
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i12 < iMin2) {
                                                            i16 = iMin2;
                                                            cCharAt4 = str.charAt(i12);
                                                            i14 = i12;
                                                            if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                                i12 = i14 + 1;
                                                                iMin2 = i16;
                                                            }
                                                        } else {
                                                            i14 = i12;
                                                        }
                                                    }
                                                    for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                                        i13 = (i13 << 1) + (i13 << 3);
                                                    }
                                                    i3 = i14;
                                                    while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                                        i3++;
                                                    }
                                                    if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                        net.luminis.tls.engine.impl.c.o("");
                                                        return 0L;
                                                    }
                                                    long j5 = (((long) 1000000000) * ((long) i10)) + ((long) i13);
                                                    long j6 = i4;
                                                    double d2 = j5;
                                                    switch (cVar.ordinal()) {
                                                        case 0:
                                                            d = 1.0E-15d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 1:
                                                            d = 1.0E-12d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 2:
                                                            d = 1.0E-9d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 3:
                                                            d = 1.0E-6d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 4:
                                                            d = 6.0E-5d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 5:
                                                            d = 0.0036d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        case 6:
                                                            d = 0.0864d;
                                                            jG = kotlin.math.a.G(d2 * d);
                                                            break;
                                                        default:
                                                            com.google.gson.b.u(cVar, "Unknown unit: ");
                                                            jG = 0;
                                                            break;
                                                    }
                                                    j2 = jG * j6;
                                                } else {
                                                    i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                                }
                                            }
                                            while (i11 < 6 - (i9 - i8)) {
                                                i10 = (i10 << 1) + (i10 << 3);
                                            }
                                            iMin2 = Math.min(i9 + 9, str.length());
                                            i12 = i9;
                                            i13 = 0;
                                            while (true) {
                                                if (i12 < iMin2) {
                                                    i16 = iMin2;
                                                    cCharAt4 = str.charAt(i12);
                                                    i14 = i12;
                                                    if ('0' > cCharAt4) {
                                                    }
                                                } else {
                                                    i14 = i12;
                                                }
                                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                i12 = i14 + 1;
                                                iMin2 = i16;
                                            }
                                            while (i15 < 9 - (i14 - i9)) {
                                                i13 = (i13 << 1) + (i13 << 3);
                                            }
                                            i3 = i14;
                                            while (i3 < str.length()) {
                                                i3++;
                                            }
                                            if (i3 != i8) {
                                            }
                                            net.luminis.tls.engine.impl.c.o("");
                                            return 0L;
                                        }
                                        cCharAt2 = str.charAt(i3);
                                        cVar2 = kotlin.time.c.DAYS;
                                        if (cCharAt2 != 'D') {
                                            cVar = cVar2;
                                        } else if (cCharAt2 != 'H') {
                                            cVar = kotlin.time.c.HOURS;
                                        } else if (cCharAt2 != 'M') {
                                            cVar = kotlin.time.c.MINUTES;
                                        } else if (cCharAt2 != 'S') {
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                        }
                                        if (cVar3 == null && cVar3.compareTo(cVar) <= 0) {
                                            net.luminis.tls.engine.impl.c.o("Unexpected order of duration components");
                                            return 0L;
                                        }
                                        if (cVar == cVar2) {
                                            if (!z) {
                                                net.luminis.tls.engine.impl.c.o("");
                                                return 0L;
                                            }
                                            jG2 = c.g(j, cVar) * ((long) i4);
                                        } else {
                                            if (z) {
                                                net.luminis.tls.engine.impl.c.o("");
                                                return 0L;
                                            }
                                            jA = a(jG2, c.g(j, cVar) * ((long) i4));
                                            if (jA != 9223372036854759646L) {
                                                net.luminis.tls.engine.impl.c.o("");
                                                return 0L;
                                            }
                                            jG2 = jA;
                                        }
                                        i17 = i3 + 1;
                                        cVar3 = cVar;
                                        i = i7;
                                        c = '-';
                                        c2 = '+';
                                    }
                                }
                                net.luminis.tls.engine.impl.c.o("");
                                return 0L;
                            }
                            j3 = (j3 << 3) + (j3 << 1) + ((long) i18);
                            i3++;
                            i = i6;
                            i17 = i5;
                        }
                    } else {
                        i5 = i17;
                    }
                    i6 = i;
                    if (i3 != str.length()) {
                        if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? 1 : 0)) {
                            j = j3;
                            cCharAt = str.charAt(i3);
                            cVar = kotlin.time.c.SECONDS;
                            i7 = i6;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    net.luminis.tls.engine.impl.c.o("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                net.luminis.tls.engine.impl.c.o("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            cVar2 = kotlin.time.c.DAYS;
                            if (cCharAt2 != 'D') {
                                cVar = cVar2;
                            } else if (cCharAt2 != 'H') {
                                cVar = kotlin.time.c.HOURS;
                            } else if (cCharAt2 != 'M') {
                                cVar = kotlin.time.c.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                cVar = null;
                            }
                            if (cVar != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (cVar3 == null) {
                            }
                            if (cVar == cVar2) {
                                if (!z) {
                                    net.luminis.tls.engine.impl.c.o("");
                                    return 0L;
                                }
                                jG2 = c.g(j, cVar) * ((long) i4);
                            } else {
                                if (z) {
                                    net.luminis.tls.engine.impl.c.o("");
                                    return 0L;
                                }
                                jA = a(jG2, c.g(j, cVar) * ((long) i4));
                                if (jA != 9223372036854759646L) {
                                    net.luminis.tls.engine.impl.c.o("");
                                    return 0L;
                                }
                                jG2 = jA;
                            }
                            i17 = i3 + 1;
                            cVar3 = cVar;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                    }
                    net.luminis.tls.engine.impl.c.o("");
                    return 0L;
                }
            }
            if (z || (i17 = i17 + 1) == str.length()) {
                net.luminis.tls.engine.impl.c.o("");
                return 0L;
            }
            z = true;
        }
        int i19 = i;
        long jI = kotlin.time.a.i(v(jG2, kotlin.time.c.MILLISECONDS), v(j2, kotlin.time.c.NANOSECONDS));
        return (i19 == 0 || jI == kotlin.time.a.B) ? jI : kotlin.time.a.l(jI);
    }

    public static long t(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final long u(int i, kotlin.time.c cVar) {
        if (cVar.compareTo(kotlin.time.c.SECONDS) > 0) {
            return v(i, cVar);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, cVar.e);
        kotlin.time.g gVar = kotlin.time.a.y;
        long j = jConvert << 1;
        int i2 = kotlin.time.b.a;
        return j;
    }

    public static final long v(long j, kotlin.time.c cVar) {
        TimeUnit timeUnit = cVar.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            kotlin.time.g gVar = kotlin.time.a.y;
            long j2 = jConvert2 << 1;
            int i = kotlin.time.b.a;
            return j2;
        }
        if (cVar.compareTo(kotlin.time.c.MILLISECONDS) < 0) {
            return g(com.google.android.material.resources.c.d(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return g(c.g(Math.abs(j), cVar) * jSignum);
    }

    public static String w(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (p(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (p(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String x(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public org.schabi.newpipe.extractor.linkhandler.a i(String str) {
        if (org.schabi.newpipe.extractor.utils.f.h(str)) {
            net.luminis.tls.engine.impl.c.o("The url is null or empty");
            return null;
        }
        String strB = org.schabi.newpipe.extractor.utils.f.b(str);
        return j(strB, org.schabi.newpipe.extractor.utils.f.c(strB));
    }

    public org.schabi.newpipe.extractor.linkhandler.a j(String str, String str2) throws org.schabi.newpipe.extractor.exceptions.f {
        Objects.requireNonNull(str, "URL cannot be null");
        if (!r(str)) {
            throw new org.schabi.newpipe.extractor.exceptions.f("URL not accepted: ".concat(str));
        }
        String strL = l(str);
        return new org.schabi.newpipe.extractor.linkhandler.a(str, n(strL, str2), strL);
    }

    public abstract String l(String str);

    public abstract String m(String str);

    public String n(String str, String str2) {
        return m(str);
    }

    public abstract boolean r(String str);
}
