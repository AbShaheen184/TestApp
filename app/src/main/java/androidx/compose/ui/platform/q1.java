package androidx.compose.ui.platform;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements androidx.compose.ui.node.l1 {
    public kotlin.jvm.functions.p A;
    public kotlin.jvm.functions.a B;
    public long C;
    public boolean D;
    public float[] F;
    public boolean G;
    public int K;
    public androidx.compose.ui.graphics.a0 M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public androidx.compose.ui.graphics.layer.b e;
    public final androidx.compose.ui.graphics.y y;
    public final u z;
    public final float[] E = androidx.compose.ui.graphics.f0.a();
    public androidx.compose.ui.unit.c H = _COROUTINE.a.b();
    public androidx.compose.ui.unit.m I = androidx.compose.ui.unit.m.e;
    public final androidx.compose.ui.graphics.drawscope.b J = new androidx.compose.ui.graphics.drawscope.b();
    public long L = androidx.compose.ui.graphics.q0.b;
    public boolean P = true;
    public final androidx.compose.animation.e R = new androidx.compose.animation.e(this, 18);

    public q1(androidx.compose.ui.graphics.layer.b bVar, androidx.compose.ui.graphics.y yVar, u uVar, kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar) {
        this.e = bVar;
        this.y = yVar;
        this.z = uVar;
        this.A = pVar;
        this.B = aVar;
        long j = Integer.MAX_VALUE;
        this.C = (j & 4294967295L) | (j << 32);
    }

    public final float[] a() {
        float[] fArrA = this.F;
        if (fArrA == null) {
            fArrA = androidx.compose.ui.graphics.f0.a();
            this.F = fArrA;
        }
        if (this.O) {
            this.O = false;
            float[] fArrB = b();
            if (this.P) {
                return fArrB;
            }
            if (!i0.l(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.N;
        float[] fArr = this.E;
        if (z) {
            androidx.compose.ui.graphics.layer.b bVar = this.e;
            long jM = bVar.v;
            androidx.compose.ui.graphics.layer.d dVar = bVar.a;
            if ((9223372034707292159L & jM) == 9205357640488583168L) {
                jM = com.google.firebase.crashlytics.internal.model.t1.m(coil3.network.g.x(this.C));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM & 4294967295L));
            float fA = dVar.A();
            float fS = dVar.s();
            float fD = dVar.D();
            float fL = dVar.l();
            float fN = dVar.n();
            float fB = dVar.b();
            float fK = dVar.K();
            double d = ((double) fD) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fS * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fS * fSin);
            double d2 = ((double) fL) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fA * fCos2);
            float f10 = (f3 * fCos2) + ((-fA) * fSin2);
            double d3 = ((double) fN) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fB;
            float f16 = f14 * fB;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fB;
            float f18 = f12 * fK;
            float f19 = fCos * fCos3 * fK;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fK;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.N = false;
            this.P = androidx.compose.ui.graphics.a0.r(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.G || this.D) {
            return;
        }
        this.z.invalidate();
        f(true);
    }

    public final void d(long j) {
        u uVar = this.z;
        if (uVar.I) {
            uVar.O(-4.0f);
        }
        androidx.compose.ui.graphics.layer.b bVar = this.e;
        if (!androidx.compose.ui.unit.j.a(bVar.t, j)) {
            bVar.t = j;
            bVar.a.k((int) (j >> 32), (int) (j & 4294967295L), bVar.u);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            f3.a(uVar);
        } else {
            uVar.invalidate();
        }
    }

    public final void e(long j) {
        if (androidx.compose.ui.unit.l.a(j, this.C)) {
            return;
        }
        u uVar = this.z;
        if (uVar.I) {
            uVar.O(-4.0f);
        }
        this.C = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.G) {
            this.G = z;
            u uVar = this.z;
            androidx.collection.j0 j0Var = uVar.d0;
            boolean z2 = uVar.f0;
            if (!z) {
                if (z2) {
                    return;
                }
                j0Var.j(this);
                androidx.collection.j0 j0Var2 = uVar.e0;
                if (j0Var2 != null) {
                    j0Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                j0Var.a(this);
                return;
            }
            androidx.collection.j0 j0Var3 = uVar.e0;
            if (j0Var3 == null) {
                j0Var3 = new androidx.collection.j0();
                uVar.e0 = j0Var3;
            }
            j0Var3.a(this);
        }
    }

    public final void g() {
        if (this.G) {
            if (!androidx.compose.ui.graphics.q0.a(this.L, androidx.compose.ui.graphics.q0.b) && !androidx.compose.ui.unit.l.a(this.e.u, this.C)) {
                androidx.compose.ui.graphics.layer.b bVar = this.e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.L >> 32)) * ((int) (this.C >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.L & 4294967295L)) * ((int) (this.C & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!androidx.compose.ui.geometry.b.b(bVar.v, jFloatToRawIntBits)) {
                    bVar.v = jFloatToRawIntBits;
                    bVar.a.o(jFloatToRawIntBits);
                }
            }
            androidx.compose.ui.graphics.layer.b bVar2 = this.e;
            androidx.compose.ui.unit.c cVar = this.H;
            androidx.compose.ui.unit.m mVar = this.I;
            long j = this.C;
            long j2 = bVar2.u;
            androidx.compose.ui.graphics.layer.d dVar = bVar2.a;
            if (!androidx.compose.ui.unit.l.a(j2, j)) {
                bVar2.u = j;
                long j3 = bVar2.t;
                dVar.k((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (bVar2.i == 9205357640488583168L) {
                    bVar2.g = true;
                    bVar2.a();
                }
            }
            bVar2.b = cVar;
            bVar2.c = mVar;
            bVar2.d = this.R;
            dVar.e(cVar, mVar, bVar2, bVar2.e);
            f(false);
        }
    }
}
