package androidx.media3.exoplayer.dash;

import androidx.media3.common.c0;
import androidx.media3.common.t0;
import androidx.media3.common.u0;
import androidx.media3.common.util.j0;
import androidx.media3.common.v0;
import androidx.media3.common.x;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends v0 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final androidx.media3.exoplayer.dash.manifest.c i;
    public final c0 j;
    public final x k;

    public e(long j, long j2, long j3, int i, long j4, long j5, long j6, androidx.media3.exoplayer.dash.manifest.c cVar, c0 c0Var, x xVar) {
        com.google.android.material.motion.a.q(cVar.d == (xVar != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = cVar;
        this.j = c0Var;
        this.k = xVar;
    }

    @Override // androidx.media3.common.v0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // androidx.media3.common.v0
    public final t0 f(int i, t0 t0Var, boolean z) {
        com.google.android.material.motion.a.j(i, h());
        androidx.media3.exoplayer.dash.manifest.c cVar = this.i;
        String str = z ? cVar.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.e + i) : null;
        long jD = cVar.d(i);
        long jQ = j0.Q(cVar.b(i).b - cVar.b(0).b) - this.f;
        t0Var.getClass();
        androidx.media3.common.c cVar2 = androidx.media3.common.c.c;
        t0Var.a = str;
        t0Var.b = numValueOf;
        t0Var.c = 0;
        t0Var.d = jD;
        t0Var.e = jQ;
        t0Var.g = cVar2;
        t0Var.f = false;
        return t0Var;
    }

    @Override // androidx.media3.common.v0
    public final int h() {
        return this.i.m.size();
    }

    @Override // androidx.media3.common.v0
    public final Object l(int i) {
        com.google.android.material.motion.a.j(i, h());
        return Integer.valueOf(this.e + i);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    @Override // androidx.media3.common.v0
    public final u0 m(int i, u0 u0Var, long j) {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        long j4;
        j jVarC;
        com.google.android.material.motion.a.j(i, 1);
        androidx.media3.exoplayer.dash.manifest.c cVar = this.i;
        boolean z3 = cVar.d;
        long jA = this.h;
        if (z3 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j5 = 0;
            if (j > 0) {
                jA += j;
                if (jA > this.g) {
                    z = true;
                    j3 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                }
                Object obj = u0.q;
                if (cVar.d || cVar.e == j2 || cVar.b != j2) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                u0Var.b(this.j, cVar, this.b, this.c, this.d, true, z2, this.k, j3, this.g, h() - 1, this.f);
                return u0Var;
            }
            long j6 = this.f + jA;
            long jD = cVar.d(0);
            int i2 = 0;
            while (i2 < cVar.m.size() - 1 && j6 >= jD) {
                j6 -= jD;
                i2++;
                jD = cVar.d(i2);
            }
            androidx.media3.exoplayer.dash.manifest.h hVarB = cVar.b(i2);
            List list = hVarB.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j4 = j5;
                    i3 = -1;
                    break;
                }
                j4 = j5;
                if (((androidx.media3.exoplayer.dash.manifest.a) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j4;
            }
            if (i3 != -1 && (jVarC = ((androidx.media3.exoplayer.dash.manifest.m) ((androidx.media3.exoplayer.dash.manifest.a) hVarB.c.get(i3)).c.get(0)).c()) != null && jVarC.B(jD) != j4) {
                jA = (jVarC.a(jVarC.s(j6, jD)) + jA) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        j3 = jA;
        Object obj2 = u0.q;
        if (cVar.d) {
            z2 = false;
        } else {
            z2 = false;
        }
        u0Var.b(this.j, cVar, this.b, this.c, this.d, true, z2, this.k, j3, this.g, h() - 1, this.f);
        return u0Var;
    }

    @Override // androidx.media3.common.v0
    public final int o() {
        return 1;
    }
}
