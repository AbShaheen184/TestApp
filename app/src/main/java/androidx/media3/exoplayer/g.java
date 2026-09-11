package androidx.media3.exoplayer;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final com.google.common.collect.a1 s;
    public final androidx.media3.common.u0 a;
    public final androidx.media3.common.t0 b;
    public final androidx.media3.exoplayer.upstream.d c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final com.google.common.collect.f1 p;
    public final ConcurrentHashMap q;
    public long r;

    static {
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        com.google.common.collect.q.e(6, objArr);
        s = com.google.common.collect.h0.j(6, objArr);
    }

    public g(androidx.media3.exoplayer.upstream.d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, Map map) {
        a("bufferForPlaybackMs", i5, "0", 0);
        a("bufferForPlaybackForLocalPlaybackMs", i6, "0", 0);
        a("bufferForPlaybackAfterRebufferMs", i7, "0", 0);
        a("bufferForPlaybackAfterRebufferForLocalPlaybackMs", i8, "0", 0);
        a("minBufferMs", i, "bufferForPlaybackMs", i5);
        a("minBufferForLocalPlaybackMs", i2, "bufferForPlaybackForLocalPlaybackMs", i6);
        a("minBufferMs", i, "bufferForPlaybackAfterRebufferMs", i7);
        a("minBufferForLocalPlaybackMs", i2, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", i8);
        a("maxBufferMs", i3, "minBufferMs", i);
        a("maxBufferForLocalPlaybackMs", i4, "minBufferForLocalPlaybackMs", i2);
        a("backBufferDurationMs", 0, "0", 0);
        this.a = new androidx.media3.common.u0();
        this.b = new androidx.media3.common.t0();
        this.c = dVar;
        this.d = androidx.media3.common.util.j0.Q(i);
        this.e = androidx.media3.common.util.j0.Q(i2);
        this.f = androidx.media3.common.util.j0.Q(i3);
        this.g = androidx.media3.common.util.j0.Q(i4);
        this.h = androidx.media3.common.util.j0.Q(i5);
        this.i = androidx.media3.common.util.j0.Q(i6);
        this.j = androidx.media3.common.util.j0.Q(i7);
        this.k = androidx.media3.common.util.j0.Q(i8);
        this.l = i9;
        this.m = z;
        this.n = z2;
        this.o = androidx.media3.common.util.j0.Q(0);
        this.q = new ConcurrentHashMap();
        this.p = com.google.common.collect.f1.b(map);
        this.r = -1L;
    }

    public static void a(String str, int i, String str2, int i2) {
        com.google.android.material.motion.a.i(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean b(l0 l0Var) {
        int i;
        boolean z;
        androidx.media3.exoplayer.analytics.k kVar = l0Var.a;
        long j = l0Var.d;
        f fVar = (f) this.q.get(kVar);
        fVar.getClass();
        f fVar2 = (f) this.q.get(kVar);
        fVar2.getClass();
        synchronized (fVar2) {
            i = fVar2.d;
        }
        int i2 = i * this.c.b;
        f fVar3 = (f) this.q.get(kVar);
        fVar3.getClass();
        boolean z2 = i2 >= fVar3.c;
        if (kVar.equals(androidx.media3.exoplayer.analytics.k.c)) {
            return !z2;
        }
        androidx.media3.common.v0 v0Var = l0Var.b;
        androidx.media3.common.y yVar = v0Var.m(v0Var.g(l0Var.c.a, this.b).c, this.a, 0L).c.b;
        if (yVar == null) {
            z = false;
        } else {
            String scheme = yVar.a.getScheme();
            if (TextUtils.isEmpty(scheme) || s.contains(scheme)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jMin = z ? this.e : this.d;
        long j2 = z ? this.g : this.f;
        float f = l0Var.e;
        if (f > 1.0f) {
            jMin = Math.min(androidx.media3.common.util.j0.B(f, jMin), j2);
        }
        if (j < Math.max(jMin, 500000L)) {
            boolean z3 = (z ? this.n : this.m) || !z2;
            fVar.b = z3;
            if (!z3 && j < 500000) {
                androidx.media3.common.util.c.t("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j2 || z2) {
            fVar.b = false;
        }
        return fVar.b;
    }

    public final void c() {
        boolean zIsEmpty = this.q.isEmpty();
        androidx.media3.exoplayer.upstream.d dVar = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (dVar) {
                if (dVar.a) {
                    dVar.c(0);
                }
            }
        } else {
            Iterator it = this.q.values().iterator();
            while (it.hasNext()) {
                i += ((f) it.next()).c;
            }
            dVar.c(i);
        }
    }
}
