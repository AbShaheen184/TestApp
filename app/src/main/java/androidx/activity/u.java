package androidx.activity;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public boolean b;
    public final ArrayList a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public u(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(boolean z) {
        this.b = z;
        for (t tVar : this.a) {
            tVar.f(tVar.e && z);
        }
    }

    public void a() {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }
}
