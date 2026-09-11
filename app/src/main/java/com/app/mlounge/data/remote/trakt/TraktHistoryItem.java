package com.app.mlounge.data.remote.trakt;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktHistoryItem {
    public static final int $stable = 0;
    private final String action;
    private final TraktEpisode episode;
    private final Long id;
    private final TraktMovie movie;
    private final TraktShow show;
    private final String type;

    @b("watched_at")
    private final String watchedAt;

    public final TraktEpisode a() {
        return this.episode;
    }

    public final TraktMovie b() {
        return this.movie;
    }

    public final TraktShow c() {
        return this.show;
    }

    public final String d() {
        return this.type;
    }

    public final String e() {
        return this.watchedAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktHistoryItem)) {
            return false;
        }
        TraktHistoryItem traktHistoryItem = (TraktHistoryItem) obj;
        return l.a(this.id, traktHistoryItem.id) && l.a(this.watchedAt, traktHistoryItem.watchedAt) && l.a(this.action, traktHistoryItem.action) && l.a(this.type, traktHistoryItem.type) && l.a(this.movie, traktHistoryItem.movie) && l.a(this.show, traktHistoryItem.show) && l.a(this.episode, traktHistoryItem.episode);
    }

    public final int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.watchedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.action;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TraktMovie traktMovie = this.movie;
        int iHashCode5 = (iHashCode4 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.show;
        int iHashCode6 = (iHashCode5 + (traktShow == null ? 0 : traktShow.hashCode())) * 31;
        TraktEpisode traktEpisode = this.episode;
        return iHashCode6 + (traktEpisode != null ? traktEpisode.hashCode() : 0);
    }

    public final String toString() {
        Long l = this.id;
        String str = this.watchedAt;
        String str2 = this.action;
        String str3 = this.type;
        TraktMovie traktMovie = this.movie;
        TraktShow traktShow = this.show;
        TraktEpisode traktEpisode = this.episode;
        StringBuilder sb = new StringBuilder("TraktHistoryItem(id=");
        sb.append(l);
        sb.append(", watchedAt=");
        sb.append(str);
        sb.append(", action=");
        c.y(sb, str2, ", type=", str3, ", movie=");
        sb.append(traktMovie);
        sb.append(", show=");
        sb.append(traktShow);
        sb.append(", episode=");
        sb.append(traktEpisode);
        sb.append(")");
        return sb.toString();
    }
}
