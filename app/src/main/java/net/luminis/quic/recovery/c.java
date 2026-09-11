package net.luminis.quic.recovery;

import net.luminis.quic.send.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ k y;

    public /* synthetic */ c(int i, k kVar) {
        this.e = i;
        this.y = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.j();
                break;
            default:
                k kVar = this.y;
                try {
                    kVar.s = true;
                    while (kVar.s) {
                        kVar.c();
                    }
                    break;
                } catch (Throwable th) {
                    boolean z = kVar.s;
                    net.luminis.quic.log.a aVar = kVar.g;
                    if (z) {
                        aVar.f("Sender thread aborted with exception", th);
                        kVar.d.a(th);
                        return;
                    } else {
                        th.toString();
                        aVar.getClass();
                    }
                }
                break;
        }
    }
}
