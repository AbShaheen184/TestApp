package androidx.media3.decoder;

import androidx.media3.common.d0;
import androidx.media3.common.r;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.media3.container.f {
    public final a A = new a();
    public ByteBuffer B;
    public boolean C;
    public long D;
    public ByteBuffer E;
    public final int F;
    public r z;

    static {
        d0.a("media3.decoder");
    }

    public e(int i) {
        this.F = i;
    }

    public void o() {
        this.y = 0;
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.E;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.C = false;
    }

    public final ByteBuffer p(int i) {
        int i2 = this.F;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.B;
        throw new d("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public final void q(int i) {
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer == null) {
            this.B = p(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.B = byteBuffer;
            return;
        }
        ByteBuffer byteBufferP = p(i2);
        byteBufferP.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferP.put(byteBuffer);
        }
        this.B = byteBufferP;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.B;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.E;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
