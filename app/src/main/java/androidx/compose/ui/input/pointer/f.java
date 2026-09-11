package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.r1;
import androidx.compose.ui.node.x1;
import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.compose.ui.q implements z1, r1, androidx.compose.ui.node.h {
    public androidx.compose.ui.node.l L;
    public a M;
    public boolean N;

    public f(a aVar, androidx.compose.ui.node.l lVar) {
        this.L = lVar;
        this.M = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.node.r1
    public final void D(m mVar, n nVar, long j) {
        if (nVar == n.y) {
            ?? r3 = mVar.a;
            int size = r3.size();
            for (int i = 0; i < size; i++) {
                if (O0(((v) r3.get(i)).i)) {
                    int i2 = mVar.f;
                    if (i2 == 4) {
                        this.N = true;
                        N0();
                        return;
                    } else {
                        if (i2 == 5) {
                            P0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        P0();
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        P0();
    }

    public final void L0() {
        a aVar;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.compose.ui.node.k.x(this, new e(1));
        f fVar = (f) zVar.e;
        if (fVar == null || (aVar = fVar.M) == null) {
            aVar = this.M;
        }
        M0(aVar);
    }

    public abstract void M0(s sVar);

    public final void N0() {
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.e = true;
        androidx.compose.ui.node.k.y(this, new androidx.compose.ui.draganddrop.f(vVar));
        if (vVar.e) {
            L0();
        }
    }

    public abstract boolean O0(int i);

    public final void P0() {
        if (this.N) {
            this.N = false;
            if (this.K) {
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                androidx.compose.ui.node.k.x(this, new androidx.compose.ui.input.nestedscroll.j(1, zVar));
                f fVar = (f) zVar.e;
                if (fVar != null) {
                    fVar.L0();
                } else {
                    M0(null);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.r1
    public final long k() {
        androidx.compose.ui.node.l lVar = this.L;
        if (lVar == null) {
            return x1.a;
        }
        androidx.compose.ui.unit.c cVar = androidx.compose.ui.node.k.t(this).W;
        int i = x1.b;
        return b1.c(cVar.g0(lVar.a), cVar.g0(lVar.b), cVar.g0(lVar.c), cVar.g0(lVar.d));
    }
}
