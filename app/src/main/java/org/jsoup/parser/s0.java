package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements AutoCloseable {
    public static final char[] y = {'*', '|', '_', '-'};
    public final a e;

    public s0(String str) {
        this.e = new a(str);
    }

    public static String N(String str) {
        if (str.indexOf(92) == -1) {
            return str;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        char c = 0;
        for (char c2 : str.toCharArray()) {
            if (c2 == '\\') {
                if (c == '\\') {
                    sbB.append(c2);
                    c = 0;
                }
            } else {
                sbB.append(c2);
            }
            c = c2;
        }
        return org.jsoup.internal.k.l(sbB);
    }

    public static boolean z(char c) {
        return c == '-' || org.jsoup.internal.k.g(c) || c == '_' || org.jsoup.internal.k.e(c) || c >= 128;
    }

    public final boolean L(char c) {
        a aVar = this.e;
        if (!aVar.g0(c)) {
            return false;
        }
        aVar.w();
        return true;
    }

    public final void a() {
        a aVar = this.e;
        if (aVar.c0()) {
            return;
        }
        aVar.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final String g(char c, char c2) {
        StringBuilder sbB = org.jsoup.internal.k.b();
        a aVar = this.e;
        if (aVar.B - aVar.A < 1024) {
            aVar.C = 0;
        }
        aVar.g();
        aVar.E = aVar.A;
        char c3 = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        while (!aVar.c0()) {
            char cW = aVar.w();
            if (c3 == '\\') {
                if (cW == 'Q') {
                    z3 = true;
                } else if (cW == 'E') {
                    z3 = false;
                }
                sbB.append(cW);
            } else {
                if (cW == '\'' && cW != c && !z) {
                    z2 = !z2;
                } else if (cW == '\"' && cW != c && !z2) {
                    z = !z;
                }
                if (z2 || z || z3) {
                    sbB.append(cW);
                } else if (cW == c) {
                    i++;
                    if (i > 1) {
                        sbB.append(cW);
                    }
                } else if (cW != c2 || (i = i - 1) > 0) {
                    sbB.append(cW);
                }
            }
            if (i <= 0) {
                break;
            }
            c3 = cW;
        }
        String strL = org.jsoup.internal.k.l(sbB);
        if (i <= 0) {
            return strL;
        }
        aVar.n0();
        throw new org.jsoup.helper.o("Did not find balanced marker at '" + strL + "'");
    }

    public final String m() {
        char cB0;
        a aVar = this.e;
        if (aVar.c0()) {
            net.luminis.tls.engine.impl.c.o("CSS identifier expected, but end of input found");
            return null;
        }
        aVar.g();
        int i = aVar.A;
        int i2 = aVar.B;
        char[] cArr = aVar.z;
        int i3 = i;
        while (i3 < i2 && z(cArr[i3])) {
            i3++;
        }
        aVar.A = i3;
        String strM = i3 > i ? a.m(aVar.z, aVar.e, i, i3 - i) : "";
        char cB1 = aVar.b0();
        if (cB1 != '\\' && cB1 != 0) {
            return strM;
        }
        StringBuilder sbB = org.jsoup.internal.k.b();
        if (!strM.isEmpty()) {
            sbB.append(strM);
        }
        while (!aVar.c0()) {
            char cB2 = aVar.b0();
            if (!z(cB2)) {
                if (cB2 != 0) {
                    if (cB2 != '\\') {
                        break;
                    }
                    a();
                    if (!aVar.c0() && ((cB0 = aVar.b0()) == '\n' || cB0 == '\r' || cB0 == '\f')) {
                        aVar.o0();
                        break;
                    }
                    if (aVar.c0()) {
                        sbB.append((char) 65533);
                    } else {
                        char cW = aVar.w();
                        if (org.jsoup.internal.k.h(cW)) {
                            aVar.o0();
                            aVar.g();
                            int i4 = aVar.A;
                            int i5 = aVar.B;
                            char[] cArr2 = aVar.z;
                            int i6 = i4;
                            while (i6 < i5 && i6 - i4 < 6 && org.jsoup.internal.k.h(cArr2[i6])) {
                                i6++;
                            }
                            aVar.A = i6;
                            String strM2 = i6 > i4 ? a.m(aVar.z, aVar.e, i4, i6 - i4) : "";
                            try {
                                int i7 = Integer.parseInt(strM2, 16);
                                if (i7 == 0 || !Character.isValidCodePoint(i7) || Character.isSurrogate((char) i7)) {
                                    sbB.append((char) 65533);
                                } else {
                                    sbB.appendCodePoint(i7);
                                }
                                if (!aVar.c0()) {
                                    char cB3 = aVar.b0();
                                    if (cB3 == '\r') {
                                        a();
                                        if (!aVar.c0() && aVar.b0() == '\n') {
                                            a();
                                        }
                                    } else if (cB3 == ' ' || cB3 == '\t' || cB3 == '\n' || cB3 == '\r' || cB3 == '\f') {
                                        a();
                                    }
                                }
                            } catch (NumberFormatException e) {
                                throw new IllegalArgumentException("Invalid escape sequence: ".concat(strM2), e);
                            }
                        } else {
                            sbB.append(cW);
                        }
                    }
                } else {
                    a();
                    sbB.append((char) 65533);
                }
            } else {
                sbB.append(aVar.w());
            }
        }
        return org.jsoup.internal.k.l(sbB);
    }

    public final String toString() {
        return this.e.toString();
    }

    public final boolean w() {
        boolean z = false;
        while (org.jsoup.internal.k.i(this.e.b0())) {
            a();
            z = true;
        }
        return z;
    }
}
