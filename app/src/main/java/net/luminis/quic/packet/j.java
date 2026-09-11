package net.luminis.quic.packet;

import com.app.mlounge.emulator.LibretroCore;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.StringJoiner;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends g {
    public static final Random j = new Random();
    public byte[] g;
    public int h;
    public ArrayList i;

    @Override // net.luminis.quic.packet.g
    public final int a(net.luminis.quic.impl.i iVar, Long l) {
        if (iVar.i0 || this.i.contains(iVar.e.a)) {
            iVar.z.getClass();
            return 1;
        }
        StringJoiner stringJoiner = new StringJoiner(", ");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((n) it.next()).toString());
        }
        net.luminis.quic.log.a aVar = iVar.z;
        Objects.toString(iVar.e);
        stringJoiner.toString();
        aVar.getClass();
        throw new androidx.compose.ui.res.e(17);
    }

    @Override // net.luminis.quic.packet.g
    public final boolean c() {
        return false;
    }

    @Override // net.luminis.quic.packet.g
    public final int g(int i) {
        throw new androidx.compose.ui.res.e(14);
    }

    @Override // net.luminis.quic.packet.g
    public final byte[] h(net.luminis.quic.crypto.a aVar) {
        int length = this.e.length + 7 + this.g.length;
        ArrayList arrayList = this.i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((arrayList.size() * 4) + length);
        byteBufferAllocate.put((byte) (((byte) j.nextInt(LibretroCore.SCREEN_WIDTH)) | 192));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) this.e.length);
        byteBufferAllocate.put(this.e);
        byteBufferAllocate.put((byte) this.g.length);
        byteBufferAllocate.put(this.g);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(((n) it.next()).a());
        }
        return byteBufferAllocate.array();
    }

    @Override // net.luminis.quic.packet.g
    public final int k() {
        return 0;
    }

    @Override // net.luminis.quic.packet.g
    public final Long l() {
        return null;
    }

    @Override // net.luminis.quic.packet.g
    public final int m() {
        return 0;
    }

    @Override // net.luminis.quic.packet.g
    public final void r(ByteBuffer byteBuffer, net.luminis.quic.crypto.a aVar, long j2, net.luminis.quic.log.a aVar2, int i) throws net.luminis.quic.impl.e {
        aVar2.getClass();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit < 11) {
            com.google.gson.b.p();
            return;
        }
        byteBuffer.get();
        if (byteBuffer.getInt() != 0) {
            throw new androidx.compose.ui.res.e(13);
        }
        int i2 = byteBuffer.get() & 255;
        int i3 = 11 + i2;
        if (iLimit < i3) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i4 = byteBuffer.get() & 255;
        if (iLimit < i3 + i4) {
            com.google.gson.b.p();
            return;
        }
        byte[] bArr2 = new byte[i4];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        while (byteBuffer.remaining() >= 4) {
            n nVar = new n(byteBuffer.getInt());
            this.i.add(nVar);
            nVar.toString();
        }
        this.h = byteBuffer.limit();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            stringJoiner.add(((n) it.next()).toString());
        }
        StringBuilder sb = new StringBuilder("Packet V|-|V|");
        int i = this.h;
        sb.append(i >= 0 ? Integer.valueOf(i) : ".");
        sb.append("|0  ");
        sb.append(stringJoiner);
        return sb.toString();
    }
}
