package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SportsMatchResponse {
    public static final int $stable = 8;
    private final List<SportsMatch> all;
    private final List<SportsMatch> live;
    private final Boolean success;

    public final List a() {
        return this.all;
    }

    public final List b() {
        return this.live;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportsMatchResponse)) {
            return false;
        }
        SportsMatchResponse sportsMatchResponse = (SportsMatchResponse) obj;
        return l.a(this.success, sportsMatchResponse.success) && l.a(this.live, sportsMatchResponse.live) && l.a(this.all, sportsMatchResponse.all);
    }

    public final int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<SportsMatch> list = this.live;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SportsMatch> list2 = this.all;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.success;
        List<SportsMatch> list = this.live;
        List<SportsMatch> list2 = this.all;
        StringBuilder sb = new StringBuilder("SportsMatchResponse(success=");
        sb.append(bool);
        sb.append(", live=");
        sb.append(list);
        sb.append(", all=");
        return f.f(sb, list2, ")");
    }
}
