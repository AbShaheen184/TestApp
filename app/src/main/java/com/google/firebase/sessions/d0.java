package com.google.firebase.sessions;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final c0 Companion = new c0();
    public final int a;
    public final String b;

    public /* synthetic */ d0(int i, int i2, String str) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.m0.e(i, 3, b0.a.d());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && kotlin.jvm.internal.l.a(this.b, d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, this.b, ')');
    }

    public d0(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
