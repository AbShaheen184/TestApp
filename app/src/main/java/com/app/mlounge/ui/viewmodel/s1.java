package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.TorBoxUserInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public final boolean a;
    public final boolean b;
    public final TorBoxUserInfo c;
    public final String d;

    public /* synthetic */ s1(TorBoxUserInfo torBoxUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : torBoxUserInfo, null);
    }

    public static s1 a(s1 s1Var, boolean z, TorBoxUserInfo torBoxUserInfo, String str, int i) {
        boolean z2 = (i & 1) != 0 ? s1Var.a : true;
        if ((i & 4) != 0) {
            torBoxUserInfo = s1Var.c;
        }
        if ((i & 8) != 0) {
            str = s1Var.d;
        }
        s1Var.getClass();
        return new s1(z2, z, torBoxUserInfo, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a == s1Var.a && this.b == s1Var.b && kotlin.jvm.internal.l.a(this.c, s1Var.c) && kotlin.jvm.internal.l.a(this.d, s1Var.d);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        TorBoxUserInfo torBoxUserInfo = this.c;
        int iHashCode = (iF + (torBoxUserInfo == null ? 0 : torBoxUserInfo.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", error=" + this.d + ")";
    }

    public s1(boolean z, boolean z2, TorBoxUserInfo torBoxUserInfo, String str) {
        this.a = z;
        this.b = z2;
        this.c = torBoxUserInfo;
        this.d = str;
    }
}
