package com.app.mlounge.data.remote.debrid;

import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxTorrentInfoResponse {
    public static final int $stable = 8;

    @b("data")
    private final TorBoxTorrentListResponse.TorrentItem data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    public final TorBoxTorrentListResponse.TorrentItem a() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxTorrentInfoResponse)) {
            return false;
        }
        TorBoxTorrentInfoResponse torBoxTorrentInfoResponse = (TorBoxTorrentInfoResponse) obj;
        return this.success == torBoxTorrentInfoResponse.success && l.a(this.detail, torBoxTorrentInfoResponse.detail) && l.a(this.error, torBoxTorrentInfoResponse.error) && l.a(this.data, torBoxTorrentInfoResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TorBoxTorrentListResponse.TorrentItem torrentItem = this.data;
        return iHashCode3 + (torrentItem != null ? torrentItem.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxTorrentInfoResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
