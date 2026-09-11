package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {
    public final kotlin.jvm.functions.l e;
    public int f;

    public e(long j, l lVar, kotlin.jvm.functions.l lVar2) {
        super(j, lVar);
        this.e = lVar2;
        this.f = 1;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void c() {
        if (this.c) {
            return;
        }
        l();
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
        this.f++;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void n(w wVar) {
        androidx.compose.runtime.saveable.m mVar = n.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        n.c(this);
        return new d(this.b, this.a, n.k(lVar, this.e, true), this);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void m() {
    }
}
