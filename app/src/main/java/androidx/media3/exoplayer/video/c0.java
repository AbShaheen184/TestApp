package androidx.media3.exoplayer.video;

import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.f1;
import androidx.media3.common.i0;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final androidx.media3.common.util.b a;
    public final w b;
    public final v c = new v();
    public final androidx.compose.ui.text.android.selection.e d = new androidx.compose.ui.text.android.selection.e();
    public final androidx.compose.ui.text.android.selection.e e = new androidx.compose.ui.text.android.selection.e();
    public final androidx.compose.ui.text.input.h f;
    public final x g;
    public long h;
    public long i;
    public long j;
    public f1 k;
    public long l;

    public c0(androidx.media3.common.util.b bVar, w wVar, x xVar) {
        this.a = bVar;
        this.b = wVar;
        this.g = xVar;
        androidx.compose.ui.text.input.h hVar = new androidx.compose.ui.text.input.h();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        hVar.y = 0;
        hVar.z = -1;
        hVar.A = 0;
        hVar.C = new long[iHighestOneBit];
        hVar.B = iHighestOneBit - 1;
        this.f = hVar;
        this.h = -9223372036854775807L;
        this.k = f1.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final androidx.media3.common.util.b bVar = this.a;
        c cVar = (c) bVar.z;
        while (true) {
            androidx.compose.ui.text.input.h hVar = this.f;
            int i = hVar.A;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                org.mozilla.javascript.typedarrays.c.a();
                return;
            }
            long j3 = ((long[]) hVar.C)[hVar.y];
            Long l = (Long) this.e.K(j3);
            w wVar = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                wVar.e(2);
            }
            long j4 = this.l;
            w wVar2 = this.b;
            v vVar = this.c;
            int iA = wVar2.a(j3, j, j2, j4, false, false, vVar);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, vVar.a);
            }
            if (iA == 0 || iA == 1) {
                this.i = j3;
                boolean z = iA == 0;
                long jD = hVar.d();
                f1 f1Var = (f1) this.d.K(jD);
                if (f1Var != null && !f1Var.equals(f1.d) && !f1Var.equals(this.k)) {
                    this.k = f1Var;
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    qVar.u = f1Var.a;
                    qVar.v = f1Var.b;
                    qVar.n = i0.p("video/raw");
                    bVar.y = new androidx.media3.common.r(qVar);
                    cVar.i.execute(new androidx.activity.c(25, bVar, f1Var));
                }
                long jNanoTime = z ? System.nanoTime() : vVar.b;
                boolean z2 = wVar.e != 3;
                wVar.e = 3;
                wVar.l.getClass();
                wVar.g = j0.Q(SystemClock.elapsedRealtime());
                if (z2 && cVar.e != null) {
                    final int i2 = 0;
                    cVar.i.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ((c) bVar.z).h.b();
                                    break;
                                default:
                                    ((c) bVar.z).h.c();
                                    break;
                            }
                        }
                    });
                }
                androidx.media3.common.r rVar = (androidx.media3.common.r) bVar.y;
                cVar.j.c(jD, jNanoTime, rVar == null ? new androidx.media3.common.r(new androidx.media3.common.q()) : rVar, null);
                h hVar2 = (h) cVar.d.remove();
                hVar2.c.N0(hVar2.a, hVar2.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = j3;
                hVar.d();
                final int i3 = 1;
                cVar.i.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ((c) bVar.z).h.b();
                                break;
                            default:
                                ((c) bVar.z).h.c();
                                break;
                        }
                    }
                });
                h hVar3 = (h) cVar.d.remove();
                k kVar = hVar3.c;
                androidx.media3.exoplayer.mediacodec.l lVar = hVar3.a;
                int i4 = hVar3.b;
                Trace.beginSection("dropVideoBuffer");
                lVar.g(i4);
                Trace.endSection();
                kVar.S0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    net.luminis.tls.engine.impl.c.r(String.valueOf(iA));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
