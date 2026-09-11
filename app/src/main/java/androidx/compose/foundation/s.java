package androidx.compose.foundation;

import android.os.Build;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import androidx.compose.material3.v2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final a0 a(float f, long j) {
        return new a0(f, new androidx.compose.ui.graphics.p0(j));
    }

    public static final void b(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar, androidx.compose.runtime.r rVar2, int i) {
        int i2;
        rVar2.c0(-932836462);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (rVar2.h(lVar) ? 32 : 16);
        if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.ui.draw.h.c(rVar, lVar));
        } else {
            rVar2.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.v1(rVar, lVar, i, 1);
        }
    }

    public static final void c(final androidx.compose.ui.graphics.painter.b bVar, final androidx.compose.ui.r rVar, androidx.compose.ui.e eVar, androidx.compose.ui.layout.j jVar, float f, androidx.compose.runtime.r rVar2, final int i) {
        final float f2;
        rVar2.c0(1142754848);
        int i2 = (rVar2.h(bVar) ? 4 : 2) | i | 1797120;
        if (rVar2.T(i2 & 1, (599187 & i2) != 599186)) {
            eVar = androidx.compose.ui.c.B;
            rVar2.b0(1899222916);
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = new androidx.compose.animation.core.n1(22);
                rVar2.l0(objQ);
            }
            androidx.compose.ui.r rVarA = androidx.compose.ui.semantics.n.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ);
            rVar2.p(false);
            androidx.compose.ui.r rVarF = androidx.compose.ui.draw.h.f(androidx.compose.ui.draw.h.b(rVar.d(rVarA)), bVar, 1.0f, null, 2);
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = z0.a;
                rVar2.l0(objQ2);
            }
            androidx.compose.ui.layout.q0 q0Var = (androidx.compose.ui.layout.q0) objQ2;
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarF);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0Var, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            rVar2.p(true);
            jVar = androidx.compose.ui.layout.i.b;
            f2 = 1.0f;
        } else {
            rVar2.W();
            f2 = f;
        }
        final androidx.compose.ui.e eVar2 = eVar;
        final androidx.compose.ui.layout.j jVar2 = jVar;
        androidx.compose.runtime.q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(rVar, eVar2, jVar2, f2, i) { // from class: androidx.compose.foundation.y0
                public final /* synthetic */ androidx.compose.ui.layout.j A;
                public final /* synthetic */ float B;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ androidx.compose.ui.e z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(441);
                    s.c(this.e, this.y, this.z, this.A, this.B, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2, androidx.compose.ui.unit.c cVar) {
        float f3 = o0.a;
        double dA = cVar.a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) o0.a) * dA;
        float fExp = (float) (Math.exp((o0.b / o0.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? q.b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iF = kotlin.math.a.F(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iF);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iF);
        }
        return f;
    }

    public static androidx.compose.ui.r e(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.e0 e0Var) {
        return rVar.d(new r(0L, e0Var, androidx.compose.ui.graphics.a0.b, 1));
    }

    public static final androidx.compose.ui.r f(androidx.compose.ui.r rVar, long j, androidx.compose.ui.graphics.n0 n0Var) {
        return rVar.d(new r(j, null, n0Var, 2));
    }

    public static final androidx.compose.ui.r g(androidx.compose.ui.r rVar, float f, long j, androidx.compose.ui.graphics.n0 n0Var) {
        return rVar.d(new z(f, new androidx.compose.ui.graphics.p0(j), n0Var));
    }

    public static final void h(long j, androidx.compose.foundation.gestures.k1 k1Var) {
        if (k1Var == androidx.compose.foundation.gestures.k1.e) {
            if (androidx.compose.ui.unit.a.g(j) != Integer.MAX_VALUE) {
                return;
            }
            androidx.compose.foundation.internal.b.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (androidx.compose.ui.unit.a.h(j) != Integer.MAX_VALUE) {
                return;
            }
            androidx.compose.foundation.internal.b.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static androidx.compose.ui.r i(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, v2 v2Var, boolean z, androidx.compose.ui.semantics.h hVar, kotlin.jvm.functions.a aVar, int i) {
        androidx.compose.ui.r rVarD;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            hVar = null;
        }
        androidx.compose.ui.semantics.h hVar2 = hVar;
        if (v2Var != null) {
            rVarD = new b0(kVar, v2Var, false, z2, null, hVar2, aVar);
        } else if (v2Var == null) {
            rVarD = new b0(kVar, null, false, z2, null, hVar2, aVar);
        } else {
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            rVarD = kVar != null ? a1.a(oVar, kVar, v2Var).d(new b0(kVar, null, false, z2, null, hVar2, aVar)) : androidx.compose.ui.a.a(oVar, new c0(v2Var, z2, hVar2, aVar));
        }
        return rVar.d(rVarD);
    }

    public static androidx.compose.ui.r j(androidx.compose.ui.r rVar, boolean z, String str, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return rVar.d(new b0(null, null, true, z2, str, null, aVar));
    }

    public static androidx.compose.ui.r k(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        return rVar.d(new g0(kVar, aVar2, aVar));
    }

    public static final androidx.compose.ui.r l(androidx.compose.ui.r rVar, boolean z, androidx.compose.foundation.interaction.k kVar) {
        return rVar.d(z ? new q0(kVar) : androidx.compose.ui.o.b);
    }

    public static /* synthetic */ androidx.compose.ui.r m(androidx.compose.ui.r rVar, androidx.compose.foundation.interaction.k kVar, int i) {
        if ((i & 2) != 0) {
            kVar = null;
        }
        return l(rVar, true, kVar);
    }

    public static final boolean n(KeyEvent keyEvent) {
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        int i = androidx.compose.ui.input.key.a.F;
        return androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.h) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.r) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.E) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.q);
    }

    public static final b2 o(androidx.compose.runtime.r rVar) {
        Object[] objArr = new Object[0];
        boolean zD = rVar.d(0);
        Object objQ = rVar.Q();
        if (zD || objQ == androidx.compose.runtime.m.a) {
            objQ = new androidx.activity.compose.b(8);
            rVar.l0(objQ);
        }
        return (b2) androidx.compose.runtime.saveable.n.c(objArr, b2.j, (kotlin.jvm.functions.a) objQ, rVar, 0);
    }

    public static androidx.compose.ui.r p(androidx.compose.ui.r rVar, b2 b2Var, boolean z) {
        androidx.compose.foundation.gestures.k1 k1Var = androidx.compose.foundation.gestures.k1.e;
        androidx.compose.foundation.gestures.k1 k1Var2 = z ? k1Var : androidx.compose.foundation.gestures.k1.y;
        androidx.compose.foundation.interaction.k kVar = b2Var.d;
        float f = f0.a;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        return rVar.d(k1Var2 == k1Var ? androidx.compose.ui.draw.h.a(oVar, x0.c) : androidx.compose.ui.draw.h.a(oVar, x0.b)).d(new c2(null, null, k1Var2, b2Var, kVar, true, true)).d(new e2(b2Var, z));
    }

    public static androidx.compose.ui.r q(androidx.compose.ui.r rVar, androidx.compose.foundation.gestures.g2 g2Var, androidx.compose.foundation.gestures.k1 k1Var, n nVar, boolean z, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.interaction.k kVar) {
        float f = f0.a;
        androidx.compose.foundation.gestures.k1 k1Var2 = androidx.compose.foundation.gestures.k1.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        return rVar.d(k1Var == k1Var2 ? androidx.compose.ui.draw.h.a(oVar, x0.c) : androidx.compose.ui.draw.h.a(oVar, x0.b)).d(new c2(nVar, lVar, k1Var, g2Var, kVar, z, false));
    }

    public static final long r(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
