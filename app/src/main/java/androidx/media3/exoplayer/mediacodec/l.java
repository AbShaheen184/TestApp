package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface l {
    void c(int i, androidx.media3.decoder.a aVar, long j, int i2);

    void d(Bundle bundle);

    void f(int i, int i2, int i3, long j);

    void flush();

    void g(int i);

    void h(androidx.media3.exoplayer.video.j jVar, Handler handler);

    MediaFormat i();

    void j();

    void k(int i, long j);

    int l();

    int m(MediaCodec.BufferInfo bufferInfo);

    void n(int i);

    default void o(androidx.activity.c cVar) {
        cVar.run();
    }

    ByteBuffer p(int i);

    void q(Surface surface);

    ByteBuffer r(int i);

    void release();

    void s(ArrayList arrayList);

    default boolean t(androidx.media3.exoplayer.hls.c cVar) {
        return false;
    }

    void u(ArrayList arrayList);
}
