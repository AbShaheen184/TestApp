package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Game {
    public static final int $stable = 0;
    private final String description;
    private final String developer;
    private final String genre;
    private final String name;
    private final String players;
    private final String posterUrl;
    private final String publisher;
    private final String region;
    private final String romUrl;
    private final String slug;
    private final String year;

    public final String a() {
        return this.name;
    }

    public final String b() {
        return this.posterUrl;
    }

    public final String c() {
        return this.slug;
    }

    public final String d() {
        return this.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Game)) {
            return false;
        }
        Game game = (Game) obj;
        return l.a(this.slug, game.slug) && l.a(this.name, game.name) && l.a(this.year, game.year) && l.a(this.developer, game.developer) && l.a(this.publisher, game.publisher) && l.a(this.genre, game.genre) && l.a(this.description, game.description) && l.a(this.players, game.players) && l.a(this.region, game.region) && l.a(this.romUrl, game.romUrl) && l.a(this.posterUrl, game.posterUrl);
    }

    public final int hashCode() {
        int iHashCode = this.slug.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.year;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.developer;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.publisher;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.genre;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.players;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.region;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.romUrl;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.posterUrl;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        String str = this.slug;
        String str2 = this.name;
        String str3 = this.year;
        String str4 = this.developer;
        String str5 = this.publisher;
        String str6 = this.genre;
        String str7 = this.description;
        String str8 = this.players;
        String str9 = this.region;
        String str10 = this.romUrl;
        String str11 = this.posterUrl;
        StringBuilder sbO = c.o("Game(slug=", str, ", name=", str2, ", year=");
        c.y(sbO, str3, ", developer=", str4, ", publisher=");
        c.y(sbO, str5, ", genre=", str6, ", description=");
        c.y(sbO, str7, ", players=", str8, ", region=");
        c.y(sbO, str9, ", romUrl=", str10, ", posterUrl=");
        return a.u(sbO, str11, ")");
    }
}
