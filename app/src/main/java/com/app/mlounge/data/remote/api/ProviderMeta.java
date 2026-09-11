package com.app.mlounge.data.remote.api;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ProviderMeta {
    public static final int $stable = 0;
    private final Integer channels;
    private final Boolean exists;
    private final String lastUpdated;
    private final Long sizeBytes;
    private final String source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderMeta)) {
            return false;
        }
        ProviderMeta providerMeta = (ProviderMeta) obj;
        return l.a(this.exists, providerMeta.exists) && l.a(this.lastUpdated, providerMeta.lastUpdated) && l.a(this.channels, providerMeta.channels) && l.a(this.source, providerMeta.source) && l.a(this.sizeBytes, providerMeta.sizeBytes);
    }

    public final int hashCode() {
        Boolean bool = this.exists;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.lastUpdated;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.channels;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.sizeBytes;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "ProviderMeta(exists=" + this.exists + ", lastUpdated=" + this.lastUpdated + ", channels=" + this.channels + ", source=" + this.source + ", sizeBytes=" + this.sizeBytes + ")";
    }
}
