package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.j;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final androidx.compose.foundation.lazy.layout.e g;

    public c(long j, long j2, long j3, long j4, long j5, float[] fArr, androidx.compose.foundation.lazy.layout.e eVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.a == cVar.a && this.b == cVar.b && this.e == cVar.e && j.a(this.c, cVar.c) && j.a(this.d, cVar.d)) {
                    float[] fArr = cVar.f;
                    float[] fArr2 = this.f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.g.equals(cVar.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iC + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
