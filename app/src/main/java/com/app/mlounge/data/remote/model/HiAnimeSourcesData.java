package com.app.mlounge.data.remote.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSourcesData {
    public static final int $stable = 8;
    private final Map<String, String> headers;
    private final List<HiAnimeSource> sources;
    private final List<HiAnimeTrack> tracks;
    private final Integer anilistID = null;
    private final Integer malID = null;

    public HiAnimeSourcesData(ArrayList arrayList, List list, Map map) {
        this.tracks = arrayList;
        this.sources = list;
        this.headers = map;
    }

    public final Map a() {
        return this.headers;
    }

    public final List b() {
        return this.sources;
    }

    public final List c() {
        return this.tracks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSourcesData)) {
            return false;
        }
        HiAnimeSourcesData hiAnimeSourcesData = (HiAnimeSourcesData) obj;
        return l.a(this.tracks, hiAnimeSourcesData.tracks) && l.a(this.sources, hiAnimeSourcesData.sources) && l.a(this.anilistID, hiAnimeSourcesData.anilistID) && l.a(this.malID, hiAnimeSourcesData.malID) && l.a(this.headers, hiAnimeSourcesData.headers);
    }

    public final int hashCode() {
        List<HiAnimeTrack> list = this.tracks;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<HiAnimeSource> list2 = this.sources;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.anilistID;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.malID;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.headers;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeSourcesData(tracks=" + this.tracks + ", sources=" + this.sources + ", anilistID=" + this.anilistID + ", malID=" + this.malID + ", headers=" + this.headers + ")";
    }
}
