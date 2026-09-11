package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeServersData {
    public static final int $stable = 8;
    private final List<HiAnimeServer> dub;
    private final String episodeId;
    private final Integer episodeNo;
    private final List<HiAnimeServer> raw = null;
    private final List<HiAnimeServer> sub;

    public HiAnimeServersData(String str, Integer num, ArrayList arrayList, ArrayList arrayList2) {
        this.episodeId = str;
        this.episodeNo = num;
        this.sub = arrayList;
        this.dub = arrayList2;
    }

    public final List a() {
        return this.dub;
    }

    public final List b() {
        return this.raw;
    }

    public final List c() {
        return this.sub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeServersData)) {
            return false;
        }
        HiAnimeServersData hiAnimeServersData = (HiAnimeServersData) obj;
        return l.a(this.episodeId, hiAnimeServersData.episodeId) && l.a(this.episodeNo, hiAnimeServersData.episodeNo) && l.a(this.sub, hiAnimeServersData.sub) && l.a(this.dub, hiAnimeServersData.dub) && l.a(this.raw, hiAnimeServersData.raw);
    }

    public final int hashCode() {
        String str = this.episodeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.episodeNo;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<HiAnimeServer> list = this.sub;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<HiAnimeServer> list2 = this.dub;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HiAnimeServer> list3 = this.raw;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.episodeId;
        Integer num = this.episodeNo;
        List<HiAnimeServer> list = this.sub;
        List<HiAnimeServer> list2 = this.dub;
        List<HiAnimeServer> list3 = this.raw;
        StringBuilder sb = new StringBuilder("HiAnimeServersData(episodeId=");
        sb.append(str);
        sb.append(", episodeNo=");
        sb.append(num);
        sb.append(", sub=");
        sb.append(list);
        sb.append(", dub=");
        sb.append(list2);
        sb.append(", raw=");
        return f.f(sb, list3, ")");
    }
}
