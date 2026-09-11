package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public final androidx.media3.exoplayer.source.v a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public q0(androidx.media3.exoplayer.source.v vVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        com.google.android.material.motion.a.f(!z5 || z3);
        com.google.android.material.motion.a.f(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        com.google.android.material.motion.a.f(z6);
        this.a = vVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final q0 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new q0(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final q0 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new q0(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.b == q0Var.b && this.d == q0Var.d && this.e == q0Var.e && this.f == q0Var.f && this.g == q0Var.g && this.h == q0Var.h && this.i == q0Var.i && this.j == q0Var.j && this.k == q0Var.k && Objects.equals(this.a, q0Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
