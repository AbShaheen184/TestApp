package com.app.mlounge.data.iptv;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class EarthCamCamItem {
    private final String category;
    private final String city;
    private final String country;
    private final String id;
    private final String state;

    @com.google.gson.annotations.b("state_full")
    private final String stateFull;
    private final String thumbnail;

    @com.google.gson.annotations.b("thumbnail_large")
    private final String thumbnailLarge;
    private final String title;
    private final String url;

    public EarthCamCamItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.id = str;
        this.title = str2;
        this.city = str3;
        this.country = str4;
        this.state = str5;
        this.stateFull = str6;
        this.category = str7;
        this.thumbnail = str8;
        this.thumbnailLarge = str9;
        this.url = str10;
    }

    public static /* synthetic */ EarthCamCamItem copy$default(EarthCamCamItem earthCamCamItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earthCamCamItem.id;
        }
        if ((i & 2) != 0) {
            str2 = earthCamCamItem.title;
        }
        if ((i & 4) != 0) {
            str3 = earthCamCamItem.city;
        }
        if ((i & 8) != 0) {
            str4 = earthCamCamItem.country;
        }
        if ((i & 16) != 0) {
            str5 = earthCamCamItem.state;
        }
        if ((i & 32) != 0) {
            str6 = earthCamCamItem.stateFull;
        }
        if ((i & 64) != 0) {
            str7 = earthCamCamItem.category;
        }
        if ((i & 128) != 0) {
            str8 = earthCamCamItem.thumbnail;
        }
        if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
            str9 = earthCamCamItem.thumbnailLarge;
        }
        if ((i & 512) != 0) {
            str10 = earthCamCamItem.url;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return earthCamCamItem.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.country;
    }

    public final String component5() {
        return this.state;
    }

    public final String component6() {
        return this.stateFull;
    }

    public final String component7() {
        return this.category;
    }

    public final String component8() {
        return this.thumbnail;
    }

    public final String component9() {
        return this.thumbnailLarge;
    }

    public final EarthCamCamItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new EarthCamCamItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarthCamCamItem)) {
            return false;
        }
        EarthCamCamItem earthCamCamItem = (EarthCamCamItem) obj;
        return kotlin.jvm.internal.l.a(this.id, earthCamCamItem.id) && kotlin.jvm.internal.l.a(this.title, earthCamCamItem.title) && kotlin.jvm.internal.l.a(this.city, earthCamCamItem.city) && kotlin.jvm.internal.l.a(this.country, earthCamCamItem.country) && kotlin.jvm.internal.l.a(this.state, earthCamCamItem.state) && kotlin.jvm.internal.l.a(this.stateFull, earthCamCamItem.stateFull) && kotlin.jvm.internal.l.a(this.category, earthCamCamItem.category) && kotlin.jvm.internal.l.a(this.thumbnail, earthCamCamItem.thumbnail) && kotlin.jvm.internal.l.a(this.thumbnailLarge, earthCamCamItem.thumbnailLarge) && kotlin.jvm.internal.l.a(this.url, earthCamCamItem.url);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getId() {
        return this.id;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStateFull() {
        return this.stateFull;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getThumbnailLarge() {
        return this.thumbnailLarge;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stateFull;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.category;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.thumbnail;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.thumbnailLarge;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.url;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.city;
        String str4 = this.country;
        String str5 = this.state;
        String str6 = this.stateFull;
        String str7 = this.category;
        String str8 = this.thumbnail;
        String str9 = this.thumbnailLarge;
        String str10 = this.url;
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("EarthCamCamItem(id=", str, ", title=", str2, ", city=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str3, ", country=", str4, ", state=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str5, ", stateFull=", str6, ", category=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, str7, ", thumbnail=", str8, ", thumbnailLarge=");
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(sbO, str9, ", url=", str10, ")");
    }
}
