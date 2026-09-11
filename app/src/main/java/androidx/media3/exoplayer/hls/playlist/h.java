package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import com.google.common.collect.a1;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final h0 l;
    public final h0 m;
    public final a1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public h(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        com.google.android.material.motion.a.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = h0.o(arrayList2);
        this.m = h0.o(arrayList3);
        this.n = h0.w(new androidx.compose.foundation.lazy.layout.a(8), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && this.i == hVar.i && this.j == hVar.j && this.k == hVar.k && this.o == hVar.o && this.r == hVar.r && this.s == hVar.s && Objects.equals(this.a, hVar.a) && Objects.equals(this.b, hVar.b) && Objects.equals(this.c, hVar.c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.l, hVar.l) && Objects.equals(this.m, hVar.m) && Objects.equals(this.n, hVar.n) && Objects.equals(this.p, hVar.p) && Objects.equals(this.q, hVar.q) && Objects.equals(this.t, hVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
