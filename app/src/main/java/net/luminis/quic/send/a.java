package net.luminis.quic.send;

import java.util.function.Consumer;
import net.luminis.quic.frame.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    public final n a;
    public final Consumer b;

    public a(n nVar, Consumer consumer) {
        this.a = nVar;
        this.b = consumer;
    }

    @Override // net.luminis.quic.send.i
    public final int a() {
        return this.a.d();
    }

    @Override // net.luminis.quic.send.i
    public final Consumer b() {
        return this.b;
    }

    @Override // net.luminis.quic.send.i
    public final n c(int i) {
        return this.a;
    }
}
