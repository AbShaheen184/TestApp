package androidx.compose.animation;

import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.y1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ w0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i) {
        super(1);
        this.y = i;
        this.z = w0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                y1 y1Var = (y1) obj;
                m0 m0Var = m0.e;
                m0 m0Var2 = m0.y;
                boolean zA = y1Var.a(m0Var, m0Var2);
                k1 k1Var = null;
                w0 w0Var = this.z;
                if (zA) {
                    k0 k0Var = w0Var.O.a.b;
                    if (k0Var != null) {
                        k1Var = k0Var.c;
                    }
                } else if (y1Var.a(m0Var2, m0.z)) {
                    k0 k0Var2 = w0Var.P.a.b;
                    if (k0Var2 != null) {
                        k1Var = k0Var2.c;
                    }
                } else {
                    k1Var = s0.d;
                }
                return k1Var == null ? s0.d : k1Var;
            default:
                y1 y1Var2 = (y1) obj;
                m0 m0Var3 = m0.e;
                m0 m0Var4 = m0.y;
                if (y1Var2.a(m0Var3, m0Var4)) {
                    return s0.c;
                }
                if (!y1Var2.a(m0Var4, m0.z)) {
                    return s0.c;
                }
                h1 h1Var = this.z.P.a;
                return s0.c;
        }
    }
}
