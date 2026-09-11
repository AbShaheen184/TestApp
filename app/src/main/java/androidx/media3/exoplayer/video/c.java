package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.f1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h0 {
    public final w a;
    public final x b;
    public final c0 c;
    public final ArrayDeque d;
    public Surface e;
    public androidx.media3.common.r f;
    public long g;
    public f0 h;
    public Executor i;
    public u j;

    public c(w wVar, x xVar, androidx.media3.common.util.e0 e0Var) {
        this.a = wVar;
        this.b = xVar;
        wVar.l = e0Var;
        this.c = new c0(new androidx.media3.common.util.b(this), wVar, xVar);
        this.d = new ArrayDeque();
        this.f = new androidx.media3.common.r(new androidx.media3.common.q());
        this.g = -9223372036854775807L;
        this.h = f0.a;
        this.i = new androidx.arch.core.executor.a(1);
        this.j = new a();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean a() {
        c0 c0Var = this.c;
        long j = c0Var.j;
        return j != -9223372036854775807L && c0Var.i == j;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final Surface b() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean c(long j, h hVar) {
        this.d.add(hVar);
        c0 c0Var = this.c;
        androidx.compose.ui.text.input.h hVar2 = c0Var.f;
        int i = hVar2.A;
        long[] jArr = (long[]) hVar2.C;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                org.mozilla.javascript.c.a();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = hVar2.y;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) hVar2.C, 0, jArr2, i3, i2);
            hVar2.y = 0;
            hVar2.z = hVar2.A - 1;
            hVar2.C = jArr2;
            hVar2.B = length - 1;
        }
        int i4 = (hVar2.z + 1) & hVar2.B;
        hVar2.z = i4;
        ((long[]) hVar2.C)[i4] = j;
        hVar2.A++;
        c0Var.h = j;
        c0Var.j = -9223372036854775807L;
        this.i.execute(new androidx.activity.l(this, 23));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void d(Surface surface, androidx.media3.common.util.x xVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void e() {
        this.b.b();
        w wVar = this.a;
        wVar.d = false;
        wVar.i = -9223372036854775807L;
        b0 b0Var = wVar.b;
        b0Var.d = false;
        y yVar = b0Var.c;
        if (yVar != null) {
            yVar.b();
        }
        b0Var.a();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void f(g gVar) {
        this.h = gVar;
        this.i = com.google.common.util.concurrent.d0.e;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void g() {
        this.b.b();
        this.a.d();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void h(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void i(u uVar) {
        this.j = uVar;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void j() {
        c0 c0Var = this.c;
        if (c0Var.h == -9223372036854775807L) {
            c0Var.h = Long.MIN_VALUE;
            c0Var.i = Long.MIN_VALUE;
        }
        c0Var.j = c0Var.h;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void k(int i) {
        b0 b0Var = this.a.b;
        if (b0Var.j == i) {
            return;
        }
        b0Var.j = i;
        b0Var.d(true);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void l(float f) {
        this.a.h(f);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void m() {
        this.e = null;
        this.a.g(null);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void n(androidx.media3.common.r rVar, long j, int i, List list) {
        com.google.android.material.motion.a.q(list.isEmpty());
        int i2 = rVar.v;
        int i3 = rVar.w;
        androidx.media3.common.r rVar2 = this.f;
        int i4 = rVar2.v;
        c0 c0Var = this.c;
        if (i2 != i4 || i3 != rVar2.w) {
            androidx.compose.ui.text.android.selection.e eVar = c0Var.d;
            long j2 = c0Var.h;
            eVar.f(j2 == -9223372036854775807L ? 0L : j2 + 1, new f1(i2, i3));
        }
        float f = rVar.z;
        if (f != this.f.z) {
            this.a.f(f);
        }
        this.f = rVar;
        if (j != this.g) {
            if (c0Var.f.A == 0) {
                c0Var.b.e(i);
                c0Var.l = j;
            } else {
                androidx.compose.ui.text.android.selection.e eVar2 = c0Var.e;
                long j3 = c0Var.h;
                eVar2.f(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void o(boolean z) {
        if (z) {
            w wVar = this.a;
            wVar.b.b();
            wVar.h = -9223372036854775807L;
            wVar.f = -9223372036854775807L;
            wVar.e = Math.min(wVar.e, 1);
            wVar.i = -9223372036854775807L;
            wVar.n = false;
        }
        this.b.b();
        c0 c0Var = this.c;
        androidx.compose.ui.text.android.selection.e eVar = c0Var.d;
        androidx.compose.ui.text.input.h hVar = c0Var.f;
        hVar.y = 0;
        hVar.z = -1;
        hVar.A = 0;
        c0Var.h = -9223372036854775807L;
        c0Var.i = -9223372036854775807L;
        c0Var.j = -9223372036854775807L;
        androidx.compose.ui.text.android.selection.e eVar2 = c0Var.e;
        if (eVar2.P() > 0) {
            com.google.android.material.motion.a.f(eVar2.P() > 0);
            while (eVar2.P() > 1) {
                eVar2.J();
            }
            Object objJ = eVar2.J();
            objJ.getClass();
            c0Var.l = ((Long) objJ).longValue();
        }
        if (eVar.P() > 0) {
            com.google.android.material.motion.a.f(eVar.P() > 0);
            while (eVar.P() > 1) {
                eVar.J();
            }
            Object objJ2 = eVar.J();
            objJ2.getClass();
            eVar.f(0L, (f1) objJ2);
        }
        this.d.clear();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void q(long j, long j2) throws g0 {
        try {
            this.c.a(j, j2);
        } catch (androidx.media3.exoplayer.j e) {
            throw new g0(e, this.f);
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean u(androidx.media3.common.r rVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void v() {
        w wVar = this.a;
        if (wVar.e == 0) {
            wVar.e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void release() {
    }
}
