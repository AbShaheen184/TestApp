package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final boolean a;
    public final boolean b;
    public final PremiumizeUserInfo c;
    public final String d;

    public /* synthetic */ k0(PremiumizeUserInfo premiumizeUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : premiumizeUserInfo, null);
    }

    public static k0 a(k0 k0Var, boolean z, PremiumizeUserInfo premiumizeUserInfo, String str, int i) {
        boolean z2 = (i & 1) != 0 ? k0Var.a : true;
        if ((i & 4) != 0) {
            premiumizeUserInfo = k0Var.c;
        }
        if ((i & 8) != 0) {
            str = k0Var.d;
        }
        k0Var.getClass();
        return new k0(z2, z, premiumizeUserInfo, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a == k0Var.a && this.b == k0Var.b && kotlin.jvm.internal.l.a(this.c, k0Var.c) && kotlin.jvm.internal.l.a(this.d, k0Var.d);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        PremiumizeUserInfo premiumizeUserInfo = this.c;
        int iHashCode = (iF + (premiumizeUserInfo == null ? 0 : premiumizeUserInfo.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", error=" + this.d + ")";
    }

    public k0(boolean z, boolean z2, PremiumizeUserInfo premiumizeUserInfo, String str) {
        this.a = z;
        this.b = z2;
        this.c = premiumizeUserInfo;
        this.d = str;
    }
}
