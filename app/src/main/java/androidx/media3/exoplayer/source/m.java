package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.media3.datasource.h {
    public final byte[] A;
    public int B;
    public final androidx.media3.datasource.h e;
    public final int y;
    public final l0 z;

    public m(androidx.media3.datasource.h hVar, int i, l0 l0Var) {
        com.google.android.material.motion.a.f(i > 0);
        this.e = hVar;
        this.y = i;
        this.z = l0Var;
        this.A = new byte[1];
        this.B = i;
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.e.c(fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.h
    public final Map k() {
        return this.e.k();
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.B;
        androidx.media3.datasource.h hVar = this.e;
        if (i3 == 0) {
            byte[] bArr2 = this.A;
            int i4 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = hVar.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        androidx.media3.common.util.w wVar = new androidx.media3.common.util.w(bArr3, i5);
                        l0 l0Var = this.z;
                        long jMax = !l0Var.I ? l0Var.F : Math.max(l0Var.J.y(true), l0Var.F);
                        int iA = wVar.a();
                        androidx.media3.extractor.h0 h0Var = l0Var.H;
                        h0Var.getClass();
                        h0Var.f(iA, wVar);
                        h0Var.g(jMax, 1, iA, 0, null);
                        l0Var.I = true;
                    }
                }
                this.B = this.y;
            }
            return -1;
        }
        int i8 = hVar.read(bArr, i, Math.min(this.B, i2));
        if (i8 != -1) {
            this.B -= i8;
        }
        return i8;
    }

    @Override // androidx.media3.datasource.h
    public final long t(androidx.media3.datasource.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.e.v();
    }
}
