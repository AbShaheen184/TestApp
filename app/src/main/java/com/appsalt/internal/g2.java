package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    public final String a;
    public int b;
    public final p3 c;

    public g2(String str, int i, p3 p3Var) {
        this.a = str;
        this.b = i;
        this.c = p3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return kotlin.jvm.internal.l.a(this.a, g2Var.a) && this.b == g2Var.b && this.c.equals(g2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Message(id=" + ((Object) ("MessageId(value=" + this.a + ')')) + ", streamId=" + this.b + ", event=" + this.c + ')';
    }
}
