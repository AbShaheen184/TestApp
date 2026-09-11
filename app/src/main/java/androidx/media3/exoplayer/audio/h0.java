package androidx.media3.exoplayer.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends androidx.media3.common.audio.n {
    public int[] i;
    public int[] j;

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    @Override // androidx.media3.common.audio.m
    public final void c(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iU = (androidx.media3.common.util.j0.u(this.b.c) * i5) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iU));
                } else if (i6 == 3) {
                    byteBufferL.put(byteBuffer.get(iU));
                } else if (i6 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iU));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iU;
                    } else {
                        i = iU + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iU + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iU += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iU) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.google.android.material.motion.a.h(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    com.google.android.material.motion.a.f(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferL.putInt(byteBuffer.getInt(iU));
                } else if (i6 == 268435456) {
                    byteBufferL.putShort(byteBuffer.getShort(iU));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iU;
                    } else {
                        i = iU + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iU + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iU += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iU) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    com.google.android.material.motion.a.h(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    com.google.android.material.motion.a.f(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b7).put(b8).put((byte) i4);
                } else if (i6 == 1610612736) {
                    byteBufferL.putInt(byteBuffer.getInt(iU));
                } else {
                    if (i6 != 1879048192) {
                        net.luminis.tls.engine.impl.c.l(this.b.c, "Unexpected encoding: ");
                        return;
                    }
                    byteBufferL.putDouble(byteBuffer.getDouble(iU));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.n
    public final androidx.media3.common.audio.j h(androidx.media3.common.audio.j jVar) throws androidx.media3.common.audio.l {
        int i = jVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return androidx.media3.common.audio.j.e;
        }
        int i2 = jVar.b;
        if (!androidx.media3.common.util.j0.M(i)) {
            throw new androidx.media3.common.audio.l(jVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new androidx.media3.common.audio.l("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", jVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new androidx.media3.common.audio.j(jVar.a, iArr.length, i) : androidx.media3.common.audio.j.e;
    }

    @Override // androidx.media3.common.audio.n
    public final void i() {
        this.j = this.i;
    }

    @Override // androidx.media3.common.audio.n
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
