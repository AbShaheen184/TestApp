package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.google.gson.annotations.b;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeTransferList {
    public static final int $stable = 8;

    @b("status")
    private final String status;

    @b("transfers")
    private final List<PremiumizeTransfer> transfers;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class PremiumizeTransfer {
        public static final int $stable = 0;

        @b("file_id")
        private final String fileId;

        @b("folder_id")
        private final String folderId;

        @b("id")
        private final String id;

        @b("message")
        private final String message;

        @b("name")
        private final String name;

        @b("progress")
        private final Double progress;

        @b("src")
        private final String src;

        @b("status")
        private final String status;

        public final String a() {
            return this.fileId;
        }

        public final String b() {
            return this.folderId;
        }

        public final String c() {
            return this.id;
        }

        public final String d() {
            return this.status;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumizeTransfer)) {
                return false;
            }
            PremiumizeTransfer premiumizeTransfer = (PremiumizeTransfer) obj;
            return l.a(this.id, premiumizeTransfer.id) && l.a(this.name, premiumizeTransfer.name) && l.a(this.status, premiumizeTransfer.status) && l.a(this.progress, premiumizeTransfer.progress) && l.a(this.folderId, premiumizeTransfer.folderId) && l.a(this.fileId, premiumizeTransfer.fileId) && l.a(this.src, premiumizeTransfer.src) && l.a(this.message, premiumizeTransfer.message);
        }

        public final int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.status;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d = this.progress;
            int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
            String str4 = this.folderId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fileId;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.src;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.message;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.name;
            String str3 = this.status;
            Double d = this.progress;
            String str4 = this.folderId;
            String str5 = this.fileId;
            String str6 = this.src;
            String str7 = this.message;
            StringBuilder sbO = c.o("PremiumizeTransfer(id=", str, ", name=", str2, ", status=");
            sbO.append(str3);
            sbO.append(", progress=");
            sbO.append(d);
            sbO.append(", folderId=");
            c.y(sbO, str4, ", fileId=", str5, ", src=");
            return c.l(sbO, str6, ", message=", str7, ")");
        }
    }

    public final List a() {
        return this.transfers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumizeTransferList)) {
            return false;
        }
        PremiumizeTransferList premiumizeTransferList = (PremiumizeTransferList) obj;
        return l.a(this.status, premiumizeTransferList.status) && l.a(this.transfers, premiumizeTransferList.transfers);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PremiumizeTransfer> list = this.transfers;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeTransferList(status=" + this.status + ", transfers=" + this.transfers + ")";
    }
}
