package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final androidx.compose.foundation.lazy.layout.a a = new androidx.compose.foundation.lazy.layout.a(2);
    public static final Object b = new Object();

    public static final int A(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final androidx.compose.runtime.internal.j B(androidx.appcompat.widget.r[] rVarArr, androidx.compose.runtime.internal.j jVar, androidx.compose.runtime.internal.j jVar2) {
        androidx.compose.runtime.internal.i iVar = new androidx.compose.runtime.internal.i(androidx.compose.runtime.internal.j.A);
        for (androidx.appcompat.widget.r rVar : rVarArr) {
            p1 p1Var = (p1) rVar.d;
            if (rVar.c || !jVar.containsKey(p1Var)) {
                iVar.put(p1Var, p1Var.c(rVar, (w2) jVar2.get(p1Var)));
            }
        }
        return iVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(androidx.appcompat.widget.r rVar, kotlin.jvm.functions.p pVar, r rVar2, int i) {
        w2 w2Var;
        boolean z;
        q1 q1VarT;
        rVar2.c0(-149765515);
        o0 o0Var = rVar2.x;
        androidx.compose.runtime.internal.j jVarL = rVar2.l();
        rVar2.Z(201, t.b);
        Object objQ = rVar2.Q();
        if (kotlin.jvm.internal.l.a(objQ, m.a)) {
            w2Var = null;
        } else {
            objQ.getClass();
            w2Var = (w2) objQ;
        }
        p1 p1Var = (p1) rVar.d;
        w2 w2VarC = p1Var.c(rVar, w2Var);
        boolean zEquals = w2VarC.equals(w2Var);
        if (!zEquals) {
            rVar2.l0(w2VarC);
        }
        if (!rVar2.S) {
            e2 e2Var = rVar2.G;
            Object objB = e2Var.b(e2Var.g, e2Var.b);
            objB.getClass();
            androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) objB;
            if (!(rVar2.F() && zEquals) && (rVar.c || !jVarL.containsKey(p1Var))) {
                jVarL = jVarL.b(p1Var, w2VarC);
            } else if ((zEquals && !rVar2.w) || !rVar2.w) {
                jVarL = jVar;
            }
            if (rVar2.y || jVar != jVarL) {
                z = true;
            }
            if (z && !rVar2.S) {
                rVar2.O(jVarL);
            }
            o0Var.c(rVar2.w ? 1 : 0);
            rVar2.w = z;
            rVar2.K = jVarL;
            rVar2.X(202, t.c, jVarL, 0);
            pVar.invoke(rVar2, Integer.valueOf((i >> 3) & 14));
            rVar2.p(false);
            rVar2.p(false);
            rVar2.w = o0Var.b() != 0;
            rVar2.K = null;
            q1VarT = rVar2.t();
            if (q1VarT != null) {
                q1VarT.d = new androidx.compose.animation.core.v1(rVar, pVar, i, 6);
            }
        }
        if (rVar.c || !jVarL.containsKey(p1Var)) {
            jVarL = jVarL.b(p1Var, w2VarC);
        }
        rVar2.J = true;
        z = false;
        if (z) {
            rVar2.O(jVarL);
        }
        o0Var.c(rVar2.w ? 1 : 0);
        rVar2.w = z;
        rVar2.K = jVarL;
        rVar2.X(202, t.c, jVarL, 0);
        pVar.invoke(rVar2, Integer.valueOf((i >> 3) & 14));
        rVar2.p(false);
        rVar2.p(false);
        rVar2.w = o0Var.b() != 0;
        rVar2.K = null;
        q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.v1(rVar, pVar, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(androidx.appcompat.widget.r[] rVarArr, kotlin.jvm.functions.p pVar, r rVar, int i) {
        androidx.compose.runtime.internal.j jVarK0;
        boolean z;
        q1 q1VarT;
        rVar.c0(415205898);
        o0 o0Var = rVar.x;
        androidx.compose.runtime.internal.j jVarL = rVar.l();
        rVar.Z(201, t.b);
        if (rVar.S) {
            jVarK0 = rVar.k0(jVarL, B(rVarArr, jVarL, androidx.compose.runtime.internal.j.A));
            rVar.J = true;
        } else {
            e2 e2Var = rVar.G;
            Object objH = e2Var.h(e2Var.g, 0);
            objH.getClass();
            androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) objH;
            e2 e2Var2 = rVar.G;
            Object objH2 = e2Var2.h(e2Var2.g, 1);
            objH2.getClass();
            androidx.compose.runtime.internal.j jVar2 = (androidx.compose.runtime.internal.j) objH2;
            androidx.compose.runtime.internal.j jVarB = B(rVarArr, jVarL, jVar2);
            if (!rVar.F() || rVar.y || !jVar2.equals(jVarB)) {
                jVarK0 = rVar.k0(jVarL, jVarB);
                if (rVar.y || !kotlin.jvm.internal.l.a(jVarK0, jVar)) {
                    z = true;
                }
                if (z && !rVar.S) {
                    rVar.O(jVarK0);
                }
                o0Var.c(rVar.w ? 1 : 0);
                rVar.w = z;
                rVar.K = jVarK0;
                rVar.X(202, t.c, jVarK0, 0);
                pVar.invoke(rVar, Integer.valueOf((i >> 3) & 14));
                rVar.p(false);
                rVar.p(false);
                rVar.w = o0Var.b() != 0;
                rVar.K = null;
                q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.animation.core.v1(rVarArr, pVar, i, 7);
                }
            }
            rVar.l = rVar.G.s() + rVar.l;
            jVarK0 = jVar;
        }
        z = false;
        if (z) {
            rVar.O(jVarK0);
        }
        o0Var.c(rVar.w ? 1 : 0);
        rVar.w = z;
        rVar.K = jVarK0;
        rVar.X(202, t.c, jVarK0, 0);
        pVar.invoke(rVar, Integer.valueOf((i >> 3) & 14));
        rVar.p(false);
        rVar.p(false);
        rVar.w = o0Var.b() != 0;
        rVar.K = null;
        q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.animation.core.v1(rVarArr, pVar, i, 7);
        }
    }

    public static final void c(int i, List list, int i2) {
        int iL = l(i, list);
        if (iL < 0) {
            iL = -(iL + 1);
        }
        while (iL < list.size() && ((p0) list.get(iL)).b < i2) {
        }
    }

    public static final void d(androidx.collection.y yVar, int i) {
        if (yVar.b == 0 || !(yVar.c(0) == i || yVar.c(yVar.b - 1) == i)) {
            int i2 = yVar.b;
            yVar.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = yVar.c(i3);
                if (i <= iC) {
                    break;
                }
                yVar.e(i2, iC);
                i2 = i3;
            }
            yVar.e(i2, i);
        }
    }

    public static void e(i2 i2Var, List list, y yVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = i2Var.c((a) list.get(i));
            int iN = i2Var.N(i2Var.r(iC), i2Var.b);
            Object obj = iN < i2Var.g(i2Var.r(iC + 1), i2Var.b) ? i2Var.c[i2Var.h(iN)] : m.a;
            q1 q1Var = obj instanceof q1 ? (q1) obj : null;
            if (q1Var != null) {
                q1Var.a = yVar;
            }
        }
    }

    public static final y0 f(Flow flow, Object obj, kotlin.coroutines.i iVar, r rVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            iVar = kotlin.coroutines.j.e;
        }
        boolean zH = rVar.h(iVar) | rVar.h(flow);
        Object objQ = rVar.Q();
        kotlin.coroutines.d dVar = null;
        Object obj2 = m.a;
        if (zH || objQ == obj2) {
            objQ = new androidx.compose.animation.b0(iVar, flow, dVar, 14);
            rVar.l0(objQ);
        }
        kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) objQ;
        Object objQ2 = rVar.Q();
        if (objQ2 == obj2) {
            objQ2 = r(obj);
            rVar.l0(objQ2);
        }
        y0 y0Var = (y0) objQ2;
        boolean zH2 = rVar.h(pVar);
        Object objQ3 = rVar.Q();
        if (zH2 || objQ3 == obj2) {
            objQ3 = new o2(pVar, y0Var, dVar, 1);
            rVar.l0(objQ3);
        }
        j0.d(flow, iVar, (kotlin.jvm.functions.p) objQ3, rVar);
        return y0Var;
    }

    public static final y0 g(StateFlow stateFlow, r rVar) {
        return f(stateFlow, stateFlow.getValue(), kotlin.coroutines.j.e, rVar, 0, 0);
    }

    public static final void h(e2 e2Var, ArrayList arrayList, int i) {
        boolean zL = e2Var.l(i);
        int[] iArr = e2Var.b;
        if (zL) {
            arrayList.add(e2Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            h(e2Var, arrayList, i3);
        }
    }

    public static final androidx.compose.runtime.collection.b i() {
        androidx.appcompat.widget.c2 c2Var = n2.b;
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) c2Var.v();
        if (bVar != null) {
            return bVar;
        }
        androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new q[0]);
        c2Var.X(bVar2);
        return bVar2;
    }

    public static final e0 j(f fVar, kotlin.jvm.functions.a aVar) {
        androidx.appcompat.widget.c2 c2Var = n2.a;
        return new e0(fVar, aVar);
    }

    public static final e0 k(kotlin.jvm.functions.a aVar) {
        androidx.appcompat.widget.c2 c2Var = n2.a;
        return new e0(null, aVar);
    }

    public static final int l(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iB = kotlin.jvm.internal.l.b(((p0) list.get(i3)).b, i);
            if (iB < 0) {
                i2 = i3 + 1;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int m(r rVar) {
        rVar.getClass();
        return Long.hashCode(rVar.T);
    }

    public static final long n(r rVar) {
        return rVar.T;
    }

    public static final e o(kotlin.coroutines.i iVar) {
        e eVar = (e) iVar.get(f.z);
        if (eVar != null) {
            return eVar;
        }
        net.luminis.tls.engine.impl.c.r("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void p(r rVar, Integer num, kotlin.jvm.functions.p pVar) {
        if (rVar.S) {
            rVar.b(num, pVar);
        }
    }

    public static List q(i2 i2Var, int i, i2 i2Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iU = i2Var.u(i);
        int i2 = i + iU;
        int iF = i2Var.f(i);
        int iF2 = i2Var.f(i2);
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (i2Var.b[(i2Var.r(i) * 5) + 1] & 201326592) != 0;
        i2Var2.w(iU);
        i2Var2.x(i3, i2Var2.t);
        if (i2Var.g < i2) {
            i2Var.B(i2);
        }
        if (i2Var.k < iF2) {
            i2Var.C(iF2, i2);
        }
        int[] iArr = i2Var2.b;
        int i4 = i2Var2.t;
        int i5 = i4 * 5;
        kotlin.collections.n.C(i5, i * 5, i2 * 5, i2Var.b, iArr);
        Object[] objArr = i2Var2.c;
        int i6 = i2Var2.i;
        System.arraycopy(i2Var.c, iF, objArr, i6, i3);
        int i7 = i2Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iU;
        int iG = i6 - i2Var2.g(i4, iArr);
        int i10 = i2Var2.m;
        int i11 = i2Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = i2.i(i2Var2.g(i13, iArr) + iG, i12 < i13 ? 0 : i2Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        i2Var2.m = i12;
        int iA = h2.a(i2Var.d, i, i2Var.p());
        int iA2 = h2.a(i2Var.d, i2, i2Var.p());
        if (iA < iA2) {
            ArrayList arrayList = i2Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i15 = iA; i15 < iA2; i15++) {
                a aVar = (a) arrayList.get(i15);
                aVar.a += i8;
                arrayList2.add(aVar);
            }
            i2Var2.d.addAll(h2.a(i2Var2.d, i2Var2.t, i2Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = kotlin.collections.u.e;
        }
        if (!list.isEmpty()) {
            HashMap map = i2Var.e;
            HashMap map2 = i2Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = i2Var2.v;
        i2Var2.O(i7);
        int iE = i2Var.E(i, i2Var.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                i2Var.P();
                i2Var.a(iE - i2Var.t);
                i2Var.P();
            }
            i2Var.a(i - i2Var.t);
            boolean zH = i2Var.H();
            if (z7) {
                i2Var.M();
                i2Var.j();
                i2Var.M();
                i2Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = i2Var.I(i, iU);
            i2Var.J(iF, i3, i - 1);
            z4 = zI;
        }
        if (z4) {
            t.a("Unexpectedly removed anchors");
        }
        int i18 = i2Var2.o;
        int i19 = iArr3[i5 + 1];
        i2Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            i2Var2.t = i9;
            i2Var2.i = i6 + i3;
        }
        if (z6) {
            i2Var2.T(i7);
        }
        return list;
    }

    public static h1 r(Object obj) {
        return new h1(obj, f.D);
    }

    public static final Object s(androidx.compose.runtime.internal.j jVar, p1 p1Var) {
        p1Var.getClass();
        Object objB = jVar.get(p1Var);
        if (objB == null) {
            objB = p1Var.b();
        }
        return ((w2) objB).a(jVar);
    }

    public static final void t(r rVar, kotlin.jvm.functions.l lVar) {
        rVar.b(kotlin.y.a, new androidx.compose.foundation.lazy.grid.g(lVar, 1, (byte) 0));
    }

    public static final p u(r rVar) {
        r rVar2;
        rVar.Z(206, t.e);
        if (rVar.S) {
            i2.z(rVar.I);
        }
        Object objI = rVar.I();
        a2 d2Var = objI instanceof a2 ? (a2) objI : null;
        if (d2Var == null) {
            rVar2 = rVar;
            d2Var = new d2(new o(new p(rVar2, rVar.T, rVar.q, rVar.C, rVar.h.Q)), -1);
            rVar2.m0(d2Var);
        } else {
            rVar2 = rVar;
        }
        z1 z1Var = d2Var.a;
        z1Var.getClass();
        p pVar = ((o) z1Var).e;
        pVar.f.setValue(rVar2.l());
        rVar2.p(false);
        return pVar;
    }

    public static final y0 v(Object obj, r rVar) {
        Object objQ = rVar.Q();
        if (objQ == m.a) {
            objQ = r(obj);
            rVar.l0(objQ);
        }
        y0 y0Var = (y0) objQ;
        y0Var.setValue(obj);
        return y0Var;
    }

    public static final void w(i2 i2Var, int i, Object obj) {
        int iH = i2Var.h(i);
        Object[] objArr = i2Var.c;
        Object obj2 = objArr[iH];
        objArr[iH] = m.a;
        if (obj == obj2) {
            return;
        }
        t.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void x(r rVar, Object obj, kotlin.jvm.functions.p pVar) {
        if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), obj)) {
            rVar.l0(obj);
            rVar.b(obj, pVar);
        }
    }

    public static final Flow y(kotlin.jvm.functions.a aVar) {
        return FlowKt.flow(new q2(aVar, null));
    }

    public static final int z(androidx.collection.y yVar) {
        int iC;
        int i = yVar.b;
        int iC2 = yVar.c(0);
        while (yVar.b != 0 && yVar.c(0) == iC2) {
            int i2 = yVar.b;
            if (i2 == 0) {
                androidx.transition.k.m("IntList is empty.");
                return 0;
            }
            yVar.e(0, yVar.a[i2 - 1]);
            yVar.d(yVar.b - 1);
            int i3 = yVar.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iC3 = yVar.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iC4 = yVar.c(i7);
                if (i6 < i3 && (iC = yVar.c(i6)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    yVar.e(i5, iC);
                    yVar.e(i6, iC3);
                    i5 = i6;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    yVar.e(i5, iC4);
                    yVar.e(i7, iC3);
                    i5 = i7;
                }
            }
        }
        return iC2;
    }
}
