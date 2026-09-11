package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends UnsupportedOperationException {
    public final com.google.android.gms.common.d e;

    public k(com.google.android.gms.common.d dVar) {
        this.e = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.e));
    }
}
