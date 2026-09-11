package com.caverock.androidsvg;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public int a;

    /* JADX WARN: Code duplicated, block: B:108:0x008a A[EDGE_INSN: B:108:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public final float a(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        char cCharAt;
        int i10;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int i11;
        int i12;
        int i13;
        char cCharAt3;
        char cCharAt4;
        this.a = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int i14 = this.a;
            long j = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            z2 = false;
            i6 = 0;
            while (true) {
                i7 = this.a;
                if (i7 >= i2) {
                    break;
                }
                cCharAt4 = str.charAt(i7);
                if (cCharAt4 != '0') {
                    if (i3 == 0) {
                        i5++;
                    } else {
                        i4++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i15 = i3 + i4;
                    while (i4 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i4--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i3 = i15 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    i6 = this.a - i14;
                    z2 = true;
                }
                this.a++;
            }
            if (!z2 && this.a == i6 + 1) {
                return Float.NaN;
            }
            if (i3 == 0) {
                if (i5 == 0) {
                    return Float.NaN;
                }
                i3 = 1;
            }
            if (z2) {
                i4 = (i6 - i5) - i3;
            }
            i8 = this.a;
            if (i8 < i2 && ((cCharAt = str.charAt(i8)) == 'E' || cCharAt == 'e')) {
                i10 = this.a + 1;
                this.a = i10;
                if (i10 == i2) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case Token.THIS /* 48 */:
                            case Token.FALSE /* 49 */:
                            case Token.TRUE /* 50 */:
                            case Token.SHEQ /* 51 */:
                            case Token.SHNE /* 52 */:
                            case Token.REGEXP /* 53 */:
                            case Token.BINDNAME /* 54 */:
                            case Token.THROW /* 55 */:
                            case Token.RETHROW /* 56 */:
                            case Token.IN /* 57 */:
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.a--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        i11 = this.a;
                        i12 = 0;
                        while (true) {
                            i13 = this.a;
                            if (i13 >= i2 && (cCharAt3 = str.charAt(i13)) >= '0' && cCharAt3 <= '9') {
                                if (i12 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i12 = (i12 * 10) + (cCharAt3 - '0');
                                this.a++;
                            }
                        }
                        if (this.a == i11) {
                            return Float.NaN;
                        }
                        if (z3) {
                            i4 -= i12;
                        } else {
                            i4 += i12;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.a++;
                z4 = false;
                if (!z4) {
                    i11 = this.a;
                    i12 = 0;
                    while (true) {
                        i13 = this.a;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.a++;
                    }
                    if (this.a == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            }
            i9 = i3 + i4;
            if (i9 <= 39 || i9 < -44) {
                return Float.NaN;
            }
            float f2 = j;
            if (j != 0) {
                if (i4 > 0) {
                    f = b[i4];
                } else if (i4 < 0) {
                    if (i4 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        i4 += 20;
                    }
                    f = c[-i4];
                }
                f2 *= f;
            }
            return z ? -f2 : f2;
        }
        z = false;
        this.a++;
        int i16 = this.a;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        z2 = false;
        i6 = 0;
        while (true) {
            i7 = this.a;
            if (i7 >= i2) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i7);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i3 == 0) {
                i5++;
            } else {
                i4++;
            }
            this.a++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
            if (i5 == 0) {
                return Float.NaN;
            }
            i3 = 1;
        }
        if (z2) {
            i4 = (i6 - i5) - i3;
        }
        i8 = this.a;
        if (i8 < i2) {
            i10 = this.a + 1;
            this.a = i10;
            if (i10 == i2) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i10);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case Token.THIS /* 48 */:
                        case Token.FALSE /* 49 */:
                        case Token.TRUE /* 50 */:
                        case Token.SHEQ /* 51 */:
                        case Token.SHNE /* 52 */:
                        case Token.REGEXP /* 53 */:
                        case Token.BINDNAME /* 54 */:
                        case Token.THROW /* 55 */:
                        case Token.RETHROW /* 56 */:
                        case Token.IN /* 57 */:
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.a--;
                            z4 = true;
                            z3 = false;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    i11 = this.a;
                    i12 = 0;
                    while (true) {
                        i13 = this.a;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.a++;
                    }
                    if (this.a == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            } else {
                z3 = false;
            }
            this.a++;
            z4 = false;
            if (!z4) {
                i11 = this.a;
                i12 = 0;
                while (true) {
                    i13 = this.a;
                    if (i13 >= i2) {
                    }
                    i12 = (i12 * 10) + (cCharAt3 - '0');
                    this.a++;
                }
                if (this.a == i11) {
                    return Float.NaN;
                }
                if (z3) {
                    i4 -= i12;
                } else {
                    i4 += i12;
                }
            }
        }
        i9 = i3 + i4;
        if (i9 <= 39) {
        }
        return Float.NaN;
    }
}
