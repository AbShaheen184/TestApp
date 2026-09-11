package androidx.media3.exoplayer.source;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements y0 {
    public final com.google.common.collect.a1 e;
    public long y;

    public j(List list, List list2) {
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        com.google.android.material.motion.a.f(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            d0VarK.b(new i((y0) list.get(i), (List) list2.get(i)));
        }
        this.e = d0VarK.g();
        this.y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        boolean zD;
        boolean z = false;
        do {
            long jF = f();
            if (jF == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zD = false;
            while (true) {
                com.google.common.collect.a1 a1Var = this.e;
                if (i >= a1Var.A) {
                    break;
                }
                long jF2 = ((i) a1Var.get(i)).e.f();
                boolean z2 = jF2 != Long.MIN_VALUE && jF2 <= n0Var.a;
                if (jF2 == jF || z2) {
                    zD |= ((i) a1Var.get(i)).e.d(n0Var);
                }
                i++;
            }
            z |= zD;
        } while (zD);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                break;
            }
            long jF = ((i) a1Var.get(i)).e.f();
            if (jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        int i = 0;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                return false;
            }
            if (((i) a1Var.get(i)).e.n()) {
                return true;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                break;
            }
            i iVar = (i) a1Var.get(i);
            long jT = iVar.e.t();
            com.google.common.collect.h0 h0Var = iVar.y;
            if ((h0Var.contains(1) || h0Var.contains(2) || h0Var.contains(4)) && jT != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jT);
            }
            if (jT != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jT);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.y = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.y;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        int i = 0;
        while (true) {
            com.google.common.collect.a1 a1Var = this.e;
            if (i >= a1Var.A) {
                return;
            }
            ((i) a1Var.get(i)).v(j);
            i++;
        }
    }
}
