package androidx.media3.ui;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.common.c1;
import androidx.media3.common.f1;
import androidx.media3.common.v0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.media3.common.o0, View.OnClickListener, u, l {
    public final androidx.media3.common.t0 e = new androidx.media3.common.t0();
    public Object y;
    public final /* synthetic */ h0 z;

    public d0(h0 h0Var) {
        this.z = h0Var;
    }

    @Override // androidx.media3.common.o0
    public final void D(int i, int i2) {
        h0 h0Var = this.z;
        View view = h0Var.A;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && h0Var.f0) {
            g0 g0Var = h0Var.C;
            g0Var.getClass();
            int i3 = 4;
            h0Var.L.post(new androidx.compose.foundation.text.contextmenu.internal.g(i3, g0Var, (SurfaceView) view, new androidx.activity.l(h0Var, 29)));
        }
    }

    @Override // androidx.media3.common.o0
    public final void a(f1 f1Var) {
        h0 h0Var;
        androidx.media3.common.q0 q0Var;
        if (f1Var.equals(f1.d) || (q0Var = (h0Var = this.z).P) == null || ((androidx.media3.exoplayer.c0) q0Var).q() == 1) {
            return;
        }
        h0Var.j();
    }

    @Override // androidx.media3.common.o0
    public final void c(int i, androidx.media3.common.p0 p0Var, androidx.media3.common.p0 p0Var2) {
        v vVar;
        h0 h0Var = this.z;
        if (h0Var.d() && h0Var.d0 && (vVar = h0Var.I) != null) {
            vVar.g();
        }
    }

    @Override // androidx.media3.common.o0
    public final void g(int i, boolean z) {
        h0 h0Var = this.z;
        h0Var.k();
        if (!h0Var.d() || !h0Var.d0) {
            h0Var.e(false);
            return;
        }
        v vVar = h0Var.I;
        if (vVar != null) {
            vVar.g();
        }
    }

    @Override // androidx.media3.common.o0
    public final void i(int i) {
        h0 h0Var = this.z;
        h0Var.k();
        h0Var.m();
        if (!h0Var.d() || !h0Var.d0) {
            h0Var.e(false);
            return;
        }
        v vVar = h0Var.I;
        if (vVar != null) {
            vVar.g();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.z.i();
    }

    @Override // androidx.media3.common.o0
    public final void r(androidx.media3.common.text.c cVar) {
        SubtitleView subtitleView = this.z.F;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.a);
        }
    }

    @Override // androidx.media3.common.o0
    public final void t() {
        h0 h0Var = this.z;
        View view = h0Var.z;
        if (view != null) {
            view.setVisibility(4);
            if (!h0Var.b()) {
                h0Var.c();
                return;
            }
            ImageView imageView = h0Var.D;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // androidx.media3.common.o0
    public final void v(c1 c1Var) {
        h0 h0Var = this.z;
        androidx.media3.common.q0 q0Var = h0Var.P;
        q0Var.getClass();
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        v0 v0VarL = c0Var.u(17) ? c0Var.l() : v0.a;
        if (v0VarL.p()) {
            this.y = null;
        } else {
            boolean zU = c0Var.u(30);
            androidx.media3.common.t0 t0Var = this.e;
            if (!zU || c0Var.m().a.isEmpty()) {
                Object obj = this.y;
                if (obj != null) {
                    int iB = v0VarL.b(obj);
                    if (iB != -1) {
                        if (c0Var.h() == v0VarL.f(iB, t0Var, false).c) {
                            return;
                        }
                    }
                    this.y = null;
                }
            } else {
                this.y = v0VarL.f(c0Var.i(), t0Var, true).b;
            }
        }
        h0Var.n(false);
    }
}
