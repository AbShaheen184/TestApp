package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends n {
    public int e;

    public j(int i) {
        this.e = i;
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return this.e;
    }

    @Override // net.luminis.quic.frame.n
    public final boolean e() {
        return false;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[this.e]);
    }

    public final void g(ByteBuffer byteBuffer) {
        byte b = 0;
        while (byteBuffer.position() < byteBuffer.limit() && (b = byteBuffer.get()) == 0) {
            this.e++;
        }
        if (b != 0) {
        }
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.e, ")", new StringBuilder("Padding("));
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
    }
}
