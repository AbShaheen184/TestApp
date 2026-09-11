package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.k;
import androidx.compose.ui.node.u;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import androidx.room.r;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q implements z1, u {
    public g L;
    public g M;
    public long N;

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.M = null;
        this.L = null;
    }

    public final boolean L0() {
        g gVar = this.L;
        if (gVar != null) {
            return gVar.L0();
        }
        g gVar2 = this.M;
        if (gVar2 != null) {
            return gVar2.L0();
        }
        return false;
    }

    public final void M0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.M0();
            return;
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.M0();
        }
    }

    public final void N0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.N0();
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.N0();
        }
        this.L = null;
    }

    public final void O0(com.app.mlounge.data.music.e eVar) {
        z1 z1Var;
        g gVar;
        g gVar2 = this.L;
        if (gVar2 == null || !android.support.v4.media.session.b.d(gVar2, r.o(eVar))) {
            if (this.e.K) {
                z zVar = new z();
                k.y(this, new androidx.compose.animation.h(3, zVar, this, eVar));
                z1Var = (z1) zVar.e;
            } else {
                z1Var = null;
            }
            gVar = (g) z1Var;
        } else {
            gVar = gVar2;
        }
        if (gVar != null && gVar2 == null) {
            gVar.M0();
            gVar.O0(eVar);
            g gVar3 = this.M;
            if (gVar3 != null) {
                gVar3.N0();
            }
        } else if (gVar == null && gVar2 != null) {
            g gVar4 = this.M;
            if (gVar4 != null) {
                gVar4.M0();
                gVar4.O0(eVar);
            }
            gVar2.N0();
        } else if (!l.a(gVar, gVar2)) {
            if (gVar != null) {
                gVar.M0();
                gVar.O0(eVar);
            }
            if (gVar2 != null) {
                gVar2.N0();
            }
        } else if (gVar != null) {
            gVar.O0(eVar);
        } else {
            g gVar5 = this.M;
            if (gVar5 != null) {
                gVar5.O0(eVar);
            }
        }
        this.L = gVar;
    }

    public final void P0() {
        g gVar = this.M;
        if (gVar != null) {
            gVar.P0();
            return;
        }
        g gVar2 = this.L;
        if (gVar2 != null) {
            gVar2.P0();
        }
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return e.a;
    }

    @Override // androidx.compose.ui.node.u
    public final void l(long j) {
        this.N = j;
    }
}
