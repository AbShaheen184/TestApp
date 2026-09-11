package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicAlbumDetail {
    public static final int $stable = 8;
    private final String artist;
    private final String description;
    private final String genre;
    private final String image;
    private final String title;
    private final List<MusicTrack> tracks;
    private final String year;

    public MusicAlbumDetail(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.artist = str2;
        this.image = str3;
        this.year = str4;
        this.genre = str5;
        this.description = str6;
        this.tracks = list;
    }

    public final String a() {
        return this.artist;
    }

    public final String b() {
        return this.description;
    }

    public final String c() {
        return this.genre;
    }

    public final String d() {
        return this.image;
    }

    public final String e() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAlbumDetail)) {
            return false;
        }
        MusicAlbumDetail musicAlbumDetail = (MusicAlbumDetail) obj;
        return l.a(this.title, musicAlbumDetail.title) && l.a(this.artist, musicAlbumDetail.artist) && l.a(this.image, musicAlbumDetail.image) && l.a(this.year, musicAlbumDetail.year) && l.a(this.genre, musicAlbumDetail.genre) && l.a(this.description, musicAlbumDetail.description) && l.a(this.tracks, musicAlbumDetail.tracks);
    }

    public final List f() {
        return this.tracks;
    }

    public final String g() {
        return this.year;
    }

    public final int hashCode() {
        int iE = a.e(this.title.hashCode() * 31, 31, this.artist);
        String str = this.image;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.year;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.genre;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return this.tracks.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.artist;
        String str3 = this.image;
        String str4 = this.year;
        String str5 = this.genre;
        String str6 = this.description;
        List<MusicTrack> list = this.tracks;
        StringBuilder sbO = c.o("MusicAlbumDetail(title=", str, ", artist=", str2, ", image=");
        c.y(sbO, str3, ", year=", str4, ", genre=");
        c.y(sbO, str5, ", description=", str6, ", tracks=");
        return f.f(sbO, list, ")");
    }
}
