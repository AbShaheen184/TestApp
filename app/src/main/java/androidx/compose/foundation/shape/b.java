package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public final float a;

    public b(float f) {
        this.a = f;
    }

    @Override // androidx.compose.foundation.shape.a
    public final float a(long j, androidx.compose.ui.unit.c cVar) {
        return cVar.V(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.d(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
