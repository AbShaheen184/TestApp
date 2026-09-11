package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeItem {
    public static final int $stable = 0;
    private final String description;
    private final String duration;
    private final HiAnimeEpCount episodes;
    private final String id;
    private final String jname;
    private final String name;
    private final String poster;
    private final String rating;
    private final String title;
    private final String type;

    public HiAnimeItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HiAnimeEpCount hiAnimeEpCount, String str9) {
        this.id = str;
        this.name = str2;
        this.title = str3;
        this.poster = str4;
        this.jname = str5;
        this.type = str6;
        this.duration = str7;
        this.rating = str8;
        this.episodes = hiAnimeEpCount;
        this.description = str9;
    }

    public final String a() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        String str2 = this.title;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.jname;
        return str3 == null ? "Unknown" : str3;
    }

    public final String b() {
        return this.id;
    }

    public final String c() {
        return this.poster;
    }

    public final String d() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeItem)) {
            return false;
        }
        HiAnimeItem hiAnimeItem = (HiAnimeItem) obj;
        return l.a(this.id, hiAnimeItem.id) && l.a(this.name, hiAnimeItem.name) && l.a(this.title, hiAnimeItem.title) && l.a(this.poster, hiAnimeItem.poster) && l.a(this.jname, hiAnimeItem.jname) && l.a(this.type, hiAnimeItem.type) && l.a(this.duration, hiAnimeItem.duration) && l.a(this.rating, hiAnimeItem.rating) && l.a(this.episodes, hiAnimeItem.episodes) && l.a(this.description, hiAnimeItem.description);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poster;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jname;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.duration;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rating;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        HiAnimeEpCount hiAnimeEpCount = this.episodes;
        int iHashCode9 = (iHashCode8 + (hiAnimeEpCount == null ? 0 : hiAnimeEpCount.hashCode())) * 31;
        String str9 = this.description;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.title;
        String str4 = this.poster;
        String str5 = this.jname;
        String str6 = this.type;
        String str7 = this.duration;
        String str8 = this.rating;
        HiAnimeEpCount hiAnimeEpCount = this.episodes;
        String str9 = this.description;
        StringBuilder sbO = c.o("HiAnimeItem(id=", str, ", name=", str2, ", title=");
        c.y(sbO, str3, ", poster=", str4, ", jname=");
        c.y(sbO, str5, ", type=", str6, ", duration=");
        c.y(sbO, str7, ", rating=", str8, ", episodes=");
        sbO.append(hiAnimeEpCount);
        sbO.append(", description=");
        sbO.append(str9);
        sbO.append(")");
        return sbO.toString();
    }
}
