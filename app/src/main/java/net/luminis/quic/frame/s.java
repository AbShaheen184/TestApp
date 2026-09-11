package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends n {
    public boolean e;
    public long y;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.log.a aVar = iVar.z;
        toString();
        aVar.getClass();
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.y) + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put(this.e ? (byte) 22 : (byte) 23);
        com.google.android.material.textfield.p.k(this.y, byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamsBlockedFrame[");
        sb.append(this.e ? "B" : "U");
        sb.append("|");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.y, "]", sb);
    }
}
