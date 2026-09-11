package androidx.compose.ui.node;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends androidx.compose.ui.layout.c1 implements androidx.compose.ui.layout.s0, x0 {
    public k0 C;
    public kotlin.jvm.functions.l D;
    public q1 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final androidx.compose.ui.layout.n0 I = new androidx.compose.ui.layout.n0(this, 0);
    public androidx.appcompat.widget.o J;
    public androidx.collection.o0 K;

    public static void F0(d1 d1Var) {
        g0 g0Var;
        d1 d1Var2 = d1Var.M;
        f0 f0Var = d1Var.L;
        if (!kotlin.jvm.internal.l.a(d1Var2 != null ? d1Var2.L : null, f0Var)) {
            f0Var.e0.p.T.f();
            return;
        }
        a aVarK = f0Var.e0.p.k();
        if (aVarK == null || (g0Var = ((v0) aVarK).T) == null) {
            return;
        }
        g0Var.f();
    }

    public abstract f0 A0();

    public abstract androidx.compose.ui.layout.r0 B0();

    public abstract n0 C0();

    public abstract long D0();

    public final k0 E0() {
        k0 k0Var = this.C;
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(this);
        this.C = k0Var2;
        return k0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(androidx.collection.p0 p0Var) {
        f0 f0Var;
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
                    if ((255 & j) < 128 && (f0Var = (f0) ((b2) objArr[(i << 3) + i3]).get()) != null) {
                        if (U()) {
                            f0Var.S(false);
                        } else {
                            f0Var.U(false);
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

    public abstract void H0();

    @Override // androidx.compose.ui.node.x0
    public final void N(boolean z) {
        n0 n0VarC0 = C0();
        f0 f0VarA0 = n0VarC0 != null ? n0VarC0.A0() : null;
        if (kotlin.jvm.internal.l.a(f0VarA0, A0())) {
            this.F = z;
            return;
        }
        if ((f0VarA0 != null ? f0VarA0.e0.d : null) != b0.z) {
            if ((f0VarA0 != null ? f0VarA0.e0.d : null) != b0.A) {
                return;
            }
        }
        this.F = z;
    }

    @Override // androidx.compose.ui.layout.s
    public boolean U() {
        return false;
    }

    @Override // androidx.compose.ui.layout.s0
    public final androidx.compose.ui.layout.r0 f0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            androidx.compose.ui.internal.a.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new m0(i, i2, map, lVar, lVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(f0 f0Var, androidx.compose.ui.layout.p pVar) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        androidx.collection.o0 o0Var = this.K;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (o0Var != null) {
            Object[] objArr = o0Var.c;
            long[] jArr3 = o0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                androidx.collection.p0 p0Var = (androidx.collection.p0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = p0Var.b;
                                long[] jArr4 = p0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    f0 f0Var2 = (f0) ((b2) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (f0Var2 != null) {
                                                        boolean zH = f0Var2.H();
                                                        i4 = i8;
                                                        if (zH) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    p0Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        androidx.collection.o0 o0Var2 = this.K;
        if (o0Var2 != null) {
            long[] jArr5 = o0Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((androidx.collection.p0) o0Var2.c[i18]).g()) {
                                    o0Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        androidx.collection.o0 o0Var3 = this.K;
        if (o0Var3 == null) {
            o0Var3 = new androidx.collection.o0();
            this.K = o0Var3;
        }
        Object objG = o0Var3.g(pVar);
        if (objG == null) {
            objG = new androidx.collection.p0();
            o0Var3.m(pVar, objG);
        }
        ((androidx.collection.p0) objG).k(new b2(f0Var));
    }

    public abstract int n0(androidx.compose.ui.layout.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(q1 q1Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        f0 f0Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        o1 snapshotObserver;
        androidx.collection.o0 o0Var = this.K;
        androidx.appcompat.widget.o oVar = this.J;
        if (oVar == null) {
            oVar = new androidx.appcompat.widget.o();
            this.J = oVar;
        }
        androidx.appcompat.widget.o oVar2 = oVar;
        m1 m1Var = A0().L;
        if (m1Var != null && (snapshotObserver = ((androidx.compose.ui.platform.u) m1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(q1Var, d.A, new l0(this, j, j2, q1Var));
        }
        boolean zU = U();
        androidx.collection.p0 p0Var = (androidx.collection.p0) oVar2.e;
        androidx.collection.p0 p0Var2 = (androidx.collection.p0) oVar2.f;
        int i2 = oVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) oVar2.d)[i3];
            if (b == 3) {
                androidx.compose.ui.layout.p pVar = ((androidx.compose.ui.layout.p[]) oVar2.b)[i3];
                pVar.getClass();
                p0Var2.k(pVar);
            } else if (b != 0 && o0Var != null) {
                androidx.compose.ui.layout.p pVar2 = ((androidx.compose.ui.layout.p[]) oVar2.b)[i3];
                pVar2.getClass();
                androidx.collection.p0 p0Var3 = (androidx.collection.p0) o0Var.k(pVar2);
                if (p0Var3 != null) {
                    p0Var.j(p0Var3);
                }
            }
        }
        int i4 = oVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) oVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                androidx.compose.ui.layout.p[] pVarArr = (androidx.compose.ui.layout.p[]) oVar2.b;
                pVarArr[i6 - i5] = pVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = oVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((androidx.compose.ui.layout.p[]) oVar2.b)[i8] = null;
        }
        oVar2.a -= i5;
        n0 n0VarC0 = C0();
        Object[] objArr = p0Var2.b;
        long[] jArr = p0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            androidx.compose.ui.layout.p pVar3 = (androidx.compose.ui.layout.p) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            n0 n0Var = n0VarC0 == null ? this : n0VarC0;
                            i = i9;
                            n0 n0Var2 = n0Var;
                            while (true) {
                                androidx.appcompat.widget.o oVar3 = n0Var2.J;
                                if (oVar3 != null) {
                                    z2 = zU;
                                    if (kotlin.collections.n.A(pVar3, (androidx.compose.ui.layout.p[]) oVar3.b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zU;
                                n0 n0VarC1 = n0Var2.C0();
                                if (n0VarC1 == null) {
                                    break;
                                }
                                n0Var2 = n0VarC1;
                                zU = z2;
                            }
                            androidx.collection.o0 o0Var2 = n0Var2.K;
                            androidx.collection.p0 p0Var4 = o0Var2 != null ? (androidx.collection.p0) o0Var2.k(pVar3) : null;
                            if (p0Var4 != null) {
                                n0Var.G0(p0Var4);
                            }
                        } else {
                            z2 = zU;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zU = z2;
                    }
                    z = zU;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zU;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zU = z;
                i9 = 8;
            }
        } else {
            z = zU;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        p0Var2.b();
        Object[] objArr2 = p0Var.b;
        long[] jArr2 = p0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (f0Var = (f0) ((b2) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                f0Var.S(false);
                            } else {
                                f0Var.U(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        p0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0056 A[EDGE_INSN: B:48:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    public final void t0(androidx.compose.ui.layout.r0 r0Var) {
        long j;
        long j2;
        androidx.collection.o0 o0Var = this.K;
        if (!this.H) {
            kotlin.jvm.functions.l lVarE = r0Var.e();
            if (lVarE != null) {
                boolean z = this.D != lVarE;
                if (z || !E0().e) {
                    j = 0;
                    j2 = 9223372034707292159L;
                } else {
                    androidx.compose.ui.layout.x xVarW0 = w0();
                    long jI = android.support.v4.media.session.b.I(xVarW0.E(0L));
                    long jU = xVarW0.u();
                    j2 = jI;
                    j = jU;
                    z = (androidx.compose.ui.unit.j.a(jI, E0().y) && androidx.compose.ui.unit.l.a(jU, E0().z)) ? false : true;
                }
                if (z) {
                    q1 q1Var = this.E;
                    if (q1Var != null) {
                        q1Var.e = r0Var;
                    } else {
                        q1Var = new q1(r0Var, this);
                        this.E = q1Var;
                    }
                    o0(q1Var, j2, j);
                    this.D = r0Var.e();
                }
            } else if (o0Var != null) {
                Object[] objArr = o0Var.c;
                long[] jArr = o0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j3 = jArr[i];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j3) < 128) {
                                    G0((androidx.collection.p0) objArr[(i << 3) + i3]);
                                }
                                j3 >>= 8;
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
                o0Var.a();
            }
        }
    }

    public final int u0(androidx.compose.ui.layout.a aVar) {
        int iN0;
        if (!z0() || (iN0 = n0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = aVar instanceof androidx.compose.ui.layout.n1;
        long j = this.B;
        return iN0 + ((int) (z ? j >> 32 : j & 4294967295L));
    }

    public abstract n0 v0();

    public abstract androidx.compose.ui.layout.x w0();

    public abstract boolean z0();
}
