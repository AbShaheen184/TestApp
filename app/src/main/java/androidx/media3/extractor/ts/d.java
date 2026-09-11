package androidx.media3.extractor.ts;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.media3.extractor.n {
    public final androidx.media3.common.util.w c;
    public final androidx.media3.common.util.v d;
    public androidx.media3.extractor.p e;
    public long f;
    public boolean h;
    public boolean i;
    public final e a = new e(0, null, "audio/mp4a-latm", true);
    public final androidx.media3.common.util.w b = new androidx.media3.common.util.w(2048);
    public long g = -1;

    public d(int i) {
        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(10);
        this.c = wVar;
        byte[] bArr = wVar.a;
        this.d = new androidx.media3.common.util.v(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) {
        int i = 0;
        while (true) {
            androidx.media3.common.util.w wVar = this.c;
            oVar.x(wVar.a, 0, 10);
            wVar.M(0);
            if (wVar.C() != 4801587) {
                break;
            }
            wVar.N(3);
            int iY = wVar.y();
            i += iY + 10;
            oVar.h(iY);
        }
        oVar.n();
        oVar.h(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            androidx.media3.common.util.w wVar2 = this.c;
            androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) oVar;
            kVar.e(wVar2.a, 0, 2, false);
            wVar2.M(0);
            if ((wVar2.G() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                kVar.e(wVar2.a, 0, 4, false);
                androidx.media3.common.util.v vVar = this.d;
                vVar.m(14);
                int iG = vVar.g(13);
                if (iG <= 6) {
                    i2++;
                    kVar.C = 0;
                    kVar.a(i2, false);
                } else {
                    kVar.a(iG - 6, false);
                    i4 += iG;
                }
            } else {
                i2++;
                kVar.C = 0;
                kVar.a(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) {
        this.e.getClass();
        oVar.getLength();
        androidx.media3.common.util.w wVar = this.b;
        int i = oVar.read(wVar.a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.g(new androidx.media3.extractor.s(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        wVar.M(0);
        wVar.L(i);
        boolean z2 = this.h;
        e eVar = this.a;
        if (!z2) {
            eVar.u = this.f;
            this.h = true;
        }
        eVar.c(wVar);
        return 0;
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        this.e = pVar;
        this.a.f(pVar, new e0(0, 1));
        pVar.o();
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
