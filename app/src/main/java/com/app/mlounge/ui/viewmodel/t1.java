package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.trakt.TraktDeviceCodeResponse;
import com.app.mlounge.data.remote.trakt.TraktUserSettings;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public final boolean a;
    public final boolean b;
    public final TraktUserSettings c;
    public final TraktDeviceCodeResponse d;
    public final boolean e;
    public final String f;

    public /* synthetic */ t1(TraktUserSettings traktUserSettings, int i) {
        this((i & 1) == 0, false, (i & 4) != 0 ? null : traktUserSettings, null, false, null);
    }

    public static t1 a(t1 t1Var, boolean z, TraktUserSettings traktUserSettings, TraktDeviceCodeResponse traktDeviceCodeResponse, boolean z2, String str, int i) {
        boolean z3 = (i & 1) != 0 ? t1Var.a : true;
        if ((i & 2) != 0) {
            z = t1Var.b;
        }
        if ((i & 4) != 0) {
            traktUserSettings = t1Var.c;
        }
        if ((i & 8) != 0) {
            traktDeviceCodeResponse = t1Var.d;
        }
        if ((i & 16) != 0) {
            z2 = t1Var.e;
        }
        if ((i & 32) != 0) {
            str = t1Var.f;
        }
        String str2 = str;
        t1Var.getClass();
        boolean z4 = z2;
        TraktDeviceCodeResponse traktDeviceCodeResponse2 = traktDeviceCodeResponse;
        return new t1(z3, z, traktUserSettings, traktDeviceCodeResponse2, z4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a == t1Var.a && this.b == t1Var.b && kotlin.jvm.internal.l.a(this.c, t1Var.c) && kotlin.jvm.internal.l.a(this.d, t1Var.d) && this.e == t1Var.e && kotlin.jvm.internal.l.a(this.f, t1Var.f);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b);
        TraktUserSettings traktUserSettings = this.c;
        int iHashCode = (iF + (traktUserSettings == null ? 0 : traktUserSettings.hashCode())) * 31;
        TraktDeviceCodeResponse traktDeviceCodeResponse = this.d;
        int iF2 = androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (traktDeviceCodeResponse == null ? 0 : traktDeviceCodeResponse.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iF2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TraktState(isLoggedIn=" + this.a + ", isLoading=" + this.b + ", userSettings=" + this.c + ", authResponse=" + this.d + ", isPolling=" + this.e + ", error=" + this.f + ")";
    }

    public t1(boolean z, boolean z2, TraktUserSettings traktUserSettings, TraktDeviceCodeResponse traktDeviceCodeResponse, boolean z3, String str) {
        this.a = z;
        this.b = z2;
        this.c = traktUserSettings;
        this.d = traktDeviceCodeResponse;
        this.e = z3;
        this.f = str;
    }
}
