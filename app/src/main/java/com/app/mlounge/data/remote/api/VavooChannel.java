package com.app.mlounge.data.remote.api;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class VavooChannel {
    public static final int $stable = 0;
    private final String group;
    private final String name;
    private final String poster;
    private final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VavooChannel)) {
            return false;
        }
        VavooChannel vavooChannel = (VavooChannel) obj;
        return l.a(this.name, vavooChannel.name) && l.a(this.url, vavooChannel.url) && l.a(this.group, vavooChannel.group) && l.a(this.poster, vavooChannel.poster);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.group;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.poster;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.url;
        return c.l(c.o("VavooChannel(name=", str, ", url=", str2, ", group="), this.group, ", poster=", this.poster, ")");
    }
}
