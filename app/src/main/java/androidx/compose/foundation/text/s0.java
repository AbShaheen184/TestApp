package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ x0 y;

    public /* synthetic */ s0(x0 x0Var, int i) {
        this.e = i;
        this.y = x0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                this.y.a(((androidx.compose.ui.geometry.b) obj).a, androidx.compose.foundation.text.selection.a0.d);
                break;
            case 1:
                androidx.compose.ui.input.pointer.v vVar = (androidx.compose.ui.input.pointer.v) obj;
                this.y.e(androidx.compose.ui.input.pointer.u.g(vVar, false));
                vVar.a();
                break;
            default:
                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) obj;
                this.y.e(androidx.compose.ui.input.pointer.u.g(vVar2, false));
                vVar2.a();
                break;
        }
        return kotlin.y.a;
    }
}
