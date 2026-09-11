package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements net.luminis.quic.stream.h {
    public long e;
    public int y;
    public byte[] z;

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) throws Exception {
        int i;
        try {
            iVar.d(gVar.k()).a(this);
            net.luminis.quic.log.a aVar = iVar.z;
            net.luminis.quic.crypto.f fVarD = iVar.d(gVar.k());
            fVarD.b(fVarD.h);
            aVar.getClass();
        } catch (net.luminis.quic.impl.l e) {
            if (iVar.L == 2) {
                iVar.m0 = e.toString();
            } else {
                iVar.z.f("Processing crypto frame failed with ", e);
            }
            iVar.e(gVar.k(), e.e.e, "");
        } catch (net.luminis.tls.i e2) {
            if (iVar.L == 2) {
                iVar.m0 = e2.toString();
            } else {
                iVar.z.f("Processing crypto frame failed with ", e2);
            }
            int iK = gVar.k();
            if (e2 instanceof net.luminis.tls.alert.a) {
                i = ((net.luminis.tls.alert.a) e2).e.e + 256;
            } else {
                i = e2.getCause() instanceof net.luminis.quic.impl.l ? ((net.luminis.quic.impl.l) e2.getCause()).e.e : net.luminis.quic.a.INTERNAL_ERROR.e;
            }
            iVar.e(iK, i, e2.getMessage());
        }
    }

    @Override // net.luminis.quic.stream.h
    public final long b() {
        return this.e + ((long) this.y);
    }

    @Override // net.luminis.quic.stream.h
    public final byte[] c() {
        return this.z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        net.luminis.quic.stream.h hVar = (net.luminis.quic.stream.h) obj;
        return this.e != hVar.getOffset() ? Long.compare(this.e, hVar.getOffset()) : Long.compare(this.y, hVar.getLength());
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return com.google.android.material.textfield.p.b(this.z.length) + com.google.android.material.textfield.p.b(this.e) + 1 + this.z.length;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 6);
        com.google.android.material.textfield.p.k(this.e, byteBuffer);
        com.google.android.material.textfield.p.l(byteBuffer, this.z.length);
        byteBuffer.put(this.z);
    }

    public final void g(ByteBuffer byteBuffer, net.luminis.quic.log.a aVar) {
        aVar.getClass();
        byteBuffer.get();
        this.e = com.google.android.material.textfield.p.s(byteBuffer);
        int iR = com.google.android.material.textfield.p.r(byteBuffer);
        this.y = iR;
        byte[] bArr = new byte[iR];
        this.z = bArr;
        byteBuffer.get(bArr);
    }

    @Override // net.luminis.quic.stream.h
    public final int getLength() {
        return this.y;
    }

    @Override // net.luminis.quic.stream.h
    public final long getOffset() {
        return this.e;
    }

    @Override // net.luminis.quic.stream.h
    public final boolean isFinal() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CryptoFrame[");
        sb.append(this.e);
        sb.append(",");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.y, "]", sb);
    }
}
