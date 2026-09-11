package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e, g {
    public final /* synthetic */ int a;
    public final float b;

    public d(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 0;
                break;
            case 2:
                this.b = 0;
                break;
            case 3:
                this.b = 0;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    @Override // androidx.compose.foundation.layout.e, androidx.compose.foundation.layout.g
    public final float a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // androidx.compose.foundation.layout.g
    public final void b(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                h.a(i, iArr, iArr2, false);
                break;
            case 1:
                h.d(i, iArr, iArr2, false);
                break;
            case 2:
                h.e(i, iArr, iArr2, false);
                break;
            default:
                h.f(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // androidx.compose.foundation.layout.e
    public final void c(androidx.compose.ui.unit.c cVar, int i, int[] iArr, androidx.compose.ui.unit.m mVar, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.a(i, iArr, iArr2, true);
                } else {
                    h.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.d(i, iArr, iArr2, true);
                } else {
                    h.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.e(i, iArr, iArr2, true);
                } else {
                    h.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != androidx.compose.ui.unit.m.e) {
                    h.f(i, iArr, iArr2, true);
                } else {
                    h.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
