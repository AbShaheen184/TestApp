package androidx.navigation.internal;

import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.navigation.i;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements t {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ d(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        switch (this.e) {
            case 0:
                f fVar = (f) this.y;
                fVar.r = nVar.a();
                if (fVar.c != null) {
                    for (i iVar : o.l0(fVar.f)) {
                        iVar.getClass();
                        c cVar = iVar.E;
                        cVar.getClass();
                        cVar.a.A = nVar.a();
                        cVar.d = nVar.a();
                        cVar.b();
                    }
                }
                break;
            default:
                androidx.savedstate.internal.a aVar = (androidx.savedstate.internal.a) this.y;
                if (nVar == n.ON_START) {
                    aVar.h = true;
                } else if (nVar == n.ON_STOP) {
                    aVar.h = false;
                }
                break;
        }
    }
}
