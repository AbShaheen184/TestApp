package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public long[] a = w0.a;
    public Object[] b = androidx.collection.internal.a.c;
    public float[] c = k.a;
    public int d;
    public int e;
    public int f;

    public e0(int i) {
        if (i >= 0) {
            c(w0.d(i));
        } else {
            net.luminis.tls.engine.impl.c.o("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (kotlin.jvm.internal.l.a(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, w0.c(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = w0.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = w0.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new float[iMax];
    }

    public final void d(String str, float f) {
        long j;
        long j2;
        long j3;
        int i;
        long[] jArr;
        Object[] objArr;
        String str2 = str;
        int i2 = -862048943;
        int iHashCode = (str2 != null ? str2.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr2[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr2[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = -9187201950435737472L;
            long j8 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j8) >> 3)) & i6;
                int i12 = i2;
                if (kotlin.jvm.internal.l.a(this.b[iNumberOfTrailingZeros], str2)) {
                    i = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j8 &= j8 - 1;
                    i2 = i12;
                }
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iA = a(i4);
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            Object[] objArr2 = this.b;
                            float[] fArr = this.c;
                            int i16 = (i15 + 7) >> 3;
                            j = 255;
                            int i17 = 0;
                            while (i17 < i16) {
                                long j9 = jArr3[i17] & j7;
                                jArr3[i17] = (-72340172838076674L) & ((~j9) + (j9 >>> 7));
                                i17++;
                                j5 = j5;
                                j7 = -9187201950435737472L;
                            }
                            j2 = j5;
                            char c = 7;
                            int iP = kotlin.collections.n.P(jArr3);
                            int i18 = iP - 1;
                            long j10 = 72057594037927935L;
                            jArr3[i18] = (jArr3[i18] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iP] = jArr3[0];
                            int i19 = 0;
                            while (i19 != i15) {
                                int i20 = i19 >> 3;
                                int i21 = (i19 & 7) << 3;
                                long j11 = (jArr3[i20] >> i21) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj = objArr2[i19];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i13;
                                    int i22 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i23 = i22 >>> 7;
                                    int iA2 = a(i23);
                                    int i24 = i23 & i15;
                                    char c2 = c;
                                    if (((iA2 - i24) & i15) / 8 == ((i19 - i24) & i15) / 8) {
                                        long j12 = j10;
                                        jArr3[i20] = (((long) (i22 & 127)) << i21) | (jArr3[i20] & (~(255 << i21)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j12) | Long.MIN_VALUE;
                                        i19++;
                                        c = c2;
                                        j10 = j12;
                                    } else {
                                        long j13 = j10;
                                        int i25 = iA2 >> 3;
                                        long j14 = jArr3[i25];
                                        int i26 = (iA2 & 7) << 3;
                                        if (((j14 >> i26) & 255) == 128) {
                                            objArr = objArr2;
                                            jArr3[i25] = ((~(255 << i26)) & j14) | (((long) (i22 & 127)) << i26);
                                            jArr3[i20] = (jArr3[i20] & (~(255 << i21))) | (128 << i21);
                                            objArr[iA2] = objArr[i19];
                                            objArr[i19] = null;
                                            fArr[iA2] = fArr[i19];
                                            fArr[i19] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i25] = ((~(255 << i26)) & j14) | (((long) (i22 & 127)) << i26);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i19];
                                            objArr[i19] = obj2;
                                            float f2 = fArr[iA2];
                                            fArr[iA2] = fArr[i19];
                                            fArr[i19] = f2;
                                            i19--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i19++;
                                        i15 = i15;
                                        c = c2;
                                        j10 = j13;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i19++;
                                }
                            }
                            this.f = w0.a(this.d) - this.e;
                        }
                        iA = a(i4);
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    int iB = w0.b(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    float[] fArr2 = this.c;
                    int i27 = this.d;
                    c(iB);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    float[] fArr3 = this.c;
                    int i28 = this.d;
                    int i29 = 0;
                    while (i29 < i27) {
                        if (((jArr4[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < j3) {
                            Object obj3 = objArr3[i29];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i13;
                            int i30 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i30 >>> 7);
                            jArr = jArr5;
                            long j15 = i30 & 127;
                            int i31 = iA3 >> 3;
                            int i32 = (iA3 & 7) << 3;
                            long j16 = (jArr[i31] & (~(255 << i32))) | (j15 << i32);
                            jArr[i31] = j16;
                            jArr[(((iA3 - 7) & i28) + (i28 & 7)) >> 3] = j16;
                            objArr4[iA3] = obj3;
                            fArr3[iA3] = fArr2[i29];
                        } else {
                            jArr = jArr5;
                        }
                        i29++;
                        jArr5 = jArr;
                    }
                    iA = a(i4);
                }
                this.e++;
                int i33 = this.f;
                long[] jArr6 = this.a;
                int i34 = iA >> 3;
                long j17 = jArr6[i34];
                int i35 = (iA & 7) << 3;
                this.f = i33 - (((j17 >> i35) & j) == j3 ? 1 : 0);
                int i36 = this.d;
                long j18 = (j17 & (~(j << i35))) | (j2 << i35);
                jArr6[i34] = j18;
                jArr6[(((iA - 7) & i36) + (i36 & 7)) >> 3] = j18;
                i = ~iA;
                break;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            str2 = str;
            i5 = i11;
            i2 = i13;
        }
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = str;
        this.c[i] = f;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                int i3 = 0;
                while (i3 < i2) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = objArr[i4];
                        float f = fArr[i4];
                        int iB = e0Var.b(obj2);
                        if (iB < 0 || f != e0Var.c[iB]) {
                            return false;
                        }
                    }
                    j >>= 8;
                    i3++;
                    z2 = z2;
                }
                z = z2;
                if (i2 != 8) {
                    return z;
                }
            } else {
                z = z2;
            }
            if (i == length) {
                return z;
            }
            i++;
            z2 = z;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
