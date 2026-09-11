package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i c = new i(0, 0);
    public final int a;
    public final int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.b, "]", sb);
    }
}
