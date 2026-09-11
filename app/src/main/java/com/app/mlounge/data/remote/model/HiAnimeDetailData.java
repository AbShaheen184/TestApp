package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeDetailData {
    public static final int $stable = 8;
    private final HiAnimeAnimeData anime;
    private final List<HiAnimeSeason> seasons = null;
    private final List<HiAnimeItem> relatedAnimes = null;
    private final List<HiAnimeItem> recommendedAnimes = null;

    public HiAnimeDetailData(HiAnimeAnimeData hiAnimeAnimeData) {
        this.anime = hiAnimeAnimeData;
    }

    public final HiAnimeAnimeData a() {
        return this.anime;
    }

    public final List b() {
        return this.recommendedAnimes;
    }

    public final List c() {
        return this.relatedAnimes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeDetailData)) {
            return false;
        }
        HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) obj;
        return l.a(this.anime, hiAnimeDetailData.anime) && l.a(this.seasons, hiAnimeDetailData.seasons) && l.a(this.relatedAnimes, hiAnimeDetailData.relatedAnimes) && l.a(this.recommendedAnimes, hiAnimeDetailData.recommendedAnimes);
    }

    public final int hashCode() {
        HiAnimeAnimeData hiAnimeAnimeData = this.anime;
        int iHashCode = (hiAnimeAnimeData == null ? 0 : hiAnimeAnimeData.hashCode()) * 31;
        List<HiAnimeSeason> list = this.seasons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<HiAnimeItem> list2 = this.relatedAnimes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HiAnimeItem> list3 = this.recommendedAnimes;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeDetailData(anime=" + this.anime + ", seasons=" + this.seasons + ", relatedAnimes=" + this.relatedAnimes + ", recommendedAnimes=" + this.recommendedAnimes + ")";
    }
}
