package com.app.mlounge.data.remote.api;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.app.mlounge.data.remote.model.TmdbCreditsResponse;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.remote.model.TmdbReleaseDatesResponse;
import com.app.mlounge.data.remote.model.TmdbVideosResponse;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbMovieDetailResponse {
    public static final int $stable = 8;
    private final Boolean adult;

    @b("backdrop_path")
    private final String backdropPath;
    private final Long budget;
    private final TmdbCreditsResponse credits;
    private final List<TmdbGenre> genres;
    private final int id;
    private final String originalTitle;
    private final String overview;

    @b("poster_path")
    private final String posterPath;

    @b("release_date")
    private final String releaseDate;

    @b("release_dates")
    private final TmdbReleaseDatesResponse releaseDates;
    private final Long revenue;
    private final Integer runtime;
    private final TmdbPagedResponse<TmdbMovie> similar;
    private final String status;
    private final String tagline;
    private final String title;
    private final TmdbVideosResponse videos;

    @b("vote_average")
    private final Double voteAverage;

    @b("vote_count")
    private final Integer voteCount;

    public final String a() {
        return this.backdropPath;
    }

    public final TmdbCreditsResponse b() {
        return this.credits;
    }

    public final List c() {
        return this.genres;
    }

    public final int d() {
        return this.id;
    }

    public final String e() {
        return this.overview;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbMovieDetailResponse)) {
            return false;
        }
        TmdbMovieDetailResponse tmdbMovieDetailResponse = (TmdbMovieDetailResponse) obj;
        return this.id == tmdbMovieDetailResponse.id && l.a(this.title, tmdbMovieDetailResponse.title) && l.a(this.originalTitle, tmdbMovieDetailResponse.originalTitle) && l.a(this.overview, tmdbMovieDetailResponse.overview) && l.a(this.posterPath, tmdbMovieDetailResponse.posterPath) && l.a(this.backdropPath, tmdbMovieDetailResponse.backdropPath) && l.a(this.releaseDate, tmdbMovieDetailResponse.releaseDate) && l.a(this.voteAverage, tmdbMovieDetailResponse.voteAverage) && l.a(this.voteCount, tmdbMovieDetailResponse.voteCount) && l.a(this.runtime, tmdbMovieDetailResponse.runtime) && l.a(this.genres, tmdbMovieDetailResponse.genres) && l.a(this.status, tmdbMovieDetailResponse.status) && l.a(this.tagline, tmdbMovieDetailResponse.tagline) && l.a(this.adult, tmdbMovieDetailResponse.adult) && l.a(this.budget, tmdbMovieDetailResponse.budget) && l.a(this.revenue, tmdbMovieDetailResponse.revenue) && l.a(this.credits, tmdbMovieDetailResponse.credits) && l.a(this.videos, tmdbMovieDetailResponse.videos) && l.a(this.releaseDates, tmdbMovieDetailResponse.releaseDates) && l.a(this.similar, tmdbMovieDetailResponse.similar);
    }

    public final String f() {
        return this.posterPath;
    }

    public final String g() {
        return this.releaseDate;
    }

    public final TmdbReleaseDatesResponse h() {
        return this.releaseDates;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.originalTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.overview;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.posterPath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backdropPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.releaseDate;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.voteAverage;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.voteCount;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.runtime;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<TmdbGenre> list = this.genres;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.status;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tagline;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.adult;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.budget;
        int iHashCode15 = (iHashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.revenue;
        int iHashCode16 = (iHashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        TmdbCreditsResponse tmdbCreditsResponse = this.credits;
        int iHashCode17 = (iHashCode16 + (tmdbCreditsResponse == null ? 0 : tmdbCreditsResponse.hashCode())) * 31;
        TmdbVideosResponse tmdbVideosResponse = this.videos;
        int iHashCode18 = (iHashCode17 + (tmdbVideosResponse == null ? 0 : tmdbVideosResponse.hashCode())) * 31;
        TmdbReleaseDatesResponse tmdbReleaseDatesResponse = this.releaseDates;
        int iHashCode19 = (iHashCode18 + (tmdbReleaseDatesResponse == null ? 0 : tmdbReleaseDatesResponse.hashCode())) * 31;
        TmdbPagedResponse<TmdbMovie> tmdbPagedResponse = this.similar;
        return iHashCode19 + (tmdbPagedResponse != null ? tmdbPagedResponse.hashCode() : 0);
    }

    public final Integer i() {
        return this.runtime;
    }

    public final TmdbPagedResponse j() {
        return this.similar;
    }

    public final String k() {
        return this.title;
    }

    public final TmdbVideosResponse l() {
        return this.videos;
    }

    public final Double m() {
        return this.voteAverage;
    }

    public final String toString() {
        int i = this.id;
        String str = this.title;
        String str2 = this.originalTitle;
        String str3 = this.overview;
        String str4 = this.posterPath;
        String str5 = this.backdropPath;
        String str6 = this.releaseDate;
        Double d = this.voteAverage;
        Integer num = this.voteCount;
        Integer num2 = this.runtime;
        List<TmdbGenre> list = this.genres;
        String str7 = this.status;
        String str8 = this.tagline;
        Boolean bool = this.adult;
        Long l = this.budget;
        Long l2 = this.revenue;
        TmdbCreditsResponse tmdbCreditsResponse = this.credits;
        TmdbVideosResponse tmdbVideosResponse = this.videos;
        TmdbReleaseDatesResponse tmdbReleaseDatesResponse = this.releaseDates;
        TmdbPagedResponse<TmdbMovie> tmdbPagedResponse = this.similar;
        StringBuilder sb = new StringBuilder("TmdbMovieDetailResponse(id=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str);
        sb.append(", originalTitle=");
        c.y(sb, str2, ", overview=", str3, ", posterPath=");
        c.y(sb, str4, ", backdropPath=", str5, ", releaseDate=");
        sb.append(str6);
        sb.append(", voteAverage=");
        sb.append(d);
        sb.append(", voteCount=");
        sb.append(num);
        sb.append(", runtime=");
        sb.append(num2);
        sb.append(", genres=");
        sb.append(list);
        sb.append(", status=");
        sb.append(str7);
        sb.append(", tagline=");
        sb.append(str8);
        sb.append(", adult=");
        sb.append(bool);
        sb.append(", budget=");
        sb.append(l);
        sb.append(", revenue=");
        sb.append(l2);
        sb.append(", credits=");
        sb.append(tmdbCreditsResponse);
        sb.append(", videos=");
        sb.append(tmdbVideosResponse);
        sb.append(", releaseDates=");
        sb.append(tmdbReleaseDatesResponse);
        sb.append(", similar=");
        sb.append(tmdbPagedResponse);
        sb.append(")");
        return sb.toString();
    }
}
