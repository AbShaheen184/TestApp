package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicGenre {
    public static final int $stable = 8;
    private final String id;
    private final String name;
    private final List<MusicGenre> subGenres;

    public MusicGenre(String str, String str2, List list) {
        this.id = str;
        this.name = str2;
        this.subGenres = list;
    }

    public final String a() {
        return this.id;
    }

    public final String b() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicGenre)) {
            return false;
        }
        MusicGenre musicGenre = (MusicGenre) obj;
        return l.a(this.id, musicGenre.id) && l.a(this.name, musicGenre.name) && l.a(this.subGenres, musicGenre.subGenres);
    }

    public final int hashCode() {
        return this.subGenres.hashCode() + a.e(this.id.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        return f.f(c.o("MusicGenre(id=", str, ", name=", str2, ", subGenres="), this.subGenres, ")");
    }
}
