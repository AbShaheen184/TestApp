package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze extends we {
    public final mf C;

    public ze(String str, we weVar, mf mfVar, pf pfVar) {
        super(str, weVar, pfVar);
        com.google.android.material.motion.a.f(mfVar.c);
        this.C = mfVar;
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final mf c() {
        return mf.a(this.C, h());
    }

    public ze(String str, UUID uuid, String str2, mf mfVar, pf pfVar) {
        super(str, uuid, str2, pfVar);
        com.google.android.material.motion.a.f(mfVar.c);
        this.C = mfVar;
    }
}
