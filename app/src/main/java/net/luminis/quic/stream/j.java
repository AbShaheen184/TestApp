package net.luminis.quic.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ j(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                k.L(this.b, (net.luminis.quic.frame.n) obj);
                break;
            default:
                k kVar = this.b;
                net.luminis.quic.frame.n nVar = (net.luminis.quic.frame.n) obj;
                g gVar = kVar.B;
                if (gVar.e < 0 || gVar.c != gVar.e) {
                    kVar.e.b.j(nVar, new j(kVar, 1), false);
                }
                break;
        }
    }
}
