package androidx.activity.compose.internal;

import androidx.navigationevent.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final /* synthetic */ b d;

    public a(b bVar, com.google.firebase.b bVar2) {
        this.d = bVar;
        this.a = bVar2;
        this.b = false;
    }

    @Override // androidx.navigationevent.e
    public final void a() {
        this.d.e();
    }

    @Override // androidx.navigationevent.e
    public final void b() {
        this.d.f();
    }

    @Override // androidx.navigationevent.e
    public final void c(androidx.navigationevent.b bVar) {
        this.d.g(new androidx.activity.a(bVar));
    }

    @Override // androidx.navigationevent.e
    public final void d(androidx.navigationevent.b bVar) {
        bVar.getClass();
        this.d.h();
    }
}
