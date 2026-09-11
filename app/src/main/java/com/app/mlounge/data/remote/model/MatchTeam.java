package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MatchTeam {
    public static final int $stable = 0;
    private final String badge;
    private final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchTeam)) {
            return false;
        }
        MatchTeam matchTeam = (MatchTeam) obj;
        return l.a(this.name, matchTeam.name) && l.a(this.badge, matchTeam.badge);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.badge;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return c.j("MatchTeam(name=", this.name, ", badge=", this.badge, ")");
    }
}
