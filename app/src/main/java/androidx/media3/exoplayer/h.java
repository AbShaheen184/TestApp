package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements o0 {
    public o0 A;
    public boolean B = true;
    public boolean C;
    public final l1 e;
    public final k0 y;
    public a z;

    public h(k0 k0Var, androidx.media3.common.util.e0 e0Var) {
        this.y = k0Var;
        this.e = new l1(e0Var);
    }

    @Override // androidx.media3.exoplayer.o0
    public final void a(androidx.media3.common.l0 l0Var) {
        o0 o0Var = this.A;
        if (o0Var != null) {
            o0Var.a(l0Var);
            l0Var = this.A.e();
        }
        this.e.a(l0Var);
    }

    @Override // androidx.media3.exoplayer.o0
    public final long b() {
        if (this.B) {
            return this.e.b();
        }
        o0 o0Var = this.A;
        o0Var.getClass();
        return o0Var.b();
    }

    @Override // androidx.media3.exoplayer.o0
    public final boolean c() {
        if (this.B) {
            this.e.getClass();
            return false;
        }
        o0 o0Var = this.A;
        o0Var.getClass();
        return o0Var.c();
    }

    public final void d(a aVar) {
        o0 o0Var;
        o0 o0VarJ = aVar.j();
        if (o0VarJ == null || o0VarJ == (o0Var = this.A)) {
            return;
        }
        if (o0Var != null) {
            throw new j(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.A = o0VarJ;
        this.z = aVar;
        ((androidx.media3.exoplayer.audio.q0) o0VarJ).a((androidx.media3.common.l0) this.e.B);
    }

    @Override // androidx.media3.exoplayer.o0
    public final androidx.media3.common.l0 e() {
        o0 o0Var = this.A;
        return o0Var != null ? o0Var.e() : (androidx.media3.common.l0) this.e.B;
    }
}
