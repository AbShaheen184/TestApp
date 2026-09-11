package net.luminis.quic.packet;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringJoiner;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g {
    public short g;

    @Override // net.luminis.quic.packet.g
    public final int a(net.luminis.quic.impl.i iVar, Long l) {
        net.luminis.quic.cid.b bVar = iVar.Y;
        byte[] bArr = this.e;
        net.luminis.quic.cid.e eVar = bVar.e;
        boolean z = false;
        if (!Arrays.equals(eVar.b, bArr)) {
            for (net.luminis.quic.cid.a aVar : eVar.a.values()) {
                if (Arrays.equals(aVar.b, eVar.b)) {
                    aVar.c = 3;
                }
            }
            eVar.b = bArr;
            for (net.luminis.quic.cid.a aVar2 : eVar.a.values()) {
                if (Arrays.equals(aVar2.b, eVar.b) && androidx.constraintlayout.core.g.b(aVar2.c, 1)) {
                    z = true;
                    break;
                }
            }
            for (net.luminis.quic.cid.a aVar3 : eVar.a.values()) {
                if (Arrays.equals(aVar3.b, eVar.b)) {
                    aVar3.c = 2;
                }
            }
            net.luminis.quic.log.a aVar4 = eVar.c;
            "Peer has switched to connection id ".concat(com.google.common.base.b.b(eVar.b));
            aVar4.getClass();
        }
        if (z && bVar.e.b().size() < bVar.i) {
            bVar.a();
        }
        iVar.h(this, l);
        return 1;
    }

    @Override // net.luminis.quic.packet.g
    public final int g(int i) {
        int iD = g.d(this.b);
        Iterator it = this.c.iterator();
        int iD2 = 0;
        while (it.hasNext()) {
            iD2 += ((n) it.next()).d();
        }
        int i2 = iD2 + i;
        int iMax = Integer.max(0, (4 - iD) - i2);
        int length = this.e.length + 1;
        if (this.b < 0) {
            iD = 4;
        }
        return length + iD + i2 + iMax + 16;
    }

    @Override // net.luminis.quic.packet.g
    public final byte[] h(net.luminis.quic.crypto.a aVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        short s = (short) (aVar.n % 2);
        this.g = s;
        byteBufferAllocate.put(g.f((byte) ((s << 2) | 64), this.b));
        byteBufferAllocate.put(this.e);
        byte[] bArrE = g.e(this.b);
        byteBufferAllocate.put(bArrE);
        t(byteBufferAllocate, bArrE.length, i(bArrE.length), aVar);
        int iLimit = byteBufferAllocate.limit();
        this.d = iLimit;
        byte[] bArr = new byte[iLimit];
        byteBufferAllocate.get(bArr);
        this.d = iLimit;
        return bArr;
    }

    @Override // net.luminis.quic.packet.g
    public final byte[] j() {
        return this.e;
    }

    @Override // net.luminis.quic.packet.g
    public final int k() {
        return 4;
    }

    @Override // net.luminis.quic.packet.g
    public final int m() {
        return 3;
    }

    @Override // net.luminis.quic.packet.g
    public final void r(ByteBuffer byteBuffer, net.luminis.quic.crypto.a aVar, long j, net.luminis.quic.log.a aVar2, int i) throws Throwable {
        i iVar;
        ByteBuffer byteBuffer2;
        net.luminis.quic.crypto.a aVar3;
        "Parsing ".concat(i.class.getSimpleName());
        aVar2.getClass();
        if (byteBuffer.remaining() < i + 1) {
            com.google.gson.b.p();
            return;
        }
        if (byteBuffer.position() != 0) {
            org.mozilla.javascript.c.a();
            return;
        }
        byte b = byteBuffer.get();
        if ((b & 192) != 64) {
            com.google.gson.b.l();
            return;
        }
        byte[] bArr = new byte[i];
        this.e = bArr;
        byteBuffer.get(bArr);
        try {
            iVar = this;
            byteBuffer2 = byteBuffer;
            aVar3 = aVar;
            try {
                try {
                    iVar.s(byteBuffer2, b, byteBuffer.limit() - byteBuffer.position(), aVar3, j, aVar2);
                    aVar3.d();
                    iVar.d = byteBuffer2.position();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    iVar.d = byteBuffer2.position();
                    throw th2;
                }
            } catch (net.luminis.quic.impl.b e) {
                e = e;
                net.luminis.quic.impl.b bVar = e;
                synchronized (aVar3) {
                    if (aVar3.o) {
                        aVar3.a.getClass();
                        aVar3.d = null;
                        aVar3.o = false;
                        aVar3.f = null;
                        aVar3.h = null;
                    }
                }
                throw bVar;
            }
        } catch (net.luminis.quic.impl.b e2) {
            e = e2;
            iVar = this;
            byteBuffer2 = byteBuffer;
            aVar3 = aVar;
        } catch (Throwable th3) {
            th = th3;
            iVar = this;
            byteBuffer2 = byteBuffer;
            Throwable th4 = th;
            iVar.d = byteBuffer2.position();
            throw th4;
        }
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((n) it.next()).toString());
        }
        StringBuilder sb = new StringBuilder("Packet ");
        sb.append(this.f ? "P" : "");
        sb.append("App".charAt(0));
        sb.append("|");
        long j = this.b;
        sb.append(j >= 0 ? Long.valueOf(j) : ".");
        sb.append("|S");
        sb.append((int) this.g);
        sb.append("|");
        sb.append(com.google.common.base.b.b(this.e));
        sb.append("|");
        sb.append(this.d);
        sb.append("|");
        sb.append(this.c.size());
        sb.append("  ");
        sb.append(stringJoiner);
        return sb.toString();
    }

    @Override // net.luminis.quic.packet.g
    public final void u(byte b) {
        this.g = (short) ((b & 4) >> 2);
    }
}
