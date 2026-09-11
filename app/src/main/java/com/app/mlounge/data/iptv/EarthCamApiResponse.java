package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class EarthCamApiResponse {
    private final List<IptvChannel> data;
    private final int status;

    public EarthCamApiResponse(int i, List<IptvChannel> list) {
        list.getClass();
        this.status = i;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarthCamApiResponse copy$default(EarthCamApiResponse earthCamApiResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = earthCamApiResponse.status;
        }
        if ((i2 & 2) != 0) {
            list = earthCamApiResponse.data;
        }
        return earthCamApiResponse.copy(i, list);
    }

    public final int component1() {
        return this.status;
    }

    public final List<IptvChannel> component2() {
        return this.data;
    }

    public final EarthCamApiResponse copy(int i, List<IptvChannel> list) {
        list.getClass();
        return new EarthCamApiResponse(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarthCamApiResponse)) {
            return false;
        }
        EarthCamApiResponse earthCamApiResponse = (EarthCamApiResponse) obj;
        return this.status == earthCamApiResponse.status && kotlin.jvm.internal.l.a(this.data, earthCamApiResponse.data);
    }

    public final List<IptvChannel> getData() {
        return this.data;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.data.hashCode() + (Integer.hashCode(this.status) * 31);
    }

    public String toString() {
        return "EarthCamApiResponse(status=" + this.status + ", data=" + this.data + ")";
    }
}
