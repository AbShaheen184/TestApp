package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k {
    public int a;

    @Override // net.luminis.tls.extension.g
    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putShort(net.luminis.tls.d.pre_shared_key.e);
        byteBufferAllocate.putShort((short) 2);
        byteBufferAllocate.putShort((short) this.a);
        return byteBufferAllocate.array();
    }
}
