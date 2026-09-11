package com.app.mlounge.data.repository;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final String a;
    public final List b;
    public final boolean c;
    public final List d;

    public b0(String str, List list, List list2, boolean z) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.l.a(this.a, b0Var.a) && kotlin.jvm.internal.l.a(this.b, b0Var.b) && this.c == b0Var.c && kotlin.jvm.internal.l.a(this.d, b0Var.d);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        List list = this.d;
        return iF + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ProviderResult(providerName=" + this.a + ", streams=" + this.b + ", success=" + this.c + ", animeSubtitles=" + this.d + ")";
    }
}
