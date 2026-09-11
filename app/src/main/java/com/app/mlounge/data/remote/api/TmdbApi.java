package com.app.mlounge.data.remote.api;

import com.app.mlounge.data.remote.model.TmdbCombinedCreditsResponse;
import com.app.mlounge.data.remote.model.TmdbGenreResponse;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.google.gson.b;
import kotlin.coroutines.d;
import retrofit2.http.f;
import retrofit2.http.s;
import retrofit2.http.t;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface TmdbApi {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object discoverMovies$default(TmdbApi tmdbApi, int i, String str, String str2, Integer num, boolean z, String str3, String str4, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: discoverMovies");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        return tmdbApi.discoverMovies(i, str, str2, num, z, str3, (i2 & 64) != 0 ? null : str4, dVar);
    }

    static /* synthetic */ Object discoverTvShows$default(TmdbApi tmdbApi, int i, String str, String str2, Integer num, boolean z, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: discoverTvShows");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        return tmdbApi.discoverTvShows(i, str, str2, num, z, dVar);
    }

    static /* synthetic */ Object getMovieDetail$default(TmdbApi tmdbApi, int i, String str, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getMovieDetail");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = "credits,videos,release_dates,similar";
        }
        return tmdbApi.getMovieDetail(i, str, dVar);
    }

    static /* synthetic */ Object getTrendingMovies$default(TmdbApi tmdbApi, int i, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getTrendingMovies");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return tmdbApi.getTrendingMovies(i, dVar);
    }

    static /* synthetic */ Object getTrendingTvShows$default(TmdbApi tmdbApi, int i, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getTrendingTvShows");
            return null;
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return tmdbApi.getTrendingTvShows(i, dVar);
    }

    static /* synthetic */ Object getTvShowDetail$default(TmdbApi tmdbApi, int i, String str, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: getTvShowDetail");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = "credits,videos,content_ratings,similar";
        }
        return tmdbApi.getTvShowDetail(i, str, dVar);
    }

    static /* synthetic */ Object searchMovies$default(TmdbApi tmdbApi, String str, int i, boolean z, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: searchMovies");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return tmdbApi.searchMovies(str, i, z, dVar);
    }

    static /* synthetic */ Object searchMulti$default(TmdbApi tmdbApi, String str, int i, boolean z, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: searchMulti");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return tmdbApi.searchMulti(str, i, z, dVar);
    }

    static /* synthetic */ Object searchTvShows$default(TmdbApi tmdbApi, String str, int i, d dVar, int i2, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: searchTvShows");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return tmdbApi.searchTvShows(str, i, dVar);
    }

    @f("discover/movie")
    Object discoverMovies(@t("page") int i, @t("sort_by") String str, @t("with_genres") String str2, @t("primary_release_year") Integer num, @t("include_adult") boolean z, @t("primary_release_date.gte") String str3, @t("primary_release_date.lte") String str4, d<? super TmdbPagedResponse<TmdbMovie>> dVar);

    @f("discover/tv")
    Object discoverTvShows(@t("page") int i, @t("sort_by") String str, @t("with_genres") String str2, @t("first_air_date_year") Integer num, @t("include_adult") boolean z, d<? super TmdbPagedResponse<TmdbTvShow>> dVar);

    @f("movie/{id}")
    Object getMovieDetail(@s("id") int i, @t("append_to_response") String str, d<? super TmdbMovieDetailResponse> dVar);

    @f("genre/movie/list")
    Object getMovieGenres(d<? super TmdbGenreResponse> dVar);

    @f("person/{id}/combined_credits")
    Object getPersonCredits(@s("id") int i, d<? super TmdbCombinedCreditsResponse> dVar);

    @f("person/{id}")
    Object getPersonDetail(@s("id") int i, d<? super TmdbPersonDetail> dVar);

    @f("trending/movie/week")
    Object getTrendingMovies(@t("page") int i, d<? super TmdbPagedResponse<TmdbMovie>> dVar);

    @f("trending/tv/week")
    Object getTrendingTvShows(@t("page") int i, d<? super TmdbPagedResponse<TmdbTvShow>> dVar);

    @f("genre/tv/list")
    Object getTvGenres(d<? super TmdbGenreResponse> dVar);

    @f("tv/{id}/season/{season}")
    Object getTvSeason(@s("id") int i, @s("season") int i2, d<? super TmdbSeason> dVar);

    @f("tv/{id}")
    Object getTvShowDetail(@s("id") int i, @t("append_to_response") String str, d<? super TmdbTvDetailResponse> dVar);

    @f("search/movie")
    Object searchMovies(@t("query") String str, @t("page") int i, @t("include_adult") boolean z, d<? super TmdbPagedResponse<TmdbMovie>> dVar);

    @f("search/multi")
    Object searchMulti(@t("query") String str, @t("page") int i, @t("include_adult") boolean z, d<? super TmdbPagedResponse<TmdbMultiResult>> dVar);

    @f("search/tv")
    Object searchTvShows(@t("query") String str, @t("page") int i, d<? super TmdbPagedResponse<TmdbTvShow>> dVar);
}
