package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ long A;
    public final /* synthetic */ q1 B;
    public final /* synthetic */ n0 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, long j, long j2, q1 q1Var) {
        super(0);
        this.y = n0Var;
        this.z = j;
        this.A = j2;
        this.B = q1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        n0 n0Var = this.y;
        n0Var.E0().e = false;
        n0Var.E0().y = this.z;
        n0Var.E0().z = this.A;
        kotlin.jvm.functions.l lVarE = this.B.e.e();
        if (lVarE != null) {
            lVarE.invoke(n0Var.E0());
        }
        return kotlin.y.a;
    }
}
