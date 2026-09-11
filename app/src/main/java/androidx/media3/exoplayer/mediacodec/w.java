package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements l {
    public final MediaCodec a;
    public final j b;

    public w(MediaCodec mediaCodec, j jVar) {
        this.a = mediaCodec;
        this.b = jVar;
        if (Build.VERSION.SDK_INT < 35 || jVar == null) {
            return;
        }
        jVar.a(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void c(int i, androidx.media3.decoder.a aVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, aVar.i, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void d(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void f(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void flush() {
        this.a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void g(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void h(androidx.media3.exoplayer.video.j jVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, jVar, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final MediaFormat i() {
        return this.a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void j() {
        this.a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void k(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int l() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int m(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final ByteBuffer p(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void q(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final ByteBuffer r(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void release() {
        j jVar = this.b;
        MediaCodec mediaCodec = this.a;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && jVar != null) {
                jVar.c(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void s(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void u(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
