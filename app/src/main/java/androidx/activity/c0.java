package androidx.activity;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final Runnable a;
    public final kotlin.o b = new kotlin.o(new w(this, 0));

    public c0(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(u uVar, androidx.lifecycle.v vVar) {
        final androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        if (((androidx.lifecycle.x) lifecycle).d == androidx.lifecycle.o.e) {
            return;
        }
        t tVar = new t(uVar, new v(uVar, vVar));
        uVar.a.add(tVar);
        tVar.g(false);
        androidx.navigationevent.c.a(b().c, tVar);
        final b0 b0Var = new b0(tVar, this, lifecycle);
        lifecycle.a(b0Var);
        uVar.c.add(new AutoCloseable() { // from class: androidx.activity.x
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.b(b0Var);
            }
        });
    }

    public final z b() {
        return (z) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.c(new androidx.navigationevent.k(onBackInvokedDispatcher, 0), 1);
        b().c.c(new androidx.navigationevent.k(onBackInvokedDispatcher, 1000000), 0);
    }
}
