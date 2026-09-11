package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridTokenResponse {
    public static final int $stable = 0;

    @b("access_token")
    private final String accessToken = null;

    @b("expires_in")
    private final Integer expiresIn = null;

    @b("token_type")
    private final String tokenType = null;

    @b("refresh_token")
    private final String refreshToken = null;

    @b("error")
    private final String error = null;

    public final String a() {
        return this.accessToken;
    }

    public final String b() {
        return this.error;
    }

    public final Integer c() {
        return this.expiresIn;
    }

    public final String d() {
        return this.refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealDebridTokenResponse)) {
            return false;
        }
        RealDebridTokenResponse realDebridTokenResponse = (RealDebridTokenResponse) obj;
        return l.a(this.accessToken, realDebridTokenResponse.accessToken) && l.a(this.expiresIn, realDebridTokenResponse.expiresIn) && l.a(this.tokenType, realDebridTokenResponse.tokenType) && l.a(this.refreshToken, realDebridTokenResponse.refreshToken) && l.a(this.error, realDebridTokenResponse.error);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expiresIn;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.tokenType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.error;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessToken;
        Integer num = this.expiresIn;
        String str2 = this.tokenType;
        String str3 = this.refreshToken;
        String str4 = this.error;
        StringBuilder sb = new StringBuilder("RealDebridTokenResponse(accessToken=");
        sb.append(str);
        sb.append(", expiresIn=");
        sb.append(num);
        sb.append(", tokenType=");
        c.y(sb, str2, ", refreshToken=", str3, ", error=");
        return a.u(sb, str4, ")");
    }
}
