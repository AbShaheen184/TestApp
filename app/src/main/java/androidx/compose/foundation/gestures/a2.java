package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ f2 y;

    public /* synthetic */ a2(f2 f2Var, int i) {
        this.e = i;
        this.y = f2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(this.y.K);
            default:
                androidx.compose.ui.focus.e0 e0Var = this.y.m0;
                if (!e0Var.e.K) {
                    return null;
                }
                androidx.compose.ui.focus.c0 c0VarQ0 = e0Var.Q0();
                int iOrdinal = c0VarQ0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    coil3.g.a();
                    return null;
                }
                if (c0VarQ0.a()) {
                    return e0Var.O0(null);
                }
                androidx.compose.ui.focus.e0 e0VarF = ((androidx.compose.ui.focus.p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).f();
                if (e0VarF != null) {
                    return e0VarF.O0(androidx.compose.ui.node.k.s(e0Var));
                }
                return null;
        }
    }
}
