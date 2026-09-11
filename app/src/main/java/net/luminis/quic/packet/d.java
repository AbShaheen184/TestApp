package net.luminis.quic.packet;

import com.google.android.material.textfield.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringJoiner;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends g {
    public byte[] g;

    public d(n nVar, byte[] bArr, byte[] bArr2) {
        this.a = nVar;
        this.g = bArr;
        this.e = bArr2;
        this.c = new ArrayList();
    }

    @Override // net.luminis.quic.packet.g
    public final int g(int i) {
        int iD = g.d(this.b);
        Iterator it = this.c.iterator();
        int iD2 = 0;
        while (it.hasNext()) {
            iD2 += ((net.luminis.quic.frame.n) it.next()).d();
        }
        int i2 = iD2 + i;
        return g.d(this.b) + v() + this.e.length + 7 + this.g.length + (i2 + 1 > 63 ? 2 : 1) + i2 + Integer.max(0, (4 - iD) - i2) + 16;
    }

    @Override // net.luminis.quic.packet.g
    public final byte[] h(net.luminis.quic.crypto.a aVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        byte bF = g.f((byte) ((x() << 4) | 192), this.b);
        g.f(bF, this.b);
        byteBufferAllocate.put(bF);
        byteBufferAllocate.put(this.a.a());
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        w(byteBufferAllocate);
        byte[] bArrE = g.e(this.b);
        ByteBuffer byteBufferI = i(bArrE.length);
        p.l(byteBufferAllocate, byteBufferI.limit() + 16 + bArrE.length);
        byteBufferAllocate.put(bArrE);
        t(byteBufferAllocate, bArrE.length, byteBufferI, aVar);
        this.d = byteBufferAllocate.limit();
        int iPosition = byteBufferAllocate.position();
        byte[] bArr = new byte[iPosition];
        byteBufferAllocate.get(bArr);
        this.d = iPosition;
        return bArr;
    }

    @Override // net.luminis.quic.packet.g
    public final void r(ByteBuffer byteBuffer, net.luminis.quic.crypto.a aVar, long j, net.luminis.quic.log.a aVar2, int i) throws net.luminis.quic.impl.e {
        "Parsing ".concat(getClass().getSimpleName());
        aVar2.getClass();
        if (byteBuffer.position() != 0) {
            org.mozilla.javascript.c.a();
            return;
        }
        if (byteBuffer.remaining() < 10) {
            com.google.gson.b.p();
            return;
        }
        byte b = byteBuffer.get();
        if (((b & 48) >> 4) != x()) {
            com.google.gson.b.l();
            return;
        }
        if (!new n(byteBuffer.getInt()).equals(this.a)) {
            throw new net.luminis.quic.impl.e("Version does not match version of the connection");
        }
        int i2 = byteBuffer.get();
        if (i2 < 0 || i2 > 20) {
            com.google.gson.b.p();
            return;
        }
        if (byteBuffer.remaining() < i2) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i3 = byteBuffer.get();
        if (i3 < 0 || i3 > 20) {
            com.google.gson.b.p();
            return;
        }
        if (byteBuffer.remaining() < i3) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr2 = new byte[i3];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        y(byteBuffer);
        try {
            try {
                s(byteBuffer, b, p.r(byteBuffer), aVar, j, aVar2);
            } finally {
                this.d = byteBuffer.position();
            }
        } catch (IllegalArgumentException | net.luminis.quic.generic.a unused) {
            com.google.gson.b.p();
        }
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((net.luminis.quic.frame.n) it.next()).toString());
        }
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(this.f ? "P" : "");
        sb.append(com.google.android.datatransport.runtime.backends.c.w(k()).charAt(0));
        sb.append("|");
        long j = this.b;
        sb.append(j >= 0 ? Long.valueOf(j) : ".");
        sb.append("|L|");
        int i = this.d;
        sb.append(i >= 0 ? Integer.valueOf(i) : ".");
        sb.append("|");
        sb.append(this.c.size());
        sb.append("  ");
        sb.append(stringJoiner);
        return sb.toString();
    }

    public abstract int v();

    public abstract void w(ByteBuffer byteBuffer);

    public abstract byte x();

    public abstract void y(ByteBuffer byteBuffer);

    public d(n nVar) {
        this.a = nVar;
    }
}
