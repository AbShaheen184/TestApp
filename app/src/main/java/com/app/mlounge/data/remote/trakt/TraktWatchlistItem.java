package com.app.mlounge.data.remote.trakt;

import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktWatchlistItem {
    public static final int $stable = 0;

    @b("listed_at")
    private final String listedAt;
    private final TraktMovie movie;
    private final Integer rank;
    private final TraktShow show;
    private final String type;

    public final String a() {
        return this.listedAt;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktWatchlistItem)) {
            return false;
        }
        TraktWatchlistItem traktWatchlistItem = (TraktWatchlistItem) obj;
        return l.a(this.rank, traktWatchlistItem.rank) && l.a(this.listedAt, traktWatchlistItem.listedAt) && l.a(this.type, traktWatchlistItem.type) && l.a(this.movie, traktWatchlistItem.movie) && l.a(this.show, traktWatchlistItem.show);
    }

    public final int hashCode() {
        Integer num = this.rank;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.listedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TraktMovie traktMovie = this.movie;
        int iHashCode4 = (iHashCode3 + (traktMovie == null ? 0 : traktMovie.hashCode())) * 31;
        TraktShow traktShow = this.show;
        return iHashCode4 + (traktShow != null ? traktShow.hashCode() : 0);
    }

    public final String toString() {
        return "TraktWatchlistItem(rank=" + this.rank + ", listedAt=" + this.listedAt + ", type=" + this.type + ", movie=" + this.movie + ", show=" + this.show + ")";
    }
}
