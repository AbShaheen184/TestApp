package com.app.mlounge.data.remote.model;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbGenreResponse {
    public static final int $stable = 8;
    private final List<TmdbGenre> genres;

    public final List a() {
        return this.genres;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TmdbGenreResponse) && l.a(this.genres, ((TmdbGenreResponse) obj).genres);
    }

    public final int hashCode() {
        return this.genres.hashCode();
    }

    public final String toString() {
        return "TmdbGenreResponse(genres=" + this.genres + ")";
    }
}
