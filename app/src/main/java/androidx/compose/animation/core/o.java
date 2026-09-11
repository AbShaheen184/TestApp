package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s {
    public float a;

    public o(float f) {
        this.a = f;
    }

    @Override // androidx.compose.animation.core.s
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public final int b() {
        return 1;
    }

    @Override // androidx.compose.animation.core.s
    public final s c() {
        return new o(0.0f);
    }

    @Override // androidx.compose.animation.core.s
    public final void d() {
        this.a = 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
