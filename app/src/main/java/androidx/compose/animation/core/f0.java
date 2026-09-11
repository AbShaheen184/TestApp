package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements m {
    public final y a;
    public final long b;

    public f0(y yVar, long j) {
        this.a = yVar;
        this.b = j;
    }

    @Override // androidx.compose.animation.core.m
    public final m2 a(l2 l2Var) {
        o2 o2VarA = this.a.a(l2Var);
        q2 q2Var = new q2();
        q2Var.z = o2VarA;
        q2Var.e = ((long) (o2VarA.u() + o2VarA.p())) * 1000000;
        q2Var.y = this.b * 1000000;
        return q2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return f0Var.a.equals(this.a) && f0Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + ((w0.e.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
