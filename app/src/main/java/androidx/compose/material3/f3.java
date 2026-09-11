package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f3 {
    public static final androidx.compose.runtime.b0 a = new androidx.compose.runtime.b0(new androidx.activity.compose.b(25));

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f, float f2, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        if ((i2 & 1) != 0) {
            rVar = androidx.compose.ui.o.b;
        }
        androidx.compose.ui.r rVar3 = rVar;
        long jB = (i2 & 8) != 0 ? o0.b(j, rVar2) : j2;
        float f3 = (i2 & 16) != 0 ? 0 : f;
        float f4 = (i2 & 32) != 0 ? 0 : f2;
        androidx.compose.runtime.b0 b0Var = a;
        float f5 = ((androidx.compose.ui.unit.f) rVar2.j(b0Var)).e + f3;
        androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{q0.a.a(new androidx.compose.ui.graphics.t(jB)), b0Var.a(new androidx.compose.ui.unit.f(f5))}, androidx.compose.runtime.internal.k.c(421772006, new c3(rVar3, n0Var, j, f5, null, f4, fVar), rVar2), rVar2, 56);
    }

    public static final void b(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f, androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar2, int i, int i2) {
        androidx.compose.foundation.interaction.k kVar2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? o0.b(j, rVar2) : j2;
        float f2 = 0;
        float f3 = (i2 & 128) != 0 ? 0 : f;
        androidx.compose.foundation.a0 a0Var2 = (i2 & LibretroCore.SCREEN_WIDTH) != 0 ? null : a0Var;
        if (kVar == null) {
            rVar2.b0(-1701037204);
            Object objQ = rVar2.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            rVar2.p(false);
            kVar2 = (androidx.compose.foundation.interaction.k) objQ;
        } else {
            rVar2.b0(2023337163);
            rVar2.p(false);
            kVar2 = kVar;
        }
        androidx.compose.runtime.b0 b0Var = a;
        float f4 = ((androidx.compose.ui.unit.f) rVar2.j(b0Var)).e + f2;
        androidx.compose.runtime.s.b(new androidx.appcompat.widget.r[]{q0.a.a(new androidx.compose.ui.graphics.t(jB)), b0Var.a(new androidx.compose.ui.unit.f(f4))}, androidx.compose.runtime.internal.k.c(849208527, new d3(rVar, n0Var, j, f4, a0Var2, kVar2, z2, aVar, f3, fVar), rVar2), rVar2, 56);
    }

    public static final androidx.compose.ui.r c(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, androidx.compose.foundation.a0 a0Var, float f) {
        androidx.compose.ui.r rVarP;
        androidx.compose.ui.r zVar = androidx.compose.ui.o.b;
        if (f > 0.0f) {
            long j2 = androidx.compose.ui.graphics.q0.b;
            long j3 = androidx.compose.ui.graphics.b0.a;
            rVarP = androidx.compose.ui.graphics.a0.p(zVar, 1.0f, f, j2, n0Var, false, j3, j3);
        } else {
            rVarP = zVar;
        }
        androidx.compose.ui.r rVarD = rVar.d(rVarP);
        if (a0Var != null) {
            zVar = new androidx.compose.foundation.z(a0Var.a, a0Var.b, n0Var);
        }
        return androidx.compose.ui.draw.h.a(androidx.compose.foundation.s.f(rVarD.d(zVar), j, n0Var), n0Var);
    }

    public static final long d(long j, float f, androidx.compose.runtime.r rVar) {
        n0 n0Var = (n0) rVar.j(o0.a);
        boolean zBooleanValue = ((Boolean) rVar.j(o0.b)).booleanValue();
        long j2 = n0Var.p;
        if (androidx.compose.ui.graphics.t.c(j, j2) && zBooleanValue) {
            return androidx.compose.ui.unit.f.d(f, (float) 0) ? j2 : androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, n0Var.t), j2);
        }
        return j;
    }
}
