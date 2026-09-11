package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends ec {
    public volatile String B;
    public final String C;

    public dc(String str, com.appsalt.internal.q0 q0Var, String str2) {
        super(str, q0Var);
        this.C = str2;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return str;
    }
}
