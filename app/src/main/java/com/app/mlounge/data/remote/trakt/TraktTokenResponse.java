package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktTokenResponse {
    public static final int $stable = 0;

    @b("access_token")
    private final String accessToken;

    @b("created_at")
    private final Long createdAt;

    @b("expires_in")
    private final Long expiresIn;

    @b("refresh_token")
    private final String refreshToken;

    @b("scope")
    private final String scope;

    @b("token_type")
    private final String tokenType;

    public final String a() {
        return this.accessToken;
    }

    public final Long b() {
        return this.createdAt;
    }

    public final Long c() {
        return this.expiresIn;
    }

    public final String d() {
        return this.refreshToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktTokenResponse)) {
            return false;
        }
        TraktTokenResponse traktTokenResponse = (TraktTokenResponse) obj;
        return l.a(this.accessToken, traktTokenResponse.accessToken) && l.a(this.tokenType, traktTokenResponse.tokenType) && l.a(this.expiresIn, traktTokenResponse.expiresIn) && l.a(this.refreshToken, traktTokenResponse.refreshToken) && l.a(this.scope, traktTokenResponse.scope) && l.a(this.createdAt, traktTokenResponse.createdAt);
    }

    public final int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.expiresIn;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.refreshToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scope;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.createdAt;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.accessToken;
        String str2 = this.tokenType;
        Long l = this.expiresIn;
        String str3 = this.refreshToken;
        String str4 = this.scope;
        Long l2 = this.createdAt;
        StringBuilder sbO = c.o("TraktTokenResponse(accessToken=", str, ", tokenType=", str2, ", expiresIn=");
        sbO.append(l);
        sbO.append(", refreshToken=");
        sbO.append(str3);
        sbO.append(", scope=");
        sbO.append(str4);
        sbO.append(", createdAt=");
        sbO.append(l2);
        sbO.append(")");
        return sbO.toString();
    }
}
