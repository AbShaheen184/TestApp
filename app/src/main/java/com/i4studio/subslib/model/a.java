package com.i4studio.subslib.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final b a;
    public final int b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public a(b bVar, int i, String str, Integer num, String str2, Integer num2, Integer num3) {
        this.a = bVar;
        this.b = i;
        this.c = str;
        this.d = num;
        this.e = str2;
        this.f = num2;
        this.g = num3;
    }

    public static a a(a aVar, Integer num, Integer num2) {
        b bVar = aVar.a;
        int i = aVar.b;
        String str = aVar.c;
        Integer num3 = aVar.d;
        String str2 = aVar.e;
        bVar.getClass();
        str.getClass();
        return new a(bVar, i, str, num3, str2, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && l.a(this.c, aVar.c) && l.a(this.d, aVar.d) && l.a(this.e, aVar.e) && l.a(this.f, aVar.f) && l.a(this.g, aVar.g);
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "MediaInfo(type=" + this.a + ", tmdbId=" + this.b + ", title=" + this.c + ", year=" + this.d + ", imdbId=" + this.e + ", season=" + this.f + ", episode=" + this.g + ")";
    }
}
