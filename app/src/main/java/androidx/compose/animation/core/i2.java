package androidx.compose.animation.core;

import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {
    public static final n1 a = new n1(1);
    public static final Object b = kotlin.a.c(kotlin.i.y, new androidx.activity.compose.b(5));

    public static final void a(e2 e2Var, a2 a2Var, Object obj, Object obj2, b0 b0Var, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(867041821);
        if ((i & 6) == 0) {
            i2 = (rVar.f(e2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(a2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? rVar.f(obj) : rVar.h(obj) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? rVar.f(obj2) : rVar.h(obj2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? rVar.f(b0Var) : rVar.h(b0Var) ? 16384 : 8192;
        }
        if (!rVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            rVar.W();
        } else if (e2Var.g()) {
            a2Var.g(obj, obj2, b0Var);
        } else {
            a2Var.h(obj2, b0Var);
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g2(e2Var, a2Var, obj, obj2, b0Var, i, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public static final x1 b(e2 e2Var, l2 l2Var, String str, androidx.compose.runtime.r rVar, int i, int i2) {
        w1 w1Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = rVar.f(e2Var);
        Object objQ = rVar.Q();
        Object obj = androidx.compose.runtime.m.a;
        if (zF || objQ == obj) {
            objQ = new x1(e2Var, l2Var, str);
            rVar.l0(objQ);
        }
        x1 x1Var = (x1) objQ;
        boolean zF2 = rVar.f(e2Var) | rVar.h(x1Var);
        Object objQ2 = rVar.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new androidx.activity.compose.h(6, e2Var, x1Var);
            rVar.l0(objQ2);
        }
        androidx.compose.runtime.j0.b(x1Var, (kotlin.jvm.functions.l) objQ2, rVar);
        if (e2Var.g() && (w1Var = (w1) x1Var.b.getValue()) != null) {
            e2 e2Var2 = x1Var.c;
            w1Var.e.g(w1Var.z.invoke(e2Var2.f().b()), w1Var.z.invoke(e2Var2.f().c()), (b0) w1Var.y.invoke(e2Var2.f()));
        }
        return x1Var;
    }

    public static final a2 c(e2 e2Var, Object obj, Object obj2, b0 b0Var, l2 l2Var, androidx.compose.runtime.r rVar, int i) {
        boolean zF = rVar.f(e2Var);
        Object objQ = rVar.Q();
        Object obj3 = androidx.compose.runtime.m.a;
        if (zF || objQ == obj3) {
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                s sVar = (s) l2Var.a.invoke(obj2);
                sVar.d();
                objQ = new a2(e2Var, obj, sVar, l2Var);
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                rVar.l0(objQ);
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        }
        a2 a2Var = (a2) objQ;
        a(e2Var, a2Var, obj, obj2, b0Var, rVar, 0);
        boolean zF2 = rVar.f(e2Var) | rVar.f(a2Var);
        Object objQ2 = rVar.Q();
        if (zF2 || objQ2 == obj3) {
            objQ2 = new androidx.activity.compose.h(4, e2Var, a2Var);
            rVar.l0(objQ2);
        }
        androidx.compose.runtime.j0.b(a2Var, (kotlin.jvm.functions.l) objQ2, rVar);
        return a2Var;
    }

    public static final e2 d(j2 j2Var, String str, androidx.compose.runtime.r rVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && rVar.f(j2Var)) || (i & 6) == 4;
        Object objQ = rVar.Q();
        Object obj = androidx.compose.runtime.m.a;
        kotlin.coroutines.d dVar = null;
        if (z2 || objQ == obj) {
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                Object e2Var = new e2(j2Var, null, str);
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                rVar.l0(e2Var);
                objQ = e2Var;
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        }
        e2 e2Var2 = (e2) objQ;
        if (j2Var instanceof h1) {
            rVar.b0(-1357607479);
            h1 h1Var = (h1) j2Var;
            Object value = h1Var.z.getValue();
            Object value2 = h1Var.y.getValue();
            if ((i2 <= 4 || !rVar.f(j2Var)) && (i & 6) != 4) {
                z = false;
            }
            Object objQ2 = rVar.Q();
            if (z || objQ2 == obj) {
                objQ2 = new androidx.compose.animation.b0(j2Var, dVar, 1);
                rVar.l0(objQ2);
            }
            androidx.compose.runtime.j0.d(value, value2, (kotlin.jvm.functions.p) objQ2, rVar);
            rVar.p(false);
        } else {
            rVar.b0(-1357145920);
            e2Var2.a(j2Var.p(), rVar, 0);
            rVar.p(false);
        }
        boolean zF = rVar.f(e2Var2);
        Object objQ3 = rVar.Q();
        if (zF || objQ3 == obj) {
            objQ3 = new f2(e2Var2, 1);
            rVar.l0(objQ3);
        }
        androidx.compose.runtime.j0.b(e2Var2, (kotlin.jvm.functions.l) objQ3, rVar);
        return e2Var2;
    }

    public static final e2 e(Object obj, String str, androidx.compose.runtime.r rVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objQ = rVar.Q();
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        if (objQ == fVar) {
            objQ = new e2(new p0(obj), null, str);
            rVar.l0(objQ);
        }
        e2 e2Var = (e2) objQ;
        e2Var.a(obj, rVar, (i & 8) | 48 | (i & 14));
        Object objQ2 = rVar.Q();
        if (objQ2 == fVar) {
            objQ2 = new f2(e2Var, 0);
            rVar.l0(objQ2);
        }
        androidx.compose.runtime.j0.b(e2Var, (kotlin.jvm.functions.l) objQ2, rVar);
        return e2Var;
    }
}
