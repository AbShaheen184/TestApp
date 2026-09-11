package com.app.mlounge.data.iptv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class EarthCamSourceData {

    @com.google.gson.annotations.b("cam_count")
    private final Integer camCount;

    @com.google.gson.annotations.b("cam_items")
    private final List<EarthCamCamItem> camItems;

    public EarthCamSourceData(Integer num, List<EarthCamCamItem> list) {
        this.camCount = num;
        this.camItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarthCamSourceData copy$default(EarthCamSourceData earthCamSourceData, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = earthCamSourceData.camCount;
        }
        if ((i & 2) != 0) {
            list = earthCamSourceData.camItems;
        }
        return earthCamSourceData.copy(num, list);
    }

    public final Integer component1() {
        return this.camCount;
    }

    public final List<EarthCamCamItem> component2() {
        return this.camItems;
    }

    public final EarthCamSourceData copy(Integer num, List<EarthCamCamItem> list) {
        return new EarthCamSourceData(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarthCamSourceData)) {
            return false;
        }
        EarthCamSourceData earthCamSourceData = (EarthCamSourceData) obj;
        return kotlin.jvm.internal.l.a(this.camCount, earthCamSourceData.camCount) && kotlin.jvm.internal.l.a(this.camItems, earthCamSourceData.camItems);
    }

    public final Integer getCamCount() {
        return this.camCount;
    }

    public final List<EarthCamCamItem> getCamItems() {
        return this.camItems;
    }

    public int hashCode() {
        Integer num = this.camCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<EarthCamCamItem> list = this.camItems;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "EarthCamSourceData(camCount=" + this.camCount + ", camItems=" + this.camItems + ")";
    }
}
