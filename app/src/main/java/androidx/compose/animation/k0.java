package androidx.compose.animation;

import androidx.compose.animation.core.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final androidx.compose.ui.e a;
    public final kotlin.jvm.functions.l b;
    public final k1 c;

    public k0(androidx.compose.ui.e eVar, kotlin.jvm.functions.l lVar, k1 k1Var) {
        this.a = eVar;
        this.b = lVar;
        this.c = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.l.a(this.a, k0Var.a) && kotlin.jvm.internal.l.a(this.b, k0Var.b) && this.c.equals(k0Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
