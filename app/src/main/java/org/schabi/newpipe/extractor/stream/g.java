package org.schabi.newpipe.extractor.stream;

import java.util.Collections;
import java.util.List;
import org.jsoup.parser.p0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends org.schabi.newpipe.extractor.c {
    public final int C;
    public String D;
    public String E;
    public long F;
    public long G;
    public String H;
    public boolean I;

    public g(String str, int i, String str2, int i2) {
        super(str, 1, str2, i);
        this.F = -1L;
        this.G = -1L;
        this.H = null;
        List list = Collections.EMPTY_LIST;
        this.I = false;
        this.C = i2;
    }

    @Override // org.schabi.newpipe.extractor.c
    public final String toString() {
        String str;
        String str2 = this.D;
        String str3 = this.E;
        long j = this.F;
        long j2 = this.G;
        String str4 = this.H;
        List list = this.B;
        boolean z = this.I;
        StringBuilder sb = new StringBuilder("StreamInfoItem{streamType=");
        sb.append(p0.g(this.C));
        sb.append(", uploaderName='");
        sb.append(str2);
        sb.append("', textualUploadDate='");
        sb.append(str3);
        sb.append("', viewCount=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append(", uploaderUrl='");
        sb.append(str4);
        sb.append("', infoType=");
        int i = this.e;
        if (i == 1) {
            str = "STREAM";
        } else if (i == 2) {
            str = "PLAYLIST";
        } else if (i != 3) {
            str = i != 4 ? "null" : "COMMENT";
        } else {
            str = "CHANNEL";
        }
        sb.append(str);
        sb.append(", serviceId=");
        sb.append(this.y);
        sb.append(", url='");
        sb.append(this.z);
        sb.append("', name='");
        sb.append(this.A);
        sb.append("', thumbnails='");
        sb.append(list);
        sb.append("', uploaderVerified='");
        sb.append(z);
        sb.append("'}");
        return sb.toString();
    }
}
