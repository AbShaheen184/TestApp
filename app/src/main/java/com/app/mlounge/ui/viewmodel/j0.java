package com.app.mlounge.ui.viewmodel;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;

    public j0(String str, String str2, Map map, String str3, int i, String str4, int i2, int i3, String str5) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = i2;
        this.h = i3;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.l.a(this.a, j0Var.a) && kotlin.jvm.internal.l.a(this.b, j0Var.b) && kotlin.jvm.internal.l.a(this.c, j0Var.c) && kotlin.jvm.internal.l.a(this.d, j0Var.d) && this.e == j0Var.e && kotlin.jvm.internal.l.a(this.f, j0Var.f) && this.g == j0Var.g && this.h == j0Var.h && this.i.equals(j0Var.i);
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        int iHashCode = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return this.i.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.h, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.g, androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.e, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("PlayEvent(url=", this.a, ", title=", this.b, ", headers=");
        sbO.append(this.c);
        sbO.append(", streamType=");
        sbO.append(this.d);
        sbO.append(", tmdbId=");
        sbO.append(this.e);
        sbO.append(", contentType=");
        sbO.append(this.f);
        sbO.append(", season=");
        sbO.append(this.g);
        sbO.append(", episode=");
        sbO.append(this.h);
        sbO.append(", contentKey=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sbO, this.i, ")");
    }
}
