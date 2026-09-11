package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {
    public final n e;

    public /* synthetic */ r(n nVar) {
        super(null, null, false);
        this.e = nVar;
    }

    @Override // com.google.android.gms.common.s
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }
}
