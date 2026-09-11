package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SportsMatch {
    public static final int $stable = 8;
    private final String category;
    private final Long date;
    private final String id;
    private final Boolean live;
    private final Boolean popular;
    private final String poster;
    private final String server;
    private final List<MatchSource> sources;
    private final MatchTeams teams;
    private final String title;
    private final String tournament;

    public SportsMatch(String str, String str2, String str3, String str4, Long l, String str5, Boolean bool, MatchTeams matchTeams, List list, Boolean bool2, String str6) {
        this.id = str;
        this.title = str2;
        this.category = str3;
        this.tournament = str4;
        this.date = l;
        this.poster = str5;
        this.popular = bool;
        this.teams = matchTeams;
        this.sources = list;
        this.live = bool2;
        this.server = str6;
    }

    public static SportsMatch a(SportsMatch sportsMatch, String str) {
        String str2 = sportsMatch.id;
        String str3 = sportsMatch.title;
        String str4 = sportsMatch.category;
        String str5 = sportsMatch.tournament;
        Long l = sportsMatch.date;
        String str6 = sportsMatch.poster;
        Boolean bool = sportsMatch.popular;
        MatchTeams matchTeams = sportsMatch.teams;
        List<MatchSource> list = sportsMatch.sources;
        Boolean bool2 = sportsMatch.live;
        sportsMatch.getClass();
        return new SportsMatch(str2, str3, str4, str5, l, str6, bool, matchTeams, list, bool2, str);
    }

    public final Long b() {
        return this.date;
    }

    public final String c() {
        return this.id;
    }

    public final String d() {
        return this.poster;
    }

    public final String e() {
        return this.server;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportsMatch)) {
            return false;
        }
        SportsMatch sportsMatch = (SportsMatch) obj;
        return l.a(this.id, sportsMatch.id) && l.a(this.title, sportsMatch.title) && l.a(this.category, sportsMatch.category) && l.a(this.tournament, sportsMatch.tournament) && l.a(this.date, sportsMatch.date) && l.a(this.poster, sportsMatch.poster) && l.a(this.popular, sportsMatch.popular) && l.a(this.teams, sportsMatch.teams) && l.a(this.sources, sportsMatch.sources) && l.a(this.live, sportsMatch.live) && l.a(this.server, sportsMatch.server);
    }

    public final List f() {
        return this.sources;
    }

    public final String g() {
        return this.title;
    }

    public final String h() {
        return this.tournament;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tournament;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.date;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.poster;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.popular;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        MatchTeams matchTeams = this.teams;
        int iHashCode8 = (iHashCode7 + (matchTeams == null ? 0 : matchTeams.hashCode())) * 31;
        List<MatchSource> list = this.sources;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.live;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.server;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.category;
        String str4 = this.tournament;
        Long l = this.date;
        String str5 = this.poster;
        Boolean bool = this.popular;
        MatchTeams matchTeams = this.teams;
        List<MatchSource> list = this.sources;
        Boolean bool2 = this.live;
        String str6 = this.server;
        StringBuilder sbO = c.o("SportsMatch(id=", str, ", title=", str2, ", category=");
        c.y(sbO, str3, ", tournament=", str4, ", date=");
        sbO.append(l);
        sbO.append(", poster=");
        sbO.append(str5);
        sbO.append(", popular=");
        sbO.append(bool);
        sbO.append(", teams=");
        sbO.append(matchTeams);
        sbO.append(", sources=");
        sbO.append(list);
        sbO.append(", live=");
        sbO.append(bool2);
        sbO.append(", server=");
        return a.u(sbO, str6, ")");
    }
}
