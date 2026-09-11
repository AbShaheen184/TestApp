package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caverock.androidsvg.e
    public final boolean a(x0 x0Var) {
        switch (this.a) {
            case 0:
                return !(x0Var instanceof v0) || ((v0) x0Var).getChildren().size() == 0;
            case 1:
                return x0Var.b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
