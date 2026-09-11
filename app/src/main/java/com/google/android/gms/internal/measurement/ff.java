package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ff extends we implements ye {
    public static final androidx.compose.runtime.snapshots.g D = new androidx.compose.runtime.snapshots.g(7);
    public final Exception C;

    public ff(UUID uuid, String str, Exception exc, pf pfVar) {
        super("<missing root>", uuid, str, pfVar);
        this.C = exc;
    }

    @Override // com.google.android.gms.internal.measurement.ye
    public final gf M(String str, mf mfVar, boolean z, pf pfVar) {
        if (z) {
            AtomicReference atomicReference = bf.a;
        }
        return new gf(str, this, mfVar, z, pfVar);
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final qf T(String str, mf mfVar, pf pfVar) {
        AtomicReference atomicReference = bf.a;
        return M(str, mfVar, true, pfVar);
    }

    @Override // com.google.android.gms.internal.measurement.ye
    public final Exception b() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf c() {
        return lf.e;
    }
}
