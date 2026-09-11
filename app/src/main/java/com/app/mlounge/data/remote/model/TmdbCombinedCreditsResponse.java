package com.app.mlounge.data.remote.model;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCombinedCreditsResponse {
    public static final int $stable = 8;
    private final List<TmdbMultiResult> cast;
    private final List<TmdbMultiResult> crew;
    private final int id;

    public final List a() {
        return this.cast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCombinedCreditsResponse)) {
            return false;
        }
        TmdbCombinedCreditsResponse tmdbCombinedCreditsResponse = (TmdbCombinedCreditsResponse) obj;
        return this.id == tmdbCombinedCreditsResponse.id && l.a(this.cast, tmdbCombinedCreditsResponse.cast) && l.a(this.crew, tmdbCombinedCreditsResponse.crew);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        List<TmdbMultiResult> list = this.cast;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<TmdbMultiResult> list2 = this.crew;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        List<TmdbMultiResult> list = this.cast;
        List<TmdbMultiResult> list2 = this.crew;
        StringBuilder sb = new StringBuilder("TmdbCombinedCreditsResponse(id=");
        sb.append(i);
        sb.append(", cast=");
        sb.append(list);
        sb.append(", crew=");
        return f.f(sb, list2, ")");
    }
}
