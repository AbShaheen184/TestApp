package net.luminis.quic.send;

import androidx.media3.extractor.r;
import net.luminis.quic.impl.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {
    public byte[] i;

    @Override // net.luminis.quic.send.g
    public final h a(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (i2 < 1200) {
            return null;
        }
        return super.a(i, i2, bArr, bArr2);
    }

    @Override // net.luminis.quic.send.g
    public final net.luminis.quic.packet.g b(byte[] bArr, byte[] bArr2) {
        n nVar = this.a.a;
        byte[] bArr3 = this.i;
        net.luminis.quic.packet.c cVar = new net.luminis.quic.packet.c(nVar, bArr, bArr2);
        cVar.h = bArr3;
        r rVar = this.e;
        long j = rVar.a;
        rVar.a = 1 + j;
        if (j >= 0) {
            cVar.b = j;
            return cVar;
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }
}
