package androidx.media3.extractor.ts;

import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.extractor.h0;
import com.app.mlounge.emulator.LibretroCore;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    public final androidx.media3.common.util.w a;
    public final String c;
    public final int d;
    public String f;
    public h0 g;
    public int i;
    public int j;
    public long k;
    public androidx.media3.common.r l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public f(String str, int i, int i2) {
        this.a = new androidx.media3.common.util.w(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    public final boolean b(androidx.media3.common.util.w wVar, byte[] bArr, int i) {
        int iMin = Math.min(wVar.a(), i - this.i);
        wVar.k(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void c(androidx.media3.common.util.w wVar) throws j0 {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int iG;
        int iG2;
        int iG3;
        int i5;
        long jY;
        int i6;
        long jY2;
        int i7;
        int i8;
        int i9;
        int i10;
        this.g.getClass();
        while (wVar.a() > 0) {
            int i11 = this.h;
            androidx.media3.common.util.w wVar2 = this.a;
            switch (i11) {
                case 0:
                    while (wVar.a() > 0) {
                        int i12 = this.j << 8;
                        this.j = i12;
                        int iZ = i12 | wVar.z();
                        this.j = iZ;
                        int i13 = androidx.media3.extractor.b.i(iZ);
                        this.n = i13;
                        if (i13 != 0) {
                            byte[] bArr = wVar2.a;
                            int i14 = this.j;
                            bArr[0] = (byte) ((i14 >> 24) & 255);
                            bArr[1] = (byte) ((i14 >> 16) & 255);
                            bArr[2] = (byte) ((i14 >> 8) & 255);
                            bArr[3] = (byte) (i14 & 255);
                            this.i = 4;
                            this.j = 0;
                            if (i13 != 3 && i13 != 4) {
                                if (i13 == 1) {
                                    this.h = 1;
                                } else {
                                    this.h = 2;
                                }
                            }
                            this.h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(wVar, wVar2.a, 18)) {
                        byte[] bArr2 = wVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            androidx.media3.common.util.v vVarK = androidx.media3.extractor.b.k(bArr2);
                            vVarK.o(60);
                            int i15 = androidx.media3.extractor.b.j[vVarK.g(6)];
                            int i16 = androidx.media3.extractor.b.k[vVarK.g(4)];
                            int iG4 = vVarK.g(5);
                            int i17 = iG4 >= 29 ? -1 : (androidx.media3.extractor.b.l[iG4] * 1000) / 2;
                            vVarK.o(10);
                            int i18 = i15 + (vVarK.g(2) > 0 ? 1 : 0);
                            androidx.media3.common.q qVar = new androidx.media3.common.q();
                            qVar.a = str;
                            qVar.m = i0.p(this.e);
                            qVar.n = i0.p("audio/vnd.dts");
                            qVar.h = i17;
                            qVar.F = i18;
                            qVar.G = i16;
                            qVar.r = null;
                            qVar.d = this.c;
                            qVar.f = this.d;
                            androidx.media3.common.r rVar = new androidx.media3.common.r(qVar);
                            this.l = rVar;
                            this.g.e(rVar);
                        }
                        this.m = androidx.media3.extractor.b.g(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.k = kotlin.collections.a0.c(androidx.media3.common.util.j0.W(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                            wVar2.M(0);
                            this.g.f(18, wVar2);
                            this.h = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.k = kotlin.collections.a0.c(androidx.media3.common.util.j0.W(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                        wVar2.M(0);
                        this.g.f(18, wVar2);
                        this.h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(wVar, wVar2.a, 7)) {
                        androidx.media3.common.util.v vVarK2 = androidx.media3.extractor.b.k(wVar2.a);
                        vVarK2.o(42);
                        this.o = vVarK2.g(vVarK2.f() ? 12 : 8) + 1;
                        this.h = 3;
                    }
                    break;
                case 3:
                    int i19 = 8;
                    if (b(wVar, wVar2.a, this.o)) {
                        androidx.media3.common.util.v vVarK3 = androidx.media3.extractor.b.k(wVar2.a);
                        vVarK3.o(40);
                        int iG5 = vVarK3.g(2);
                        if (vVarK3.f()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        vVarK3.o(i4);
                        int iG6 = vVarK3.g(i3) + 1;
                        boolean zF = vVarK3.f();
                        if (zF) {
                            iG = vVarK3.g(2);
                            iG2 = (vVarK3.g(3) + 1) * 512;
                            if (vVarK3.f()) {
                                vVarK3.o(36);
                            }
                            int iG7 = vVarK3.g(3) + 1;
                            int iG8 = vVarK3.g(3) + 1;
                            if (iG7 != 1 || iG8 != 1) {
                                throw j0.c("Multiple audio presentations or assets not supported");
                            }
                            int i20 = iG5 + 1;
                            int iG9 = vVarK3.g(i20);
                            int i21 = 0;
                            while (i21 < i20) {
                                if (((iG9 >> i21) & 1) == 1) {
                                    vVarK3.o(i19);
                                }
                                i21++;
                                i19 = 8;
                            }
                            if (vVarK3.f()) {
                                vVarK3.o(2);
                                int iG10 = (vVarK3.g(2) + 1) << 2;
                                int iG11 = vVarK3.g(2) + 1;
                                for (int i22 = 0; i22 < iG11; i22++) {
                                    vVarK3.o(iG10);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        vVarK3.o(i3);
                        vVarK3.o(12);
                        if (zF) {
                            if (vVarK3.f()) {
                                vVarK3.o(4);
                            }
                            if (vVarK3.f()) {
                                vVarK3.o(24);
                            }
                            if (vVarK3.f()) {
                                vVarK3.p(vVarK3.g(10) + 1);
                            }
                            vVarK3.o(5);
                            i5 = androidx.media3.extractor.b.m[vVarK3.g(4)];
                            iG3 = vVarK3.g(8) + 1;
                        } else {
                            iG3 = -1;
                            i5 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i6 = 32000;
                            } else if (iG == 1) {
                                i6 = 44100;
                            } else {
                                if (iG != 2) {
                                    throw j0.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i6 = 48000;
                            }
                            String str2 = androidx.media3.common.util.j0.a;
                            jY = androidx.media3.common.util.j0.Y(iG2, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jY = -9223372036854775807L;
                        }
                        g(new androidx.media3.extractor.a("audio/vnd.dts.hd;profile=lbr", iG3, i5, iG6, jY));
                        this.m = iG6;
                        this.k = jY == -9223372036854775807L ? 0L : jY;
                        wVar2.M(0);
                        this.g.f(this.o, wVar2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(wVar, wVar2.a, 6)) {
                        androidx.media3.common.util.v vVarK4 = androidx.media3.extractor.b.k(wVar2.a);
                        vVarK4.o(32);
                        int iQ = androidx.media3.extractor.b.q(vVarK4, androidx.media3.extractor.b.r) + 1;
                        this.p = iQ;
                        int i23 = this.i;
                        if (i23 > iQ) {
                            int i24 = i23 - iQ;
                            this.i = i23 - i24;
                            wVar.M(wVar.b - i24);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    if (b(wVar, wVar2.a, this.p)) {
                        byte[] bArr3 = wVar2.a;
                        androidx.media3.common.util.v vVarK5 = androidx.media3.extractor.b.k(bArr3);
                        int i25 = vVarK5.g(32) == 1078008818 ? 1 : 0;
                        int iQ2 = androidx.media3.extractor.b.q(vVarK5, androidx.media3.extractor.b.n);
                        int i26 = iQ2 + 1;
                        if (i25 == 0) {
                            jY2 = -9223372036854775807L;
                            i7 = -2147483647;
                        } else {
                            if (!vVarK5.f()) {
                                throw j0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i27 = iQ2 - 1;
                            int i28 = ((bArr3[i27] << 8) & 65535) | (bArr3[iQ2] & 255);
                            String str3 = androidx.media3.common.util.j0.a;
                            int i29 = 65535;
                            for (int i30 = 0; i30 < i27; i30++) {
                                byte b4 = bArr3[i30];
                                int[] iArr = androidx.media3.common.util.j0.l;
                                int i31 = (iArr[(((b4 & 255) >> 4) ^ ((i29 >> 12) & 255)) & 255] ^ ((i29 << 4) & 65535)) & 65535;
                                i29 = (iArr[((b4 & 15) ^ ((i31 >> 12) & 255)) & 255] ^ ((i31 << 4) & 65535)) & 65535;
                            }
                            if (i28 != i29) {
                                throw j0.a(null, "CRC check failed");
                            }
                            int iG12 = vVarK5.g(2);
                            if (iG12 != 0) {
                                if (iG12 == 1) {
                                    i9 = LibretroCore.PSP_SCREEN_WIDTH;
                                } else {
                                    if (iG12 != 2) {
                                        throw j0.a(null, "Unsupported base duration index in DTS UHD header: " + iG12);
                                    }
                                    i9 = 384;
                                }
                                i8 = 3;
                            } else {
                                i8 = 3;
                                i9 = 512;
                            }
                            int iG13 = (vVarK5.g(i8) + 1) * i9;
                            int iG14 = vVarK5.g(2);
                            if (iG14 == 0) {
                                i10 = 32000;
                            } else if (iG14 == 1) {
                                i10 = 44100;
                            } else {
                                if (iG14 != 2) {
                                    throw j0.a(null, "Unsupported clock rate index in DTS UHD header: " + iG14);
                                }
                                i10 = 48000;
                            }
                            if (vVarK5.f()) {
                                vVarK5.o(36);
                            }
                            int iG15 = i10 * (1 << vVarK5.g(2));
                            jY2 = androidx.media3.common.util.j0.Y(iG13, 1000000L, i10, RoundingMode.DOWN);
                            i7 = iG15;
                        }
                        int iQ3 = 0;
                        for (int i32 = 0; i32 < i25; i32++) {
                            iQ3 += androidx.media3.extractor.b.q(vVarK5, androidx.media3.extractor.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i25 != 0) {
                            atomicInteger.set(androidx.media3.extractor.b.q(vVarK5, androidx.media3.extractor.b.p));
                        }
                        int iQ4 = iQ3 + (atomicInteger.get() != 0 ? androidx.media3.extractor.b.q(vVarK5, androidx.media3.extractor.b.q) : 0) + i26;
                        androidx.media3.extractor.a aVar = new androidx.media3.extractor.a("audio/vnd.dts.uhd;profile=p2", 2, i7, iQ4, jY2);
                        if (this.n == 3) {
                            g(aVar);
                        }
                        this.m = iQ4;
                        this.k = jY2 == -9223372036854775807L ? 0L : jY2;
                        wVar2.M(0);
                        this.g.f(this.p, wVar2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(wVar.a(), this.m - this.i);
                    this.g.f(iMin, wVar);
                    int i33 = this.i + iMin;
                    this.i = i33;
                    if (i33 == this.m) {
                        com.google.android.material.motion.a.q(this.q != -9223372036854775807L);
                        this.g.g(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                    }
                    break;
                default:
                    org.mozilla.javascript.c.a();
                    return;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.h
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // androidx.media3.extractor.ts.h
    public final void f(androidx.media3.extractor.p pVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f = e0Var.e;
        e0Var.b();
        this.g = pVar.u(e0Var.d, 1);
    }

    public final void g(androidx.media3.extractor.a aVar) {
        int i = aVar.b;
        String str = aVar.a;
        int i2 = aVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        androidx.media3.common.r rVar = this.l;
        if (rVar != null && i2 == rVar.G && i == rVar.H && str.equals(rVar.o)) {
            return;
        }
        androidx.media3.common.r rVar2 = this.l;
        androidx.media3.common.q qVar = rVar2 == null ? new androidx.media3.common.q() : rVar2.a();
        qVar.a = this.f;
        qVar.m = i0.p(this.e);
        qVar.n = i0.p(str);
        qVar.F = i2;
        qVar.G = i;
        qVar.d = this.c;
        qVar.f = this.d;
        androidx.media3.common.r rVar3 = new androidx.media3.common.r(qVar);
        this.l = rVar3;
        this.g.e(rVar3);
    }

    @Override // androidx.media3.extractor.ts.h
    public final void d(boolean z) {
    }
}
