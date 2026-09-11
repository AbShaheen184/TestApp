package androidx.navigation.compose;

import androidx.compose.foundation.text.c0;
import androidx.compose.runtime.y0;
import com.app.mlounge.ui.viewmodel.r1;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ k(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.z = obj;
        this.y = z;
        this.A = obj2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                final androidx.navigation.i iVar = (androidx.navigation.i) this.z;
                final List list = (List) this.A;
                final boolean z = this.y;
                androidx.lifecycle.t tVar = new androidx.lifecycle.t() { // from class: androidx.navigation.compose.l
                    @Override // androidx.lifecycle.t
                    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
                        boolean z2 = z;
                        List list2 = list;
                        androidx.navigation.i iVar2 = iVar;
                        if (z2 && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_START && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (nVar == androidx.lifecycle.n.ON_STOP) {
                            list2.remove(iVar2);
                        }
                    }
                };
                iVar.E.j.a(tVar);
                return new androidx.activity.compose.k(10, iVar, tVar);
            default:
                y0 y0Var = (y0) this.z;
                r1 r1Var = (r1) this.A;
                androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj;
                kVar.getClass();
                List list2 = (List) y0Var.getValue();
                kVar.q(list2.size(), new c0(26, new com.app.mlounge.ui.screens.search.a(25), list2), new com.app.mlounge.ui.screens.adult.g(21, list2), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.sources.c(list2, this.y, r1Var)));
                return y.a;
        }
    }
}
