package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final Object q = new Object();
    public static final c0 r;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public x j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public c0 c = r;

    static {
        d1 d1Var = new d1();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        List list = Collections.EMPTY_LIST;
        w wVar = new w();
        z zVar = z.a;
        Uri uri = Uri.EMPTY;
        r = new c0("androidx.media3.common.Timeline", new v(d1Var), uri != null ? new y(uri, null, a1Var) : null, new x(wVar), f0.B, zVar);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(1, 2, 3, 4, 5);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(6, 7, 8, 9, 10);
        androidx.media3.common.util.j0.K(11);
        androidx.media3.common.util.j0.K(12);
        androidx.media3.common.util.j0.K(13);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(c0 c0Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, x xVar, long j4, long j5, int i, long j6) {
        this.a = q;
        this.c = c0Var != null ? c0Var : r;
        if (c0Var != null) {
            y yVar = c0Var.b;
        }
        this.b = null;
        this.d = obj;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = z2;
        this.j = xVar;
        this.l = j4;
        this.m = j5;
        this.n = 0;
        this.o = i;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !u0.class.equals(obj.getClass())) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Objects.equals(this.a, u0Var.a) && Objects.equals(this.c, u0Var.c) && Objects.equals(this.d, u0Var.d) && Objects.equals(this.j, u0Var.j) && this.e == u0Var.e && this.f == u0Var.f && this.g == u0Var.g && this.h == u0Var.h && this.i == u0Var.i && this.k == u0Var.k && this.l == u0Var.l && this.m == u0Var.m && this.n == u0Var.n && this.o == u0Var.o && this.p == u0Var.p;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        x xVar = this.j;
        int iHashCode3 = (iHashCode2 + (xVar != null ? xVar.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
