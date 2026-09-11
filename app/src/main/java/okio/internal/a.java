package okio.internal;

import java.io.EOFException;
import okio.c0;
import okio.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(kotlin.text.a.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(okio.f fVar, okio.i iVar, long j, long j2, int i) {
        c0 c0Var;
        byte[] bArr;
        long j3 = j;
        long j4 = j2;
        iVar.getClass();
        long j5 = i;
        okio.b.d(iVar.f(), 0, j5);
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.o("byteCount == 0");
            return 0L;
        }
        long j6 = 0;
        if (j3 < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("fromIndex < 0: ", j3));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j3, "fromIndex > toIndex: ", " > ");
            sbM.append(j4);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
        long j7 = fVar.y;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (c0Var = fVar.e) == null) {
            return -1L;
        }
        if (j7 - j3 >= j3) {
            while (true) {
                long j8 = ((long) (c0Var.c - c0Var.b)) + j6;
                if (j8 > j3) {
                    break;
                }
                c0Var = c0Var.f;
                c0Var.getClass();
                j6 = j8;
            }
            byte[] bArrJ = iVar.j();
            byte b2 = bArrJ[0];
            long jMin = Math.min(j4, (fVar.y - j5) + 1);
            long j9 = j6;
            while (j9 < jMin) {
                byte[] bArr2 = c0Var.a;
                int iMin = (int) Math.min(c0Var.c, (((long) c0Var.b) + jMin) - j9);
                for (int i2 = (int) ((((long) c0Var.b) + j3) - j9); i2 < iMin; i2++) {
                    if (bArr2[i2] == b2 && b(c0Var, i2 + 1, bArrJ, 1, i)) {
                        return ((long) (i2 - c0Var.b)) + j9;
                    }
                }
                j9 += (long) (c0Var.c - c0Var.b);
                c0Var = c0Var.f;
                c0Var.getClass();
                j3 = j9;
            }
            return -1L;
        }
        while (j7 > j3) {
            c0Var = c0Var.g;
            c0Var.getClass();
            j7 -= (long) (c0Var.c - c0Var.b);
        }
        byte[] bArrJ2 = iVar.j();
        byte b3 = bArrJ2[0];
        byte[] bArr3 = bArrJ2;
        long jMin2 = Math.min(j4, (fVar.y - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr4 = c0Var.a;
            int iMin2 = (int) Math.min(c0Var.c, (((long) c0Var.b) + jMin2) - j7);
            int i3 = (int) ((((long) c0Var.b) + j3) - j7);
            while (i3 < iMin2) {
                if (bArr4[i3] == b3) {
                    bArr = bArr3;
                    if (b(c0Var, i3 + 1, bArr, 1, i)) {
                        return ((long) (i3 - c0Var.b)) + j7;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j7 += (long) (c0Var.c - c0Var.b);
            c0Var = c0Var.f;
            c0Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(c0 c0Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = c0Var.c;
        byte[] bArr2 = c0Var.a;
        while (i2 < i3) {
            if (i == i4) {
                c0Var = c0Var.f;
                c0Var.getClass();
                byte[] bArr3 = c0Var.a;
                bArr2 = bArr3;
                i = c0Var.b;
                i4 = c0Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(okio.f fVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.Y(j2) == 13) {
                String strH0 = fVar.h0(j2, kotlin.text.a.a);
                fVar.skip(2L);
                return strH0;
            }
        }
        String strH1 = fVar.h0(j, kotlin.text.a.a);
        fVar.skip(1L);
        return strH1;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(okio.f fVar, v vVar, boolean z) {
        int i;
        int i2;
        int i3;
        c0 c0Var;
        int i4;
        vVar.getClass();
        c0 c0Var2 = fVar.e;
        if (c0Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = c0Var2.a;
        int i5 = c0Var2.b;
        int i6 = c0Var2.c;
        int[] iArr = vVar.y;
        c0 c0Var3 = c0Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (c0Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            c0Var3 = c0Var3.f;
                            c0Var3.getClass();
                            int i16 = c0Var3.b;
                            byte[] bArr2 = c0Var3.a;
                            i2 = c0Var3.c;
                            if (c0Var3 == c0Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                c0Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        c0Var3.getClass();
                        c0 c0Var4 = c0Var3.f;
                        c0Var4.getClass();
                        i3 = c0Var4.b;
                        byte[] bArr3 = c0Var4.a;
                        i4 = c0Var4.c;
                        if (c0Var4 != c0Var2) {
                            c0Var = c0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c0Var = null;
                        }
                    } else {
                        c0Var = c0Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c0Var3 = c0Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c0Var3 = c0Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
