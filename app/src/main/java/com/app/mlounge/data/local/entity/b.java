package com.app.mlounge.data.local.entity;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public b(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.b, bVar.b) && l.a(this.c, bVar.c) && l.a(this.d, bVar.d) && l.a(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return Long.hashCode(this.f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("FavouriteGameEntity(slug=", this.a, ", platform=", this.b, ", name=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, this.c, ", posterUrl=", this.d, ", year=");
        sbO.append(this.e);
        sbO.append(", addedAt=");
        sbO.append(this.f);
        sbO.append(")");
        return sbO.toString();
    }
}
