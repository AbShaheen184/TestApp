package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f {
    public final kotlin.jvm.functions.l e;
    public final f f;

    public d(long j, l lVar, kotlin.jvm.functions.l lVar2, f fVar) {
        super(j, lVar);
        this.e = lVar2;
        this.f = fVar;
        fVar.k();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void c() {
        f fVar = this.f;
        if (this.c) {
            return;
        }
        if (this.b != fVar.g()) {
            a();
        }
        fVar.l();
        this.c = true;
        synchronized (n.c) {
            o();
        }
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l e() {
        return this.e;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final boolean f() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void k() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void l() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void n(w wVar) {
        androidx.compose.runtime.saveable.m mVar = n.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        return new d(this.b, this.a, n.k(lVar, this.e, true), this.f);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void m() {
    }
}
