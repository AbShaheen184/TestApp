package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final boolean a;
    public final String b;

    public q(String str, int i) {
        boolean z = (i & 1) == 0;
        str = (i & 4) != 0 ? null : str;
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && kotlin.jvm.internal.l.a(this.b, qVar.b);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, false);
        String str = this.b;
        return (iF + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "EasyNewsState(isLoggedIn=" + this.a + ", isLoading=false, username=" + this.b + ", error=null)";
    }
}
