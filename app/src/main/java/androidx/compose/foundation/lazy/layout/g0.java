package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.t2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements t2 {
    public int A;
    public final int e;
    public final int y;
    public final androidx.compose.runtime.h1 z;

    public g0(int i, int i2, int i3) {
        this.e = i2;
        this.y = i3;
        int i4 = (i / i2) * i2;
        this.z = new androidx.compose.runtime.h1(com.google.android.material.resources.c.r(Math.max(i4 - i3, 0), i4 + i2 + i3), androidx.compose.runtime.f.D);
        this.A = i;
    }

    public final void b(int i) {
        if (i != this.A) {
            this.A = i;
            int i2 = this.e;
            int i3 = (i / i2) * i2;
            int i4 = this.y;
            this.z.setValue(com.google.android.material.resources.c.r(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return (kotlin.ranges.d) this.z.getValue();
    }
}
