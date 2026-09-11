package androidx.compose.foundation.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(androidx.compose.foundation.text.selection.m mVar, androidx.compose.ui.r rVar, long j, int i) {
        this.z = mVar;
        this.A = rVar;
        this.y = j;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.s.A(1);
                d.a((androidx.compose.foundation.text.selection.m) this.z, (androidx.compose.ui.r) this.A, this.y, (androidx.compose.runtime.r) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.s.A(7);
                com.app.mlounge.ui.components.b0.l((String) this.z, this.y, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, iA2);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b(String str, long j, kotlin.jvm.functions.a aVar, int i) {
        this.z = str;
        this.y = j;
        this.A = aVar;
    }
}
