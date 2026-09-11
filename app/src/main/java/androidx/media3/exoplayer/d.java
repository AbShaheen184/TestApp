package androidx.media3.exoplayer;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;
    public final androidx.media3.common.r b;
    public final androidx.media3.common.r c;
    public final int d;
    public final int e;

    public d(String str, androidx.media3.common.r rVar, androidx.media3.common.r rVar2, int i, int i2) {
        com.google.android.material.motion.a.f(i == 0 || i2 == 0);
        com.google.android.material.motion.a.f(true ^ TextUtils.isEmpty(str));
        this.a = str;
        rVar.getClass();
        this.b = rVar;
        rVar2.getClass();
        this.c = rVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.d == dVar.d && this.e == dVar.e && this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
