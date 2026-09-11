package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktUser {
    public static final int $stable = 0;
    private final TraktUserIds ids;

    @b("private")
    private final Boolean isPrivate;

    @b("joined_at")
    private final String joinedAt;
    private final String name;
    private final String username;
    private final Boolean vip;

    @b("vip_ep")
    private final Boolean vipEp;

    public final String a() {
        return this.joinedAt;
    }

    public final String b() {
        return this.name;
    }

    public final String c() {
        return this.username;
    }

    public final Boolean d() {
        return this.vip;
    }

    public final Boolean e() {
        return this.vipEp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktUser)) {
            return false;
        }
        TraktUser traktUser = (TraktUser) obj;
        return l.a(this.username, traktUser.username) && l.a(this.name, traktUser.name) && l.a(this.isPrivate, traktUser.isPrivate) && l.a(this.vip, traktUser.vip) && l.a(this.vipEp, traktUser.vipEp) && l.a(this.ids, traktUser.ids) && l.a(this.joinedAt, traktUser.joinedAt);
    }

    public final int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isPrivate;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.vip;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.vipEp;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        TraktUserIds traktUserIds = this.ids;
        int iHashCode6 = (iHashCode5 + (traktUserIds == null ? 0 : traktUserIds.hashCode())) * 31;
        String str3 = this.joinedAt;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.username;
        String str2 = this.name;
        Boolean bool = this.isPrivate;
        Boolean bool2 = this.vip;
        Boolean bool3 = this.vipEp;
        TraktUserIds traktUserIds = this.ids;
        String str3 = this.joinedAt;
        StringBuilder sbO = c.o("TraktUser(username=", str, ", name=", str2, ", isPrivate=");
        sbO.append(bool);
        sbO.append(", vip=");
        sbO.append(bool2);
        sbO.append(", vipEp=");
        sbO.append(bool3);
        sbO.append(", ids=");
        sbO.append(traktUserIds);
        sbO.append(", joinedAt=");
        return a.u(sbO, str3, ")");
    }
}
