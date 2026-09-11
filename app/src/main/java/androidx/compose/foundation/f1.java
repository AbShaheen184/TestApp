package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ g1 y;

    public /* synthetic */ f1(g1 g1Var, int i) {
        this.e = i;
        this.y = g1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.N0();
                return kotlin.y.a;
            case 1:
                return new androidx.compose.ui.geometry.b(this.y.T);
            default:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y.R.getValue();
                return new androidx.compose.ui.geometry.b(xVar != null ? xVar.W(0L) : 9205357640488583168L);
        }
    }
}
