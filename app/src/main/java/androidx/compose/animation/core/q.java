package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    public float a;
    public float b;
    public float c;

    public q(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // androidx.compose.animation.core.s
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // androidx.compose.animation.core.s
    public final int b() {
        return 3;
    }

    @Override // androidx.compose.animation.core.s
    public final s c() {
        return new q(0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.s
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // androidx.compose.animation.core.s
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.a == this.a && qVar.b == this.b && qVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
