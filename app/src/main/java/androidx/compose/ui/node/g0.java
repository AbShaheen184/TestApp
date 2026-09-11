package androidx.compose.ui.node;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final androidx.compose.ui.layout.c1 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public a f;
    public final /* synthetic */ int h;
    public boolean b = true;
    public final HashMap g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i) {
        this.h = i;
        this.a = (androidx.compose.ui.layout.c1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.layout.c1, androidx.compose.ui.node.a] */
    public static final void a(g0 g0Var, androidx.compose.ui.layout.a aVar, int i, d1 d1Var) {
        HashMap map = g0Var.g;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jA = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (g0Var.h) {
                    case 0:
                        l1 l1Var = d1Var.i0;
                        if (l1Var != null) {
                            androidx.compose.ui.platform.q1 q1Var = (androidx.compose.ui.platform.q1) l1Var;
                            float[] fArrB = q1Var.b();
                            if (!q1Var.P) {
                                jA = androidx.compose.ui.graphics.f0.b(jA, fArrB);
                            }
                        }
                        jA = android.support.v4.media.session.b.A(jA, d1Var.W);
                        break;
                    default:
                        o0 o0VarR0 = d1Var.R0();
                        o0VarR0.getClass();
                        long j = o0VarR0.M;
                        jA = androidx.compose.ui.geometry.b.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jA);
                        break;
                }
                d1Var = d1Var.N;
                d1Var.getClass();
                if (d1Var.equals(g0Var.a.g())) {
                    int iRound = Math.round(aVar instanceof androidx.compose.ui.layout.n ? Float.intBitsToFloat((int) (jA & 4294967295L)) : Float.intBitsToFloat((int) (jA >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) kotlin.collections.a0.r(aVar, map)).intValue();
                        androidx.compose.ui.layout.n nVar = androidx.compose.ui.layout.d.a;
                        iRound = ((Number) aVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!g0Var.b(d1Var).containsKey(aVar));
            float fC = g0Var.c(d1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(d1 d1Var) {
        switch (this.h) {
            case 0:
                return d1Var.B0().c();
            default:
                o0 o0VarR0 = d1Var.R0();
                o0VarR0.getClass();
                return o0VarR0.B0().c();
        }
    }

    public final int c(d1 d1Var, androidx.compose.ui.layout.a aVar) {
        switch (this.h) {
            case 0:
                return d1Var.u0(aVar);
            default:
                o0 o0VarR0 = d1Var.R0();
                o0VarR0.getClass();
                return o0VarR0.u0(aVar);
        }
    }

    public final boolean d() {
        return this.c || this.d || this.e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.c1, androidx.compose.ui.node.a] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        a aVarK = r0.k();
        if (aVarK == null) {
            return;
        }
        if (this.c) {
            aVarK.requestLayout();
        }
        if (this.d) {
            r0.X();
        }
        if (this.e) {
            r0.requestLayout();
        }
        aVarK.c().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.layout.c1, androidx.compose.ui.node.a] */
    public final void g() {
        HashMap map = this.g;
        map.clear();
        androidx.compose.animation.e eVar = new androidx.compose.animation.e(this, 10);
        ?? r2 = this.a;
        r2.I(eVar);
        map.putAll(b(r2.g()));
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.layout.c1, androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        a aVar;
        g0 g0VarC;
        g0 g0VarC2;
        boolean zD = d();
        ?? r1 = this.a;
        ?? r2 = r1;
        if (!zD) {
            a aVarK = r1.k();
            if (aVarK == null) {
                return;
            }
            aVar = aVarK.c().f;
            if (aVar == null || !aVar.c().d()) {
                r2 = aVar;
                a aVar2 = this.f;
                if (aVar2 == null || aVar2.c().d()) {
                    return;
                }
                a aVarK2 = aVar2.k();
                if (aVarK2 != null && (g0VarC2 = aVarK2.c()) != null) {
                    g0VarC2.h();
                }
                a aVarK3 = aVar2.k();
                r2 = (aVarK3 == null || (g0VarC = aVarK3.c()) == null) ? 0 : g0VarC.f;
            }
        }
        r2 = aVar;
        this.f = r2;
    }
}
