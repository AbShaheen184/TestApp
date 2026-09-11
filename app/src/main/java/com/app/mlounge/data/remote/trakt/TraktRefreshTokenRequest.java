package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktRefreshTokenRequest {
    public static final int $stable = 0;

    @b("refresh_token")
    private final String refreshToken;

    @b("client_id")
    private final String clientId = TraktManager.CLIENT_ID;

    @b("client_secret")
    private final String clientSecret = TraktManager.CLIENT_SECRET;

    @b("redirect_uri")
    private final String redirectUri = "urn:ietf:wg:oauth:2.0:oob";

    @b("grant_type")
    private final String grantType = "refresh_token";

    public TraktRefreshTokenRequest(String str) {
        this.refreshToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktRefreshTokenRequest)) {
            return false;
        }
        TraktRefreshTokenRequest traktRefreshTokenRequest = (TraktRefreshTokenRequest) obj;
        return l.a(this.refreshToken, traktRefreshTokenRequest.refreshToken) && l.a(this.clientId, traktRefreshTokenRequest.clientId) && l.a(this.clientSecret, traktRefreshTokenRequest.clientSecret) && l.a(this.redirectUri, traktRefreshTokenRequest.redirectUri) && l.a(this.grantType, traktRefreshTokenRequest.grantType);
    }

    public final int hashCode() {
        return this.grantType.hashCode() + a.e(a.e(a.e(this.refreshToken.hashCode() * 31, 31, this.clientId), 31, this.clientSecret), 31, this.redirectUri);
    }

    public final String toString() {
        String str = this.refreshToken;
        String str2 = this.clientId;
        String str3 = this.clientSecret;
        String str4 = this.redirectUri;
        String str5 = this.grantType;
        StringBuilder sbO = c.o("TraktRefreshTokenRequest(refreshToken=", str, ", clientId=", str2, ", clientSecret=");
        c.y(sbO, str3, ", redirectUri=", str4, ", grantType=");
        return a.u(sbO, str5, ")");
    }
}
