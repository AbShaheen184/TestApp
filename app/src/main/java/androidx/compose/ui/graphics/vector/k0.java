package androidx.compose.ui.graphics.vector;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {
    public final androidx.compose.ui.graphics.p A;
    public final float B;
    public final androidx.compose.ui.graphics.p C;
    public final float D;
    public final float E;
    public final int F;
    public final int G;
    public final float H;
    public final float I;
    public final float J;
    public final float K;
    public final String e;
    public final List y;
    public final int z;

    public k0(String str, List list, int i, androidx.compose.ui.graphics.p pVar, float f, androidx.compose.ui.graphics.p pVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.y = list;
        this.z = i;
        this.A = pVar;
        this.B = f;
        this.C = pVar2;
        this.D = f2;
        this.E = f3;
        this.F = i2;
        this.G = i3;
        this.H = f4;
        this.I = f5;
        this.J = f6;
        this.K = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.e.equals(k0Var.e) && kotlin.jvm.internal.l.a(this.A, k0Var.A) && this.B == k0Var.B && kotlin.jvm.internal.l.a(this.C, k0Var.C) && this.D == k0Var.D && this.E == k0Var.E && this.F == k0Var.F && this.G == k0Var.G && this.H == k0Var.H && this.I == k0Var.I && this.J == k0Var.J && this.K == k0Var.K && this.z == k0Var.z && kotlin.jvm.internal.l.a(this.y, k0Var.y);
    }

    public final int hashCode() {
        int iHashCode = (this.y.hashCode() + (this.e.hashCode() * 31)) * 31;
        androidx.compose.ui.graphics.p pVar = this.A;
        int iA = androidx.privacysandbox.ads.adservices.java.internal.a.a(this.B, (iHashCode + (pVar != null ? pVar.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.graphics.p pVar2 = this.C;
        return Integer.hashCode(this.z) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.K, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.J, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.I, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.H, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.G, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.F, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.E, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.D, (iA + (pVar2 != null ? pVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
