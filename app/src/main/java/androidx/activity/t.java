package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.navigationevent.e {
    public final u d;
    public boolean e;

    public t(u uVar, v vVar) {
        boolean z = uVar.b;
        this.a = vVar;
        this.b = z;
        this.d = uVar;
        this.e = true;
    }

    @Override // androidx.navigationevent.e
    public final void a() {
        this.d.a();
    }

    @Override // androidx.navigationevent.e
    public final void b() {
        this.d.b();
    }

    @Override // androidx.navigationevent.e
    public final void c(androidx.navigationevent.b bVar) {
        this.d.c(new a(bVar));
    }

    @Override // androidx.navigationevent.e
    public final void d(androidx.navigationevent.b bVar) {
        bVar.getClass();
        this.d.d(new a(bVar));
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
