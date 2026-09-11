package com.app.mlounge.data.local.entity;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str5.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && l.a(this.b, dVar.b) && l.a(this.c, dVar.c) && l.a(this.d, dVar.d) && l.a(this.e, dVar.e) && l.a(this.f, dVar.f) && l.a(this.g, dVar.g);
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iE2 = androidx.privacysandbox.ads.adservices.java.internal.a.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        return iE2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IptvChannelEntity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", url=", this.c, ", logo=", this.d);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, ", groupName=", this.e, ", provider=", this.f);
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(sb, ", tvgId=", this.g, ")");
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6) {
        this(0L, str, str2, str3, str4, str5, str6);
    }
}
