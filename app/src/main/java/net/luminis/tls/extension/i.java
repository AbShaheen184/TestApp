package net.luminis.tls.extension;

import java.security.PublicKey;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public net.luminis.tls.f a;
    public final PublicKey b;

    public i(net.luminis.tls.f fVar, PublicKey publicKey) {
        this.a = fVar;
        this.b = publicKey;
    }

    public PublicKey a() {
        return this.b;
    }
}
