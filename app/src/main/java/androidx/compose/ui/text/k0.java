package androidx.compose.ui.text;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final e0 a;
    public final e0 b;
    public final e0 c;
    public final e0 d;

    public k0(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4) {
        this.a = e0Var;
        this.b = e0Var2;
        this.c = e0Var3;
        this.d = e0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.l.a(this.a, k0Var.a) && kotlin.jvm.internal.l.a(this.b, k0Var.b) && kotlin.jvm.internal.l.a(this.c, k0Var.c) && kotlin.jvm.internal.l.a(this.d, k0Var.d);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        int iHashCode = (e0Var != null ? e0Var.hashCode() : 0) * 31;
        e0 e0Var2 = this.b;
        int iHashCode2 = (iHashCode + (e0Var2 != null ? e0Var2.hashCode() : 0)) * 31;
        e0 e0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (e0Var3 != null ? e0Var3.hashCode() : 0)) * 31;
        e0 e0Var4 = this.d;
        return iHashCode3 + (e0Var4 != null ? e0Var4.hashCode() : 0);
    }
}
