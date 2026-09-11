package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final k e;
    public final String f;
    public final String g;

    public x0(String str, String str2, int i, long j, k kVar, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = kVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.l.a(this.a, x0Var.a) && kotlin.jvm.internal.l.a(this.b, x0Var.b) && this.c == x0Var.c && this.d == x0Var.d && this.e.equals(x0Var.e) && this.f.equals(x0Var.f) && kotlin.jvm.internal.l.a(this.g, x0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.g, ')');
    }
}
