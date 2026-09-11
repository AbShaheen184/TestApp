package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, int i) {
        this.c = m0Var;
        this.a = i;
    }

    public final void a(int i) {
        m0 m0Var = this.c;
        b1 b1Var = m0Var.c;
        if (b1Var == null) {
            return;
        }
        this.b.add(new a1(b1Var, i, m0Var.b, null));
    }
}
