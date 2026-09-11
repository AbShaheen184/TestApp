package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class mg extends og {
    public final /* synthetic */ og c;
    public final /* synthetic */ og d;

    public mg(og ogVar, og ogVar2) {
        this.c = ogVar;
        this.d = ogVar2;
    }

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        og ogVar = this.d;
        try {
            this.c.a();
        } finally {
            ogVar.a();
        }
    }
}
