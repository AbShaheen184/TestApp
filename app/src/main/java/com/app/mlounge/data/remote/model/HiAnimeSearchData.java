package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSearchData {
    public static final int $stable = 8;
    private final List<HiAnimeItem> animes;
    private final Integer currentPage;
    private final Boolean hasNextPage;
    private final Integer totalPages;

    public HiAnimeSearchData(List list) {
        Boolean bool = Boolean.FALSE;
        this.animes = list;
        this.currentPage = 1;
        this.totalPages = 1;
        this.hasNextPage = bool;
    }

    public final List a() {
        return this.animes;
    }

    public final Integer b() {
        return this.currentPage;
    }

    public final Boolean c() {
        return this.hasNextPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSearchData)) {
            return false;
        }
        HiAnimeSearchData hiAnimeSearchData = (HiAnimeSearchData) obj;
        return l.a(this.animes, hiAnimeSearchData.animes) && l.a(this.currentPage, hiAnimeSearchData.currentPage) && l.a(this.totalPages, hiAnimeSearchData.totalPages) && l.a(this.hasNextPage, hiAnimeSearchData.hasNextPage);
    }

    public final int hashCode() {
        List<HiAnimeItem> list = this.animes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.currentPage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPages;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasNextPage;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeSearchData(animes=" + this.animes + ", currentPage=" + this.currentPage + ", totalPages=" + this.totalPages + ", hasNextPage=" + this.hasNextPage + ")";
    }
}
