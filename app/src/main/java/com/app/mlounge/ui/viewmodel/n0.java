package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.RealDebridDeviceCodeResponse;
import com.app.mlounge.data.remote.debrid.RealDebridUserInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final boolean a;
    public final boolean b;
    public final RealDebridUserInfo c;
    public final RealDebridDeviceCodeResponse d;
    public final boolean e;
    public final String f;

    public /* synthetic */ n0(RealDebridUserInfo realDebridUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : realDebridUserInfo, null, false, null);
    }

    public static n0 a(n0 n0Var, boolean z, RealDebridUserInfo realDebridUserInfo, RealDebridDeviceCodeResponse realDebridDeviceCodeResponse, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? n0Var.a : true;
        if ((i & 2) != 0) {
            z = n0Var.b;
        }
        if ((i & 4) != 0) {
            realDebridUserInfo = n0Var.c;
        }
        if ((i & 8) != 0) {
            realDebridDeviceCodeResponse = n0Var.d;
        }
        if ((i & 16) != 0) {
            z2 = n0Var.e;
        }
        if ((i & 32) != 0) {
            str = n0Var.f;
        }
        String str2 = str;
        n0Var.getClass();
        boolean z4 = z2;
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse2 = realDebridDeviceCodeResponse;
        return new n0(z3, z, realDebridUserInfo, realDebridDeviceCodeResponse2, z4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && this.b == n0Var.b && kotlin.jvm.internal.l.a(this.c, n0Var.c) && kotlin.jvm.internal.l.a(this.d, n0Var.d) && this.e == n0Var.e && kotlin.jvm.internal.l.a(this.f, n0Var.f);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        RealDebridUserInfo realDebridUserInfo = this.c;
        int iHashCode = (iF + (realDebridUserInfo == null ? 0 : realDebridUserInfo.hashCode())) * 31;
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = this.d;
        int iF2 = androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (realDebridDeviceCodeResponse == null ? 0 : realDebridDeviceCodeResponse.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iF2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RealDebridState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", deviceCodeResponse=" + this.d + ", isPolling=" + this.e + ", error=" + this.f + ")";
    }

    public n0(boolean z, boolean z2, RealDebridUserInfo realDebridUserInfo, RealDebridDeviceCodeResponse realDebridDeviceCodeResponse, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = realDebridUserInfo;
        this.d = realDebridDeviceCodeResponse;
        this.e = z3;
        this.f = str;
    }
}
