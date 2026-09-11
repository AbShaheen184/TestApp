package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeInfo {
    public static final int $stable = 0;
    private final String description;
    private final String id;
    private final String name;
    private final String poster;
    private final HiAnimeStats stats;
    private final Integer anilistId = null;
    private final Integer malId = null;

    public HiAnimeInfo(String str, String str2, String str3, String str4, HiAnimeStats hiAnimeStats) {
        this.id = str;
        this.name = str2;
        this.poster = str3;
        this.description = str4;
        this.stats = hiAnimeStats;
    }

    public final String a() {
        return this.description;
    }

    public final String b() {
        return this.id;
    }

    public final String c() {
        return this.name;
    }

    public final String d() {
        return this.poster;
    }

    public final HiAnimeStats e() {
        return this.stats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeInfo)) {
            return false;
        }
        HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj;
        return l.a(this.id, hiAnimeInfo.id) && l.a(this.name, hiAnimeInfo.name) && l.a(this.poster, hiAnimeInfo.poster) && l.a(this.description, hiAnimeInfo.description) && l.a(this.stats, hiAnimeInfo.stats) && l.a(this.anilistId, hiAnimeInfo.anilistId) && l.a(this.malId, hiAnimeInfo.malId);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poster;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        HiAnimeStats hiAnimeStats = this.stats;
        int iHashCode5 = (iHashCode4 + (hiAnimeStats == null ? 0 : hiAnimeStats.hashCode())) * 31;
        Integer num = this.anilistId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.malId;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.poster;
        String str4 = this.description;
        HiAnimeStats hiAnimeStats = this.stats;
        Integer num = this.anilistId;
        Integer num2 = this.malId;
        StringBuilder sbO = c.o("HiAnimeInfo(id=", str, ", name=", str2, ", poster=");
        c.y(sbO, str3, ", description=", str4, ", stats=");
        sbO.append(hiAnimeStats);
        sbO.append(", anilistId=");
        sbO.append(num);
        sbO.append(", malId=");
        sbO.append(num2);
        sbO.append(")");
        return sbO.toString();
    }
}
