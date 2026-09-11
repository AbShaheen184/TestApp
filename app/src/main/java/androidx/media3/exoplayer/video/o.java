package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.util.j0;
import com.google.common.collect.a1;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h0 {
    public com.google.common.collect.h0 a;
    public androidx.media3.common.r b;
    public long c;
    public long d;
    public int e;
    public final /* synthetic */ s f;

    public o(s sVar, Context context) {
        this.f = sVar;
        j0.N(context);
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        this.a = a1.B;
        this.d = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final Surface b() {
        com.google.android.material.motion.a.q(false);
        throw null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean c(long j, h hVar) {
        int i;
        com.google.android.material.motion.a.q(false);
        long j2 = j + this.c;
        s sVar = this.f;
        x xVar = sVar.i;
        long j3 = xVar.a;
        long j4 = j3 == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - j3) * xVar.c) + xVar.b);
        if (j4 != -9223372036854775807L) {
            long j5 = sVar.h;
            if (j5 != -9223372036854775807L && j4 < j5 && (i = this.e) < 2) {
                this.e = i + 1;
                k kVar = hVar.c;
                androidx.media3.exoplayer.mediacodec.l lVar = hVar.a;
                int i2 = hVar.b;
                Trace.beginSection("dropVideoBuffer");
                lVar.g(i2);
                Trace.endSection();
                kVar.S0(0, 1);
                return true;
            }
        }
        int i3 = sVar.q;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void d(Surface surface, androidx.media3.common.util.x xVar) {
        s sVar = this.f;
        Pair pair = sVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((androidx.media3.common.util.x) sVar.l.second).equals(xVar)) {
            return;
        }
        sVar.l = Pair.create(surface, xVar);
        int i = xVar.a;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void e() {
        s sVar = this.f;
        if (sVar.d) {
            sVar.e.e();
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void g() {
        s sVar = this.f;
        if (sVar.d) {
            sVar.e.g();
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void h(long j) {
        this.c = j;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void i(u uVar) {
        this.f.e.j = uVar;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean isInitialized() {
        return false;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void j() {
        long j = this.d;
        s sVar = this.f;
        if (sVar.o >= j) {
            sVar.e.j();
            sVar.p = true;
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void k(int i) {
        this.f.e.k(i);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void l(float f) {
        s sVar = this.f;
        sVar.i.c(f);
        sVar.e.l(f);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void m() {
        int i = androidx.media3.common.util.x.c.a;
        this.f.l = null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void n(androidx.media3.common.r rVar, long j, int i, List list) {
        com.google.android.material.motion.a.q(false);
        this.a = com.google.common.collect.h0.o(list);
        this.b = rVar;
        this.f.p = false;
        androidx.media3.common.q qVarA = rVar.a();
        androidx.media3.common.h hVar = rVar.E;
        if (hVar == null || !hVar.d()) {
            hVar = androidx.media3.common.h.h;
        }
        qVarA.D = hVar;
        qVarA.a();
        throw null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void o(boolean z) {
        androidx.compose.ui.text.android.selection.e eVar;
        this.d = -9223372036854775807L;
        s sVar = this.f;
        c cVar = sVar.e;
        if (sVar.n == 1) {
            sVar.m++;
            cVar.o(z);
            while (true) {
                int iP = sVar.j.P();
                eVar = sVar.j;
                if (iP <= 1) {
                    break;
                } else {
                    eVar.J();
                }
            }
            if (eVar.P() == 1) {
                ((r) sVar.j.J()).getClass();
                throw null;
            }
            sVar.o = -9223372036854775807L;
            if (z) {
                sVar.p = false;
            }
            androidx.media3.common.util.g0 g0Var = sVar.k;
            g0Var.getClass();
            g0Var.d(new androidx.activity.l(sVar, 24));
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = com.google.common.collect.h0.o(list);
        androidx.media3.common.r rVar = this.b;
        if (rVar == null) {
            return;
        }
        androidx.media3.common.q qVarA = rVar.a();
        androidx.media3.common.h hVar = rVar.E;
        if (hVar == null || !hVar.d()) {
            hVar = androidx.media3.common.h.h;
        }
        qVarA.D = hVar;
        qVarA.a();
        throw null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void q(long j, long j2) throws g0 {
        this.f.e.q(j + this.c, j2);
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void r(boolean z) {
        s sVar = this.f;
        if (sVar.d) {
            sVar.e.r(z);
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void release() {
        s sVar = this.f;
        if (sVar.n == 2) {
            return;
        }
        androidx.media3.common.util.g0 g0Var = sVar.k;
        if (g0Var != null) {
            g0Var.a.removeCallbacksAndMessages(null);
        }
        sVar.l = null;
        sVar.n = 2;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final boolean s(boolean z) {
        return this.f.e.a.b(false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042 A[Catch: k -> 0x003d, TryCatch #0 {k -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:34:0x0059, B:37:0x0060, B:42:0x0082, B:32:0x0051), top: B:47:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0051 A[Catch: k -> 0x003d, TryCatch #0 {k -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:34:0x0059, B:37:0x0060, B:42:0x0082, B:32:0x0051), top: B:47:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082 A[Catch: k -> 0x003d, TRY_LEAVE, TryCatch #0 {k -> 0x003d, blocks: (B:14:0x002b, B:17:0x0033, B:20:0x003a, B:25:0x0042, B:27:0x0046, B:34:0x0059, B:37:0x0060, B:42:0x0082, B:32:0x0051), top: B:47:0x002b }] */
    @Override // androidx.media3.exoplayer.video.h0
    public final boolean u(androidx.media3.common.r rVar) throws g0 {
        boolean zM = true;
        com.google.android.material.motion.a.q(!false);
        s sVar = this.f;
        com.google.android.material.motion.a.q(sVar.n == 0);
        androidx.media3.common.h hVar = rVar.E;
        if (hVar == null || !hVar.d()) {
            hVar = androidx.media3.common.h.h;
        }
        int i = hVar.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34 || i2 < 33 || !androidx.media3.common.util.c.m("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    if (i == 6) {
                        if (Build.VERSION.SDK_INT >= 33 || !androidx.media3.common.util.c.m("EGL_EXT_gl_colorspace_bt2020_pq")) {
                            zM = false;
                        }
                    } else if (i == 7) {
                        zM = androidx.media3.common.util.c.m("EGL_EXT_gl_colorspace_bt2020_hlg");
                    }
                    if (zM && Build.VERSION.SDK_INT >= 29) {
                        Locale locale = Locale.US;
                        androidx.media3.common.util.c.t("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                        androidx.media3.common.h hVar2 = androidx.media3.common.h.h;
                    } else if (i != 2 || i == 10) {
                        androidx.media3.common.h hVar3 = androidx.media3.common.h.h;
                    }
                }
            } catch (androidx.media3.common.util.k e) {
                throw new g0(e, rVar);
            }
        } else {
            if (i == 6) {
                if (Build.VERSION.SDK_INT >= 33) {
                    zM = false;
                } else {
                    zM = false;
                }
            } else if (i == 7) {
                zM = androidx.media3.common.util.c.m("EGL_EXT_gl_colorspace_bt2020_hlg");
            }
            if (zM) {
                if (i != 2) {
                    androidx.media3.common.h hVar4 = androidx.media3.common.h.h;
                } else {
                    androidx.media3.common.h hVar5 = androidx.media3.common.h.h;
                }
            } else if (i != 2) {
                androidx.media3.common.h hVar6 = androidx.media3.common.h.h;
            } else {
                androidx.media3.common.h hVar7 = androidx.media3.common.h.h;
            }
        }
        androidx.media3.common.util.e0 e0Var = sVar.f;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sVar.k = e0Var.a(looperMyLooper, null);
        sVar.b.a();
        throw null;
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void v() {
        s sVar = this.f;
        if (sVar.j.P() == 0) {
            sVar.e.v();
            return;
        }
        androidx.compose.ui.text.android.selection.e eVar = new androidx.compose.ui.text.android.selection.e();
        if (sVar.j.P() <= 0) {
            sVar.j = eVar;
        } else {
            ((r) sVar.j.J()).getClass();
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void t() {
    }

    @Override // androidx.media3.exoplayer.video.h0
    public final void f(g gVar) {
    }
}
