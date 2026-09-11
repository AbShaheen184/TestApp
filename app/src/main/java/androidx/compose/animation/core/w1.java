package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements androidx.compose.runtime.t2 {
    public final /* synthetic */ x1 A;
    public final a2 e;
    public kotlin.jvm.functions.l y;
    public kotlin.jvm.internal.m z;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(x1 x1Var, a2 a2Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        this.A = x1Var;
        this.e = a2Var;
        this.y = lVar;
        this.z = (kotlin.jvm.internal.m) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public final void b(y1 y1Var) {
        Object objInvoke = this.z.invoke(y1Var.c());
        boolean zG = this.A.c.g();
        a2 a2Var = this.e;
        if (zG) {
            a2Var.g(this.z.invoke(y1Var.b()), objInvoke, (b0) this.y.invoke(y1Var));
        } else {
            a2Var.h(objInvoke, (b0) this.y.invoke(y1Var));
        }
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        b(this.A.c.f());
        return this.e.G.getValue();
    }
}
