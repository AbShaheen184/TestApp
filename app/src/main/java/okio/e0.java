package okio;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends i {
    public final transient byte[][] B;
    public final transient int[] C;

    public e0(byte[][] bArr, int[] iArr) {
        super(i.A.e);
        this.B = bArr;
        this.C = iArr;
    }

    @Override // okio.i
    public final String a() {
        throw null;
    }

    @Override // okio.i
    public final i e(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.C;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new i(bArrDigest);
    }

    @Override // okio.i
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f() == f() && n(0, iVar, f())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.i
    public final int f() {
        return this.C[this.B.length - 1];
    }

    @Override // okio.i
    public final String g() {
        return w().g();
    }

    @Override // okio.i
    public final int h(byte[] bArr, int i) {
        bArr.getClass();
        return w().h(bArr, i);
    }

    @Override // okio.i
    public final int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.B;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.C;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.y = i3;
        return i3;
    }

    @Override // okio.i
    public final byte[] j() {
        return t();
    }

    @Override // okio.i
    public final byte k(int i) {
        byte[][] bArr = this.B;
        int length = bArr.length - 1;
        int[] iArr = this.C;
        b.d(iArr[length], i, 1L);
        int i2 = okio.internal.b.i(this, i);
        return bArr[i2][(i - (i2 == 0 ? 0 : iArr[i2 - 1])) + iArr[bArr.length + i2]];
    }

    @Override // okio.i
    public final int l(byte[] bArr) {
        bArr.getClass();
        return w().l(bArr);
    }

    @Override // okio.i
    public final boolean n(int i, i iVar, int i2) {
        iVar.getClass();
        if (i >= 0 && i <= f() - i2) {
            int i3 = i2 + i;
            int i4 = okio.internal.b.i(this, i);
            int i5 = 0;
            while (i < i3) {
                int[] iArr = this.C;
                int i6 = i4 == 0 ? 0 : iArr[i4 - 1];
                int i7 = iArr[i4] - i6;
                byte[][] bArr = this.B;
                int i8 = iArr[bArr.length + i4];
                int iMin = Math.min(i3, i7 + i6) - i;
                if (iVar.o(i5, bArr[i4], (i - i6) + i8, iMin)) {
                    i5 += iMin;
                    i += iMin;
                    i4++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.i
    public final boolean o(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0 || i > f() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int i5 = okio.internal.b.i(this, i);
        while (i < i4) {
            int[] iArr = this.C;
            int i6 = i5 == 0 ? 0 : iArr[i5 - 1];
            int i7 = iArr[i5] - i6;
            byte[][] bArr2 = this.B;
            int i8 = iArr[bArr2.length + i5];
            int iMin = Math.min(i4, i7 + i6) - i;
            if (!b.a(bArr2[i5], (i - i6) + i8, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            i5++;
        }
        return true;
    }

    @Override // okio.i
    public final String p(Charset charset) {
        charset.getClass();
        return w().p(charset);
    }

    @Override // okio.i
    public final i q(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = f();
        }
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("beginIndex=", i, " < 0"));
            return null;
        }
        if (i2 > f()) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("endIndex=", i2, " > length(");
            sbV.append(f());
            sbV.append(')');
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("endIndex=", i2, " < beginIndex=", i));
            return null;
        }
        if (i == 0 && i2 == f()) {
            return this;
        }
        if (i == i2) {
            return i.A;
        }
        int i4 = okio.internal.b.i(this, i);
        int i5 = okio.internal.b.i(this, i2 - 1);
        byte[][] bArr = this.B;
        byte[][] bArr2 = (byte[][]) kotlin.collections.n.J(bArr, i4, i5 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.C;
        if (i4 <= i5) {
            int i6 = i4;
            int i7 = 0;
            while (true) {
                iArr[i7] = Math.min(iArr2[i6] - i, i3);
                int i8 = i7 + 1;
                iArr[i7 + bArr2.length] = iArr2[bArr.length + i6];
                if (i6 == i5) {
                    break;
                }
                i6++;
                i7 = i8;
            }
        }
        int i9 = i4 != 0 ? iArr2[i4 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i9) + iArr[length];
        return new e0(bArr2, iArr);
    }

    @Override // okio.i
    public final i s() {
        return w().s();
    }

    @Override // okio.i
    public final byte[] t() {
        byte[] bArr = new byte[f()];
        byte[][] bArr2 = this.B;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.C;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            kotlin.collections.n.E(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.i
    public final String toString() {
        return w().toString();
    }

    @Override // okio.i
    public final void v(f fVar, int i) {
        int i2 = okio.internal.b.i(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.C;
            int i4 = i2 == 0 ? 0 : iArr[i2 - 1];
            int i5 = iArr[i2] - i4;
            byte[][] bArr = this.B;
            int i6 = iArr[bArr.length + i2];
            int iMin = Math.min(i, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            c0 c0Var = new c0(bArr[i2], i7, i7 + iMin, true, false);
            c0 c0Var2 = fVar.e;
            if (c0Var2 == null) {
                c0Var.g = c0Var;
                c0Var.f = c0Var;
                fVar.e = c0Var;
            } else {
                c0 c0Var3 = c0Var2.g;
                c0Var3.getClass();
                c0Var3.b(c0Var);
            }
            i3 += iMin;
            i2++;
        }
        fVar.y += (long) i;
    }

    public final i w() {
        return new i(t());
    }
}
