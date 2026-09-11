package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends a {
    public final androidx.media3.datasource.g h;
    public final androidx.activity.y i;
    public final androidx.media3.exoplayer.drm.f j;
    public final t2 k;
    public final int l = 1048576;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public boolean q;
    public androidx.media3.exoplayer.upstream.f r;
    public androidx.media3.common.c0 s;

    public q0(androidx.media3.common.c0 c0Var, androidx.media3.common.util.b bVar, androidx.activity.y yVar, androidx.media3.exoplayer.drm.f fVar, t2 t2Var) {
        this.s = c0Var;
        this.h = bVar;
        this.i = yVar;
        this.j = fVar;
        this.k = t2Var;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final u b(v vVar, c2 c2Var, long j) {
        androidx.media3.datasource.h hVarF = this.h.f();
        androidx.media3.exoplayer.upstream.f fVar = this.r;
        if (fVar != null) {
            hVarF.c(fVar);
        }
        androidx.media3.common.y yVar = h().b;
        yVar.getClass();
        Uri uri = yVar.a;
        this.g.getClass();
        return new o0(uri, hVarF, new c2((androidx.media3.extractor.q) this.i.y), this.j, new androidx.media3.exoplayer.drm.d(this.d.c, 0, vVar), this.k, a(vVar), this, c2Var, this.l, androidx.media3.common.util.j0.Q(yVar.e), null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized androidx.media3.common.c0 h() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.r = fVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        androidx.media3.exoplayer.drm.f fVar2 = this.j;
        fVar2.d(looperMyLooper, kVar);
        fVar2.b();
        t();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(u uVar) {
        o0 o0Var = (o0) uVar;
        if (o0Var.T) {
            for (v0 v0Var : o0Var.Q) {
                v0Var.k();
                androidx.media3.exoplayer.dash.manifest.t tVar = v0Var.h;
                if (tVar != null) {
                    tVar.O(v0Var.e);
                    v0Var.h = null;
                    v0Var.g = null;
                }
            }
        }
        o0Var.H.e(o0Var);
        o0Var.M.removeCallbacksAndMessages(null);
        o0Var.N = null;
        o0Var.m0 = true;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
        this.j.c();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized void s(androidx.media3.common.c0 c0Var) {
        this.s = c0Var;
    }

    public final void t() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        androidx.media3.common.c0 c0VarH = h();
        androidx.media3.common.v0 a1Var = new a1(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, c0VarH, z2 ? c0VarH.c : null);
        if (this.m) {
            a1Var = new p0(a1Var);
        }
        m(a1Var);
    }

    public final void u(long j, androidx.media3.extractor.a0 a0Var, boolean z) {
        if (this.q && a0Var.d()) {
            return;
        }
        this.q = !a0Var.d();
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        boolean zC = a0Var.c();
        if (!this.m && this.n == j && this.o == zC && this.p == z) {
            return;
        }
        this.n = j;
        this.o = zC;
        this.p = z;
        this.m = false;
        t();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void j() {
    }
}
