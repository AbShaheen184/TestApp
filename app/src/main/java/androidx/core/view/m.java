package androidx.core.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public m(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.f) ((n) it.next())).a.r()) {
                return true;
            }
        }
        return false;
    }

    public final void b(n nVar) {
        this.b.remove(nVar);
        l lVar = (l) this.c.remove(nVar);
        if (lVar != null) {
            lVar.a.b(lVar.b);
            lVar.b = null;
        }
        this.a.run();
    }
}
