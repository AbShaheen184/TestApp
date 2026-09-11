package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends androidx.media3.common.v0 {
    public static final Object n = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public final androidx.media3.common.c0 l;
    public final androidx.media3.common.x m;

    static {
        androidx.media3.common.d1 d1Var = new androidx.media3.common.d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        androidx.media3.common.w wVar = new androidx.media3.common.w();
        androidx.media3.common.z zVar = androidx.media3.common.z.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new androidx.media3.common.y(uri, null, a1Var);
        }
        d1Var.a();
        wVar.a();
        androidx.media3.common.f0 f0Var = androidx.media3.common.f0.B;
    }

    public a1(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, com.google.android.material.shape.g gVar, androidx.media3.common.c0 c0Var, androidx.media3.common.x xVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = gVar;
        c0Var.getClass();
        this.l = c0Var;
        this.m = xVar;
    }

    @Override // androidx.media3.common.v0
    public final int b(Object obj) {
        return n.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.v0
    public final androidx.media3.common.t0 f(int i, androidx.media3.common.t0 t0Var, boolean z) {
        com.google.android.material.motion.a.j(i, 1);
        Object obj = z ? n : null;
        long j = -this.f;
        t0Var.getClass();
        androidx.media3.common.c cVar = androidx.media3.common.c.c;
        t0Var.a = null;
        t0Var.b = obj;
        t0Var.c = 0;
        t0Var.d = this.d;
        t0Var.e = j;
        t0Var.g = cVar;
        t0Var.f = false;
        return t0Var;
    }

    @Override // androidx.media3.common.v0
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.v0
    public final Object l(int i) {
        com.google.android.material.motion.a.j(i, 1);
        return n;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.media3.common.v0
    public final androidx.media3.common.u0 m(int i, androidx.media3.common.u0 u0Var, long j) {
        long j2;
        com.google.android.material.motion.a.j(i, 1);
        long j3 = this.g;
        boolean z = this.i;
        if (!z || this.j || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.e;
            if (j4 != -9223372036854775807L) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        Object obj = androidx.media3.common.u0.q;
        u0Var.b(this.l, this.k, this.b, this.c, -9223372036854775807L, this.h, z, this.m, j2, this.e, 0, this.f);
        return u0Var;
    }

    @Override // androidx.media3.common.v0
    public final int o() {
        return 1;
    }
}
