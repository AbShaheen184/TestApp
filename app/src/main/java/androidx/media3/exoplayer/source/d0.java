package androidx.media3.exoplayer.source;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements androidx.media3.exoplayer.trackselection.q {
    public final androidx.media3.exoplayer.trackselection.q a;
    public final androidx.media3.common.w0 b;

    public d0(androidx.media3.exoplayer.trackselection.q qVar, androidx.media3.common.w0 w0Var) {
        this.a = qVar;
        this.b = w0Var;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int b(androidx.media3.common.r rVar) {
        return this.a.u(this.b.a(rVar));
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final androidx.media3.common.w0 c() {
        return this.b;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int d() {
        return this.a.d();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final boolean e(long j, androidx.media3.exoplayer.source.chunk.f fVar, List list) {
        return this.a.e(j, fVar, list);
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof d0)) {
            return this.b.equals(((d0) obj).b);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void f(boolean z) {
        this.a.f(z);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final androidx.media3.common.r g(int i) {
        return this.b.d[this.a.i(i)];
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int i(int i) {
        return this.a.i(i);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int j(long j, List list) {
        return this.a.j(j, list);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void k() {
        this.a.k();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void l(long j, long j2, long j3, List list, androidx.media3.exoplayer.source.chunk.l[] lVarArr) {
        this.a.l(j, j2, j3, list, lVarArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int length() {
        return this.a.length();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int m() {
        return this.a.m();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final androidx.media3.common.r n() {
        return this.b.d[this.a.m()];
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int o() {
        return this.a.o();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void q(float f) {
        this.a.q(f);
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final Object r() {
        return this.a.r();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void s() {
        this.a.s();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final void t() {
        this.a.t();
    }

    @Override // androidx.media3.exoplayer.trackselection.q
    public final int u(int i) {
        return this.a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
        }
        return false;
    }
}
