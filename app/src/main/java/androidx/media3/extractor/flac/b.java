package androidx.media3.extractor.flac;

import androidx.media3.extractor.e;
import androidx.media3.extractor.f;
import androidx.media3.extractor.g;
import androidx.media3.extractor.h;
import androidx.media3.extractor.i;
import androidx.media3.extractor.o;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final e a;
    public final i b;
    public f c;
    public final int d;

    public b(g gVar, i iVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = iVar;
        this.d = i;
        this.a = new e(gVar, j, j2, j3, j4, j5);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(o oVar, long j, r rVar) {
        if (j == oVar.getPosition()) {
            return 0;
        }
        rVar.a = j;
        return 1;
    }

    public final int b(o oVar, r rVar) {
        while (true) {
            f fVar = this.c;
            fVar.getClass();
            long j = fVar.f;
            long j2 = fVar.g;
            long j3 = fVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            i iVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                iVar.g();
                return c(oVar, j, rVar);
            }
            long position = j3 - oVar.getPosition();
            if (position < 0 || position > 262144) {
                return c(oVar, j3, rVar);
            }
            oVar.r((int) position);
            oVar.n();
            h hVarA = iVar.a(oVar, fVar.b);
            int i = hVarA.a;
            long j6 = hVarA.b;
            long j7 = hVarA.c;
            if (i == -3) {
                this.c = null;
                iVar.g();
                return c(oVar, j3, rVar);
            }
            if (i == -2) {
                fVar.d = j6;
                fVar.f = j7;
                fVar.h = f.a(fVar.b, j6, fVar.e, j7, fVar.g, fVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        net.luminis.tls.engine.impl.c.r("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - oVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        oVar.r((int) position2);
                    }
                    this.c = null;
                    iVar.g();
                    return c(oVar, j7, rVar);
                }
                fVar.e = j6;
                fVar.g = j7;
                fVar.h = f.a(fVar.b, fVar.d, j6, fVar.f, j7, fVar.c);
            }
        }
    }

    public final void d(long j) {
        f fVar = this.c;
        if (fVar == null || fVar.a != j) {
            e eVar = this.a;
            this.c = new f(j, eVar.a.g(j), eVar.c, eVar.d, eVar.e, eVar.f);
        }
    }
}
