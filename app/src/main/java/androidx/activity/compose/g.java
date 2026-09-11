package androidx.activity.compose;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.activity.d0;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.n1;
import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.m2;
import androidx.compose.foundation.gestures.q1;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.text.i1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.foundation.text.selection.j0;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.foundation.text.t0;
import androidx.compose.foundation.x;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.w1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.platform.m0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g(g gVar, androidx.compose.foundation.c cVar) {
        this.e = 21;
        this.y = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x0410  */
    /* JADX WARN: Code duplicated, block: B:258:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:271:0x062e  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.m mVar;
        int i;
        c0 c0Var;
        c0 c0Var2;
        boolean z;
        long j;
        androidx.compose.ui.graphics.drawscope.b bVar;
        c2 c2Var;
        float f;
        float f2;
        long jH;
        boolean z2;
        androidx.compose.foundation.lazy.t tVar;
        androidx.compose.foundation.lazy.grid.n nVar;
        boolean z3;
        boolean z4;
        r0 r0Var;
        switch (this.e) {
            case 0:
                m mVar2 = (m) this.y;
                ((d0) mVar2.a).e(true);
                ((androidx.activity.compose.internal.a) mVar2.b).f(true);
                return new j((androidx.lifecycle.compose.b) obj, mVar2, 0);
            case 1:
                androidx.compose.animation.core.l lVar = (androidx.compose.animation.core.l) obj;
                ((kotlin.jvm.functions.p) this.y).invoke(lVar.e.getValue(), androidx.compose.animation.core.e.j.b.invoke(lVar.f));
                return y.a;
            case 2:
                androidx.compose.foundation.y yVar = (androidx.compose.foundation.y) this.y;
                androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj;
                if (dVar.a() * yVar.O < 0.0f || androidx.compose.ui.geometry.e.c(dVar.e.d()) <= 0.0f) {
                    return dVar.b(new n1(21));
                }
                float f3 = 2;
                final float fMin = Math.min(androidx.compose.ui.unit.f.d(yVar.O, 0.0f) ? 1.0f : (float) Math.ceil(dVar.a() * yVar.O), (float) Math.ceil(androidx.compose.ui.geometry.e.c(dVar.e.d()) / f3));
                final float f4 = fMin / f3;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e.d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e.d() >> 32)) - fMin)) << 32);
                float f5 = fMin * f3;
                boolean z5 = f5 > androidx.compose.ui.geometry.e.c(dVar.e.d());
                a0 a0VarA = yVar.Q.a(dVar.e.d(), dVar.e.getLayoutDirection(), dVar);
                if (!(a0VarA instanceof g0)) {
                    if (!(a0VarA instanceof i0)) {
                        boolean z6 = z5;
                        if (!(a0VarA instanceof h0)) {
                            coil3.g.a();
                            return null;
                        }
                        final p0 p0Var = yVar.P;
                        final long j2 = z6 ? 0L : jFloatToRawIntBits;
                        final long jD = z6 ? dVar.e.d() : jFloatToRawIntBits2;
                        final androidx.compose.ui.graphics.drawscope.e hVar = z6 ? androidx.compose.ui.graphics.drawscope.g.a : new androidx.compose.ui.graphics.drawscope.h(fMin, 0.0f, 0, 0, 30);
                        return dVar.b(new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.v
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj2;
                                h0Var.b();
                                androidx.compose.ui.graphics.drawscope.d.Y(h0Var, p0Var, j2, jD, 0.0f, hVar, Token.ASSIGN_LOGICAL_AND);
                                return kotlin.y.a;
                            }
                        });
                    }
                    final p0 p0Var2 = yVar.P;
                    androidx.compose.ui.geometry.d dVar2 = ((i0) a0VarA).f;
                    if (com.google.firebase.b.z(dVar2)) {
                        final long j3 = dVar2.e;
                        final androidx.compose.ui.graphics.drawscope.h hVar2 = new androidx.compose.ui.graphics.drawscope.h(fMin, 0.0f, 0, 0, 30);
                        final boolean z7 = z5;
                        return dVar.b(new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.w
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) throws Throwable {
                                androidx.appcompat.widget.c2 c2Var2;
                                long j4;
                                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj2;
                                h0Var.b();
                                androidx.compose.ui.graphics.drawscope.b bVar2 = h0Var.e;
                                boolean z8 = z7;
                                androidx.compose.ui.graphics.p pVar = p0Var2;
                                long j5 = j3;
                                if (z8) {
                                    androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) - f7;
                                        androidx.appcompat.widget.c2 c2Var3 = bVar2.y;
                                        long jH2 = c2Var3.H();
                                        c2Var3.w().f();
                                        try {
                                            ((androidx.appcompat.widget.c2) ((com.google.firebase.platforminfo.c) c2Var3.y).e).w().o(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j4 = jH2;
                                            c2Var2 = c2Var3;
                                            try {
                                                androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, 0L, 0L, j5, null, 246);
                                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var2, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var2, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c2Var2 = c2Var3;
                                            j4 = jH2;
                                        }
                                    } else {
                                        androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, jFloatToRawIntBits, jFloatToRawIntBits2, s.r(f6, j5), hVar2, 208);
                                    }
                                }
                                return kotlin.y.a;
                            }
                        });
                    }
                    boolean z8 = z5;
                    if (yVar.N == null) {
                        yVar.N = new androidx.compose.foundation.u();
                    }
                    androidx.compose.foundation.u uVar = yVar.N;
                    uVar.getClass();
                    androidx.compose.ui.graphics.j jVarA = uVar.d;
                    if (jVarA == null) {
                        jVarA = androidx.compose.ui.graphics.l.a();
                        uVar.d = jVarA;
                    }
                    jVarA.e();
                    androidx.compose.ui.graphics.j.b(jVarA, dVar2);
                    if (!z8) {
                        androidx.compose.ui.graphics.j jVarA2 = androidx.compose.ui.graphics.l.a();
                        androidx.compose.ui.graphics.j.b(jVarA2, new androidx.compose.ui.geometry.d(fMin, fMin, (dVar2.c - dVar2.a) - fMin, (dVar2.d - dVar2.b) - fMin, androidx.compose.foundation.s.r(fMin, dVar2.e), androidx.compose.foundation.s.r(fMin, dVar2.f), androidx.compose.foundation.s.r(fMin, dVar2.g), androidx.compose.foundation.s.r(fMin, dVar2.h)));
                        jVarA.d(jVarA, jVarA2, 0);
                    }
                    return dVar.b(new h(8, jVarA, p0Var2));
                }
                p0 p0Var3 = yVar.P;
                g0 g0Var = (g0) a0VarA;
                androidx.compose.ui.graphics.j jVar = g0Var.f;
                if (z5) {
                    return dVar.b(new h(9, g0Var, p0Var3));
                }
                if (p0Var3 != null) {
                    mVar = new androidx.compose.ui.graphics.m(androidx.compose.ui.graphics.t.b(1.0f, p0Var3.a), 5);
                    i = 1;
                } else {
                    mVar = null;
                    i = 0;
                }
                androidx.compose.ui.geometry.c cVarC = jVar.c();
                float f6 = cVarC.b;
                float f7 = cVarC.a;
                if (yVar.N == null) {
                    yVar.N = new androidx.compose.foundation.u();
                }
                androidx.compose.foundation.u uVar2 = yVar.N;
                uVar2.getClass();
                androidx.compose.ui.graphics.j jVarA3 = uVar2.d;
                if (jVarA3 == null) {
                    jVarA3 = androidx.compose.ui.graphics.l.a();
                    uVar2.d = jVarA3;
                }
                jVarA3.e();
                float f8 = cVarC.a;
                float f9 = cVarC.d;
                float f10 = cVarC.c;
                float f11 = cVarC.b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    androidx.compose.ui.graphics.l.b("Invalid rectangle, make sure no value is NaN");
                }
                if (jVarA3.b == null) {
                    jVarA3.b = new RectF();
                }
                RectF rectF = jVarA3.b;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = jVarA3.a;
                RectF rectF2 = jVarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                jVarA3.d(jVarA3, jVar, 0);
                z zVar = new z();
                long jCeil = (((long) ((int) Math.ceil(cVarC.d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(cVarC.c - f7))) << 32);
                androidx.compose.foundation.u uVar3 = yVar.N;
                uVar3.getClass();
                androidx.compose.ui.graphics.g gVarF = uVar3.a;
                androidx.compose.ui.graphics.c cVarA = uVar3.b;
                if (gVarF != null) {
                    Bitmap.Config config = gVarF.a.getConfig();
                    config.getClass();
                    c0Var = new c0(androidx.compose.ui.graphics.h.d(config));
                } else {
                    c0Var = null;
                }
                if (c0Var != null && c0Var.a == 0) {
                    z = true;
                } else {
                    if (gVarF != null) {
                        Bitmap.Config config2 = gVarF.a.getConfig();
                        config2.getClass();
                        c0Var2 = new c0(androidx.compose.ui.graphics.h.d(config2));
                    } else {
                        c0Var2 = null;
                    }
                    if (c0Var2 != null && i == c0Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (gVarF != null && cVarA != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e.d() >> 32));
                            Bitmap bitmap = gVarF.a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (dVar.e.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            bVar = uVar3.c;
                            if (bVar == null) {
                                bVar = new androidx.compose.ui.graphics.drawscope.b();
                                uVar3.c = bVar;
                            }
                            c2Var = bVar.y;
                            androidx.compose.ui.graphics.drawscope.a aVar = bVar.e;
                            androidx.compose.ui.graphics.j jVar2 = jVarA3;
                            long jX = coil3.network.g.x(j);
                            androidx.compose.ui.unit.m layoutDirection = dVar.e.getLayoutDirection();
                            androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
                            androidx.compose.ui.unit.c cVar = aVar.a;
                            androidx.compose.ui.unit.m mVar3 = aVar.b;
                            androidx.compose.ui.graphics.r rVar = aVar.c;
                            long j4 = aVar.d;
                            aVar.a = dVar;
                            aVar.b = layoutDirection;
                            aVar.c = cVarA;
                            aVar.d = jX;
                            cVarA.f();
                            androidx.compose.ui.graphics.drawscope.d.p0(bVar2, androidx.compose.ui.graphics.t.b, 0L, jX, 58);
                            f = -f7;
                            f2 = -f6;
                            ((com.google.firebase.platforminfo.c) c2Var.y).r(f, f2);
                            androidx.compose.ui.graphics.drawscope.d.C(bVar2, g0Var.f, p0Var3, 0.0f, new androidx.compose.ui.graphics.drawscope.h(f5, 0.0f, 0, 0, 30), 52);
                            float f12 = 1;
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar2.d() >> 32)) + f12) / Float.intBitsToFloat((int) (bVar2.d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) + f12) / Float.intBitsToFloat((int) (bVar2.d() & 4294967295L));
                            long jI0 = bVar2.i0();
                            androidx.compose.ui.graphics.g gVar = gVarF;
                            androidx.compose.ui.graphics.c cVar2 = cVarA;
                            jH = c2Var.H();
                            c2Var.w().f();
                            ((com.google.firebase.platforminfo.c) c2Var.y).n(fIntBitsToFloat2, fIntBitsToFloat3, jI0);
                            androidx.compose.ui.graphics.drawscope.d.C(bVar2, jVar2, p0Var3, 0.0f, null, 28);
                            c2Var.w().q();
                            c2Var.c0(jH);
                            ((com.google.firebase.platforminfo.c) c2Var.y).r(-f, -f2);
                            cVar2.q();
                            aVar.a = cVar;
                            aVar.b = mVar3;
                            aVar.c = rVar;
                            aVar.d = j4;
                            gVar.a.prepareToDraw();
                            zVar.e = gVar;
                            return dVar.b(new x(cVarC, zVar, j, mVar));
                        }
                        j = jCeil;
                        ((com.google.firebase.platforminfo.c) c2Var.y).n(fIntBitsToFloat2, fIntBitsToFloat3, jI0);
                        androidx.compose.ui.graphics.drawscope.d.C(bVar2, jVar2, p0Var3, 0.0f, null, 28);
                        c2Var.w().q();
                        c2Var.c0(jH);
                        ((com.google.firebase.platforminfo.c) c2Var.y).r(-f, -f2);
                        cVar2.q();
                        aVar.a = cVar;
                        aVar.b = mVar3;
                        aVar.c = rVar;
                        aVar.d = j4;
                        gVar.a.prepareToDraw();
                        zVar.e = gVar;
                        return dVar.b(new x(cVarC, zVar, j, mVar));
                    } catch (Throwable th) {
                        c2Var.w().q();
                        c2Var.c0(jH);
                        throw th;
                    }
                    androidx.compose.ui.graphics.drawscope.d.C(bVar2, g0Var.f, p0Var3, 0.0f, new androidx.compose.ui.graphics.drawscope.h(f5, 0.0f, 0, 0, 30), 52);
                    float f13 = 1;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (bVar2.d() >> 32)) + f13) / Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) + f13) / Float.intBitsToFloat((int) (bVar2.d() & 4294967295L));
                    long jI1 = bVar2.i0();
                    androidx.compose.ui.graphics.g gVar2 = gVarF;
                    androidx.compose.ui.graphics.c cVar3 = cVarA;
                    jH = c2Var.H();
                    c2Var.w().f();
                } catch (Throwable th2) {
                    ((com.google.firebase.platforminfo.c) c2Var.y).r(-f, -f2);
                    throw th2;
                }
                gVarF = a0.f((int) (j >> 32), (int) (j & 4294967295L), i);
                uVar3.a = gVarF;
                cVarA = a0.a(gVarF);
                uVar3.b = cVarA;
                bVar = uVar3.c;
                if (bVar == null) {
                    bVar = new androidx.compose.ui.graphics.drawscope.b();
                    uVar3.c = bVar;
                }
                c2Var = bVar.y;
                androidx.compose.ui.graphics.drawscope.a aVar2 = bVar.e;
                androidx.compose.ui.graphics.j jVar3 = jVarA3;
                long jX2 = coil3.network.g.x(j);
                androidx.compose.ui.unit.m layoutDirection2 = dVar.e.getLayoutDirection();
                androidx.compose.ui.graphics.drawscope.b bVar3 = bVar;
                androidx.compose.ui.unit.c cVar4 = aVar2.a;
                androidx.compose.ui.unit.m mVar4 = aVar2.b;
                androidx.compose.ui.graphics.r rVar2 = aVar2.c;
                long j5 = aVar2.d;
                aVar2.a = dVar;
                aVar2.b = layoutDirection2;
                aVar2.c = cVarA;
                aVar2.d = jX2;
                cVarA.f();
                androidx.compose.ui.graphics.drawscope.d.p0(bVar3, androidx.compose.ui.graphics.t.b, 0L, jX2, 58);
                f = -f7;
                f2 = -f6;
                ((com.google.firebase.platforminfo.c) c2Var.y).r(f, f2);
                break;
            case 3:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.y;
                z1 z1Var = (z1) obj;
                if (vVar.e) {
                    z2 = true;
                } else {
                    z1Var.getClass();
                    if (((q1) z1Var).L) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                vVar.e = z2;
                return Boolean.valueOf(!z2);
            case 4:
                b2 b2Var = (b2) this.y;
                float fFloatValue = ((Float) obj).floatValue();
                e1 e1Var = b2Var.a;
                float fG = e1Var.g() + fFloatValue + b2Var.f;
                float fB = com.google.android.material.resources.c.b(fG, 0.0f, b2Var.e.g());
                boolean z9 = fG == fB;
                float fG2 = fB - e1Var.g();
                int iRound = Math.round(fG2);
                e1Var.h(e1Var.g() + iRound);
                b2Var.f = fG2 - iRound;
                if (!z9) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 5:
                ((t0) this.y).invoke();
                return y.a;
            case 6:
                m2 m2Var = (m2) this.y;
                return new androidx.compose.ui.geometry.b(m2Var.c(m2Var.k, ((androidx.compose.ui.geometry.b) obj).a, m2Var.j));
            case 7:
                Object obj2 = this.y;
                ((Integer) obj).getClass();
                return obj2;
            case 8:
                androidx.compose.foundation.lazy.q qVar = (androidx.compose.foundation.lazy.q) this.y;
                return qVar.w(((Integer) obj).intValue(), qVar.A);
            case 9:
                androidx.compose.foundation.lazy.z zVar2 = (androidx.compose.foundation.lazy.z) this.y;
                float f14 = -((Float) obj).floatValue();
                if ((f14 >= 0.0f || zVar2.d()) && (f14 <= 0.0f || zVar2.b())) {
                    if (Math.abs(zVar2.h) > 0.5f) {
                        androidx.compose.foundation.internal.b.c("entered drag with non-zero pending scroll");
                    }
                    zVar2.d = true;
                    float f15 = zVar2.h + f14;
                    zVar2.h = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = zVar2.h;
                        int iRound2 = Math.round(f16);
                        androidx.compose.foundation.lazy.t tVarF = ((androidx.compose.foundation.lazy.t) zVar2.f.getValue()).f(iRound2, !zVar2.b);
                        if (tVarF != null && (tVar = zVar2.c) != null) {
                            androidx.compose.foundation.lazy.t tVarF2 = tVar.f(iRound2, true);
                            if (tVarF2 != null) {
                                zVar2.c = tVarF2;
                            } else {
                                tVarF = null;
                            }
                        }
                        if (tVarF != null) {
                            zVar2.f(tVarF, zVar2.b, true);
                            zVar2.v.setValue(y.a);
                            zVar2.j(f16 - zVar2.h, tVarF);
                        } else {
                            f0 f0Var = zVar2.k;
                            if (f0Var != null) {
                                f0Var.k();
                            }
                            zVar2.j(f16 - zVar2.h, zVar2.i());
                        }
                    }
                    if (Math.abs(zVar2.h) > 0.5f) {
                        f14 -= zVar2.h;
                        zVar2.h = 0.0f;
                    }
                } else {
                    f14 = 0.0f;
                }
                return Float.valueOf(-f14);
            case 10:
                return Integer.valueOf(((androidx.compose.foundation.lazy.grid.u) this.y).d(((Integer) obj).intValue()));
            case 11:
                androidx.compose.foundation.lazy.grid.x xVar = (androidx.compose.foundation.lazy.grid.x) this.y;
                float f17 = -((Float) obj).floatValue();
                if ((f17 >= 0.0f || xVar.d()) && (f17 <= 0.0f || xVar.b())) {
                    if (Math.abs(xVar.g) > 0.5f) {
                        androidx.compose.foundation.internal.b.c("entered drag with non-zero pending scroll");
                    }
                    float f18 = xVar.g + f17;
                    xVar.g = f18;
                    if (Math.abs(f18) > 0.5f) {
                        float f19 = xVar.g;
                        int iF = kotlin.math.a.F(f19);
                        androidx.compose.foundation.lazy.grid.n nVarF = ((androidx.compose.foundation.lazy.grid.n) xVar.e.getValue()).f(iF, !xVar.b);
                        if (nVarF != null && (nVar = xVar.c) != null) {
                            androidx.compose.foundation.lazy.grid.n nVarF2 = nVar.f(iF, true);
                            if (nVarF2 != null) {
                                xVar.c = nVarF2;
                            } else {
                                nVarF = null;
                            }
                        }
                        if (nVarF != null) {
                            xVar.f(nVarF, xVar.b, true);
                            xVar.r.setValue(y.a);
                            xVar.i(f19 - xVar.g, nVarF);
                        } else {
                            f0 f0Var2 = xVar.j;
                            if (f0Var2 != null) {
                                f0Var2.k();
                            }
                            xVar.i(f19 - xVar.g, xVar.h());
                        }
                    }
                    if (Math.abs(xVar.g) > 0.5f) {
                        f17 -= xVar.g;
                        xVar.g = 0.0f;
                    }
                } else {
                    f17 = 0.0f;
                }
                return Float.valueOf(-f17);
            case 12:
                return new d((w) this.y, 1);
            case 13:
                return new d((androidx.compose.foundation.lazy.layout.h0) this.y, 3);
            case 14:
                androidx.compose.runtime.saveable.h hVar3 = (androidx.compose.runtime.saveable.h) this.y;
                return Boolean.valueOf(hVar3 != null ? hVar3.a(obj) : true);
            case 15:
                androidx.compose.ui.semantics.x xVar2 = (androidx.compose.ui.semantics.x) this.y;
                Boolean boolA = ((androidx.compose.ui.autofill.g) ((androidx.compose.ui.autofill.q) obj)).a();
                if (boolA != null) {
                    androidx.compose.ui.semantics.v.e(xVar2, boolA.booleanValue() ? androidx.compose.ui.state.a.e : androidx.compose.ui.state.a.y);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 16:
                ((androidx.compose.ui.semantics.x) obj).b(j0.c, new androidx.compose.foundation.text.selection.i0(androidx.compose.foundation.text.f0.e, ((androidx.compose.foundation.text.selection.m) this.y).a(), androidx.compose.foundation.text.selection.h0.y, true));
                return y.a;
            case 17:
                i1 i1Var = (i1) this.y;
                float fFloatValue2 = ((Float) obj).floatValue();
                d1 d1Var = i1Var.a;
                float fG3 = d1Var.g() + fFloatValue2;
                d1 d1Var2 = i1Var.b;
                if (fG3 > d1Var2.g()) {
                    fFloatValue2 = d1Var2.g() - d1Var.g();
                } else if (fG3 < 0.0f) {
                    fFloatValue2 = -d1Var.g();
                }
                d1Var.h(d1Var.g() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 18:
                Drawable drawable = (Drawable) this.y;
                androidx.compose.ui.graphics.drawscope.d dVar3 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.ui.graphics.r rVarW = dVar3.b0().w();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar3.d() >> 32)), (int) Float.intBitsToFloat((int) (dVar3.d() & 4294967295L)));
                drawable.draw(androidx.compose.ui.graphics.d.a(rVarW));
                return y.a;
            case 19:
                androidx.compose.foundation.text.contextmenu.modifier.c cVar5 = (androidx.compose.foundation.text.contextmenu.modifier.c) this.y;
                cVar5.N.invoke((androidx.compose.foundation.text.contextmenu.builder.a) obj, androidx.compose.ui.node.k.h(cVar5, m0.b));
                return y.a;
            case 20:
                ((kotlin.jvm.functions.l) obj).invoke((androidx.compose.foundation.text.contextmenu.builder.a) this.y);
                return y.a;
            case 21:
                g gVar3 = (g) this.y;
                z1 z1Var2 = (z1) obj;
                if (z1Var2 instanceof androidx.compose.foundation.text.contextmenu.modifier.a) {
                    gVar3.invoke(((androidx.compose.foundation.text.contextmenu.modifier.a) z1Var2).L);
                    return Boolean.TRUE;
                }
                net.luminis.tls.engine.impl.c.r("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 22:
                return new d((androidx.compose.foundation.text.contextmenu.provider.c) this.y, 6);
            case 23:
                ((androidx.compose.foundation.text.input.internal.x) this.y).a((androidx.compose.ui.text.input.g) obj);
                return y.a;
            case 24:
                q0 q0Var = (q0) this.y;
                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) obj;
                long j6 = vVar2.c;
                c1 c1Var = (c1) q0Var.A;
                if (!c1Var.k() || c1Var.n().a.y.length() == 0 || (r0Var = c1Var.d) == null || r0Var.d() == null) {
                    z4 = false;
                } else {
                    q0Var.g(c1Var.n(), j6, false, androidx.compose.foundation.text.selection.a0.d);
                    z4 = true;
                }
                if (z4) {
                    vVar2.a();
                }
                return y.a;
            case 25:
                ((androidx.compose.runtime.y) this.y).z(obj);
                return y.a;
            case 26:
                w1 w1Var = (w1) this.y;
                Throwable th3 = (Throwable) obj;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th3);
                synchronized (w1Var.c) {
                    try {
                        Job job = w1Var.d;
                        if (job != null) {
                            w1Var.u.setValue(s1.y);
                            job.cancel(CancellationException);
                            w1Var.r = null;
                            job.invokeOnCompletion(new h(29, w1Var, th3));
                        } else {
                            w1Var.e = CancellationException;
                            w1Var.u.setValue(s1.e);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return y.a;
            case 27:
                androidx.collection.p0 p0Var4 = (androidx.collection.p0) this.y;
                if (obj instanceof androidx.compose.runtime.snapshots.x) {
                    ((androidx.compose.runtime.snapshots.x) obj).f(4);
                }
                p0Var4.a(obj);
                return y.a;
            case 28:
                androidx.compose.runtime.saveable.h hVar4 = ((androidx.compose.runtime.saveable.e) this.y).z;
                return Boolean.valueOf(hVar4 != null ? hVar4.a(obj) : true);
            default:
                androidx.compose.runtime.snapshots.t tVar2 = (androidx.compose.runtime.snapshots.t) this.y;
                synchronized (tVar2.g) {
                    androidx.compose.runtime.snapshots.s sVar = tVar2.i;
                    sVar.getClass();
                    Object obj3 = sVar.b;
                    obj3.getClass();
                    int i2 = sVar.d;
                    androidx.collection.f0 f0Var3 = sVar.c;
                    if (f0Var3 == null) {
                        f0Var3 = new androidx.collection.f0();
                        sVar.c = f0Var3;
                        sVar.f.m(obj3, f0Var3);
                    }
                    sVar.b(obj, i2, obj3, f0Var3);
                }
                return y.a;
        }
    }

    public /* synthetic */ g(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
