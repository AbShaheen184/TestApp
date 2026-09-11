package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeTrack {
    public static final int $stable = 0;
    private final String file;

    @b("default")
    private final Boolean isDefault;
    private final String kind;
    private final String label;

    public HiAnimeTrack(String str, String str2, String str3, Boolean bool) {
        this.file = str;
        this.label = str2;
        this.kind = str3;
        this.isDefault = bool;
    }

    public final String a() {
        return this.file;
    }

    public final String b() {
        return this.label;
    }

    public final Boolean c() {
        return this.isDefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeTrack)) {
            return false;
        }
        HiAnimeTrack hiAnimeTrack = (HiAnimeTrack) obj;
        return l.a(this.file, hiAnimeTrack.file) && l.a(this.label, hiAnimeTrack.label) && l.a(this.kind, hiAnimeTrack.kind) && l.a(this.isDefault, hiAnimeTrack.isDefault);
    }

    public final int hashCode() {
        String str = this.file;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kind;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefault;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.file;
        String str2 = this.label;
        String str3 = this.kind;
        Boolean bool = this.isDefault;
        StringBuilder sbO = c.o("HiAnimeTrack(file=", str, ", label=", str2, ", kind=");
        sbO.append(str3);
        sbO.append(", isDefault=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }
}
