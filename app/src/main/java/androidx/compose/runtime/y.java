package androidx.compose.runtime;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements u {
    public final androidx.collection.r0 B;
    public final f2 C;
    public final androidx.collection.o0 D;
    public final androidx.collection.p0 E;
    public final androidx.collection.p0 F;
    public final androidx.collection.o0 G;
    public final androidx.compose.runtime.changelist.a H;
    public final androidx.compose.runtime.changelist.a I;
    public final androidx.collection.o0 J;
    public androidx.collection.o0 K;
    public boolean L;
    public androidx.compose.ui.graphics.a M;
    public j1 N;
    public y O;
    public int P;
    public final com.app.mlounge.data.music.e Q;
    public final androidx.compose.runtime.internal.l R;
    public final r S;
    public int T;
    public final v e;
    public final androidx.compose.ui.node.a2 y;
    public final AtomicReference z = new AtomicReference(null);
    public final Object A = new Object();

    public y(v vVar, androidx.compose.ui.node.a2 a2Var) {
        this.e = vVar;
        this.y = a2Var;
        androidx.collection.r0 r0Var = new androidx.collection.r0(new androidx.collection.p0());
        this.B = r0Var;
        f2 f2Var = new f2();
        if (vVar.d()) {
            f2Var.H = new androidx.collection.z();
        }
        if (vVar.f()) {
            f2Var.c();
        }
        this.C = f2Var;
        this.D = androidx.datastore.preferences.protobuf.h1.g();
        this.E = new androidx.collection.p0();
        this.F = new androidx.collection.p0();
        this.G = androidx.datastore.preferences.protobuf.h1.g();
        androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
        this.H = aVar;
        androidx.compose.runtime.changelist.a aVar2 = new androidx.compose.runtime.changelist.a();
        this.I = aVar2;
        this.J = androidx.datastore.preferences.protobuf.h1.g();
        this.K = androidx.datastore.preferences.protobuf.h1.g();
        com.app.mlounge.data.music.e eVar = new com.app.mlounge.data.music.e(vVar, 13);
        this.Q = eVar;
        this.R = new androidx.compose.runtime.internal.l();
        r rVar = new r(a2Var, vVar, f2Var, r0Var, aVar, aVar2, eVar, this);
        vVar.p(rVar);
        this.S = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void A(Object obj) {
        synchronized (this.A) {
            try {
                v(obj);
                Object objG = this.G.g(obj);
                if (objG != null) {
                    if (objG instanceof androidx.collection.p0) {
                        androidx.collection.p0 p0Var = (androidx.collection.p0) objG;
                        Object[] objArr = p0Var.b;
                        long[] jArr = p0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((e0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        v((e0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(kotlin.jvm.functions.p pVar) {
        boolean zI = i();
        q();
        v vVar = this.e;
        if (!zI) {
            vVar.a(this, pVar);
            return;
        }
        r rVar = this.S;
        rVar.z = 0;
        rVar.y = true;
        vVar.a(this, pVar);
        rVar.u();
    }

    public final void a() {
        this.z.set(null);
        this.H.l.F();
        this.I.l.F();
        androidx.collection.r0 r0Var = this.B;
        if (r0Var.e.g()) {
            return;
        }
        androidx.compose.runtime.internal.l lVar = this.R;
        try {
            lVar.g(r0Var, this.S.D());
            lVar.b();
        } finally {
            lVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    public final void b(Object obj, boolean z) {
        int i;
        Object objG = this.D.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof androidx.collection.p0;
        q0 q0Var = q0.e;
        androidx.collection.p0 p0Var = this.E;
        androidx.collection.p0 p0Var2 = this.F;
        androidx.collection.o0 o0Var = this.J;
        if (!z2) {
            q1 q1Var = (q1) objG;
            if (androidx.datastore.preferences.protobuf.h1.v(o0Var, obj, q1Var) || q1Var.b(obj) == q0Var) {
                return;
            }
            if (q1Var.g == null || z) {
                p0Var.a(q1Var);
                return;
            } else {
                p0Var2.a(q1Var);
                return;
            }
        }
        androidx.collection.p0 p0Var3 = (androidx.collection.p0) objG;
        Object[] objArr = p0Var3.b;
        long[] jArr = p0Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        q1 q1Var2 = (q1) objArr[(i2 << 3) + i5];
                        if (androidx.datastore.preferences.protobuf.h1.v(o0Var, obj, q1Var2)) {
                            i = i3;
                        } else {
                            i = i3;
                            if (q1Var2.b(obj) != q0Var) {
                                if (q1Var2.g == null || z) {
                                    p0Var.a(q1Var2);
                                } else {
                                    p0Var2.a(q1Var2);
                                }
                            }
                        }
                    } else {
                        i = i3;
                    }
                    j >>= i;
                    i5++;
                    i3 = i;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0231 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0233 A[LOOP:6: B:94:0x01df->B:111:0x0233, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x0240 A[EDGE_INSN: B:204:0x0240->B:113:0x0240 BREAK  A[LOOP:6: B:94:0x01df->B:111:0x0233], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0122 A[EDGE_INSN: B:224:0x0122->B:219:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        int i;
        long j6;
        boolean zG;
        int i2;
        long j7;
        long[] jArr6;
        long[] jArr7;
        char c2;
        long j8;
        int i3;
        int i4;
        boolean z2 = set instanceof androidx.compose.runtime.collection.d;
        androidx.collection.o0 o0Var = this.G;
        Object obj = null;
        int i5 = 8;
        if (z2) {
            androidx.collection.p0 p0Var = ((androidx.compose.runtime.collection.d) set).e;
            Object[] objArr = p0Var.b;
            long[] jArr8 = p0Var.a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr8[i6];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i6 << 3) + i8];
                                c2 = c3;
                                if (obj2 instanceof q1) {
                                    ((q1) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = o0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof androidx.collection.p0) {
                                            androidx.collection.p0 p0Var2 = (androidx.collection.p0) objG;
                                            Object[] objArr2 = p0Var2.b;
                                            long[] jArr9 = p0Var2.a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = i5;
                                                i3 = length;
                                                int i10 = 0;
                                                while (true) {
                                                    long j10 = jArr9[i10];
                                                    j8 = j9;
                                                    long[] jArr10 = jArr9;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                        int i12 = 0;
                                                        while (i12 < i11) {
                                                            if ((j10 & 255) < 128) {
                                                                b((e0) objArr2[(i10 << 3) + i12], z);
                                                            }
                                                            j10 >>= i9;
                                                            i12++;
                                                            jArr8 = jArr8;
                                                        }
                                                        jArr7 = jArr8;
                                                        if (i11 != i9) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr7 = jArr8;
                                                    }
                                                    if (i10 == length2) {
                                                        break;
                                                    }
                                                    i10++;
                                                    jArr9 = jArr10;
                                                    j9 = j8;
                                                    jArr8 = jArr7;
                                                    i9 = 8;
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j8 = j9;
                                            i3 = length;
                                            b((e0) objG, z);
                                        }
                                    }
                                    i4 = 8;
                                }
                                jArr7 = jArr8;
                                j8 = j9;
                                i3 = length;
                                i4 = 8;
                            } else {
                                jArr7 = jArr8;
                                c2 = c3;
                                j8 = j9;
                                i3 = length;
                                i4 = i5;
                            }
                            j9 = j8 >> i4;
                            i8++;
                            length = i3;
                            i5 = i4;
                            c3 = c2;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c = c3;
                        int i13 = length;
                        if (i7 != i5) {
                            break;
                        } else {
                            length = i13;
                        }
                    } else {
                        jArr6 = jArr8;
                        c = 7;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    jArr8 = jArr6;
                    obj = null;
                    i5 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof q1) {
                    ((q1) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = o0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof androidx.collection.p0) {
                            androidx.collection.p0 p0Var3 = (androidx.collection.p0) objG2;
                            Object[] objArr3 = p0Var3.b;
                            long[] jArr11 = p0Var3.a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr11[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 != length3) {
                                            break;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8 - ((~(i14 - length3)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & 255) < 128) {
                                                b((e0) objArr3[(i14 << 3) + i16], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        } else if (i14 != length3) {
                                            break;
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((e0) objG2, z);
                        }
                    }
                }
            }
        }
        androidx.collection.o0 o0Var2 = this.D;
        androidx.collection.p0 p0Var4 = this.E;
        if (z) {
            androidx.collection.p0 p0Var5 = this.F;
            if (p0Var5.h()) {
                long[] jArr12 = o0Var2.a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j12 = jArr12[i17];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i18 = 8 - ((~(i17 - length4)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j12 & j2) < j) {
                                    int i20 = (i17 << 3) + i19;
                                    Object obj4 = o0Var2.b[i20];
                                    Object obj5 = o0Var2.c[i20];
                                    if (obj5 instanceof androidx.collection.p0) {
                                        androidx.collection.p0 p0Var6 = (androidx.collection.p0) obj5;
                                        Object[] objArr4 = p0Var6.b;
                                        long[] jArr13 = p0Var6.a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i21 = 0;
                                            while (true) {
                                                long j13 = jArr13[i21];
                                                jArr5 = jArr12;
                                                i = length4;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i22 = 8 - ((~(i21 - length5)) >>> 31);
                                                    for (int i23 = 0; i23 < i22; i23 = i2 + 1) {
                                                        if ((j13 & j2) < j) {
                                                            i2 = i23;
                                                            int i24 = (i21 << 3) + i2;
                                                            j7 = j13;
                                                            q1 q1Var = (q1) objArr4[i24];
                                                            if (p0Var5.c(q1Var) || p0Var4.c(q1Var)) {
                                                                p0Var6.m(i24);
                                                            }
                                                        } else {
                                                            i2 = i23;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                    }
                                                    if (i22 != 8) {
                                                        break;
                                                    }
                                                    if (i21 != length5) {
                                                        break;
                                                    }
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                } else if (i21 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i21++;
                                                    length4 = i;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i = length4;
                                            j6 = j12;
                                        }
                                        zG = p0Var6.g();
                                    } else {
                                        jArr5 = jArr12;
                                        i = length4;
                                        j6 = j12;
                                        obj5.getClass();
                                        q1 q1Var2 = (q1) obj5;
                                        zG = p0Var5.c(q1Var2) || p0Var4.c(q1Var2);
                                    }
                                    if (zG) {
                                        o0Var2.l(i20);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i = length4;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i19++;
                                length4 = i;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i25 = length4;
                            if (i18 != 8) {
                                break;
                            } else {
                                length4 = i25;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i17 == length4) {
                            break;
                        }
                        i17++;
                        jArr12 = jArr4;
                    }
                }
                p0Var5.b();
                h();
                return;
            }
        }
        if (p0Var4.h()) {
            long[] jArr14 = o0Var2.a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i26 = 0;
                while (true) {
                    long j14 = jArr14[i26];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i27 = 8 - ((~(i26 - length6)) >>> 31);
                        int i28 = 0;
                        while (i28 < i27) {
                            if ((j14 & j2) < j) {
                                int i29 = (i26 << 3) + i28;
                                Object obj6 = o0Var2.b[i29];
                                Object obj7 = o0Var2.c[i29];
                                if (obj7 instanceof androidx.collection.p0) {
                                    androidx.collection.p0 p0Var7 = (androidx.collection.p0) obj7;
                                    Object[] objArr5 = p0Var7.b;
                                    long[] jArr15 = p0Var7.a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i30 = 0;
                                        while (true) {
                                            long j15 = jArr15[i30];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i31 = 8 - ((~(i30 - length7)) >>> 31);
                                                int i32 = 0;
                                                while (i32 < i31) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr14;
                                                        int i33 = (i30 << 3) + i32;
                                                        j5 = j15;
                                                        if (p0Var4.c((q1) objArr6[i33])) {
                                                            p0Var7.m(i33);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j5 = j15;
                                                    }
                                                    i32++;
                                                    jArr14 = jArr3;
                                                    j15 = j5 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i31 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i30 == length7) {
                                                break;
                                            }
                                            i30++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j4 = j14;
                                    }
                                    zC = p0Var7.g();
                                } else {
                                    jArr2 = jArr14;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = p0Var4.c((q1) obj7);
                                }
                                if (zC) {
                                    o0Var2.l(i29);
                                }
                            } else {
                                jArr2 = jArr14;
                                j4 = j14;
                            }
                            i28++;
                            j14 = j4 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i27 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i26 == length6) {
                        break;
                    }
                    i26++;
                    jArr14 = jArr;
                }
            }
            h();
            p0Var4.b();
        }
    }

    public final void d() {
        synchronized (this.A) {
            try {
                e(this.H);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.B.e.g()) {
                        androidx.compose.runtime.internal.l lVar = this.R;
                        try {
                            lVar.g(this.B, this.S.D());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0136 A[EDGE_INSN: B:164:0x0136->B:82:0x0136 BREAK  A[LOOP:2: B:152:0x00e9->B:80:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[Catch: all -> 0x011c, LOOP:2: B:152:0x00e9->B:80:0x012c, LOOP_END, TryCatch #7 {all -> 0x011c, blocks: (B:64:0x00e9, B:66:0x00f8, B:68:0x0102, B:70:0x0108, B:72:0x0118, B:76:0x0121, B:82:0x0136, B:90:0x0158, B:93:0x016b, B:80:0x012c, B:85:0x0140, B:99:0x0189, B:101:0x0195), top: B:152:0x00e9 }] */
    public final void e(androidx.compose.runtime.changelist.a aVar) throws Throwable {
        c cVar;
        androidx.compose.runtime.internal.l lVar;
        androidx.compose.runtime.internal.l lVar2;
        long[] jArr;
        int i;
        long[] jArr2;
        androidx.compose.runtime.internal.l lVar3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        androidx.compose.runtime.changelist.a aVar2 = this.I;
        r rVar = this.S;
        androidx.compose.runtime.tooling.d dVarD = rVar.D();
        androidx.compose.runtime.internal.l lVar4 = this.R;
        lVar4.g(this.B, dVarD);
        try {
            if (aVar.l.H()) {
                try {
                    if (aVar2.l.H() && this.N == null) {
                        lVar4.b();
                    }
                    return;
                } finally {
                    lVar4.a();
                }
            }
            j1 j1Var = this.N;
            if (j1Var == null || (cVar = j1Var.l) == null) {
                cVar = this.y;
            }
            try {
                Trace.beginSection(cVar.equals(j1Var != null ? j1Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    j1 j1Var2 = this.N;
                    if (j1Var2 == null || (lVar = j1Var2.k) == null) {
                        lVar = lVar4;
                    }
                    i2 i2VarE = this.C.e();
                    int i3 = 0;
                    try {
                        aVar.F(cVar, i2VarE, lVar, rVar.D());
                        i2VarE.e(true);
                        cVar.n();
                        Trace.endSection();
                        lVar4.c();
                        lVar4.d();
                        if (this.L) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.L = false;
                                androidx.collection.o0 o0Var = this.D;
                                long[] jArr3 = o0Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = o0Var.b[i8];
                                                    Object obj2 = o0Var.c[i8];
                                                    if (obj2 instanceof androidx.collection.p0) {
                                                        androidx.collection.p0 p0Var = (androidx.collection.p0) obj2;
                                                        Object[] objArr = p0Var.b;
                                                        long[] jArr4 = p0Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        lVar3 = lVar4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((q1) objArr[i13]).a()) {
                                                                                    p0Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = p0Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        lVar3 = lVar4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((q1) obj2).a();
                                                    }
                                                    if (zG) {
                                                        o0Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    lVar3 = lVar4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                lVar4 = lVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            lVar2 = lVar4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            lVar2 = lVar4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        lVar4 = lVar2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    lVar2 = lVar4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            lVar2 = lVar4;
                        }
                        try {
                            if (aVar2.l.H() && this.N == null) {
                                lVar2.b();
                            }
                            return;
                        } finally {
                            lVar2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            i2VarE.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (aVar2.l.H() && this.N == null) {
                lVar4.b();
            }
            throw th;
        } finally {
            lVar4.a();
        }
    }

    public final void f() {
        synchronized (this.A) {
            try {
                if (this.I.l.I()) {
                    e(this.I);
                }
            } catch (Throwable th) {
                try {
                    if (!this.B.e.g()) {
                        androidx.compose.runtime.internal.l lVar = this.R;
                        try {
                            lVar.g(this.B, this.S.D());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.A) {
            try {
                this.S.v = null;
                if (!this.B.e.g()) {
                    androidx.compose.runtime.internal.l lVar = this.R;
                    try {
                        lVar.g(this.B, this.S.D());
                        lVar.b();
                        lVar.a();
                    } catch (Throwable th) {
                        lVar.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.B.e.g()) {
                        androidx.compose.runtime.internal.l lVar2 = this.R;
                        try {
                            lVar2.g(this.B, this.S.D());
                            lVar2.b();
                        } finally {
                            lVar2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void h() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zG;
        int i3;
        long j7;
        androidx.collection.o0 o0Var = this.G;
        long[] jArr3 = o0Var.a;
        int length = jArr3.length - 2;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            long j9 = 128;
            while (true) {
                long j10 = jArr3[i5];
                j2 = 255;
                if ((((~j10) << c3) & j10 & j8) != j8) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j10 & 255) < j9) {
                            c2 = c3;
                            int i8 = (i5 << 3) + i7;
                            j5 = j8;
                            Object obj = o0Var.b[i8];
                            Object obj2 = o0Var.c[i8];
                            boolean z = obj2 instanceof androidx.collection.p0;
                            androidx.collection.o0 o0Var2 = this.D;
                            if (z) {
                                androidx.collection.p0 p0Var = (androidx.collection.p0) obj2;
                                Object[] objArr = p0Var.b;
                                long[] jArr4 = p0Var.a;
                                j6 = j9;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j4 = j10;
                                    int i9 = i4;
                                    int i10 = 0;
                                    while (true) {
                                        long j11 = jArr4[i10];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j11) << c2) & j11 & j5) == j5) {
                                            if (i10 != length2) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        } else {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j11 & 255) < j6) {
                                                    i3 = i12;
                                                    int i13 = (i10 << 3) + i3;
                                                    j7 = j11;
                                                    if (!o0Var2.c((e0) objArr[i13])) {
                                                        p0Var.m(i13);
                                                    }
                                                } else {
                                                    i3 = i12;
                                                    j7 = j11;
                                                }
                                                j11 = j7 >> i9;
                                                i12 = i3 + 1;
                                            }
                                            if (i11 != i9) {
                                                break;
                                            }
                                            if (i10 != length2) {
                                                break;
                                            }
                                            i10++;
                                            jArr3 = jArr2;
                                            length = i;
                                            i9 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    j4 = j10;
                                }
                                zG = p0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                j4 = j10;
                                j6 = j9;
                                obj2.getClass();
                                zG = !o0Var2.c((e0) obj2);
                            }
                            if (zG) {
                                o0Var.l(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            j4 = j10;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i2 = i4;
                        }
                        j10 = j4 >> i2;
                        i7++;
                        i4 = i2;
                        c3 = c2;
                        j8 = j5;
                        j9 = j6;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i14 = length;
                    c = c3;
                    j = j8;
                    j3 = j9;
                    if (i6 != i4) {
                        break;
                    } else {
                        length = i14;
                    }
                } else {
                    jArr = jArr3;
                    c = c3;
                    j = j8;
                    j3 = j9;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                c3 = c;
                j8 = j;
                j9 = j3;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        androidx.collection.p0 p0Var2 = this.F;
        if (!p0Var2.h()) {
            return;
        }
        Object[] objArr2 = p0Var2.b;
        long[] jArr5 = p0Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j12 = jArr5[i15];
            if ((((~j12) << c) & j12 & j) != j) {
                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j12 & j2) < j3) {
                        int i18 = (i15 << 3) + i17;
                        if (!(((q1) objArr2[i18]).g != null)) {
                            p0Var2.m(i18);
                        }
                    }
                    j12 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length3) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.A) {
            z = true;
            if (this.T != 1) {
                z = false;
            }
            if (z) {
                this.T = 0;
            }
        }
        return z;
    }

    public final void j(kotlin.jvm.functions.p pVar) {
        try {
            synchronized (this.A) {
                n();
                androidx.collection.o0 o0Var = this.K;
                this.K = androidx.datastore.preferences.protobuf.h1.g();
                try {
                    r rVar = this.S;
                    androidx.compose.ui.graphics.a aVar = this.M;
                    if (!rVar.e.l.H()) {
                        t.a("Expected applyChanges() to have been called");
                    }
                    rVar.P = aVar;
                    try {
                        rVar.n(o0Var, pVar);
                        rVar.P = null;
                    } catch (Throwable th) {
                        rVar.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.K = o0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.B.e.g()) {
                    androidx.compose.runtime.internal.l lVar = this.R;
                    try {
                        lVar.g(this.B, this.S.D());
                        lVar.b();
                    } finally {
                        lVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final j1 k(boolean z, kotlin.jvm.functions.p pVar) {
        if (this.N != null) {
            n1.b("A pausable composition is in progress");
        }
        j1 j1Var = new j1(this, this.e, this.S, this.B, pVar, z, this.y, this.A);
        this.N = j1Var;
        return j1Var;
    }

    public final void l() {
        synchronized (this.A) {
            try {
                if (this.N != null) {
                    n1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.C.y > 0;
                if (z || !this.B.e.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        androidx.compose.runtime.internal.l lVar = this.R;
                        try {
                            lVar.g(this.B, this.S.D());
                            if (z) {
                                i2 i2VarE = this.C.e();
                                try {
                                    i2VarE.n(i2VarE.t, new androidx.compose.foundation.contextmenu.f(11, this.R, i2VarE));
                                    i2VarE.e(true);
                                    this.y.n();
                                    lVar.c();
                                } catch (Throwable th) {
                                    i2VarE.e(false);
                                    throw th;
                                }
                            }
                            lVar.b();
                            lVar.a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            lVar.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.D.a();
                this.G.a();
                this.K.a();
                this.H.l.F();
                this.I.l.F();
                r rVar = this.S;
                rVar.E.clear();
                rVar.s.clear();
                rVar.e.l.F();
                rVar.v = null;
                this.T = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.A) {
            try {
                if (this.S.F) {
                    n1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.T != 3) {
                    this.T = 3;
                    androidx.compose.runtime.changelist.a aVar = this.S.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z = this.C.y > 0;
                    if (z || !this.B.e.g()) {
                        androidx.compose.runtime.internal.l lVar = this.R;
                        try {
                            lVar.g(this.B, this.S.D());
                            if (z) {
                                i2 i2VarE = this.C.e();
                                try {
                                    i2VarE.n(i2VarE.t, new androidx.compose.animation.core.g0(this.R, 10));
                                    i2VarE.H();
                                    i2VarE.e(true);
                                    this.y.a();
                                    this.y.n();
                                    lVar.c();
                                } catch (Throwable th) {
                                    i2VarE.e(false);
                                    throw th;
                                }
                            }
                            lVar.b();
                            lVar.a();
                        } catch (Throwable th2) {
                            lVar.a();
                            throw th2;
                        }
                    }
                    r rVar = this.S;
                    rVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        rVar.b.u(rVar);
                        rVar.E.clear();
                        rVar.s.clear();
                        rVar.e.l.F();
                        rVar.v = null;
                        rVar.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.e.v(this);
    }

    public final void n() {
        Object obj = s.b;
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                t.b("pending composition has not been applied");
                com.google.gson.b.b();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                t.b("corrupt pendingModifications drain: " + atomicReference);
                com.google.gson.b.b();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.l.a(andSet, s.b)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.N == null) {
                t.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            t.b("corrupt pendingModifications drain: " + atomicReference);
            com.google.gson.b.b();
        }
    }

    public final void p() {
        kotlin.collections.w wVar = kotlin.collections.w.e;
        AtomicReference atomicReference = this.z;
        Object andSet = atomicReference.getAndSet(wVar);
        if (kotlin.jvm.internal.l.a(andSet, s.b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            t.b("corrupt pendingModifications drain: " + atomicReference);
            com.google.gson.b.b();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i = this.T;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            n1.b(str);
        }
        if (this.N == null) {
            return;
        }
        n1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        androidx.collection.r0 r0Var = this.B;
        r rVar = this.S;
        if (arrayList.size() > 0) {
            ((x0) ((kotlin.k) arrayList.get(0)).e).getClass();
            throw null;
        }
        try {
            rVar.getClass();
            try {
                rVar.G(arrayList);
                rVar.i();
            } catch (Throwable th) {
                rVar.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!r0Var.e.g()) {
                    androidx.compose.runtime.internal.l lVar = this.R;
                    try {
                        lVar.g(r0Var, rVar.D());
                        lVar.b();
                    } finally {
                        lVar.a();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
    }

    public final q0 s(q1 q1Var, Object obj) {
        y yVar;
        int i = q1Var.b;
        if ((i & 2) != 0) {
            q1Var.b = i | 4;
        }
        a aVar = q1Var.c;
        if (aVar == null || !aVar.a()) {
            return q0.e;
        }
        if (this.C.f(aVar)) {
            if (q1Var.d == null) {
                return q0.e;
            }
            q0 q0VarU = u(q1Var, aVar, obj);
            if (q0VarU != q0.e) {
                this.Q.k();
            }
            return q0VarU;
        }
        synchronized (this.A) {
            yVar = this.O;
        }
        if (yVar != null) {
            r rVar = yVar.S;
            if (rVar.F && rVar.g0(q1Var, obj)) {
                return q0.A;
            }
        }
        return q0.e;
    }

    public final void t() {
        y yVar;
        synchronized (this.A) {
            try {
                for (Object obj : this.C.z) {
                    q1 q1Var = obj instanceof q1 ? (q1) obj : null;
                    if (q1Var != null && (yVar = q1Var.a) != null) {
                        yVar.s(q1Var, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[Catch: all -> 0x0042, LOOP:0: B:48:0x0089->B:62:0x00ca, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:66:0x00d2->B:67:0x00d7 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d2 A[SYNTHETIC] */
    public final q0 u(q1 q1Var, a aVar, Object obj) {
        synchronized (this.A) {
            try {
                y yVar = this.O;
                y yVar2 = null;
                if (yVar != null) {
                    f2 f2Var = this.C;
                    int i = this.P;
                    if (f2Var.D) {
                        t.a("Writer is active");
                    }
                    if (i < 0 || i >= f2Var.y) {
                        t.a("Invalid group index");
                    }
                    if (f2Var.f(aVar)) {
                        int i2 = f2Var.e[(i * 5) + 3] + i;
                        int i3 = aVar.a;
                        if (i > i3 || i3 >= i2) {
                            yVar = null;
                        }
                    } else {
                        yVar = null;
                    }
                    yVar2 = yVar;
                }
                if (yVar2 == null) {
                    r rVar = this.S;
                    if (!(rVar.F && rVar.g0(q1Var, obj))) {
                        if (obj != null) {
                            boolean z = obj instanceof e0;
                            androidx.collection.o0 o0Var = this.K;
                            if (z) {
                                Object objG = o0Var.g(q1Var);
                                if (objG != null) {
                                    if (!(objG instanceof androidx.collection.p0)) {
                                        if (objG != f.C) {
                                            androidx.datastore.preferences.protobuf.h1.e(this.K, q1Var, obj);
                                            break;
                                        }
                                    } else {
                                        androidx.collection.p0 p0Var = (androidx.collection.p0) objG;
                                        Object[] objArr = p0Var.b;
                                        long[] jArr = p0Var.a;
                                        int length = jArr.length - 2;
                                        if (length < 0) {
                                            androidx.datastore.preferences.protobuf.h1.e(this.K, q1Var, obj);
                                            break;
                                        }
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i4 == length) {
                                                    androidx.datastore.preferences.protobuf.h1.e(this.K, q1Var, obj);
                                                    break;
                                                }
                                                i4++;
                                            } else {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = 0;
                                                while (i7 < i6) {
                                                    if ((j & 255) < 128 && objArr[(i4 << 3) + i7] == f.C) {
                                                        break loop0;
                                                    }
                                                    j >>= i5;
                                                    i7++;
                                                    i5 = i5;
                                                }
                                                if (i6 == i5) {
                                                    if (i4 == length) {
                                                        i4++;
                                                    }
                                                }
                                                androidx.datastore.preferences.protobuf.h1.e(this.K, q1Var, obj);
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    androidx.datastore.preferences.protobuf.h1.e(this.K, q1Var, obj);
                                    break;
                                }
                            } else {
                                o0Var.m(q1Var, f.C);
                            }
                        } else {
                            this.K.m(q1Var, f.C);
                        }
                    } else {
                        return q0.A;
                    }
                }
                if (yVar2 != null) {
                    return yVar2.u(q1Var, aVar, obj);
                }
                this.e.l(this);
                return this.S.F ? q0.z : q0.y;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.D.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof androidx.collection.p0;
        androidx.collection.o0 o0Var = this.J;
        if (!z) {
            q1 q1Var = (q1) objG;
            if (q1Var.b(obj) == q0.A) {
                androidx.datastore.preferences.protobuf.h1.e(o0Var, obj, q1Var);
                return;
            }
            return;
        }
        androidx.collection.p0 p0Var = (androidx.collection.p0) objG;
        Object[] objArr = p0Var.b;
        long[] jArr = p0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        q1 q1Var2 = (q1) objArr[(i << 3) + i3];
                        if (q1Var2.b(obj) == q0.A) {
                            androidx.datastore.preferences.protobuf.h1.e(o0Var, obj, q1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean w(Set set) {
        boolean z = set instanceof androidx.compose.runtime.collection.d;
        androidx.collection.o0 o0Var = this.G;
        androidx.collection.o0 o0Var2 = this.D;
        if (z) {
            androidx.collection.p0 p0Var = ((androidx.compose.runtime.collection.d) set).e;
            Object[] objArr = p0Var.b;
            long[] jArr = p0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (o0Var2.c(obj) || o0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (o0Var2.c(obj2) || o0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.A) {
            j1 j1Var = this.N;
            boolean zI = false;
            if (j1Var != null && (j1Var.h.get() != k1.B || j1Var.i != androidx.compose.runtime.internal.k.b())) {
                AtomicReference atomicReference = j1Var.h;
                k1 k1Var = k1.C;
                k1 k1Var2 = k1.A;
                while (!atomicReference.compareAndSet(k1Var, k1Var2) && atomicReference.get() == k1Var) {
                }
                j1Var.l.e.a(9);
                return false;
            }
            n();
            try {
                androidx.collection.o0 o0Var = this.K;
                this.K = androidx.datastore.preferences.protobuf.h1.g();
                try {
                    r rVar = this.S;
                    androidx.compose.ui.graphics.a aVar = this.M;
                    androidx.compose.runtime.changelist.l0 l0Var = rVar.e.l;
                    if (!l0Var.H()) {
                        t.a("Expected applyChanges() to have been called");
                    }
                    if (o0Var.e > 0 || !rVar.s.isEmpty()) {
                        rVar.P = aVar;
                        try {
                            rVar.n(o0Var, null);
                            rVar.P = null;
                            zI = l0Var.I();
                        } catch (Throwable th) {
                            rVar.P = null;
                            throw th;
                        }
                    }
                    if (!zI) {
                        o();
                    }
                    return zI;
                } catch (Throwable th2) {
                    this.K = o0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.B.e.g()) {
                        androidx.compose.runtime.internal.l lVar = this.R;
                        try {
                            lVar.g(this.B, this.S.D());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(androidx.compose.runtime.collection.d dVar) {
        Object obj;
        while (true) {
            Object obj2 = this.z.get();
            if (obj2 == null || obj2.equals(s.b)) {
                obj = dVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, dVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    androidx.media3.exoplayer.hls.playlist.a.h(this.z, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = dVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.z;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.A) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void z(Object obj) {
        q1 q1VarB;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        r rVar = this.S;
        if (rVar.A <= 0 && (q1VarB = rVar.B()) != null) {
            boolean z4 = true;
            int i2 = q1VarB.b | 1;
            q1VarB.b = i2;
            if ((i2 & 32) == 0) {
                androidx.collection.f0 f0Var = q1VarB.f;
                if (f0Var == null) {
                    f0Var = new androidx.collection.f0();
                    q1VarB.f = f0Var;
                }
                int i3 = q1VarB.e;
                int iC = f0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = f0Var.c[iC];
                }
                f0Var.b[iC] = obj;
                f0Var.c[iC] = i3;
                if (i == q1VarB.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.Q.k();
            if (z) {
                return;
            }
            if (obj instanceof androidx.compose.runtime.snapshots.x) {
                ((androidx.compose.runtime.snapshots.x) obj).f(1);
            }
            androidx.datastore.preferences.protobuf.h1.e(this.D, obj, q1VarB);
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                d0 d0VarH = e0Var.h();
                androidx.collection.o0 o0Var = this.G;
                androidx.datastore.preferences.protobuf.h1.w(o0Var, obj);
                androidx.collection.f0 f0Var2 = d0VarH.e;
                Object[] objArr = f0Var2.b;
                long[] jArr = f0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    androidx.compose.runtime.snapshots.w wVar = (androidx.compose.runtime.snapshots.w) objArr[(i4 << 3) + i7];
                                    if (wVar instanceof androidx.compose.runtime.snapshots.x) {
                                        z3 = true;
                                        ((androidx.compose.runtime.snapshots.x) wVar).f(1);
                                    } else {
                                        z3 = true;
                                    }
                                    androidx.datastore.preferences.protobuf.h1.e(o0Var, wVar, obj);
                                } else {
                                    z3 = z4;
                                }
                                j >>= i5;
                                i7++;
                                z4 = z3;
                                i5 = i5;
                            }
                            z2 = z4;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        z4 = z2;
                    }
                }
                Object obj2 = d0VarH.f;
                androidx.collection.o0 o0Var2 = q1VarB.g;
                if (o0Var2 == null) {
                    o0Var2 = new androidx.collection.o0();
                    q1VarB.g = o0Var2;
                }
                o0Var2.m(e0Var, obj2);
            }
        }
    }
}
