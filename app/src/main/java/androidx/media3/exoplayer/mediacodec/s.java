package androidx.media3.exoplayer.mediacodec;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final String a;
    public final boolean b;
    public final boolean c;

    public s(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == s.class) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.a, sVar.a) && this.b == sVar.b && this.c == sVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((androidx.privacysandbox.ads.adservices.java.internal.a.e(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
