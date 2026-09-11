package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeEpisodesData {
    public static final int $stable = 8;
    private final List<HiAnimeEpisode> episodes;
    private final Integer totalEpisodes;

    public HiAnimeEpisodesData(Integer num, List list) {
        this.totalEpisodes = num;
        this.episodes = list;
    }

    public final List a() {
        return this.episodes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeEpisodesData)) {
            return false;
        }
        HiAnimeEpisodesData hiAnimeEpisodesData = (HiAnimeEpisodesData) obj;
        return l.a(this.totalEpisodes, hiAnimeEpisodesData.totalEpisodes) && l.a(this.episodes, hiAnimeEpisodesData.episodes);
    }

    public final int hashCode() {
        Integer num = this.totalEpisodes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HiAnimeEpisode> list = this.episodes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeEpisodesData(totalEpisodes=" + this.totalEpisodes + ", episodes=" + this.episodes + ")";
    }
}
