package com.app.mlounge.data.local.entity;

import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final long l;
    public final long m;
    public final String n;
    public final String o;
    public final long p;
    public final Long q;
    public final int r;
    public final int s;
    public final int t;
    public final String u;

    public a(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, long j2, long j3, String str10, String str11, long j4, Long l, int i2, int i3, int i4, String str12) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str9.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i;
        this.l = j2;
        this.m = j3;
        this.n = str10;
        this.o = str11;
        this.p = j4;
        this.q = l;
        this.r = i2;
        this.s = i3;
        this.t = i4;
        this.u = str12;
    }

    public static a a(a aVar, long j, String str, int i) {
        long j2 = aVar.a;
        String str2 = aVar.b;
        String str3 = aVar.c;
        String str4 = aVar.d;
        String str5 = aVar.e;
        String str6 = aVar.f;
        String str7 = aVar.g;
        String str8 = aVar.h;
        String str9 = aVar.i;
        String str10 = (i & 512) != 0 ? aVar.j : "pending";
        int i2 = (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? aVar.k : 0;
        long j3 = (i & 2048) != 0 ? aVar.l : 0L;
        String str11 = str10;
        long j4 = (i & 4096) != 0 ? aVar.m : j;
        String str12 = (i & 8192) != 0 ? aVar.n : str;
        String str13 = aVar.o;
        String str14 = str12;
        long j5 = aVar.p;
        Long l = aVar.q;
        int i3 = aVar.r;
        int i4 = aVar.s;
        int i5 = aVar.t;
        String str15 = (i & 1048576) != 0 ? aVar.u : null;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str11.getClass();
        return new a(j2, str2, str3, str4, str5, str6, str7, str8, str9, str11, i2, j3, j4, str14, str13, j5, l, i3, i4, i5, str15);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.o;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && l.a(this.b, aVar.b) && l.a(this.c, aVar.c) && l.a(this.d, aVar.d) && l.a(this.e, aVar.e) && l.a(this.f, aVar.f) && l.a(this.g, aVar.g) && l.a(this.h, aVar.h) && l.a(this.i, aVar.i) && l.a(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && l.a(this.n, aVar.n) && l.a(this.o, aVar.o) && this.p == aVar.p && l.a(this.q, aVar.q) && this.r == aVar.r && this.s == aVar.s && this.t == aVar.t && l.a(this.u, aVar.u);
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.k, androidx.privacysandbox.ads.adservices.java.internal.a.e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.j), 31), 31, this.l), 31, this.m);
        String str5 = this.n;
        int iHashCode4 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iC2 = androidx.privacysandbox.ads.adservices.java.internal.a.c((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.p);
        Long l = this.q;
        int iB = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.t, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.s, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.r, (iC2 + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31);
        String str7 = this.u;
        return iB + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadEntity(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", fileName=", this.c, ", title=", this.d);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", contentType=", this.e, ", contentId=", this.f);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", posterPath=", this.g, ", quality=", this.h);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", size=", this.i, ", status=", this.j);
        sb.append(", progress=");
        sb.append(this.k);
        sb.append(", downloadedBytes=");
        sb.append(this.l);
        sb.append(", totalBytes=");
        sb.append(this.m);
        sb.append(", filePath=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, this.n, ", headers=", this.o, ", addedAt=");
        sb.append(this.p);
        sb.append(", completedAt=");
        sb.append(this.q);
        sb.append(", tmdbId=");
        sb.append(this.r);
        sb.append(", season=");
        sb.append(this.s);
        sb.append(", episode=");
        sb.append(this.t);
        sb.append(", failureReason=");
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }
}
