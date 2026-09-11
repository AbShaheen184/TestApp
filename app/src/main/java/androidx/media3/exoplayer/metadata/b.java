package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.activity.y;
import androidx.media3.common.e0;
import androidx.media3.common.f0;
import androidx.media3.common.g0;
import androidx.media3.common.h0;
import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.p;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.source.v;
import androidx.media3.exoplayer.x;
import com.google.android.gms.dynamite.g;
import java.util.ArrayList;
import org.mozilla.javascript.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.media3.exoplayer.a implements Handler.Callback {
    public final a P;
    public final x Q;
    public final Handler R;
    public final androidx.media3.extractor.metadata.a S;
    public g T;
    public boolean U;
    public boolean V;
    public long W;
    public h0 X;
    public long Y;

    public b(x xVar, Looper looper) {
        super(5);
        this.Q = xVar;
        this.R = looper == null ? null : new Handler(looper, this);
        this.P = a.a;
        this.S = new androidx.media3.extractor.metadata.a(1);
        this.Y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(r rVar) {
        if (this.P.b(rVar)) {
            return androidx.media3.exoplayer.a.f(rVar.P == 0 ? 4 : 2, 0, 0, 0);
        }
        return androidx.media3.exoplayer.a.f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public final void G(h0 h0Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            g0[] g0VarArr = h0Var.a;
            if (i >= g0VarArr.length) {
                return;
            }
            r rVarA = g0VarArr[i].a();
            if (rVarA != null) {
                a aVar = this.P;
                if (aVar.b(rVarA)) {
                    g gVarA = aVar.a(rVarA);
                    byte[] bArrC = g0VarArr[i].c();
                    bArrC.getClass();
                    androidx.media3.extractor.metadata.a aVar2 = this.S;
                    aVar2.o();
                    aVar2.q(bArrC.length);
                    aVar2.B.put(bArrC);
                    aVar2.r();
                    h0 h0VarI = gVarA.i(aVar2);
                    if (h0VarI != null) {
                        G(h0VarI, arrayList);
                    }
                } else {
                    arrayList.add(g0VarArr[i]);
                }
            } else {
                arrayList.add(g0VarArr[i]);
            }
            i++;
        }
    }

    public final long H(long j) {
        com.google.android.material.motion.a.q(j != -9223372036854775807L);
        com.google.android.material.motion.a.q(this.Y != -9223372036854775807L);
        return j - this.Y;
    }

    public final void I(h0 h0Var) {
        x xVar = this.Q;
        c0 c0Var = xVar.e;
        f0 f0Var = c0Var.m0;
        p pVar = c0Var.m;
        e0 e0VarA = f0Var.a();
        int i = 0;
        while (true) {
            g0[] g0VarArr = h0Var.a;
            if (i >= g0VarArr.length) {
                break;
            }
            g0VarArr[i].b(e0VarA);
            i++;
        }
        c0Var.m0 = new f0(e0VarA);
        f0 f0VarA = c0Var.a();
        if (!f0VarA.equals(c0Var.S)) {
            c0Var.S = f0VarA;
            pVar.c(14, new y(xVar, 9));
        }
        pVar.c(28, new y(h0Var, 10));
        pVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            I((h0) message.obj);
            return true;
        }
        c.a();
        return false;
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        return this.V;
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void p() {
        this.X = null;
        this.T = null;
        this.Y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) {
        this.X = null;
        this.U = false;
        this.V = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final void w(r[] rVarArr, long j, long j2, v vVar) {
        this.T = this.P.a(rVarArr[0]);
        h0 h0Var = this.X;
        if (h0Var != null) {
            long j3 = h0Var.b;
            long j4 = (this.Y + j3) - j2;
            if (j3 != j4) {
                h0Var = new h0(j4, h0Var.a);
            }
            this.X = h0Var;
        }
        this.Y = j2;
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.U && this.X == null) {
                androidx.media3.extractor.metadata.a aVar = this.S;
                aVar.o();
                androidx.media3.common.util.b bVar = this.z;
                bVar.o();
                int iY = y(bVar, aVar, 0);
                if (iY == -4) {
                    if (aVar.g(4)) {
                        this.U = true;
                    } else if (aVar.D >= this.I) {
                        aVar.G = this.W;
                        aVar.r();
                        g gVar = this.T;
                        String str = j0.a;
                        h0 h0VarI = gVar.i(aVar);
                        if (h0VarI != null) {
                            ArrayList arrayList = new ArrayList(h0VarI.a.length);
                            G(h0VarI, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.X = new h0(H(aVar.D), (g0[]) arrayList.toArray(new g0[0]));
                            }
                        }
                    }
                } else if (iY == -5) {
                    r rVar = (r) bVar.z;
                    rVar.getClass();
                    this.W = rVar.t;
                }
            }
            h0 h0Var = this.X;
            if (h0Var == null || h0Var.b > H(j)) {
                z = false;
            } else {
                h0 h0Var2 = this.X;
                Handler handler = this.R;
                if (handler != null) {
                    handler.obtainMessage(1, h0Var2).sendToTarget();
                } else {
                    I(h0Var2);
                }
                this.X = null;
                z = true;
            }
            if (this.U && this.X == null) {
                this.V = true;
            }
        }
    }
}
