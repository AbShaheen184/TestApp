package androidx.compose.ui.graphics.vector;

import androidx.appcompat.widget.c2;
import androidx.compose.runtime.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends androidx.compose.ui.graphics.painter.b {
    public final h1 C = androidx.compose.runtime.s.r(new androidx.compose.ui.geometry.e(0));
    public final h1 D = androidx.compose.runtime.s.r(Boolean.FALSE);
    public final f0 E;
    public final h1 F;
    public float G;
    public androidx.compose.ui.graphics.m H;

    public j0(c cVar) {
        f0 f0Var = new f0(cVar);
        f0Var.f = new androidx.compose.animation.z(this, 2);
        this.E = f0Var;
        this.F = new h1(kotlin.y.a, androidx.compose.runtime.f.A);
        this.G = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.G = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(androidx.compose.ui.graphics.m mVar) {
        this.H = mVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return ((androidx.compose.ui.geometry.e) this.C.getValue()).a;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(androidx.compose.ui.node.h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        androidx.compose.ui.graphics.m mVar = this.H;
        f0 f0Var = this.E;
        if (mVar == null) {
            mVar = (androidx.compose.ui.graphics.m) f0Var.g.getValue();
        }
        if (((Boolean) this.D.getValue()).booleanValue() && h0Var.getLayoutDirection() == androidx.compose.ui.unit.m.y) {
            long jI0 = bVar.i0();
            c2 c2Var = bVar.y;
            long jH = c2Var.H();
            c2Var.w().f();
            try {
                ((com.google.firebase.platforminfo.c) c2Var.y).n(-1.0f, 1.0f, jI0);
                f0Var.e(h0Var, this.G, mVar);
                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
            } catch (Throwable th) {
                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jH);
                throw th;
            }
        } else {
            f0Var.e(h0Var, this.G, mVar);
        }
        this.F.getValue();
    }
}
