package androidx.media3.common;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public final g0[] a;
    public final long b;

    public h0(List list) {
        this((g0[]) list.toArray(new g0[0]));
    }

    public final h0 a(g0... g0VarArr) {
        if (g0VarArr.length == 0) {
            return this;
        }
        String str = androidx.media3.common.util.j0.a;
        g0[] g0VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(g0VarArr2, g0VarArr2.length + g0VarArr.length);
        System.arraycopy(g0VarArr, 0, objArrCopyOf, g0VarArr2.length, g0VarArr.length);
        return new h0(this.b, (g0[]) objArrCopyOf);
    }

    public final h0 b(h0 h0Var) {
        return h0Var == null ? this : a(h0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            h0 h0Var = (h0) obj;
            if (Arrays.equals(this.a, h0Var.a) && this.b == h0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.common.base.i.k(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public h0(long j, g0... g0VarArr) {
        this.b = j;
        this.a = g0VarArr;
    }

    public h0(g0... g0VarArr) {
        this(-9223372036854775807L, g0VarArr);
    }
}
