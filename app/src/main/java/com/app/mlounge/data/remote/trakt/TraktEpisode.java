package com.app.mlounge.data.remote.trakt;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktEpisode {
    public static final int $stable = 0;
    private final TraktIds ids;
    private final Integer number;
    private final Integer season;
    private final String title;

    public final Integer a() {
        return this.number;
    }

    public final Integer b() {
        return this.season;
    }

    public final String c() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktEpisode)) {
            return false;
        }
        TraktEpisode traktEpisode = (TraktEpisode) obj;
        return l.a(this.season, traktEpisode.season) && l.a(this.number, traktEpisode.number) && l.a(this.title, traktEpisode.title) && l.a(this.ids, traktEpisode.ids);
    }

    public final int hashCode() {
        Integer num = this.season;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.number;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TraktIds traktIds = this.ids;
        return iHashCode3 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public final String toString() {
        return "TraktEpisode(season=" + this.season + ", number=" + this.number + ", title=" + this.title + ", ids=" + this.ids + ")";
    }
}
