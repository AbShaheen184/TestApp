package androidx.media3.common;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final f0 B;
    public final com.google.common.collect.h0 A;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    static {
        e0 e0Var = new e0();
        com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
        e0Var.z = com.google.common.collect.a1.B;
        B = new f0(e0Var);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(5, 6, 8, 9, 10);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(11, 12, 13, 14, 15);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(16, 17, 18, 19, 20);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(21, 22, 23, 24, 25);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(26, 27, 28, 29, 30);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(31, 32, 33, 34, 1000);
    }

    public f0(e0 e0Var) {
        Boolean boolValueOf = e0Var.k;
        Integer numValueOf = e0Var.j;
        Integer numValueOf2 = e0Var.y;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case Token.GETPROP /* 33 */:
                        case Token.GETPROPNOWARN /* 34 */:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = e0Var.a;
        this.b = e0Var.b;
        this.c = e0Var.c;
        this.d = e0Var.d;
        this.e = e0Var.e;
        this.f = e0Var.f;
        this.g = e0Var.g;
        this.h = e0Var.h;
        this.i = e0Var.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = e0Var.l;
        this.l = num;
        this.m = num;
        this.n = e0Var.m;
        this.o = e0Var.n;
        this.p = e0Var.o;
        this.q = e0Var.p;
        this.r = e0Var.q;
        this.s = e0Var.r;
        this.t = e0Var.s;
        this.u = e0Var.t;
        this.v = e0Var.u;
        this.w = e0Var.v;
        this.x = e0Var.w;
        this.y = e0Var.x;
        this.z = numValueOf2;
        this.A = e0Var.z;
    }

    public final e0 a() {
        e0 e0Var = new e0();
        e0Var.a = this.a;
        e0Var.b = this.b;
        e0Var.c = this.c;
        e0Var.d = this.d;
        e0Var.e = this.e;
        e0Var.f = this.f;
        e0Var.g = this.g;
        e0Var.h = this.h;
        e0Var.i = this.i;
        e0Var.j = this.j;
        e0Var.k = this.k;
        e0Var.l = this.m;
        e0Var.m = this.n;
        e0Var.n = this.o;
        e0Var.o = this.p;
        e0Var.p = this.q;
        e0Var.q = this.r;
        e0Var.r = this.s;
        e0Var.s = this.t;
        e0Var.t = this.u;
        e0Var.u = this.v;
        e0Var.v = this.w;
        e0Var.w = this.x;
        e0Var.x = this.y;
        e0Var.y = this.z;
        e0Var.z = this.A;
        return e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return TextUtils.equals(this.a, f0Var.a) && TextUtils.equals(this.b, f0Var.b) && TextUtils.equals(this.c, f0Var.c) && TextUtils.equals(this.d, f0Var.d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, f0Var.e) && Arrays.equals(this.f, f0Var.f) && Objects.equals(this.g, f0Var.g) && Objects.equals(this.h, f0Var.h) && Objects.equals(this.i, f0Var.i) && Objects.equals(this.j, f0Var.j) && Objects.equals(this.k, f0Var.k) && Objects.equals(this.m, f0Var.m) && Objects.equals(this.n, f0Var.n) && Objects.equals(this.o, f0Var.o) && Objects.equals(this.p, f0Var.p) && Objects.equals(this.q, f0Var.q) && Objects.equals(this.r, f0Var.r) && TextUtils.equals(this.s, f0Var.s) && TextUtils.equals(this.t, f0Var.t) && TextUtils.equals(this.u, f0Var.u) && Objects.equals(this.v, f0Var.v) && Objects.equals(this.w, f0Var.w) && TextUtils.equals(this.x, f0Var.x) && TextUtils.equals(null, null) && TextUtils.equals(this.y, f0Var.y) && Objects.equals(this.z, f0Var.z) && Objects.equals(this.A, f0Var.A);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}
