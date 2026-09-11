package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class q3 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final boolean c;
    public final androidx.compose.animation.core.k1 d;

    public q3(androidx.compose.foundation.interaction.k kVar, boolean z, androidx.compose.animation.core.k1 k1Var) {
        this.b = kVar;
        this.c = z;
        this.d = k1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        s3 s3Var = new s3();
        s3Var.L = this.b;
        s3Var.M = this.c;
        s3Var.N = this.d;
        s3Var.R = Float.NaN;
        s3Var.S = Float.NaN;
        return s3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return kotlin.jvm.internal.l.a(this.b, q3Var.b) && this.c == q3Var.c && this.d.equals(q3Var.d);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        s3 s3Var = (s3) qVar;
        s3Var.L = this.b;
        boolean z = s3Var.M;
        boolean z2 = this.c;
        if (z != z2) {
            androidx.compose.ui.node.k.k(s3Var);
        }
        s3Var.M = z2;
        s3Var.N = this.d;
        if (s3Var.Q == null && !Float.isNaN(s3Var.S)) {
            s3Var.Q = androidx.compose.animation.core.e.a(s3Var.S);
        }
        if (s3Var.P != null || Float.isNaN(s3Var.R)) {
            return;
        }
        s3Var.P = androidx.compose.animation.core.e.a(s3Var.R);
    }

    public final int hashCode() {
        return this.d.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ')';
    }
}
