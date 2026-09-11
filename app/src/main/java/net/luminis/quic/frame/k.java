package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends n {
    public byte[] e;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.impl.n nVar = iVar.e.a;
        byte[] bArr = this.e;
        l lVar = new l();
        if (bArr.length != 8) {
            net.luminis.tls.engine.impl.c.o("Path Response Frame must contain 8 bytes data");
        } else {
            lVar.e = bArr;
            iVar.j(lVar, new net.luminis.quic.impl.j(0), false);
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return 9;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 26);
        byteBuffer.put(this.e);
    }

    public final void g(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 26) {
            com.google.gson.b.l();
            return;
        }
        byte[] bArr = new byte[8];
        this.e = bArr;
        byteBuffer.get(bArr);
    }

    public final String toString() {
        return "PathChallengeFrame[" + com.google.common.base.b.b(this.e) + "]";
    }
}
