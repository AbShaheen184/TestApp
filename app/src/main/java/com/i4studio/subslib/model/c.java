package com.i4studio.subslib.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && this.f.equals(cVar.f);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + ((((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31) + 114165) * 31)) * 961) + 80234152;
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("Subtitle(id=", this.a, ", name=", this.b, ", language=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sbO, this.c, ", languageCode=", this.d, ", downloadUrl=");
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(sbO, this.e, ", format=srt, releaseName=", this.f, ", rating=null, source=SubDL)");
    }
}
