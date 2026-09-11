package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ x0 A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ String C;
    public final /* synthetic */ androidx.compose.runtime.internal.f D;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z, androidx.compose.ui.r rVar, x0 x0Var, y0 y0Var, String str, androidx.compose.runtime.internal.f fVar, int i) {
        super(2);
        this.y = z;
        this.z = rVar;
        this.A = x0Var;
        this.B = y0Var;
        this.C = str;
        this.D = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = androidx.compose.runtime.s.A(196657);
        g0.b(this.y, this.z, this.A, this.B, this.C, this.D, (androidx.compose.runtime.r) obj, iA);
        return kotlin.y.a;
    }
}
