package androidx.media3.exoplayer.source;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.media3.extractor.h0 {
    public final v0 a;
    public final v0 b;
    public final androidx.media3.extractor.m c = new androidx.media3.extractor.m();
    public final AtomicReference d = new AtomicReference(j0.e);

    public k0(v0 v0Var) {
        this.a = v0Var;
        this.b = v0Var;
    }

    @Override // androidx.media3.extractor.h0
    public final int a(androidx.media3.common.i iVar, int i, boolean z) {
        return h().a(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void b(androidx.media3.common.util.w wVar, int i, int i2) {
        h().b(wVar, i, i2);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) {
        return h().c(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
        this.a.e(rVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void f(int i, androidx.media3.common.util.w wVar) {
        h().f(i, wVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, androidx.media3.extractor.g0 g0Var) {
        h().g(j, i, i2, i3, g0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == j0.y) {
            this.b.F(false);
            atomicReference.set(j0.z);
        }
    }

    public final androidx.media3.extractor.h0 h() {
        return this.d.get() == j0.z ? this.c : this.b;
    }

    @Override // androidx.media3.extractor.h0
    public final void d(long j) {
    }
}
