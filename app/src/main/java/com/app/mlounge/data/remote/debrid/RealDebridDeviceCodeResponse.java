package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class RealDebridDeviceCodeResponse {
    public static final int $stable = 0;

    @b("device_code")
    private final String deviceCode;

    @b("expires_in")
    private final int expiresIn;
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
        if (!(obj instanceof RealDebridDeviceCodeResponse)) {
            return false;
        }
        RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = (RealDebridDeviceCodeResponse) obj;
        return l.a(this.deviceCode, realDebridDeviceCodeResponse.deviceCode) && l.a(this.userCode, realDebridDeviceCodeResponse.userCode) && this.interval == realDebridDeviceCodeResponse.interval && this.expiresIn == realDebridDeviceCodeResponse.expiresIn && l.a(this.verificationUrl, realDebridDeviceCodeResponse.verificationUrl);
    }

    public final int hashCode() {
        return this.verificationUrl.hashCode() + a.b(this.expiresIn, a.b(this.interval, a.e(this.deviceCode.hashCode() * 31, 31, this.userCode), 31), 31);
    }

    public final String toString() {
        String str = this.deviceCode;
        String str2 = this.userCode;
        int i = this.interval;
        int i2 = this.expiresIn;
        String str3 = this.verificationUrl;
        StringBuilder sbO = c.o("RealDebridDeviceCodeResponse(deviceCode=", str, ", userCode=", str2, ", interval=");
        sbO.append(i);
        sbO.append(", expiresIn=");
        sbO.append(i2);
        sbO.append(", verificationUrl=");
        return a.u(sbO, str3, ")");
    }
}
