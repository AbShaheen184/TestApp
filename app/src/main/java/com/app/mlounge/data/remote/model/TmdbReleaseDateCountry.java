package com.app.mlounge.data.remote.model;

import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbReleaseDateCountry {
    public static final int $stable = 8;

    @b("iso_3166_1")
    private final String countryCode;

    @b("release_dates")
    private final List<TmdbReleaseDate> releaseDates;

    public final String a() {
        return this.countryCode;
    }

    public final List b() {
        return this.releaseDates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbReleaseDateCountry)) {
            return false;
        }
        TmdbReleaseDateCountry tmdbReleaseDateCountry = (TmdbReleaseDateCountry) obj;
        return l.a(this.countryCode, tmdbReleaseDateCountry.countryCode) && l.a(this.releaseDates, tmdbReleaseDateCountry.releaseDates);
    }

    public final int hashCode() {
        return this.releaseDates.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final String toString() {
        return "TmdbReleaseDateCountry(countryCode=" + this.countryCode + ", releaseDates=" + this.releaseDates + ")";
    }
}
