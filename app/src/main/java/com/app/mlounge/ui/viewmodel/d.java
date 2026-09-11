package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.debrid.AllDebridPinData;
import com.app.mlounge.data.remote.debrid.AllDebridUserInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final boolean b;
    public final AllDebridUserInfo c;
    public final AllDebridPinData d;
    public final boolean e;
    public final String f;

    public /* synthetic */ d(AllDebridUserInfo allDebridUserInfo, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : allDebridUserInfo, null, false, null);
    }

    public static d a(d dVar, boolean z, AllDebridUserInfo allDebridUserInfo, AllDebridPinData allDebridPinData, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? dVar.a : true;
        if ((i & 2) != 0) {
            z = dVar.b;
        }
        if ((i & 4) != 0) {
            allDebridUserInfo = dVar.c;
        }
        if ((i & 8) != 0) {
            allDebridPinData = dVar.d;
        }
        if ((i & 16) != 0) {
            z2 = dVar.e;
        }
        if ((i & 32) != 0) {
            str = dVar.f;
        }
        String str2 = str;
        dVar.getClass();
        boolean z4 = z2;
        AllDebridPinData allDebridPinData2 = allDebridPinData;
        return new d(z3, z, allDebridUserInfo, allDebridPinData2, z4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && kotlin.jvm.internal.l.a(this.c, dVar.c) && kotlin.jvm.internal.l.a(this.d, dVar.d) && this.e == dVar.e && kotlin.jvm.internal.l.a(this.f, dVar.f);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        AllDebridUserInfo allDebridUserInfo = this.c;
        int iHashCode = (iF + (allDebridUserInfo == null ? 0 : allDebridUserInfo.hashCode())) * 31;
        AllDebridPinData allDebridPinData = this.d;
        int iF2 = androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (allDebridPinData == null ? 0 : allDebridPinData.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iF2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AllDebridState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userInfo=" + this.c + ", pinData=" + this.d + ", isPolling=" + this.e + ", error=" + this.f + ")";
    }

    public d(boolean z, boolean z2, AllDebridUserInfo allDebridUserInfo, AllDebridPinData allDebridPinData, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = allDebridUserInfo;
        this.d = allDebridPinData;
        this.e = z3;
        this.f = str;
    }
}
