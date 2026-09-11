package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbMovie {
    public static final int $stable = 8;
    private final Boolean adult;

    @b("backdrop_path")
    private final String backdropPath;
    private final Long budget;

    @b("genre_ids")
    private final List<Integer> genreIds;
    private final List<TmdbGenre> genres;
    private final int id;

    @b("original_title")
    private final String originalTitle;
    private final String overview;
    private final Double popularity;

    @b("poster_path")
    private final String posterPath;

    @b("release_date")
    private final String releaseDate;
    private final Long revenue;
    private final Integer runtime;
    private final String status;
    private final String tagline;
    private final String title;

    @b("vote_average")
    private final Double voteAverage;

    @b("vote_count")
    private final Integer voteCount;

    public final int a() {
        return this.id;
    }

    public final String b() {
        return this.originalTitle;
    }

    public final String c() {
        return this.posterPath;
    }

    public final String d() {
        return this.releaseDate;
    }

    public final String e() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbMovie)) {
            return false;
        }
        TmdbMovie tmdbMovie = (TmdbMovie) obj;
        return this.id == tmdbMovie.id && l.a(this.title, tmdbMovie.title) && l.a(this.originalTitle, tmdbMovie.originalTitle) && l.a(this.overview, tmdbMovie.overview) && l.a(this.posterPath, tmdbMovie.posterPath) && l.a(this.backdropPath, tmdbMovie.backdropPath) && l.a(this.releaseDate, tmdbMovie.releaseDate) && l.a(this.voteAverage, tmdbMovie.voteAverage) && l.a(this.voteCount, tmdbMovie.voteCount) && l.a(this.popularity, tmdbMovie.popularity) && l.a(this.genreIds, tmdbMovie.genreIds) && l.a(this.adult, tmdbMovie.adult) && l.a(this.runtime, tmdbMovie.runtime) && l.a(this.genres, tmdbMovie.genres) && l.a(this.status, tmdbMovie.status) && l.a(this.tagline, tmdbMovie.tagline) && l.a(this.budget, tmdbMovie.budget) && l.a(this.revenue, tmdbMovie.revenue);
    }

    public final Double f() {
        return this.voteAverage;
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
        Double d2 = this.popularity;
        int iHashCode10 = (iHashCode9 + (d2 == null ? 0 : d2.hashCode())) * 31;
        List<Integer> list = this.genreIds;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.adult;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.runtime;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<TmdbGenre> list2 = this.genres;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.status;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tagline;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.budget;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.revenue;
        return iHashCode17 + (l2 != null ? l2.hashCode() : 0);
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
        Double d2 = this.popularity;
        List<Integer> list = this.genreIds;
        Boolean bool = this.adult;
        Integer num2 = this.runtime;
        List<TmdbGenre> list2 = this.genres;
        String str7 = this.status;
        String str8 = this.tagline;
        Long l = this.budget;
        Long l2 = this.revenue;
        StringBuilder sb = new StringBuilder("TmdbMovie(id=");
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
        sb.append(", popularity=");
        sb.append(d2);
        sb.append(", genreIds=");
        sb.append(list);
        sb.append(", adult=");
        sb.append(bool);
        sb.append(", runtime=");
        sb.append(num2);
        sb.append(", genres=");
        sb.append(list2);
        sb.append(", status=");
        c.y(sb, str7, ", tagline=", str8, ", budget=");
        sb.append(l);
        sb.append(", revenue=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }
}
