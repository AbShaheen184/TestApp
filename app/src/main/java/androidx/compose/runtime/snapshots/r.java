package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.layout.s0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final boolean b(v vVar, int i, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = vVar.d;
                if (i2 == i) {
                    vVar.c = cVar;
                    z2 = true;
                    if (z) {
                        vVar.e++;
                    }
                    vVar.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int c(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static f e() {
        return (f) n.b.v();
    }

    public static final v f(q qVar) {
        v vVar = qVar.e;
        vVar.getClass();
        return (v) n.t(vVar, qVar);
    }

    public static final int g(q qVar) {
        v vVar = qVar.e;
        vVar.getClass();
        return ((v) n.h(vVar)).e;
    }

    public static f h(f fVar) {
        if (fVar instanceof b0) {
            b0 b0Var = (b0) fVar;
            if (b0Var.t == androidx.compose.runtime.internal.k.b()) {
                b0Var.r = null;
                return fVar;
            }
        }
        if (fVar instanceof c0) {
            c0 c0Var = (c0) fVar;
            if (c0Var.i == androidx.compose.runtime.internal.k.b()) {
                c0Var.h = null;
                return fVar;
            }
        }
        f fVarG = n.g(fVar, null, false);
        fVarG.j();
        return fVarG;
    }

    public static final boolean i(q qVar, kotlin.jvm.functions.l lVar) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        Object objInvoke;
        f fVarJ;
        boolean zB;
        do {
            synchronized (a) {
                v vVar = qVar.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarF = cVar.f();
            objInvoke = lVar.invoke(gVarF);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarD = gVarF.d();
            if (kotlin.jvm.internal.l.a(cVarD, cVar)) {
                break;
            }
            v vVar3 = qVar.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = b((v) n.w(vVar3, qVar, fVarJ), i, cVarD, true);
            }
            n.n(fVarJ, qVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object j(s0 s0Var, kotlin.jvm.functions.a aVar) {
        f b0Var;
        f fVar = (f) n.b.v();
        if (fVar instanceof b0) {
            b0 b0Var2 = (b0) fVar;
            if (b0Var2.t == androidx.compose.runtime.internal.k.b()) {
                kotlin.jvm.functions.l lVar = b0Var2.r;
                kotlin.jvm.functions.l lVar2 = b0Var2.s;
                try {
                    ((b0) fVar).r = n.k(s0Var, lVar, true);
                    ((b0) fVar).s = lVar2;
                    return aVar.invoke();
                } finally {
                    b0Var2.r = lVar;
                    b0Var2.s = lVar2;
                }
            }
        }
        if (fVar == null || (fVar instanceof b)) {
            b0Var = new b0(fVar instanceof b ? (b) fVar : null, s0Var, null, true, false);
        } else {
            b0Var = fVar.u(s0Var);
        }
        try {
            f fVarJ = b0Var.j();
            try {
                Object objInvoke = aVar.invoke();
                f.q(fVarJ);
                b0Var.c();
                return objInvoke;
            } catch (Throwable th) {
                f.q(fVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            b0Var.c();
            throw th2;
        }
    }

    public static void k(f fVar, f fVar2, kotlin.jvm.functions.l lVar) {
        if (fVar != fVar2) {
            fVar2.getClass();
            f.q(fVar);
            fVar2.c();
        } else if (fVar instanceof b0) {
            ((b0) fVar).r = lVar;
        } else if (fVar instanceof c0) {
            ((c0) fVar).h = lVar;
        } else {
            com.google.gson.b.u(fVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
