package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n {
    public byte[] e;

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.e.length) + 1 + this.e.length;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        com.google.android.material.textfield.p.l(byteBuffer, this.e.length);
        byteBuffer.put(this.e);
    }

    public final void g(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) {
        byteBuffer.get();
        byte[] bArr = new byte[com.google.android.material.textfield.p.r(byteBuffer)];
        this.e = bArr;
        byteBuffer.get(bArr);
        aVar.getClass();
    }

    public final String toString() {
        return "NewTokenFrame[" + com.google.common.base.b.b(this.e) + "]";
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
    }
}
