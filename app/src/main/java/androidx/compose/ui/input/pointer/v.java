package androidx.compose.ui.input.pointer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public boolean m;
    public boolean n;
    public v o;

    public v(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = 0L;
        this.m = z3;
        this.n = z3;
    }

    public final void a() {
        v vVar = this.o;
        if (vVar == null) {
            this.m = true;
            this.n = true;
        } else if (vVar != null) {
            vVar.a();
        }
    }

    public final boolean b() {
        v vVar = this.o;
        if (vVar != null) {
            return vVar.b();
        }
        return this.m || this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) u.i(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) androidx.compose.ui.geometry.b.g(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) androidx.compose.ui.geometry.b.g(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) d0.a(this.i));
        sb.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = kotlin.collections.u.e;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) androidx.compose.ui.geometry.b.g(this.j));
        sb.append(')');
        return sb.toString();
    }

    public v(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.k = arrayList;
        this.l = j7;
    }
}
