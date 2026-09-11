package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.p2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.compose.ui.unit.c, kotlin.coroutines.d {
    public n A = n.y;
    public final kotlin.coroutines.j B = kotlin.coroutines.j.e;
    public final /* synthetic */ l0 C;
    public final /* synthetic */ l0 e;
    public final CancellableContinuationImpl y;
    public CancellableContinuationImpl z;

    public k0(l0 l0Var, CancellableContinuationImpl cancellableContinuationImpl) {
        this.C = l0Var;
        this.e = l0Var;
        this.y = cancellableContinuationImpl;
    }

    @Override // androidx.compose.ui.unit.c
    public final long G(float f) {
        return this.e.G(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float L(int i) {
        return this.e.L(i);
    }

    @Override // androidx.compose.ui.unit.c
    public final float O(float f) {
        return f / this.e.a();
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float V(float f) {
        return this.e.a() * f;
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    public final Object b(n nVar, kotlin.coroutines.jvm.internal.a aVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(aVar), 1);
        cancellableContinuationImpl.initCancellability();
        this.A = nVar;
        this.z = cancellableContinuationImpl;
        return cancellableContinuationImpl.getResult();
    }

    public final long c() {
        l0 l0Var = this.C;
        long jK0 = l0Var.k0(androidx.compose.ui.node.k.t(l0Var).Y.d());
        long j = l0Var.U;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final p2 f() {
        return androidx.compose.ui.node.k.t(this.C).Y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.p] */
    public final Object g(long j, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        i0 i0Var;
        CancellableContinuationImpl cancellableContinuationImpl;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.A = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objInvoke = i0Var.y;
        int i2 = i0Var.A;
        try {
            if (i2 == 0) {
                kotlin.a.e(objInvoke);
                if (j <= 0 && (cancellableContinuationImpl = this.z) != null) {
                    cancellableContinuationImpl.resumeWith(new kotlin.l(new o(j)));
                }
                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.C.z0(), null, null, new androidx.compose.foundation.text.selection.l0(j, this, null), 3, null);
                i0Var.e = jobLaunch$default;
                i0Var.A = 1;
                objInvoke = pVar.invoke(this, i0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                j = jobLaunch$default;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Job job = i0Var.e;
                kotlin.a.e(objInvoke);
                j = job;
            }
            j.cancel(b.y);
            return objInvoke;
        } catch (Throwable th) {
            j.cancel(b.y);
            throw th;
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final int g0(float f) {
        return this.e.g0(f);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.i getContext() {
        return this.B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.a aVar) {
        j0 j0Var;
        if (aVar instanceof j0) {
            j0Var = (j0) aVar;
            int i = j0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.z = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, aVar);
            }
        } else {
            j0Var = new j0(this, aVar);
        }
        Object obj = j0Var.e;
        int i2 = j0Var.z;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    kotlin.a.e(obj);
                    return obj;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            j0Var.z = 1;
            Object objG = g(j, pVar, j0Var);
            Object obj2 = kotlin.coroutines.intrinsics.a.e;
            return objG == obj2 ? obj2 : objG;
        } catch (o unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final long k0(long j) {
        return this.e.k0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final long n(float f) {
        return this.e.n(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final long o(long j) {
        return this.e.o(j);
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        l0 l0Var = this.C;
        synchronized (l0Var.R) {
            l0Var.Q.j(this);
        }
        this.y.resumeWith(obj);
    }

    @Override // androidx.compose.ui.unit.c
    public final float s0(long j) {
        return this.e.s0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }
}
