package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements y1 {
    public final Object a;
    public final Object b;

    public z1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.compose.animation.core.y1
    public final Object b() {
        return this.a;
    }

    @Override // androidx.compose.animation.core.y1
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.l.a(this.a, y1Var.b()) && kotlin.jvm.internal.l.a(this.b, y1Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
