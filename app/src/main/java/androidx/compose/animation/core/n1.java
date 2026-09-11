package androidx.compose.animation.core;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ n1(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.h] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                return yVar;
            case 1:
                h1 h1Var = (h1) obj;
                long j = h1Var.C;
                ((androidx.compose.runtime.snapshots.t) i2.b.getValue()).d(h1Var, i2.a, h1Var.D);
                long j2 = h1Var.C;
                if (j != j2) {
                    y0 y0Var = h1Var.K;
                    if (y0Var != null) {
                        if (y0Var.a > j2) {
                            h1Var.B();
                        } else {
                            y0Var.g = j2;
                            if (y0Var.b == null) {
                                y0Var.h = kotlin.math.a.G((1.0d - ((double) y0Var.e.a(0))) * h1Var.C);
                            }
                        }
                    } else if (j2 != 0) {
                        h1Var.E();
                    }
                }
                return yVar;
            case 2:
                ((kotlin.jvm.functions.a) obj).invoke();
                return yVar;
            case 3:
                return new o(((Float) obj).floatValue());
            case 4:
                return new o(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((o) obj).a);
            case 6:
                return new o(((androidx.compose.ui.unit.f) obj).e);
            case 7:
                return new androidx.compose.ui.unit.f(((o) obj).a);
            case 8:
                androidx.compose.ui.unit.g gVar = (androidx.compose.ui.unit.g) obj;
                return new p(Float.intBitsToFloat((int) (gVar.a >> 32)), Float.intBitsToFloat((int) (gVar.a & 4294967295L)));
            case 9:
                p pVar = (p) obj;
                return new androidx.compose.ui.unit.g((((long) Float.floatToRawIntBits(pVar.a)) << 32) | (((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L));
            case 10:
                androidx.compose.ui.geometry.e eVar = (androidx.compose.ui.geometry.e) obj;
                return new p(Float.intBitsToFloat((int) (eVar.a >> 32)), Float.intBitsToFloat((int) (eVar.a & 4294967295L)));
            case 11:
                p pVar2 = (p) obj;
                return new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(pVar2.a)) << 32) | (((long) Float.floatToRawIntBits(pVar2.b)) & 4294967295L));
            case 12:
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj;
                return new p(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
            case 13:
                p pVar3 = (p) obj;
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(pVar3.a)) << 32) | (((long) Float.floatToRawIntBits(pVar3.b)) & 4294967295L));
            case 14:
                long j3 = ((androidx.compose.ui.unit.j) obj).a;
                return new p((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 15:
                p pVar4 = (p) obj;
                return new androidx.compose.ui.unit.j((((long) Math.round(pVar4.a)) << 32) | (((long) Math.round(pVar4.b)) & 4294967295L));
            case 16:
                long j4 = ((androidx.compose.ui.unit.l) obj).a;
                return new p((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 17:
                p pVar5 = (p) obj;
                int iRound = Math.round(pVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(pVar5.b);
                return new androidx.compose.ui.unit.l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 18:
                androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) obj;
                return new r(cVar.a, cVar.b, cVar.c, cVar.d);
            case 19:
                r rVar = (r) obj;
                return new androidx.compose.ui.geometry.c(rVar.a, rVar.b, rVar.c, rVar.d);
            case 20:
                return Float.valueOf(((o) obj).a);
            case 21:
                ((androidx.compose.ui.node.h0) obj).b();
                return yVar;
            case 22:
                androidx.compose.ui.semantics.x xVar = (androidx.compose.ui.semantics.x) obj;
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                xVar.b(androidx.compose.ui.semantics.t.a, com.google.common.base.c.p("App icon"));
                androidx.compose.ui.semantics.v.c(xVar, 5);
                return yVar;
            case 23:
                return yVar;
            case 24:
                ((Long) obj).getClass();
                return yVar;
            case 25:
                androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) obj;
                int i2 = androidx.compose.foundation.p.a;
                androidx.compose.runtime.u2 u2Var = androidx.compose.ui.platform.m0.b;
                jVar.getClass();
                Context context = (Context) androidx.compose.runtime.s.s(jVar, u2Var);
                androidx.compose.ui.unit.c cVar2 = (androidx.compose.ui.unit.c) androidx.compose.runtime.s.s(jVar, androidx.compose.ui.platform.l1.h);
                androidx.compose.foundation.o1 o1Var = (androidx.compose.foundation.o1) androidx.compose.runtime.s.s(jVar, androidx.compose.foundation.p1.a);
                if (o1Var == null) {
                    return null;
                }
                return new androidx.compose.foundation.o(context, cVar2, o1Var.a, o1Var.b);
            case 26:
                androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.g.c;
                kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
                androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.c;
                kotlin.reflect.j jVar2 = androidx.compose.ui.semantics.v.a[1];
                ((androidx.compose.ui.semantics.x) obj).b(wVar, gVar2);
                return yVar;
            case 27:
                return new androidx.compose.foundation.b2(((Integer) obj).intValue());
            default:
                androidx.compose.runtime.internal.j jVar3 = (androidx.compose.runtime.internal.j) obj;
                androidx.compose.runtime.u2 u2Var2 = androidx.compose.ui.platform.m0.b;
                jVar3.getClass();
                if (((Context) androidx.compose.runtime.s.s(jVar3, u2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return androidx.compose.foundation.gestures.e.b;
                }
                androidx.compose.foundation.gestures.c.a.getClass();
                return androidx.compose.foundation.gestures.b.c;
        }
    }
}
