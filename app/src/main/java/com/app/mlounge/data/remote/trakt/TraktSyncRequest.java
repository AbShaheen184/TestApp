package com.app.mlounge.data.remote.trakt;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktSyncRequest {
    public static final int $stable = 8;
    private final List<TraktSyncEpisode> episodes;
    private final List<TraktSyncMovie> movies;
    private final List<TraktSyncShow> shows;

    public TraktSyncRequest(List list, List list2, List list3, int i) {
        list = (i & 1) != 0 ? null : list;
        list2 = (i & 2) != 0 ? null : list2;
        list3 = (i & 4) != 0 ? null : list3;
        this.movies = list;
        this.shows = list2;
        this.episodes = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncRequest)) {
            return false;
        }
        TraktSyncRequest traktSyncRequest = (TraktSyncRequest) obj;
        return l.a(this.movies, traktSyncRequest.movies) && l.a(this.shows, traktSyncRequest.shows) && l.a(this.episodes, traktSyncRequest.episodes);
    }

    public final int hashCode() {
        List<TraktSyncMovie> list = this.movies;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TraktSyncShow> list2 = this.shows;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TraktSyncEpisode> list3 = this.episodes;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<TraktSyncMovie> list = this.movies;
        List<TraktSyncShow> list2 = this.shows;
        List<TraktSyncEpisode> list3 = this.episodes;
        StringBuilder sb = new StringBuilder("TraktSyncRequest(movies=");
        sb.append(list);
        sb.append(", shows=");
        sb.append(list2);
        sb.append(", episodes=");
        return f.f(sb, list3, ")");
    }
}
