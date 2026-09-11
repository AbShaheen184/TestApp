package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public long d;
    public long e;
    public final ByteBuffer a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public final int b = 16;
    public final int c = 16;
    public int f = 0;

    public d() {
        long j = 0;
        this.d = j;
        this.e = j;
    }

    public final void a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.c) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void b(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.d;
        this.d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.e;
        this.d = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.e = jRotateLeft3;
        this.e = ((Long.rotateLeft(jRotateLeft3, 31) + this.d) * 5) + 944331445;
        this.f += 16;
    }

    public final d c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.c) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
