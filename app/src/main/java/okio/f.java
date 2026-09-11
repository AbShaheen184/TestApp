package okio;

import com.app.mlounge.emulator.LibretroCore;
import com.google.android.gms.internal.measurement.hb;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {
    public c0 e;
    public long y;

    @Override // okio.h
    public final boolean A(long j, i iVar) {
        iVar.getClass();
        return b0(iVar.f(), j, iVar);
    }

    @Override // okio.h
    public final String B(Charset charset) {
        charset.getClass();
        return h0(this.y, charset);
    }

    @Override // okio.f0
    public final void E(f fVar, long j) {
        c0 c0VarB;
        fVar.getClass();
        if (fVar == this) {
            net.luminis.tls.engine.impl.c.o("source == this");
            return;
        }
        b.d(fVar.y, 0L, j);
        while (j > 0) {
            c0 c0Var = fVar.e;
            c0Var.getClass();
            int i = c0Var.c;
            c0 c0Var2 = fVar.e;
            c0Var2.getClass();
            long j2 = i - c0Var2.b;
            int i2 = 0;
            if (j < j2) {
                c0 c0Var3 = this.e;
                c0 c0Var4 = c0Var3 != null ? c0Var3.g : null;
                if (c0Var4 != null && c0Var4.e) {
                    if ((((long) c0Var4.c) + j) - ((long) (c0Var4.d ? 0 : c0Var4.b)) <= 8192) {
                        c0 c0Var5 = fVar.e;
                        c0Var5.getClass();
                        c0Var5.d(c0Var4, (int) j);
                        fVar.y -= j;
                        this.y += j;
                        return;
                    }
                }
                c0 c0Var6 = fVar.e;
                c0Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > c0Var6.c - c0Var6.b) {
                    net.luminis.tls.engine.impl.c.o("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    c0VarB = c0Var6.c();
                } else {
                    c0VarB = d0.b();
                    byte[] bArr = c0Var6.a;
                    byte[] bArr2 = c0VarB.a;
                    int i4 = c0Var6.b;
                    kotlin.collections.n.E(bArr, 0, bArr2, i4, i4 + i3);
                }
                c0VarB.c = c0VarB.b + i3;
                c0Var6.b += i3;
                c0 c0Var7 = c0Var6.g;
                c0Var7.getClass();
                c0Var7.b(c0VarB);
                fVar.e = c0VarB;
            }
            c0 c0Var8 = fVar.e;
            c0Var8.getClass();
            long j3 = c0Var8.c - c0Var8.b;
            fVar.e = c0Var8.a();
            c0 c0Var9 = this.e;
            if (c0Var9 == null) {
                this.e = c0Var8;
                c0Var8.g = c0Var8;
                c0Var8.f = c0Var8;
            } else {
                c0 c0Var10 = c0Var9.g;
                c0Var10.getClass();
                c0Var10.b(c0Var8);
                c0 c0Var11 = c0Var8.g;
                if (c0Var11 == c0Var8) {
                    net.luminis.tls.engine.impl.c.r("cannot compact");
                    return;
                }
                c0Var11.getClass();
                if (c0Var11.e) {
                    int i5 = c0Var8.c - c0Var8.b;
                    c0 c0Var12 = c0Var8.g;
                    c0Var12.getClass();
                    int i6 = 8192 - c0Var12.c;
                    c0 c0Var13 = c0Var8.g;
                    c0Var13.getClass();
                    if (!c0Var13.d) {
                        c0 c0Var14 = c0Var8.g;
                        c0Var14.getClass();
                        i2 = c0Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        c0 c0Var15 = c0Var8.g;
                        c0Var15.getClass();
                        c0Var8.d(c0Var15, i5);
                        c0Var8.a();
                        d0.a(c0Var8);
                    }
                }
            }
            fVar.y -= j3;
            this.y += j3;
            j -= j3;
        }
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g J(i iVar) {
        m0(iVar);
        return this;
    }

    @Override // okio.h0
    public final long K(f fVar, long j) {
        fVar.getClass();
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.y;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fVar.E(this, j);
        return j;
    }

    public final void L(f fVar, long j, long j2) {
        fVar.getClass();
        long j3 = j;
        b.d(this.y, j3, j2);
        if (j2 == 0) {
            return;
        }
        fVar.y += j2;
        c0 c0Var = this.e;
        while (true) {
            c0Var.getClass();
            long j4 = c0Var.c - c0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            c0Var = c0Var.f;
        }
        c0 c0Var2 = c0Var;
        long j5 = j2;
        while (j5 > 0) {
            c0Var2.getClass();
            c0 c0VarC = c0Var2.c();
            int i = c0VarC.b + ((int) j3);
            c0VarC.b = i;
            c0VarC.c = Math.min(i + ((int) j5), c0VarC.c);
            c0 c0Var3 = fVar.e;
            if (c0Var3 == null) {
                c0VarC.g = c0VarC;
                c0VarC.f = c0VarC;
                fVar.e = c0VarC;
            } else {
                c0 c0Var4 = c0Var3.g;
                c0Var4.getClass();
                c0Var4.b(c0VarC);
            }
            j5 -= (long) (c0VarC.c - c0VarC.b);
            c0Var2 = c0Var2.f;
            j3 = 0;
        }
    }

    @Override // okio.h
    public final long O(g gVar) {
        long j = this.y;
        if (j > 0) {
            gVar.E(this, j);
        }
        return j;
    }

    @Override // okio.h
    public final void R(long j) throws EOFException {
        if (this.y < j) {
            throw new EOFException();
        }
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g S(long j) {
        p0(j);
        return this;
    }

    @Override // okio.h
    public final InputStream V() {
        return new hb(this, 2);
    }

    @Override // okio.h
    public final int W(v vVar) throws EOFException {
        vVar.getClass();
        int iD = okio.internal.a.d(this, vVar, false);
        if (iD == -1) {
            return -1;
        }
        skip(vVar.e[iD].f());
        return iD;
    }

    public final boolean X() {
        return this.y == 0;
    }

    public final byte Y(long j) {
        b.d(this.y, j, 1L);
        c0 c0Var = this.e;
        c0Var.getClass();
        long j2 = this.y;
        if (j2 - j < j) {
            while (j2 > j) {
                c0Var = c0Var.g;
                c0Var.getClass();
                j2 -= (long) (c0Var.c - c0Var.b);
            }
            return c0Var.a[(int) ((((long) c0Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c0Var.c;
            int i2 = c0Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return c0Var.a[(int) ((((long) i2) + j) - j3)];
            }
            c0Var = c0Var.f;
            c0Var.getClass();
            j3 = j4;
        }
    }

    public final long Z(byte b, long j, long j2) {
        c0 c0Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.y + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.y;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c0Var = this.e) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c0Var = c0Var.g;
                c0Var.getClass();
                j4 -= (long) (c0Var.c - c0Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = c0Var.a;
                int iMin = (int) Math.min(c0Var.c, (((long) c0Var.b) + j2) - j4);
                for (int i = (int) ((((long) c0Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - c0Var.b)) + j4;
                    }
                }
                j4 += (long) (c0Var.c - c0Var.b);
                c0Var = c0Var.f;
                c0Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (c0Var.c - c0Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            c0Var = c0Var.f;
            c0Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = c0Var.a;
            int iMin2 = (int) Math.min(c0Var.c, (((long) c0Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) c0Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - c0Var.b)) + j3;
                }
            }
            j3 += (long) (c0Var.c - c0Var.b);
            c0Var = c0Var.f;
            c0Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final void a() throws EOFException {
        skip(this.y);
    }

    public final long a0(i iVar) {
        int i;
        int i2;
        iVar.getClass();
        c0 c0Var = this.e;
        if (c0Var == null) {
            return -1L;
        }
        long j = this.y;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                c0Var = c0Var.g;
                c0Var.getClass();
                j -= (long) (c0Var.c - c0Var.b);
            }
            if (iVar.f() == 2) {
                byte bK = iVar.k(0);
                byte bK2 = iVar.k(1);
                while (j < this.y) {
                    byte[] bArr = c0Var.a;
                    i = (int) ((((long) c0Var.b) + j2) - j);
                    int i3 = c0Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (c0Var.c - c0Var.b)) + j;
                            c0Var = c0Var.f;
                            c0Var.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bK || b == bK2) {
                                i2 = c0Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrJ = iVar.j();
            while (j < this.y) {
                byte[] bArr2 = c0Var.a;
                i = (int) ((((long) c0Var.b) + j2) - j);
                int i4 = c0Var.c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrJ.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrJ[i5]) {
                                i2 = c0Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (c0Var.c - c0Var.b)) + j;
                        c0Var = c0Var.f;
                        c0Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (c0Var.c - c0Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            c0Var = c0Var.f;
            c0Var.getClass();
            j = j3;
        }
        if (iVar.f() == 2) {
            byte bK3 = iVar.k(0);
            byte bK4 = iVar.k(1);
            while (j < this.y) {
                byte[] bArr3 = c0Var.a;
                i = (int) ((((long) c0Var.b) + j2) - j);
                int i6 = c0Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (c0Var.c - c0Var.b)) + j;
                        c0Var = c0Var.f;
                        c0Var.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bK3 || b3 == bK4) {
                            i2 = c0Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrJ2 = iVar.j();
        while (j < this.y) {
            byte[] bArr4 = c0Var.a;
            i = (int) ((((long) c0Var.b) + j2) - j);
            int i7 = c0Var.c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrJ2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrJ2[i8]) {
                            i2 = c0Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (c0Var.c - c0Var.b)) + j;
                    c0Var = c0Var.f;
                    c0Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    public final boolean b0(int i, long j, i iVar) {
        iVar.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.y && i <= iVar.f()) {
            return i == 0 || okio.internal.a.a(this, iVar, j, j + 1, i) != -1;
        }
        return false;
    }

    public final e c0(e eVar) {
        eVar.getClass();
        byte[] bArr = okio.internal.a.a;
        if (eVar == b.a) {
            eVar = new e();
        }
        if (eVar.e != null) {
            net.luminis.tls.engine.impl.c.r("already attached to a buffer");
            return null;
        }
        eVar.e = this;
        eVar.y = true;
        return eVar;
    }

    public final byte[] d0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount: ", j));
            return null;
        }
        if (this.y < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.h0
    public final j0 e() {
        return j0.d;
    }

    public final long e0() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.y == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            c0 c0Var = this.e;
            c0Var.getClass();
            byte[] bArr = c0Var.a;
            int i2 = c0Var.b;
            int i3 = c0Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.e = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.b = i2;
            }
            if (z2 || this.e == null) {
                long j5 = this.y - ((long) i);
                this.y = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                StringBuilder sbD = androidx.constraintlayout.core.g.d(z ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbD.append(b.f(Y(j)));
                throw new NumberFormatException(sbD.toString());
            }
            j2 = j;
        }
        f fVar = new f();
        fVar.p0(j3);
        fVar.o0(b);
        if (!z) {
            fVar.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(fVar.i0()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j = this.y;
        f fVar = (f) obj;
        if (j != fVar.y) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        c0 c0Var2 = fVar.e;
        c0Var2.getClass();
        int i = c0Var.b;
        int i2 = c0Var2.b;
        long j2 = 0;
        while (j2 < this.y) {
            long jMin = Math.min(c0Var.c - i, c0Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c0Var.a[i] != c0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c0Var.c) {
                c0Var = c0Var.f;
                c0Var.getClass();
                i = c0Var.b;
            }
            if (i2 == c0Var2.c) {
                c0Var2 = c0Var2.f;
                c0Var2.getClass();
                i2 = c0Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    public final long f0() throws EOFException {
        int i;
        if (this.y == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            c0 c0Var = this.e;
            c0Var.getClass();
            byte[] bArr = c0Var.a;
            int i3 = c0Var.b;
            int i4 = c0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(b.f(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    f fVar = new f();
                    fVar.q0(j);
                    fVar.o0(b);
                    throw new NumberFormatException("Number too large: ".concat(fVar.i0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.e = c0Var.a();
                d0.a(c0Var);
            } else {
                c0Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.e != null);
        this.y -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        if (this.y == 0) {
            return fVar;
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        c0 c0VarC = c0Var.c();
        fVar.e = c0VarC;
        c0VarC.g = c0VarC;
        c0VarC.f = c0VarC;
        for (c0 c0Var2 = c0Var.f; c0Var2 != c0Var; c0Var2 = c0Var2.f) {
            c0 c0Var3 = c0VarC.g;
            c0Var3.getClass();
            c0Var2.getClass();
            c0Var3.b(c0Var2.c());
        }
        fVar.y = this.y;
        return fVar;
    }

    public final short g0() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public final String h0(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount: ", j));
            return null;
        }
        if (this.y < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        int i = c0Var.b;
        if (((long) i) + j > c0Var.c) {
            return new String(d0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c0Var.a, i, i2, charset);
        int i3 = c0Var.b + i2;
        c0Var.b = i3;
        this.y -= j;
        if (i3 == c0Var.c) {
            this.e = c0Var.a();
            d0.a(c0Var);
        }
        return str;
    }

    public final int hashCode() {
        c0 c0Var = this.e;
        if (c0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c0Var.c;
            for (int i3 = c0Var.b; i3 < i2; i3++) {
                i = (i * 31) + c0Var.a[i3];
            }
            c0Var = c0Var.f;
            c0Var.getClass();
        } while (c0Var != this.e);
        return i;
    }

    public final String i0() {
        return h0(this.y, kotlin.text.a.a);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int j0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.y == 0) {
            throw new EOFException();
        }
        byte bY = Y(0L);
        if ((bY & 128) == 0) {
            i = bY & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bY & 224) == 192) {
            i = bY & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bY & 240) == 224) {
            i = bY & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bY & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bY & 7;
            i2 = 4;
            i3 = Parser.ARGC_LIMIT;
        }
        long j = i2;
        if (this.y < j) {
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("size < ", i2, ": ");
            sbV.append(this.y);
            sbV.append(" (to read code point prefixed 0x");
            sbV.append(b.f(bY));
            sbV.append(')');
            throw new EOFException(sbV.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bY2 = Y(j2);
            if ((bY2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bY2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    @Override // okio.h
    public final i k(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("byteCount: ", j));
            return null;
        }
        if (this.y < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new i(d0(j));
        }
        i iVarK0 = k0((int) j);
        skip(j);
        return iVarK0;
    }

    public final i k0(int i) {
        if (i == 0) {
            return i.A;
        }
        b.d(this.y, 0L, i);
        c0 c0Var = this.e;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            c0Var.getClass();
            int i5 = c0Var.c;
            int i6 = c0Var.b;
            if (i5 == i6) {
                net.luminis.tls.engine.impl.c.m("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            c0Var = c0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        c0 c0Var2 = this.e;
        int i7 = 0;
        while (i2 < i) {
            c0Var2.getClass();
            bArr[i7] = c0Var2.a;
            i2 += c0Var2.c - c0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c0Var2.b;
            c0Var2.d = true;
            i7++;
            c0Var2 = c0Var2.f;
        }
        return new e0(bArr, iArr);
    }

    public final c0 l0(int i) {
        if (i < 1 || i > 8192) {
            net.luminis.tls.engine.impl.c.o("unexpected capacity");
            return null;
        }
        c0 c0Var = this.e;
        if (c0Var == null) {
            c0 c0VarB = d0.b();
            this.e = c0VarB;
            c0VarB.g = c0VarB;
            c0VarB.f = c0VarB;
            return c0VarB;
        }
        c0 c0Var2 = c0Var.g;
        c0Var2.getClass();
        if (c0Var2.c + i <= 8192 && c0Var2.e) {
            return c0Var2;
        }
        c0 c0VarB2 = d0.b();
        c0Var2.b(c0VarB2);
        return c0VarB2;
    }

    public final long m() {
        long j = this.y;
        if (j == 0) {
            return 0L;
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        c0 c0Var2 = c0Var.g;
        c0Var2.getClass();
        int i = c0Var2.c;
        return (i >= 8192 || !c0Var2.e) ? j : j - ((long) (i - c0Var2.b));
    }

    public final void m0(i iVar) {
        iVar.getClass();
        iVar.v(this, iVar.f());
    }

    @Override // okio.h
    public final byte[] n() {
        return d0(this.y);
    }

    public final void n0(h0 h0Var) {
        h0Var.getClass();
        while (h0Var.K(this, 8192L) != -1) {
        }
    }

    @Override // okio.h
    public final long o(i iVar) {
        iVar.getClass();
        byte[] bArr = okio.internal.a.a;
        return okio.internal.a.a(this, iVar, 0L, 1024L, iVar.f());
    }

    public final void o0(int i) {
        c0 c0VarL0 = l0(1);
        byte[] bArr = c0VarL0.a;
        int i2 = c0VarL0.c;
        c0VarL0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.y++;
    }

    @Override // okio.h
    public final void p(f fVar, long j) throws EOFException {
        long j2 = this.y;
        if (j2 >= j) {
            fVar.E(this, j);
        } else {
            fVar.E(this, j2);
            throw new EOFException();
        }
    }

    public final void p0(long j) {
        boolean z;
        if (j == 0) {
            o0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                u0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = okio.internal.a.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > okio.internal.a.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        c0 c0VarL0 = l0(i);
        byte[] bArr2 = c0VarL0.a;
        int i2 = c0VarL0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr2[i2] = okio.internal.a.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        c0VarL0.c += i;
        this.y += (long) i;
    }

    public final void q0(long j) {
        if (j == 0) {
            o0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        c0 c0VarL0 = l0(i);
        byte[] bArr = c0VarL0.a;
        int i2 = c0VarL0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = okio.internal.a.a[(int) (15 & j)];
            j >>>= 4;
        }
        c0VarL0.c += i;
        this.y += (long) i;
    }

    public final void r0(int i) {
        c0 c0VarL0 = l0(4);
        byte[] bArr = c0VarL0.a;
        int i2 = c0VarL0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c0VarL0.c = i2 + 4;
        this.y += 4;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        b.d(bArr.length, i, i2);
        c0 c0Var = this.e;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, c0Var.c - c0Var.b);
        byte[] bArr2 = c0Var.a;
        int i3 = c0Var.b;
        kotlin.collections.n.E(bArr2, i, bArr, i3, i3 + iMin);
        int i4 = c0Var.b + iMin;
        c0Var.b = i4;
        this.y -= (long) iMin;
        if (i4 == c0Var.c) {
            this.e = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }

    @Override // okio.h
    public final byte readByte() throws EOFException {
        if (this.y == 0) {
            throw new EOFException();
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        int i = c0Var.b;
        int i2 = c0Var.c;
        int i3 = i + 1;
        byte b = c0Var.a[i];
        this.y--;
        if (i3 != i2) {
            c0Var.b = i3;
            return b;
        }
        this.e = c0Var.a();
        d0.a(c0Var);
        return b;
    }

    @Override // okio.h
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // okio.h
    public final int readInt() throws EOFException {
        if (this.y < 4) {
            throw new EOFException();
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        int i = c0Var.b;
        int i2 = c0Var.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.y -= 4;
        if (i5 != i2) {
            c0Var.b = i5;
            return i6;
        }
        this.e = c0Var.a();
        d0.a(c0Var);
        return i6;
    }

    @Override // okio.h
    public final long readLong() throws EOFException {
        if (this.y < 8) {
            throw new EOFException();
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        int i = c0Var.b;
        int i2 = c0Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c0Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.y -= 8;
        if (i4 != i2) {
            c0Var.b = i4;
            return j2;
        }
        this.e = c0Var.a();
        d0.a(c0Var);
        return j2;
    }

    @Override // okio.h
    public final short readShort() throws EOFException {
        if (this.y < 2) {
            throw new EOFException();
        }
        c0 c0Var = this.e;
        c0Var.getClass();
        int i = c0Var.b;
        int i2 = c0Var.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.y -= 2;
        if (i5 == i2) {
            this.e = c0Var.a();
            d0.a(c0Var);
        } else {
            c0Var.b = i5;
        }
        return (short) i6;
    }

    @Override // okio.h
    public final boolean request(long j) {
        return this.y >= j;
    }

    @Override // okio.h
    public final String s(long j) throws EOFException {
        if (j < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jZ = Z((byte) 10, 0L, j2);
        if (jZ != -1) {
            return okio.internal.a.c(this, jZ);
        }
        if (j2 < this.y && Y(j2 - 1) == 13 && Y(j2) == 10) {
            return okio.internal.a.c(this, j2);
        }
        f fVar = new f();
        L(fVar, 0L, Math.min(32, this.y));
        throw new EOFException("\\n not found: limit=" + Math.min(this.y, j) + " content=" + fVar.k(fVar.y).g() + (char) 8230);
    }

    public final void s0(int i) {
        c0 c0VarL0 = l0(2);
        byte[] bArr = c0VarL0.a;
        int i2 = c0VarL0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c0VarL0.c = i2 + 2;
        this.y += 2;
    }

    @Override // okio.h
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            c0 c0Var = this.e;
            if (c0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c0Var.c - c0Var.b);
            long j2 = iMin;
            this.y -= j2;
            j -= j2;
            int i = c0Var.b + iMin;
            c0Var.b = i;
            if (i == c0Var.c) {
                this.e = c0Var.a();
                d0.a(c0Var);
            }
        }
    }

    public final void t0(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        if (i2 > str.length()) {
            net.luminis.tls.engine.impl.c.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("endIndex > string.length: ", i2, " > "), str.length());
            return;
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                c0 c0VarL0 = l0(1);
                byte[] bArr = c0VarL0.a;
                int i3 = c0VarL0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c0VarL0.c;
                int i6 = (i3 + i) - i5;
                c0VarL0.c = i5 + i6;
                this.y += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    c0 c0VarL1 = l0(2);
                    byte[] bArr2 = c0VarL1.a;
                    int i7 = c0VarL1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarL1.c = i7 + 2;
                    this.y += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    c0 c0VarL2 = l0(3);
                    byte[] bArr3 = c0VarL2.a;
                    int i8 = c0VarL2.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | LibretroCore.SCREEN_HEIGHT);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0VarL2.c = i8 + 3;
                    this.y += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        o0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + Parser.ARGC_LIMIT;
                        c0 c0VarL3 = l0(4);
                        byte[] bArr4 = c0VarL3.a;
                        int i11 = c0VarL3.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c0VarL3.c = i11 + 4;
                        this.y += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final String toString() {
        long j = this.y;
        if (j <= 2147483647L) {
            return k0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.y).toString());
    }

    public final void u0(String str) {
        str.getClass();
        t0(0, str.length(), str);
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g v(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    public final void v0(int i) {
        if (i < 128) {
            o0(i);
            return;
        }
        if (i < 2048) {
            c0 c0VarL0 = l0(2);
            byte[] bArr = c0VarL0.a;
            int i2 = c0VarL0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c0VarL0.c = i2 + 2;
            this.y += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            o0(63);
            return;
        }
        if (i < 65536) {
            c0 c0VarL1 = l0(3);
            byte[] bArr2 = c0VarL1.a;
            int i3 = c0VarL1.c;
            bArr2[i3] = (byte) ((i >> 12) | LibretroCore.SCREEN_HEIGHT);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            c0VarL1.c = i3 + 3;
            this.y += 3;
            return;
        }
        if (i > 1114111) {
            net.luminis.tls.engine.impl.c.o("Unexpected code point: 0x".concat(b.g(i)));
            return;
        }
        c0 c0VarL2 = l0(4);
        byte[] bArr3 = c0VarL2.a;
        int i4 = c0VarL2.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        c0VarL2.c = i4 + 4;
        this.y += 4;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        b.d(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            c0 c0VarL0 = l0(1);
            int iMin = Math.min(i3 - i, 8192 - c0VarL0.c);
            int i4 = i + iMin;
            kotlin.collections.n.E(bArr, c0VarL0.c, c0VarL0.a, i, i4);
            c0VarL0.c += iMin;
            i = i4;
        }
        this.y += j;
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g writeByte(int i) {
        o0(i);
        return this;
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g writeInt(int i) {
        r0(i);
        return this;
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g writeShort(int i) {
        s0(i);
        return this;
    }

    @Override // okio.g
    public final /* bridge */ /* synthetic */ g x(String str) {
        u0(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.f0
    public final void close() {
    }

    @Override // okio.h
    public final f d() {
        return this;
    }

    @Override // okio.g, okio.f0, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            c0 c0VarL0 = l0(1);
            int iMin = Math.min(i, 8192 - c0VarL0.c);
            byteBuffer.get(c0VarL0.a, c0VarL0.c, iMin);
            i -= iMin;
            c0VarL0.c += iMin;
        }
        this.y += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.g
    public final g write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        c0 c0Var = this.e;
        if (c0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c0Var.c - c0Var.b);
        byteBuffer.put(c0Var.a, c0Var.b, iMin);
        int i = c0Var.b + iMin;
        c0Var.b = i;
        this.y -= (long) iMin;
        if (i == c0Var.c) {
            this.e = c0Var.a();
            d0.a(c0Var);
        }
        return iMin;
    }
}
