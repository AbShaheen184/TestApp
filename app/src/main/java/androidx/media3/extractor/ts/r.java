package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.h0;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements h {
    public final b0 a;
    public String b;
    public h0 c;
    public q d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final androidx.media3.exoplayer.h0 g = new androidx.media3.exoplayer.h0(32);
    public final androidx.media3.exoplayer.h0 h = new androidx.media3.exoplayer.h0(33);
    public final androidx.media3.exoplayer.h0 i = new androidx.media3.exoplayer.h0(34);
    public final androidx.media3.exoplayer.h0 j = new androidx.media3.exoplayer.h0(39);
    public final androidx.media3.exoplayer.h0 k = new androidx.media3.exoplayer.h0(40);
    public long m = -9223372036854775807L;
    public final androidx.media3.common.util.w n = new androidx.media3.common.util.w();

    public r(b0 b0Var) {
        this.a = b0Var;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        androidx.media3.container.r.b(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        this.a.d.c(0);
        q qVar = this.d;
        if (qVar != null) {
            qVar.f = false;
            qVar.g = false;
            qVar.h = false;
            qVar.i = false;
            qVar.j = false;
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        androidx.appcompat.widget.o oVar = this.a.d;
        q qVar = this.d;
        boolean z = this.e;
        if (qVar.j && qVar.g) {
            qVar.m = qVar.c;
            qVar.j = false;
        } else if (qVar.h || qVar.g) {
            if (z && qVar.i) {
                qVar.a(i + ((int) (j - qVar.b)));
            }
            qVar.k = qVar.b;
            qVar.l = qVar.e;
            qVar.m = qVar.c;
            qVar.i = true;
        }
        if (!this.e) {
            androidx.media3.exoplayer.h0 h0Var = this.g;
            h0Var.d(i2);
            androidx.media3.exoplayer.h0 h0Var2 = this.h;
            h0Var2.d(i2);
            androidx.media3.exoplayer.h0 h0Var3 = this.i;
            h0Var3.d(i2);
            if (h0Var.d && h0Var2.d && h0Var3.d) {
                String str = this.b;
                int i3 = h0Var.e;
                byte[] bArr = new byte[h0Var2.e + i3 + h0Var3.e];
                System.arraycopy((byte[]) h0Var.f, 0, bArr, 0, i3);
                System.arraycopy((byte[]) h0Var2.f, 0, bArr, h0Var.e, h0Var2.e);
                System.arraycopy((byte[]) h0Var3.f, 0, bArr, h0Var.e + h0Var2.e, h0Var3.e);
                androidx.media3.container.n nVarK = androidx.media3.container.r.k((byte[]) h0Var2.f, 3, h0Var2.e, null);
                androidx.media3.container.k kVar = nVarK.b;
                String strA = kVar != null ? androidx.media3.common.util.f.a(kVar.a, kVar.b, kVar.c, kVar.d, kVar.e, kVar.f) : null;
                androidx.media3.common.q qVar2 = new androidx.media3.common.q();
                qVar2.a = str;
                qVar2.m = i0.p("video/mp2t");
                qVar2.n = i0.p("video/hevc");
                qVar2.j = strA;
                qVar2.u = nVarK.e;
                qVar2.v = nVarK.f;
                qVar2.w = nVarK.g;
                qVar2.x = nVarK.h;
                qVar2.D = new androidx.media3.common.h(nVarK.k, nVarK.l, nVarK.m, null, nVarK.c + 8, nVarK.d + 8);
                qVar2.A = nVarK.i;
                qVar2.p = nVarK.j;
                qVar2.E = nVarK.a + 1;
                qVar2.q = Collections.singletonList(bArr);
                androidx.media3.common.r rVar = new androidx.media3.common.r(qVar2);
                this.c.e(rVar);
                int i4 = rVar.q;
                com.google.android.material.motion.a.q(i4 != -1);
                oVar.l(i4);
                this.e = true;
            }
        }
        androidx.media3.exoplayer.h0 h0Var4 = this.j;
        boolean zD = h0Var4.d(i2);
        androidx.media3.common.util.w wVar = this.n;
        if (zD) {
            wVar.K((byte[]) h0Var4.f, androidx.media3.container.r.p((byte[]) h0Var4.f, h0Var4.e));
            wVar.N(5);
            oVar.a(j2, wVar);
        }
        androidx.media3.exoplayer.h0 h0Var5 = this.k;
        if (h0Var5.d(i2)) {
            wVar.K((byte[]) h0Var5.f, androidx.media3.container.r.p((byte[]) h0Var5.f, h0Var5.e));
            wVar.N(5);
            oVar.a(j2, wVar);
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        int i;
        this.c.getClass();
        String str = j0.a;
        while (wVar.a() > 0) {
            int i2 = wVar.b;
            int i3 = wVar.c;
            byte[] bArr = wVar.a;
            this.l += (long) wVar.a();
            this.c.f(wVar.a(), wVar);
            while (i2 < i3) {
                int iC = androidx.media3.container.r.c(bArr, i2, i3, this.f);
                if (iC == i3) {
                    g(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iC + 3] & 126) >> 1;
                if (iC <= 0 || bArr[iC - 1] != 0) {
                    i = 3;
                } else {
                    iC--;
                    i = 4;
                }
                int i5 = iC;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    g(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
        this.c.getClass();
        String str = j0.a;
        if (z) {
            this.a.d.c(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.b = e0Var.e;
        e0Var.b();
        h0 h0VarU = pVar.u(e0Var.d, 2);
        this.c = h0VarU;
        this.d = new q(h0VarU);
        this.a.b(pVar, e0Var);
    }

    public final void g(byte[] bArr, int i, int i2) {
        q qVar = this.d;
        if (qVar.f) {
            int i3 = qVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                qVar.g = (bArr[i4] & 128) != 0;
                qVar.f = false;
            } else {
                qVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        q qVar = this.d;
        boolean z = this.e;
        qVar.g = false;
        qVar.h = false;
        qVar.e = j2;
        qVar.d = 0;
        qVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (qVar.i && !qVar.j) {
                if (z) {
                    qVar.a(i);
                }
                qVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                qVar.h = !qVar.j;
                qVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        qVar.c = z2;
        qVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.g(i2);
            this.h.g(i2);
            this.i.g(i2);
        }
        this.j.g(i2);
        this.k.g(i2);
    }
}
