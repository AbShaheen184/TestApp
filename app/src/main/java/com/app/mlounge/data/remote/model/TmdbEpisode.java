package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbEpisode {
    public static final int $stable = 0;

    @b("air_date")
    private final String airDate;

    @b("episode_number")
    private final int episodeNumber;
    private final int id;
    private final String name;
    private final String overview;
    private final Integer runtime;

    @b("season_number")
    private final int seasonNumber;

    @b("still_path")
    private final String stillPath;

    @b("vote_average")
    private final Double voteAverage;

    public final int a() {
        return this.episodeNumber;
    }

    public final int b() {
        return this.id;
    }

    public final String c() {
        return this.name;
    }

    public final String d() {
        return this.overview;
    }

    public final Integer e() {
        return this.runtime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbEpisode)) {
            return false;
        }
        TmdbEpisode tmdbEpisode = (TmdbEpisode) obj;
        return this.id == tmdbEpisode.id && this.episodeNumber == tmdbEpisode.episodeNumber && this.seasonNumber == tmdbEpisode.seasonNumber && l.a(this.name, tmdbEpisode.name) && l.a(this.overview, tmdbEpisode.overview) && l.a(this.stillPath, tmdbEpisode.stillPath) && l.a(this.airDate, tmdbEpisode.airDate) && l.a(this.runtime, tmdbEpisode.runtime) && l.a(this.voteAverage, tmdbEpisode.voteAverage);
    }

    public final int f() {
        return this.seasonNumber;
    }

    public final String g() {
        return this.stillPath;
    }

    public final int hashCode() {
        int iB = a.b(this.seasonNumber, a.b(this.episodeNumber, Integer.hashCode(this.id) * 31, 31), 31);
        String str = this.name;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overview;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stillPath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.airDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.runtime;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.voteAverage;
        return iHashCode5 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.episodeNumber;
        int i3 = this.seasonNumber;
        String str = this.name;
        String str2 = this.overview;
        String str3 = this.stillPath;
        String str4 = this.airDate;
        Integer num = this.runtime;
        Double d = this.voteAverage;
        StringBuilder sbW = a.w("TmdbEpisode(id=", ", episodeNumber=", i, ", seasonNumber=", i2);
        sbW.append(i3);
        sbW.append(", name=");
        sbW.append(str);
        sbW.append(", overview=");
        c.y(sbW, str2, ", stillPath=", str3, ", airDate=");
        sbW.append(str4);
        sbW.append(", runtime=");
        sbW.append(num);
        sbW.append(", voteAverage=");
        sbW.append(d);
        sbW.append(")");
        return sbW.toString();
    }
}
