package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktDeviceCodeResponse {
    public static final int $stable = 0;

    @b("device_code")
    private final String deviceCode;

    @b("expires_in")
    private final int expiresIn;

    @b("interval")
    private final int interval;

    @b("user_code")
    private final String userCode;

    @b("verification_url")
    private final String verificationUrl;

    public final String a() {
        return this.deviceCode;
    }

    public final int b() {
        return this.interval;
    }

    public final String c() {
        return this.userCode;
    }

    public final String d() {
        return this.verificationUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktDeviceCodeResponse)) {
            return false;
        }
        TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) obj;
        return l.a(this.deviceCode, traktDeviceCodeResponse.deviceCode) && l.a(this.userCode, traktDeviceCodeResponse.userCode) && l.a(this.verificationUrl, traktDeviceCodeResponse.verificationUrl) && this.expiresIn == traktDeviceCodeResponse.expiresIn && this.interval == traktDeviceCodeResponse.interval;
    }

    public final int hashCode() {
        return Integer.hashCode(this.interval) + a.b(this.expiresIn, a.e(a.e(this.deviceCode.hashCode() * 31, 31, this.userCode), 31, this.verificationUrl), 31);
    }

    public final String toString() {
        String str = this.deviceCode;
        String str2 = this.userCode;
        String str3 = this.verificationUrl;
        int i = this.expiresIn;
        int i2 = this.interval;
        StringBuilder sbO = c.o("TraktDeviceCodeResponse(deviceCode=", str, ", userCode=", str2, ", verificationUrl=");
        sbO.append(str3);
        sbO.append(", expiresIn=");
        sbO.append(i);
        sbO.append(", interval=");
        return a.m(i2, ")", sbO);
    }
}
