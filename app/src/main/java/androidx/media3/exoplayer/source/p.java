package androidx.media3.exoplayer.source;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends l {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public p(androidx.media3.common.v0 v0Var, Object obj, Object obj2) {
        super(v0Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // androidx.media3.exoplayer.source.l, androidx.media3.common.v0
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // androidx.media3.exoplayer.source.l, androidx.media3.common.v0
    public final androidx.media3.common.t0 f(int i, androidx.media3.common.t0 t0Var, boolean z) {
        this.b.f(i, t0Var, z);
        if (Objects.equals(t0Var.b, this.d) && z) {
            t0Var.b = e;
        }
        return t0Var;
    }

    @Override // androidx.media3.exoplayer.source.l, androidx.media3.common.v0
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return Objects.equals(objL, this.d) ? e : objL;
    }

    @Override // androidx.media3.exoplayer.source.l, androidx.media3.common.v0
    public final androidx.media3.common.u0 m(int i, androidx.media3.common.u0 u0Var, long j) {
        this.b.m(i, u0Var, j);
        if (Objects.equals(u0Var.a, this.c)) {
            u0Var.a = androidx.media3.common.u0.q;
        }
        return u0Var;
    }
}
