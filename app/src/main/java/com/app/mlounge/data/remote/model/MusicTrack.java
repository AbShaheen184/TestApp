package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicTrack {
    public static final int $stable = 0;
    private final String album;
    private final String albumUrl;
    private final String artist;
    private final String duration;
    private final String id;
    private final String image;
    private final String rel;
    private final String title;

    public MusicTrack(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.id = str;
        this.rel = str2;
        this.title = str3;
        this.artist = str4;
        this.album = str5;
        this.duration = str6;
        this.image = str7;
        this.albumUrl = str8;
    }

    public final String a() {
        return this.albumUrl;
    }

    public final String b() {
        return this.artist;
    }

    public final String c() {
        return this.duration;
    }

    public final String d() {
        return this.id;
    }

    public final String e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTrack)) {
            return false;
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        return l.a(this.id, musicTrack.id) && l.a(this.rel, musicTrack.rel) && l.a(this.title, musicTrack.title) && l.a(this.artist, musicTrack.artist) && l.a(this.album, musicTrack.album) && l.a(this.duration, musicTrack.duration) && l.a(this.image, musicTrack.image) && l.a(this.albumUrl, musicTrack.albumUrl);
    }

    public final String f() {
        return this.rel;
    }

    public final String g() {
        return this.title;
    }

    public final int hashCode() {
        int iE = a.e(a.e(a.e(a.e(this.id.hashCode() * 31, 31, this.rel), 31, this.title), 31, this.artist), 31, this.album);
        String str = this.duration;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.albumUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.rel;
        String str3 = this.title;
        String str4 = this.artist;
        String str5 = this.album;
        String str6 = this.duration;
        String str7 = this.image;
        String str8 = this.albumUrl;
        StringBuilder sbO = c.o("MusicTrack(id=", str, ", rel=", str2, ", title=");
        c.y(sbO, str3, ", artist=", str4, ", album=");
        c.y(sbO, str5, ", duration=", str6, ", image=");
        return c.l(sbO, str7, ", albumUrl=", str8, ")");
    }
}
