package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends g {
    public final net.luminis.tls.e a;
    public final short b;

    public n(ByteBuffer byteBuffer, net.luminis.tls.e eVar) throws net.luminis.tls.alert.a {
        this.a = eVar;
        int iB = b(byteBuffer, net.luminis.tls.d.supported_versions.e, 2);
        if (eVar != net.luminis.tls.e.client_hello) {
            if (eVar != net.luminis.tls.e.server_hello) {
                net.luminis.tls.engine.impl.c.a();
                throw null;
            }
            if (iB == 2) {
                this.b = byteBuffer.getShort();
                return;
            } else {
                net.luminis.tls.engine.impl.c.g("Incorrect extension length");
                throw null;
            }
        }
        int i = byteBuffer.get() & 255;
        if (i % 2 != 0 || iB != i + 1) {
            net.luminis.tls.engine.impl.c.g("invalid versions length");
            throw null;
        }
        for (int i2 = 0; i2 < i; i2 += 2) {
            short s = byteBuffer.getShort();
            if (s == 772 || this.b == 0) {
                this.b = s;
            }
        }
    }

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        net.luminis.tls.e eVar = net.luminis.tls.e.client_hello;
        net.luminis.tls.e eVar2 = this.a;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(eVar2.equals(eVar) ? 7 : 6);
        byteBufferAllocate.putShort(net.luminis.tls.d.supported_versions.e);
        if (eVar2.equals(eVar)) {
            byteBufferAllocate.putShort((short) 3);
            byteBufferAllocate.put((byte) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        } else {
            byteBufferAllocate.putShort((short) 2);
            byteBufferAllocate.put(new byte[]{3, 4});
        }
        return byteBufferAllocate.array();
    }

    public n(net.luminis.tls.e eVar) {
        this.a = eVar;
        this.b = (short) 772;
    }
}
