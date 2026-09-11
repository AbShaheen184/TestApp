package net.luminis.quic.frame;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public abstract void a(net.luminis.quic.impl.i iVar, net.luminis.quic.packet.g gVar, Long l);

    public abstract int d();

    public boolean e() {
        return !(this instanceof a);
    }

    public abstract void f(ByteBuffer byteBuffer);
}
