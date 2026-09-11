package net.luminis.tls.handshake;

import net.luminis.tls.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    public h a;
    public byte[] b;
    public byte[] c;

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        return this.c;
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        return net.luminis.tls.e.certificate_verify;
    }
}
