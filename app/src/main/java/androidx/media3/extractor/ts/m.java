package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.common.util.j0;
import androidx.media3.exoplayer.h0;
import java.util.Arrays;
import java.util.Collections;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final b0 a;
    public final androidx.media3.common.util.w b;
    public final boolean[] c = new boolean[4];
    public final k d;
    public final h0 e;
    public l f;
    public long g;
    public String h;
    public androidx.media3.extractor.h0 i;
    public boolean j;
    public long k;

    public m(b0 b0Var) {
        this.a = b0Var;
        k kVar = new k();
        kVar.e = new byte[128];
        this.d = kVar;
        this.k = -9223372036854775807L;
        this.e = new h0(Token.ARROW);
        this.b = new androidx.media3.common.util.w();
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        androidx.media3.container.r.b(this.c);
        k kVar = this.d;
        kVar.a = false;
        kVar.c = 0;
        kVar.b = 0;
        l lVar = this.f;
        if (lVar != null) {
            lVar.b = false;
            lVar.c = false;
            lVar.d = false;
            lVar.e = -1;
        }
        h0 h0Var = this.e;
        if (h0Var != null) {
            h0Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0239  */
    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = wVar.b;
        int i6 = wVar.c;
        byte[] bArr = wVar.a;
        this.g += (long) wVar.a();
        this.i.f(wVar.a(), wVar);
        while (true) {
            int iC = androidx.media3.container.r.c(bArr, i5, i6, this.c);
            k kVar = this.d;
            h0 h0Var = this.e;
            if (iC == i6) {
                if (!this.j) {
                    kVar.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (h0Var != null) {
                    h0Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iC + 3;
            byte b = wVar.a[i7];
            int i8 = b & 255;
            int i9 = iC - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    kVar.a(bArr, i5, iC);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = kVar.b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            androidx.media3.common.util.c.t("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                org.mozilla.javascript.c.a();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                kVar.c -= i10;
                                kVar.a = false;
                                androidx.media3.extractor.h0 h0Var2 = this.i;
                                int i12 = kVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(kVar.e, kVar.c);
                                androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(bArrCopyOf, bArrCopyOf.length);
                                vVar.p(i12);
                                vVar.p(4);
                                vVar.n();
                                vVar.o(8);
                                if (vVar.f()) {
                                    vVar.o(4);
                                    vVar.o(3);
                                }
                                int iG = vVar.g(4);
                                if (iG == 15) {
                                    int iG2 = vVar.g(8);
                                    int iG3 = vVar.g(8);
                                    if (iG3 == 0) {
                                        androidx.media3.common.util.c.t("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = l[iG];
                                } else {
                                    androidx.media3.common.util.c.t("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (vVar.f()) {
                                    vVar.o(2);
                                    vVar.o(1);
                                    if (vVar.f()) {
                                        vVar.o(15);
                                        vVar.n();
                                        vVar.o(15);
                                        vVar.n();
                                        vVar.o(15);
                                        vVar.n();
                                        vVar.o(3);
                                        vVar.o(11);
                                        vVar.n();
                                        vVar.o(15);
                                        vVar.n();
                                    }
                                }
                                if (vVar.g(2) != 0) {
                                    androidx.media3.common.util.c.t("H263Reader", "Unhandled video object layer shape");
                                }
                                vVar.n();
                                int iG4 = vVar.g(16);
                                vVar.n();
                                if (vVar.f()) {
                                    if (iG4 == 0) {
                                        androidx.media3.common.util.c.t("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iG4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        vVar.o(i13);
                                    }
                                }
                                vVar.n();
                                int iG5 = vVar.g(13);
                                vVar.n();
                                int iG6 = vVar.g(13);
                                vVar.n();
                                vVar.n();
                                androidx.media3.common.q qVar = new androidx.media3.common.q();
                                qVar.a = str;
                                qVar.m = i0.p("video/mp2t");
                                qVar.n = i0.p("video/mp4v-es");
                                qVar.u = iG5;
                                qVar.v = iG6;
                                qVar.A = f;
                                qVar.q = Collections.singletonList(bArrCopyOf);
                                h0Var2.e(new androidx.media3.common.r(qVar));
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            androidx.media3.common.util.c.t("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            i4 = 0;
                            kVar.d = kVar.c;
                            kVar.b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            androidx.media3.common.util.c.t("H263Reader", "Unexpected start code value");
                            kVar.a = false;
                            kVar.c = 0;
                            kVar.b = 0;
                        } else {
                            kVar.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        kVar.b = 1;
                        kVar.a = true;
                    }
                }
                kVar.a(k.f, i4, 3);
            }
            this.f.a(bArr, i5, iC);
            if (h0Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    h0Var.a(bArr, i5, iC);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (h0Var.d(i3)) {
                    int iP = androidx.media3.container.r.p((byte[]) h0Var.f, h0Var.e);
                    String str2 = j0.a;
                    byte[] bArr2 = (byte[]) h0Var.f;
                    androidx.media3.common.util.w wVar2 = this.b;
                    wVar2.K(bArr2, iP);
                    this.a.a(this.k, wVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (wVar.a[iC + 2] == 1) {
                        h0Var.g(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iC;
            this.f.b(this.g - ((long) i15), i15, this.j);
            l lVar = this.f;
            long j = this.k;
            lVar.e = i8;
            lVar.d = false;
            lVar.b = (i8 == 182 || i8 == 179) ? z : false;
            lVar.c = i8 == 182 ? z : false;
            lVar.f = 0;
            lVar.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(this.g, 0, this.j);
            l lVar = this.f;
            lVar.b = false;
            lVar.c = false;
            lVar.d = false;
            lVar.e = -1;
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.k = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.h = e0Var.e;
        e0Var.b();
        androidx.media3.extractor.h0 h0VarU = pVar.u(e0Var.d, 2);
        this.i = h0VarU;
        this.f = new l(h0VarU);
        this.a.b(pVar, e0Var);
    }
}
