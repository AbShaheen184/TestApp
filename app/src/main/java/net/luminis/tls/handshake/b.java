package net.luminis.tls.handshake;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {
    public final /* synthetic */ int a;
    public byte[] b;
    public Object c;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // net.luminis.tls.handshake.e
    public final byte[] a() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            default:
                return (byte[]) this.c;
        }
    }

    @Override // net.luminis.tls.handshake.e
    public final net.luminis.tls.e b() {
        switch (this.a) {
            case 0:
                return net.luminis.tls.e.certificate_request;
            case 1:
                return net.luminis.tls.e.encrypted_extensions;
            default:
                return net.luminis.tls.e.finished;
        }
    }
}
