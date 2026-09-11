package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AllDebridUserInfo {
    public static final int $stable = 0;

    @b("email")
    private final String email;

    @b("isPremium")
    private final boolean isPremium;

    @b("isSubscribed")
    private final boolean isSubscribed;

    @b("isTrial")
    private final boolean isTrial;

    @b("premiumUntil")
    private final long premiumUntil;

    @b("username")
    private final String username;

    public final String a() {
        return this.email;
    }

    public final String b() {
        return this.username;
    }

    public final boolean c() {
        return this.isPremium;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllDebridUserInfo)) {
            return false;
        }
        AllDebridUserInfo allDebridUserInfo = (AllDebridUserInfo) obj;
        return l.a(this.username, allDebridUserInfo.username) && l.a(this.email, allDebridUserInfo.email) && this.isPremium == allDebridUserInfo.isPremium && this.isSubscribed == allDebridUserInfo.isSubscribed && this.isTrial == allDebridUserInfo.isTrial && this.premiumUntil == allDebridUserInfo.premiumUntil;
    }

    public final int hashCode() {
        return Long.hashCode(this.premiumUntil) + a.f(a.f(a.f(a.e(this.username.hashCode() * 31, 31, this.email), 31, this.isPremium), 31, this.isSubscribed), 31, this.isTrial);
    }

    public final String toString() {
        String str = this.username;
        String str2 = this.email;
        boolean z = this.isPremium;
        boolean z2 = this.isSubscribed;
        boolean z3 = this.isTrial;
        long j = this.premiumUntil;
        StringBuilder sbO = c.o("AllDebridUserInfo(username=", str, ", email=", str2, ", isPremium=");
        sbO.append(z);
        sbO.append(", isSubscribed=");
        sbO.append(z2);
        sbO.append(", isTrial=");
        sbO.append(z3);
        sbO.append(", premiumUntil=");
        sbO.append(j);
        sbO.append(")");
        return sbO.toString();
    }
}
