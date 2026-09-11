package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ w A;
    public final /* synthetic */ androidx.compose.ui.unit.m B;
    public final /* synthetic */ x y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, kotlin.jvm.functions.a aVar, w wVar, androidx.compose.ui.unit.m mVar) {
        super(0);
        this.y = xVar;
        this.z = aVar;
        this.A = wVar;
        this.B = mVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        this.y.e(this.z, this.A, this.B);
        return kotlin.y.a;
    }
}
