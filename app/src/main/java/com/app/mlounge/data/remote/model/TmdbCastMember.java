package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbCastMember {
    public static final int $stable = 0;
    private final String character;
    private final int id;
    private final String name;
    private final Integer order;

    @b("profile_path")
    private final String profilePath;

    public final String a() {
        return this.character;
    }

    public final int b() {
        return this.id;
    }

    public final String c() {
        return this.name;
    }

    public final String d() {
        return this.profilePath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbCastMember)) {
            return false;
        }
        TmdbCastMember tmdbCastMember = (TmdbCastMember) obj;
        return this.id == tmdbCastMember.id && l.a(this.name, tmdbCastMember.name) && l.a(this.character, tmdbCastMember.character) && l.a(this.profilePath, tmdbCastMember.profilePath) && l.a(this.order, tmdbCastMember.order);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.character;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profilePath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.order;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.character;
        String str3 = this.profilePath;
        Integer num = this.order;
        StringBuilder sb = new StringBuilder("TmdbCastMember(id=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", character=");
        c.y(sb, str2, ", profilePath=", str3, ", order=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
