package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    public final l2 a;
    public final androidx.compose.runtime.h1 b = androidx.compose.runtime.s.r(null);
    public final /* synthetic */ e2 c;

    public x1(e2 e2Var, l2 l2Var, String str) {
        this.c = e2Var;
        this.a = l2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w1 a(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        androidx.compose.runtime.h1 h1Var = this.b;
        w1 w1Var = (w1) h1Var.getValue();
        e2 e2Var = this.c;
        if (w1Var == null) {
            Object objInvoke = lVar2.invoke(e2Var.a.n());
            Object objInvoke2 = lVar2.invoke(e2Var.a.n());
            l2 l2Var = this.a;
            s sVar = (s) l2Var.a.invoke(objInvoke2);
            sVar.d();
            a2 a2Var = new a2(e2Var, objInvoke, sVar, l2Var);
            w1Var = new w1(this, a2Var, lVar, lVar2);
            h1Var.setValue(w1Var);
            e2Var.i.add(a2Var);
        }
        w1Var.z = (kotlin.jvm.internal.m) lVar2;
        w1Var.y = lVar;
        w1Var.b(e2Var.f());
        return w1Var;
    }
}
