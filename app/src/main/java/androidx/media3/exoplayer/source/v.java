package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public v(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final v a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new v(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a.equals(vVar.a) && this.b == vVar.b && this.c == vVar.c && this.d == vVar.d && this.e == vVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public v(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public v(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public v(Object obj) {
        this(-1L, obj);
    }
}
