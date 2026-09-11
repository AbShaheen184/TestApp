package androidx.compose.ui.node;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import androidx.appcompat.widget.c2;
import androidx.compose.ui.platform.f3;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 extends n0 implements androidx.compose.ui.layout.p0, androidx.compose.ui.layout.x, n1 {
    public static final androidx.compose.ui.graphics.k0 j0 = new androidx.compose.ui.graphics.k0();
    public static final t k0 = new t();
    public static final float[] l0 = androidx.compose.ui.graphics.f0.a();
    public static final b1 m0 = new b1(0);
    public static final b1 n0 = new b1(1);
    public final f0 L;
    public d1 M;
    public d1 N;
    public boolean O;
    public boolean P;
    public kotlin.jvm.functions.l Q;
    public androidx.compose.ui.unit.c R;
    public androidx.compose.ui.unit.m S;
    public androidx.compose.ui.layout.r0 U;
    public androidx.collection.f0 V;
    public float X;
    public androidx.compose.ui.geometry.a Y;
    public t Z;
    public boolean b0;
    public boolean c0;
    public androidx.compose.ui.graphics.layer.b d0;
    public androidx.compose.ui.graphics.r e0;
    public androidx.compose.ui.contentcapture.e f0;
    public boolean h0;
    public l1 i0;
    public float T = 0.8f;
    public long W = 0;
    public androidx.compose.ui.graphics.n0 a0 = androidx.compose.ui.graphics.a0.b;
    public final c1 g0 = new c1(this, 1);

    public d1(f0 f0Var) {
        this.L = f0Var;
        this.R = f0Var.W;
        this.S = f0Var.X;
    }

    public static d1 n1(androidx.compose.ui.layout.x xVar) {
        d1 d1Var;
        androidx.compose.ui.layout.o0 o0Var = xVar instanceof androidx.compose.ui.layout.o0 ? (androidx.compose.ui.layout.o0) xVar : null;
        if (o0Var != null && (d1Var = o0Var.e.L) != null) {
            return d1Var;
        }
        xVar.getClass();
        return (d1) xVar;
    }

    @Override // androidx.compose.ui.node.n0
    public final f0 A0() {
        return this.L;
    }

    @Override // androidx.compose.ui.node.n0
    public final androidx.compose.ui.layout.r0 B0() {
        androidx.compose.ui.layout.r0 r0Var = this.U;
        if (r0Var != null) {
            return r0Var;
        }
        net.luminis.tls.engine.impl.c.r("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.ui.node.n0
    public final n0 C0() {
        return this.N;
    }

    @Override // androidx.compose.ui.layout.x
    public final long D(androidx.compose.ui.layout.x xVar, long j) {
        if (xVar instanceof androidx.compose.ui.layout.o0) {
            androidx.compose.ui.layout.o0 o0Var = (androidx.compose.ui.layout.o0) xVar;
            o0Var.e.L.c1();
            return o0Var.D(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        d1 d1VarN1 = n1(xVar);
        d1VarN1.c1();
        d1 d1VarP0 = P0(d1VarN1);
        while (d1VarN1 != d1VarP0) {
            l1 l1Var = d1VarN1.i0;
            if (l1Var != null) {
                androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
                float[] fArrB = q1Var.b();
                if (!q1Var.P) {
                    j = androidx.compose.ui.graphics.f0.b(j, fArrB);
                }
            }
            j = android.support.v4.media.session.b.A(j, d1VarN1.W);
            d1VarN1 = d1VarN1.N;
            d1VarN1.getClass();
        }
        return J0(d1VarP0, j);
    }

    @Override // androidx.compose.ui.node.n0
    public final long D0() {
        return this.W;
    }

    @Override // androidx.compose.ui.layout.x
    public final long E(long j) {
        if (!T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((androidx.compose.ui.platform.u) i0.a(this.L)).t(W(j));
    }

    @Override // androidx.compose.ui.layout.x
    public final long H(long j) {
        if (!T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        androidx.compose.ui.layout.x xVarG = androidx.compose.ui.layout.a0.g(this);
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(this.L);
        uVar.E();
        return D(xVarG, androidx.compose.ui.geometry.b.d(androidx.compose.ui.graphics.f0.b(j, uVar.z0), xVarG.W(0L)));
    }

    @Override // androidx.compose.ui.node.n0
    public final void H0() {
        h0(this.W, this.X, this.Q);
    }

    public final void I0(d1 d1Var, androidx.compose.ui.geometry.a aVar, boolean z) {
        if (d1Var == this) {
            return;
        }
        d1 d1Var2 = this.N;
        if (d1Var2 != null) {
            d1Var2.I0(d1Var, aVar, z);
        }
        long j = this.W;
        float f = (int) (j >> 32);
        aVar.b -= f;
        aVar.d -= f;
        float f2 = (int) (j & 4294967295L);
        aVar.c -= f2;
        aVar.e -= f2;
        l1 l1Var = this.i0;
        if (l1Var != null) {
            androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
            float[] fArrA = q1Var.a();
            if (!q1Var.P) {
                if (fArrA == null) {
                    aVar.b = 0.0f;
                    aVar.c = 0.0f;
                    aVar.d = 0.0f;
                    aVar.e = 0.0f;
                } else {
                    androidx.compose.ui.graphics.f0.c(fArrA, aVar);
                }
            }
            if (this.P && z) {
                long j2 = this.z;
                aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // androidx.compose.ui.layout.x
    public final void J(androidx.compose.ui.layout.x xVar, float[] fArr) {
        d1 d1VarN1 = n1(xVar);
        d1VarN1.c1();
        d1 d1VarP0 = P0(d1VarN1);
        androidx.compose.ui.graphics.f0.d(fArr);
        d1VarN1.q1(d1VarP0, fArr);
        p1(d1VarP0, fArr);
    }

    public final long J0(d1 d1Var, long j) {
        if (d1Var == this) {
            return j;
        }
        d1 d1Var2 = this.N;
        return (d1Var2 == null || kotlin.jvm.internal.l.a(d1Var, d1Var2)) ? Q0(j) : Q0(d1Var2.J0(d1Var, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // androidx.compose.ui.layout.c1, androidx.compose.ui.layout.p0
    public final Object K() {
        f0 f0Var = this.L;
        if (!f0Var.d0.f(64)) {
            return null;
        }
        T0();
        Object objW0 = null;
        for (androidx.compose.ui.q qVar = (w1) f0Var.d0.f; qVar != null; qVar = qVar.B) {
            if ((qVar.z & 64) != 0) {
                ?? E = qVar;
                ?? bVar = 0;
                while (E != 0) {
                    if (E instanceof p1) {
                        objW0 = ((p1) E).w0(objW0);
                    } else if ((E.z & 64) != 0 && (E instanceof j)) {
                        androidx.compose.ui.q qVar2 = ((j) E).M;
                        int i = 0;
                        E = E;
                        bVar = bVar;
                        while (qVar2 != null) {
                            if ((qVar2.z & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    bVar = bVar;
                                    E = qVar2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (E != 0) {
                                        bVar.b(E);
                                        E = 0;
                                    }
                                    bVar.b(qVar2);
                                }
                            }
                            qVar2 = qVar2.C;
                            E = E;
                            bVar = bVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E = k.e(bVar);
                }
            }
        }
        return objW0;
    }

    public final long K0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - c0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - a0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float L0(long j, long j2) {
        if (c0() >= Float.intBitsToFloat((int) (j2 >> 32)) && a0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jK0 = K0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - c0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - a0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // androidx.compose.ui.layout.x
    public final androidx.compose.ui.layout.x M() {
        boolean z = T0().K;
        f0 f0Var = this.L;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (f0 f0VarV = f0Var; f0VarV != null; f0VarV = f0VarV.v()) {
                sb.append("\n|");
                sb.append(f0VarV);
                sb.append(" isAttached=");
                sb.append(f0VarV.H());
                sb.append(" modifier=");
                sb.append(f0VarV.i0);
                sb.append(" tail=");
                sb.append(T0());
            }
            androidx.compose.ui.internal.a.b(sb.toString());
        }
        c1();
        return ((d1) f0Var.d0.e).N;
    }

    public final void M0(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        boolean z;
        float f;
        l1 l1Var = this.i0;
        if (l1Var == null) {
            long j = this.W;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            rVar.p(f2, f3);
            N0(rVar, bVar);
            rVar.p(-f2, -f3);
            return;
        }
        androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
        androidx.compose.ui.graphics.drawscope.b bVar2 = q1Var.J;
        q1Var.g();
        q1Var.Q = q1Var.e.a.J() > 0.0f;
        c2 c2Var = bVar2.y;
        c2Var.Z(rVar);
        c2Var.z = bVar;
        androidx.compose.ui.graphics.layer.b bVar3 = q1Var.e;
        androidx.compose.ui.graphics.r rVarW = bVar2.b0().w();
        androidx.compose.ui.graphics.layer.b bVar4 = (androidx.compose.ui.graphics.layer.b) bVar2.b0().z;
        androidx.compose.ui.graphics.layer.d dVar = bVar3.a;
        if (bVar3.s) {
            return;
        }
        bVar3.a();
        if (!dVar.m()) {
            try {
                bVar3.a.e(bVar3.b, bVar3.c, bVar3, bVar3.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = dVar.J() > 0.0f;
        if (z2) {
            rVarW.t();
        }
        Canvas canvasA = androidx.compose.ui.graphics.d.a(rVarW);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = bVar3.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = bVar3.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float fA = dVar.a();
            androidx.compose.ui.graphics.m mVarI = dVar.i();
            int iL = dVar.L();
            if (fA < 1.0f || iL != 3 || mVarI != null || dVar.h() == 1) {
                com.google.android.gms.cloudmessaging.n nVarG = bVar3.p;
                if (nVarG == null) {
                    nVarG = androidx.compose.ui.graphics.a0.g();
                    bVar3.p = nVarG;
                }
                nVarG.e(fA);
                nVarG.g(iL);
                nVarG.i(mVarI);
                f = f4;
                canvasA.saveLayer(f, f5, f6, f7, (Paint) nVarG.y);
            } else {
                canvasA.save();
                f = f4;
            }
            canvasA.translate(f, f5);
            canvasA.concat(dVar.H());
        }
        boolean z3 = !zIsHardwareAccelerated && bVar3.w;
        if (z3) {
            rVarW.f();
            androidx.compose.ui.graphics.a0 a0VarD = bVar3.d();
            if (a0VarD instanceof androidx.compose.ui.graphics.h0) {
                androidx.compose.ui.graphics.r.k(rVarW, ((androidx.compose.ui.graphics.h0) a0VarD).f);
            } else if (a0VarD instanceof androidx.compose.ui.graphics.i0) {
                androidx.compose.ui.graphics.j jVarA = bVar3.m;
                if (jVarA != null) {
                    jVarA.a.rewind();
                } else {
                    jVarA = androidx.compose.ui.graphics.l.a();
                    bVar3.m = jVarA;
                }
                androidx.compose.ui.graphics.j.b(jVarA, ((androidx.compose.ui.graphics.i0) a0VarD).f);
                rVarW.a(jVarA);
            } else {
                if (!(a0VarD instanceof androidx.compose.ui.graphics.g0)) {
                    coil3.g.a();
                    return;
                }
                rVarW.a(((androidx.compose.ui.graphics.g0) a0VarD).f);
            }
        }
        if (bVar4 != null) {
            androidx.compose.material.ripple.g gVar = bVar4.r;
            if (!gVar.a) {
                androidx.compose.ui.graphics.d0.a("Only add dependencies during a tracking");
            }
            androidx.collection.p0 p0Var = (androidx.collection.p0) gVar.d;
            if (p0Var != null) {
                p0Var.a(bVar3);
            } else if (((androidx.compose.ui.graphics.layer.b) gVar.b) != null) {
                androidx.collection.p0 p0Var2 = androidx.collection.x0.a;
                androidx.collection.p0 p0Var3 = new androidx.collection.p0();
                androidx.compose.ui.graphics.layer.b bVar5 = (androidx.compose.ui.graphics.layer.b) gVar.b;
                bVar5.getClass();
                p0Var3.a(bVar5);
                p0Var3.a(bVar3);
                gVar.d = p0Var3;
                gVar.b = null;
            } else {
                gVar.b = bVar3;
            }
            androidx.collection.p0 p0Var4 = (androidx.collection.p0) gVar.e;
            if (p0Var4 != null) {
                z = !p0Var4.l(bVar3);
            } else if (((androidx.compose.ui.graphics.layer.b) gVar.c) != bVar3) {
                z = true;
            } else {
                gVar.c = null;
                z = false;
            }
            if (z) {
                bVar3.q++;
            }
        }
        if (((androidx.compose.ui.graphics.c) rVarW).a.isHardwareAccelerated()) {
            dVar.M(rVarW);
        } else {
            androidx.compose.ui.graphics.drawscope.b bVar6 = bVar3.o;
            if (bVar6 == null) {
                bVar6 = new androidx.compose.ui.graphics.drawscope.b();
                bVar3.o = bVar6;
            }
            c2 c2Var2 = bVar6.y;
            androidx.compose.ui.unit.c cVar = bVar3.b;
            androidx.compose.ui.unit.m mVar = bVar3.c;
            long jX = coil3.network.g.x(bVar3.u);
            androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var2.A).e;
            androidx.compose.ui.unit.c cVar2 = aVar.a;
            androidx.compose.ui.unit.m mVar2 = aVar.b;
            androidx.compose.ui.graphics.r rVarW2 = c2Var2.w();
            long jH = c2Var2.H();
            androidx.compose.ui.graphics.layer.b bVar7 = (androidx.compose.ui.graphics.layer.b) c2Var2.z;
            c2Var2.a0(cVar);
            c2Var2.b0(mVar);
            c2Var2.Z(rVarW);
            c2Var2.c0(jX);
            c2Var2.z = bVar3;
            rVarW.f();
            try {
                bVar3.c(bVar6);
                rVarW.q();
                c2Var2.a0(cVar2);
                c2Var2.b0(mVar2);
                c2Var2.Z(rVarW2);
                c2Var2.c0(jH);
                c2Var2.z = bVar7;
            } catch (Throwable th) {
                rVarW.q();
                c2Var2.a0(cVar2);
                c2Var2.b0(mVar2);
                c2Var2.Z(rVarW2);
                c2Var2.c0(jH);
                c2Var2.z = bVar7;
                throw th;
            }
        }
        if (z3) {
            rVarW.q();
        }
        if (z2) {
            rVarW.g();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public final void N0(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        androidx.compose.ui.graphics.r rVar2;
        androidx.compose.ui.graphics.layer.b bVar2;
        androidx.compose.ui.q qVarU0 = U0(4);
        if (qVarU0 == null) {
            i1(rVar, bVar);
            return;
        }
        f0 f0Var = this.L;
        f0Var.getClass();
        h0 sharedDrawScope = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSharedDrawScope();
        long jX = coil3.network.g.x(this.z);
        sharedDrawScope.getClass();
        androidx.compose.runtime.collection.b bVar3 = null;
        while (qVarU0 != null) {
            if (qVarU0 instanceof m) {
                rVar2 = rVar;
                bVar2 = bVar;
                sharedDrawScope.c(rVar2, jX, this, (m) qVarU0, bVar2);
            } else {
                rVar2 = rVar;
                bVar2 = bVar;
                if ((qVarU0.z & 4) != 0 && (qVarU0 instanceof j)) {
                    int i = 0;
                    for (androidx.compose.ui.q qVar = ((j) qVarU0).M; qVar != null; qVar = qVar.C) {
                        if ((qVar.z & 4) != 0) {
                            i++;
                            if (i == 1) {
                                qVarU0 = qVar;
                            } else {
                                if (bVar3 == null) {
                                    bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                }
                                if (qVarU0 != null) {
                                    bVar3.b(qVarU0);
                                    qVarU0 = null;
                                }
                                bVar3.b(qVar);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                rVar = rVar2;
                bVar = bVar2;
            }
            qVarU0 = k.e(bVar3);
            rVar = rVar2;
            bVar = bVar2;
        }
    }

    public abstract void O0();

    public final d1 P0(d1 d1Var) {
        f0 f0VarV = d1Var.L;
        f0 f0Var = this.L;
        if (f0VarV == f0Var) {
            androidx.compose.ui.q qVarT0 = d1Var.T0();
            androidx.compose.ui.q qVarT1 = T0();
            if (!qVarT1.e.K) {
                androidx.compose.ui.internal.a.b("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.q qVar = qVarT1.e.B; qVar != null; qVar = qVar.B) {
                if ((qVar.z & 2) != 0 && qVar == qVarT0) {
                    return d1Var;
                }
            }
            return this;
        }
        while (f0VarV.N > f0Var.N) {
            f0VarV = f0VarV.v();
            f0VarV.getClass();
        }
        f0 f0VarV2 = f0Var;
        while (f0VarV2.N > f0VarV.N) {
            f0VarV2 = f0VarV2.v();
            f0VarV2.getClass();
        }
        while (f0VarV != f0VarV2) {
            f0VarV = f0VarV.v();
            f0VarV2 = f0VarV2.v();
            if (f0VarV == null || f0VarV2 == null) {
                net.luminis.tls.engine.impl.c.o("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (f0VarV2 != f0Var) {
            if (f0VarV != d1Var.L) {
                return (r) f0VarV.d0.d;
            }
            return d1Var;
        }
        return this;
    }

    public final long Q0(long j) {
        long j2 = this.W;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        l1 l1Var = this.i0;
        if (l1Var == null) {
            return jFloatToRawIntBits;
        }
        androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
        float[] fArrA = q1Var.a();
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return q1Var.P ? jFloatToRawIntBits : androidx.compose.ui.graphics.f0.b(jFloatToRawIntBits, fArrA);
    }

    public abstract o0 R0();

    @Override // androidx.compose.ui.layout.x
    public final long S(long j) {
        if (!T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return D(androidx.compose.ui.layout.a0.g(this), ((androidx.compose.ui.platform.u) i0.a(this.L)).I(j));
    }

    public final long S0() {
        return this.R.k0(this.L.Y.d());
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.L.W.T();
    }

    public abstract androidx.compose.ui.q T0();

    public final androidx.compose.ui.q U0(int i) {
        boolean zG = e1.g(i);
        androidx.compose.ui.q qVarT0 = T0();
        if (!zG && (qVarT0 = qVarT0.B) == null) {
            return null;
        }
        for (androidx.compose.ui.q qVarV0 = V0(zG); qVarV0 != null && (qVarV0.A & i) != 0; qVarV0 = qVarV0.C) {
            if ((qVarV0.z & i) != 0) {
                return qVarV0;
            }
            if (qVarV0 == qVarT0) {
                return null;
            }
        }
        return null;
    }

    public final androidx.compose.ui.q V0(boolean z) {
        androidx.compose.ui.q qVarT0;
        a1 a1Var = this.L.d0;
        if (((d1) a1Var.e) == this) {
            return (androidx.compose.ui.q) a1Var.g;
        }
        d1 d1Var = this.N;
        if (!z) {
            if (d1Var != null) {
                return d1Var.T0();
            }
            return null;
        }
        if (d1Var == null || (qVarT0 = d1Var.T0()) == null) {
            return null;
        }
        return qVarT0.C;
    }

    @Override // androidx.compose.ui.layout.x
    public final long W(long j) {
        if (!T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        c1();
        for (d1 d1Var = this; d1Var != null; d1Var = d1Var.N) {
            f0 f0Var = d1Var.L;
            if (d1Var == ((d1) f0Var.d0.e) && !f0Var.z) {
                long jB = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().b(f0Var);
                if (!androidx.compose.ui.unit.j.a(jB, 9223372034707292159L)) {
                    return android.support.v4.media.session.b.A(j, jB);
                }
            }
            l1 l1Var = d1Var.i0;
            if (l1Var != null) {
                androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
                float[] fArrB = q1Var.b();
                if (!q1Var.P) {
                    j = androidx.compose.ui.graphics.f0.b(j, fArrB);
                }
            }
            j = android.support.v4.media.session.b.A(j, d1Var.W);
        }
        return j;
    }

    public final void W0(androidx.compose.ui.q qVar, b1 b1Var, long j, p pVar, int i, boolean z) {
        if (qVar == null) {
            Z0(b1Var, j, pVar, i, z);
            return;
        }
        int i2 = pVar.z;
        androidx.collection.j0 j0Var = pVar.e;
        pVar.c(i2 + 1, j0Var.b);
        pVar.z++;
        j0Var.a(qVar);
        pVar.y.a(k.a(-1.0f, z, false));
        W0(k.d(qVar, b1Var.b()), b1Var, j, pVar, i, z);
        pVar.z = i2;
    }

    public final void X0(androidx.compose.ui.q qVar, b1 b1Var, long j, p pVar, int i, boolean z, float f) {
        if (qVar == null) {
            Z0(b1Var, j, pVar, i, z);
            return;
        }
        int i2 = pVar.z;
        androidx.collection.j0 j0Var = pVar.e;
        pVar.c(i2 + 1, j0Var.b);
        pVar.z++;
        j0Var.a(qVar);
        pVar.y.a(k.a(f, z, false));
        h1(k.d(qVar, b1Var.b()), b1Var, j, pVar, i, z, f, true);
        pVar.z = i2;
    }

    public final void Y0(b1 b1Var, long j, p pVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        androidx.compose.ui.q qVarU0 = U0(b1Var.b());
        if (!t1(j)) {
            if (i == 1) {
                float fL0 = L0(j, S0());
                if ((Float.floatToRawIntBits(fL0) & Integer.MAX_VALUE) < 2139095040) {
                    if (pVar.z != pVar.e.b - 1) {
                        if (k.g(pVar.b(), k.a(fL0, false, false)) <= 0) {
                            return;
                        }
                    }
                    X0(qVarU0, b1Var, j, pVar, i, false, fL0);
                    return;
                }
                return;
            }
            return;
        }
        if (qVarU0 == null) {
            Z0(b1Var, j, pVar, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < c0() && fIntBitsToFloat2 < a0()) {
            W0(qVarU0, b1Var, j, pVar, i, z);
            return;
        }
        float fL1 = i == 1 ? L0(j, S0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fL1) & Integer.MAX_VALUE) < 2139095040) {
            if (pVar.z != pVar.e.b - 1) {
                z2 = z;
                if (k.g(pVar.b(), k.a(fL1, z2, false)) > 0) {
                }
                h1(qVarU0, b1Var, j, pVar, i, z2, fL1, z3);
            }
            z2 = z;
            z3 = true;
            h1(qVarU0, b1Var, j, pVar, i, z2, fL1, z3);
        }
        z2 = z;
        z3 = false;
        h1(qVarU0, b1Var, j, pVar, i, z2, fL1, z3);
    }

    public void Z0(b1 b1Var, long j, p pVar, int i, boolean z) {
        d1 d1Var = this.M;
        if (d1Var != null) {
            d1Var.Y0(b1Var, d1Var.Q0(j), pVar, i, z);
        }
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.L.W.a();
    }

    public final void a1() {
        l1 l1Var = this.i0;
        if (l1Var != null) {
            ((androidx.compose.ui.platform.q1) l1Var).c();
            return;
        }
        d1 d1Var = this.N;
        if (d1Var != null) {
            d1Var.a1();
        }
    }

    public final boolean b1() {
        if (this.i0 != null && this.T <= 0.0f) {
            return true;
        }
        d1 d1Var = this.N;
        if (d1Var != null) {
            return d1Var.b1();
        }
        return false;
    }

    public final void c1() {
        this.L.e0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void d1() {
        androidx.compose.ui.q qVarT0;
        boolean zG = e1.g(128);
        androidx.compose.ui.q qVarV0 = V0(zG);
        if (qVarV0 == null || (qVarV0.e.A & 128) == 0) {
            return;
        }
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            if (!zG) {
                qVarT0 = T0().B;
                if (qVarT0 == null) {
                }
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            }
            qVarT0 = T0();
            for (androidx.compose.ui.q qVarV1 = V0(zG); qVarV1 != null && (qVarV1.A & 128) != 0; qVarV1 = qVarV1.C) {
                if ((qVarV1.z & 128) != 0) {
                    ?? E = qVarV1;
                    ?? bVar = 0;
                    while (E != 0) {
                        if (E instanceof u) {
                            ((u) E).l(this.z);
                        } else if ((E.z & 128) != 0 && (E instanceof j)) {
                            androidx.compose.ui.q qVar = ((j) E).M;
                            int i = 0;
                            E = E;
                            bVar = bVar;
                            while (qVar != null) {
                                if ((qVar.z & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        bVar = bVar;
                                        E = qVar;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (E != 0) {
                                            bVar.b(E);
                                            E = 0;
                                        }
                                        bVar.b(qVar);
                                    }
                                }
                                qVar = qVar.C;
                                E = E;
                                bVar = bVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E = k.e(bVar);
                    }
                }
                if (qVarV1 == qVarT0) {
                    break;
                }
            }
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void e1() {
        boolean zG = e1.g(4194304);
        androidx.compose.ui.q qVarT0 = T0();
        if (!zG && (qVarT0 = qVarT0.B) == null) {
            return;
        }
        for (androidx.compose.ui.q qVarV0 = V0(zG); qVarV0 != null && (qVarV0.A & 4194304) != 0; qVarV0 = qVarV0.C) {
            if ((qVarV0.z & 4194304) != 0) {
                ?? E = qVarV0;
                ?? bVar = 0;
                while (E != 0) {
                    if (E instanceof u) {
                        ((u) E).s(this);
                    } else if ((E.z & 4194304) != 0 && (E instanceof j)) {
                        androidx.compose.ui.q qVar = ((j) E).M;
                        int i = 0;
                        E = E;
                        bVar = bVar;
                        while (qVar != null) {
                            if ((qVar.z & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    bVar = bVar;
                                    E = qVar;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (E != 0) {
                                        bVar.b(E);
                                        E = 0;
                                    }
                                    bVar.b(qVar);
                                }
                            }
                            qVar = qVar.C;
                            E = E;
                            bVar = bVar;
                        }
                        if (i == 1) {
                        }
                    }
                    E = k.e(bVar);
                }
            }
            if (qVarV0 == qVarT0) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.x
    public final long f(long j) {
        long jW = W(j);
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(this.L);
        uVar.E();
        return androidx.compose.ui.graphics.f0.b(jW, uVar.y0);
    }

    public final void f1() {
        this.O = true;
        this.g0.invoke();
        l1();
        if (androidx.compose.ui.unit.j.a(this.W, 0L)) {
            return;
        }
        this.L.N();
    }

    public final void g1() {
        boolean zG = e1.g(1048576);
        androidx.compose.ui.q qVarV0 = V0(zG);
        if (qVarV0 == null || (qVarV0.e.A & 1048576) == 0) {
            return;
        }
        androidx.compose.ui.q qVarT0 = T0();
        if (!zG && (qVarT0 = qVarT0.B) == null) {
            return;
        }
        for (androidx.compose.ui.q qVarV1 = V0(zG); qVarV1 != null && (qVarV1.A & 1048576) != 0; qVarV1 = qVarV1.C) {
            if ((qVarV1.z & 1048576) != 0) {
                androidx.compose.ui.q qVarE = qVarV1;
                androidx.compose.runtime.collection.b bVar = null;
                while (qVarE != null) {
                    if ((qVarE.z & 1048576) != 0 && (qVarE instanceof j)) {
                        int i = 0;
                        for (androidx.compose.ui.q qVar = ((j) qVarE).M; qVar != null; qVar = qVar.C) {
                            if ((qVar.z & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    qVarE = qVar;
                                } else {
                                    if (bVar == null) {
                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (qVarE != null) {
                                        bVar.b(qVarE);
                                        qVarE = null;
                                    }
                                    bVar.b(qVar);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    qVarE = k.e(bVar);
                }
            }
            if (qVarV1 == qVarT0) {
                return;
            }
        }
    }

    @Override // androidx.compose.ui.layout.s
    public final androidx.compose.ui.unit.m getLayoutDirection() {
        return this.L.X;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01b2 A[PHI: r9
  0x01b2: PHI (r9v5 ??) = (r9v1 ??), (r9v1 ??), (r9v7 ??) binds: [B:51:0x0177, B:53:0x017b, B:67:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.compose.runtime.collection.b] */
    public final void h1(androidx.compose.ui.q qVar, b1 b1Var, long j, p pVar, int i, boolean z, float f, boolean z2) {
        ?? E;
        if (qVar == null) {
            Z0(b1Var, j, pVar, i, z);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            ?? r8 = qVar;
            ?? bVar = 0;
            while (r8 != 0) {
                if (r8 instanceof r1) {
                    long jK = ((r1) r8).k();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    f0 f0Var = this.L;
                    androidx.compose.ui.unit.m mVar = f0Var.X;
                    int i4 = x1.b;
                    long j2 = jK & Long.MIN_VALUE;
                    androidx.compose.ui.unit.m mVar2 = androidx.compose.ui.unit.m.e;
                    if (fIntBitsToFloat < (-((j2 == 0 || mVar == mVar2) ? b1.a(0, jK) : b1.a(2, jK)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i3) >= c0() + ((j2 == 0 || f0Var.X == mVar2) ? b1.a(2, jK) : b1.a(0, jK))) {
                        break;
                    }
                    int i5 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i5) < (-b1.a(1, jK))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i5) >= b1.a(3, jK) + a0()) {
                        break;
                    }
                    androidx.collection.b0 b0Var = pVar.y;
                    androidx.collection.j0 j0Var = pVar.e;
                    int i6 = pVar.z;
                    int i7 = j0Var.b;
                    if (i6 == i7 - 1) {
                        pVar.c(i6 + 1, i7);
                        pVar.z++;
                        j0Var.a(qVar);
                        b0Var.a(k.a(0.0f, z, true));
                        h1(k.d(qVar, b1Var.b()), b1Var, j, pVar, i2, z, f, z2);
                        pVar.z = i6;
                        return;
                    }
                    long jB = pVar.b();
                    int i8 = pVar.z;
                    if (!k.m(jB)) {
                        if (k.i(jB) > 0.0f) {
                            int i9 = pVar.z;
                            pVar.c(i9 + 1, j0Var.b);
                            pVar.z++;
                            j0Var.a(qVar);
                            b0Var.a(k.a(0.0f, z, true));
                            h1(k.d(qVar, b1Var.b()), b1Var, j, pVar, i, z, f, z2);
                            pVar.z = i9;
                            return;
                        }
                        return;
                    }
                    int i10 = j0Var.b;
                    int i11 = i10 - 1;
                    pVar.z = i11;
                    pVar.c(i10, j0Var.b);
                    pVar.z++;
                    j0Var.a(qVar);
                    b0Var.a(k.a(0.0f, z, true));
                    h1(k.d(qVar, b1Var.b()), b1Var, j, pVar, i, z, f, z2);
                    pVar.z = i11;
                    if (k.i(pVar.b()) < 0.0f) {
                        pVar.c(i8 + 1, pVar.z + 1);
                    }
                    pVar.z = i8;
                    return;
                }
                int i12 = 16;
                if ((r8.z & 16) == 0 || !(r8 instanceof j)) {
                    E = r8;
                    bVar = bVar;
                    E = k.e(bVar);
                } else {
                    androidx.compose.ui.q qVar2 = ((j) r8).M;
                    int i13 = 0;
                    while (qVar2 != null) {
                        if ((qVar2.z & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                E = r8;
                                bVar = bVar;
                                bVar = bVar;
                                E = qVar2;
                            } else {
                                if (bVar == 0) {
                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[i12]);
                                }
                                if (E != 0) {
                                    bVar.b(E);
                                    E = 0;
                                }
                                bVar.b(qVar2);
                            }
                        } else {
                            E = r8;
                            bVar = bVar;
                        }
                        qVar2 = qVar2.C;
                        i12 = 16;
                        E = E;
                        bVar = bVar;
                    }
                    if (i13 == 1) {
                        E = r8;
                        bVar = bVar;
                    } else {
                        E = r8;
                        bVar = bVar;
                        E = k.e(bVar);
                    }
                }
                i2 = i;
                r8 = E;
                bVar = bVar;
            }
        }
        if (z2) {
            X0(qVar, b1Var, j, pVar, i, z, f);
            return;
        }
        switch (b1Var.a) {
            case 0:
                ?? E2 = qVar;
                ?? bVar2 = 0;
                while (E2 != 0) {
                    if (E2 instanceof r1) {
                        ((r1) E2).K();
                    } else if ((E2.z & 16) != 0 && (E2 instanceof j)) {
                        androidx.compose.ui.q qVar3 = ((j) E2).M;
                        int i14 = 0;
                        while (qVar3 != null) {
                            if ((qVar3.z & 16) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    E2 = E2;
                                    bVar2 = bVar2;
                                    bVar2 = bVar2;
                                    E2 = qVar3;
                                } else {
                                    if (bVar2 == 0) {
                                        bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                    }
                                    if (E2 != 0) {
                                        bVar2.b(E2);
                                        E2 = 0;
                                    }
                                    bVar2.b(qVar3);
                                }
                            } else {
                                E2 = E2;
                                bVar2 = bVar2;
                            }
                            qVar3 = qVar3.C;
                            E2 = E2;
                            bVar2 = bVar2;
                        }
                        if (i14 == 1) {
                            E2 = E2;
                            bVar2 = bVar2;
                        } else {
                            E2 = E2;
                            bVar2 = bVar2;
                        }
                    }
                    E2 = k.e(bVar2);
                }
                break;
        }
        h1(k.d(qVar, b1Var.b()), b1Var, j, pVar, i, z, f, false);
    }

    @Override // androidx.compose.ui.layout.x
    public final long i(androidx.compose.ui.layout.x xVar, long j) {
        return D(xVar, j);
    }

    public abstract void i1(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar);

    public final void j1(long j, float f, kotlin.jvm.functions.l lVar) {
        r1(lVar, false);
        boolean zA = androidx.compose.ui.unit.j.a(this.W, j);
        f0 f0Var = this.L;
        if (!zA) {
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).O(-4.0f);
            this.W = j;
            f0Var.e0.p.t0();
            l1 l1Var = this.i0;
            if (l1Var != null) {
                ((androidx.compose.ui.platform.q1) l1Var).d(j);
            } else {
                d1 d1Var = this.N;
                if (d1Var != null) {
                    d1Var.a1();
                }
            }
            f0Var.N();
            n0.F0(this);
            m1 m1Var = f0Var.L;
            if (m1Var != null) {
                ((androidx.compose.ui.platform.u) m1Var).A(f0Var);
            }
        }
        this.X = f;
        if (this == ((d1) f0Var.d0.e)) {
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().f(f0Var, false);
        }
        if (this.H) {
            return;
        }
        t0(B0());
    }

    public final void k1(androidx.compose.ui.geometry.a aVar, boolean z, boolean z2) {
        l1 l1Var = this.i0;
        if (l1Var != null) {
            if (this.P) {
                if (z2) {
                    long jS0 = S0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jS0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS0 & 4294967295L)) / 2.0f;
                    long j = this.z;
                    aVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.z;
                    aVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (aVar.b()) {
                    return;
                }
            }
            androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
            float[] fArrB = q1Var.b();
            if (!q1Var.P) {
                if (fArrB == null) {
                    aVar.b = 0.0f;
                    aVar.c = 0.0f;
                    aVar.d = 0.0f;
                    aVar.e = 0.0f;
                } else {
                    androidx.compose.ui.graphics.f0.c(fArrB, aVar);
                }
            }
        }
        long j3 = this.W;
        float f = (int) (j3 >> 32);
        aVar.b += f;
        aVar.d += f;
        float f2 = (int) (j3 & 4294967295L);
        aVar.c += f2;
        aVar.e += f2;
    }

    @Override // androidx.compose.ui.layout.x
    public final boolean l() {
        return T0().K;
    }

    public final void l1() {
        if (this.i0 != null) {
            r1(null, false);
            this.L.U(false);
        }
    }

    @Override // androidx.compose.ui.layout.x
    public final void m(float[] fArr) {
        m1 m1VarA = i0.a(this.L);
        d1 d1VarN1 = n1(androidx.compose.ui.layout.a0.g(this));
        q1(d1VarN1, fArr);
        if (m1VarA instanceof androidx.compose.ui.input.pointer.g) {
            ((androidx.compose.ui.platform.u) ((androidx.compose.ui.input.pointer.g) m1VarA)).s(fArr);
            return;
        }
        long jE = d1VarN1.E(0L);
        if ((9223372034707292159L & jE) != 9205357640488583168L) {
            androidx.compose.ui.graphics.f0.f(fArr, Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jE & 4294967295L)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.collection.b] */
    public final void m1(androidx.compose.ui.layout.r0 r0Var) {
        d1 d1Var;
        androidx.compose.ui.layout.r0 r0Var2 = this.U;
        if (r0Var != r0Var2) {
            this.U = r0Var;
            f0 f0Var = this.L;
            int i = 0;
            if (r0Var2 == null || r0Var.b() != r0Var2.b() || r0Var.a() != r0Var2.a()) {
                int iB = r0Var.b();
                int iA = r0Var.a();
                l1 l1Var = this.i0;
                if (l1Var != null) {
                    ((androidx.compose.ui.platform.q1) l1Var).e((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (f0Var.I() && (d1Var = this.N) != null) {
                    d1Var.a1();
                }
                j0((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.Q != null) {
                    s1(false);
                }
                boolean zG = e1.g(4);
                androidx.compose.ui.q qVarT0 = T0();
                if (zG || (qVarT0 = qVarT0.B) != null) {
                    for (androidx.compose.ui.q qVarV0 = V0(zG); qVarV0 != null && (qVarV0.A & 4) != 0; qVarV0 = qVarV0.C) {
                        if ((qVarV0.z & 4) != 0) {
                            ?? E = qVarV0;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof m) {
                                    ((m) E).J();
                                } else if ((E.z & 4) != 0 && (E instanceof j)) {
                                    androidx.compose.ui.q qVar = ((j) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar != null) {
                                        if ((qVar.z & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar = bVar;
                                                E = qVar;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar);
                                            }
                                        }
                                        qVar = qVar.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = k.e(bVar);
                            }
                        }
                        if (qVarV0 == qVarT0) {
                            break;
                        }
                    }
                }
                m1 m1Var = f0Var.L;
                if (m1Var != null) {
                    ((androidx.compose.ui.platform.u) m1Var).A(f0Var);
                }
            }
            androidx.collection.f0 f0Var2 = this.V;
            if ((f0Var2 == null || f0Var2.e == 0) && r0Var.c().isEmpty()) {
                return;
            }
            androidx.collection.f0 f0Var3 = this.V;
            Map mapC = r0Var.c();
            if (f0Var3 != null && f0Var3.e == mapC.size()) {
                Object[] objArr = f0Var3.b;
                int[] iArr = f0Var3.c;
                long[] jArr = f0Var3.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((androidx.compose.ui.layout.a) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            f0Var.e0.p.T.f();
            androidx.collection.f0 f0Var4 = this.V;
            if (f0Var4 == null) {
                androidx.collection.f0 f0Var5 = androidx.collection.t0.a;
                f0Var4 = new androidx.collection.f0();
                this.V = f0Var4;
            }
            f0Var4.a();
            for (Map.Entry entry : r0Var.c().entrySet()) {
                f0Var4.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final androidx.compose.ui.geometry.c o1() {
        if (T0().K) {
            androidx.compose.ui.layout.x xVarG = androidx.compose.ui.layout.a0.g(this);
            androidx.compose.ui.geometry.a aVar = this.Y;
            if (aVar == null) {
                aVar = new androidx.compose.ui.geometry.a();
                this.Y = aVar;
            }
            long jK0 = K0(S0());
            int i = (int) (jK0 >> 32);
            aVar.b = -Float.intBitsToFloat(i);
            int i2 = (int) (jK0 & 4294967295L);
            aVar.c = -Float.intBitsToFloat(i2);
            aVar.d = Float.intBitsToFloat(i) + c0();
            aVar.e = Float.intBitsToFloat(i2) + a0();
            d1 d1Var = this;
            while (d1Var != xVarG) {
                d1Var.k1(aVar, false, true);
                if (!aVar.b()) {
                    d1Var = d1Var.N;
                    d1Var.getClass();
                }
            }
            return new androidx.compose.ui.geometry.c(aVar.b, aVar.c, aVar.d, aVar.e);
        }
        return androidx.compose.ui.geometry.c.e;
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return (this.i0 == null || this.O || !this.L.H()) ? false : true;
    }

    public final void p1(d1 d1Var, float[] fArr) {
        float[] fArrA;
        if (kotlin.jvm.internal.l.a(d1Var, this)) {
            return;
        }
        d1 d1Var2 = this.N;
        d1Var2.getClass();
        d1Var2.p1(d1Var, fArr);
        if (!androidx.compose.ui.unit.j.a(this.W, 0L)) {
            float[] fArr2 = l0;
            androidx.compose.ui.graphics.f0.d(fArr2);
            long j = this.W;
            androidx.compose.ui.graphics.f0.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            androidx.compose.ui.graphics.f0.e(fArr, fArr2);
        }
        l1 l1Var = this.i0;
        if (l1Var == null || (fArrA = ((androidx.compose.ui.platform.q1) l1Var).a()) == null) {
            return;
        }
        androidx.compose.ui.graphics.f0.e(fArr, fArrA);
    }

    public final void q1(d1 d1Var, float[] fArr) {
        d1 d1Var2 = this;
        while (!d1Var2.equals(d1Var)) {
            l1 l1Var = d1Var2.i0;
            if (l1Var != null) {
                androidx.compose.ui.graphics.f0.e(fArr, ((androidx.compose.ui.platform.q1) l1Var).b());
            }
            long j = d1Var2.W;
            if (!androidx.compose.ui.unit.j.a(j, 0L)) {
                float[] fArr2 = l0;
                androidx.compose.ui.graphics.f0.d(fArr2);
                androidx.compose.ui.graphics.f0.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                androidx.compose.ui.graphics.f0.e(fArr, fArr2);
            }
            d1Var2 = d1Var2.N;
            d1Var2.getClass();
        }
    }

    public final void r1(kotlin.jvm.functions.l lVar, boolean z) {
        m1 m1Var;
        androidx.compose.runtime.collection.b bVar;
        Reference referencePoll;
        androidx.compose.ui.contentcapture.e eVar;
        androidx.compose.runtime.collection.b bVar2;
        Reference referencePoll2;
        Object obj;
        f0 f0Var = this.L;
        boolean z2 = (!z && this.Q == lVar && kotlin.jvm.internal.l.a(this.R, f0Var.W) && this.S == f0Var.X) ? false : true;
        this.R = f0Var.W;
        this.S = f0Var.X;
        boolean zH = f0Var.H();
        c1 c1Var = this.g0;
        if (!zH || lVar == null) {
            this.Q = null;
            l1 l1Var = this.i0;
            if (l1Var != null) {
                androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
                if (!androidx.compose.ui.graphics.a0.r(q1Var.b())) {
                    f0Var.N();
                }
                q1Var.A = null;
                q1Var.B = null;
                q1Var.D = true;
                q1Var.f(false);
                androidx.compose.ui.graphics.y yVar = q1Var.y;
                if (yVar != null) {
                    yVar.a(q1Var.e);
                    androidx.compose.ui.platform.u uVar = q1Var.z;
                    androidx.compose.foundation.text.input.internal.o oVar = uVar.T0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) oVar.z;
                        bVar = (androidx.compose.runtime.collection.b) oVar.y;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            bVar.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    bVar.b(new WeakReference(q1Var, (ReferenceQueue) oVar.z));
                    uVar.d0.j(q1Var);
                }
                f0Var.h0 = true;
                c1Var.invoke();
                if (T0().K && f0Var.I() && (m1Var = f0Var.L) != null) {
                    ((androidx.compose.ui.platform.u) m1Var).A(f0Var);
                }
            }
            this.i0 = null;
            this.h0 = false;
            return;
        }
        this.Q = lVar;
        if (this.i0 != null) {
            if (z2) {
                s1(true);
                return;
            }
            return;
        }
        m1 m1VarA = i0.a(f0Var);
        androidx.compose.ui.contentcapture.e eVar2 = this.f0;
        if (eVar2 == null) {
            androidx.compose.ui.contentcapture.e eVar3 = new androidx.compose.ui.contentcapture.e(2, this, new c1(this, 0));
            this.f0 = eVar3;
            eVar = eVar3;
        } else {
            eVar = eVar2;
        }
        androidx.compose.ui.platform.u uVar2 = (androidx.compose.ui.platform.u) m1VarA;
        androidx.compose.foundation.text.input.internal.o oVar2 = uVar2.T0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) oVar2.z;
            bVar2 = (androidx.compose.runtime.collection.b) oVar2.y;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                bVar2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i = bVar2.z;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) bVar2.k(i - 1)).get();
        } while (obj == null);
        l1 q1Var2 = (l1) obj;
        if (q1Var2 != null) {
            androidx.compose.ui.platform.q1 q1Var3 = (androidx.compose.ui.platform.q1) q1Var2;
            androidx.compose.ui.graphics.y yVar2 = q1Var3.y;
            if (yVar2 == null) {
                throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!q1Var3.e.s) {
                androidx.compose.ui.internal.a.a("layer should have been released before reuse");
            }
            q1Var3.e = yVar2.b();
            q1Var3.D = false;
            q1Var3.A = eVar;
            q1Var3.B = c1Var;
            q1Var3.N = false;
            q1Var3.O = false;
            q1Var3.P = true;
            androidx.compose.ui.graphics.f0.d(q1Var3.E);
            float[] fArr = q1Var3.F;
            if (fArr != null) {
                androidx.compose.ui.graphics.f0.d(fArr);
            }
            q1Var3.L = androidx.compose.ui.graphics.q0.b;
            q1Var3.Q = false;
            long j = Integer.MAX_VALUE;
            q1Var3.C = (j & 4294967295L) | (j << 32);
            q1Var3.M = null;
            q1Var3.K = 0;
        } else {
            q1Var2 = new androidx.compose.ui.platform.q1(uVar2.getGraphicsContext().b(), uVar2.getGraphicsContext(), uVar2, eVar, c1Var);
        }
        androidx.compose.ui.platform.q1 q1Var4 = (androidx.compose.ui.platform.q1) q1Var2;
        q1Var4.e(this.z);
        q1Var4.d(this.W);
        this.i0 = q1Var2;
        s1(true);
        f0Var.h0 = true;
        c1Var.invoke();
    }

    @Override // androidx.compose.ui.layout.x
    public final androidx.compose.ui.geometry.c s(androidx.compose.ui.layout.x xVar, boolean z) {
        if (!T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!xVar.l()) {
            androidx.compose.ui.internal.a.b("LayoutCoordinates " + xVar + " is not attached!");
        }
        d1 d1VarN1 = n1(xVar);
        d1VarN1.c1();
        d1 d1VarP0 = P0(d1VarN1);
        androidx.compose.ui.geometry.a aVar = this.Y;
        if (aVar == null) {
            aVar = new androidx.compose.ui.geometry.a();
            this.Y = aVar;
        }
        aVar.b = 0.0f;
        aVar.c = 0.0f;
        aVar.d = (int) (xVar.u() >> 32);
        aVar.e = (int) (xVar.u() & 4294967295L);
        while (d1VarN1 != d1VarP0) {
            d1VarN1.k1(aVar, z, false);
            if (aVar.b()) {
                return androidx.compose.ui.geometry.c.e;
            }
            d1VarN1 = d1VarN1.N;
            d1VarN1.getClass();
        }
        I0(d1VarP0, aVar, z);
        return new androidx.compose.ui.geometry.c(aVar.b, aVar.c, aVar.d, aVar.e);
    }

    public final void s1(boolean z) {
        char c;
        androidx.compose.ui.platform.u uVar;
        boolean z2;
        m1 m1Var;
        kotlin.jvm.functions.a aVar;
        kotlin.jvm.functions.a aVar2;
        l1 l1Var = this.i0;
        kotlin.jvm.functions.l lVar = this.Q;
        if (l1Var == null) {
            if (lVar == null) {
                return;
            }
            androidx.compose.ui.internal.a.b("null layer with a non-null layerBlock");
            return;
        }
        if (lVar == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("updateLayerParameters requires a non-null layerBlock");
        }
        androidx.compose.ui.graphics.k0 k0Var = j0;
        k0Var.b();
        f0 f0Var = this.L;
        k0Var.J = f0Var.W;
        k0Var.K = f0Var.X;
        k0Var.I = coil3.network.g.x(this.z);
        ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSnapshotObserver().a.d(this, d.C, new androidx.compose.ui.draw.b(4, lVar, this));
        t tVar = this.Z;
        if (tVar == null) {
            tVar = new t();
            this.Z = tVar;
        }
        t tVar2 = k0;
        tVar2.getClass();
        tVar2.a = tVar.a;
        tVar2.b = tVar.b;
        tVar2.c = tVar.c;
        tVar2.d = tVar.d;
        float f = k0Var.y;
        tVar.a = f;
        tVar.b = k0Var.z;
        tVar.c = k0Var.E;
        long j = k0Var.F;
        tVar.d = j;
        androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
        androidx.compose.ui.platform.u uVar2 = q1Var.z;
        int i = k0Var.e | q1Var.K;
        q1Var.I = k0Var.K;
        q1Var.H = k0Var.J;
        int i2 = i & 4096;
        if (i2 != 0) {
            q1Var.L = j;
        }
        if ((i & 1) != 0) {
            androidx.compose.ui.graphics.layer.d dVar = q1Var.e.a;
            if (dVar.b() != f) {
                dVar.y(f);
            }
        }
        if ((i & 2) != 0) {
            androidx.compose.ui.graphics.layer.b bVar = q1Var.e;
            float f2 = k0Var.z;
            androidx.compose.ui.graphics.layer.d dVar2 = bVar.a;
            if (dVar2.K() != f2) {
                dVar2.j(f2);
            }
        }
        if ((i & 4) != 0) {
            androidx.compose.ui.graphics.layer.b bVar2 = q1Var.e;
            float f3 = k0Var.A;
            androidx.compose.ui.graphics.layer.d dVar3 = bVar2.a;
            if (dVar3.a() != f3) {
                dVar3.r(f3);
            }
        }
        if ((i & 8) != 0) {
            androidx.compose.ui.graphics.layer.d dVar4 = q1Var.e.a;
            if (dVar4.A() != 0.0f) {
                dVar4.B();
            }
        }
        if ((i & 16) != 0) {
            androidx.compose.ui.graphics.layer.d dVar5 = q1Var.e.a;
            if (dVar5.s() != 0.0f) {
                dVar5.t();
            }
        }
        if ((i & 32) != 0) {
            androidx.compose.ui.graphics.layer.b bVar3 = q1Var.e;
            float f4 = k0Var.B;
            androidx.compose.ui.graphics.layer.d dVar6 = bVar3.a;
            if (dVar6.J() != f4) {
                dVar6.c(f4);
                bVar3.g = true;
                bVar3.a();
            }
            if (k0Var.B > 0.0f && !q1Var.Q && (aVar2 = q1Var.B) != null) {
                aVar2.invoke();
            }
        }
        if ((i & 64) != 0) {
            androidx.compose.ui.graphics.layer.b bVar4 = q1Var.e;
            long j2 = k0Var.C;
            androidx.compose.ui.graphics.layer.d dVar7 = bVar4.a;
            if (!androidx.compose.ui.graphics.t.c(j2, dVar7.p())) {
                dVar7.w(j2);
            }
        }
        if ((i & 128) != 0) {
            androidx.compose.ui.graphics.layer.b bVar5 = q1Var.e;
            long j3 = k0Var.D;
            androidx.compose.ui.graphics.layer.d dVar8 = bVar5.a;
            if (!androidx.compose.ui.graphics.t.c(j3, dVar8.v())) {
                dVar8.G(j3);
            }
        }
        if ((i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            androidx.compose.ui.graphics.layer.d dVar9 = q1Var.e.a;
            if (dVar9.n() != 0.0f) {
                dVar9.F();
            }
        }
        if ((i & LibretroCore.SCREEN_WIDTH) != 0) {
            androidx.compose.ui.graphics.layer.d dVar10 = q1Var.e.a;
            if (dVar10.D() != 0.0f) {
                dVar10.q();
            }
        }
        if ((i & 512) != 0) {
            androidx.compose.ui.graphics.layer.d dVar11 = q1Var.e.a;
            if (dVar11.l() != 0.0f) {
                dVar11.u();
            }
        }
        if ((i & 2048) != 0) {
            androidx.compose.ui.graphics.layer.b bVar6 = q1Var.e;
            float f5 = k0Var.E;
            androidx.compose.ui.graphics.layer.d dVar12 = bVar6.a;
            if (dVar12.z() != f5) {
                dVar12.I(f5);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zA = androidx.compose.ui.graphics.q0.a(q1Var.L, androidx.compose.ui.graphics.q0.b);
            androidx.compose.ui.graphics.layer.b bVar7 = q1Var.e;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (q1Var.L & 4294967295L)) * ((int) (q1Var.C & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (q1Var.L >> 32)) * ((int) (q1Var.C >> 32)))) << 32);
                if (!androidx.compose.ui.geometry.b.b(bVar7.v, jFloatToRawIntBits)) {
                    bVar7.v = jFloatToRawIntBits;
                    bVar7.a.o(jFloatToRawIntBits);
                }
            } else if (!androidx.compose.ui.geometry.b.b(bVar7.v, 9205357640488583168L)) {
                bVar7.v = 9205357640488583168L;
                bVar7.a.o(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            androidx.compose.ui.graphics.layer.b bVar8 = q1Var.e;
            boolean z3 = k0Var.H;
            if (bVar8.w != z3) {
                bVar8.w = z3;
                bVar8.g = true;
                bVar8.a();
            }
        }
        if ((131072 & i) != 0) {
            androidx.compose.ui.graphics.layer.d dVar13 = q1Var.e.a;
        }
        if ((262144 & i) != 0) {
            androidx.compose.ui.graphics.layer.d dVar14 = q1Var.e.a;
            if (!kotlin.jvm.internal.l.a(dVar14.i(), null)) {
                dVar14.x();
            }
        }
        if ((524288 & i) != 0) {
            androidx.compose.ui.graphics.layer.b bVar9 = q1Var.e;
            int i3 = k0Var.L;
            androidx.compose.ui.graphics.layer.d dVar15 = bVar9.a;
            if (dVar15.L() != i3) {
                dVar15.f(i3);
            }
        }
        if ((32768 & i) != 0) {
            androidx.compose.ui.graphics.layer.d dVar16 = q1Var.e.a;
            if (dVar16.h() != 0) {
                dVar16.E(0);
            }
        }
        if ((i & 7963) != 0) {
            q1Var.N = true;
            q1Var.O = true;
        }
        if (kotlin.jvm.internal.l.a(q1Var.M, k0Var.M)) {
            uVar = uVar2;
            z2 = false;
        } else {
            androidx.compose.ui.graphics.a0 a0Var = k0Var.M;
            q1Var.M = a0Var;
            if (a0Var == null) {
                uVar = uVar2;
            } else {
                androidx.compose.ui.graphics.layer.b bVar10 = q1Var.e;
                if (a0Var instanceof androidx.compose.ui.graphics.h0) {
                    androidx.compose.ui.geometry.c cVar = ((androidx.compose.ui.graphics.h0) a0Var).f;
                    float f6 = cVar.a;
                    float f7 = cVar.b;
                    uVar = uVar2;
                    bVar10.f((((long) Float.floatToRawIntBits(f6)) << c) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(cVar.c - f6)) << c) | (((long) Float.floatToRawIntBits(cVar.d - f7)) & 4294967295L), 0.0f);
                } else {
                    uVar = uVar2;
                    if (a0Var instanceof androidx.compose.ui.graphics.g0) {
                        androidx.compose.ui.graphics.j jVar = ((androidx.compose.ui.graphics.g0) a0Var).f;
                        bVar10.k = null;
                        bVar10.i = 9205357640488583168L;
                        bVar10.h = 0L;
                        bVar10.j = 0.0f;
                        bVar10.g = true;
                        bVar10.n = false;
                        bVar10.l = jVar;
                        bVar10.a();
                    } else {
                        if (!(a0Var instanceof androidx.compose.ui.graphics.i0)) {
                            coil3.g.a();
                            return;
                        }
                        androidx.compose.ui.graphics.i0 i0Var = (androidx.compose.ui.graphics.i0) a0Var;
                        androidx.compose.ui.graphics.j jVar2 = i0Var.g;
                        if (jVar2 != null) {
                            bVar10.k = null;
                            bVar10.i = 9205357640488583168L;
                            bVar10.h = 0L;
                            bVar10.j = 0.0f;
                            bVar10.g = true;
                            bVar10.n = false;
                            bVar10.l = jVar2;
                            bVar10.a();
                        } else {
                            androidx.compose.ui.geometry.d dVar17 = i0Var.f;
                            float f8 = dVar17.b;
                            float f9 = dVar17.a;
                            bVar10.f((((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar17.c - f9)) << c) | (((long) Float.floatToRawIntBits(dVar17.d - f8)) & 4294967295L), Float.intBitsToFloat((int) (dVar17.h >> c)));
                        }
                    }
                }
                if ((a0Var instanceof androidx.compose.ui.graphics.g0) && Build.VERSION.SDK_INT < 33 && (aVar = q1Var.B) != null) {
                    aVar.invoke();
                }
            }
            z2 = true;
        }
        q1Var.K = k0Var.e;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                f3.a(uVar);
            } else {
                uVar.invalidate();
            }
            androidx.compose.ui.platform.u uVar3 = uVar;
            if (uVar3.I) {
                uVar3.O(0.0f);
            }
        }
        boolean z4 = this.P;
        this.P = k0Var.H;
        this.T = k0Var.A;
        boolean z5 = tVar2.a == tVar.a && tVar2.b == tVar.b && tVar2.c == tVar.c && androidx.compose.ui.graphics.q0.a(tVar2.d, tVar.d);
        if (z && ((!z5 || z4 != this.P) && (m1Var = f0Var.L) != null)) {
            ((androidx.compose.ui.platform.u) m1Var).A(f0Var);
        }
        if (z5) {
            return;
        }
        j0 j0Var = f0Var.e0;
        if (j0Var.l > 0) {
            if (j0Var.k || j0Var.j) {
                f0Var.U(false);
            }
            j0Var.p.t0();
        }
        f0Var.N();
        androidx.compose.ui.platform.u uVar4 = (androidx.compose.ui.platform.u) i0.a(f0Var);
        androidx.compose.ui.spatial.b rectManager = uVar4.getRectManager();
        if (this == ((d1) f0Var.d0.e)) {
            rectManager.f(f0Var, false);
        } else {
            rectManager.getClass();
            if (f0Var.I()) {
                long jG = androidx.compose.ui.spatial.b.g(f0Var);
                if (androidx.compose.ui.unit.j.a(jG, 9223372034707292159L)) {
                    rectManager.d(f0Var);
                } else {
                    f0Var.C = jG;
                    f0Var.D = false;
                    androidx.compose.runtime.collection.b bVarZ = f0Var.z();
                    Object[] objArr = bVarZ.e;
                    int i4 = bVarZ.z;
                    for (int i5 = 0; i5 < i4; i5++) {
                        rectManager.f((f0) objArr[i5], false);
                    }
                    rectManager.e(f0Var);
                }
            }
        }
        if (f0Var.n0 > 0) {
            androidx.compose.foundation.text.input.internal.o oVar = uVar4.u0.e;
            oVar.getClass();
            if (f0Var.n0 > 0) {
                ((androidx.compose.runtime.collection.b) oVar.y).b(f0Var);
                f0Var.m0 = true;
            }
            uVar4.H(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017b  */
    public final boolean t1(long j) {
        boolean z;
        boolean z2;
        boolean zN;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        l1 l1Var = this.i0;
        if (l1Var == null || !this.P) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        androidx.compose.ui.graphics.layer.b bVar = ((androidx.compose.ui.platform.q1) l1Var).e;
        if (bVar.w) {
            androidx.compose.ui.graphics.a0 a0VarD = bVar.d();
            if (a0VarD instanceof androidx.compose.ui.graphics.h0) {
                androidx.compose.ui.geometry.c cVar = ((androidx.compose.ui.graphics.h0) a0VarD).f;
                if (cVar.a > fIntBitsToFloat || fIntBitsToFloat >= cVar.c || cVar.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= cVar.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (a0VarD instanceof androidx.compose.ui.graphics.i0) {
                androidx.compose.ui.geometry.d dVar = ((androidx.compose.ui.graphics.i0) a0VarD).f;
                float f = dVar.c;
                float f2 = dVar.b;
                float f3 = dVar.d;
                float f4 = dVar.a;
                long j2 = dVar.f;
                z = false;
                z2 = true;
                long j3 = dVar.h;
                long j4 = dVar.g;
                long j5 = dVar.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zN = androidx.compose.ui.platform.i0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, dVar.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zN = androidx.compose.ui.platform.i0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, dVar.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zN = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : androidx.compose.ui.platform.i0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, dVar.g);
                                    } else {
                                        zN = androidx.compose.ui.platform.i0.n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, dVar.f);
                                    }
                                } else {
                                    androidx.compose.ui.graphics.j jVarA = androidx.compose.ui.graphics.l.a();
                                    androidx.compose.ui.graphics.j.b(jVarA, dVar);
                                    zN = androidx.compose.ui.platform.i0.m(fIntBitsToFloat, fIntBitsToFloat2, jVarA);
                                }
                            } else {
                                androidx.compose.ui.graphics.j jVarA2 = androidx.compose.ui.graphics.l.a();
                                androidx.compose.ui.graphics.j.b(jVarA2, dVar);
                                zN = androidx.compose.ui.platform.i0.m(fIntBitsToFloat, fIntBitsToFloat2, jVarA2);
                            }
                        } else {
                            androidx.compose.ui.graphics.j jVarA3 = androidx.compose.ui.graphics.l.a();
                            androidx.compose.ui.graphics.j.b(jVarA3, dVar);
                            zN = androidx.compose.ui.platform.i0.m(fIntBitsToFloat, fIntBitsToFloat2, jVarA3);
                        }
                    } else {
                        androidx.compose.ui.graphics.j jVarA4 = androidx.compose.ui.graphics.l.a();
                        androidx.compose.ui.graphics.j.b(jVarA4, dVar);
                        zN = androidx.compose.ui.platform.i0.m(fIntBitsToFloat, fIntBitsToFloat2, jVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(a0VarD instanceof androidx.compose.ui.graphics.g0)) {
                    coil3.g.a();
                    return false;
                }
                zN = androidx.compose.ui.platform.i0.m(fIntBitsToFloat, fIntBitsToFloat2, ((androidx.compose.ui.graphics.g0) a0VarD).f);
            }
            zN = z;
        } else {
            z = false;
            z2 = true;
        }
        return zN ? z2 : z;
    }

    @Override // androidx.compose.ui.layout.x
    public final long u() {
        return this.z;
    }

    @Override // androidx.compose.ui.node.n0
    public final n0 v0() {
        return this.M;
    }

    @Override // androidx.compose.ui.node.n0
    public final boolean z0() {
        return this.U != null;
    }

    @Override // androidx.compose.ui.node.n0
    public final androidx.compose.ui.layout.x w0() {
        return this;
    }
}
