package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicArtist {
    public static final int $stable = 0;
    private final String image;
    private final String name;
    private final String url;

    public MusicArtist(String str, String str2) {
        str.getClass();
        this.name = str;
        this.url = str2;
        this.image = null;
    }

    public final String a() {
        return this.image;
    }

    public final String b() {
        return this.name;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicArtist)) {
            return false;
        }
        MusicArtist musicArtist = (MusicArtist) obj;
        return l.a(this.name, musicArtist.name) && l.a(this.url, musicArtist.url) && l.a(this.image, musicArtist.image);
    }

    public final int hashCode() {
        int iE = a.e(this.name.hashCode() * 31, 31, this.url);
        String str = this.image;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.url;
        return a.u(c.o("MusicArtist(name=", str, ", url=", str2, ", image="), this.image, ")");
    }
}
