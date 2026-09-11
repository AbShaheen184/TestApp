package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbSeason {
    public static final int $stable = 8;

    @b("air_date")
    private final String airDate;

    @b("episode_count")
    private final Integer episodeCount;
    private final List<TmdbEpisode> episodes;
    private final int id;
    private final String name;
    private final String overview;

    @b("poster_path")
    private final String posterPath;

    @b("season_number")
    private final int seasonNumber;

    public final Integer a() {
        return this.episodeCount;
    }

    public final List b() {
        return this.episodes;
    }

    public final int c() {
        return this.id;
    }

    public final String d() {
        return this.name;
    }

    public final int e() {
        return this.seasonNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbSeason)) {
            return false;
        }
        TmdbSeason tmdbSeason = (TmdbSeason) obj;
        return this.id == tmdbSeason.id && this.seasonNumber == tmdbSeason.seasonNumber && l.a(this.name, tmdbSeason.name) && l.a(this.overview, tmdbSeason.overview) && l.a(this.posterPath, tmdbSeason.posterPath) && l.a(this.episodeCount, tmdbSeason.episodeCount) && l.a(this.airDate, tmdbSeason.airDate) && l.a(this.episodes, tmdbSeason.episodes);
    }

    public final int hashCode() {
        int iB = a.b(this.seasonNumber, Integer.hashCode(this.id) * 31, 31);
        String str = this.name;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overview;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.posterPath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.episodeCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.airDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<TmdbEpisode> list = this.episodes;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.seasonNumber;
        String str = this.name;
        String str2 = this.overview;
        String str3 = this.posterPath;
        Integer num = this.episodeCount;
        String str4 = this.airDate;
        List<TmdbEpisode> list = this.episodes;
        StringBuilder sbW = a.w("TmdbSeason(id=", ", seasonNumber=", i, ", name=", i2);
        c.y(sbW, str, ", overview=", str2, ", posterPath=");
        sbW.append(str3);
        sbW.append(", episodeCount=");
        sbW.append(num);
        sbW.append(", airDate=");
        sbW.append(str4);
        sbW.append(", episodes=");
        sbW.append(list);
        sbW.append(")");
        return sbW.toString();
    }
}
