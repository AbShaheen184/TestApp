package androidx.compose.ui.graphics;

import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends p {
    public final long a;

    public p0(long j) {
        this.a = j;
    }

    @Override // androidx.compose.ui.graphics.p
    public final void a(float f, long j, com.google.android.gms.cloudmessaging.n nVar) {
        nVar.e(1.0f);
        long jB = this.a;
        if (f != 1.0f) {
            jB = t.b(t.d(jB) * f, jB);
        }
        nVar.h(jB);
        if (((Shader) nVar.z) != null) {
            nVar.k(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return t.c(this.a, ((p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = t.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) t.i(this.a)) + ')';
    }
}
