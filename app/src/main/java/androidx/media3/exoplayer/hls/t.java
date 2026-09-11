package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.media3.common.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements g0 {
    public final String a;
    public final String b;
    public final List c;

    public t(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.a, tVar.a) && TextUtils.equals(this.b, tVar.b) && this.c.equals(tVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? androidx.privacysandbox.ads.adservices.java.internal.a.u(androidx.privacysandbox.ads.adservices.java.internal.a.x(" [", str, ", "), this.b, "]") : "");
    }
}
