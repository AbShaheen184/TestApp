package com.app.mlounge.data.remote.api;

import coil3.compose.internal.f;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PlutoChannelsResponse {
    public static final int $stable = 8;
    private final List<PlutoChannel> channels;
    private final String region;
    private final Integer total;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlutoChannelsResponse)) {
            return false;
        }
        PlutoChannelsResponse plutoChannelsResponse = (PlutoChannelsResponse) obj;
        return l.a(this.region, plutoChannelsResponse.region) && l.a(this.total, plutoChannelsResponse.total) && l.a(this.channels, plutoChannelsResponse.channels);
    }

    public final int hashCode() {
        String str = this.region;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.total;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<PlutoChannel> list = this.channels;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.region;
        Integer num = this.total;
        List<PlutoChannel> list = this.channels;
        StringBuilder sb = new StringBuilder("PlutoChannelsResponse(region=");
        sb.append(str);
        sb.append(", total=");
        sb.append(num);
        sb.append(", channels=");
        return f.f(sb, list, ")");
    }
}
