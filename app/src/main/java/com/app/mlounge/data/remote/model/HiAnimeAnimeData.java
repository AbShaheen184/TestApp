package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeAnimeData {
    public static final int $stable = 8;
    private final HiAnimeInfo info;
    private final HiAnimeMoreInfo moreInfo;

    public HiAnimeAnimeData(HiAnimeInfo hiAnimeInfo, HiAnimeMoreInfo hiAnimeMoreInfo) {
        this.info = hiAnimeInfo;
        this.moreInfo = hiAnimeMoreInfo;
    }

    public final HiAnimeInfo a() {
        return this.info;
    }

    public final HiAnimeMoreInfo b() {
        return this.moreInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeAnimeData)) {
            return false;
        }
        HiAnimeAnimeData hiAnimeAnimeData = (HiAnimeAnimeData) obj;
        return l.a(this.info, hiAnimeAnimeData.info) && l.a(this.moreInfo, hiAnimeAnimeData.moreInfo);
    }

    public final int hashCode() {
        HiAnimeInfo hiAnimeInfo = this.info;
        int iHashCode = (hiAnimeInfo == null ? 0 : hiAnimeInfo.hashCode()) * 31;
        HiAnimeMoreInfo hiAnimeMoreInfo = this.moreInfo;
        return iHashCode + (hiAnimeMoreInfo != null ? hiAnimeMoreInfo.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeAnimeData(info=" + this.info + ", moreInfo=" + this.moreInfo + ")";
    }
}
