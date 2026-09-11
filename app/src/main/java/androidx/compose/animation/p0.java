package androidx.compose.animation;

import androidx.compose.animation.core.y1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ x0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(x0 x0Var, y0 y0Var, int i) {
        super(1);
        this.y = i;
        this.z = x0Var;
        this.A = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.animation.core.b0 b0Var;
        androidx.compose.animation.core.b0 b0Var2;
        switch (this.y) {
            case 0:
                y1 y1Var = (y1) obj;
                m0 m0Var = m0.e;
                m0 m0Var2 = m0.y;
                if (y1Var.a(m0Var, m0Var2)) {
                    z0 z0Var = this.z.a.a;
                    return (z0Var == null || (b0Var2 = z0Var.a) == null) ? s0.b : b0Var2;
                }
                if (!y1Var.a(m0Var2, m0.z)) {
                    return s0.b;
                }
                z0 z0Var2 = this.A.a.a;
                return (z0Var2 == null || (b0Var = z0Var2.a) == null) ? s0.b : b0Var;
            case 1:
                int iOrdinal = ((m0) obj).ordinal();
                float f = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            coil3.g.a();
                            return null;
                        }
                        if (this.A.a.a == null) {
                            f = 1.0f;
                        }
                    }
                } else if (this.z.a.a == null) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 2:
                y1 y1Var2 = (y1) obj;
                m0 m0Var3 = m0.e;
                m0 m0Var4 = m0.y;
                if (y1Var2.a(m0Var3, m0Var4)) {
                    return s0.b;
                }
                if (!y1Var2.a(m0Var4, m0.z)) {
                    return s0.b;
                }
                h1 h1Var = this.A.a;
                return s0.b;
            default:
                int iOrdinal2 = ((m0) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        coil3.g.a();
                        return null;
                    }
                    h1 h1Var2 = this.A.a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
