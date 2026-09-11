package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.layout.c1 y;

    public /* synthetic */ j(androidx.compose.ui.layout.c1 c1Var, int i) {
        this.e = i;
        this.y = c1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
            case 1:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
            case 2:
                androidx.compose.ui.unit.m mVarF = b1Var.f();
                androidx.compose.ui.unit.m mVar = androidx.compose.ui.unit.m.e;
                androidx.compose.ui.layout.c1 c1Var = this.y;
                if (mVarF == mVar || b1Var.g() == 0) {
                    androidx.compose.ui.layout.b1.b(b1Var, c1Var);
                    c1Var.h0(androidx.compose.ui.unit.j.c(0L, c1Var.B), 0.0f, null);
                } else {
                    int i = (int) 0;
                    long jG = ((long) ((b1Var.g() - c1Var.e) - i)) << 32;
                    androidx.compose.ui.layout.b1.b(b1Var, c1Var);
                    c1Var.h0(androidx.compose.ui.unit.j.c((((long) i) & 4294967295L) | jG, c1Var.B), 0.0f, null);
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
            case 4:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
            case 5:
                androidx.compose.ui.layout.b1.i(b1Var, this.y, 0, 0);
                break;
            case 6:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
            case 7:
                androidx.compose.ui.layout.b1.i(b1Var, this.y, 0, 0);
                break;
            case 8:
                androidx.compose.ui.layout.b1.i(b1Var, this.y, 0, 0);
                break;
            case 9:
                androidx.compose.ui.layout.b1.i(b1Var, this.y, 0, 0);
                break;
            default:
                androidx.compose.ui.layout.b1.l(b1Var, this.y, 0, 0);
                break;
        }
        return kotlin.y.a;
    }
}
