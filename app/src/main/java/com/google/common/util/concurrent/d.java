package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d c;
    public static final d d;
    public final boolean a;
    public final Throwable b;

    static {
        if (r.A) {
            d = null;
            c = null;
        } else {
            d = new d(null, false);
            c = new d(null, true);
        }
    }

    public d(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
