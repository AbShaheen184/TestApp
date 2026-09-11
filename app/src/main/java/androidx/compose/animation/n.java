package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ androidx.compose.ui.layout.c1[] y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.ui.layout.c1[] c1VarArr, o oVar, int i, int i2) {
        super(1);
        this.y = c1VarArr;
        this.z = oVar;
        this.A = i;
        this.B = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
        for (androidx.compose.ui.layout.c1 c1Var : this.y) {
            if (c1Var != null) {
                long jA = this.z.a.b.a((((long) c1Var.e) << 32) | (((long) c1Var.y) & 4294967295L), (((long) this.A) << 32) | (((long) this.B) & 4294967295L), androidx.compose.ui.unit.m.e);
                androidx.compose.ui.layout.b1.i(b1Var, c1Var, (int) (jA >> 32), (int) (jA & 4294967295L));
            }
        }
        return kotlin.y.a;
    }
}
