package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class MusicStreamResult {
    public static final int $stable = 0;
    private final String type;
    private final String url;

    public MusicStreamResult(String str, String str2) {
        str.getClass();
        this.url = str;
        this.type = str2;
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
        if (!(obj instanceof MusicStreamResult)) {
            return false;
        }
        MusicStreamResult musicStreamResult = (MusicStreamResult) obj;
        return l.a(this.url, musicStreamResult.url) && l.a(this.type, musicStreamResult.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return c.j("MusicStreamResult(url=", this.url, ", type=", this.type, ")");
    }
}
