package androidx.activity.compose;

import android.content.Context;
import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.h0;
import androidx.compose.animation.core.k0;
import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.x1;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.platform.l0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.runtime.g0
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((androidx.activity.compose.internal.c) this.b).b((m) this.c);
                break;
            case 1:
                ((androidx.activity.compose.internal.c) this.b).b((q) this.c);
                break;
            case 2:
                k0 k0Var = (k0) this.b;
                k0Var.a.j((h0) this.c);
                break;
            case 3:
                e2 e2Var = (e2) this.b;
                e2Var.j.remove((e2) this.c);
                break;
            case 4:
                e2 e2Var2 = (e2) this.b;
                x1 x1Var = (x1) this.c;
                e2Var2.getClass();
                w1 w1Var = (w1) x1Var.b.getValue();
                if (w1Var != null) {
                    e2Var2.i.remove(w1Var.e);
                }
                break;
            case 5:
                e2 e2Var3 = (e2) this.b;
                e2Var3.i.remove((a2) this.c);
                break;
            case 6:
                ((w0) this.b).z.k(this.c);
                break;
            case 7:
                y0 y0Var = (y0) this.b;
                androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) y0Var.getValue();
                if (mVar != null) {
                    androidx.compose.foundation.interaction.l lVar = new androidx.compose.foundation.interaction.l(mVar);
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) this.c;
                    if (kVar != null) {
                        kVar.b(lVar);
                    }
                    y0Var.setValue(null);
                }
                break;
            case 8:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((androidx.compose.ui.platform.k0) this.c);
                break;
            case 9:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((l0) this.c);
                break;
            case 10:
                ((androidx.navigation.i) this.b).E.j.b((androidx.navigation.compose.l) this.c);
                break;
            default:
                Iterator it = ((List) ((t2) this.b).getValue()).iterator();
                while (it.hasNext()) {
                    ((androidx.navigation.compose.i) this.c).b().c((androidx.navigation.i) it.next());
                }
                break;
        }
    }
}
