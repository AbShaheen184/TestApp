package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCreditsResponse {
    public static final int $stable = 8;
    private final List<TmdbCastMember> cast;
    private final List<TmdbCrewMember> crew;
    private final int id;

    public final List a() {
        return this.cast;
    }

    public final List b() {
        return this.crew;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCreditsResponse)) {
            return false;
        }
        TmdbCreditsResponse tmdbCreditsResponse = (TmdbCreditsResponse) obj;
        return this.id == tmdbCreditsResponse.id && l.a(this.cast, tmdbCreditsResponse.cast) && l.a(this.crew, tmdbCreditsResponse.crew);
    }

    public final int hashCode() {
        return this.crew.hashCode() + ((this.cast.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
    }

    public final String toString() {
        int i = this.id;
        List<TmdbCastMember> list = this.cast;
        List<TmdbCrewMember> list2 = this.crew;
        StringBuilder sb = new StringBuilder("TmdbCreditsResponse(id=");
        sb.append(i);
        sb.append(", cast=");
        sb.append(list);
        sb.append(", crew=");
        return f.f(sb, list2, ")");
    }
}
