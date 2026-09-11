package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public final androidx.lifecycle.viewmodel.internal.d a = new androidx.lifecycle.viewmodel.internal.d();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        androidx.lifecycle.viewmodel.internal.d dVar = this.a;
        if (dVar != null) {
            if (dVar.d) {
                androidx.lifecycle.viewmodel.internal.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.a) {
                autoCloseable2 = (AutoCloseable) dVar.b.put(str, autoCloseable);
            }
            androidx.lifecycle.viewmodel.internal.d.a(autoCloseable2);
        }
    }

    public final void b() {
        androidx.lifecycle.viewmodel.internal.d dVar = this.a;
        if (dVar != null && !dVar.d) {
            dVar.d = true;
            synchronized (dVar.a) {
                try {
                    Iterator it = dVar.b.values().iterator();
                    while (it.hasNext()) {
                        androidx.lifecycle.viewmodel.internal.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.c.iterator();
                    while (it2.hasNext()) {
                        androidx.lifecycle.viewmodel.internal.d.a((AutoCloseable) it2.next());
                    }
                    dVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        androidx.lifecycle.viewmodel.internal.d dVar = this.a;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.a) {
            autoCloseable = (AutoCloseable) dVar.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
