package net.luminis.quic.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ i y;

    public /* synthetic */ h(i iVar, int i) {
        this.e = i;
        this.y = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                i iVar = this.y;
                Thread threadCurrentThread = Thread.currentThread();
                net.luminis.quic.crypto.d dVar = iVar.B;
                o oVar = iVar.e;
                net.luminis.quic.cid.b bVar = iVar.Y;
                iVar.V = new net.luminis.quic.packet.a(dVar, oVar, bVar.a, bVar.h, new k(iVar, new k(new k(iVar, new k(iVar, iVar, iVar.z), 2)), 0), new kotlinx.coroutines.future.a(iVar, 2), iVar.z);
                com.google.android.material.internal.b bVar2 = new com.google.android.material.internal.b(iVar.V);
                int i = 0;
                while (!threadCurrentThread.isInterrupted()) {
                    try {
                        net.luminis.quic.receive.a aVar = (net.luminis.quic.receive.a) iVar.U.f.poll(15, TimeUnit.SECONDS);
                        if (aVar != null) {
                            System.currentTimeMillis();
                            net.luminis.quic.log.a aVar2 = iVar.z;
                            i++;
                            aVar.b.limit();
                            aVar.b.limit();
                            aVar2.getClass();
                            iVar.z.getClass();
                            bVar2.y(aVar.b, new net.luminis.quic.packet.f(aVar.a, i));
                            iVar.T.j();
                            ArrayList arrayList = iVar.G;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            arrayList.clear();
                            net.luminis.quic.send.k kVar = iVar.T;
                            iVar.U.f.isEmpty();
                            kVar.getClass();
                        }
                    } catch (InterruptedException unused) {
                        iVar.z.getClass();
                        return;
                    } catch (Exception e) {
                        iVar.z.getClass();
                        iVar.a(e);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                i iVar2 = this.y;
                iVar2.T.b(1, "first Handshake message is being sent");
                net.luminis.quic.crypto.d dVar2 = iVar2.B;
                dVar2.j[androidx.constraintlayout.core.g.e(1)] = true;
                dVar2.f[androidx.constraintlayout.core.g.e(1)] = null;
                dVar2.g[androidx.constraintlayout.core.g.e(1)] = null;
                break;
            case 2:
                this.y.l();
                break;
            case 3:
                this.y.l();
                break;
            default:
                this.y.l();
                break;
        }
    }
}
