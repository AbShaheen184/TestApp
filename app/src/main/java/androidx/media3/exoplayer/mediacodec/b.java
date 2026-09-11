package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.util.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {
    public final MediaCodec a;
    public final e b;
    public final m c;
    public final j d;
    public boolean e;
    public int f = 0;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar, j jVar) {
        this.a = mediaCodec;
        this.b = new e(handlerThread);
        this.c = mVar;
        this.d = jVar;
    }

    public static void a(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        j jVar;
        e eVar = bVar.b;
        MediaCodec mediaCodec = bVar.a;
        HandlerThread handlerThread = eVar.b;
        com.google.android.material.motion.a.q(eVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(eVar, handler);
        eVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        bVar.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (jVar = bVar.d) != null) {
            jVar.a(mediaCodec);
        }
        bVar.f = 1;
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void c(int i, androidx.media3.decoder.a aVar, long j, int i2) {
        this.c.c(i, aVar, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void d(Bundle bundle) {
        this.c.d(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void f(int i, int i2, int i3, long j) {
        this.c.f(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void flush() {
        this.c.flush();
        this.a.flush();
        e eVar = this.b;
        synchronized (eVar.a) {
            eVar.l++;
            Handler handler = eVar.c;
            String str = j0.a;
            handler.post(new androidx.activity.l(eVar, 21));
        }
        this.a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void g(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void h(androidx.media3.exoplayer.video.j jVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new a(this, jVar, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final MediaFormat i() {
        MediaFormat mediaFormat;
        e eVar = this.b;
        synchronized (eVar.a) {
            try {
                mediaFormat = eVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
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
        this.c.v();
        e eVar = this.b;
        synchronized (eVar.a) {
            try {
                eVar.b();
                int i = -1;
                if (eVar.l > 0 || eVar.m) {
                    return -1;
                }
                androidx.media3.common.util.e eVar2 = eVar.d;
                int i2 = eVar2.a;
                int i3 = eVar2.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = eVar2.c[i2];
                    eVar2.a = (i2 + 1) & eVar2.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int m(MediaCodec.BufferInfo bufferInfo) {
        this.c.v();
        e eVar = this.b;
        synchronized (eVar.a) {
            try {
                eVar.b();
                if (eVar.l > 0 || eVar.m) {
                    return -1;
                }
                androidx.media3.common.util.e eVar2 = eVar.e;
                int i = eVar2.a;
                int i2 = eVar2.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = eVar2.c[i];
                eVar2.a = eVar2.d & (i + 1);
                if (i3 >= 0) {
                    eVar.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) eVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    eVar.h = (MediaFormat) eVar.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void o(androidx.activity.c cVar) {
        e eVar = this.b;
        androidx.activity.c cVar2 = new androidx.activity.c(21, this, cVar);
        synchronized (eVar.a) {
            eVar.b();
            cVar2.run();
        }
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
        j jVar;
        j jVar2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                e eVar = this.b;
                synchronized (eVar.a) {
                    eVar.m = true;
                    eVar.b.quit();
                    eVar.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (jVar2 = this.d) != null) {
                    jVar2.c(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (jVar = this.d) != null) {
                        jVar.c(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void s(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final boolean t(androidx.media3.exoplayer.hls.c cVar) {
        e eVar = this.b;
        synchronized (eVar.a) {
            eVar.o = cVar;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void u(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }
}
