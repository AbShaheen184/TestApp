package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ChqStream e;
    public final List f;

    public /* synthetic */ m(String str, String str2, ChqStream chqStream, List list, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0, (i & 16) != 0 ? null : chqStream, (i & 32) != 0 ? kotlin.collections.u.e : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && kotlin.jvm.internal.l.a(this.b, mVar.b) && kotlin.jvm.internal.l.a(this.c, mVar.c) && this.d == mVar.d && kotlin.jvm.internal.l.a(this.e, mVar.e) && kotlin.jvm.internal.l.a(this.f, mVar.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        ChqStream chqStream = this.e;
        return this.f.hashCode() + ((iF + (chqStream != null ? chqStream.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebridUnrestrictState(isLoading=" + this.a + ", error=" + this.b + ", errorTitle=" + this.c + ", showServicePicker=" + this.d + ", pendingStream=" + this.e + ", availableServices=" + this.f + ")";
    }

    public m(boolean z, String str, String str2, boolean z2, ChqStream chqStream, List list) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = chqStream;
        this.f = list;
    }
}
