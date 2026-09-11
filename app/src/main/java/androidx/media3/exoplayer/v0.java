package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ androidx.media3.exoplayer.source.n A;
    public final /* synthetic */ androidx.media3.exoplayer.source.s B;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ Pair z;

    public /* synthetic */ v0(y0 y0Var, Pair pair, androidx.media3.exoplayer.source.n nVar, androidx.media3.exoplayer.source.s sVar, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = pair;
        this.A = nVar;
        this.B = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.analytics.g gVar = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair = this.z;
                gVar.F(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.v) pair.second, this.A, this.B);
                break;
            default:
                androidx.media3.exoplayer.analytics.g gVar2 = (androidx.media3.exoplayer.analytics.g) this.y.y.i;
                Pair pair2 = this.z;
                gVar2.j(((Integer) pair2.first).intValue(), (androidx.media3.exoplayer.source.v) pair2.second, this.A, this.B);
                break;
        }
    }
}
