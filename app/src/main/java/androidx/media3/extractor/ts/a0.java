package androidx.media3.extractor.ts;

import androidx.media3.common.util.h0;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements f0 {
    public final z a;
    public final androidx.media3.common.util.w b = new androidx.media3.common.util.w(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public a0(z zVar) {
        this.a = zVar;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void a() {
        this.f = true;
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void b(int i, androidx.media3.common.util.w wVar) {
        int iZ;
        boolean z = (i & 1) != 0;
        if (z) {
            iZ = wVar.b + wVar.z();
        } else {
            iZ = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            wVar.M(iZ);
            this.d = 0;
        }
        while (wVar.a() > 0) {
            int i2 = this.d;
            androidx.media3.common.util.w wVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iZ2 = wVar.z();
                    wVar.M(wVar.b - 1);
                    if (iZ2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(wVar.a(), 3 - this.d);
                wVar.k(wVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    wVar2.M(0);
                    wVar2.L(3);
                    wVar2.N(1);
                    int iZ3 = wVar2.z();
                    int iZ4 = wVar2.z();
                    this.e = (iZ3 & 128) != 0;
                    int i4 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.c = i4;
                    byte[] bArr = wVar2.a;
                    if (bArr.length < i4) {
                        wVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(wVar.a(), this.c - this.d);
                wVar.k(wVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        wVar2.L(i6);
                    } else {
                        if (j0.p(0, wVar2.a, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        wVar2.L(this.c - 4);
                    }
                    wVar2.M(0);
                    this.a.c(wVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.f0
    public final void d(h0 h0Var, androidx.media3.extractor.p pVar, e0 e0Var) {
        this.a.d(h0Var, pVar, e0Var);
        this.f = true;
    }
}
