package androidx.compose.ui.spatial;

import android.os.Handler;
import androidx.appcompat.widget.x;
import androidx.collection.j0;
import androidx.compose.animation.z;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.node.r;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.unit.j;
import androidx.compose.ui.unit.l;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final x a;
    public final e b;
    public final j0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public androidx.compose.foundation.text.contextmenu.internal.c g;
    public long h;
    public final z i;
    public final androidx.compose.ui.geometry.a j;

    public b() {
        x xVar = new x(6, (byte) 0);
        xVar.z = new long[192];
        xVar.A = new long[192];
        this.a = xVar;
        this.b = new e();
        this.c = new j0();
        this.h = -1L;
        this.i = new z(this, 11);
        this.j = new androidx.compose.ui.geometry.a();
    }

    public static boolean c(d1 d1Var) {
        l1 l1Var = d1Var.i0;
        return (l1Var == null || a0.r(((q1) l1Var).b())) ? false : true;
    }

    public static long g(f0 f0Var) {
        a1 a1Var = f0Var.d0;
        d1 d1Var = (d1) a1Var.e;
        long jC = 0;
        for (d1 d1Var2 = (r) a1Var.d; d1Var2 != null && d1Var2 != d1Var; d1Var2 = d1Var2.N) {
            if (c(d1Var2)) {
                return 9223372034707292159L;
            }
            jC = j.c(jC, d1Var2.W);
        }
        return jC;
    }

    public static void i(f0 f0Var) {
        if (!f0Var.z || c((d1) f0Var.d0.e)) {
            return;
        }
        f0Var.z = false;
        if (f0Var.D) {
            f0Var.C = g(f0Var);
            f0Var.D = false;
        }
        if (j.a(f0Var.C, 9223372034707292159L)) {
            return;
        }
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            i((f0) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251 A[LOOP:11: B:102:0x024f->B:103:0x0251, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x025c A[LOOP:9: B:95:0x022b->B:107:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0263 A[ADDED_TO_REGION, LOOP:12: B:110:0x0263->B:111:0x0265, LOOP_START, PHI: r1
  0x0263: PHI (r1v10 androidx.compose.ui.spatial.d) = (r1v9 androidx.compose.ui.spatial.d), (r1v11 androidx.compose.ui.spatial.d) binds: [B:109:0x0261, B:111:0x0265] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0265 A[LOOP:12: B:110:0x0263->B:111:0x0265, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0272  */
    /* JADX WARN: Code duplicated, block: B:135:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x025f A[EDGE_INSN: B:136:0x025f->B:108:0x025f BREAK  A[LOOP:9: B:95:0x022b->B:107:0x025c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x025f A[EDGE_INSN: B:137:0x025f->B:108:0x025f BREAK  A[LOOP:9: B:95:0x022b->B:107:0x025c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b A[ADDED_TO_REGION, LOOP:7: B:73:0x018b->B:74:0x018d, LOOP_START, PHI: r3
  0x018b: PHI (r3v7 androidx.compose.ui.spatial.d) = (r3v6 androidx.compose.ui.spatial.d), (r3v8 androidx.compose.ui.spatial.d) binds: [B:72:0x0189, B:74:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[LOOP:7: B:73:0x018b->B:74:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:92:0x021f  */
    /* JADX WARN: Code duplicated, block: B:94:0x022a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        Object[] objArr;
        long[] jArr;
        int length;
        d dVar;
        int i3;
        long j4;
        int i4;
        long j5;
        int i5;
        d dVar2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        float[] fArr;
        d dVar3;
        long[] jArr4;
        long j8;
        long j9;
        androidx.compose.foundation.text.contextmenu.internal.c cVar = this.g;
        if (cVar != null) {
            androidx.compose.ui.b.a.removeCallbacks(cVar);
            this.g = null;
        }
        Handler handler = androidx.compose.ui.b.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.d;
        boolean z3 = z2 || this.e;
        x xVar = this.a;
        boolean z4 = true;
        e eVar = this.b;
        if (z2) {
            this.d = false;
            j0 j0Var = this.c;
            Object[] objArr2 = j0Var.a;
            int i9 = j0Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((kotlin.jvm.functions.a) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) xVar.z;
            int i11 = xVar.y;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j10 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr5[i12];
                    long j12 = jArr5[i12 + 1];
                    d dVar4 = (d) eVar.a.b(((int) j10) & 33554431);
                    while (dVar4 != null) {
                        d dVar5 = dVar4.d;
                        boolean z6 = z3;
                        long j13 = dVar4.g;
                        boolean z7 = (jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE) ? z5 : false;
                        dVar4.e = j11;
                        dVar4.f = j12;
                        if (z7) {
                            dVar4.g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            dVar4.a(j8, j9, eVar.d, eVar.e, eVar.g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        dVar4 = dVar5;
                        j11 = j8;
                        j12 = j9;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) xVar.z;
            int i14 = xVar.y;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.e) {
            this.e = false;
            long j14 = eVar.d;
            long j15 = eVar.e;
            float[] fArr2 = eVar.g;
            androidx.collection.z zVar = eVar.a;
            j2 = 128;
            Object[] objArr3 = zVar.c;
            long[] jArr7 = zVar.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j16 = j14;
                    long j17 = jArr7[i17];
                    int i19 = i18;
                    xVar = xVar;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j18 = j17;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j18 & 255) < 128) {
                                d dVar6 = (d) objArr3[(i17 << 3) + i21];
                                while (dVar6 != null) {
                                    eVar.a(dVar6, j16, j15, fArr2, jCurrentTimeMillis);
                                    dVar6 = dVar6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j18 >>= i22;
                            i21++;
                            j16 = j16;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    xVar = xVar;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j6 = eVar.d;
                j7 = eVar.e;
                fArr = eVar.g;
                dVar3 = eVar.b;
                if (dVar3 != null) {
                    while (dVar3 != null) {
                        f0 f0VarT = k.t(dVar3.b);
                        long jB = ((u) i0.a(f0VarT)).getRectManager().b(f0VarT);
                        long j19 = f0VarT.B;
                        dVar3.e = jB;
                        dVar3.f = (((long) (((int) (jB & 4294967295L)) + ((int) (j19 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jB >> 32)) + ((int) (j19 >> 32)))) << 32);
                        eVar.a(dVar3, j6, j7, fArr, jCurrentTimeMillis);
                        dVar3 = dVar3.d;
                    }
                }
            }
            if (this.f) {
                i2 = 0;
                this.f = false;
                x xVar2 = xVar;
                jArr2 = (long[]) xVar2.z;
                int i23 = xVar2.y;
                jArr3 = (long[]) xVar2.A;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != a.c) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                xVar2.y = i7;
                xVar2.z = jArr3;
                xVar2.A = jArr2;
            } else {
                i2 = 0;
            }
            if (eVar.c <= jCurrentTimeMillis) {
                androidx.collection.z zVar2 = eVar.a;
                objArr = zVar2.c;
                jArr = zVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j4 = jArr[i3];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j5 = j4;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j5 & j3) < j2) {
                                    for (dVar2 = (d) objArr[(i3 << 3) + i5]; dVar2 != null; dVar2 = dVar2.d) {
                                    }
                                }
                                j5 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                dVar = eVar.b;
                if (dVar != null) {
                    while (dVar != null) {
                        dVar = dVar.d;
                    }
                }
                eVar.c = -1L;
            }
            if (eVar.c > j) {
                j();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j6 = eVar.d;
            j7 = eVar.e;
            fArr = eVar.g;
            dVar3 = eVar.b;
            if (dVar3 != null) {
                while (dVar3 != null) {
                    f0 f0VarT2 = k.t(dVar3.b);
                    long jB2 = ((u) i0.a(f0VarT2)).getRectManager().b(f0VarT2);
                    long j110 = f0VarT2.B;
                    dVar3.e = jB2;
                    dVar3.f = (((long) (((int) (jB2 & 4294967295L)) + ((int) (j110 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jB2 >> 32)) + ((int) (j110 >> 32)))) << 32);
                    eVar.a(dVar3, j6, j7, fArr, jCurrentTimeMillis);
                    dVar3 = dVar3.d;
                }
            }
        }
        if (this.f) {
            i2 = 0;
            this.f = false;
            x xVar3 = xVar;
            jArr2 = (long[]) xVar3.z;
            int i24 = xVar3.y;
            jArr3 = (long[]) xVar3.A;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != a.c) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            xVar3.y = i7;
            xVar3.z = jArr3;
            xVar3.A = jArr2;
        } else {
            i2 = 0;
        }
        if (eVar.c <= jCurrentTimeMillis) {
            androidx.collection.z zVar3 = eVar.a;
            objArr = zVar3.c;
            jArr = zVar3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j4 = jArr[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j5 = j4;
                        while (i5 < i4) {
                            if ((j5 & j3) < j2) {
                                while (dVar2 != null) {
                                }
                            }
                            j5 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            dVar = eVar.b;
            if (dVar != null) {
                while (dVar != null) {
                    dVar = dVar.d;
                }
            }
            eVar.c = -1L;
        }
        if (eVar.c > j) {
            j();
        }
    }

    public final long b(f0 f0Var) {
        long j;
        int i = f0Var.y & 33554431;
        x xVar = this.a;
        long[] jArr = (long[]) xVar.z;
        int i2 = xVar.y;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x010e  */
    public final void d(f0 f0Var) {
        char c;
        boolean z;
        f0 f0VarV;
        int i;
        boolean z2 = true;
        f0Var.z = true;
        f0Var.A = 9223372034707292159L;
        a1 a1Var = f0Var.d0;
        d1 d1Var = (d1) a1Var.e;
        v0 v0Var = f0Var.e0.p;
        int iC0 = v0Var.c0();
        float fA0 = v0Var.a0();
        androidx.compose.ui.geometry.a aVar = this.j;
        aVar.b = 0.0f;
        aVar.c = 0.0f;
        aVar.d = iC0;
        aVar.e = fA0;
        while (true) {
            c = ' ';
            if (d1Var == null) {
                break;
            }
            f0 f0Var2 = d1Var.L;
            if (d1Var == ((d1) f0Var2.d0.e) && !f0Var2.z) {
                long jB = b(f0Var2);
                if (!j.a(jB, 9223372034707292159L)) {
                    aVar.e((((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jB >> 32)) << 32));
                    break;
                }
            }
            l1 l1Var = d1Var.i0;
            if (l1Var != null) {
                float[] fArrB = ((q1) l1Var).b();
                if (!a0.r(fArrB)) {
                    androidx.compose.ui.graphics.f0.c(fArrB, aVar);
                }
            }
            long j = d1Var.W;
            aVar.e((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            d1Var = d1Var.N;
        }
        int i2 = (int) aVar.b;
        int i3 = (int) aVar.c;
        int i4 = (int) aVar.d;
        int i5 = (int) aVar.e;
        int i6 = f0Var.y;
        boolean z3 = f0Var.E;
        f0Var.E = true;
        x xVar = this.a;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) xVar.z;
            int i8 = xVar.y;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    x xVar2 = xVar;
                    f0VarV = f0Var.v();
                    if (f0VarV != null) {
                        i = f0VarV.y;
                    } else {
                        i = -1;
                    }
                    xVar2.m(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, a1Var.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), a1Var.f(16), this.b.a.a(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    char c2 = c;
                    x xVar3 = xVar;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << c2) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i5) & 4294967295L) | (((long) i4) << c2);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        c = c2;
                        xVar = xVar3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            x xVar4 = xVar;
            f0VarV = f0Var.v();
            if (f0VarV != null) {
                i = f0VarV.y;
            } else {
                i = -1;
            }
            xVar4.m(i6, i2, i3, i4, i5, (512 & 32) != 0 ? -1 : i, a1Var.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), a1Var.f(16), this.b.a.a(i6), -1);
        }
        this.d = z;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i11 = bVarZ.z;
        for (int i12 = 0; i12 < i11; i12++) {
            f0 f0Var3 = (f0) objArr[i12];
            if (f0Var3.I()) {
                d(f0Var3);
            }
        }
    }

    public final void e(f0 f0Var) {
        if (f0Var.E) {
            this.d = true;
            int i = f0Var.y & 33554431;
            x xVar = this.a;
            long[] jArr = (long[]) xVar.z;
            int i2 = xVar.y;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
            }
        }
        j();
    }

    public final void f(f0 f0Var, boolean z) {
        long j;
        int i;
        int i2;
        int i3;
        boolean zI = f0Var.I();
        a1 a1Var = f0Var.d0;
        if (zI) {
            f0 f0VarV = f0Var.v();
            if (f0VarV == null || f0VarV.z) {
                j = f0VarV == null ? 0L : 9223372034707292159L;
            } else {
                if (f0VarV.D) {
                    f0VarV.D = false;
                    f0VarV.C = g(f0VarV);
                }
                j = f0VarV.C;
            }
            d1 d1Var = (d1) a1Var.e;
            if (j.a(j, 9223372034707292159L) || c(d1Var)) {
                d(f0Var);
                return;
            }
            if (f0Var.z) {
                d(f0Var);
                i(f0Var);
                return;
            }
            long jC = j.c(j, d1Var.W);
            v0 v0Var = f0Var.e0.p;
            int iC0 = v0Var.c0();
            int iA0 = v0Var.a0();
            long j2 = (((long) iC0) << 32) | (((long) iA0) & 4294967295L);
            int i4 = f0Var.y;
            boolean z2 = f0Var.E;
            x xVar = this.a;
            if (!z2) {
                f0Var.E = true;
                boolean zF = a1Var.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                boolean zF2 = a1Var.f(16);
                boolean zA = this.b.a.a(i4);
                if (f0VarV != null) {
                    int i5 = f0VarV.y;
                    int i6 = (int) (jC >> 32);
                    int i7 = (int) (jC & 4294967295L);
                    int i8 = 33554431;
                    int i9 = i4 & 33554431;
                    long[] jArr = (long[]) xVar.z;
                    int i10 = xVar.y;
                    int i11 = 0;
                    while (i11 < jArr.length - 2 && i11 < i10) {
                        int i12 = i8;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i11 + 2]) & i12) == i5) {
                            long j3 = jArr2[i11];
                            int i13 = ((int) (j3 >> 32)) + i6;
                            int i14 = ((int) j3) + i7;
                            xVar.m(i9, i13, i14, i13 + iC0, i14 + iA0, i5, zF, zF2, zA, i11);
                            break;
                        }
                        jArr = jArr2;
                        i11 += 3;
                        i8 = i12;
                        i5 = i5;
                    }
                } else {
                    int i15 = (int) (jC >> 32);
                    int i16 = (int) (jC & 4294967295L);
                    xVar.m(i4, i15, i16, i15 + iC0, i16 + iA0, (512 & 32) != 0 ? -1 : 0, zF, zF2, zA, -1);
                }
                this.d = true;
            } else if (z || !j.a(jC, f0Var.A) || !l.a(j2, f0Var.B)) {
                if (f0VarV != null) {
                    int i17 = f0VarV.y;
                    int i18 = (int) (jC >> 32);
                    int i19 = (int) (jC & 4294967295L);
                    int i20 = i4 & 33554431;
                    long[] jArr3 = (long[]) xVar.z;
                    int i21 = xVar.y;
                    int i22 = 0;
                    loop0: while (i22 < jArr3.length - 2 && i22 < i21) {
                        int i23 = iC0;
                        if ((((int) jArr3[i22 + 2]) & 33554431) == i17) {
                            long j4 = jArr3[i22];
                            i2 = i18;
                            i3 = i19;
                            int i24 = ((int) (j4 >> 32)) + i2;
                            int i25 = ((int) j4) + i3;
                            int i26 = i24 + i23;
                            int i27 = i25 + iA0;
                            int i28 = i22 + 3;
                            while (i28 < jArr3.length - 2 && i28 < i21) {
                                int i29 = i28 + 2;
                                int i30 = i21;
                                long j5 = jArr3[i29];
                                int i31 = i28;
                                if ((((int) j5) & 33554431) == i20) {
                                    long j6 = jArr3[i31];
                                    int i32 = i24 - ((int) (j6 >> 32));
                                    int i33 = i25 - ((int) j6);
                                    jArr3[i31] = (((long) i24) << 32) | (((long) i25) & 4294967295L);
                                    jArr3[i31 + 1] = (((long) i26) << 32) | (((long) i27) & 4294967295L);
                                    jArr3[i29] = j5 | (((j5 >> 63) & 1) << 60);
                                    if (i32 != 0 || i33 != 0) {
                                        xVar.t(i32, i33, (j5 & a.b) | (((long) ((i31 + 3) & 33554431)) << 25));
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i28 = i31 + 3;
                                i21 = i30;
                            }
                            i = i21;
                            i22 = i28;
                        } else {
                            i = i21;
                            i2 = i18;
                            i3 = i19;
                        }
                        i22 += 3;
                        iC0 = i23;
                        i18 = i2;
                        i19 = i3;
                        i17 = i17;
                        i21 = i;
                    }
                } else {
                    int i34 = (int) (jC >> 32);
                    int i35 = (int) (jC & 4294967295L);
                    int i36 = i34 + iC0;
                    int i37 = i35 + iA0;
                    int i38 = i4 & 33554431;
                    long[] jArr4 = (long[]) xVar.z;
                    int i39 = xVar.y;
                    int i40 = 0;
                    while (i40 < jArr4.length - 2 && i40 < i39) {
                        int i41 = i40 + 2;
                        int i42 = i39;
                        int i43 = i40;
                        long j7 = jArr4[i41];
                        long[] jArr5 = jArr4;
                        if ((((int) j7) & 33554431) == i38) {
                            long j8 = jArr5[i43];
                            jArr5[i43] = (((long) i34) << 32) | (((long) i35) & 4294967295L);
                            jArr5[i43 + 1] = (((long) i36) << 32) | (((long) i37) & 4294967295L);
                            jArr5[i41] = j7 | (((j7 >> 63) & 1) << 60);
                            int i44 = i34 - ((int) (j8 >> 32));
                            int i45 = i35 - ((int) j8);
                            if (!(i44 != 0) && !(i45 != 0)) {
                                break;
                            }
                            xVar.t(i44, i45, (j7 & a.b) | (((long) ((i43 + 3) & 33554431)) << 25));
                            break;
                        }
                        i40 = i43 + 3;
                        i39 = i42;
                        jArr4 = jArr5;
                    }
                }
                this.d = true;
            }
            f0Var.B = j2;
            f0Var.A = jC;
        }
    }

    public final void h(f0 f0Var) {
        if (f0Var.E) {
            int i = f0Var.y & 33554431;
            x xVar = this.a;
            long[] jArr = (long[]) xVar.z;
            int i2 = xVar.y;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = a.c;
                    break;
                }
            }
            f0Var.E = false;
            this.d = true;
            this.f = true;
        }
    }

    public final void j() {
        androidx.compose.foundation.text.contextmenu.internal.c cVar = this.g;
        boolean z = cVar != null;
        long j = this.b.c;
        if (j >= 0 || !z) {
            if (this.h == j && z) {
                return;
            }
            if (cVar != null) {
                Handler handler = androidx.compose.ui.b.a;
                androidx.compose.ui.b.a.removeCallbacks(cVar);
            }
            Handler handler2 = androidx.compose.ui.b.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            androidx.compose.foundation.text.contextmenu.internal.c cVar2 = new androidx.compose.foundation.text.contextmenu.internal.c(1, this.i);
            androidx.compose.ui.b.a.postDelayed(cVar2, jMax - jCurrentTimeMillis);
            this.g = cVar2;
        }
    }
}
