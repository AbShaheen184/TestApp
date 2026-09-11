package androidx.media3.exoplayer.audio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends androidx.media3.common.audio.n {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void m(ByteBuffer byteBuffer, int i2) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 2) {
            byteBufferL = l(i2 * 2);
            while (iPosition < iLimit) {
                m(byteBufferL, ((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            byteBufferL = l((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m(byteBufferL, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            byteBufferL = l(i2);
            while (iPosition < iLimit) {
                m(byteBufferL, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            byteBufferL = l(i2 / 2);
            while (iPosition < iLimit) {
                byteBufferL.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i3 == 21) {
            byteBufferL = l((i2 / 3) * 4);
            while (iPosition < iLimit) {
                m(byteBufferL, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else {
            if (i3 != 22) {
                org.mozilla.javascript.c.a();
                return;
            }
            byteBufferL = l(i2);
            while (iPosition < iLimit) {
                m(byteBufferL, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.n
    public final androidx.media3.common.audio.j h(androidx.media3.common.audio.j jVar) throws androidx.media3.common.audio.l {
        int i2 = jVar.c;
        if (androidx.media3.common.util.j0.L(i2) || i2 == 2) {
            return i2 != 4 ? new androidx.media3.common.audio.j(jVar.a, jVar.b, 4) : androidx.media3.common.audio.j.e;
        }
        throw new androidx.media3.common.audio.l(jVar);
    }
}
