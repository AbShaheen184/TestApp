package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        d0.a("media3.datasource");
    }

    public l(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        com.google.android.material.motion.a.f(j + j2 >= 0);
        com.google.android.material.motion.a.f(j2 >= 0);
        com.google.android.material.motion.a.f(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        org.mozilla.javascript.c.a();
        return null;
    }

    public final k a() {
        k kVar = new k();
        kVar.a = this.a;
        kVar.b = this.b;
        kVar.c = this.c;
        kVar.d = this.d;
        kVar.e = this.e;
        kVar.f = this.f;
        kVar.g = this.g;
        kVar.h = this.h;
        kVar.i = this.i;
        return kVar;
    }

    public final l c(long j) {
        long j2 = this.g;
        return d(j, j2 != -1 ? j2 - j : -1L);
    }

    public final l d(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new l(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.i, "]", sb);
    }
}
