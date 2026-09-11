package com.app.mlounge.data.remote.debrid;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class TorBoxCreateTorrentResponse {
    public static final int $stable = 0;

    @b("data")
    private final CreateData data;

    @b("detail")
    private final String detail;

    @b("error")
    private final String error;

    @b("success")
    private final boolean success;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class CreateData {
        public static final int $stable = 0;

        @b("hash")
        private final String hash;

        @b("name")
        private final String name;

        @b("torrent_id")
        private final int torrentId;

        public final int a() {
            return this.torrentId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreateData)) {
                return false;
            }
            CreateData createData = (CreateData) obj;
            return this.torrentId == createData.torrentId && l.a(this.name, createData.name) && l.a(this.hash, createData.hash);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.torrentId) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hash;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            int i = this.torrentId;
            String str = this.name;
            String str2 = this.hash;
            StringBuilder sb = new StringBuilder("CreateData(torrentId=");
            sb.append(i);
            sb.append(", name=");
            sb.append(str);
            sb.append(", hash=");
            return a.u(sb, str2, ")");
        }
    }

    public final CreateData a() {
        return this.data;
    }

    public final boolean b() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TorBoxCreateTorrentResponse)) {
            return false;
        }
        TorBoxCreateTorrentResponse torBoxCreateTorrentResponse = (TorBoxCreateTorrentResponse) obj;
        return this.success == torBoxCreateTorrentResponse.success && l.a(this.detail, torBoxCreateTorrentResponse.detail) && l.a(this.error, torBoxCreateTorrentResponse.error) && l.a(this.data, torBoxCreateTorrentResponse.data);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.detail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CreateData createData = this.data;
        return iHashCode3 + (createData != null ? createData.hashCode() : 0);
    }

    public final String toString() {
        return "TorBoxCreateTorrentResponse(success=" + this.success + ", detail=" + this.detail + ", error=" + this.error + ", data=" + this.data + ")";
    }
}
