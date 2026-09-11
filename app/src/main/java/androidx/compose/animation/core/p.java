package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends s {
    public float a;
    public float b;

    public p(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // androidx.compose.animation.core.s
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // androidx.compose.animation.core.s
    public final int b() {
        return 2;
    }

    @Override // androidx.compose.animation.core.s
    public final s c() {
        return new p(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.s
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.a == this.a && pVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
