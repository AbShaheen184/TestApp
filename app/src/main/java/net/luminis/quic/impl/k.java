package net.luminis.quic.impl;

import androidx.compose.animation.core.j2;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends j2 {
    public final /* synthetic */ int y;
    public final Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k kVar) {
        super(kVar);
        this.y = 3;
        int[] iArr = {32, 32, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY};
        this.z = new androidx.compose.ui.input.pointer.util.c[androidx.constraintlayout.core.g.f(3).length];
        for (int i : androidx.constraintlayout.core.g.f(3)) {
            ((androidx.compose.ui.input.pointer.util.c[]) this.z)[androidx.constraintlayout.core.g.e(i)] = new androidx.compose.ui.input.pointer.util.c(iArr[androidx.constraintlayout.core.g.e(i)], 2);
        }
    }

    @Override // net.luminis.quic.packet.e
    public final void g(net.luminis.quic.packet.g gVar, net.luminis.quic.packet.f fVar) {
        switch (this.y) {
            case 0:
                i iVar = (i) this.z;
                byte[] bArrJ = gVar.j();
                Iterator it = iVar.Y.e.b().iterator();
                while (it.hasNext()) {
                    if (Arrays.equals((byte[]) it.next(), bArrJ)) {
                        q(gVar, fVar);
                        return;
                    }
                }
                iVar.z.d("Dropping packet because dcid " + com.google.common.base.b.b(bArrJ) + " is not an active connection ID.");
                gVar.toString();
                return;
            case 1:
                if (!com.google.android.datatransport.runtime.backends.c.a(((i) this.z).L)) {
                    q(gVar, fVar);
                    return;
                }
                int i = ((i) this.z).L;
                if (i == 0) {
                    throw null;
                }
                if (i != 4) {
                    gVar.toString();
                    return;
                }
                i iVar2 = (i) this.z;
                Iterator it2 = gVar.c.iterator();
                while (it2.hasNext()) {
                    if (((net.luminis.quic.frame.n) it2.next()) instanceof net.luminis.quic.frame.b) {
                        iVar2.L = 5;
                        return;
                    }
                }
                net.luminis.quic.util.a aVar = iVar2.M;
                int i2 = aVar.b + 1;
                aVar.b = i2;
                if (i2 == aVar.a) {
                    n nVar = iVar2.e.a;
                    iVar2.T.f(new net.luminis.quic.frame.b(), gVar.k(), net.luminis.quic.send.k.z);
                    aVar.a *= 2;
                    return;
                }
                return;
            case 2:
                q(gVar, fVar);
                ((i) this.z).T.j();
                return;
            default:
                if (gVar.m() != 0) {
                    androidx.compose.ui.input.pointer.util.c cVar = ((androidx.compose.ui.input.pointer.util.c[]) this.z)[androidx.constraintlayout.core.g.e(gVar.m())];
                    cVar.getClass();
                    Long l = gVar.l();
                    int iLongValue = (int) (l.longValue() % ((long) cVar.b));
                    long jLongValue = l.longValue();
                    long[] jArr = cVar.c;
                    if (jLongValue <= jArr[iLongValue]) {
                        gVar.toString();
                        return;
                    }
                    jArr[iLongValue] = l.longValue();
                }
                q(gVar, fVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(i iVar, j2 j2Var, int i) {
        super(j2Var);
        this.y = i;
        this.z = iVar;
    }

    public k(i iVar, i iVar2, net.luminis.quic.log.a aVar) {
        this.y = 1;
        this.z = iVar;
        this.e = iVar2;
    }
}
