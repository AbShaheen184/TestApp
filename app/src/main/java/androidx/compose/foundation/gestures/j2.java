package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements p1 {
    public final /* synthetic */ m2 a;
    public final /* synthetic */ l2 b;

    public j2(m2 m2Var, l2 l2Var) {
        this.a = m2Var;
        this.b = l2Var;
    }

    @Override // androidx.compose.foundation.gestures.p1
    public final float a(float f) {
        float fAbs = Math.abs(f);
        m2 m2Var = this.a;
        if (fAbs != 0.0f && !((Boolean) m2Var.h.invoke()).booleanValue()) {
            throw new androidx.compose.foundation.j1("The fling animation was cancelled", 0);
        }
        return m2Var.d(m2Var.g(this.b.a(2, m2Var.e(m2Var.h(f)))));
    }
}
