package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends ec {
    public volatile boolean B;
    public final boolean C;

    public ac(String str, com.appsalt.internal.q0 q0Var, boolean z) {
        super(str, q0Var);
        this.C = z;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.C);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.B);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Boolean) obj).booleanValue();
    }
}
