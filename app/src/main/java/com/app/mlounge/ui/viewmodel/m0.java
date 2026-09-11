package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public final String a;
    public final l0 b;
    public final int c;

    public m0(String str, l0 l0Var, int i) {
        str.getClass();
        this.a = str;
        this.b = l0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.l.a(this.a, m0Var.a) && this.b == m0Var.b && this.c == m0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProviderStatus(name=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", streamCount=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.c, ")", sb);
    }
}
