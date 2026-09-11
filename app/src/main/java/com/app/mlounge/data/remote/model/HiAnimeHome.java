package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeHome {
    public static final int $stable = 8;
    private final List<HiAnimeItem> latest;
    private final List<HiAnimeItem> spotlight;
    private final List<HiAnimeItem> trending;

    public HiAnimeHome(List list, List list2, List list3) {
        this.trending = list;
        this.latest = list2;
        this.spotlight = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeHome)) {
            return false;
        }
        HiAnimeHome hiAnimeHome = (HiAnimeHome) obj;
        return l.a(this.trending, hiAnimeHome.trending) && l.a(this.latest, hiAnimeHome.latest) && l.a(this.spotlight, hiAnimeHome.spotlight);
    }

    public final int hashCode() {
        List<HiAnimeItem> list = this.trending;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<HiAnimeItem> list2 = this.latest;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HiAnimeItem> list3 = this.spotlight;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<HiAnimeItem> list = this.trending;
        List<HiAnimeItem> list2 = this.latest;
        List<HiAnimeItem> list3 = this.spotlight;
        StringBuilder sb = new StringBuilder("HiAnimeHome(trending=");
        sb.append(list);
        sb.append(", latest=");
        sb.append(list2);
        sb.append(", spotlight=");
        return f.f(sb, list3, ")");
    }
}
