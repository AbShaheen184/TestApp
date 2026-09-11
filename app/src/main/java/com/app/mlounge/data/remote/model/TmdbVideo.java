package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TmdbVideo {
    public static final int $stable = 0;
    private final String id;
    private final String key;
    private final String name;
    private final Boolean official;
    private final String site;
    private final String type;

    public final String a() {
        return this.key;
    }

    public final String b() {
        return this.site;
    }

    public final String c() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TmdbVideo)) {
            return false;
        }
        TmdbVideo tmdbVideo = (TmdbVideo) obj;
        return l.a(this.id, tmdbVideo.id) && l.a(this.key, tmdbVideo.key) && l.a(this.name, tmdbVideo.name) && l.a(this.site, tmdbVideo.site) && l.a(this.type, tmdbVideo.type) && l.a(this.official, tmdbVideo.official);
    }

    public final int hashCode() {
        int iE = a.e(this.id.hashCode() * 31, 31, this.key);
        String str = this.name;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.site;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.official;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.key;
        String str3 = this.name;
        String str4 = this.site;
        String str5 = this.type;
        Boolean bool = this.official;
        StringBuilder sbO = c.o("TmdbVideo(id=", str, ", key=", str2, ", name=");
        c.y(sbO, str3, ", site=", str4, ", type=");
        sbO.append(str5);
        sbO.append(", official=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }
}
