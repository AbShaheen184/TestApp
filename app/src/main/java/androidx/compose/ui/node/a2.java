package androidx.compose.ui.node;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements androidx.compose.runtime.c {
    public final Object e;
    public final ArrayList y = new ArrayList();
    public Object z;

    public a2(f0 f0Var) {
        this.e = f0Var;
        this.z = f0Var;
    }

    public final void a() {
        this.y.clear();
        this.z = this.e;
        ((f0) this.e).P();
    }

    @Override // androidx.compose.runtime.c
    public final void c(int i, Object obj) {
        ((f0) this.z).B(i, (f0) obj);
    }

    @Override // androidx.compose.runtime.c
    public final void d(Object obj) {
        this.y.add(this.z);
        this.z = obj;
    }

    @Override // androidx.compose.runtime.c
    public final void e() {
        androidx.compose.ui.spatial.b rectManager;
        androidx.compose.ui.autofill.d dVar;
        androidx.compose.ui.spatial.b rectManager2;
        f0 f0Var = (f0) this.z;
        a1 a1Var = f0Var.d0;
        if (!f0Var.H()) {
            androidx.compose.ui.internal.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.v vVar = f0Var.M;
        if (vVar != null) {
            View view = vVar.y;
            if (view.getParent() != vVar) {
                vVar.addView(view);
            } else {
                vVar.C.invoke();
            }
        }
        androidx.compose.ui.layout.m0 m0Var = f0Var.f0;
        if (m0Var != null) {
            m0Var.h(false);
        }
        f0Var.R = false;
        if (f0Var.o0) {
            f0Var.o0 = false;
        } else {
            androidx.compose.ui.q qVar = (w1) f0Var.d0.f;
            for (androidx.compose.ui.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.B) {
                if (qVar2.K) {
                    qVar2.G0();
                }
            }
            for (androidx.compose.ui.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.B) {
                if (qVar3.K) {
                    qVar3.I0();
                }
            }
            while (qVar != null) {
                if (qVar.K) {
                    qVar.C0();
                }
                qVar = qVar.B;
            }
        }
        int i = f0Var.y;
        m1 m1Var = f0Var.L;
        if (m1Var != null && (rectManager2 = ((androidx.compose.ui.platform.u) m1Var).getRectManager()) != null) {
            rectManager2.h(f0Var);
        }
        f0Var.y = androidx.compose.ui.semantics.n.a.addAndGet(1);
        m1 m1Var2 = f0Var.L;
        if (m1Var2 != null) {
            androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) m1Var2;
            uVar.getLayoutNodes().g(i);
            uVar.getLayoutNodes().h(f0Var.y, f0Var);
        }
        for (androidx.compose.ui.q qVar4 = (androidx.compose.ui.q) a1Var.g; qVar4 != null; qVar4 = qVar4.C) {
            qVar4.B0();
        }
        a1Var.g();
        if (a1Var.f(8)) {
            f0Var.F();
        }
        f0.W(f0Var);
        m1 m1Var3 = f0Var.L;
        if (m1Var3 != null) {
            androidx.compose.ui.platform.u uVar2 = (androidx.compose.ui.platform.u) m1Var3;
            if (androidx.compose.ui.platform.u.f() && (dVar = uVar2.l0) != null) {
                androidx.compose.ui.platform.u uVar3 = dVar.z;
                androidx.compose.ui.autofill.r rVar = dVar.e;
                androidx.collection.a0 a0Var = dVar.E;
                if (a0Var.e(i)) {
                    rVar.h(uVar3, i, false);
                }
                androidx.compose.ui.semantics.l lVarX = f0Var.x();
                if (lVarX != null && lVarX.e.b(androidx.compose.ui.semantics.t.q)) {
                    a0Var.a(f0Var.y);
                    rVar.h(uVar3, f0Var.y, true);
                }
            }
        }
        m1 m1Var4 = f0Var.L;
        if (m1Var4 == null || (rectManager = ((androidx.compose.ui.platform.u) m1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.f(f0Var, true);
    }

    @Override // androidx.compose.runtime.c
    public final void f(int i, int i2, int i3) {
        ((f0) this.z).L(i, i2, i3);
    }

    @Override // androidx.compose.runtime.c
    public final void g(int i, int i2) {
        ((f0) this.z).Q(i, i2);
    }

    @Override // androidx.compose.runtime.c
    public final void k() {
        ArrayList arrayList = this.y;
        this.z = arrayList.remove(arrayList.size() - 1);
    }

    @Override // androidx.compose.runtime.c
    public final /* bridge */ /* synthetic */ void m(int i, Object obj) {
    }

    @Override // androidx.compose.runtime.c
    public final void n() {
        m1 m1Var = ((f0) this.e).L;
        if (m1Var != null) {
            ((androidx.compose.ui.platform.u) m1Var).y();
        }
    }

    @Override // androidx.compose.runtime.c
    public final Object o() {
        return this.z;
    }
}
