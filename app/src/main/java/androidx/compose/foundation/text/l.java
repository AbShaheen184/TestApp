package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.foundation.text.selection.c1 y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public /* synthetic */ l(androidx.compose.foundation.text.selection.c1 c1Var, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.e = i2;
        this.y = c1Var;
        this.z = fVar;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                n0.b(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
            default:
                n0.c(this.y, this.z, rVar, androidx.compose.runtime.s.A(this.A | 1));
                break;
        }
        return kotlin.y.a;
    }
}
