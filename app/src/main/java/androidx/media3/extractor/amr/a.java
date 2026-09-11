package androidx.media3.extractor.amr;

import androidx.compose.ui.input.pointer.util.c;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.m;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.x;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final m b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public p j;
    public h0 k;
    public h0 l;
    public a0 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = j0.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        m mVar = new m();
        this.b = mVar;
        this.l = mVar;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return g(oVar);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        a0 a0Var = this.m;
        if (!(a0Var instanceof x)) {
            if (j == 0 || !(a0Var instanceof androidx.media3.extractor.mp3.a)) {
                this.i = 0L;
                return;
            } else {
                androidx.media3.extractor.mp3.a aVar = (androidx.media3.extractor.mp3.a) a0Var;
                this.i = (Math.max(0L, j - aVar.b) * 8000000) / ((long) aVar.e);
                return;
            }
        }
        x xVar = (x) a0Var;
        c cVar = xVar.b;
        long jD = cVar.b == 0 ? -9223372036854775807L : cVar.d(j0.c(xVar.a, j));
        this.i = jD;
        if (Math.abs(this.o - jD) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f0 A[PHI: r4
  0x00f0: PHI (r4v1 androidx.media3.extractor.o) = (r4v0 androidx.media3.extractor.o), (r4v6 androidx.media3.extractor.o) binds: [B:53:0x00ee, B:56:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws androidx.media3.common.j0 {
        o oVar2;
        int iA;
        int i;
        this.k.getClass();
        String str = j0.a;
        if (oVar.getPosition() == 0 && !g(oVar)) {
            throw androidx.media3.common.j0.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            h0 h0Var = this.k;
            q qVar = new q();
            qVar.m = i0.p(str2);
            qVar.n = i0.p(str3);
            qVar.o = i3;
            qVar.F = 1;
            qVar.G = i2;
            h0Var.e(new androidx.media3.common.r(qVar));
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iF = f(oVar);
                this.e = iF;
                this.f = iF;
                if (this.g == -1) {
                    oVar.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                a0 a0Var = this.m;
                if (a0Var instanceof x) {
                    x xVar = (x) a0Var;
                    long j = this.i + this.d + 20000;
                    long position = oVar.getPosition() + ((long) this.e);
                    c cVar = xVar.b;
                    int i5 = cVar.b;
                    if (i5 == 0 || j - cVar.d(i5 - 1) >= 100000) {
                        c cVar2 = xVar.a;
                        c cVar3 = xVar.b;
                        if (cVar3.b == 0 && j > 0) {
                            cVar2.a(0L);
                            cVar3.a(0L);
                        }
                        cVar2.a(position);
                        cVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                oVar2 = oVar;
                iA = this.l.a(oVar2, this.f, true);
                if (iA == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iA;
                    this.f = i;
                    if (i <= 0) {
                        this.l.g(this.d + this.i, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
                oVar2 = oVar;
            }
        } else {
            oVar2 = oVar;
            iA = this.l.a(oVar2, this.f, true);
            if (iA == -1) {
                i4 = -1;
            } else {
                i = this.f - iA;
                this.f = i;
                if (i <= 0) {
                    this.l.g(this.d + this.i, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        oVar2.getLength();
        if (this.m == null) {
            s sVar = new s(-9223372036854775807L);
            this.m = sVar;
            this.j.g(sVar);
        }
        if (i4 == -1) {
            a0 a0Var2 = this.m;
            if (a0Var2 instanceof x) {
                long j2 = this.i + this.d;
                ((x) a0Var2).c = j2;
                this.j.g(a0Var2);
                this.k.d(j2);
            }
        }
        return i4;
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.j = pVar;
        h0 h0VarU = pVar.u(0, 1);
        this.k = h0VarU;
        this.l = h0VarU;
        pVar.o();
    }

    public final int f(o oVar) throws androidx.media3.common.j0 {
        boolean z;
        oVar.n();
        byte[] bArr = this.a;
        oVar.x(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw androidx.media3.common.j0.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw androidx.media3.common.j0.a(null, sb.toString());
    }

    public final boolean g(o oVar) {
        oVar.n();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        oVar.x(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            oVar.r(bArr.length);
            return true;
        }
        oVar.n();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        oVar.x(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        oVar.r(bArr3.length);
        return true;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
