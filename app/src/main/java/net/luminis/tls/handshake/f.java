package net.luminis.tls.handshake;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {
    public long a;
    public byte[] b;
    public byte[] c;
    public int d;
    public net.luminis.tls.extension.f e;

    public static byte[] e(ByteBuffer byteBuffer, int i, int i2, String str) {
        if (i2 < i) {
            throw new net.luminis.tls.alert.a("No length specified for ".concat(str), 2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
        }
        if (i2 - i < i3) {
            throw new net.luminis.tls.alert.a("Message too short for given length of ".concat(str), 2);
        }
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        return bArr;
    }

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        net.luminis.tls.extension.f fVar = this.e;
        int length = fVar != null ? fVar.a().length : 0;
        int length2 = this.c.length + 11 + this.b.length + 2 + length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2 + 4);
        byteBufferAllocate.putInt(length2 | (net.luminis.tls.e.new_session_ticket.e << 24));
        byteBufferAllocate.putInt(this.d);
        byteBufferAllocate.putInt((int) this.a);
        byteBufferAllocate.put((byte) this.c.length);
        byteBufferAllocate.put(this.c);
        byteBufferAllocate.putShort((short) this.b.length);
        byteBufferAllocate.put(this.b);
        byteBufferAllocate.putShort((short) length);
        net.luminis.tls.extension.f fVar2 = this.e;
        if (fVar2 != null) {
            byteBufferAllocate.put(fVar2.a());
        }
        return byteBufferAllocate.array();
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.new_session_ticket;
    }
}
