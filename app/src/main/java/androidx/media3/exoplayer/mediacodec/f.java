package androidx.media3.exoplayer.mediacodec;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.media3.decoder.e {
    public long G;
    public int H;
    public int I;

    @Override // androidx.media3.decoder.e
    public final void o() {
        super.o();
        this.H = 0;
    }

    public final boolean s(androidx.media3.decoder.e eVar) {
        ByteBuffer byteBuffer;
        com.google.android.material.motion.a.f(!eVar.g(1073741824));
        com.google.android.material.motion.a.f(!eVar.g(268435456));
        com.google.android.material.motion.a.f(!eVar.g(4));
        if (t()) {
            if (this.H >= this.I) {
                return false;
            }
            ByteBuffer byteBuffer2 = eVar.B;
            if (byteBuffer2 != null && (byteBuffer = this.B) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.H;
        this.H = i + 1;
        if (i == 0) {
            this.D = eVar.D;
            if (eVar.g(1)) {
                this.y = 1;
            }
        }
        ByteBuffer byteBuffer3 = eVar.B;
        if (byteBuffer3 != null) {
            q(byteBuffer3.remaining());
            this.B.put(byteBuffer3);
        }
        this.G = eVar.D;
        return true;
    }

    public final boolean t() {
        return this.H > 0;
    }
}
