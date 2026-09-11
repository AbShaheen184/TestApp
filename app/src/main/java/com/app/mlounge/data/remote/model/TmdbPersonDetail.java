package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbPersonDetail {
    public static final int $stable = 0;
    private final String biography;
    private final String birthday;
    private final String deathday;
    private final int id;

    @b("known_for_department")
    private final String knownForDepartment;
    private final String name;

    @b("place_of_birth")
    private final String placeOfBirth;

    @b("profile_path")
    private final String profilePath;

    public final String a() {
        return this.biography;
    }

    public final String b() {
        return this.birthday;
    }

    public final String c() {
        return this.knownForDepartment;
    }

    public final String d() {
        return this.name;
    }

    public final String e() {
        return this.placeOfBirth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbPersonDetail)) {
            return false;
        }
        TmdbPersonDetail tmdbPersonDetail = (TmdbPersonDetail) obj;
        return this.id == tmdbPersonDetail.id && l.a(this.name, tmdbPersonDetail.name) && l.a(this.biography, tmdbPersonDetail.biography) && l.a(this.birthday, tmdbPersonDetail.birthday) && l.a(this.deathday, tmdbPersonDetail.deathday) && l.a(this.placeOfBirth, tmdbPersonDetail.placeOfBirth) && l.a(this.profilePath, tmdbPersonDetail.profilePath) && l.a(this.knownForDepartment, tmdbPersonDetail.knownForDepartment);
    }

    public final String f() {
        return this.profilePath;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.biography;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthday;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deathday;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.placeOfBirth;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.profilePath;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.knownForDepartment;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.biography;
        String str3 = this.birthday;
        String str4 = this.deathday;
        String str5 = this.placeOfBirth;
        String str6 = this.profilePath;
        String str7 = this.knownForDepartment;
        StringBuilder sb = new StringBuilder("TmdbPersonDetail(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", biography=");
        c.y(sb, str2, ", birthday=", str3, ", deathday=");
        c.y(sb, str4, ", placeOfBirth=", str5, ", profilePath=");
        return c.l(sb, str6, ", knownForDepartment=", str7, ")");
    }
}
