package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ h B;
    public final /* synthetic */ androidx.compose.ui.layout.c1 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.compose.ui.layout.c1 c1Var, long j, long j2, h hVar) {
        super(1);
        this.y = c1Var;
        this.z = j;
        this.A = j2;
        this.B = hVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
        long j = this.z;
        long j2 = this.A;
        b1Var.getClass();
        androidx.compose.ui.layout.c1 c1Var = this.y;
        androidx.compose.ui.layout.b1.b(b1Var, c1Var);
        c1Var.h0(androidx.compose.ui.unit.j.c((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), c1Var.B), 0.0f, this.B);
        return kotlin.y.a;
    }
}
