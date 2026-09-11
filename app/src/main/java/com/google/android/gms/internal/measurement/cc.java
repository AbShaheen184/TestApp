package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends ec {
    public volatile long B;
    public final long C;

    public cc(String str, com.appsalt.internal.q0 q0Var, long j) {
        super(str, q0Var);
        this.C = j;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.C);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.B);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Long) obj).longValue();
    }
}
