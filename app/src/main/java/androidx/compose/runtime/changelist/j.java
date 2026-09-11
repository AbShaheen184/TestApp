package androidx.compose.runtime.changelist;

import androidx.compose.runtime.i2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {
    public static final j c = new j(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int i;
        androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) wVar.e(0);
        int iC = i2Var.c((androidx.compose.runtime.a) wVar.e(1));
        if (i2Var.t >= iC) {
            androidx.compose.runtime.t.a("Check failed");
        }
        android.support.v4.media.session.b.B(i2Var, cVar, iC);
        int i2 = i2Var.t;
        int iE = i2Var.v;
        while (iE >= 0 && !i2Var.y(iE)) {
            iE = i2Var.E(iE, i2Var.b);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (i2Var.v(i2, iU)) {
                if (i2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += i2Var.y(iU) ? 1 : i2Var.b[(i2Var.r(iU) * 5) + 1] & 67108863;
                iU += i2Var.u(iU);
            }
        }
        while (true) {
            i = i2Var.t;
            if (i >= iC) {
                break;
            }
            if (i2Var.v(iC, i)) {
                int i3 = i2Var.t;
                if (i3 < i2Var.u && (i2Var.b[(i2Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(i2Var.D(i2Var.t));
                    iL = 0;
                }
                i2Var.P();
            } else {
                iL += i2Var.L();
            }
        }
        if (i != iC) {
            androidx.compose.runtime.t.a("Check failed");
        }
        gVar.a = iL;
    }
}
