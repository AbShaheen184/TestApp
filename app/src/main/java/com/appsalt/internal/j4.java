package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements c2 {
    public final String a;
    public final String b;
    public final int c;
    public final byte d;
    public final t e;

    public j4(String str, String str2, int i, byte b, t tVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = b;
        this.e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.a.equals(j4Var.a) && kotlin.jvm.internal.l.a(this.b, j4Var.b) && this.c == j4Var.c && this.d == j4Var.d && this.e == j4Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((Byte.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        return "Connect(id=" + this.a + ", host=" + this.b + ", port=" + this.c + ", protocol=" + ((int) this.d) + ", ipType=" + this.e + ')';
    }
}
