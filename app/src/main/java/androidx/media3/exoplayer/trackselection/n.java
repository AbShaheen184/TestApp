package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;
import androidx.media3.exoplayer.mediacodec.v;
import com.google.common.collect.h0;
import com.google.common.collect.y;
import com.google.common.collect.y0;
import com.google.common.collect.z0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {
    public final boolean B;
    public final j C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final int U;
    public final boolean V;
    public final String W;

    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    public n(int i, w0 w0Var, int i2, j jVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iG;
        int i6;
        boolean z4;
        String strC;
        int i7;
        androidx.media3.common.r rVar;
        int i8;
        int i9;
        int i10;
        androidx.media3.common.r rVar2;
        int i11;
        int i12;
        int i13;
        super(i, w0Var, i2);
        this.C = jVar;
        boolean z5 = jVar.y;
        h0 h0Var = jVar.i;
        h0 h0Var2 = jVar.k;
        int i14 = z5 ? 24 : 16;
        int i15 = 0;
        this.P = false;
        if (!z || (((i11 = (rVar2 = this.A).v) != -1 && i11 > jVar.a) || ((i12 = rVar2.w) != -1 && i12 > jVar.b))) {
            z2 = false;
        } else {
            float f = rVar2.z;
            if ((f == -1.0f || f <= jVar.c) && ((i13 = rVar2.j) == -1 || i13 <= jVar.d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.B = z2;
        if (!z || (((i8 = (rVar = this.A).v) != -1 && i8 < 0) || ((i9 = rVar.w) != -1 && i9 < 0))) {
            z3 = false;
        } else {
            float f2 = rVar.z;
            if ((f2 == -1.0f || f2 >= 0) && ((i10 = rVar.j) == -1 || i10 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.D = z3;
        this.E = androidx.media3.exoplayer.a.n(i3, false);
        androidx.media3.common.r rVar3 = this.A;
        float f3 = rVar3.z;
        this.F = f3 != -1.0f && f3 >= 10.0f;
        this.G = rVar3.j;
        int i16 = rVar3.v;
        this.H = (i16 == -1 || (i7 = rVar3.w) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= h0Var2.size()) {
                iG = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iG = o.g(this.A, (String) h0Var2.get(i17), false);
                if (iG > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.J = i17;
        this.K = iG;
        int i18 = this.A.f;
        z0 z0Var = o.k;
        this.L = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i19 = this.A.f;
        this.N = i19 == 0 || (i19 & 1) != 0;
        this.O = o.g(this.A, str, o.j(str) == null);
        androidx.media3.common.r rVar4 = this.A;
        String str2 = rVar4.o;
        int i20 = i3 & 384;
        if (i20 == 256 && (strC = v.c(rVar4)) != null) {
            str2 = strC;
        }
        for (int i21 = 0; i21 < h0Var.size(); i21++) {
            if (str2 != null && str2.equals(h0Var.get(i21))) {
                i5 = i21;
                break;
            }
        }
        this.I = i5;
        this.M = o.a(this.A, jVar.j);
        this.R = i20 == 128 || i20 == 256;
        boolean z6 = i20 == 128;
        this.S = z6;
        this.T = (i3 & 64) == 64;
        this.W = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.U = i6;
        if (z6) {
            androidx.media3.common.h hVar = this.A.E;
            if (hVar != null) {
                int i22 = hVar.c;
                z4 = (i22 == 7 || i22 == 6) ? true : z4;
            } else {
                androidx.media3.common.h hVar2 = androidx.media3.common.h.h;
            }
            z4 = false;
        } else {
            z4 = false;
        }
        this.V = z4;
        boolean z7 = this.B;
        j jVar2 = this.C;
        androidx.media3.common.r rVar5 = this.A;
        if ((rVar5.f & 16384) == 0 && androidx.media3.exoplayer.a.n(i3, jVar2.C) && (z7 || jVar2.x)) {
            i15 = (androidx.media3.exoplayer.a.n(i3, false) && this.D && z7 && rVar5.j != -1 && (i14 & i3) != 0) ? 2 : 1;
        }
        this.Q = i15;
    }

    public static int e(n nVar, n nVar2) {
        y yVarC = y.a.c(nVar.E, nVar2.E);
        Integer numValueOf = Integer.valueOf(nVar.J);
        Integer numValueOf2 = Integer.valueOf(nVar2.J);
        y0 y0Var = y0.z;
        return yVarC.b(numValueOf, numValueOf2, y0Var).a(nVar.K, nVar2.K).a(nVar.L, nVar2.L).b(Integer.valueOf(nVar.M), Integer.valueOf(nVar2.M), y0Var).c(nVar.N, nVar2.N).a(nVar.O, nVar2.O).c(nVar.F, nVar2.F).c(nVar.B, nVar2.B).c(nVar.D, nVar2.D).b(Integer.valueOf(nVar.I), Integer.valueOf(nVar2.I), y0Var).c(nVar.R, nVar2.R).c(nVar.T, nVar2.T).e();
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final int a() {
        return this.Q;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final boolean d(m mVar) {
        n nVar = (n) mVar;
        if (!this.P && !Objects.equals(this.W, nVar.W)) {
            return false;
        }
        this.C.getClass();
        return this.R == nVar.R && this.T == nVar.T;
    }
}
