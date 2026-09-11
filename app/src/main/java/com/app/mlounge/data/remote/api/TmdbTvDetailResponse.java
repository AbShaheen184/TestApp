package com.app.mlounge.data.remote.api;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.app.mlounge.data.remote.model.TmdbContentRatingsResponse;
import com.app.mlounge.data.remote.model.TmdbCreator;
import com.app.mlounge.data.remote.model.TmdbCreditsResponse;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.remote.model.TmdbVideosResponse;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbTvDetailResponse {
    public static final int $stable = 8;

    @b("backdrop_path")
    private final String backdropPath;

    @b("content_ratings")
    private final TmdbContentRatingsResponse contentRatings;

    @b("created_by")
    private final List<TmdbCreator> createdBy;
    private final TmdbCreditsResponse credits;

    @b("episode_run_time")
    private final List<Integer> episodeRunTime;

    @b("first_air_date")
    private final String firstAirDate;
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

    @b("poster_path")
    private final String posterPath;
    private final List<TmdbSeason> seasons;
    private final TmdbPagedResponse<TmdbTvShow> similar;
    private final String status;
    private final String tagline;
    private final TmdbVideosResponse videos;

    @b("vote_average")
    private final Double voteAverage;

    @b("vote_count")
    private final Integer voteCount;

    public final String a() {
        return this.backdropPath;
    }

    public final TmdbContentRatingsResponse b() {
        return this.contentRatings;
    }

    public final List c() {
        return this.createdBy;
    }

    public final TmdbCreditsResponse d() {
        return this.credits;
    }

    public final List e() {
        return this.episodeRunTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbTvDetailResponse)) {
            return false;
        }
        TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) obj;
        return this.id == tmdbTvDetailResponse.id && l.a(this.name, tmdbTvDetailResponse.name) && l.a(this.originalName, tmdbTvDetailResponse.originalName) && l.a(this.overview, tmdbTvDetailResponse.overview) && l.a(this.posterPath, tmdbTvDetailResponse.posterPath) && l.a(this.backdropPath, tmdbTvDetailResponse.backdropPath) && l.a(this.firstAirDate, tmdbTvDetailResponse.firstAirDate) && l.a(this.lastAirDate, tmdbTvDetailResponse.lastAirDate) && l.a(this.voteAverage, tmdbTvDetailResponse.voteAverage) && l.a(this.voteCount, tmdbTvDetailResponse.voteCount) && l.a(this.numberOfSeasons, tmdbTvDetailResponse.numberOfSeasons) && l.a(this.numberOfEpisodes, tmdbTvDetailResponse.numberOfEpisodes) && l.a(this.episodeRunTime, tmdbTvDetailResponse.episodeRunTime) && l.a(this.genres, tmdbTvDetailResponse.genres) && l.a(this.status, tmdbTvDetailResponse.status) && l.a(this.tagline, tmdbTvDetailResponse.tagline) && l.a(this.createdBy, tmdbTvDetailResponse.createdBy) && l.a(this.seasons, tmdbTvDetailResponse.seasons) && l.a(this.credits, tmdbTvDetailResponse.credits) && l.a(this.videos, tmdbTvDetailResponse.videos) && l.a(this.contentRatings, tmdbTvDetailResponse.contentRatings) && l.a(this.similar, tmdbTvDetailResponse.similar);
    }

    public final String f() {
        return this.firstAirDate;
    }

    public final List g() {
        return this.genres;
    }

    public final int h() {
        return this.id;
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
        Integer num2 = this.numberOfSeasons;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.numberOfEpisodes;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list = this.episodeRunTime;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        List<TmdbGenre> list2 = this.genres;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tagline;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<TmdbCreator> list3 = this.createdBy;
        int iHashCode17 = (iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TmdbSeason> list4 = this.seasons;
        int iHashCode18 = (iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        TmdbCreditsResponse tmdbCreditsResponse = this.credits;
        int iHashCode19 = (iHashCode18 + (tmdbCreditsResponse == null ? 0 : tmdbCreditsResponse.hashCode())) * 31;
        TmdbVideosResponse tmdbVideosResponse = this.videos;
        int iHashCode20 = (iHashCode19 + (tmdbVideosResponse == null ? 0 : tmdbVideosResponse.hashCode())) * 31;
        TmdbContentRatingsResponse tmdbContentRatingsResponse = this.contentRatings;
        int iHashCode21 = (iHashCode20 + (tmdbContentRatingsResponse == null ? 0 : tmdbContentRatingsResponse.hashCode())) * 31;
        TmdbPagedResponse<TmdbTvShow> tmdbPagedResponse = this.similar;
        return iHashCode21 + (tmdbPagedResponse != null ? tmdbPagedResponse.hashCode() : 0);
    }

    public final String i() {
        return this.lastAirDate;
    }

    public final String j() {
        return this.name;
    }

    public final Integer k() {
        return this.numberOfEpisodes;
    }

    public final String l() {
        return this.overview;
    }

    public final String m() {
        return this.posterPath;
    }

    public final List n() {
        return this.seasons;
    }

    public final TmdbPagedResponse o() {
        return this.similar;
    }

    public final Double p() {
        return this.voteAverage;
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
        Integer num2 = this.numberOfSeasons;
        Integer num3 = this.numberOfEpisodes;
        List<Integer> list = this.episodeRunTime;
        List<TmdbGenre> list2 = this.genres;
        String str8 = this.status;
        String str9 = this.tagline;
        List<TmdbCreator> list3 = this.createdBy;
        List<TmdbSeason> list4 = this.seasons;
        TmdbCreditsResponse tmdbCreditsResponse = this.credits;
        TmdbVideosResponse tmdbVideosResponse = this.videos;
        TmdbContentRatingsResponse tmdbContentRatingsResponse = this.contentRatings;
        TmdbPagedResponse<TmdbTvShow> tmdbPagedResponse = this.similar;
        StringBuilder sb = new StringBuilder("TmdbTvDetailResponse(id=");
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
        sb.append(", numberOfSeasons=");
        sb.append(num2);
        sb.append(", numberOfEpisodes=");
        sb.append(num3);
        sb.append(", episodeRunTime=");
        sb.append(list);
        sb.append(", genres=");
        sb.append(list2);
        sb.append(", status=");
        c.y(sb, str8, ", tagline=", str9, ", createdBy=");
        sb.append(list3);
        sb.append(", seasons=");
        sb.append(list4);
        sb.append(", credits=");
        sb.append(tmdbCreditsResponse);
        sb.append(", videos=");
        sb.append(tmdbVideosResponse);
        sb.append(", contentRatings=");
        sb.append(tmdbContentRatingsResponse);
        sb.append(", similar=");
        sb.append(tmdbPagedResponse);
        sb.append(")");
        return sb.toString();
    }
}
