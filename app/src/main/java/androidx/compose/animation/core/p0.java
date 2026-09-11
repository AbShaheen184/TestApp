package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j2 {
    public final androidx.compose.runtime.h1 y;
    public final androidx.compose.runtime.h1 z;

    public p0(Object obj) {
        super(0);
        this.y = androidx.compose.runtime.s.r(obj);
        this.z = androidx.compose.runtime.s.r(obj);
    }

    @Override // androidx.compose.animation.core.j2
    public final Object n() {
        return this.y.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final Object p() {
        return this.z.getValue();
    }

    @Override // androidx.compose.animation.core.j2
    public final void s(Object obj) {
        this.y.setValue(obj);
    }

    @Override // androidx.compose.animation.core.j2
    public final void u() {
    }

    @Override // androidx.compose.animation.core.j2
    public final void t(e2 e2Var) {
    }
}
