package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ d0 A;
    public final /* synthetic */ androidx.compose.runtime.internal.f B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ c0 y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c0 c0Var, kotlin.jvm.functions.a aVar, d0 d0Var, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        super(2);
        this.y = c0Var;
        this.z = aVar;
        this.A = d0Var;
        this.B = fVar;
        this.C = i;
        this.D = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.a(this.y, this.z, this.A, this.B, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(this.C | 1), this.D);
        return kotlin.y.a;
    }
}
