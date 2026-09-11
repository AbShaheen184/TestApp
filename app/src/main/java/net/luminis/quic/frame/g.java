package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends n {
    public long e;
    public boolean y;

    public g(long j, boolean z) {
        this.e = j;
        this.y = z;
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        net.luminis.quic.stream.n nVar = iVar.W;
        nVar.getClass();
        boolean z = this.y;
        long j = this.e;
        if (z) {
            if (j > nVar.i.longValue()) {
                int iLongValue = (int) (this.e - nVar.i.longValue());
                nVar.d.getClass();
                nVar.i = Long.valueOf(this.e);
                nVar.k.release(iLongValue);
                return;
            }
            return;
        }
        if (j > nVar.j.longValue()) {
            int iLongValue2 = (int) (this.e - nVar.j.longValue());
            nVar.d.getClass();
            nVar.j = Long.valueOf(this.e);
            nVar.l.release(iLongValue2);
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.e) + 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.y ? 18 : 19));
        com.google.android.material.textfield.p.k(this.e, byteBuffer);
    }

    public final void g(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (b != 18 && b != 19) {
            com.google.gson.b.l();
        } else {
            this.y = b == 18;
            this.e = com.google.android.material.textfield.p.s(byteBuffer);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaxStreamsFrame[");
        sb.append(this.y ? "B" : "U");
        sb.append(",");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.e, "]", sb);
    }
}
