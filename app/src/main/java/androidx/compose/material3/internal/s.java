package androidx.compose.material3.internal;

import androidx.compose.animation.core.a2;
import androidx.compose.runtime.t2;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.m0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements kotlin.jvm.functions.p {
    public final /* synthetic */ t2 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ t2 C;
    public final /* synthetic */ kotlin.jvm.functions.q D;
    public final /* synthetic */ w E;
    public final /* synthetic */ m0 e;
    public final /* synthetic */ m0 y;
    public final /* synthetic */ t2 z;

    public s(m0 m0Var, m0 m0Var2, a2 a2Var, a2 a2Var2, boolean z, a2 a2Var3, kotlin.jvm.functions.q qVar, w wVar) {
        this.e = m0Var;
        this.y = m0Var2;
        this.z = a2Var;
        this.A = a2Var2;
        this.B = z;
        this.C = a2Var3;
        this.D = qVar;
        this.E = wVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.text.v vVar;
        androidx.compose.ui.text.u uVar;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fFloatValue = ((Number) this.z.getValue()).floatValue();
            m0 m0Var = this.e;
            e0 e0Var = m0Var.a;
            m0 m0Var2 = this.y;
            e0 e0Var2 = m0Var2.a;
            androidx.compose.ui.text.style.o oVar = f0.d;
            androidx.compose.ui.text.style.o oVar2 = e0Var.a;
            androidx.compose.ui.text.style.o oVar3 = e0Var2.a;
            boolean z = oVar2 instanceof androidx.compose.ui.text.style.b;
            androidx.compose.ui.text.style.o bVar = androidx.compose.ui.text.style.n.a;
            if (!z && !(oVar3 instanceof androidx.compose.ui.text.style.b)) {
                long jS = androidx.compose.ui.graphics.a0.s(oVar2.b(), oVar3.b(), fFloatValue);
                if (jS != 16) {
                    bVar = new androidx.compose.ui.text.style.c(jS);
                }
            } else if (z && (oVar3 instanceof androidx.compose.ui.text.style.b)) {
                androidx.compose.ui.text.style.b bVar2 = (androidx.compose.ui.text.style.b) oVar2;
                androidx.compose.ui.text.style.b bVar3 = (androidx.compose.ui.text.style.b) oVar3;
                androidx.compose.ui.graphics.p pVar = (androidx.compose.ui.graphics.p) f0.b(bVar2.a, bVar3.a, fFloatValue);
                float fA = com.google.firebase.b.A(bVar2.b, bVar3.b, fFloatValue);
                if (pVar != null) {
                    if (pVar instanceof p0) {
                        long jZ = kotlin.math.a.z(fA, ((p0) pVar).a);
                        if (jZ != 16) {
                            bVar = new androidx.compose.ui.text.style.c(jZ);
                        }
                    } else {
                        if (!(pVar instanceof l0)) {
                            coil3.g.a();
                            return null;
                        }
                        bVar = new androidx.compose.ui.text.style.b((l0) pVar, fA);
                    }
                }
            } else {
                bVar = (androidx.compose.ui.text.style.o) f0.b(oVar2, oVar3, fFloatValue);
            }
            androidx.compose.ui.text.style.o oVar4 = bVar;
            androidx.compose.ui.text.font.s sVar = (androidx.compose.ui.text.font.s) f0.b(e0Var.f, e0Var2.f, fFloatValue);
            long jC = f0.c(e0Var.b, e0Var2.b, fFloatValue);
            androidx.compose.ui.text.font.l lVar = e0Var.c;
            if (lVar == null) {
                lVar = androidx.compose.ui.text.font.l.z;
            }
            androidx.compose.ui.text.font.l lVar2 = e0Var2.c;
            if (lVar2 == null) {
                lVar2 = androidx.compose.ui.text.font.l.z;
            }
            androidx.compose.ui.text.font.l lVar3 = new androidx.compose.ui.text.font.l(com.google.android.material.resources.c.c(com.google.firebase.b.B(fFloatValue, lVar.e, lVar2.e), 1, 1000));
            androidx.compose.ui.text.font.j jVar = (androidx.compose.ui.text.font.j) f0.b(e0Var.d, e0Var2.d, fFloatValue);
            androidx.compose.ui.text.font.k kVar = (androidx.compose.ui.text.font.k) f0.b(e0Var.e, e0Var2.e, fFloatValue);
            String str = (String) f0.b(e0Var.g, e0Var2.g, fFloatValue);
            long jC2 = f0.c(e0Var.h, e0Var2.h, fFloatValue);
            androidx.compose.ui.text.style.a aVar = e0Var.i;
            float f = aVar != null ? aVar.a : 0.0f;
            androidx.compose.ui.text.style.a aVar2 = e0Var2.i;
            float fA2 = com.google.firebase.b.A(f, aVar2 != null ? aVar2.a : 0.0f, fFloatValue);
            androidx.compose.ui.text.style.p pVar2 = e0Var.j;
            androidx.compose.ui.text.style.p pVar3 = androidx.compose.ui.text.style.p.c;
            if (pVar2 == null) {
                pVar2 = pVar3;
            }
            androidx.compose.ui.text.style.p pVar4 = e0Var2.j;
            if (pVar4 != null) {
                pVar3 = pVar4;
            }
            androidx.compose.ui.text.style.p pVar5 = new androidx.compose.ui.text.style.p(com.google.firebase.b.A(pVar2.a, pVar3.a, fFloatValue), com.google.firebase.b.A(pVar2.b, pVar3.b, fFloatValue));
            androidx.compose.ui.text.intl.b bVar4 = (androidx.compose.ui.text.intl.b) f0.b(e0Var.k, e0Var2.k, fFloatValue);
            long jS2 = androidx.compose.ui.graphics.a0.s(e0Var.l, e0Var2.l, fFloatValue);
            androidx.compose.ui.text.style.l lVar4 = (androidx.compose.ui.text.style.l) f0.b(e0Var.m, e0Var2.m, fFloatValue);
            androidx.compose.ui.graphics.m0 m0Var3 = e0Var.n;
            if (m0Var3 == null) {
                m0Var3 = new androidx.compose.ui.graphics.m0();
            }
            androidx.compose.ui.graphics.m0 m0Var4 = e0Var2.n;
            if (m0Var4 == null) {
                m0Var4 = new androidx.compose.ui.graphics.m0();
            }
            long jS3 = androidx.compose.ui.graphics.a0.s(m0Var3.a, m0Var4.a, fFloatValue);
            long j = m0Var3.b;
            long j2 = m0Var4.b;
            androidx.compose.ui.graphics.m0 m0Var5 = new androidx.compose.ui.graphics.m0(jS3, (((long) Float.floatToRawIntBits(com.google.firebase.b.A(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), fFloatValue))) << 32) | (((long) Float.floatToRawIntBits(com.google.firebase.b.A(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), fFloatValue))) & 4294967295L), com.google.firebase.b.A(m0Var3.c, m0Var4.c, fFloatValue));
            androidx.compose.ui.text.v vVar2 = e0Var.o;
            androidx.compose.ui.text.v vVar3 = e0Var2.o;
            if (vVar2 == null && vVar3 == null) {
                vVar = null;
            } else {
                if (vVar2 == null) {
                    vVar2 = androidx.compose.ui.text.v.a;
                }
                vVar = vVar2;
            }
            e0 e0Var3 = new e0(oVar4, jC, lVar3, jVar, kVar, sVar, str, jC2, new androidx.compose.ui.text.style.a(fA2), pVar5, bVar4, jS2, lVar4, m0Var5, vVar, (androidx.compose.ui.graphics.drawscope.e) f0.b(e0Var.p, e0Var2.p, fFloatValue));
            androidx.compose.ui.text.s sVar2 = m0Var.b;
            androidx.compose.ui.text.s sVar3 = m0Var2.b;
            int i = androidx.compose.ui.text.t.b;
            int i2 = ((androidx.compose.ui.text.style.k) f0.b(new androidx.compose.ui.text.style.k(sVar2.a), new androidx.compose.ui.text.style.k(sVar3.a), fFloatValue)).a;
            int i3 = ((androidx.compose.ui.text.style.m) f0.b(new androidx.compose.ui.text.style.m(sVar2.b), new androidx.compose.ui.text.style.m(sVar3.b), fFloatValue)).a;
            long jC3 = f0.c(sVar2.c, sVar3.c, fFloatValue);
            androidx.compose.ui.text.style.q qVar = sVar2.d;
            if (qVar == null) {
                qVar = androidx.compose.ui.text.style.q.c;
            }
            androidx.compose.ui.text.style.q qVar2 = sVar3.d;
            if (qVar2 == null) {
                qVar2 = androidx.compose.ui.text.style.q.c;
            }
            androidx.compose.ui.text.style.q qVar3 = new androidx.compose.ui.text.style.q(f0.c(qVar.a, qVar2.a, fFloatValue), f0.c(qVar.b, qVar2.b, fFloatValue));
            androidx.compose.ui.text.u uVar2 = sVar2.e;
            androidx.compose.ui.text.u uVar3 = sVar3.e;
            if (uVar2 == null && uVar3 == null) {
                uVar = null;
            } else {
                androidx.compose.ui.text.u uVar4 = androidx.compose.ui.text.u.c;
                androidx.compose.ui.text.u uVar5 = uVar2 == null ? uVar4 : uVar2;
                boolean z2 = uVar5.a;
                if (uVar3 == null) {
                    uVar3 = uVar4;
                }
                boolean z3 = uVar3.a;
                uVar = z2 == z3 ? uVar5 : new androidx.compose.ui.text.u(((androidx.compose.ui.text.j) f0.b(new androidx.compose.ui.text.j(uVar5.b), new androidx.compose.ui.text.j(uVar3.b), fFloatValue)).a, ((Boolean) f0.b(Boolean.valueOf(z2), Boolean.valueOf(z3), fFloatValue)).booleanValue());
            }
            m0 m0Var6 = new m0(e0Var3, new androidx.compose.ui.text.s(i2, i3, jC3, qVar3, uVar, (androidx.compose.ui.text.style.i) f0.b(sVar2.f, sVar3.f, fFloatValue), ((androidx.compose.ui.text.style.e) f0.b(new androidx.compose.ui.text.style.e(sVar2.g), new androidx.compose.ui.text.style.e(sVar3.g), fFloatValue)).a, ((androidx.compose.ui.text.style.d) f0.b(new androidx.compose.ui.text.style.d(sVar2.h), new androidx.compose.ui.text.style.d(sVar3.h), fFloatValue)).a, (androidx.compose.ui.text.style.s) f0.b(sVar2.i, sVar3.i, fFloatValue)));
            if (this.B) {
                m0Var6 = m0.a(m0Var6, ((androidx.compose.ui.graphics.t) this.C.getValue()).a, 0L, null, null, 0L, 0L, null, 16777214);
            }
            z.b(((androidx.compose.ui.graphics.t) this.A.getValue()).a, m0Var6, androidx.compose.runtime.internal.k.c(1157484991, new androidx.compose.material3.y(this.D, this.E), rVar), rVar, 384);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
