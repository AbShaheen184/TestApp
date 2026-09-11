package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbReleaseDatesResponse {
    public static final int $stable = 8;
    private final int id;
    private final List<TmdbReleaseDateCountry> results;

    public final List a() {
        return this.results;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbReleaseDatesResponse)) {
            return false;
        }
        TmdbReleaseDatesResponse tmdbReleaseDatesResponse = (TmdbReleaseDatesResponse) obj;
        return this.id == tmdbReleaseDatesResponse.id && l.a(this.results, tmdbReleaseDatesResponse.results);
    }

    public final int hashCode() {
        return this.results.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return "TmdbReleaseDatesResponse(id=" + this.id + ", results=" + this.results + ")";
    }
}
