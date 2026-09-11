package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.media3.exoplayer.source.l {
    public final androidx.media3.common.u0 c;

    public f1(androidx.media3.common.v0 v0Var) {
        super(v0Var);
        this.c = new androidx.media3.common.u0();
    }

    @Override // androidx.media3.exoplayer.source.l, androidx.media3.common.v0
    public final androidx.media3.common.t0 f(int i, androidx.media3.common.t0 t0Var, boolean z) {
        androidx.media3.common.v0 v0Var = this.b;
        androidx.media3.common.t0 t0VarF = v0Var.f(i, t0Var, z);
        if (!v0Var.m(t0VarF.c, this.c, 0L).a()) {
            t0VarF.f = true;
            return t0VarF;
        }
        Object obj = t0Var.a;
        Object obj2 = t0Var.b;
        int i2 = t0Var.c;
        long j = t0Var.d;
        long j2 = t0Var.e;
        androidx.media3.common.c cVar = androidx.media3.common.c.c;
        t0VarF.a = obj;
        t0VarF.b = obj2;
        t0VarF.c = i2;
        t0VarF.d = j;
        t0VarF.e = j2;
        t0VarF.g = cVar;
        t0VarF.f = true;
        return t0VarF;
    }
}
