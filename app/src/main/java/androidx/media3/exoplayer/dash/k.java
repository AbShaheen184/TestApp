package androidx.media3.exoplayer.dash;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final androidx.media3.exoplayer.source.chunk.e a;
    public final androidx.media3.exoplayer.dash.manifest.m b;
    public final androidx.media3.exoplayer.dash.manifest.b c;
    public final j d;
    public final long e;
    public final long f;

    public k(long j, androidx.media3.exoplayer.dash.manifest.m mVar, androidx.media3.exoplayer.dash.manifest.b bVar, androidx.media3.exoplayer.source.chunk.e eVar, long j2, j jVar) {
        this.e = j;
        this.b = mVar;
        this.c = bVar;
        this.f = j2;
        this.a = eVar;
        this.d = jVar;
    }

    public final k a(long j, androidx.media3.exoplayer.dash.manifest.m mVar) throws androidx.media3.exoplayer.source.b {
        long jS;
        long jS2;
        j jVarC = this.b.c();
        j jVarC2 = mVar.c();
        if (jVarC == null) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC);
        }
        if (!jVarC.w()) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC2);
        }
        long jB = jVarC.B(j);
        if (jB == 0) {
            return new k(j, mVar, this.c, this.a, this.f, jVarC2);
        }
        jVarC2.getClass();
        long jY = jVarC.y();
        long jA = jVarC.a(jY);
        long j2 = jB + jY;
        long j3 = j2 - 1;
        long jL = jVarC.l(j3, j) + jVarC.a(j3);
        long jY2 = jVarC2.y();
        long jA2 = jVarC2.a(jY2);
        long j4 = this.f;
        if (jL != jA2) {
            if (jL < jA2) {
                throw new androidx.media3.exoplayer.source.b();
            }
            if (jA2 < jA) {
                jS2 = j4 - (jVarC2.s(jA, j) - jY);
            } else {
                jS = jVarC.s(jA2, j) - jY2;
            }
            return new k(j, mVar, this.c, this.a, jS2, jVarC2);
        }
        jS = j2 - jY2;
        jS2 = jS + j4;
        return new k(j, mVar, this.c, this.a, jS2, jVarC2);
    }

    public final long b(long j) {
        j jVar = this.d;
        jVar.getClass();
        long j2 = this.e;
        long jM = jVar.m(j2, j) + this.f;
        jVar.getClass();
        return (jVar.D(j2, j) + jM) - 1;
    }

    public final long c() {
        j jVar = this.d;
        jVar.getClass();
        return jVar.B(this.e);
    }

    public final long d(long j) {
        long jE = e(j);
        j jVar = this.d;
        jVar.getClass();
        return jVar.l(j - this.f, this.e) + jE;
    }

    public final long e(long j) {
        j jVar = this.d;
        jVar.getClass();
        return jVar.a(j - this.f);
    }

    public final boolean f(long j, long j2) {
        j jVar = this.d;
        jVar.getClass();
        return jVar.w() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
