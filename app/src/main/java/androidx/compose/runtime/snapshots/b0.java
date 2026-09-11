package androidx.compose.runtime.snapshots;

import androidx.collection.p0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends b {
    public final b o;
    public final boolean p;
    public final boolean q;
    public kotlin.jvm.functions.l r;
    public kotlin.jvm.functions.l s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public b0(b bVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, boolean z, boolean z2) {
        kotlin.jvm.functions.l lVarI;
        kotlin.jvm.functions.l lVarE;
        androidx.compose.runtime.saveable.m mVar = n.a;
        super(0L, l.B, n.k(lVar, (bVar == null || (lVarE = bVar.e()) == null) ? n.j.e : lVarE, z), n.l(lVar2, (bVar == null || (lVarI = bVar.i()) == null) ? n.j.f : lVarI));
        this.o = bVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = androidx.compose.runtime.internal.k.b();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final void B(p0 p0Var) {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final b C(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        kotlin.jvm.functions.l lVarK = n.k(lVar, this.r, true);
        kotlin.jvm.functions.l lVarL = n.l(lVar2, this.s);
        return !this.p ? new b0(D().C(null, lVarL), lVarK, lVarL, false, true) : D().C(lVarK, lVarL);
    }

    public final b D() {
        b bVar = this.o;
        return bVar == null ? n.j : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void c() {
        b bVar;
        this.c = true;
        if (!this.q || (bVar = this.o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final l d() {
        return D().d();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l e() {
        return this.r;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final boolean f() {
        return D().f();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final long g() {
        return D().g();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final int h() {
        return D().h();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final kotlin.jvm.functions.l i() {
        return this.s;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void k() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void l() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void m() {
        D().m();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void n(w wVar) {
        D().n(wVar);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void r(l lVar) {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void s(long j) {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void t(int i) {
        D().t(i);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        kotlin.jvm.functions.l lVarK = n.k(lVar, this.r, true);
        return !this.p ? n.g(D().u(null), lVarK, true) : D().u(lVarK);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final r w() {
        return D().w();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final p0 x() {
        return D().x();
    }

    @Override // androidx.compose.runtime.snapshots.b
    /* JADX INFO: renamed from: y */
    public final kotlin.jvm.functions.l e() {
        return this.r;
    }
}
