package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ androidx.compose.ui.unit.k A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ kotlin.jvm.internal.y y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.y yVar, z zVar, androidx.compose.ui.unit.k kVar, long j, long j2) {
        super(0);
        this.y = yVar;
        this.z = zVar;
        this.A = kVar;
        this.B = j;
        this.C = j2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        z zVar = this.z;
        this.y.e = zVar.getPositionProvider().a(this.A, this.B, zVar.getParentLayoutDirection(), this.C);
        return kotlin.y.a;
    }
}
