package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ int z;

    public /* synthetic */ n(androidx.compose.ui.r rVar, int i) {
        this.y = rVar;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p.a(this.y, rVar, androidx.compose.runtime.s.A(this.z | 1));
                break;
            default:
                androidx.compose.foundation.text.d.b(this.y, rVar, androidx.compose.runtime.s.A(1), this.z);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ n(androidx.compose.ui.r rVar, int i, int i2) {
        this.y = rVar;
        this.z = i2;
    }
}
