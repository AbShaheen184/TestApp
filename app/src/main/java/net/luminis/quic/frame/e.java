package net.luminis.quic.frame;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {
    @Override // net.luminis.quic.frame.n
    public final void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l) {
        synchronized (iVar.D) {
            try {
                if (androidx.constraintlayout.core.g.e(iVar.C) < androidx.constraintlayout.core.g.e(5)) {
                    iVar.C = 5;
                    Iterator it = iVar.E.iterator();
                    while (it.hasNext()) {
                        ((net.luminis.quic.recovery.g) it.next()).d(iVar.C);
                    }
                } else {
                    iVar.z.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.T.b(2, "HandshakeDone is received");
        net.luminis.quic.crypto.d dVar = iVar.B;
        dVar.j[androidx.constraintlayout.core.g.e(3)] = true;
        dVar.f[androidx.constraintlayout.core.g.e(3)] = null;
        dVar.g[androidx.constraintlayout.core.g.e(3)] = null;
    }

    @Override // net.luminis.quic.frame.n
    public final int d() {
        return 1;
    }

    @Override // net.luminis.quic.frame.n
    public final void f(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 30);
    }

    public final String toString() {
        return "HandshakeDoneFrame[]";
    }
}
