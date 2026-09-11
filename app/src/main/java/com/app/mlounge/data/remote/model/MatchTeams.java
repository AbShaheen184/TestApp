package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MatchTeams {
    public static final int $stable = 0;
    private final MatchTeam away;
    private final MatchTeam home;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchTeams)) {
            return false;
        }
        MatchTeams matchTeams = (MatchTeams) obj;
        return l.a(this.home, matchTeams.home) && l.a(this.away, matchTeams.away);
    }

    public final int hashCode() {
        MatchTeam matchTeam = this.home;
        int iHashCode = (matchTeam == null ? 0 : matchTeam.hashCode()) * 31;
        MatchTeam matchTeam2 = this.away;
        return iHashCode + (matchTeam2 != null ? matchTeam2.hashCode() : 0);
    }

    public final String toString() {
        return "MatchTeams(home=" + this.home + ", away=" + this.away + ")";
    }
}
