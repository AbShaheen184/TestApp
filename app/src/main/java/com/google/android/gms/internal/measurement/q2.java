package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends RuntimeException {
    public q2() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final t1 a() {
        return new t1(getMessage());
    }
}
