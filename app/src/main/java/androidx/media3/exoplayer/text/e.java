package androidx.media3.exoplayer.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.activity.y;
import androidx.media3.common.i0;
import androidx.media3.common.p;
import androidx.media3.common.r;
import androidx.media3.exoplayer.c0;
import androidx.media3.exoplayer.dash.manifest.t;
import androidx.media3.exoplayer.source.v;
import androidx.media3.exoplayer.source.w0;
import androidx.media3.exoplayer.x;
import androidx.media3.extractor.text.cea.f;
import androidx.media3.extractor.text.i;
import androidx.media3.extractor.text.l;
import com.google.android.gms.common.internal.k;
import com.google.android.material.shape.g;
import com.google.common.collect.a1;
import com.google.common.collect.d0;
import com.google.common.collect.h0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.media3.exoplayer.a implements Handler.Callback {
    public final g P;
    public final androidx.media3.decoder.e Q;
    public a R;
    public final d S;
    public boolean T;
    public int U;
    public androidx.media3.extractor.text.e V;
    public i W;
    public androidx.media3.extractor.text.c X;
    public androidx.media3.extractor.text.c Y;
    public int Z;
    public final Handler a0;
    public final x b0;
    public final androidx.media3.common.util.b c0;
    public boolean d0;
    public boolean e0;
    public r f0;
    public long g0;
    public long h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar, Looper looper) {
        super(3);
        t tVar = d.d;
        this.b0 = xVar;
        this.a0 = new Handler(looper, this);
        this.S = tVar;
        this.P = new g();
        this.Q = new androidx.media3.decoder.e(1);
        this.c0 = new androidx.media3.common.util.b(8, false);
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        this.i0 = false;
    }

    @Override // androidx.media3.exoplayer.a
    public final int D(r rVar) {
        boolean zEquals = Objects.equals(rVar.o, "application/x-media3-cues");
        String str = rVar.o;
        if (!zEquals) {
            t tVar = (t) this.S;
            tVar.getClass();
            if (!((k) tVar.y).r(rVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return i0.n(str) ? androidx.media3.exoplayer.a.f(1, 0, 0, 0) : androidx.media3.exoplayer.a.f(0, 0, 0, 0);
            }
        }
        return androidx.media3.exoplayer.a.f(rVar.P == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void G() {
        boolean z = this.i0 || Objects.equals(this.f0.o, "application/cea-608") || Objects.equals(this.f0.o, "application/x-mp4-cea-608") || Objects.equals(this.f0.o, "application/cea-708");
        String str = this.f0.o;
        if (z) {
            return;
        }
        net.luminis.tls.engine.impl.c.r(com.google.android.material.resources.b.p("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final long H() {
        if (this.Z == -1) {
            return Long.MAX_VALUE;
        }
        this.X.getClass();
        if (this.Z >= this.X.k()) {
            return Long.MAX_VALUE;
        }
        return this.X.f(this.Z);
    }

    public final long I(long j) {
        com.google.android.material.motion.a.q(j != -9223372036854775807L);
        return j - this.H;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void J() {
        androidx.media3.extractor.text.e bVar;
        byte b = 1;
        this.T = true;
        r rVar = this.f0;
        rVar.getClass();
        k kVar = (k) ((t) this.S).y;
        String str = rVar.o;
        int i = rVar.L;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    bVar = new androidx.media3.extractor.text.cea.c(str, i);
                    break;
                case 2:
                    bVar = new f(i, rVar.r);
                    break;
                default:
                    if (kVar.r(rVar)) {
                        net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    l lVarP = kVar.p(rVar);
                    lVarP.getClass().getSimpleName().concat("Decoder");
                    bVar = new b(lVarP);
                    break;
                    break;
            }
        } else if (kVar.r(rVar)) {
            net.luminis.tls.engine.impl.c.o(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            l lVarP2 = kVar.p(rVar);
            lVarP2.getClass().getSimpleName().concat("Decoder");
            bVar = new b(lVarP2);
        }
        this.V = bVar;
        bVar.a(this.I);
    }

    public final void K(androidx.media3.common.text.c cVar) {
        a1 a1Var = cVar.a;
        x xVar = this.b0;
        xVar.e.m.e(27, new y(a1Var, 11));
        c0 c0Var = xVar.e;
        c0Var.d0 = cVar;
        c0Var.m.e(27, new y(cVar, 8));
    }

    public final void L() {
        this.W = null;
        this.Z = -1;
        androidx.media3.extractor.text.c cVar = this.X;
        if (cVar != null) {
            cVar.p();
            this.X = null;
        }
        androidx.media3.extractor.text.c cVar2 = this.Y;
        if (cVar2 != null) {
            cVar2.p();
            this.Y = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((androidx.media3.common.text.c) message.obj);
            return true;
        }
        org.mozilla.javascript.c.a();
        return false;
    }

    @Override // androidx.media3.exoplayer.a
    public final String k() {
        return "TextRenderer";
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean m() {
        return this.e0;
    }

    @Override // androidx.media3.exoplayer.a
    public final boolean o() {
        r rVar = this.f0;
        if (rVar != null) {
            if (Objects.equals(rVar.o, "application/x-media3-cues")) {
                a aVar = this.R;
                aVar.getClass();
                if (aVar.a(this.g0) == Long.MIN_VALUE) {
                    try {
                        w0 w0Var = this.F;
                        w0Var.getClass();
                        w0Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.e0) {
                    return false;
                }
                if (this.d0) {
                    androidx.media3.extractor.text.c cVar = this.X;
                    long j = this.g0;
                    if (cVar == null || cVar.k() <= 0 || cVar.f(cVar.k() - 1) <= j) {
                        androidx.media3.extractor.text.c cVar2 = this.Y;
                        long j2 = this.g0;
                        if ((cVar2 == null || cVar2.k() <= 0 || cVar2.f(cVar2.k() - 1) <= j2) && this.W != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.a
    public final void p() {
        this.f0 = null;
        this.h0 = -9223372036854775807L;
        a1 a1Var = a1.B;
        I(this.g0);
        androidx.media3.common.text.c cVar = new androidx.media3.common.text.c(a1Var);
        Handler handler = this.a0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            K(cVar);
        }
        this.g0 = -9223372036854775807L;
        if (this.V != null) {
            L();
            androidx.media3.extractor.text.e eVar = this.V;
            eVar.getClass();
            eVar.release();
            this.V = null;
            this.U = 0;
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void r(long j, boolean z, boolean z2) {
        this.g0 = j;
        a aVar = this.R;
        if (aVar != null) {
            aVar.clear();
        }
        a1 a1Var = a1.B;
        I(this.g0);
        androidx.media3.common.text.c cVar = new androidx.media3.common.text.c(a1Var);
        Handler handler = this.a0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            K(cVar);
        }
        this.d0 = false;
        this.e0 = false;
        this.h0 = -9223372036854775807L;
        r rVar = this.f0;
        if (rVar == null || Objects.equals(rVar.o, "application/x-media3-cues")) {
            return;
        }
        if (this.U == 0) {
            L();
            androidx.media3.extractor.text.e eVar = this.V;
            eVar.getClass();
            eVar.flush();
            eVar.a(this.I);
            return;
        }
        L();
        androidx.media3.extractor.text.e eVar2 = this.V;
        eVar2.getClass();
        eVar2.release();
        this.V = null;
        this.U = 0;
        J();
    }

    @Override // androidx.media3.exoplayer.a
    public final void w(r[] rVarArr, long j, long j2, v vVar) {
        r rVar = rVarArr[0];
        this.f0 = rVar;
        if (Objects.equals(rVar.o, "application/x-media3-cues")) {
            this.R = this.f0.M == 1 ? new c() : new androidx.compose.ui.graphics.vector.g(2);
            return;
        }
        G();
        if (this.V != null) {
            this.U = 1;
        } else {
            J();
        }
    }

    @Override // androidx.media3.exoplayer.a
    public final void z(long j, long j2) {
        boolean z;
        androidx.media3.common.util.b bVar;
        boolean z2;
        long jF;
        if (this.K) {
            long j3 = this.h0;
            if (j3 != -9223372036854775807L && j >= j3) {
                L();
                this.e0 = true;
            }
        }
        if (this.e0) {
            return;
        }
        r rVar = this.f0;
        rVar.getClass();
        boolean zEquals = Objects.equals(rVar.o, "application/x-media3-cues");
        Handler handler = this.a0;
        androidx.media3.common.util.b bVar2 = this.c0;
        boolean zC = false;
        zC = false;
        zC = false;
        if (zEquals) {
            this.R.getClass();
            if (!this.d0) {
                androidx.media3.decoder.e eVar = this.Q;
                if (y(bVar2, eVar, 0) == -4) {
                    if (eVar.g(4)) {
                        this.d0 = true;
                    } else {
                        eVar.r();
                        ByteBuffer byteBuffer = eVar.B;
                        byteBuffer.getClass();
                        long j4 = eVar.D;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.P.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        p pVar = new p(12);
                        d0 d0VarK = h0.k();
                        for (int i = 0; i < parcelableArrayList.size(); i++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                            bundle2.getClass();
                            d0VarK.b(pVar.apply(bundle2));
                        }
                        androidx.media3.extractor.text.a aVar = new androidx.media3.extractor.text.a(j4, bundle.getLong("d"), d0VarK.g());
                        eVar.o();
                        zC = this.R.c(aVar, j);
                    }
                }
            }
            long jA = this.R.a(this.g0);
            if (jA == Long.MIN_VALUE && this.d0 && !zC) {
                this.e0 = true;
            }
            if (jA != Long.MIN_VALUE && jA <= j) {
                zC = true;
            }
            if (zC) {
                h0 h0VarB = this.R.b(j);
                long jD = this.R.d(j);
                I(jD);
                androidx.media3.common.text.c cVar = new androidx.media3.common.text.c(h0VarB);
                if (handler != null) {
                    handler.obtainMessage(1, cVar).sendToTarget();
                } else {
                    K(cVar);
                }
                this.R.e(jD);
            }
            this.g0 = j;
            return;
        }
        G();
        this.g0 = j;
        if (this.Y == null) {
            androidx.media3.extractor.text.e eVar2 = this.V;
            eVar2.getClass();
            eVar2.b(j);
            try {
                androidx.media3.extractor.text.e eVar3 = this.V;
                eVar3.getClass();
                this.Y = (androidx.media3.extractor.text.c) eVar3.c();
            } catch (androidx.media3.extractor.text.f e) {
                androidx.media3.common.util.c.g("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f0, e);
                a1 a1Var = a1.B;
                I(this.g0);
                androidx.media3.common.text.c cVar2 = new androidx.media3.common.text.c(a1Var);
                if (handler != null) {
                    handler.obtainMessage(1, cVar2).sendToTarget();
                } else {
                    K(cVar2);
                }
                L();
                androidx.media3.extractor.text.e eVar4 = this.V;
                eVar4.getClass();
                eVar4.release();
                this.V = null;
                this.U = 0;
                J();
                return;
            }
        }
        if (this.E != 2) {
            return;
        }
        if (this.X != null) {
            long jH = H();
            z = false;
            while (jH <= j) {
                this.Z++;
                jH = H();
                z = true;
            }
        } else {
            z = false;
        }
        androidx.media3.extractor.text.c cVar3 = this.Y;
        if (cVar3 == null) {
            bVar = bVar2;
            z2 = z;
        } else if (cVar3.g(4)) {
            if (!z && H() == Long.MAX_VALUE) {
                if (this.U == 2) {
                    L();
                    androidx.media3.extractor.text.e eVar5 = this.V;
                    eVar5.getClass();
                    eVar5.release();
                    this.V = null;
                    this.U = 0;
                    J();
                } else {
                    L();
                    this.e0 = true;
                }
            }
            bVar = bVar2;
            z2 = z;
        } else {
            bVar = bVar2;
            if (cVar3.z <= j) {
                androidx.media3.extractor.text.c cVar4 = this.X;
                if (cVar4 != null) {
                    z2 = z;
                    cVar4.p();
                }
                z2 = z;
                this.Z = cVar3.e(j);
                this.X = cVar3;
                this.Y = null;
                z2 = true;
            }
        }
        if (z2) {
            this.X.getClass();
            int iE = this.X.e(j);
            if (iE == 0 || this.X.k() == 0) {
                jF = this.X.z;
            } else {
                androidx.media3.extractor.text.c cVar5 = this.X;
                jF = iE == -1 ? cVar5.f(cVar5.k() - 1) : cVar5.f(iE - 1);
            }
            I(jF);
            androidx.media3.common.text.c cVar6 = new androidx.media3.common.text.c(this.X.j(j));
            if (handler != null) {
                handler.obtainMessage(1, cVar6).sendToTarget();
            } else {
                K(cVar6);
            }
        }
        if (this.U == 2) {
            return;
        }
        while (!this.d0) {
            try {
                i iVar = this.W;
                if (iVar == null) {
                    androidx.media3.extractor.text.e eVar6 = this.V;
                    eVar6.getClass();
                    iVar = (i) eVar6.d();
                    if (iVar == null) {
                        return;
                    } else {
                        this.W = iVar;
                    }
                }
                if (this.U == 1) {
                    iVar.y = 4;
                    androidx.media3.extractor.text.e eVar7 = this.V;
                    eVar7.getClass();
                    eVar7.e(iVar);
                    this.W = null;
                    this.U = 2;
                    return;
                }
                int iY = y(bVar, iVar, 0);
                if (iY == -4) {
                    if (iVar.g(4)) {
                        this.d0 = true;
                        this.T = false;
                    } else {
                        r rVar2 = (r) bVar.z;
                        if (rVar2 == null) {
                            return;
                        }
                        iVar.G = rVar2.t;
                        iVar.r();
                        this.T &= !iVar.g(1);
                    }
                    if (!this.T) {
                        androidx.media3.extractor.text.e eVar8 = this.V;
                        eVar8.getClass();
                        eVar8.e(iVar);
                        this.W = null;
                    }
                } else if (iY == -3) {
                    return;
                }
            } catch (androidx.media3.extractor.text.f e2) {
                androidx.media3.common.util.c.g("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f0, e2);
                a1 a1Var2 = a1.B;
                I(this.g0);
                androidx.media3.common.text.c cVar7 = new androidx.media3.common.text.c(a1Var2);
                if (handler != null) {
                    handler.obtainMessage(1, cVar7).sendToTarget();
                } else {
                    K(cVar7);
                }
                L();
                androidx.media3.extractor.text.e eVar9 = this.V;
                eVar9.getClass();
                eVar9.release();
                this.V = null;
                this.U = 0;
                J();
                return;
            }
        }
    }
}
