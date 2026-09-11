package coil3.compose;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.node.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.compose.ui.graphics.painter.b {
    public final coil3.k C;

    public q(coil3.k kVar) {
        this.C = kVar;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        coil3.k kVar = this.C;
        int iB = kVar.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = kVar.a();
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        coil3.k kVar = this.C;
        int iB = kVar.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (bVar.d() >> 32)) / iB : 1.0f;
        int iA = kVar.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / iA : 1.0f;
        c2 c2Var = bVar.y;
        long jH = c2Var.H();
        c2Var.w().f();
        try {
            ((com.google.firebase.platforminfo.c) c2Var.y).n(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            kVar.d(androidx.compose.ui.graphics.d.a(bVar.y.w()));
        } finally {
            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
        }
    }
}
