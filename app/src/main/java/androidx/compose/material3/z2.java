package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {
    public final androidx.compose.foundation.shape.d a;
    public final androidx.compose.foundation.shape.d b;
    public final androidx.compose.foundation.shape.d c;
    public final androidx.compose.foundation.shape.d d;
    public final androidx.compose.foundation.shape.d e;
    public final androidx.compose.foundation.shape.d f;
    public final androidx.compose.foundation.shape.d g;
    public final androidx.compose.foundation.shape.d h;

    public z2() {
        androidx.compose.foundation.shape.d dVar = y2.a;
        androidx.compose.foundation.shape.d dVar2 = y2.b;
        androidx.compose.foundation.shape.d dVar3 = y2.c;
        androidx.compose.foundation.shape.d dVar4 = y2.d;
        androidx.compose.foundation.shape.d dVar5 = y2.f;
        androidx.compose.foundation.shape.d dVar6 = y2.e;
        androidx.compose.foundation.shape.d dVar7 = y2.g;
        androidx.compose.foundation.shape.d dVar8 = y2.h;
        this.a = dVar;
        this.b = dVar2;
        this.c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
        this.g = dVar7;
        this.h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return kotlin.jvm.internal.l.a(this.a, z2Var.a) && kotlin.jvm.internal.l.a(this.b, z2Var.b) && kotlin.jvm.internal.l.a(this.c, z2Var.c) && kotlin.jvm.internal.l.a(this.d, z2Var.d) && kotlin.jvm.internal.l.a(this.e, z2Var.e) && kotlin.jvm.internal.l.a(this.f, z2Var.f) && kotlin.jvm.internal.l.a(this.g, z2Var.g) && kotlin.jvm.internal.l.a(this.h, z2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
