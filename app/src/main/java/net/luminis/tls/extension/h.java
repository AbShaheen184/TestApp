package net.luminis.tls.extension;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    public final ECPublicKey c;

    public h(net.luminis.tls.f fVar, ECPublicKey eCPublicKey) {
        super(fVar, eCPublicKey);
        this.a = fVar;
        this.c = eCPublicKey;
    }

    @Override // net.luminis.tls.extension.i
    public final PublicKey a() {
        return this.c;
    }
}
