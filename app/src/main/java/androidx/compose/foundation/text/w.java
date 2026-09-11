package androidx.compose.foundation.text;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements androidx.compose.ui.layout.q0 {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ kotlin.jvm.functions.l b;
    public final /* synthetic */ androidx.compose.ui.text.input.x c;
    public final /* synthetic */ androidx.compose.ui.text.input.q d;
    public final /* synthetic */ androidx.compose.ui.unit.c e;
    public final /* synthetic */ int f;

    public w(r0 r0Var, kotlin.jvm.functions.l lVar, androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.q qVar, androidx.compose.ui.unit.c cVar, int i) {
        this.a = r0Var;
        this.b = lVar;
        this.c = xVar;
        this.d = qVar;
        this.e = cVar;
        this.f = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        r0 r0Var;
        androidx.compose.ui.text.j0 j0Var;
        androidx.compose.ui.text.j0 j0Var2;
        androidx.compose.ui.text.j0 j0Var3;
        w wVar;
        r0 r0Var2;
        int i;
        int iJ;
        androidx.compose.ui.layout.x xVar;
        r0 r0Var3 = this.a;
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            k1 k1VarD = r0Var3.d();
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            androidx.compose.ui.text.j0 j0Var4 = k1VarD != null ? k1VarD.a : null;
            w0 w0Var = r0Var3.a;
            androidx.compose.ui.unit.m layoutDirection = s0Var.getLayoutDirection();
            int i2 = w0Var.f;
            boolean z = w0Var.e;
            int i3 = w0Var.c;
            if (j0Var4 != null) {
                androidx.compose.ui.text.n nVar = j0Var4.b;
                androidx.compose.ui.text.i0 i0Var = j0Var4.a;
                androidx.compose.ui.text.g gVar = w0Var.a;
                androidx.compose.ui.text.m0 m0Var = w0Var.b;
                List list2 = w0Var.i;
                androidx.compose.ui.unit.c cVar = w0Var.g;
                androidx.compose.ui.text.font.d dVar = w0Var.h;
                androidx.compose.ui.text.j0 j0Var5 = j0Var4;
                if (!nVar.a.a()) {
                    androidx.compose.ui.text.g gVar2 = i0Var.a;
                    r0Var = r0Var3;
                    long j2 = i0Var.j;
                    if (kotlin.jvm.internal.l.a(gVar2, gVar) && i0Var.b.c(m0Var) && kotlin.jvm.internal.l.a(i0Var.c, list2) && i0Var.d == i3 && i0Var.e == z && i0Var.f == i2 && kotlin.jvm.internal.l.a(i0Var.g, cVar) && i0Var.h == layoutDirection && kotlin.jvm.internal.l.a(i0Var.i, dVar) && androidx.compose.ui.unit.a.j(j) == androidx.compose.ui.unit.a.j(j2) && ((!z && i2 != 2) || (androidx.compose.ui.unit.a.h(j) == androidx.compose.ui.unit.a.h(j2) && androidx.compose.ui.unit.a.g(j) == androidx.compose.ui.unit.a.g(j2)))) {
                        j0Var3 = new androidx.compose.ui.text.j0(new androidx.compose.ui.text.i0(i0Var.a, w0Var.b, i0Var.c, i0Var.d, i0Var.e, i0Var.f, i0Var.g, i0Var.h, i0Var.i, j), nVar, androidx.compose.ui.unit.b.d(j, (((long) n0.j(nVar.e)) & 4294967295L) | (((long) n0.j(nVar.d)) << 32)));
                        j0Var2 = j0Var5;
                    }
                    long j3 = j0Var3.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (kotlin.jvm.internal.l.a(j0Var2, j0Var3)) {
                        wVar = this;
                        r0Var2 = r0Var;
                        i = 0;
                    } else {
                        if (k1VarD != 0) {
                            xVar = k1VarD.c;
                        } else {
                            xVar = null;
                        }
                        r0Var2 = r0Var;
                        r0Var2.i.setValue(new k1(j0Var3, xVar));
                        i = 0;
                        r0Var2.p = false;
                        wVar = this;
                        wVar.b.invoke(j0Var3);
                        n0.q(r0Var2, wVar.c, wVar.d);
                    }
                    if (wVar.f == 1) {
                        iJ = n0.j(j0Var3.b.b(i));
                    } else {
                        iJ = i;
                    }
                    r0Var2.g.setValue(new androidx.compose.ui.unit.f(wVar.e.L(iJ)));
                    return s0Var.q(iIntValue, iIntValue2, kotlin.collections.a0.v(new kotlin.k(androidx.compose.ui.layout.d.a, Integer.valueOf(Math.round(j0Var3.d))), new kotlin.k(androidx.compose.ui.layout.d.b, Integer.valueOf(Math.round(j0Var3.e)))), new androidx.compose.animation.core.n1(23));
                }
                r0Var = r0Var3;
                j0Var = j0Var5;
            } else {
                j = j;
                r0Var = r0Var3;
                j0Var = j0Var4;
            }
            w0Var.a(layoutDirection);
            int iJ2 = androidx.compose.ui.unit.a.j(j);
            int iH = ((z || i2 == 2) && androidx.compose.ui.unit.a.d(j)) ? androidx.compose.ui.unit.a.h(j) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (iJ2 != iH) {
                androidx.compose.runtime.internal.c cVar2 = w0Var.j;
                if (cVar2 == null) {
                    net.luminis.tls.engine.impl.c.r("layoutIntrinsics must be called first");
                    return null;
                }
                iH = com.google.android.material.resources.c.c(n0.j(cVar2.c()), iJ2, iH);
            }
            androidx.compose.runtime.internal.c cVar3 = w0Var.j;
            if (cVar3 == null) {
                net.luminis.tls.engine.impl.c.r("layoutIntrinsics must be called first");
                return null;
            }
            androidx.compose.ui.text.n nVar2 = new androidx.compose.ui.text.n(cVar3, org.jsoup.helper.n.o(0, iH, 0, androidx.compose.ui.unit.a.g(j)), i4, w0Var.f);
            long jD = androidx.compose.ui.unit.b.d(j, (((long) n0.j(nVar2.d)) << 32) | (((long) n0.j(nVar2.e)) & 4294967295L));
            j0Var2 = j0Var;
            j0Var3 = new androidx.compose.ui.text.j0(new androidx.compose.ui.text.i0(w0Var.a, w0Var.b, w0Var.i, w0Var.c, w0Var.e, w0Var.f, w0Var.g, layoutDirection, w0Var.h, j), nVar2, jD);
            long j4 = j0Var3.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (kotlin.jvm.internal.l.a(j0Var2, j0Var3)) {
                if (k1VarD != 0) {
                    xVar = k1VarD.c;
                } else {
                    xVar = null;
                }
                r0Var2 = r0Var;
                r0Var2.i.setValue(new k1(j0Var3, xVar));
                i = 0;
                r0Var2.p = false;
                wVar = this;
                wVar.b.invoke(j0Var3);
                n0.q(r0Var2, wVar.c, wVar.d);
            } else {
                wVar = this;
                r0Var2 = r0Var;
                i = 0;
            }
            if (wVar.f == 1) {
                iJ = n0.j(j0Var3.b.b(i));
            } else {
                iJ = i;
            }
            r0Var2.g.setValue(new androidx.compose.ui.unit.f(wVar.e.L(iJ)));
            return s0Var.q(iIntValue3, iIntValue4, kotlin.collections.a0.v(new kotlin.k(androidx.compose.ui.layout.d.a, Integer.valueOf(Math.round(j0Var3.d))), new kotlin.k(androidx.compose.ui.layout.d.b, Integer.valueOf(Math.round(j0Var3.e)))), new androidx.compose.animation.core.n1(23));
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
            throw th;
        }
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        r0 r0Var = this.a;
        r0Var.a.a(sVar.getLayoutDirection());
        androidx.compose.runtime.internal.c cVar = r0Var.a.j;
        if (cVar != null) {
            return n0.j(cVar.c());
        }
        net.luminis.tls.engine.impl.c.r("layoutIntrinsics must be called first");
        return 0;
    }
}
