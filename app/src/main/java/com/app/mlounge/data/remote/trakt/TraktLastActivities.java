package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktLastActivities {
    public static final int $stable = 0;
    private final String all;
    private final TraktActivityTimestamps episodes;
    private final TraktActivityTimestamps movies;
    private final TraktActivityTimestamps shows;
    private final TraktActivityTimestamps watchlist;

    public final TraktActivityTimestamps a() {
        return this.episodes;
    }

    public final TraktActivityTimestamps b() {
        return this.movies;
    }

    public final TraktActivityTimestamps c() {
        return this.shows;
    }

    public final TraktActivityTimestamps d() {
        return this.watchlist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktLastActivities)) {
            return false;
        }
        TraktLastActivities traktLastActivities = (TraktLastActivities) obj;
        return l.a(this.all, traktLastActivities.all) && l.a(this.movies, traktLastActivities.movies) && l.a(this.episodes, traktLastActivities.episodes) && l.a(this.shows, traktLastActivities.shows) && l.a(this.watchlist, traktLastActivities.watchlist);
    }

    public final int hashCode() {
        String str = this.all;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TraktActivityTimestamps traktActivityTimestamps = this.movies;
        int iHashCode2 = (iHashCode + (traktActivityTimestamps == null ? 0 : traktActivityTimestamps.hashCode())) * 31;
        TraktActivityTimestamps traktActivityTimestamps2 = this.episodes;
        int iHashCode3 = (iHashCode2 + (traktActivityTimestamps2 == null ? 0 : traktActivityTimestamps2.hashCode())) * 31;
        TraktActivityTimestamps traktActivityTimestamps3 = this.shows;
        int iHashCode4 = (iHashCode3 + (traktActivityTimestamps3 == null ? 0 : traktActivityTimestamps3.hashCode())) * 31;
        TraktActivityTimestamps traktActivityTimestamps4 = this.watchlist;
        return iHashCode4 + (traktActivityTimestamps4 != null ? traktActivityTimestamps4.hashCode() : 0);
    }

    public final String toString() {
        return "TraktLastActivities(all=" + this.all + ", movies=" + this.movies + ", episodes=" + this.episodes + ", shows=" + this.shows + ", watchlist=" + this.watchlist + ")";
    }
}
