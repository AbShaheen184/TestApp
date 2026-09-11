package com.app.mlounge.data.remote.api;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PlutoChannel {
    public static final int $stable = 0;
    private final String category;
    private final String logo;
    private final String name;
    private final Integer number;
    private final String slug;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlutoChannel)) {
            return false;
        }
        PlutoChannel plutoChannel = (PlutoChannel) obj;
        return l.a(this.name, plutoChannel.name) && l.a(this.slug, plutoChannel.slug) && l.a(this.logo, plutoChannel.logo) && l.a(this.category, plutoChannel.category) && l.a(this.number, plutoChannel.number);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.slug;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.number;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.slug;
        String str3 = this.logo;
        String str4 = this.category;
        Integer num = this.number;
        StringBuilder sbO = c.o("PlutoChannel(name=", str, ", slug=", str2, ", logo=");
        c.y(sbO, str3, ", category=", str4, ", number=");
        sbO.append(num);
        sbO.append(")");
        return sbO.toString();
    }
}
