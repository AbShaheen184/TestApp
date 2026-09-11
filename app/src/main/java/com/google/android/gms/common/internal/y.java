package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Exception {
    public final com.google.android.gms.common.b e;

    public y(com.google.android.gms.common.b bVar) {
        x.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", (bVar.y == 0 || bVar.z == null) ? false : true);
        this.e = bVar;
    }
}
