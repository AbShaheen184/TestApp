package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ x0 y;

    public /* synthetic */ t0(x0 x0Var, int i) {
        this.e = i;
        this.y = x0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.b();
                break;
            default:
                this.y.onCancel();
                break;
        }
        return kotlin.y.a;
    }
}
