package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final /* synthetic */ int a;

    @Override // androidx.compose.foundation.layout.e
    public final void c(androidx.compose.ui.unit.c cVar, int i, int[] iArr, androidx.compose.ui.unit.m mVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                h.b(iArr, iArr2, false);
                break;
            case 1:
                h.c(i, iArr, iArr2, false);
                break;
            case 2:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.b(iArr, iArr2, true);
                } else {
                    h.c(i, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.c(i, iArr, iArr2, true);
                } else {
                    h.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
