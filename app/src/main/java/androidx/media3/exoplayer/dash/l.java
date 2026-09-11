package androidx.media3.exoplayer.dash;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.media3.exoplayer.source.chunk.b {
    public final k A;

    public l(k kVar, long j, long j2) {
        super(j, j2);
        this.A = kVar;
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long i() {
        a();
        return this.A.e(this.z);
    }

    @Override // androidx.media3.exoplayer.source.chunk.l
    public final long k() {
        a();
        return this.A.d(this.z);
    }
}
