package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbTvShow {
    public static final int $stable = 8;

    @b("backdrop_path")
    private final String backdropPath;

    @b("created_by")
    private final List<TmdbCreator> createdBy;

    @b("episode_run_time")
    private final List<Integer> episodeRunTime;

    @b("first_air_date")
    private final String firstAirDate;

    @b("genre_ids")
    private final List<Integer> genreIds;
    private final List<TmdbGenre> genres;
    private final int id;

    @b("last_air_date")
    private final String lastAirDate;
    private final String name;

    @b("number_of_episodes")
    private final Integer numberOfEpisodes;

    @b("number_of_seasons")
    private final Integer numberOfSeasons;

    @b("original_name")
    private final String originalName;
    private final String overview;
    private final Double popularity;

    @b("poster_path")
    private final String posterPath;
    private final List<TmdbSeason> seasons;
    private final String status;
    private final String tagline;

    @b("vote_average")
    private final Double voteAverage;

    @b("vote_count")
    private final Integer voteCount;

    public final String a() {
        return this.firstAirDate;
    }

    public final int b() {
        return this.id;
    }

    public final String c() {
        return this.name;
    }

    public final Integer d() {
        return this.numberOfEpisodes;
    }

    public final String e() {
        return this.originalName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbTvShow)) {
            return false;
        }
        TmdbTvShow tmdbTvShow = (TmdbTvShow) obj;
        return this.id == tmdbTvShow.id && l.a(this.name, tmdbTvShow.name) && l.a(this.originalName, tmdbTvShow.originalName) && l.a(this.overview, tmdbTvShow.overview) && l.a(this.posterPath, tmdbTvShow.posterPath) && l.a(this.backdropPath, tmdbTvShow.backdropPath) && l.a(this.firstAirDate, tmdbTvShow.firstAirDate) && l.a(this.lastAirDate, tmdbTvShow.lastAirDate) && l.a(this.voteAverage, tmdbTvShow.voteAverage) && l.a(this.voteCount, tmdbTvShow.voteCount) && l.a(this.popularity, tmdbTvShow.popularity) && l.a(this.genreIds, tmdbTvShow.genreIds) && l.a(this.numberOfSeasons, tmdbTvShow.numberOfSeasons) && l.a(this.numberOfEpisodes, tmdbTvShow.numberOfEpisodes) && l.a(this.episodeRunTime, tmdbTvShow.episodeRunTime) && l.a(this.genres, tmdbTvShow.genres) && l.a(this.status, tmdbTvShow.status) && l.a(this.tagline, tmdbTvShow.tagline) && l.a(this.createdBy, tmdbTvShow.createdBy) && l.a(this.seasons, tmdbTvShow.seasons);
    }

    public final String f() {
        return this.posterPath;
    }

    public final Double g() {
        return this.voteAverage;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.overview;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.posterPath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backdropPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstAirDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastAirDate;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.voteAverage;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.voteCount;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.popularity;
        int iHashCode11 = (iHashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List<Integer> list = this.genreIds;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.numberOfSeasons;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.numberOfEpisodes;
        int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list2 = this.episodeRunTime;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TmdbGenre> list3 = this.genres;
        int iHashCode16 = (iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tagline;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<TmdbCreator> list4 = this.createdBy;
        int iHashCode19 = (iHashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TmdbSeason> list5 = this.seasons;
        return iHashCode19 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.originalName;
        String str3 = this.overview;
        String str4 = this.posterPath;
        String str5 = this.backdropPath;
        String str6 = this.firstAirDate;
        String str7 = this.lastAirDate;
        Double d = this.voteAverage;
        Integer num = this.voteCount;
        Double d2 = this.popularity;
        List<Integer> list = this.genreIds;
        Integer num2 = this.numberOfSeasons;
        Integer num3 = this.numberOfEpisodes;
        List<Integer> list2 = this.episodeRunTime;
        List<TmdbGenre> list3 = this.genres;
        String str8 = this.status;
        String str9 = this.tagline;
        List<TmdbCreator> list4 = this.createdBy;
        List<TmdbSeason> list5 = this.seasons;
        StringBuilder sb = new StringBuilder("TmdbTvShow(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", originalName=");
        c.y(sb, str2, ", overview=", str3, ", posterPath=");
        c.y(sb, str4, ", backdropPath=", str5, ", firstAirDate=");
        c.y(sb, str6, ", lastAirDate=", str7, ", voteAverage=");
        sb.append(d);
        sb.append(", voteCount=");
        sb.append(num);
        sb.append(", popularity=");
        sb.append(d2);
        sb.append(", genreIds=");
        sb.append(list);
        sb.append(", numberOfSeasons=");
        sb.append(num2);
        sb.append(", numberOfEpisodes=");
        sb.append(num3);
        sb.append(", episodeRunTime=");
        sb.append(list2);
        sb.append(", genres=");
        sb.append(list3);
        sb.append(", status=");
        c.y(sb, str8, ", tagline=", str9, ", createdBy=");
        sb.append(list4);
        sb.append(", seasons=");
        sb.append(list5);
        sb.append(")");
        return sb.toString();
    }
}
