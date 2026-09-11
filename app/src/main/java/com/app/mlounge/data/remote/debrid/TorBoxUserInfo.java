package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxUserInfo {
    public static final int $stable = 0;

    @b("data")
    private final UserData data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class UserData {
        public static final int $stable = 0;

        @b("created_at")
        private final String createdAt;

        @b("customer")
        private final String customer;

        @b("email")
        private final String email;

        @b("id")
        private final int id;

        @b("is_subscribed")
        private final boolean isSubscribed;

        @b("plan")
        private final int plan;

        @b("premium_expires_at")
        private final String premiumExpiresAt;

        @b("total_downloaded")
        private final long totalDownloaded;

        @b("updated_at")
        private final String updatedAt;

        public final String a() {
            return this.email;
        }

        public final String b() {
            int i = this.plan;
            if (i == 1) {
                return "Essential";
            }
            if (i == 2) {
                return "Pro";
            }
            if (i != 3) {
                return i > 0 ? a.p("Premium (Plan ", i, ")") : "Free";
            }
            return "Standard";
        }

        public final String c() {
            return this.premiumExpiresAt;
        }

        public final boolean d() {
            String str;
            return (this.plan <= 0 || (str = this.premiumExpiresAt) == null || str.length() == 0) ? false : true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserData)) {
                return false;
            }
            UserData userData = (UserData) obj;
            return this.id == userData.id && l.a(this.email, userData.email) && this.plan == userData.plan && this.totalDownloaded == userData.totalDownloaded && l.a(this.customer, userData.customer) && this.isSubscribed == userData.isSubscribed && l.a(this.premiumExpiresAt, userData.premiumExpiresAt) && l.a(this.createdAt, userData.createdAt) && l.a(this.updatedAt, userData.updatedAt);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.id) * 31;
            String str = this.email;
            int iC = a.c(a.b(this.plan, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.totalDownloaded);
            String str2 = this.customer;
            int iF = a.f((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isSubscribed);
            String str3 = this.premiumExpiresAt;
            int iHashCode2 = (iF + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.createdAt;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.updatedAt;
            return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            int i = this.id;
            String str = this.email;
            int i2 = this.plan;
            long j = this.totalDownloaded;
            String str2 = this.customer;
            boolean z = this.isSubscribed;
            String str3 = this.premiumExpiresAt;
            String str4 = this.createdAt;
            String str5 = this.updatedAt;
            StringBuilder sb = new StringBuilder("UserData(id=");
            sb.append(i);
            sb.append(", email=");
            sb.append(str);
            sb.append(", plan=");
            sb.append(i2);
            sb.append(", totalDownloaded=");
            sb.append(j);
            sb.append(", customer=");
            sb.append(str2);
            sb.append(", isSubscribed=");
            sb.append(z);
            c.y(sb, ", premiumExpiresAt=", str3, ", createdAt=", str4);
            return c.k(sb, ", updatedAt=", str5, ")");
        }
    }

    public final UserData a() {
        return this.data;
    }

    public final boolean b() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxUserInfo)) {
            return false;
        }
        TorBoxUserInfo torBoxUserInfo = (TorBoxUserInfo) obj;
        return this.success == torBoxUserInfo.success && l.a(this.detail, torBoxUserInfo.detail) && l.a(this.error, torBoxUserInfo.error) && l.a(this.data, torBoxUserInfo.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserData userData = this.data;
        return iHashCode3 + (userData != null ? userData.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxUserInfo(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
