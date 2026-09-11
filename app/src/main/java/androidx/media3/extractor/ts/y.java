package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.h0;
import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.media3.extractor.n {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public androidx.media3.extractor.flac.b i;
    public androidx.media3.extractor.p j;
    public boolean k;
    public final h0 a = new h0(0);
    public final androidx.media3.common.util.w c = new androidx.media3.common.util.w(4096);
    public final SparseArray b = new SparseArray();
    public final w d = new w(0);

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        byte[] bArr = new byte[14];
        androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) oVar;
        kVar.e(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            kVar.a(bArr[13] & 7, false);
            kVar.e(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        h0 h0Var = this.a;
        synchronized (h0Var) {
            j3 = h0Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = h0Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            h0Var.f(j2);
        }
        androidx.media3.extractor.flac.b bVar = this.i;
        if (bVar != null) {
            bVar.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            x xVar = (x) sparseArray.valueAt(i);
            xVar.f = false;
            xVar.a.a();
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        long j;
        h jVar;
        long j2;
        this.j.getClass();
        long length = oVar.getLength();
        long j3 = -9223372036854775807L;
        w wVar = this.d;
        if (length != -1 && !wVar.d) {
            h0 h0Var = wVar.b;
            androidx.media3.common.util.w wVar2 = wVar.c;
            if (!wVar.f) {
                long length2 = oVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j4 = length2 - ((long) iMin);
                if (oVar.getPosition() != j4) {
                    rVar.a = j4;
                    return 1;
                }
                wVar2.J(iMin);
                oVar.n();
                oVar.x(wVar2.a, 0, iMin);
                int i = wVar2.b;
                for (int i2 = wVar2.c - 4; i2 >= i; i2--) {
                    if (w.b(wVar2.a, i2) == 442) {
                        wVar2.M(i2 + 4);
                        long jC = w.c(wVar2);
                        if (jC != -9223372036854775807L) {
                            j3 = jC;
                            break;
                        }
                    }
                }
                wVar.h = j3;
                wVar.f = true;
                return 0;
            }
            if (wVar.h == -9223372036854775807L) {
                wVar.a(oVar);
                return 0;
            }
            if (wVar.e) {
                long j5 = wVar.g;
                if (j5 == -9223372036854775807L) {
                    wVar.a(oVar);
                    return 0;
                }
                wVar.i = h0Var.c(wVar.h) - h0Var.b(j5);
                wVar.a(oVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, oVar.getLength());
            long j6 = 0;
            if (oVar.getPosition() != j6) {
                rVar.a = j6;
                return 1;
            }
            wVar2.J(iMin2);
            oVar.n();
            oVar.x(wVar2.a, 0, iMin2);
            int i3 = wVar2.c;
            for (int i4 = wVar2.b; i4 < i3 - 3; i4++) {
                if (w.b(wVar2.a, i4) == 442) {
                    wVar2.M(i4 + 4);
                    long jC2 = w.c(wVar2);
                    if (jC2 != -9223372036854775807L) {
                        j2 = jC2;
                        wVar.g = j2;
                        wVar.e = true;
                        return 0;
                    }
                }
            }
            j2 = -9223372036854775807L;
            wVar.g = j2;
            wVar.e = true;
            return 0;
        }
        if (!this.k) {
            this.k = true;
            long j7 = wVar.i;
            if (j7 != -9223372036854775807L) {
                androidx.media3.extractor.flac.b bVar = new androidx.media3.extractor.flac.b(new com.google.android.gms.common.internal.k(17), new androidx.media3.common.util.b(wVar.b), j7, j7 + 1, 0L, length, 188L, 1000);
                this.i = bVar;
                this.j.g(bVar.a);
            } else {
                this.j.g(new androidx.media3.extractor.s(j7));
            }
        }
        androidx.media3.extractor.flac.b bVar2 = this.i;
        if (bVar2 != null && bVar2.c != null) {
            return bVar2.b(oVar, rVar);
        }
        oVar.n();
        long jF = length != -1 ? length - oVar.f() : -1L;
        if (jF != -1 && jF < 4) {
            return -1;
        }
        androidx.media3.common.util.w wVar3 = this.c;
        if (!oVar.e(wVar3.a, 0, 4, true)) {
            return -1;
        }
        wVar3.M(0);
        int iM = wVar3.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            oVar.x(wVar3.a, 0, 10);
            wVar3.M(9);
            oVar.r((wVar3.z() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            oVar.x(wVar3.a, 0, 2);
            wVar3.M(0);
            oVar.r(wVar3.G() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            oVar.r(1);
            return 0;
        }
        int i5 = iM & 255;
        SparseArray sparseArray = this.b;
        x xVar = (x) sparseArray.get(i5);
        if (!this.e) {
            if (xVar == null) {
                if (i5 == 189) {
                    jVar = new b("video/mp2p");
                    this.f = true;
                    this.h = oVar.getPosition();
                } else if ((iM & LibretroCore.SCREEN_HEIGHT) == 192) {
                    jVar = new t(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = oVar.getPosition();
                } else if ((iM & 240) == 224) {
                    jVar = new j(null, "video/mp2p");
                    this.g = true;
                    this.h = oVar.getPosition();
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.f(this.j, new e0(i5, LibretroCore.SCREEN_WIDTH));
                    xVar = new x(jVar, this.a);
                    sparseArray.put(i5, xVar);
                }
            }
            if (oVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.o();
            }
        }
        oVar.x(wVar3.a, 0, 2);
        wVar3.M(0);
        int iG = wVar3.G() + 6;
        if (xVar == null) {
            oVar.r(iG);
            return 0;
        }
        wVar3.J(iG);
        oVar.readFully(wVar3.a, 0, iG);
        wVar3.M(6);
        h hVar = xVar.a;
        androidx.media3.common.util.v vVar = xVar.c;
        wVar3.k(vVar.b, 0, 3);
        vVar.m(0);
        vVar.o(8);
        xVar.d = vVar.f();
        xVar.e = vVar.f();
        vVar.o(6);
        wVar3.k(vVar.b, 0, vVar.g(8));
        vVar.m(0);
        h0 h0Var2 = xVar.b;
        xVar.g = 0L;
        if (xVar.d) {
            vVar.o(4);
            long jG = ((long) vVar.g(3)) << 30;
            vVar.o(1);
            long jG2 = jG | ((long) (vVar.g(15) << 15));
            vVar.o(1);
            long jG3 = jG2 | ((long) vVar.g(15));
            vVar.o(1);
            if (xVar.f || !xVar.e) {
                j = jG3;
            } else {
                vVar.o(4);
                long jG4 = ((long) vVar.g(3)) << 30;
                vVar.o(1);
                long jG5 = ((long) (vVar.g(15) << 15)) | jG4;
                vVar.o(1);
                long jG6 = jG5 | ((long) vVar.g(15));
                vVar.o(1);
                h0Var2.b(jG6);
                xVar.f = true;
                j = jG3;
            }
            xVar.g = h0Var2.b(j);
        }
        hVar.e(4, xVar.g);
        hVar.c(wVar3);
        hVar.d(false);
        wVar3.L(wVar3.a.length);
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        this.j = pVar;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
