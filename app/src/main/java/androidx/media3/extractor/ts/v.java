package androidx.media3.extractor.ts;

import androidx.media3.common.util.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements f0 {
    public final h a;
    public final androidx.media3.common.util.v b = new androidx.media3.common.util.v(new byte[10], 10);
    public int c = 0;
    public int d;
    public h0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public v(h hVar) {
        this.a = hVar;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void b(int i, androidx.media3.common.util.w wVar) {
        this.e.getClass();
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        h hVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    androidx.media3.common.util.c.t("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        org.mozilla.javascript.c.a();
                        return;
                    }
                    if (this.j != -1) {
                        androidx.media3.common.util.c.t("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    hVar.d(wVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (wVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                androidx.media3.common.util.v vVar = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (c(wVar, vVar.b, Math.min(10, this.i)) && c(wVar, null, this.i)) {
                            vVar.m(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                vVar.o(4);
                                long jG = ((long) vVar.g(3)) << 30;
                                vVar.o(1);
                                long jG2 = ((long) (vVar.g(15) << 15)) | jG;
                                vVar.o(1);
                                long jG3 = jG2 | ((long) vVar.g(15));
                                vVar.o(1);
                                if (!this.h && this.g) {
                                    vVar.o(4);
                                    long jG4 = ((long) vVar.g(3)) << 30;
                                    vVar.o(1);
                                    long jG5 = jG4 | ((long) (vVar.g(15) << 15));
                                    vVar.o(1);
                                    long jG6 = jG5 | ((long) vVar.g(15));
                                    vVar.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                this.l = this.e.b(jG3);
                            }
                            i6 |= this.k ? 4 : 0;
                            hVar.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            org.mozilla.javascript.c.a();
                            return;
                        }
                        int iA = wVar.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            wVar.L(wVar.b + iA);
                        }
                        hVar.c(wVar);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                hVar.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (c(wVar, vVar.b, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                wVar.N(wVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean c(androidx.media3.common.util.w wVar, byte[] bArr, int i) {
        int iMin = Math.min(wVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.N(iMin);
        } else {
            wVar.k(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void d(h0 h0Var, androidx.media3.extractor.p pVar, e0 e0Var) {
        this.e = h0Var;
        this.a.f(pVar, e0Var);
    }

    public final boolean e() {
        androidx.media3.common.util.v vVar = this.b;
        vVar.m(0);
        int iG = vVar.g(24);
        if (iG != 1) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.w("Unexpected start code prefix: ", iG, "PesReader");
            this.j = -1;
            return false;
        }
        vVar.o(8);
        int iG2 = vVar.g(16);
        vVar.o(5);
        this.k = vVar.f();
        vVar.o(2);
        this.f = vVar.f();
        this.g = vVar.f();
        vVar.o(6);
        int iG3 = vVar.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            androidx.media3.common.util.c.t("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
