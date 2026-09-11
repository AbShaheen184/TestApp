package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ u y;
    public final /* synthetic */ androidx.compose.ui.layout.c1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, androidx.compose.ui.layout.c1 c1Var, long j) {
        super(1);
        this.y = uVar;
        this.z = c1Var;
        this.A = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.e eVar = this.y.N.b;
        androidx.compose.ui.layout.c1 c1Var = this.z;
        androidx.compose.ui.layout.b1.k((androidx.compose.ui.layout.b1) obj, c1Var, eVar.a((((long) c1Var.y) & 4294967295L) | (((long) c1Var.e) << 32), this.A, androidx.compose.ui.unit.m.e));
        return kotlin.y.a;
    }
}
