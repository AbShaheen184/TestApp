package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxAuthResponse {
    public static final int $stable = 0;

    @b("data")
    private final AuthData data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AuthData {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthData)) {
                return false;
            }
            AuthData authData = (AuthData) obj;
            return l.a(this.deviceCode, authData.deviceCode) && l.a(this.userCode, authData.userCode) && l.a(this.verificationUrl, authData.verificationUrl) && this.expiresIn == authData.expiresIn && this.interval == authData.interval;
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
            StringBuilder sbO = c.o("AuthData(deviceCode=", str, ", userCode=", str2, ", verificationUrl=");
            sbO.append(str3);
            sbO.append(", expiresIn=");
            sbO.append(i);
            sbO.append(", interval=");
            return a.m(i2, ")", sbO);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxAuthResponse)) {
            return false;
        }
        TorBoxAuthResponse torBoxAuthResponse = (TorBoxAuthResponse) obj;
        return this.success == torBoxAuthResponse.success && l.a(this.detail, torBoxAuthResponse.detail) && l.a(this.error, torBoxAuthResponse.error) && l.a(this.data, torBoxAuthResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthData authData = this.data;
        return iHashCode3 + (authData != null ? authData.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxAuthResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
