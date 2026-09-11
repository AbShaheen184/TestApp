package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeSource {
    public static final int $stable = 0;
    private final String type = "hls";
    private final String url;

    public HiAnimeSource(String str) {
        this.url = str;
    }

    public final String a() {
        return this.type;
    }

    public final String b() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeSource)) {
            return false;
        }
        HiAnimeSource hiAnimeSource = (HiAnimeSource) obj;
        return l.a(this.url, hiAnimeSource.url) && l.a(this.type, hiAnimeSource.type);
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.type;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return c.j("HiAnimeSource(url=", this.url, ", type=", this.type, ")");
    }
}
