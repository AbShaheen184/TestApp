package androidx.media3.extractor.ogg;

import androidx.media3.common.util.j0;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.o;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {
    public final i A;
    public int B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final f e;
    public final long y;
    public final long z;

    public b(i iVar, long j, long j2, long j3, long j4, boolean z) {
        com.google.android.material.motion.a.f(j >= 0 && j2 > j);
        this.A = iVar;
        this.y = j;
        this.z = j2;
        if (j3 == j2 - j || z) {
            this.C = j4;
            this.B = 4;
        } else {
            this.B = 0;
        }
        this.e = new f();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    @Override // androidx.media3.extractor.ogg.g
    public final long f(o oVar) throws IOException {
        long j;
        long j2;
        long jK;
        int i = this.B;
        long j3 = this.z;
        f fVar = this.e;
        if (i == 0) {
            j = 0;
            long position = oVar.getPosition();
            this.D = position;
            this.B = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.F == this.G) {
                    jK = -1;
                } else {
                    long position2 = oVar.getPosition();
                    if (fVar.b(oVar, this.G)) {
                        fVar.a(oVar, false);
                        oVar.n();
                        long j5 = this.E;
                        long j6 = fVar.b;
                        long j7 = j5 - j6;
                        j2 = 2;
                        int i2 = fVar.d + fVar.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.G = position2;
                                this.I = j6;
                            } else {
                                this.F = oVar.getPosition() + ((long) i2);
                                this.H = fVar.b;
                            }
                            long j8 = this.G;
                            long j9 = this.F;
                            if (j8 - j9 < 100000) {
                                this.G = j9;
                                jK = j9;
                            } else {
                                long position3 = oVar.getPosition() - (((long) i2) * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.G;
                                long j11 = this.F;
                                jK = j0.k((((j10 - j11) * j7) / (this.I - this.H)) + position3, j11, j10 - 1);
                            }
                        } else {
                            jK = -1;
                        }
                    } else {
                        jK = this.F;
                        if (jK == position2) {
                            net.luminis.tls.engine.impl.c.t("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jK != -1) {
                        return jK;
                    }
                    this.B = 3;
                }
                j2 = 2;
                if (jK != -1) {
                    return jK;
                }
                this.B = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    org.mozilla.javascript.c.a();
                    return 0L;
                }
                j2 = 2;
            }
            while (true) {
                fVar.b(oVar, -1L);
                fVar.a(oVar, false);
                if (fVar.b > this.E) {
                    oVar.n();
                    this.B = 4;
                    return -(this.H + j2);
                }
                oVar.r(fVar.d + fVar.e);
                this.F = oVar.getPosition();
                this.H = fVar.b;
            }
        } else {
            j = 0;
        }
        fVar.a = 0;
        fVar.b = j;
        fVar.c = 0;
        fVar.d = 0;
        fVar.e = 0;
        if (!fVar.b(oVar, -1L)) {
            throw new EOFException();
        }
        fVar.a(oVar, false);
        oVar.r(fVar.d + fVar.e);
        long j12 = fVar.b;
        while ((fVar.a & 4) != 4 && fVar.b(oVar, -1L) && oVar.getPosition() < j3 && fVar.a(oVar, true)) {
            try {
                oVar.r(fVar.d + fVar.e);
                j12 = fVar.b;
            } catch (EOFException unused) {
            }
        }
        this.C = j12;
        this.B = 4;
        return this.D;
    }

    @Override // androidx.media3.extractor.ogg.g
    public final a0 l() {
        if (this.C != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.g
    public final void q(long j) {
        this.E = j0.k(j, 0L, this.C - 1);
        this.B = 2;
        this.F = this.y;
        this.G = this.z;
        this.H = 0L;
        this.I = this.C;
    }
}
