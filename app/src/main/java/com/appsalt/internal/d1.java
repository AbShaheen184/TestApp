package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends s1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final t e;

    public d1(String str, String str2, int i, int i2, t tVar) {
        super(str);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.l.a(this.a, d1Var.a) && kotlin.jvm.internal.l.a(this.b, d1Var.b) && this.c == d1Var.c && this.d == d1Var.d && this.e == d1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((androidx.constraintlayout.core.g.e(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Connect(proxyId=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", port=");
        sb.append(this.c);
        sb.append(", protocol=");
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "TCP";
        } else {
            str = "UDP";
        }
        sb.append(str);
        sb.append(", ipType=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
