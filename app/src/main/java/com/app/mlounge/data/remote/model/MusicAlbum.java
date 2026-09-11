package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicAlbum {
    public static final int $stable = 0;
    private final String artist;
    private final String image;
    private final String title;
    private final String url;
    private final String year;

    public MusicAlbum(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        this.title = str;
        this.artist = str2;
        this.url = str3;
        this.image = str4;
        this.year = str5;
    }

    public final String a() {
        return this.artist;
    }

    public final String b() {
        return this.image;
    }

    public final String c() {
        return this.title;
    }

    public final String d() {
        return this.url;
    }

    public final String e() {
        return this.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAlbum)) {
            return false;
        }
        MusicAlbum musicAlbum = (MusicAlbum) obj;
        return l.a(this.title, musicAlbum.title) && l.a(this.artist, musicAlbum.artist) && l.a(this.url, musicAlbum.url) && l.a(this.image, musicAlbum.image) && l.a(this.year, musicAlbum.year);
    }

    public final int hashCode() {
        int iE = a.e(a.e(this.title.hashCode() * 31, 31, this.artist), 31, this.url);
        String str = this.image;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.year;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.artist;
        String str3 = this.url;
        String str4 = this.image;
        String str5 = this.year;
        StringBuilder sbO = c.o("MusicAlbum(title=", str, ", artist=", str2, ", url=");
        c.y(sbO, str3, ", image=", str4, ", year=");
        return a.u(sbO, str5, ")");
    }
}
