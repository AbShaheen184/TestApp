package androidx.media3.exoplayer.dash;

import android.os.Handler;
import androidx.appcompat.widget.c2;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.v0;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h0 {
    public final v0 a;
    public final androidx.media3.common.util.b b = new androidx.media3.common.util.b(8, false);
    public final androidx.media3.extractor.metadata.a c = new androidx.media3.extractor.metadata.a(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ q e;

    public p(q qVar, c2 c2Var) {
        this.e = qVar;
        this.a = new v0(c2Var, null, null);
    }

    @Override // androidx.media3.extractor.h0
    public final void b(w wVar, int i, int i2) {
        this.a.b(wVar, i, 0);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) {
        return this.a.c(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void e(r rVar) {
        this.a.e(rVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        long jI;
        long jT;
        this.a.g(j, i, i2, i3, g0Var);
        while (this.a.z(false)) {
            androidx.media3.extractor.metadata.a aVar = this.c;
            aVar.o();
            if (this.a.E(this.b, aVar, 0, false) == -4) {
                aVar.r();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j2 = aVar.D;
                androidx.media3.common.h0 h0VarI = this.e.z.i(aVar);
                if (h0VarI != null) {
                    androidx.media3.extractor.metadata.emsg.a aVar2 = (androidx.media3.extractor.metadata.emsg.a) h0VarI.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jT = j0.T(j0.r(aVar2.e));
                        } catch (androidx.media3.common.j0 unused) {
                            jT = -9223372036854775807L;
                        }
                        if (jT != -9223372036854775807L) {
                            o oVar = new o(j2, jT);
                            Handler handler = this.e.A;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        v0 v0Var = this.a;
        s0 s0Var = v0Var.a;
        synchronized (v0Var) {
            int i4 = v0Var.s;
            jI = i4 == 0 ? -1L : v0Var.i(i4);
        }
        s0Var.a(jI);
    }
}
