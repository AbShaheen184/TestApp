package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends a {
    public final androidx.media3.datasource.l h;
    public final androidx.media3.datasource.g i;
    public final androidx.media3.common.r j;
    public final t2 l;
    public final a1 n;
    public final androidx.media3.common.c0 o;
    public androidx.media3.exoplayer.upstream.f p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public e1(androidx.media3.common.b0 b0Var, androidx.media3.common.util.b bVar, t2 t2Var) {
        this.i = bVar;
        this.l = t2Var;
        androidx.media3.common.d1 d1Var = new androidx.media3.common.d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        androidx.media3.common.w wVar = new androidx.media3.common.w();
        androidx.media3.common.z zVar = androidx.media3.common.z.a;
        Uri uri = Uri.EMPTY;
        String string = b0Var.a.toString();
        string.getClass();
        androidx.media3.common.c0 c0Var = new androidx.media3.common.c0(string, new androidx.media3.common.v(d1Var), uri != null ? new androidx.media3.common.y(uri, null, com.google.common.collect.h0.o(com.google.common.collect.h0.s(b0Var))) : null, new androidx.media3.common.x(wVar), androidx.media3.common.f0.B, zVar);
        this.o = c0Var;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        String str = b0Var.b;
        qVar.n = androidx.media3.common.i0.p(str == null ? "text/x-unknown" : str);
        qVar.d = b0Var.c;
        qVar.e = b0Var.d;
        qVar.f = 0;
        qVar.b = b0Var.e;
        qVar.a = null;
        this.j = new androidx.media3.common.r(qVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = b0Var.a;
        com.google.android.material.motion.a.m(uri2, "The uri must be set.");
        this.h = new androidx.media3.datasource.l(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new a1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c0Var, null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final u b(v vVar, c2 c2Var, long j) {
        return new d1(this.h, this.i, this.p, this.j, this.k, this.l, a(vVar), this.m, null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.common.c0 h() {
        return this.o;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.p = fVar;
        m(this.n);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(u uVar) {
        ((d1) uVar).F.e(null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void j() {
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
    }
}
