package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ d1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, int i) {
        super(0);
        this.y = i;
        this.z = d1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                d1 d1Var = this.z;
                androidx.compose.ui.graphics.r rVar = d1Var.e0;
                rVar.getClass();
                d1Var.N0(rVar, d1Var.d0);
                break;
            default:
                d1 d1Var2 = this.z.N;
                if (d1Var2 != null) {
                    d1Var2.a1();
                }
                break;
        }
        return kotlin.y.a;
    }
}
