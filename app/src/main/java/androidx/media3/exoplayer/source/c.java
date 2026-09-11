package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements w0 {
    public final w0 e;
    public boolean y;
    public final /* synthetic */ d z;

    public c(d dVar, w0 w0Var) {
        this.z = dVar;
        this.e = w0Var;
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final boolean a() {
        return !this.z.a() && this.e.a();
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final void b() {
        this.e.b();
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int g(long j) {
        if (this.z.a()) {
            return -3;
        }
        return this.e.g(j);
    }

    @Override // androidx.media3.exoplayer.source.w0
    public final int o(androidx.media3.common.util.b bVar, androidx.media3.decoder.e eVar, int i) {
        d dVar = this.z;
        if (dVar.a()) {
            return -3;
        }
        if (this.y) {
            eVar.y = 4;
            return -4;
        }
        long jT = dVar.t();
        int iO = this.e.o(bVar, eVar, i);
        if (dVar.B != -9223372036854775807L && iO != -3) {
            dVar.B = -9223372036854775807L;
        }
        long j = dVar.C;
        if (iO != -5) {
            if (j == Long.MIN_VALUE || ((iO != -4 || eVar.D < j) && !(iO == -3 && jT == Long.MIN_VALUE && !eVar.C))) {
                return iO;
            }
            eVar.o();
            eVar.y = 4;
            this.y = true;
            return -4;
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.z;
        rVar.getClass();
        int i2 = rVar.K;
        int i3 = rVar.J;
        if (i3 != 0 || i2 != 0) {
            if (j != Long.MIN_VALUE) {
                i2 = 0;
            }
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.I = i3;
            qVarA.J = i2;
            bVar.z = new androidx.media3.common.r(qVarA);
        }
        return -5;
    }
}
