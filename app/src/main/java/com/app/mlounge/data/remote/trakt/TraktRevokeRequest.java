package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktRevokeRequest {
    public static final int $stable = 0;

    @b("client_id")
    private final String clientId;

    @b("client_secret")
    private final String clientSecret;

    @b("token")
    private final String token;

    public TraktRevokeRequest(String str) {
        str.getClass();
        this.token = str;
        this.clientId = TraktManager.CLIENT_ID;
        this.clientSecret = TraktManager.CLIENT_SECRET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktRevokeRequest)) {
            return false;
        }
        TraktRevokeRequest traktRevokeRequest = (TraktRevokeRequest) obj;
        return l.a(this.token, traktRevokeRequest.token) && l.a(this.clientId, traktRevokeRequest.clientId) && l.a(this.clientSecret, traktRevokeRequest.clientSecret);
    }

    public final int hashCode() {
        return this.clientSecret.hashCode() + a.e(this.token.hashCode() * 31, 31, this.clientId);
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.clientId;
        return a.u(c.o("TraktRevokeRequest(token=", str, ", clientId=", str2, ", clientSecret="), this.clientSecret, ")");
    }
}
