package androidx.media3.common.audio;

import androidx.media3.common.util.j0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends n {
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                org.mozilla.javascript.c.a();
                                return;
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferL = l(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferL.put((byte) 0);
                byteBufferL.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sI = (short) (j0.i(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferL.put((byte) (sI & 255));
                byteBufferL.put((byte) ((sI >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 2));
                byteBufferL.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferL.put(byteBuffer.get(iPosition + 1));
                byteBufferL.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i3 != 1879048192) {
                org.mozilla.javascript.c.a();
                return;
            }
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                byteBufferL.put((byte) (sMax & 255));
                byteBufferL.put((byte) ((sMax >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.n
    public final j h(j jVar) throws l {
        int i = jVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new j(jVar.a, jVar.b, 2) : j.e;
        }
        throw new l(jVar);
    }
}
