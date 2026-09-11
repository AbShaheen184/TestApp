package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.gestures.k1;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.u2;
import androidx.compose.ui.layout.l1;
import com.app.mlounge.R;
import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final a a = new a(1);

    public static final void a(final kotlin.jvm.functions.a aVar, final androidx.compose.ui.r rVar, final m0 m0Var, final c0 c0Var, androidx.compose.runtime.r rVar2, final int i) {
        rVar2.c0(1055276397);
        int i2 = (rVar2.h(aVar) ? 4 : 2) | i | (rVar2.f(rVar) ? 32 : 16) | (rVar2.f(m0Var) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.f(c0Var) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            final androidx.compose.runtime.y0 y0VarV = androidx.compose.runtime.s.v(aVar, rVar2);
            c(androidx.compose.runtime.internal.k.c(-933153643, new kotlin.jvm.functions.q() { // from class: androidx.compose.foundation.lazy.layout.z
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.ui.r rVarD;
                    androidx.compose.runtime.saveable.d dVar = (androidx.compose.runtime.saveable.d) obj;
                    androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                    ((Integer) obj3).getClass();
                    Object objQ = rVar3.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (objQ == fVar) {
                        objQ = new x(dVar, new androidx.compose.foundation.lazy.n(y0VarV, 2));
                        rVar3.l0(objQ);
                    }
                    final x xVar = (x) objQ;
                    Object objQ2 = rVar3.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new l1(new androidx.compose.foundation.text.input.internal.o(xVar));
                        rVar3.l0(objQ2);
                    }
                    final l1 l1Var = (l1) objQ2;
                    final m0 m0Var2 = m0Var;
                    if (m0Var2 != null) {
                        rVar3.b0(1743490539);
                        rVar3.b0(887527095);
                        final c1 c1Var = e1.a;
                        if (c1Var != null) {
                            rVar3.b0(1345554384);
                            rVar3.p(false);
                        } else {
                            rVar3.b0(1345603457);
                            View view = (View) rVar3.j(androidx.compose.ui.platform.m0.f);
                            boolean zF = rVar3.f(view);
                            Object objQ3 = rVar3.Q();
                            if (zF || objQ3 == fVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objQ3 = tag instanceof c1 ? (c1) tag : null;
                                if (objQ3 == null) {
                                    objQ3 = new c(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objQ3);
                                }
                                rVar3.l0(objQ3);
                            }
                            c1Var = (c1) objQ3;
                            rVar3.p(false);
                        }
                        rVar3.p(false);
                        Object[] objArr = {m0Var2, xVar, l1Var, c1Var};
                        boolean zF2 = rVar3.f(m0Var2) | rVar3.h(xVar) | rVar3.h(l1Var) | rVar3.h(c1Var);
                        Object objQ4 = rVar3.Q();
                        if (zF2 || objQ4 == fVar) {
                            objQ4 = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.lazy.layout.b0
                                @Override // kotlin.jvm.functions.l
                                public final Object invoke(Object obj4) {
                                    b1 b1Var = new b1(xVar, l1Var, c1Var);
                                    m0 m0Var3 = m0Var2;
                                    m0Var3.c = b1Var;
                                    return new androidx.activity.compose.d(m0Var3, 2);
                                }
                            };
                            rVar3.l0(objQ4);
                        }
                        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ4;
                        boolean zF3 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zF3 |= rVar3.f(obj4);
                        }
                        Object objQ5 = rVar3.Q();
                        if (zF3 || objQ5 == fVar) {
                            rVar3.l0(new androidx.compose.runtime.f0(lVar));
                        }
                    } else {
                        rVar3.b0(1737291469);
                    }
                    rVar3.p(false);
                    int i3 = n0.a;
                    androidx.compose.ui.r rVar4 = rVar;
                    if (m0Var2 != null && (rVarD = rVar4.d(new h1(m0Var2))) != null) {
                        rVar4 = rVarD;
                    }
                    boolean zF4 = rVar3.f(xVar);
                    c0 c0Var2 = c0Var;
                    boolean zF5 = zF4 | rVar3.f(c0Var2);
                    Object objQ6 = rVar3.Q();
                    if (zF5 || objQ6 == fVar) {
                        objQ6 = new androidx.compose.foundation.contextmenu.f(3, xVar, c0Var2);
                        rVar3.l0(objQ6);
                    }
                    androidx.compose.ui.layout.a0.a(l1Var, rVar4, (kotlin.jvm.functions.p) objQ6, rVar3, 8);
                    return kotlin.y.a;
                }
            }, rVar2), rVar2, 6);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(rVar, m0Var, c0Var, i) { // from class: androidx.compose.foundation.lazy.layout.a0
                public final /* synthetic */ c0 A;
                public final /* synthetic */ androidx.compose.ui.r y;
                public final /* synthetic */ m0 z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    m.a(this.e, this.y, this.z, this.A, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i, final j0 j0Var, final androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, final int i2) {
        int i3;
        rVar.c0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (rVar.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar.h(j0Var) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= rVar.h(fVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = rVar.f(obj) | rVar.f(j0Var);
            Object objQ = rVar.Q();
            Object obj2 = androidx.compose.runtime.m.a;
            if (zF || objQ == obj2) {
                objQ = new h0(obj, j0Var);
                rVar.l0(objQ);
            }
            h0 h0Var = (h0) objQ;
            h0Var.c = i;
            androidx.compose.runtime.h1 h1Var = h0Var.g;
            p1 p1Var = androidx.compose.ui.layout.a1.a;
            h0 h0Var2 = (h0) rVar.j(p1Var);
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                if (h0Var2 != ((h0) h1Var.getValue())) {
                    h1Var.setValue(h0Var2);
                    if (h0Var.d > 0) {
                        h0 h0Var3 = h0Var.e;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        h0Var.e = h0Var2;
                    }
                }
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                boolean zF2 = rVar.f(h0Var);
                Object objQ2 = rVar.Q();
                if (zF2 || objQ2 == obj2) {
                    objQ2 = new androidx.activity.compose.g(h0Var, 13);
                    rVar.l0(objQ2);
                }
                androidx.compose.runtime.j0.b(h0Var, (kotlin.jvm.functions.l) objQ2, rVar);
                androidx.compose.runtime.s.a(p1Var.a(h0Var), fVar, rVar, ((i3 >> 6) & Token.ASSIGN_MOD) | 8);
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p() { // from class: androidx.compose.foundation.lazy.layout.i0
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    m.b(obj, i, j0Var, fVar, (androidx.compose.runtime.r) obj3, androidx.compose.runtime.s.A(i2 | 1));
                    return kotlin.y.a;
                }
            };
        }
    }

    public static final void c(androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(-709502251);
        if (rVar.T(i & 1, (i & 3) != 2)) {
            u2 u2Var = androidx.compose.runtime.saveable.j.a;
            androidx.compose.runtime.saveable.h hVar = (androidx.compose.runtime.saveable.h) rVar.j(u2Var);
            androidx.compose.runtime.saveable.e eVarF = androidx.compose.runtime.saveable.n.f(rVar);
            Object[] objArr = {hVar};
            androidx.compose.foundation.text.input.internal.o oVar = new androidx.compose.foundation.text.input.internal.o(13, new a2(5), new androidx.activity.compose.h(19, hVar, eVarF));
            boolean zH = rVar.h(hVar) | rVar.h(eVarF);
            Object objQ = rVar.Q();
            if (zH || objQ == androidx.compose.runtime.m.a) {
                objQ = new androidx.activity.compose.f(6, hVar, eVarF);
                rVar.l0(objQ);
            }
            w0 w0Var = (w0) androidx.compose.runtime.saveable.n.c(objArr, oVar, (kotlin.jvm.functions.a) objQ, rVar, 0);
            androidx.compose.runtime.s.a(u2Var.a(w0Var), androidx.compose.runtime.internal.k.c(-412824043, new androidx.compose.foundation.contextmenu.f(4, fVar, w0Var), rVar), rVar, 56);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new x0(fVar, i, 0);
        }
    }

    public static final void d(y yVar, Object obj, int i, Object obj2, androidx.compose.runtime.r rVar, int i2) {
        rVar.c0(1439843069);
        int i3 = (rVar.f(yVar) ? 4 : 2) | i2 | (rVar.f(obj) ? 32 : 16) | (rVar.d(i) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.f(obj2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i3 & 1, (i3 & 1171) != 1170)) {
            ((androidx.compose.runtime.saveable.d) obj).e(obj2, androidx.compose.runtime.internal.k.c(980966366, new v1(yVar, i, obj2, 4), rVar), rVar, 48);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.j(yVar, obj, i, obj2, i2);
        }
    }

    public static final int e(int i, androidx.compose.runtime.collection.b bVar) {
        int i2 = bVar.z - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = bVar.e;
            int i5 = ((j) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((j) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final List f(f0 f0Var, int i, int i2, ArrayList arrayList, androidx.collection.y yVar, int i3, int i4, int i5, kotlin.jvm.functions.l lVar) {
        int i6;
        androidx.collection.y yVar2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (f0Var == null || arrayList.isEmpty() || (i6 = yVar.b) == 0) {
            return kotlin.collections.u.e;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            yVar2 = androidx.collection.m.a;
        } else {
            kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i6);
            int i10 = dVarR.e;
            int i11 = dVarR.y;
            int iC = -1;
            if (i10 <= i11) {
                while (yVar.c(i10) <= i) {
                    iC = yVar.c(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (iC == -1) {
                yVar2 = androidx.collection.m.a;
            } else {
                androidx.collection.y yVar3 = androidx.collection.m.a;
                yVar2 = new androidx.collection.y(1);
                yVar2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            int index = ((e0) obj2).getIndex();
            int[] iArr = yVar.a;
            int i13 = yVar.b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = yVar2.a;
        int i15 = yVar2.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = i9;
                    break;
                }
                if (((e0) it.next()).getIndex() == i17) {
                    break;
                }
                i18++;
            }
            e0 e0Var = i18 == i9 ? (e0) lVar.invoke(Integer.valueOf(i17)) : (e0) arrayList.remove(i18);
            int iB = e0Var.b();
            if (i18 == i9) {
                j = 4294967295L;
                i7 = Integer.MIN_VALUE;
            } else {
                long jH = e0Var.h(0);
                if (e0Var.e()) {
                    j = 4294967295L;
                    j2 = jH & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = jH >> 32;
                }
                i7 = (int) j2;
            }
            int size2 = arrayList3.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i19);
                if (((e0) obj).getIndex() != i17) {
                    break;
                }
                i19++;
            }
            e0 e0Var2 = (e0) obj;
            if (e0Var2 != null) {
                long jH2 = e0Var2.h(0);
                i8 = (int) (e0Var2.e() ? jH2 & j : jH2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iB);
            }
            e0Var.f();
            e0Var.g(iMax, i4, i5);
            arrayList2.add(e0Var);
            i16++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final List g(y yVar, j0 j0Var, com.google.firebase.platforminfo.c cVar) {
        kotlin.ranges.d dVar;
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) cVar.e;
        if (!(bVar.z != 0) && j0Var.e.isEmpty()) {
            return kotlin.collections.u.e;
        }
        ArrayList arrayList = new ArrayList();
        if (((androidx.compose.runtime.collection.b) cVar.e).z != 0) {
            int i = bVar.z;
            if (i == 0) {
                androidx.transition.k.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr = bVar.e;
            int i2 = ((k) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((k) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                androidx.compose.foundation.internal.b.a("negative minIndex");
            }
            int i5 = bVar.z;
            if (i5 == 0) {
                androidx.transition.k.m("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = bVar.e;
            int i6 = ((k) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((k) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            dVar = new kotlin.ranges.d(i2, Math.min(i6, yVar.a() - 1), 1);
        } else {
            dVar = kotlin.ranges.d.A;
        }
        int size = j0Var.e.size();
        for (int i9 = 0; i9 < size; i9++) {
            h0 h0Var = (h0) j0Var.get(i9);
            int i10 = i(yVar, h0Var.a, h0Var.c);
            int i11 = dVar.e;
            if ((i10 > dVar.y || i11 > i10) && i10 >= 0 && i10 < yVar.a()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        int i12 = dVar.e;
        int i13 = dVar.y;
        if (i12 <= i13) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static androidx.compose.runtime.y0 h() {
        return new androidx.compose.runtime.h1(kotlin.y.a, androidx.compose.runtime.f.A);
    }

    public static final int i(y yVar, Object obj, int i) {
        int iE;
        return (obj == null || yVar.a() == 0 || (i < yVar.a() && obj.equals(yVar.b(i))) || (iE = yVar.e(obj)) == -1) ? i : iE;
    }

    public static final androidx.compose.ui.r m(q qVar, com.google.firebase.platforminfo.c cVar, k1 k1Var) {
        return new l(qVar, cVar, k1Var);
    }

    public static final androidx.compose.ui.r n(androidx.compose.ui.r rVar, kotlin.reflect.h hVar, q0 q0Var, k1 k1Var, boolean z) {
        return rVar.d(new r0(hVar, q0Var, k1Var, z));
    }

    public static final List o(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return kotlin.collections.u.e;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0 e0Var = (e0) arrayList.get(i3);
            int index = e0Var.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(e0Var);
            }
        }
        kotlin.collections.r.B(a, arrayList2);
        return arrayList2;
    }

    public Object j(int i) {
        j jVarI = k().i(i);
        return jVarI.c.a().invoke(Integer.valueOf(i - jVarI.a));
    }

    public abstract androidx.appcompat.widget.x k();

    public Object l(int i) {
        Object objInvoke;
        j jVarI = k().i(i);
        int i2 = i - jVarI.a;
        kotlin.jvm.functions.l key = jVarI.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new h(i) : objInvoke;
    }
}
