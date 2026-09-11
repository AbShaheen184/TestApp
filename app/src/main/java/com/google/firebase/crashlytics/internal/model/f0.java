package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q1 {
    public final String a;
    public final String b;

    public f0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        f0 f0Var = (f0) ((q1) obj);
        return this.a.equals(f0Var.a) && this.b.equals(f0Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.b, "}");
    }
}
