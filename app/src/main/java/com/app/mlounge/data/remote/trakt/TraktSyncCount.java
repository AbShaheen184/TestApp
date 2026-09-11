package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncCount {
    public static final int $stable = 0;
    private final Integer episodes;
    private final Integer movies;
    private final Integer shows;

    public final Integer a() {
        return this.movies;
    }

    public final Integer b() {
        return this.shows;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncCount)) {
            return false;
        }
        TraktSyncCount traktSyncCount = (TraktSyncCount) obj;
        return l.a(this.movies, traktSyncCount.movies) && l.a(this.shows, traktSyncCount.shows) && l.a(this.episodes, traktSyncCount.episodes);
    }

    public final int hashCode() {
        Integer num = this.movies;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.shows;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.episodes;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSyncCount(movies=" + this.movies + ", shows=" + this.shows + ", episodes=" + this.episodes + ")";
    }
}
