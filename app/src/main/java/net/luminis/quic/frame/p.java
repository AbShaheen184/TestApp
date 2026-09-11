package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {
    public int e;
    public long y;
    public long z;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        try {
            net.luminis.quic.stream.n nVar = iVar.W;
            net.luminis.quic.stream.e eVar = (net.luminis.quic.stream.e) nVar.a.get(Integer.valueOf(this.e));
            if (eVar != null) {
                nVar.x = eVar.e.z(this.z) + nVar.x;
            }
        } catch (net.luminis.quic.impl.l e) {
            iVar.e(4, e.e.e, null);
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.z) + com.google.android.material.textfield.p.b(this.y) + com.google.android.material.textfield.p.b(this.e) + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 4);
        com.google.android.material.textfield.p.l(byteBuffer, this.e);
        com.google.android.material.textfield.p.k(this.y, byteBuffer);
        com.google.android.material.textfield.p.k(this.z, byteBuffer);
    }

    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.e = com.google.android.material.textfield.p.r(byteBuffer);
        this.y = com.google.android.material.textfield.p.s(byteBuffer);
        this.z = com.google.android.material.textfield.p.s(byteBuffer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResetStreamFrame[");
        sb.append(this.e);
        sb.append("|");
        sb.append(this.y);
        sb.append("|");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.z, "]", sb);
    }
}
