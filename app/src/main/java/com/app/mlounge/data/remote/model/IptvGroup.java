package com.app.mlounge.data.remote.model;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class IptvGroup {
    public static final int $stable = 0;
    private final Integer count;
    private final String name;
    private final String provider;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IptvGroup)) {
            return false;
        }
        IptvGroup iptvGroup = (IptvGroup) obj;
        return l.a(this.name, iptvGroup.name) && l.a(this.count, iptvGroup.count) && l.a(this.provider, iptvGroup.provider);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.provider;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        Integer num = this.count;
        String str2 = this.provider;
        StringBuilder sb = new StringBuilder("IptvGroup(name=");
        sb.append(str);
        sb.append(", count=");
        sb.append(num);
        sb.append(", provider=");
        return a.u(sb, str2, ")");
    }
}
