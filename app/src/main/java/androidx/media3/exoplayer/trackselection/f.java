package androidx.media3.exoplayer.trackselection;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.util.j0;
import androidx.media3.common.w0;
import androidx.media3.common.y0;
import com.google.common.collect.h0;
import com.google.common.collect.y;
import com.google.common.collect.z0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements Comparable {
    public final int B;
    public final boolean C;
    public final String D;
    public final j E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final int N;
    public final boolean O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final boolean U;
    public final boolean V;

    /* JADX WARN: Code duplicated, block: B:109:0x0179  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    public f(int i, w0 w0Var, int i2, j jVar, int i3, boolean z, androidx.media3.exoplayer.analytics.c cVar, int i4) {
        int i5;
        int iG;
        boolean z2;
        int iG2;
        boolean z3;
        boolean z4;
        boolean z5;
        y0 y0Var;
        super(i, w0Var, i2);
        this.E = jVar;
        boolean z6 = jVar.A;
        h0 h0Var = jVar.p;
        h0 h0Var2 = jVar.l;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.K = false;
        this.D = o.j(this.A.d);
        this.F = androidx.media3.exoplayer.a.n(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= h0Var2.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = o.g(this.A, (String) h0Var2.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.H = i8;
        this.G = iG;
        int i9 = this.A.f;
        this.I = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.J = o.a(this.A, jVar.m);
        androidx.media3.common.r rVar = this.A;
        int i10 = rVar.f;
        this.L = i10 == 0 || (i10 & 1) != 0;
        this.O = (rVar.e & 1) != 0;
        String str = rVar.o;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.V = z2;
        int i11 = rVar.G;
        this.P = i11;
        this.Q = rVar.H;
        int i12 = rVar.j;
        this.R = i12;
        this.C = (i12 == -1 || i12 <= jVar.o) && (i11 == -1 || i11 <= jVar.n) && cVar.mo13apply((Object) rVar);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = j0.R(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 < strArrSplit.length) {
                iG2 = o.g(this.A, strArrSplit[i14], false);
                if (iG2 <= 0) {
                    i14++;
                }
            } else {
                iG2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.M = i14;
        this.N = iG2;
        for (int i15 = 0; i15 < h0Var.size(); i15++) {
            String str2 = this.A.o;
            if (str2 != null && str2.equals(h0Var.get(i15))) {
                i5 = i15;
                this.S = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.T = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.U = z4;
                boolean z7 = this.C;
                j jVar2 = this.E;
                z5 = jVar2.C;
                y0Var = jVar2.q;
                if (androidx.media3.exoplayer.a.n(i3, z5) && (z7 || jVar2.z)) {
                    y0Var.getClass();
                    if (androidx.media3.exoplayer.a.n(i3, false) || !z7 || this.A.j == -1 || ((!jVar2.D && z) || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.B = i7;
            }
        }
        this.S = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.T = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.U = z4;
        boolean z8 = this.C;
        j jVar3 = this.E;
        z5 = jVar3.C;
        y0Var = jVar3.q;
        if (androidx.media3.exoplayer.a.n(i3, z5)) {
            y0Var.getClass();
            if (androidx.media3.exoplayer.a.n(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.B = i7;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final int a() {
        return this.B;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final boolean d(m mVar) {
        int i;
        String str;
        f fVar = (f) mVar;
        androidx.media3.common.r rVar = fVar.A;
        this.E.getClass();
        androidx.media3.common.r rVar2 = this.A;
        int i2 = rVar2.G;
        if (i2 == -1 || i2 != rVar.G) {
            return false;
        }
        return (this.K || ((str = rVar2.o) != null && TextUtils.equals(str, rVar.o))) && (i = rVar2.H) != -1 && i == rVar.H && this.T == fVar.T && this.U == fVar.U;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z = this.F;
        boolean z2 = this.C;
        z0 z0VarA = (z2 && z) ? o.k : o.k.a();
        boolean z3 = fVar.F;
        int i = fVar.R;
        y yVarC = y.a.c(z, z3);
        Integer numValueOf = Integer.valueOf(this.H);
        Integer numValueOf2 = Integer.valueOf(fVar.H);
        com.google.common.collect.y0 y0Var = com.google.common.collect.y0.z;
        y yVarB = yVarC.b(numValueOf, numValueOf2, y0Var).a(this.G, fVar.G).a(this.I, fVar.I).b(Integer.valueOf(this.J), Integer.valueOf(fVar.J), y0Var).c(this.O, fVar.O).c(this.L, fVar.L).b(Integer.valueOf(this.M), Integer.valueOf(fVar.M), y0Var).a(this.N, fVar.N).c(z2, fVar.C).b(Integer.valueOf(this.S), Integer.valueOf(fVar.S), y0Var);
        this.E.getClass();
        y yVarB2 = yVarB.c(this.T, fVar.T).c(this.U, fVar.U).c(this.V, fVar.V).b(Integer.valueOf(this.P), Integer.valueOf(fVar.P), z0VarA).b(Integer.valueOf(this.Q), Integer.valueOf(fVar.Q), z0VarA);
        if (Objects.equals(this.D, fVar.D)) {
            yVarB2 = yVarB2.b(Integer.valueOf(this.R), Integer.valueOf(i), z0VarA);
        }
        return yVarB2.e();
    }
}
