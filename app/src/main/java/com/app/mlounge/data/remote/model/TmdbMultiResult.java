package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbMultiResult {
    public static final int $stable = 8;

    @b("backdrop_path")
    private final String backdropPath;
    private final String character;

    @b("first_air_date")
    private final String firstAirDate;

    @b("genre_ids")
    private final List<Integer> genreIds;
    private final int id;
    private final String job;

    @b("media_type")
    private final String mediaType;
    private final String name;
    private final String overview;

    @b("poster_path")
    private final String posterPath;

    @b("release_date")
    private final String releaseDate;
    private final String title;

    @b("vote_average")
    private final Double voteAverage;

    public final String a() {
        return this.character;
    }

    public final int b() {
        return this.id;
    }

    public final String c() {
        return this.mediaType;
    }

    public final String d() {
        return this.name;
    }

    public final String e() {
        return this.posterPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbMultiResult)) {
            return false;
        }
        TmdbMultiResult tmdbMultiResult = (TmdbMultiResult) obj;
        return this.id == tmdbMultiResult.id && l.a(this.mediaType, tmdbMultiResult.mediaType) && l.a(this.title, tmdbMultiResult.title) && l.a(this.name, tmdbMultiResult.name) && l.a(this.posterPath, tmdbMultiResult.posterPath) && l.a(this.backdropPath, tmdbMultiResult.backdropPath) && l.a(this.overview, tmdbMultiResult.overview) && l.a(this.voteAverage, tmdbMultiResult.voteAverage) && l.a(this.releaseDate, tmdbMultiResult.releaseDate) && l.a(this.firstAirDate, tmdbMultiResult.firstAirDate) && l.a(this.genreIds, tmdbMultiResult.genreIds) && l.a(this.character, tmdbMultiResult.character) && l.a(this.job, tmdbMultiResult.job);
    }

    public final String f() {
        return this.title;
    }

    public final Double g() {
        return this.voteAverage;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.mediaType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.posterPath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backdropPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.overview;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.voteAverage;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        String str7 = this.releaseDate;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstAirDate;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<Integer> list = this.genreIds;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.character;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.job;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.mediaType;
        String str2 = this.title;
        String str3 = this.name;
        String str4 = this.posterPath;
        String str5 = this.backdropPath;
        String str6 = this.overview;
        Double d = this.voteAverage;
        String str7 = this.releaseDate;
        String str8 = this.firstAirDate;
        List<Integer> list = this.genreIds;
        String str9 = this.character;
        String str10 = this.job;
        StringBuilder sb = new StringBuilder("TmdbMultiResult(id=");
        sb.append(i);
        sb.append(", mediaType=");
        sb.append(str);
        sb.append(", title=");
        c.y(sb, str2, ", name=", str3, ", posterPath=");
        c.y(sb, str4, ", backdropPath=", str5, ", overview=");
        sb.append(str6);
        sb.append(", voteAverage=");
        sb.append(d);
        sb.append(", releaseDate=");
        c.y(sb, str7, ", firstAirDate=", str8, ", genreIds=");
        sb.append(list);
        sb.append(", character=");
        sb.append(str9);
        sb.append(", job=");
        return a.u(sb, str10, ")");
    }
}
