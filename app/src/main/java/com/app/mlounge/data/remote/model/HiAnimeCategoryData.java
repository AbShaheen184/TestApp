package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeCategoryData {
    public static final int $stable = 8;
    private final List<HiAnimeItem> animes;
    private final Integer currentPage;
    private final Boolean hasNextPage;
    private final Integer totalPages;

    public HiAnimeCategoryData(List list, Integer num, Integer num2, Boolean bool) {
        this.animes = list;
        this.currentPage = num;
        this.totalPages = num2;
        this.hasNextPage = bool;
    }

    public final List a() {
        return this.animes;
    }

    public final Boolean b() {
        return this.hasNextPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeCategoryData)) {
            return false;
        }
        HiAnimeCategoryData hiAnimeCategoryData = (HiAnimeCategoryData) obj;
        return l.a(this.animes, hiAnimeCategoryData.animes) && l.a(this.currentPage, hiAnimeCategoryData.currentPage) && l.a(this.totalPages, hiAnimeCategoryData.totalPages) && l.a(this.hasNextPage, hiAnimeCategoryData.hasNextPage);
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
        return "HiAnimeCategoryData(animes=" + this.animes + ", currentPage=" + this.currentPage + ", totalPages=" + this.totalPages + ", hasNextPage=" + this.hasNextPage + ")";
    }
}
