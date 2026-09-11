package androidx.media3.exoplayer;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements androidx.media3.common.util.m, com.google.common.base.t {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;

    public /* synthetic */ r(androidx.media3.exoplayer.analytics.a aVar, int i, androidx.media3.common.p0 p0Var, androidx.media3.common.p0 p0Var2) {
        this.e = 2;
        this.y = i;
    }

    @Override // com.google.common.base.t
    public Object get() {
        switch (this.e) {
            case 3:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.b.b(this.y, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(androidx.media3.exoplayer.mediacodec.b.b(this.y, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // androidx.media3.common.util.m
    public void invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((androidx.media3.common.o0) obj).q(this.y);
                break;
            case 1:
                ((androidx.media3.common.o0) obj).h(this.y);
                break;
            default:
                androidx.media3.exoplayer.analytics.b bVar = (androidx.media3.exoplayer.analytics.b) obj;
                bVar.getClass();
                androidx.media3.exoplayer.analytics.j jVar = (androidx.media3.exoplayer.analytics.j) bVar;
                int i = this.y;
                if (i == 1) {
                    jVar.v = true;
                }
                jVar.l = i;
                break;
        }
    }

    public /* synthetic */ r(int i, int i2) {
        this.e = i2;
        this.y = i;
    }
}
