package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends j2 {
    public static final o O = new o(0.0f);
    public static final o P = new o(1.0f);
    public Object A;
    public e2 B;
    public long C;
    public final androidx.activity.w D;
    public final androidx.compose.runtime.d1 E;
    public CancellableContinuationImpl F;
    public final Mutex G;
    public final u0 H;
    public long I;
    public final androidx.collection.j0 J;
    public y0 K;
    public final x0 L;
    public float M;
    public final x0 N;
    public final androidx.compose.runtime.h1 y;
    public final androidx.compose.runtime.h1 z;

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.animation.core.x0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.animation.core.x0] */
    public h1(androidx.navigation.i iVar) {
        super(0);
        this.y = androidx.compose.runtime.s.r(iVar);
        this.z = androidx.compose.runtime.s.r(iVar);
        this.A = iVar;
        this.D = new androidx.activity.w(this, 2);
        this.E = new androidx.compose.runtime.d1(0.0f);
        this.G = MutexKt.Mutex$default(false, 1, null);
        this.H = new u0();
        this.I = Long.MIN_VALUE;
        this.J = new androidx.collection.j0();
        final int i = 0;
        this.L = new kotlin.jvm.functions.l(this) { // from class: androidx.compose.animation.core.x0
            public final /* synthetic */ h1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i) {
                    case 0:
                        this.y.I = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        h1 h1Var = this.y;
                        long j = jLongValue - h1Var.I;
                        h1Var.I = jLongValue;
                        long jG = kotlin.math.a.G(j / ((double) h1Var.M));
                        androidx.collection.j0 j0Var = h1Var.J;
                        if (j0Var.i()) {
                            Object[] objArr = j0Var.a;
                            int i2 = j0Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                y0 y0Var = (y0) objArr[i4];
                                h1.C(y0Var, jG);
                                y0Var.c = true;
                            }
                            e2 e2Var = h1Var.B;
                            if (e2Var != null) {
                                e2Var.o();
                            }
                            int i5 = j0Var.b;
                            Object[] objArr2 = j0Var.a;
                            kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i5);
                            int i6 = dVarR.e;
                            int i7 = dVarR.y;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((y0) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            kotlin.collections.n.K(i5 - i3, i5, null, objArr2);
                            j0Var.b -= i3;
                        }
                        y0 y0Var2 = h1Var.K;
                        if (y0Var2 != null) {
                            y0Var2.g = h1Var.C;
                            h1.C(y0Var2, jG);
                            h1Var.F(y0Var2.d);
                            if (y0Var2.d == 1.0f) {
                                h1Var.K = null;
                            }
                            h1Var.E();
                        }
                        break;
                }
                return kotlin.y.a;
            }
        };
        final int i2 = 1;
        this.N = new kotlin.jvm.functions.l(this) { // from class: androidx.compose.animation.core.x0
            public final /* synthetic */ h1 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                Long l = (Long) obj;
                switch (i2) {
                    case 0:
                        this.y.I = l.longValue();
                        break;
                    default:
                        long jLongValue = l.longValue();
                        h1 h1Var = this.y;
                        long j = jLongValue - h1Var.I;
                        h1Var.I = jLongValue;
                        long jG = kotlin.math.a.G(j / ((double) h1Var.M));
                        androidx.collection.j0 j0Var = h1Var.J;
                        if (j0Var.i()) {
                            Object[] objArr = j0Var.a;
                            int i3 = j0Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                y0 y0Var = (y0) objArr[i5];
                                h1.C(y0Var, jG);
                                y0Var.c = true;
                            }
                            e2 e2Var = h1Var.B;
                            if (e2Var != null) {
                                e2Var.o();
                            }
                            int i6 = j0Var.b;
                            Object[] objArr2 = j0Var.a;
                            kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i6);
                            int i7 = dVarR.e;
                            int i8 = dVarR.y;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((y0) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            kotlin.collections.n.K(i6 - i4, i6, null, objArr2);
                            j0Var.b -= i4;
                        }
                        y0 y0Var2 = h1Var.K;
                        if (y0Var2 != null) {
                            y0Var2.g = h1Var.C;
                            h1.C(y0Var2, jG);
                            h1Var.F(y0Var2.d);
                            if (y0Var2.d == 1.0f) {
                                h1Var.K = null;
                            }
                            h1Var.E();
                        }
                        break;
                }
                return kotlin.y.a;
            }
        };
    }

    public static void C(y0 y0Var, long j) {
        long j2 = y0Var.a + j;
        y0Var.a = j2;
        long j3 = y0Var.h;
        if (j2 >= j3) {
            y0Var.d = 1.0f;
            return;
        }
        p2 p2Var = y0Var.b;
        o oVar = y0Var.e;
        if (p2Var == null) {
            float f = j2 / j3;
            y0Var.d = (f * 1.0f) + ((1 - f) * oVar.a(0));
            return;
        }
        o oVar2 = y0Var.f;
        if (oVar2 == null) {
            oVar2 = O;
        }
        y0Var.d = com.google.android.material.resources.c.b(((o) p2Var.t(j2, oVar, P, oVar2)).a(0), 0.0f, 1.0f);
    }

    public static final void w(h1 h1Var) {
        androidx.compose.runtime.d1 d1Var = h1Var.E;
        e2 e2Var = h1Var.B;
        if (e2Var == null) {
            return;
        }
        y0 y0Var = h1Var.K;
        if (y0Var == null) {
            if (h1Var.C <= 0 || d1Var.g() == 1.0f || kotlin.jvm.internal.l.a(h1Var.z.getValue(), h1Var.y.getValue())) {
                y0Var = null;
            } else {
                y0Var = new y0();
                y0Var.d = d1Var.g();
                long j = h1Var.C;
                y0Var.g = j;
                y0Var.h = kotlin.math.a.G((1.0d - ((double) d1Var.g())) * j);
                y0Var.e.e(0, d1Var.g());
            }
        }
        if (y0Var != null) {
            y0Var.g = h1Var.C;
            h1Var.J.a(y0Var);
            e2Var.m(y0Var);
        }
        h1Var.K = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x(h1 h1Var, kotlin.coroutines.jvm.internal.c cVar) {
        b1 b1Var;
        androidx.collection.j0 j0Var = h1Var.J;
        if (cVar instanceof b1) {
            b1Var = (b1) cVar;
            int i = b1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                b1Var.z = i - Integer.MIN_VALUE;
            } else {
                b1Var = new b1(h1Var, cVar);
            }
        } else {
            b1Var = new b1(h1Var, cVar);
        }
        Object obj = b1Var.e;
        int i2 = b1Var.z;
        kotlin.y yVar = kotlin.y.a;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (j0Var.h() && h1Var.K == null) {
                return yVar;
            }
            if (e.j(b1Var.getContext()) == 0.0f) {
                h1Var.B();
                h1Var.I = Long.MIN_VALUE;
                return yVar;
            }
            if (h1Var.I == Long.MIN_VALUE) {
                x0 x0Var = h1Var.L;
                b1Var.z = 1;
                if (androidx.compose.runtime.s.o(b1Var.getContext()).a(b1Var, x0Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        do {
            if (!j0Var.i() && h1Var.K == null) {
                h1Var.I = Long.MIN_VALUE;
                return yVar;
            }
            b1Var.z = 2;
        } while (h1Var.A(b1Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object y(h1 h1Var, kotlin.coroutines.jvm.internal.c cVar) {
        f1 f1Var;
        Object value;
        Object obj;
        Mutex mutex = h1Var.G;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i = f1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1Var.A = i - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(h1Var, cVar);
            }
        } else {
            f1Var = new f1(h1Var, cVar);
        }
        Object obj2 = f1Var.y;
        int i2 = f1Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            value = h1Var.y.getValue();
            f1Var.e = value;
            f1Var.A = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, f1Var, 1, null) != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            Object obj3 = f1Var.e;
            kotlin.a.e(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = f1Var.e;
            kotlin.a.e(obj2);
        }
        if (kotlin.jvm.internal.l.a(obj2, obj)) {
            return kotlin.y.a;
        }
        h1Var.I = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        f1Var.e = value;
        f1Var.A = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(f1Var), 1);
        cancellableContinuationImpl.initCancellability();
        h1Var.F = cancellableContinuationImpl;
        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result != aVar) {
            obj = value;
            obj2 = result;
            if (kotlin.jvm.internal.l.a(obj2, obj)) {
                return kotlin.y.a;
            }
            h1Var.I = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0085, please report this as an issue */
    public static final Object z(h1 h1Var, kotlin.coroutines.jvm.internal.c cVar) {
        g1 g1Var;
        Object value;
        Object obj;
        Mutex mutex = h1Var.G;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i = g1Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                g1Var.A = i - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(h1Var, cVar);
            }
        } else {
            g1Var = new g1(h1Var, cVar);
        }
        Object obj2 = g1Var.y;
        int i2 = g1Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            value = h1Var.y.getValue();
            g1Var.e = value;
            g1Var.A = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, g1Var, 1, null) != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            Object obj3 = g1Var.e;
            kotlin.a.e(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = g1Var.e;
            kotlin.a.e(obj2);
        }
        if (!kotlin.jvm.internal.l.a(obj2, obj)) {
            h1Var.I = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return kotlin.y.a;
        if (!kotlin.jvm.internal.l.a(value, h1Var.A)) {
            g1Var.e = value;
            g1Var.A = 2;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(g1Var), 1);
            cancellableContinuationImpl.initCancellability();
            h1Var.F = cancellableContinuationImpl;
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            Object result = cancellableContinuationImpl.getResult();
            if (result != aVar) {
                obj = value;
                obj2 = result;
                if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                    h1Var.I = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        return kotlin.y.a;
    }

    public final Object A(kotlin.coroutines.jvm.internal.c cVar) {
        float fJ = e.j(cVar.getContext());
        kotlin.y yVar = kotlin.y.a;
        if (fJ <= 0.0f) {
            B();
            return yVar;
        }
        this.M = fJ;
        Object objA = androidx.compose.runtime.s.o(cVar.getContext()).a(cVar, this.N);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : yVar;
    }

    public final void B() {
        e2 e2Var = this.B;
        if (e2Var != null) {
            e2Var.c();
        }
        this.J.d();
        if (this.K != null) {
            this.K = null;
            F(1.0f);
            E();
        }
    }

    public final Object D(float f, Object obj, kotlin.coroutines.jvm.internal.i iVar) {
        if (0.0f > f || f > 1.0f) {
            v0.a("Expecting fraction between 0 and 1. Got " + f);
        }
        e2 e2Var = this.B;
        if (e2Var != null) {
            Object objA = u0.a(this.H, new e1(obj, this.y.getValue(), this, e2Var, f, null), iVar);
            if (objA == kotlin.coroutines.intrinsics.a.e) {
                return objA;
            }
        }
        return kotlin.y.a;
    }

    public final void E() {
        e2 e2Var = this.B;
        if (e2Var == null) {
            return;
        }
        e2Var.l(kotlin.math.a.G(((double) this.E.g()) * ((Number) e2Var.l.getValue()).longValue()));
    }

    public final void F(float f) {
        this.E.h(f);
    }

    @Override // androidx.compose.animation.core.j2
    public final Object n() {
        return this.z.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final Object p() {
        return this.y.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final void s(Object obj) {
        this.z.setValue(obj);
    }

    @Override // androidx.compose.animation.core.j2
    public final void t(e2 e2Var) {
        e2 e2Var2 = this.B;
        if (e2Var2 != null && !e2Var.equals(e2Var2)) {
            v0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.B + ", new instance: " + e2Var);
        }
        this.B = e2Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.h] */
    @Override // androidx.compose.animation.core.j2
    public final void u() {
        this.B = null;
        ((androidx.compose.runtime.snapshots.t) i2.b.getValue()).b(this);
    }
}
