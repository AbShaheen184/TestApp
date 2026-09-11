package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeEpisode {
    public static final int $stable = 0;
    private final String episodeId;
    private final Boolean isFiller;
    private final Integer number;
    private final String title;

    public HiAnimeEpisode(String str, Integer num, String str2) {
        Boolean bool = Boolean.FALSE;
        this.episodeId = str;
        this.number = num;
        this.title = str2;
        this.isFiller = bool;
    }

    public final String a() {
        return this.episodeId;
    }

    public final Integer b() {
        return this.number;
    }

    public final String c() {
        return this.title;
    }

    public final Boolean d() {
        return this.isFiller;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeEpisode)) {
            return false;
        }
        HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) obj;
        return l.a(this.episodeId, hiAnimeEpisode.episodeId) && l.a(this.number, hiAnimeEpisode.number) && l.a(this.title, hiAnimeEpisode.title) && l.a(this.isFiller, hiAnimeEpisode.isFiller);
    }

    public final int hashCode() {
        String str = this.episodeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.number;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isFiller;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeEpisode(episodeId=" + this.episodeId + ", number=" + this.number + ", title=" + this.title + ", isFiller=" + this.isFiller + ")";
    }
}
