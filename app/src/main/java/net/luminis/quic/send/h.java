package net.luminis.quic.send;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final net.luminis.quic.impl.j c = new net.luminis.quic.impl.j(1);
    public final net.luminis.quic.packet.g a;
    public final Consumer b;

    public h(net.luminis.quic.packet.g gVar) {
        this.a = gVar;
        this.b = c;
    }

    public final String toString() {
        return this.a.toString();
    }

    public h(net.luminis.quic.packet.g gVar, f fVar) {
        this.a = gVar;
        this.b = fVar;
    }
}
