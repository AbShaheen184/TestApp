package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class s {
    public static final s d = new s(null, null, true);
    public final boolean a;
    public final String b;
    public final Throwable c;

    public s(Exception exc, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static s b(String str) {
        return new s(null, str, false);
    }

    public static s c(Exception exc, String str) {
        return new s(exc, str, false);
    }

    public String a() {
        return this.b;
    }
}
