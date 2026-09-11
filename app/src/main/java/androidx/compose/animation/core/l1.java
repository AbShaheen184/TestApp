package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements m {
    public final m a;
    public final long b;

    public l1(b0 b0Var, long j) {
        this.a = b0Var;
        this.b = j;
    }

    @Override // androidx.compose.animation.core.m
    public final m2 a(l2 l2Var) {
        return new m1(this.a.a(l2Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return l1Var.b == this.b && kotlin.jvm.internal.l.a(l1Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
