package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class hf extends ze {
    public static final hf D;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        D = new hf("<skip trace>", uuidRandomUUID, we.a(uuidRandomUUID), lf.e, bf.c());
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final qf T(String str, mf mfVar, pf pfVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf h() {
        return lf.e;
    }
}
