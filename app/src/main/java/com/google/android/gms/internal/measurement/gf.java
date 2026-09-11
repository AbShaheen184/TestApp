package com.google.android.gms.internal.measurement;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class gf extends ze implements ye {
    public final Exception D;
    public final boolean E;

    /* JADX WARN: Multi-variable type inference failed */
    public gf(String str, ye yeVar, mf mfVar, boolean z, pf pfVar) {
        super("<missing root>:".concat(str), (we) yeVar, mf.a(mfVar, lf.f), pfVar);
        this.D = yeVar.b();
        this.E = z;
    }

    @Override // com.google.android.gms.internal.measurement.ye
    public final gf M(String str, mf mfVar, boolean z, pf pfVar) {
        boolean z2 = this.E;
        if (z && !z2) {
            AtomicReference atomicReference = bf.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new gf(str, this, mfVar, z3, pfVar);
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final qf T(String str, mf mfVar, pf pfVar) {
        AtomicReference atomicReference = bf.a;
        return M(str, mfVar, true, pfVar);
    }

    @Override // com.google.android.gms.internal.measurement.ye
    public final Exception b() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf h() {
        return lf.e;
    }

    public gf(UUID uuid, String str, String str2, mf mfVar, Exception exc, pf pfVar) {
        super("<missing root>:".concat(str2), uuid, str, mf.a(mfVar, lf.f), pfVar);
        this.D = exc;
        this.E = false;
    }
}
