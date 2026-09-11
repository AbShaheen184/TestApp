package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktActivityTimestamps {
    public static final int $stable = 0;

    @b("watched_at")
    private final String watchedAt = null;

    @b("collected_at")
    private final String collectedAt = null;

    @b("rated_at")
    private final String ratedAt = null;

    @b("watchlisted_at")
    private final String watchlistedAt = null;

    @b("commented_at")
    private final String commentedAt = null;

    @b("paused_at")
    private final String pausedAt = null;

    @b("hidden_at")
    private final String hiddenAt = null;

    @b("updated_at")
    private final String updatedAt = null;

    public final String a() {
        return this.updatedAt;
    }

    public final String b() {
        return this.watchedAt;
    }

    public final String c() {
        return this.watchlistedAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktActivityTimestamps)) {
            return false;
        }
        TraktActivityTimestamps traktActivityTimestamps = (TraktActivityTimestamps) obj;
        return l.a(this.watchedAt, traktActivityTimestamps.watchedAt) && l.a(this.collectedAt, traktActivityTimestamps.collectedAt) && l.a(this.ratedAt, traktActivityTimestamps.ratedAt) && l.a(this.watchlistedAt, traktActivityTimestamps.watchlistedAt) && l.a(this.commentedAt, traktActivityTimestamps.commentedAt) && l.a(this.pausedAt, traktActivityTimestamps.pausedAt) && l.a(this.hiddenAt, traktActivityTimestamps.hiddenAt) && l.a(this.updatedAt, traktActivityTimestamps.updatedAt);
    }

    public final int hashCode() {
        String str = this.watchedAt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.collectedAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ratedAt;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.watchlistedAt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.commentedAt;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pausedAt;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hiddenAt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updatedAt;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.watchedAt;
        String str2 = this.collectedAt;
        String str3 = this.ratedAt;
        String str4 = this.watchlistedAt;
        String str5 = this.commentedAt;
        String str6 = this.pausedAt;
        String str7 = this.hiddenAt;
        String str8 = this.updatedAt;
        StringBuilder sbO = c.o("TraktActivityTimestamps(watchedAt=", str, ", collectedAt=", str2, ", ratedAt=");
        c.y(sbO, str3, ", watchlistedAt=", str4, ", commentedAt=");
        c.y(sbO, str5, ", pausedAt=", str6, ", hiddenAt=");
        return c.l(sbO, str7, ", updatedAt=", str8, ")");
    }
}
