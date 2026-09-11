package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final d J;
    public static final d K;
    public static final d z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new d(i, 0);
        A = new d(i, 1);
        B = new d(i, 2);
        C = new d(i, 3);
        D = new d(i, 4);
        E = new d(i, 5);
        F = new d(i, 6);
        G = new d(i, 7);
        H = new d(i, 8);
        I = new d(i, 9);
        J = new d(i, 10);
        K = new d(i, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2) {
        super(i);
        this.y = i2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x011b A[LOOP:0: B:71:0x00e4->B:81:0x011b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x011e A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                g gVar = (g) obj;
                f0 f0Var = gVar instanceof f0 ? (f0) gVar : null;
                if (f0Var == null || !f0Var.o0) {
                    return kotlin.y.a;
                }
                com.google.gson.b.m(gVar, "Apply is called on deactivated node ");
                return null;
            case 1:
                q1 q1Var = (q1) obj;
                if (q1Var.p()) {
                    n0 n0Var = q1Var.y;
                    if (!n0Var.H) {
                        kotlin.jvm.functions.l lVarE = q1Var.e.e();
                        androidx.collection.o0 o0Var = n0Var.K;
                        if (lVarE != null) {
                            n0Var.o0(q1Var, 9223372034707292159L, 0L);
                            n0Var.D = lVarE;
                        } else if (o0Var != null) {
                            Object[] objArr = o0Var.c;
                            long[] jArr = o0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j) < 128) {
                                                n0Var.G0((androidx.collection.p0) objArr[(i << 3) + i3]);
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
                            }
                            o0Var.a();
                        }
                    }
                }
                return kotlin.y.a;
            case 2:
                l1 l1Var = ((d1) obj).i0;
                if (l1Var != null) {
                    ((androidx.compose.ui.platform.q1) l1Var).c();
                }
                return kotlin.y.a;
            case 3:
                d1 d1Var = (d1) obj;
                f0 f0Var2 = d1Var.L;
                try {
                    if (d1Var.p()) {
                        d1Var.s1(true);
                        break;
                    }
                    return kotlin.y.a;
                } catch (Throwable th) {
                    f0Var2.Y(th);
                    throw null;
                }
            case 4:
                i1 i1Var = (i1) obj;
                if (i1Var.p()) {
                    i1Var.e.e0();
                }
                return kotlin.y.a;
            case 5:
                f0 f0Var3 = (f0) obj;
                if (f0Var3.H()) {
                    f0Var3.U(false);
                }
                return kotlin.y.a;
            case 6:
                f0 f0Var4 = (f0) obj;
                if (f0Var4.H()) {
                    f0Var4.U(false);
                }
                return kotlin.y.a;
            case 7:
                f0 f0Var5 = (f0) obj;
                if (f0Var5.H()) {
                    f0Var5.S(false);
                }
                return kotlin.y.a;
            case 8:
                f0 f0Var6 = (f0) obj;
                if (f0Var6.H()) {
                    f0Var6.S(false);
                }
                return kotlin.y.a;
            case 9:
                f0 f0Var7 = (f0) obj;
                if (f0Var7.H()) {
                    f0.T(f0Var7, false, 7);
                }
                return kotlin.y.a;
            case 10:
                f0 f0Var8 = (f0) obj;
                if (f0Var8.H()) {
                    f0.V(f0Var8, false, 7);
                }
                return kotlin.y.a;
            default:
                f0 f0Var9 = (f0) obj;
                if (f0Var9.H()) {
                    f0Var9.F();
                }
                return kotlin.y.a;
        }
    }
}
