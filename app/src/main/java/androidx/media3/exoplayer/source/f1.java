package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements w0 {
    public final w0 e;
    public final long y;

    public f1(w0 w0Var, long j) {
        this.e = w0Var;
        this.y = j;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        return this.e.a();
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() {
        this.e.b();
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        return this.e.g(j - this.y);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        int iO = this.e.o(bVar, eVar, i);
        if (iO == -4) {
            eVar.D += this.y;
        }
        return iO;
    }
}
