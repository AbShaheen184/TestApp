package androidx.compose.ui.input.indirect;

import androidx.compose.ui.input.pointer.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public boolean i;

    public b(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) u.i(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) androidx.compose.ui.geometry.b.g(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) androidx.compose.ui.geometry.b.g(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + this.i + ')';
    }
}
