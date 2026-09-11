package com.app.mlounge.data.remote.debrid;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.gson.annotations.b;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class PremiumizeDirectDlResponse {
    public static final int $stable = 8;

    @b("content")
    private final List<PremiumizeContent> content;

    @b("filename")
    private final String filename;

    @b("filesize")
    private final Long filesize;

    @b("status")
    private final String status;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class PremiumizeContent {
        public static final int $stable = 0;

        @b("link")
        private final String link;

        @b("path")
        private final String path;

        @b("size")
        private final Long size;

        @b("stream_link")
        private final String streamLink;

        @b("transcode_status")
        private final String transcodeStatus;

        public final String a() {
            return this.link;
        }

        public final Long b() {
            return this.size;
        }

        public final String c() {
            return this.streamLink;
        }

        public final boolean d() {
            String str = this.path;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (r.H(lowerCase, ".mp4", false) || r.H(lowerCase, ".mkv", false) || r.H(lowerCase, ".avi", false) || r.H(lowerCase, ".mov", false) || r.H(lowerCase, ".wmv", false) || r.H(lowerCase, ".flv", false) || r.H(lowerCase, ".webm", false) || r.H(lowerCase, ".m4v", false) || r.H(lowerCase, ".mpg", false) || r.H(lowerCase, ".mpeg", false) || r.H(lowerCase, ".ts", false) || r.H(lowerCase, ".m2ts", false)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumizeContent)) {
                return false;
            }
            PremiumizeContent premiumizeContent = (PremiumizeContent) obj;
            return l.a(this.path, premiumizeContent.path) && l.a(this.size, premiumizeContent.size) && l.a(this.link, premiumizeContent.link) && l.a(this.streamLink, premiumizeContent.streamLink) && l.a(this.transcodeStatus, premiumizeContent.transcodeStatus);
        }

        public final int hashCode() {
            String str = this.path;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.size;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.link;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.streamLink;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.transcodeStatus;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            String str = this.path;
            Long l = this.size;
            String str2 = this.link;
            String str3 = this.streamLink;
            String str4 = this.transcodeStatus;
            StringBuilder sb = new StringBuilder("PremiumizeContent(path=");
            sb.append(str);
            sb.append(", size=");
            sb.append(l);
            sb.append(", link=");
            c.y(sb, str2, ", streamLink=", str3, ", transcodeStatus=");
            return a.u(sb, str4, ")");
        }
    }

    public final List a() {
        return this.content;
    }

    public final boolean b() {
        return l.a(this.status, "success");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumizeDirectDlResponse)) {
            return false;
        }
        PremiumizeDirectDlResponse premiumizeDirectDlResponse = (PremiumizeDirectDlResponse) obj;
        return l.a(this.status, premiumizeDirectDlResponse.status) && l.a(this.content, premiumizeDirectDlResponse.content) && l.a(this.filename, premiumizeDirectDlResponse.filename) && l.a(this.filesize, premiumizeDirectDlResponse.filesize);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<PremiumizeContent> list = this.content;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.filename;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.filesize;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumizeDirectDlResponse(status=" + this.status + ", content=" + this.content + ", filename=" + this.filename + ", filesize=" + this.filesize + ")";
    }
}
