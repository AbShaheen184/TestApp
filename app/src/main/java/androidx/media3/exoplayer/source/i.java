package androidx.media3.exoplayer.source;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y0 {
    public final y0 e;
    public final com.google.common.collect.h0 y;

    public i(y0 y0Var, List list) {
        this.e = y0Var;
        this.y = com.google.common.collect.h0.o(list);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        return this.e.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return this.e.f();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.e.n();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        return this.e.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        this.e.v(j);
    }
}
