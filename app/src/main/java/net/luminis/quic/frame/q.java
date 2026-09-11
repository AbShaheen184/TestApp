package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends n {
    public int e;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.cid.b bVar = iVar.Y;
        byte[] bArrJ = gVar.j();
        bVar.getClass();
        int i = this.e;
        boolean z = false;
        Integer num = null;
        for (Integer num2 : bVar.e.a.keySet()) {
            if (!z || num2.compareTo(num) > 0) {
                z = true;
                num = num2;
            }
        }
        if (i > (z ? num.intValue() : -1)) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "invalid connection ID sequence number");
            return;
        }
        int i2 = this.e;
        if (Arrays.equals(((net.luminis.quic.cid.a) bVar.e.a.get(Integer.valueOf(i2))).b, bArrJ)) {
            bVar.d.accept(Integer.valueOf(net.luminis.quic.a.PROTOCOL_VIOLATION.e), "cannot retire current connection ID");
        } else if (bVar.e.c(i2) != null) {
            bVar.b.getClass();
            if (bVar.e.b().size() < bVar.i) {
                bVar.a();
            }
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.e) + 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && ((q) obj).e == this.e;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 25);
        com.google.android.material.textfield.p.l(byteBuffer, this.e);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.e, "]", new StringBuilder("RetireConnectionIdFrame["));
    }
}
