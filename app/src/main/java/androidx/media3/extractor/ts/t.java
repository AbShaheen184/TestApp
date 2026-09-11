package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements h {
    public final androidx.media3.common.util.w a;
    public final androidx.media3.extractor.y b;
    public final String c;
    public final int d;
    public final String e;
    public h0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public t(String str, int i, String str2) {
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(4);
        this.a = wVar;
        wVar.a[0] = -1;
        this.b = new androidx.media3.extractor.y();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        this.f.getClass();
        while (wVar.a() > 0) {
            int i = this.h;
            androidx.media3.common.util.w wVar2 = this.a;
            if (i == 0) {
                byte[] bArr = wVar.a;
                int i2 = wVar.b;
                int i3 = wVar.c;
                while (true) {
                    if (i2 >= i3) {
                        wVar.M(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        wVar.M(i2 + 1);
                        this.k = false;
                        wVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(wVar.a(), 4 - this.i);
                wVar.k(wVar2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    wVar2.M(0);
                    int iM = wVar2.m();
                    androidx.media3.extractor.y yVar = this.b;
                    if (yVar.a(iM)) {
                        this.m = yVar.b;
                        if (!this.j) {
                            this.l = (((long) yVar.f) * 1000000) / ((long) yVar.c);
                            androidx.media3.common.q qVar = new androidx.media3.common.q();
                            qVar.a = this.g;
                            qVar.m = i0.p(this.e);
                            qVar.n = i0.p((String) yVar.g);
                            qVar.o = 4096;
                            qVar.F = yVar.d;
                            qVar.G = yVar.c;
                            qVar.d = this.c;
                            qVar.f = this.d;
                            this.f.e(new androidx.media3.common.r(qVar));
                            this.j = true;
                        }
                        wVar2.M(0);
                        this.f.f(4, wVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    org.mozilla.javascript.c.a();
                    return;
                }
                int iMin2 = Math.min(wVar.a(), this.m - this.i);
                this.f.f(iMin2, wVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    com.google.android.material.motion.a.q(this.n != -9223372036854775807L);
                    this.f.g(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.g = e0Var.e;
        e0Var.b();
        this.f = pVar.u(e0Var.d, 1);
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
    }
}
