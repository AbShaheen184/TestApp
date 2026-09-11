package net.luminis.quic.packet;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.StringJoiner;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n nVar) {
        super(nVar);
        this.h = 0;
    }

    @Override // net.luminis.quic.packet.g
    public final int a(net.luminis.quic.impl.i iVar, Long l) {
        switch (this.h) {
            case 0:
                iVar.h(this, l);
                return 1;
            default:
                return 2;
        }
    }

    @Override // net.luminis.quic.packet.g
    public final int k() {
        switch (this.h) {
            case 0:
                return 3;
            default:
                return 2;
        }
    }

    @Override // net.luminis.quic.packet.g
    public final int m() {
        switch (this.h) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // net.luminis.quic.packet.d
    public String toString() {
        switch (this.h) {
            case 1:
                StringJoiner stringJoiner = new StringJoiner(" ");
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    stringJoiner.add(((net.luminis.quic.frame.n) it.next()).toString());
                }
                StringBuilder sb = new StringBuilder("Packet ");
                sb.append("ZeroRTT".charAt(0));
                sb.append("|");
                long j = this.b;
                sb.append(j >= 0 ? Long.valueOf(j) : ".");
                sb.append("|Z|");
                int i = this.d;
                sb.append(i >= 0 ? Integer.valueOf(i) : ".");
                sb.append("|");
                sb.append(this.c.size());
                sb.append("  ");
                sb.append(stringJoiner);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // net.luminis.quic.packet.d
    public final int v() {
        switch (this.h) {
        }
        return 0;
    }

    @Override // net.luminis.quic.packet.d
    public final void w(ByteBuffer byteBuffer) {
        int i = this.h;
    }

    @Override // net.luminis.quic.packet.d
    public final byte x() {
        switch (this.h) {
            case 0:
                return (byte) (this.a.b() ? 3 : 2);
            default:
                return (byte) (this.a.b() ? 2 : 1);
        }
    }

    @Override // net.luminis.quic.packet.d
    public final void y(ByteBuffer byteBuffer) {
        int i = this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n nVar, byte[] bArr, byte[] bArr2, int i) {
        super(nVar, bArr, bArr2);
        this.h = i;
    }

    private final void A(ByteBuffer byteBuffer) {
    }

    private final void B(ByteBuffer byteBuffer) {
    }

    private final void C(ByteBuffer byteBuffer) {
    }

    private final void z(ByteBuffer byteBuffer) {
    }
}
