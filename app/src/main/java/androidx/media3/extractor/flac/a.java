package androidx.media3.extractor.flac;

import androidx.media3.common.util.w;
import androidx.media3.extractor.h;
import androidx.media3.extractor.i;
import androidx.media3.extractor.o;
import androidx.media3.extractor.r;
import androidx.media3.extractor.t;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    public final t e;
    public final int y;
    public final r z = new r();

    public a(t tVar, int i) {
        this.e = tVar;
        this.y = i;
    }

    @Override // androidx.media3.extractor.i
    public final h a(o oVar, long j) {
        long position = oVar.getPosition();
        long jB = b(oVar);
        long jF = oVar.f();
        oVar.h(Math.max(6, this.e.c));
        long jB2 = b(oVar);
        long jF2 = oVar.f();
        if (jB > j || jB2 <= j) {
            return jB2 <= j ? new h(jB2, jF2, -2) : new h(jB, position, -1);
        }
        return new h(-9223372036854775807L, jF, 0);
    }

    public final long b(o oVar) {
        r rVar;
        t tVar;
        int iJ;
        while (true) {
            long jF = oVar.f();
            long length = oVar.getLength() - 6;
            rVar = this.z;
            tVar = this.e;
            if (jF >= length) {
                break;
            }
            long jF2 = oVar.f();
            w wVar = new w(17);
            int i = 0;
            boolean zA = false;
            oVar.x(wVar.a, 0, 2);
            char cG = wVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.y;
            if (cG != i2) {
                oVar.n();
                oVar.h((int) (jF2 - oVar.getPosition()));
            } else {
                byte[] bArr = wVar.a;
                while (i < 15 && (iJ = oVar.j(bArr, 2 + i, 15 - i)) != -1) {
                    i += iJ;
                }
                wVar.L(i + 2);
                oVar.n();
                oVar.h((int) (jF2 - oVar.getPosition()));
                zA = androidx.media3.extractor.b.a(wVar, tVar, i2, rVar);
            }
            if (zA) {
                break;
            }
            oVar.h(1);
        }
        if (oVar.f() < oVar.getLength() - 6) {
            return rVar.a;
        }
        oVar.h((int) (oVar.getLength() - oVar.f()));
        return tVar.j;
    }
}
