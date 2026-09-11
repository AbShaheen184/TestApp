package androidx.compose.foundation.gestures;

import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements l1, androidx.compose.ui.unit.c {
    public final Mutex A = MutexKt.Mutex(false);
    public final /* synthetic */ androidx.compose.ui.unit.c e;
    public boolean y;
    public boolean z;

    public o1(androidx.compose.ui.unit.c cVar) {
        this.e = cVar;
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
        return this.e.O(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.e.T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float V(float f) {
        return this.e.V(f);
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.e.a();
    }

    public final void b() {
        this.y = true;
        Mutex mutex = this.A;
        if (mutex.isLocked()) {
            Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(kotlin.coroutines.jvm.internal.c cVar) {
        m1 m1Var;
        if (cVar instanceof m1) {
            m1Var = (m1) cVar;
            int i = m1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1Var.z = i - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(this, cVar);
            }
        } else {
            m1Var = new m1(this, cVar);
        }
        Object obj = m1Var.e;
        int i2 = m1Var.z;
        if (i2 == 0) {
            kotlin.a.e(obj);
            m1Var.z = 1;
            Object objLock$default = Mutex.DefaultImpls.lock$default(this.A, null, m1Var, 1, null);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objLock$default == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        this.y = false;
        this.z = false;
        return kotlin.y.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(kotlin.coroutines.jvm.internal.c cVar) {
        n1 n1Var;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i = n1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1Var.z = i - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object obj = n1Var.e;
        int i2 = n1Var.z;
        Mutex mutex = this.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            if (!this.y && !this.z) {
                n1Var.z = 1;
                Object objLock$default = Mutex.DefaultImpls.lock$default(mutex, null, n1Var, 1, null);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objLock$default == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.y);
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
        return Boolean.valueOf(this.y);
    }

    @Override // androidx.compose.ui.unit.c
    public final int g0(float f) {
        return this.e.g0(f);
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

    @Override // androidx.compose.ui.unit.c
    public final float s0(long j) {
        return this.e.s0(j);
    }

    @Override // androidx.compose.ui.unit.c
    public final float t(long j) {
        return this.e.t(j);
    }
}
