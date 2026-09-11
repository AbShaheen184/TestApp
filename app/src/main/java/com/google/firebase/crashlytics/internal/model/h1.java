package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final i1 a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new i1(this.a, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        if (this.c == null) {
            sb.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            sb.append(" jailbroken");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }
}
