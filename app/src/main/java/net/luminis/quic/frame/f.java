package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n {
    public final /* synthetic */ int e;
    public int y;
    public long z;

    public f(int i, long j) {
        this.e = 0;
        this.y = i;
        this.z = j;
    }

    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        switch (this.e) {
            case 0:
                try {
                    iVar.K.b(this);
                } catch (net.luminis.quic.impl.l e) {
                    iVar.e(4, e.e.e, null);
                    return;
                }
                break;
            case 1:
                net.luminis.quic.stream.e eVar = (net.luminis.quic.stream.e) iVar.W.a.get(Integer.valueOf(this.y));
                if (eVar != null) {
                    eVar.f.g(this.z);
                }
                break;
            default:
                net.luminis.quic.log.a aVar = iVar.z;
                toString();
                aVar.getClass();
                break;
        }
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        int iB;
        int iB2;
        switch (this.e) {
            case 0:
                iB = com.google.android.material.textfield.p.b(this.y) + 1;
                iB2 = com.google.android.material.textfield.p.b(this.z);
                break;
            case 1:
                iB = com.google.android.material.textfield.p.b(this.y) + 1;
                iB2 = com.google.android.material.textfield.p.b(this.z);
                break;
            default:
                iB = com.google.android.material.textfield.p.b(this.y) + 1;
                iB2 = com.google.android.material.textfield.p.b(this.z);
                break;
        }
        return iB2 + iB;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        switch (this.e) {
            case 0:
                byteBuffer.put((byte) 17);
                com.google.android.material.textfield.p.l(byteBuffer, this.y);
                com.google.android.material.textfield.p.k(this.z, byteBuffer);
                break;
            case 1:
                byteBuffer.put((byte) 5);
                com.google.android.material.textfield.p.l(byteBuffer, this.y);
                com.google.android.material.textfield.p.k(this.z, byteBuffer);
                break;
            default:
                byteBuffer.put((byte) 21);
                com.google.android.material.textfield.p.l(byteBuffer, this.y);
                com.google.android.material.textfield.p.k(this.z, byteBuffer);
                break;
        }
    }

    public void g(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.y = com.google.android.material.textfield.p.r(byteBuffer);
        this.z = com.google.android.material.textfield.p.s(byteBuffer);
    }

    public void h(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.y = com.google.android.material.textfield.p.r(byteBuffer);
        this.z = com.google.android.material.textfield.p.s(byteBuffer);
    }

    public void i(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.y = com.google.android.material.textfield.p.r(byteBuffer);
        this.z = com.google.android.material.textfield.p.s(byteBuffer);
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                StringBuilder sb = new StringBuilder("MaxStreamDataFrame[");
                sb.append(this.y);
                sb.append(":");
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.z, "]", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("StopSendingFrame[");
                sb2.append(this.y);
                sb2.append(":");
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.z, "]", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("StreamDataBlockedFrame[");
                sb3.append(this.y);
                sb3.append("|");
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.z, "]", sb3);
        }
    }

    public /* synthetic */ f(int i) {
        this.e = i;
    }
}
