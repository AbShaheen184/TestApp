package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeUserInfo {
    public static final int $stable = 0;

    @b("customer_id")
    private final String customerId;

    @b("limit_used")
    private final Double limitUsed;

    @b("message")
    private final String message;

    @b("premium_until")
    private final Long premiumUntil;

    @b("space_used")
    private final Long spaceUsed;

    @b("status")
    private final String status;

    public final String a() {
        return this.customerId;
    }

    public final Double b() {
        return this.limitUsed;
    }

    public final Long c() {
        return this.premiumUntil;
    }

    public final boolean d() {
        Long l = this.premiumUntil;
        return l != null && l.longValue() > System.currentTimeMillis() / ((long) 1000);
    }

    public final boolean e() {
        return l.a(this.status, "success");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumizeUserInfo)) {
            return false;
        }
        PremiumizeUserInfo premiumizeUserInfo = (PremiumizeUserInfo) obj;
        return l.a(this.status, premiumizeUserInfo.status) && l.a(this.message, premiumizeUserInfo.message) && l.a(this.customerId, premiumizeUserInfo.customerId) && l.a(this.premiumUntil, premiumizeUserInfo.premiumUntil) && l.a(this.limitUsed, premiumizeUserInfo.limitUsed) && l.a(this.spaceUsed, premiumizeUserInfo.spaceUsed);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.premiumUntil;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.limitUsed;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Long l2 = this.spaceUsed;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.status;
        String str2 = this.message;
        String str3 = this.customerId;
        Long l = this.premiumUntil;
        Double d = this.limitUsed;
        Long l2 = this.spaceUsed;
        StringBuilder sbO = c.o("PremiumizeUserInfo(status=", str, ", message=", str2, ", customerId=");
        sbO.append(str3);
        sbO.append(", premiumUntil=");
        sbO.append(l);
        sbO.append(", limitUsed=");
        sbO.append(d);
        sbO.append(", spaceUsed=");
        sbO.append(l2);
        sbO.append(")");
        return sbO.toString();
    }
}
