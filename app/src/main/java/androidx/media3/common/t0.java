package androidx.media3.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public c g = c.c;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        a aVarA = this.g.a(i);
        if (aVarA.a != -1) {
            return aVarA.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        a aVarA;
        int i;
        c cVar = this.g;
        long j2 = this.d;
        int i2 = cVar.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                cVar.a(i3).getClass();
                cVar.a(i3).getClass();
                if (0 > j && ((i = (aVarA = cVar.a(i3)).a) == -1 || aVarA.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    cVar.a(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        c cVar = this.g;
        int i = cVar.a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            cVar.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            cVar.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            a aVarA = cVar.a(i2);
            int i3 = aVarA.a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = aVarA.e[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t0.class.equals(obj.getClass())) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Objects.equals(this.a, t0Var.a) && Objects.equals(this.b, t0Var.b) && this.c == t0Var.c && this.d == t0Var.d && this.e == t0Var.e && this.f == t0Var.f && Objects.equals(this.g, t0Var.g);
    }

    public final boolean f(int i) {
        c cVar = this.g;
        int i2 = cVar.a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        cVar.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
