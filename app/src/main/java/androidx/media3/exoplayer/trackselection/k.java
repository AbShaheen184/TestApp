package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;
import com.google.common.collect.h0;
import com.google.common.collect.y;
import com.google.common.collect.y0;
import com.google.common.collect.z0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements Comparable {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;

    public k(int i, w0 w0Var, int i2, j jVar, int i3, String str, String str2) {
        int iG;
        super(i, w0Var, i2);
        int i4 = 0;
        this.C = androidx.media3.exoplayer.a.n(i3, false);
        int i5 = this.A.e;
        int i6 = jVar.u;
        h0 h0Var = jVar.r;
        int i7 = i5 & (~i6);
        this.D = (i7 & 1) != 0;
        this.E = (i7 & 2) != 0;
        h0 h0VarS = str2 != null ? h0.s(str2) : h0Var.isEmpty() ? h0.s("") : h0Var;
        int i8 = 0;
        while (true) {
            if (i8 >= h0VarS.size()) {
                iG = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iG = o.g(this.A, (String) h0VarS.get(i8), false);
                if (iG > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.F = i8;
        this.G = iG;
        int i9 = str2 != null ? 1088 : 0;
        int i10 = this.A.f;
        z0 z0Var = o.k;
        int iBitCount = (i10 == 0 || i10 != i9) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        this.H = iBitCount;
        androidx.media3.common.r rVar = this.A;
        this.K = (1088 & rVar.f) != 0;
        int iA = o.a(rVar, jVar.s);
        this.I = iA;
        int iG2 = o.g(this.A, str, o.j(str) == null);
        this.J = iG2;
        boolean z = iG > 0 || (h0Var.isEmpty() && iBitCount > 0) || ((h0Var.isEmpty() && iA != Integer.MAX_VALUE) || this.D || (this.E && iG2 > 0));
        if (androidx.media3.exoplayer.a.n(i3, jVar.C) && z) {
            i4 = 1;
        }
        this.B = i4;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final int a() {
        return this.B;
    }

    @Override // androidx.media3.exoplayer.trackselection.m
    public final /* bridge */ /* synthetic */ boolean d(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        y yVarC = y.a.c(this.C, kVar.C);
        Integer numValueOf = Integer.valueOf(this.F);
        Integer numValueOf2 = Integer.valueOf(kVar.F);
        y0 y0Var = y0.y;
        y0 y0Var2 = y0.z;
        y yVarB = yVarC.b(numValueOf, numValueOf2, y0Var2);
        int i = kVar.G;
        int i2 = this.G;
        y yVarA = yVarB.a(i2, i);
        int i3 = kVar.H;
        int i4 = this.H;
        y yVarC2 = yVarA.a(i4, i3).b(Integer.valueOf(this.I), Integer.valueOf(kVar.I), y0Var2).c(this.D, kVar.D);
        Boolean boolValueOf = Boolean.valueOf(this.E);
        Boolean boolValueOf2 = Boolean.valueOf(kVar.E);
        if (i2 != 0) {
            y0Var = y0Var2;
        }
        y yVarA2 = yVarC2.b(boolValueOf, boolValueOf2, y0Var).a(this.J, kVar.J);
        if (i4 == 0) {
            yVarA2 = yVarA2.d(this.K, kVar.K);
        }
        return yVarA2.e();
    }
}
