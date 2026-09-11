package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n {
    public int y;
    public byte[] z = new byte[0];
    public int A = -1;
    public int B = 28;
    public long e = 0;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        int iK = gVar.k();
        if (com.google.android.datatransport.runtime.backends.c.a(iVar.L)) {
            return;
        }
        int i = this.B;
        if ((i != 28 || this.e == 0) && (i != 29 || this.e == 0)) {
            net.luminis.quic.log.a aVar = iVar.z;
            iVar.toString();
            aVar.getClass();
        } else {
            net.luminis.quic.log.a aVar2 = iVar.z;
            iVar.toString();
            net.luminis.quic.impl.i.c(this);
            aVar2.getClass();
            if (iVar.L == 2) {
                iVar.m0 = "Server closed connection: ".concat(net.luminis.quic.impl.i.c(this));
            }
        }
        iVar.T.i();
        iVar.W.a();
        net.luminis.quic.impl.n nVar = iVar.e.a;
        iVar.T.f(new b(), iK, net.luminis.quic.send.k.z);
        iVar.L = 5;
        try {
            iVar.N.schedule(new net.luminis.quic.impl.h(iVar, 4), iVar.T.d() * 3, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.z.length) + com.google.android.material.textfield.p.b(0L) + com.google.android.material.textfield.p.b(this.e) + 1 + this.z.length;
    }

    @Override // net.luminis.quic.frame.n
    public final boolean e() {
        return false;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 28);
        com.google.android.material.textfield.p.k(this.e, byteBuffer);
        com.google.android.material.textfield.p.l(byteBuffer, 0);
        com.google.android.material.textfield.p.l(byteBuffer, this.z.length);
        byteBuffer.put(this.z);
    }

    public final void g(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        this.B = i;
        if (i != 28 && i != 29) {
            com.google.gson.b.l();
            return;
        }
        this.e = com.google.android.material.textfield.p.s(byteBuffer);
        if (this.B == 28) {
            this.y = com.google.android.material.textfield.p.r(byteBuffer);
        }
        int iR = com.google.android.material.textfield.p.r(byteBuffer);
        if (iR > 0) {
            byte[] bArr = new byte[iR];
            this.z = bArr;
            byteBuffer.get(bArr);
        }
        if (this.B == 28) {
            long j = this.e;
            if (j < 256 || j >= 512) {
                return;
            }
            this.A = (int) (j - 256);
        }
    }

    public final String toString() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder("ConnectionCloseFrame[");
        if (this.A != -1) {
            objValueOf = "TLS " + this.A;
        } else {
            objValueOf = Long.valueOf(this.e);
        }
        sb.append(objValueOf);
        sb.append("|");
        sb.append(this.y);
        sb.append("|");
        byte[] bArr = this.z;
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, bArr != null ? new String(bArr) : "-", "]");
    }
}
