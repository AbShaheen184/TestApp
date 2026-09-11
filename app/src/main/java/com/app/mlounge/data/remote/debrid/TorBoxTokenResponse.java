package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxTokenResponse {
    public static final int $stable = 0;

    @b("data")
    private final TokenData data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class TokenData {
        public static final int $stable = 0;

        @b("access_token")
        private final String accessToken;

        @b("token")
        private final String token;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenData)) {
                return false;
            }
            TokenData tokenData = (TokenData) obj;
            return l.a(this.token, tokenData.token) && l.a(this.accessToken, tokenData.accessToken);
        }

        public final int hashCode() {
            String str = this.token;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accessToken;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return c.j("TokenData(token=", this.token, ", accessToken=", this.accessToken, ")");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxTokenResponse)) {
            return false;
        }
        TorBoxTokenResponse torBoxTokenResponse = (TorBoxTokenResponse) obj;
        return this.success == torBoxTokenResponse.success && l.a(this.detail, torBoxTokenResponse.detail) && l.a(this.error, torBoxTokenResponse.error) && l.a(this.data, torBoxTokenResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TokenData tokenData = this.data;
        return iHashCode3 + (tokenData != null ? tokenData.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxTokenResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
