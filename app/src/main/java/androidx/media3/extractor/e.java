package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a0 {
    public final g a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public e(g gVar, long j, long j2, long j3, long j4, long j5) {
        this.a = gVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        b0 b0Var = new b0(j, f.a(this.a.g(j), 0L, this.c, this.d, this.e, this.f));
        return new z(b0Var, b0Var);
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.b;
    }
}
