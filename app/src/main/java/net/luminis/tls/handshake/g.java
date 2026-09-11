package net.luminis.tls.handshake;

import java.security.SecureRandom;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    public static final byte[] e = {-49, 33, -83, 116, -27, -102, 97, 17, -66, 29, -116, 2, 30, 101, -72, -111, -62, -94, 17, 22, 122, -69, -116, 94, 7, -98, 9, -30, -56, -88, 51, -100};
    public byte[] a;
    public byte[] b;
    public net.luminis.tls.c c;
    public List d;

    static {
        new SecureRandom();
    }

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        return this.a;
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.server_hello;
    }
}
