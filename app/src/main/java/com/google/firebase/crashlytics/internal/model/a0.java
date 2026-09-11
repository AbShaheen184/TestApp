package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public m2 j;
    public s1 k;
    public p1 l;
    public byte m;

    public final b0 a() {
        if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
            return new b0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sdkVersion");
        }
        if (this.b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb.append(" platform");
        }
        if (this.d == null) {
            sb.append(" installationUuid");
        }
        if (this.h == null) {
            sb.append(" buildVersion");
        }
        if (this.i == null) {
            sb.append(" displayVersion");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }
}
