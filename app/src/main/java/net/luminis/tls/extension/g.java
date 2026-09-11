package net.luminis.tls.extension;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public abstract byte[] a();

    public final int b(ByteBuffer byteBuffer, int i, int i2) throws net.luminis.tls.alert.a {
        if (byteBuffer.limit() - byteBuffer.position() < 4) {
            net.luminis.tls.engine.impl.c.g("extension underflow");
            return 0;
        }
        if ((byteBuffer.getShort() & 65535) != i) {
            org.mozilla.javascript.c.a();
            return 0;
        }
        int i3 = byteBuffer.getShort() & 65535;
        if (i3 >= i2) {
            if (byteBuffer.limit() - byteBuffer.position() >= i3) {
                return i3;
            }
            net.luminis.tls.engine.impl.c.g("extension underflow");
            return 0;
        }
        throw new net.luminis.tls.alert.a(getClass().getSimpleName() + " can't be less than " + i2 + " bytes", 2);
    }
}
