package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final /* synthetic */ int a = 1;

    @Override // androidx.compose.foundation.layout.g
    public final void b(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                h.c(i, iArr, iArr2, false);
                break;
            default:
                h.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
