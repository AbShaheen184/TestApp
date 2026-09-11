package androidx.media3.exoplayer;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.media3.exoplayer.source.c0, androidx.media3.exoplayer.drm.e {
    public final a1 e;
    public final /* synthetic */ b1 y;

    public y0(b1 b1Var, a1 a1Var) {
        this.y = b1Var;
        this.e = a1Var;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void C(int i, androidx.media3.exoplayer.source.v vVar, final androidx.media3.exoplayer.source.n nVar, final androidx.media3.exoplayer.source.s sVar, final IOException iOException, final boolean z) {
        final Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new Runnable() { // from class: androidx.media3.exoplayer.x0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.analytics.g gVar = (androidx.media3.exoplayer.analytics.g) this.e.y.i;
                    Pair pair = pairA;
                    gVar.C(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.v) pair.second, nVar, sVar, iOException, z);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void F(int i, androidx.media3.exoplayer.source.v vVar, androidx.media3.exoplayer.source.n nVar, androidx.media3.exoplayer.source.s sVar) {
        Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new v0(this, pairA, nVar, sVar, 0));
        }
    }

    public final Pair a(int i, androidx.media3.exoplayer.source.v vVar) {
        androidx.media3.exoplayer.source.v vVarA;
        a1 a1Var = this.e;
        androidx.media3.exoplayer.source.v vVar2 = null;
        if (vVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= a1Var.c.size()) {
                    vVarA = null;
                    break;
                }
                if (((androidx.media3.exoplayer.source.v) a1Var.c.get(i2)).d == vVar.d) {
                    Object obj = vVar.a;
                    Object obj2 = a1Var.b;
                    int i3 = g1.k;
                    vVarA = vVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (vVarA == null) {
                return null;
            }
            vVar2 = vVarA;
        }
        return Pair.create(Integer.valueOf(i + a1Var.d), vVar2);
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void f(int i, androidx.media3.exoplayer.source.v vVar, androidx.media3.exoplayer.source.s sVar) {
        Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new u0(this, pairA, sVar, 0));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void j(int i, androidx.media3.exoplayer.source.v vVar, androidx.media3.exoplayer.source.n nVar, androidx.media3.exoplayer.source.s sVar) {
        Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new v0(this, pairA, nVar, sVar, 1));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void k(int i, androidx.media3.exoplayer.source.v vVar, androidx.media3.exoplayer.source.s sVar) {
        Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new u0(this, pairA, sVar, 1));
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void z(int i, androidx.media3.exoplayer.source.v vVar, final androidx.media3.exoplayer.source.n nVar, final androidx.media3.exoplayer.source.s sVar, final int i2) {
        final Pair pairA = a(i, vVar);
        if (pairA != null) {
            ((androidx.media3.common.util.g0) this.y.j).d(new Runnable() { // from class: androidx.media3.exoplayer.w0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.analytics.g gVar = (androidx.media3.exoplayer.analytics.g) this.e.y.i;
                    Pair pair = pairA;
                    gVar.z(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.v) pair.second, nVar, sVar, i2);
                }
            });
        }
    }
}
