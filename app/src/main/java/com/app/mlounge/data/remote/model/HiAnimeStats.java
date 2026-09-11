package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeStats {
    public static final int $stable = 0;
    private final String duration;
    private final HiAnimeEpCount episodes;
    private final String quality;
    private final String rating;
    private final String type;

    public HiAnimeStats(String str, String str2, String str3, String str4, HiAnimeEpCount hiAnimeEpCount) {
        this.rating = str;
        this.quality = str2;
        this.type = str3;
        this.duration = str4;
        this.episodes = hiAnimeEpCount;
    }

    public final String a() {
        return this.duration;
    }

    public final HiAnimeEpCount b() {
        return this.episodes;
    }

    public final String c() {
        return this.quality;
    }

    public final String d() {
        return this.rating;
    }

    public final String e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeStats)) {
            return false;
        }
        HiAnimeStats hiAnimeStats = (HiAnimeStats) obj;
        return l.a(this.rating, hiAnimeStats.rating) && l.a(this.quality, hiAnimeStats.quality) && l.a(this.type, hiAnimeStats.type) && l.a(this.duration, hiAnimeStats.duration) && l.a(this.episodes, hiAnimeStats.episodes);
    }

    public final int hashCode() {
        String str = this.rating;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quality;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duration;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HiAnimeEpCount hiAnimeEpCount = this.episodes;
        return iHashCode4 + (hiAnimeEpCount != null ? hiAnimeEpCount.hashCode() : 0);
    }

    public final String toString() {
        String str = this.rating;
        String str2 = this.quality;
        String str3 = this.type;
        String str4 = this.duration;
        HiAnimeEpCount hiAnimeEpCount = this.episodes;
        StringBuilder sbO = c.o("HiAnimeStats(rating=", str, ", quality=", str2, ", type=");
        c.y(sbO, str3, ", duration=", str4, ", episodes=");
        sbO.append(hiAnimeEpCount);
        sbO.append(")");
        return sbO.toString();
    }
}
