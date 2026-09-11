package androidx.compose.foundation;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends androidx.compose.ui.node.j implements androidx.compose.ui.node.u1, androidx.compose.ui.node.n, androidx.compose.ui.node.h, androidx.compose.ui.node.h1, androidx.compose.ui.node.z1 {
    public static final b T = new b();
    public androidx.compose.foundation.interaction.k N;
    public final kotlin.jvm.functions.l O;
    public androidx.compose.foundation.interaction.d P;
    public androidx.compose.foundation.lazy.layout.h0 Q;
    public androidx.compose.ui.node.d1 R;
    public final androidx.compose.ui.focus.e0 S;

    public t0(androidx.compose.foundation.interaction.k kVar, int i, c cVar) {
        this.N = kVar;
        this.O = cVar;
        androidx.compose.ui.focus.e0 e0Var = new androidx.compose.ui.focus.e0(i, new s0(2, this, t0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 10);
        L0(e0Var);
        this.S = e0Var;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        androidx.compose.foundation.lazy.layout.h0 h0Var = this.Q;
        if (h0Var != null) {
            h0Var.b();
        }
        this.Q = null;
    }

    public final void O0(androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.interaction.j jVar) {
        if (!this.K) {
            kVar.a.tryEmit(jVar);
            return;
        }
        Job job = (Job) z0().getCoroutineContext().get(Job.Key);
        BuildersKt__Builders_commonKt.launch$default(z0(), null, null, new androidx.compose.animation.b0(kVar, jVar, job != null ? job.invokeOnCompletion(new androidx.activity.compose.h(10, kVar, jVar)) : null, (kotlin.coroutines.d) null, 3), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void P0() {
        androidx.compose.ui.node.a1 a1Var;
        if (this.K) {
            if (!this.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar = this.e.B;
            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(this);
            while (f0VarT != null) {
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & 262144) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof androidx.compose.ui.node.z1) {
                                    if (u0.L.equals(((androidx.compose.ui.node.z1) E).i())) {
                                        return;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (androidx.compose.ui.node.w1) a1Var.f;
            }
        }
    }

    public final void Q0(androidx.compose.foundation.interaction.k kVar) {
        androidx.compose.foundation.interaction.d dVar;
        if (kotlin.jvm.internal.l.a(this.N, kVar)) {
            return;
        }
        androidx.compose.foundation.interaction.k kVar2 = this.N;
        if (kVar2 != null && (dVar = this.P) != null) {
            kVar2.b(new androidx.compose.foundation.interaction.e(dVar));
        }
        this.P = null;
        this.N = kVar;
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.compose.ui.node.k.p(this, new androidx.activity.compose.f(4, zVar, this));
        androidx.compose.foundation.lazy.layout.h0 h0Var = (androidx.compose.foundation.lazy.layout.h0) zVar.e;
        if (this.S.Q0().a()) {
            androidx.compose.foundation.lazy.layout.h0 h0Var2 = this.Q;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.Q = h0Var;
        }
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return T;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        boolean zA = this.S.Q0().a();
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.k;
        kotlin.reflect.j jVar = androidx.compose.ui.semantics.v.a[4];
        xVar.b(wVar, Boolean.valueOf(zA));
        xVar.b(androidx.compose.ui.semantics.k.w, new androidx.compose.ui.semantics.a(null, new r0(0, this, t0.class, "requestFocus", "requestFocus()Z", 0, 0)));
    }

    @Override // androidx.compose.ui.node.n
    public final void u0(androidx.compose.ui.node.d1 d1Var) {
        this.R = d1Var;
        if (this.S.Q0().a()) {
            if (!d1Var.T0().K) {
                P0();
                return;
            }
            androidx.compose.ui.node.d1 d1Var2 = this.R;
            if (d1Var2 == null || !d1Var2.T0().K) {
                return;
            }
            P0();
        }
    }
}
