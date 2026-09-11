package com.app.mlounge.data.iptv;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class EarthCamSourceResponse {
    private final EarthCamSourceData data;
    private final String status;

    public EarthCamSourceResponse(String str, EarthCamSourceData earthCamSourceData) {
        this.status = str;
        this.data = earthCamSourceData;
    }

    public static /* synthetic */ EarthCamSourceResponse copy$default(EarthCamSourceResponse earthCamSourceResponse, String str, EarthCamSourceData earthCamSourceData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earthCamSourceResponse.status;
        }
        if ((i & 2) != 0) {
            earthCamSourceData = earthCamSourceResponse.data;
        }
        return earthCamSourceResponse.copy(str, earthCamSourceData);
    }

    public final String component1() {
        return this.status;
    }

    public final EarthCamSourceData component2() {
        return this.data;
    }

    public final EarthCamSourceResponse copy(String str, EarthCamSourceData earthCamSourceData) {
        return new EarthCamSourceResponse(str, earthCamSourceData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarthCamSourceResponse)) {
            return false;
        }
        EarthCamSourceResponse earthCamSourceResponse = (EarthCamSourceResponse) obj;
        return kotlin.jvm.internal.l.a(this.status, earthCamSourceResponse.status) && kotlin.jvm.internal.l.a(this.data, earthCamSourceResponse.data);
    }

    public final EarthCamSourceData getData() {
        return this.data;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EarthCamSourceData earthCamSourceData = this.data;
        return iHashCode + (earthCamSourceData != null ? earthCamSourceData.hashCode() : 0);
    }

    public String toString() {
        return "EarthCamSourceResponse(status=" + this.status + ", data=" + this.data + ")";
    }
}
