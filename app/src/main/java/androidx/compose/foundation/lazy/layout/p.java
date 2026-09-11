package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public static final n O = new n();
    public q L;
    public com.google.firebase.platforminfo.c M;
    public k1 N;

    public final boolean L0(k kVar, int i) {
        if (i == 5 || i == 6) {
            if (this.N == k1.y) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.N == k1.e) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            net.luminis.tls.engine.impl.c.r("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (M0(i)) {
            if (kVar.b >= this.L.a() - 1) {
                return false;
            }
        } else if (kVar.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean M0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = androidx.compose.ui.node.k.t(this).X.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            coil3.g.a();
            return false;
        }
        if (i != 4) {
            net.luminis.tls.engine.impl.c.r("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = androidx.compose.ui.node.k.t(this).X.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        coil3.g.a();
        return false;
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new androidx.compose.foundation.layout.j(c1VarF, 5));
    }
}
