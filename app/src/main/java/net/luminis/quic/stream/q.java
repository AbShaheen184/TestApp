package net.luminis.quic.stream;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ q(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                r.m(this.b, (net.luminis.quic.frame.n) obj);
                break;
            case 1:
                r rVar = this.b;
                rVar.e.b.j((net.luminis.quic.frame.n) obj, new q(rVar, 1), false);
                break;
            default:
                r rVar2 = this.b;
                e eVar = rVar2.e;
                eVar.b.i(new p(rVar2, 2), com.google.android.material.textfield.p.b(eVar.a) + 9, 4, new q(rVar2, 2), true);
                break;
        }
    }
}
