package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class GameDetailResponse {
    public static final int $stable = 0;
    private final String description;
    private final String developer;
    private final String genre;
    private final String name;
    private final String players;
    private final String posterUrl;
    private final String publisher;
    private final String region;
    private final Long romSizeBytes;
    private final Double romSizeMB;
    private final String romUrl;
    private final String slug;
    private final String year;

    public final String a() {
        return this.description;
    }

    public final String b() {
        return this.developer;
    }

    public final String c() {
        return this.genre;
    }

    public final String d() {
        return this.name;
    }

    public final String e() {
        return this.players;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDetailResponse)) {
            return false;
        }
        GameDetailResponse gameDetailResponse = (GameDetailResponse) obj;
        return l.a(this.slug, gameDetailResponse.slug) && l.a(this.name, gameDetailResponse.name) && l.a(this.year, gameDetailResponse.year) && l.a(this.developer, gameDetailResponse.developer) && l.a(this.publisher, gameDetailResponse.publisher) && l.a(this.genre, gameDetailResponse.genre) && l.a(this.description, gameDetailResponse.description) && l.a(this.players, gameDetailResponse.players) && l.a(this.region, gameDetailResponse.region) && l.a(this.romUrl, gameDetailResponse.romUrl) && l.a(this.posterUrl, gameDetailResponse.posterUrl) && l.a(this.romSizeBytes, gameDetailResponse.romSizeBytes) && l.a(this.romSizeMB, gameDetailResponse.romSizeMB);
    }

    public final String f() {
        return this.posterUrl;
    }

    public final String g() {
        return this.publisher;
    }

    public final String h() {
        return this.region;
    }

    public final int hashCode() {
        int iHashCode = this.slug.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.year;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.developer;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.publisher;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.genre;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.players;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.region;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.romUrl;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.posterUrl;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l = this.romSizeBytes;
        int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.romSizeMB;
        return iHashCode12 + (d != null ? d.hashCode() : 0);
    }

    public final Double i() {
        return this.romSizeMB;
    }

    public final String j() {
        return this.slug;
    }

    public final String k() {
        return this.year;
    }

    public final String toString() {
        String str = this.slug;
        String str2 = this.name;
        String str3 = this.year;
        String str4 = this.developer;
        String str5 = this.publisher;
        String str6 = this.genre;
        String str7 = this.description;
        String str8 = this.players;
        String str9 = this.region;
        String str10 = this.romUrl;
        String str11 = this.posterUrl;
        Long l = this.romSizeBytes;
        Double d = this.romSizeMB;
        StringBuilder sbO = c.o("GameDetailResponse(slug=", str, ", name=", str2, ", year=");
        c.y(sbO, str3, ", developer=", str4, ", publisher=");
        c.y(sbO, str5, ", genre=", str6, ", description=");
        c.y(sbO, str7, ", players=", str8, ", region=");
        c.y(sbO, str9, ", romUrl=", str10, ", posterUrl=");
        sbO.append(str11);
        sbO.append(", romSizeBytes=");
        sbO.append(l);
        sbO.append(", romSizeMB=");
        sbO.append(d);
        sbO.append(")");
        return sbO.toString();
    }
}
