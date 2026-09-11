package androidx.media3.extractor.ogg;

import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.r0;
import androidx.media3.extractor.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public t n;
    public r0 o;

    @Override // androidx.media3.extractor.ogg.i
    public final long b(w wVar) {
        byte[] bArr = wVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            wVar.N(4);
            wVar.H();
        }
        int iS = androidx.media3.extractor.b.s(i, wVar);
        wVar.M(0);
        return iS;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final boolean c(w wVar, long j, androidx.media3.common.util.b bVar) {
        byte[] bArr = wVar.a;
        t tVar = this.n;
        if (tVar == null) {
            t tVar2 = new t(bArr, 17);
            this.n = tVar2;
            q qVarA = tVar2.c(Arrays.copyOfRange(bArr, 9, wVar.c), null).a();
            qVarA.m = i0.p("audio/ogg");
            bVar.y = new r(qVarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            r0 r0Var = this.o;
            if (r0Var != null) {
                r0Var.e = j;
                bVar.z = r0Var;
            }
            ((r) bVar.y).getClass();
            return false;
        }
        androidx.media3.common.util.b bVarT = androidx.media3.extractor.b.t(wVar);
        t tVar3 = new t(tVar.a, tVar.b, tVar.c, tVar.d, tVar.e, tVar.g, tVar.h, tVar.j, bVarT, tVar.l);
        this.n = tVar3;
        r0 r0Var2 = new r0();
        r0Var2.z = tVar3;
        r0Var2.A = bVarT;
        r0Var2.e = -1L;
        r0Var2.y = -1L;
        this.o = r0Var2;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
