package androidx.compose.ui.spatial;

import androidx.activity.compose.h;
import androidx.collection.z;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.platform.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final androidx.compose.foundation.lazy.layout.e b;
    public final h c;
    public d d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ e h;

    public d(e eVar, int i, androidx.compose.foundation.lazy.layout.e eVar2, h hVar) {
        this.h = eVar;
        this.a = i;
        this.b = eVar2;
        this.c = hVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        c cVar;
        c cVar2;
        long j5 = this.h.f;
        androidx.compose.foundation.lazy.layout.e eVar = this.b;
        d1 d1VarR = k.r(eVar, 2);
        f0 f0VarT = k.t(eVar);
        boolean zI = f0VarT.I();
        a1 a1Var = f0VarT.d0;
        if (zI) {
            if (((d1) a1Var.e) != d1VarR) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = d1VarR.z;
                d1 d1Var = (d1) a1Var.e;
                d1Var.getClass();
                long jI = android.support.v4.media.session.b.I(d1Var.D(d1VarR, jFloatToRawIntBits));
                cVar = new c(jI, (4294967295L & ((long) (((int) (jI & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jI >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, eVar);
            } else {
                cVar = new c(j, j2, j3, j4, j5, fArr, eVar);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.h;
        z zVar = eVar.a;
        int i = this.a;
        d dVar = (d) zVar.g(i);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.d;
                this.d = null;
                if (dVar2 == null) {
                    f0 f0VarT = k.t(this.b.e);
                    if (f0VarT.E) {
                        ((u) i0.a(f0VarT)).getRectManager().a.s(f0VarT.y, false);
                        return;
                    }
                    return;
                }
                int iD = zVar.d(i);
                Object[] objArr = zVar.c;
                Object obj = objArr[iD];
                zVar.b[iD] = i;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = zVar.d(i);
            Object[] objArr2 = zVar.c;
            Object obj2 = objArr2[iD2];
            zVar.b[iD2] = i;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.d = this.d;
                    this.d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.b;
        if (dVar4 == this) {
            eVar.b = dVar4.d;
            this.d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.d = dVar4.d;
                }
                this.d = null;
                return;
            }
            dVar5 = dVar4.d;
        }
    }
}
