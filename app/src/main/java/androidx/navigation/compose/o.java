package androidx.navigation.compose;

import androidx.navigation.b0;
import androidx.navigation.j0;
import androidx.navigation.k0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@j0("dialog")
public final class o extends k0 {
    @Override // androidx.navigation.k0
    public final androidx.navigation.t a() {
        androidx.compose.runtime.internal.f fVar = e.a;
        return new n(this);
    }

    @Override // androidx.navigation.k0
    public final void d(List list, b0 b0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((androidx.navigation.i) it.next());
        }
    }

    @Override // androidx.navigation.k0
    public final void e(androidx.navigation.i iVar, boolean z) {
        b().e(iVar, z);
        int iO = kotlin.collections.o.O((Iterable) b().f.getValue(), iVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            androidx.navigation.i iVar2 = (androidx.navigation.i) obj;
            if (i > iO) {
                b().c(iVar2);
            }
            i = i2;
        }
    }
}
