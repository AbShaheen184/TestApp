package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSeason {
    public static final int $stable = 0;
    private final String id;
    private final Boolean isCurrent;
    private final String name;
    private final String poster;
    private final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSeason)) {
            return false;
        }
        HiAnimeSeason hiAnimeSeason = (HiAnimeSeason) obj;
        return l.a(this.id, hiAnimeSeason.id) && l.a(this.name, hiAnimeSeason.name) && l.a(this.title, hiAnimeSeason.title) && l.a(this.poster, hiAnimeSeason.poster) && l.a(this.isCurrent, hiAnimeSeason.isCurrent);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poster;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isCurrent;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.title;
        String str4 = this.poster;
        Boolean bool = this.isCurrent;
        StringBuilder sbO = c.o("HiAnimeSeason(id=", str, ", name=", str2, ", title=");
        c.y(sbO, str3, ", poster=", str4, ", isCurrent=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }
}
