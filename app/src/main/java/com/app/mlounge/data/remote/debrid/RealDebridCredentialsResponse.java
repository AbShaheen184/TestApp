package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridCredentialsResponse {
    public static final int $stable = 0;

    @b("client_id")
    private final String clientId = null;

    @b("client_secret")
    private final String clientSecret = null;

    @b("error")
    private final String error = null;

    public final String a() {
        return this.clientId;
    }

    public final String b() {
        return this.clientSecret;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealDebridCredentialsResponse)) {
            return false;
        }
        RealDebridCredentialsResponse realDebridCredentialsResponse = (RealDebridCredentialsResponse) obj;
        return l.a(this.clientId, realDebridCredentialsResponse.clientId) && l.a(this.clientSecret, realDebridCredentialsResponse.clientSecret) && l.a(this.error, realDebridCredentialsResponse.error);
    }

    public final int hashCode() {
        String str = this.clientId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientSecret;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.clientId;
        String str2 = this.clientSecret;
        return a.u(c.o("RealDebridCredentialsResponse(clientId=", str, ", clientSecret=", str2, ", error="), this.error, ")");
    }
}
