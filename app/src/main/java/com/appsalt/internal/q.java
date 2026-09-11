package com.appsalt.internal;

import com.appsalt.lib.sdk.quic.signature.LegacyRsaSignatureAdapter;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Provider {
    public q() {
        super("Android RSA Provider", 1.3d, "Legacy RSASSA-PSS adapter for android");
        put("Signature.RSASSA-PSS", kotlin.jvm.internal.a0.a(LegacyRsaSignatureAdapter.class).b());
        put("Signature.RSASSA-PSS ImplementedIn", "Software");
    }
}
