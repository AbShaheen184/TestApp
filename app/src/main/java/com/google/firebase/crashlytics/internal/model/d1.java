package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public f1 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.e == 1 && (f1Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new e1(f1Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.datatransport.runtime.backends.c.s("Missing required properties:", sb));
        return null;
    }
}
