package androidx.compose.ui.focus;

import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w1;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
  0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object A(e0 e0Var, int i, kotlin.jvm.functions.l lVar) {
        int i2;
        int i3;
        Object objInvoke;
        androidx.compose.ui.q qVarE;
        androidx.compose.foundation.lazy.layout.p pVarP0;
        a1 a1Var;
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar = e0Var.e.B;
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0Var);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (f0VarT == null) {
                qVarE = null;
                break;
            }
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (qVar != null) {
                    if ((qVar.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        qVarE = qVar;
                        androidx.compose.runtime.collection.b bVar = null;
                        while (qVarE != null) {
                            if (qVarE instanceof e0) {
                                break loop0;
                            }
                            if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                int i4 = 0;
                                for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                    if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            qVarE = qVar2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar.b(qVar2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar);
                        }
                    }
                    qVar = qVar.B;
                }
            }
            f0VarT = f0VarT.v();
            qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
        }
        e0 e0Var2 = (e0) qVarE;
        if ((e0Var2 != null && kotlin.jvm.internal.l.a(e0Var2.P0(), e0Var.P0())) || (pVarP0 = e0Var.P0()) == null) {
            return null;
        }
        int i5 = 5;
        if (i == 5) {
            i3 = i5;
        } else {
            i5 = 6;
            if (i == 6) {
                i3 = i5;
            } else {
                i5 = 3;
                if (i == 3) {
                    i3 = i5;
                } else {
                    i5 = 4;
                    if (i == 4) {
                        i3 = i5;
                    } else if (i == 1) {
                        i3 = 2;
                    } else if (i != 2) {
                        net.luminis.tls.engine.impl.c.r("Unsupported direction for beyond bounds layout");
                        return null;
                    }
                }
            }
        }
        if (pVarP0.L.a() <= 0 || !pVarP0.L.d() || !pVarP0.K) {
            return lVar.invoke(androidx.compose.foundation.lazy.layout.p.O);
        }
        boolean zM0 = pVarP0.M0(i3);
        androidx.compose.foundation.lazy.layout.q qVar3 = pVarP0.L;
        int iB = zM0 ? qVar3.b() : qVar3.e();
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        com.google.firebase.platforminfo.c cVar = pVarP0.M;
        cVar.getClass();
        androidx.compose.foundation.lazy.layout.k kVar = new androidx.compose.foundation.lazy.layout.k(iB, iB);
        ((androidx.compose.runtime.collection.b) cVar.e).b(kVar);
        zVar.e = kVar;
        int iC = pVarP0.L.c() * 2;
        int iA = pVarP0.L.a();
        if (iC > iA) {
            iC = iA;
        }
        while (objInvoke == null && pVarP0.L0((androidx.compose.foundation.lazy.layout.k) zVar.e, i3) && i2 < iC) {
            androidx.compose.foundation.lazy.layout.k kVar2 = (androidx.compose.foundation.lazy.layout.k) zVar.e;
            int i6 = kVar2.a;
            int i7 = kVar2.b;
            if (pVarP0.M0(i3)) {
                i7++;
            } else {
                i6--;
            }
            com.google.firebase.platforminfo.c cVar2 = pVarP0.M;
            cVar2.getClass();
            androidx.compose.foundation.lazy.layout.k kVar3 = new androidx.compose.foundation.lazy.layout.k(i6, i7);
            ((androidx.compose.runtime.collection.b) cVar2.e).b(kVar3);
            ((androidx.compose.runtime.collection.b) pVarP0.M.e).j((androidx.compose.foundation.lazy.layout.k) zVar.e);
            zVar.e = kVar3;
            i2++;
            androidx.compose.ui.node.k.t(pVarP0).k();
            objInvoke = lVar.invoke(new androidx.compose.foundation.lazy.layout.o(pVarP0, zVar, i3));
        }
        ((androidx.compose.runtime.collection.b) pVarP0.M.e).j((androidx.compose.foundation.lazy.layout.k) zVar.e);
        androidx.compose.ui.node.k.t(pVarP0).k();
        return objInvoke;
    }

    public static final boolean B(int i, androidx.compose.animation.h hVar, e0 e0Var, androidx.compose.ui.geometry.c cVar) {
        e0 e0VarG;
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new e0[16]);
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar = e0Var.e;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 == null) {
            androidx.compose.ui.node.k.b(bVar2, qVar);
        } else {
            bVar2.b(qVar2);
        }
        while (true) {
            int i2 = bVar2.z;
            if (i2 == 0) {
                break;
            }
            androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar2.k(i2 - 1);
            if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                androidx.compose.ui.node.k.b(bVar2, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.runtime.collection.b bVar3 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof e0) {
                                e0 e0Var2 = (e0) qVarE;
                                if (e0Var2.K) {
                                    bVar.b(e0Var2);
                                }
                            } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                int i3 = 0;
                                for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                    if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar3.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar3.b(qVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar3);
                        }
                        break;
                    }
                    qVarE = qVarE.C;
                }
            }
        }
        while (bVar.z != 0 && (e0VarG = g(bVar, cVar, i)) != null) {
            if (e0VarG.N0().a) {
                return ((Boolean) hVar.invoke(e0VarG)).booleanValue();
            }
            if (m(i, hVar, e0VarG, cVar)) {
                return true;
            }
            bVar.j(e0VarG);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 androidx.compose.ui.q) = (r13v7 androidx.compose.ui.q), (r13v14 androidx.compose.ui.q) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean C(e0 e0Var, e0 e0Var2, int i, androidx.compose.animation.h hVar) {
        androidx.compose.ui.q qVar;
        androidx.compose.ui.q qVar2;
        androidx.compose.ui.node.f0 f0VarT;
        a1 a1Var;
        androidx.compose.ui.q qVarE;
        androidx.compose.runtime.collection.b bVar;
        if (e0Var.Q0() != c0.y) {
            net.luminis.tls.engine.impl.c.r("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new e0[16];
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar3 = e0Var.e;
        androidx.compose.ui.q qVar4 = qVar3.C;
        if (qVar4 == null) {
            androidx.compose.ui.node.k.b(bVar2, qVar3);
        } else {
            bVar2.b(qVar4);
        }
        int i2 = 0;
        while (true) {
            int i3 = bVar2.z;
            qVar = null;
            if (i3 == 0) {
                break;
            }
            androidx.compose.ui.q qVarE2 = (androidx.compose.ui.q) bVar2.k(i3 - 1);
            if ((qVarE2.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                androidx.compose.ui.node.k.b(bVar2, qVarE2);
            } else {
                while (qVarE2 != null) {
                    if ((qVarE2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.runtime.collection.b bVar3 = null;
                        while (qVarE2 != null) {
                            if (qVarE2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarE2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = e0Var3;
                                i2 = i4;
                            } else if ((qVarE2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                int i5 = 0;
                                for (androidx.compose.ui.q qVar5 = ((androidx.compose.ui.node.j) qVarE2).M; qVar5 != null; qVar5 = qVar5.C) {
                                    if ((qVar5.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            qVarE2 = qVar5;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE2 != null) {
                                                bVar3.b(qVarE2);
                                                qVarE2 = null;
                                            }
                                            bVar3.b(qVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            qVarE2 = androidx.compose.ui.node.k.e(bVar3);
                        }
                        break;
                    }
                    qVarE2 = qVarE2.C;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, f0.e);
        if (i != 1) {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.r("This function should only be used for 1-D focus search");
                return false;
            }
            kotlin.ranges.d dVarR = com.google.android.material.resources.c.r(0, i2);
            int i6 = dVarR.e;
            int i7 = dVarR.y;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        e0 e0Var4 = (e0) objArr[i7];
                        if (s(e0Var4) && a(e0Var4, hVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(objArr[i7], e0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!e0Var.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                qVar2 = e0Var.e.B;
                f0VarT = androidx.compose.ui.node.k.t(e0Var);
                loop5: while (f0VarT != null) {
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (qVar2 != null) {
                            if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                qVarE = qVar2;
                                bVar = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof e0) {
                                        qVar = qVarE;
                                        break loop5;
                                    }
                                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                                    }
                                    qVarE = androidx.compose.ui.node.k.e(bVar);
                                }
                            }
                            qVar2 = qVar2.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    if (f0VarT != null) {
                    }
                }
                if (qVar != null) {
                    return ((Boolean) hVar.invoke(e0Var)).booleanValue();
                }
            }
            return false;
        }
        kotlin.ranges.d dVarR2 = com.google.android.material.resources.c.r(0, i2);
        int i8 = dVarR2.e;
        int i9 = dVarR2.y;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    e0 e0Var5 = (e0) objArr[i8];
                    if (s(e0Var5) && l(e0Var5, hVar)) {
                        return true;
                    }
                }
                if (kotlin.jvm.internal.l.a(objArr[i8], e0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && e0Var.N0().a) {
            if (!e0Var.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            qVar2 = e0Var.e.B;
            f0VarT = androidx.compose.ui.node.k.t(e0Var);
            loop5: while (f0VarT != null) {
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            qVarE = qVar2;
                            bVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof e0) {
                                    qVar = qVarE;
                                    break loop5;
                                }
                                if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i10 = 0;
                                    for (androidx.compose.ui.q qVar6 = ((androidx.compose.ui.node.j) qVarE).M; qVar6 != null; qVar6 = qVar6.C) {
                                        if ((qVar6.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVarE = qVar6;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar.b(qVar6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        qVar2 = qVar2.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar2 = (f0VarT != null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
            }
            if (qVar != null) {
                return ((Boolean) hVar.invoke(e0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final Boolean D(int i, androidx.compose.animation.h hVar, e0 e0Var, androidx.compose.ui.geometry.c cVar) {
        int iOrdinal = e0Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (e0VarO == null) {
                    net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = e0VarO.Q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolD = D(i, hVar, e0VarO, cVar);
                        if (!kotlin.jvm.internal.l.a(boolD, Boolean.FALSE)) {
                            return boolD;
                        }
                        if (cVar == null) {
                            if (e0VarO.Q0() != c0.y) {
                                net.luminis.tls.engine.impl.c.r("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            e0 e0VarF = f(e0VarO);
                            if (e0VarF == null) {
                                net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                                return null;
                            }
                            cVar = j(e0VarF);
                        }
                        return Boolean.valueOf(m(i, hVar, e0Var, cVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            coil3.g.a();
                            return null;
                        }
                        net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (cVar == null) {
                    cVar = j(e0VarO);
                }
                return Boolean.valueOf(m(i, hVar, e0Var, cVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    coil3.g.a();
                    return null;
                }
                if (e0Var.N0().a) {
                    return (Boolean) hVar.invoke(e0Var);
                }
                return cVar == null ? Boolean.valueOf(h(e0Var, i, hVar)) : Boolean.valueOf(B(i, hVar, e0Var, cVar));
            }
        }
        return Boolean.valueOf(h(e0Var, i, hVar));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0077 A[RETURN] */
    public static final boolean a(e0 e0Var, androidx.compose.animation.h hVar) {
        int iOrdinal = e0Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (e0VarO == null) {
                    net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = e0VarO.Q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (a(e0VarO, hVar) || n(e0Var, e0VarO, 2, hVar) || (e0VarO.N0().a && ((Boolean) hVar.invoke(e0VarO)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            coil3.g.a();
                            return false;
                        }
                        net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return n(e0Var, e0VarO, 2, hVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    coil3.g.a();
                    return false;
                }
                if (!y(e0Var, hVar)) {
                    if (!(e0Var.N0().a ? ((Boolean) hVar.invoke(e0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return y(e0Var, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(androidx.compose.ui.geometry.c r18, androidx.compose.ui.geometry.c r19, androidx.compose.ui.geometry.c r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = c(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9e
            boolean r0 = c(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9e
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L99
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L99
            goto L4a
        L44:
            if (r3 != r13) goto L9a
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L99
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L95
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            net.luminis.tls.engine.impl.c.r(r4)
        L93:
            r0 = 0
            return r0
        L95:
            net.luminis.tls.engine.impl.c.r(r4)
            goto L93
        L99:
            return r18
        L9a:
            net.luminis.tls.engine.impl.c.r(r4)
            goto L93
        L9e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.d.b(androidx.compose.ui.geometry.c, androidx.compose.ui.geometry.c, androidx.compose.ui.geometry.c, int):boolean");
    }

    public static final boolean c(int i, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2) {
        if (i == 3 || i == 4) {
            return cVar.d > cVar2.b && cVar.b < cVar2.d;
        }
        if (i == 5 || i == 6) {
            return cVar.c > cVar2.a && cVar.a < cVar2.c;
        }
        net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
        return false;
    }

    public static final boolean d(e0 e0Var, boolean z) {
        int iOrdinal = e0Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (!(e0VarO != null ? d(e0VarO, z) : true)) {
                    return false;
                }
                e0Var.M0(c0.y, c0.z);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                coil3.g.a();
                return false;
            }
        }
        return true;
    }

    public static final void e(e0 e0Var, androidx.compose.runtime.collection.b bVar) {
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar = e0Var.e;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 == null) {
            androidx.compose.ui.node.k.b(bVar2, qVar);
        } else {
            bVar2.b(qVar2);
        }
        while (true) {
            int i = bVar2.z;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar2.k(i - 1);
            if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                androidx.compose.ui.node.k.b(bVar2, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.runtime.collection.b bVar3 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof e0) {
                                e0 e0Var2 = (e0) qVarE;
                                if (e0Var2.K && !androidx.compose.ui.node.k.t(e0Var2).o0) {
                                    if (e0Var2.N0().a) {
                                        bVar.b(e0Var2);
                                    } else {
                                        e(e0Var2, bVar);
                                    }
                                }
                            } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                int i2 = 0;
                                for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                    if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (bVar3 == null) {
                                                bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar3.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar3.b(qVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar3);
                        }
                        break;
                    }
                    qVarE = qVarE.C;
                }
            }
        }
    }

    public static final e0 f(e0 e0Var) {
        e0 e0VarF = ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).f();
        if (e0VarF == null || !e0VarF.K) {
            return null;
        }
        return e0VarF;
    }

    public static final e0 g(androidx.compose.runtime.collection.b bVar, androidx.compose.ui.geometry.c cVar, int i) {
        androidx.compose.ui.geometry.c cVarH;
        if (i == 3) {
            cVarH = cVar.h((cVar.c - cVar.a) + 1, 0.0f);
        } else if (i == 4) {
            cVarH = cVar.h(-((cVar.c - cVar.a) + 1), 0.0f);
        } else if (i == 5) {
            cVarH = cVar.h(0.0f, (cVar.d - cVar.b) + 1);
        } else {
            if (i != 6) {
                net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
                return null;
            }
            cVarH = cVar.h(0.0f, -((cVar.d - cVar.b) + 1));
        }
        Object[] objArr = bVar.e;
        int i2 = bVar.z;
        e0 e0Var = null;
        for (int i3 = 0; i3 < i2; i3++) {
            e0 e0Var2 = (e0) objArr[i3];
            if (s(e0Var2)) {
                androidx.compose.ui.geometry.c cVarJ = j(e0Var2);
                if (p(cVarJ, cVarH, cVar, i)) {
                    e0Var = e0Var2;
                    cVarH = cVarJ;
                }
            }
        }
        return e0Var;
    }

    public static final boolean h(e0 e0Var, int i, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.geometry.c cVar;
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new e0[16]);
        e(e0Var, bVar);
        int i2 = bVar.z;
        if (i2 <= 1) {
            e0 e0Var2 = (e0) (i2 == 0 ? null : bVar.e[0]);
            if (e0Var2 != null) {
                return ((Boolean) lVar.invoke(e0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                androidx.compose.ui.geometry.c cVarJ = j(e0Var);
                float f = cVarJ.a;
                float f2 = cVarJ.b;
                cVar = new androidx.compose.ui.geometry.c(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
                    return false;
                }
                androidx.compose.ui.geometry.c cVarJ2 = j(e0Var);
                float f3 = cVarJ2.c;
                float f4 = cVarJ2.d;
                cVar = new androidx.compose.ui.geometry.c(f3, f4, f3, f4);
            }
            e0 e0VarG = g(bVar, cVar, i);
            if (e0VarG != null) {
                return ((Boolean) lVar.invoke(e0VarG)).booleanValue();
            }
        }
        return false;
    }

    public static final androidx.compose.ui.r i(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new s(new v(lVar)));
    }

    public static final androidx.compose.ui.geometry.c j(e0 e0Var) {
        d1 d1Var;
        if (e0Var.K && (d1Var = e0Var.E) != null) {
            androidx.compose.ui.layout.x xVarG = androidx.compose.ui.layout.a0.g(d1Var);
            if (!xVarG.l()) {
                xVarG = null;
            }
            if (xVarG != null) {
                return e0Var.O0(xVarG);
            }
        }
        return androidx.compose.ui.geometry.c.e;
    }

    public static final androidx.compose.ui.r k(androidx.compose.ui.r rVar, y yVar) {
        return rVar.d(new z(yVar));
    }

    public static final boolean l(e0 e0Var, androidx.compose.animation.h hVar) {
        int iOrdinal = e0Var.Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (e0VarO != null) {
                    return l(e0VarO, hVar) || n(e0Var, e0VarO, 1, hVar);
                }
                net.luminis.tls.engine.impl.c.r("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return e0Var.N0().a ? ((Boolean) hVar.invoke(e0Var)).booleanValue() : z(e0Var, hVar);
                }
                coil3.g.a();
                return false;
            }
        }
        return z(e0Var, hVar);
    }

    public static final boolean m(int i, androidx.compose.animation.h hVar, e0 e0Var, androidx.compose.ui.geometry.c cVar) {
        if (B(i, hVar, e0Var, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) A(e0Var, i, new g0(((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).f(), e0Var, cVar, i, hVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean n(e0 e0Var, e0 e0Var2, int i, androidx.compose.animation.h hVar) {
        if (C(e0Var, e0Var2, i, hVar)) {
            return true;
        }
        Boolean bool = (Boolean) A(e0Var, i, new g0(((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).f(), e0Var, e0Var2, i, hVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final e0 o(e0 e0Var) {
        boolean z = e0Var.e.K;
        if (z) {
            if (!z) {
                androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
            }
            androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
            androidx.compose.ui.q qVar = e0Var.e;
            androidx.compose.ui.q qVar2 = qVar.C;
            if (qVar2 == null) {
                androidx.compose.ui.node.k.b(bVar, qVar);
            } else {
                bVar.b(qVar2);
            }
            while (true) {
                int i = bVar.z;
                if (i == 0) {
                    break;
                }
                androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar.k(i - 1);
                if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                    androidx.compose.ui.node.k.b(bVar, qVarE);
                } else {
                    while (qVarE != null) {
                        if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            androidx.compose.runtime.collection.b bVar2 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof e0) {
                                    e0 e0Var2 = (e0) qVarE;
                                    if (e0Var2.e.K) {
                                        int iOrdinal = e0Var2.Q0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return e0Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            coil3.g.a();
                                            return null;
                                        }
                                    }
                                } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                        if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                qVarE = qVar3;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar2.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar2.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar2);
                            }
                            break;
                        }
                        qVarE = qVarE.C;
                    }
                }
            }
        }
        return null;
    }

    public static final boolean p(androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2, androidx.compose.ui.geometry.c cVar3, int i) {
        if (!q(i, cVar, cVar3)) {
            return false;
        }
        if (q(i, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i)) {
            return !b(cVar3, cVar2, cVar, i) && r(i, cVar3, cVar) < r(i, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean q(int i, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2) {
        if (i == 3) {
            float f = cVar2.c;
            float f2 = cVar2.a;
            float f3 = cVar.c;
            return (f > f3 || f2 >= f3) && f2 > cVar.a;
        }
        if (i == 4) {
            float f4 = cVar2.a;
            float f5 = cVar2.c;
            float f6 = cVar.a;
            return (f4 < f6 || f5 <= f6) && f5 < cVar.c;
        }
        if (i == 5) {
            float f7 = cVar2.d;
            float f8 = cVar2.b;
            float f9 = cVar.d;
            return (f7 > f9 || f8 >= f9) && f8 > cVar.b;
        }
        if (i != 6) {
            net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = cVar2.b;
        float f11 = cVar2.d;
        float f12 = cVar.b;
        return (f10 < f12 || f11 <= f12) && f11 < cVar.d;
    }

    public static final long r(int i, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = cVar.a;
            f2 = cVar2.c;
        } else if (i == 4) {
            f = cVar2.a;
            f2 = cVar.c;
        } else if (i == 5) {
            f = cVar.b;
            f2 = cVar2.d;
        } else {
            if (i != 6) {
                net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = cVar2.b;
            f2 = cVar.d;
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = cVar.b;
            f3 = 2;
            f4 = ((cVar.d - f8) / f3) + f8;
            f5 = cVar2.b;
            f6 = cVar2.d;
        } else {
            if (i != 5 && i != 6) {
                net.luminis.tls.engine.impl.c.r("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f9 = cVar.a;
            f3 = 2;
            f4 = ((cVar.c - f9) / f3) + f9;
            f5 = cVar2.a;
            f6 = cVar2.c;
        }
        long j2 = (long) (f4 - (((f6 - f5) / f3) + f5));
        return (j2 * j2) + (((long) 13) * j * j);
    }

    public static final boolean s(e0 e0Var) {
        androidx.compose.ui.node.f0 f0Var;
        d1 d1Var;
        androidx.compose.ui.node.f0 f0Var2;
        d1 d1Var2 = e0Var.E;
        return (d1Var2 == null || (f0Var = d1Var2.L) == null || !f0Var.I() || (d1Var = e0Var.E) == null || (f0Var2 = d1Var.L) == null || !f0Var2.H()) ? false : true;
    }

    public static final androidx.compose.ui.r t(androidx.compose.ui.r rVar, kotlin.jvm.functions.l lVar) {
        return rVar.d(new c(lVar));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public static final b u(e0 e0Var, int i) {
        int iOrdinal = e0Var.Q0().ordinal();
        b bVar = b.e;
        if (iOrdinal != 0) {
            b bVar2 = b.y;
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (e0VarO == null) {
                    net.luminis.tls.engine.impl.c.o("ActiveParent with no focused child");
                    return null;
                }
                b bVarU = u(e0VarO, i);
                b bVar3 = bVarU != bVar ? bVarU : null;
                if (bVar3 != null) {
                    return bVar3;
                }
                if (e0Var.N) {
                    return bVar;
                }
                e0Var.N = true;
                try {
                    u uVarN0 = e0Var.N0();
                    a aVar = new a(i);
                    p pVar = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner();
                    e0 e0VarF = pVar.f();
                    uVarN0.k.invoke(aVar);
                    e0 e0VarF2 = pVar.f();
                    if (aVar.b) {
                        y yVar = y.b;
                        return bVar2;
                    }
                    if (e0VarF == e0VarF2 || e0VarF2 == null) {
                        return bVar;
                    }
                    return y.d == y.c ? bVar2 : b.z;
                } finally {
                    e0Var.N = false;
                }
            }
            if (iOrdinal == 2) {
                return bVar2;
            }
            if (iOrdinal != 3) {
                coil3.g.a();
                return null;
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    public static final b v(e0 e0Var, int i) {
        if (!e0Var.O) {
            e0Var.O = true;
            try {
                u uVarN0 = e0Var.N0();
                a aVar = new a(i);
                p pVar = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner();
                e0 e0VarF = pVar.f();
                uVarN0.j.invoke(aVar);
                e0 e0VarF2 = pVar.f();
                boolean z = aVar.b;
                b bVar = b.y;
                if (z) {
                    y yVar = y.b;
                    return bVar;
                }
                if (e0VarF != e0VarF2 && e0VarF2 != null) {
                    return y.d == y.c ? bVar : b.z;
                }
            } finally {
                e0Var.O = false;
            }
        }
        return b.e;
    }

    public static final b w(e0 e0Var, int i) {
        androidx.compose.ui.q qVarE;
        a1 a1Var;
        int iOrdinal = e0Var.Q0().ordinal();
        b bVar = b.e;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                e0 e0VarO = o(e0Var);
                if (e0VarO != null) {
                    return u(e0VarO, i);
                }
                net.luminis.tls.engine.impl.c.o("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    coil3.g.a();
                    return null;
                }
                if (!e0Var.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.q qVar = e0Var.e.B;
                androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0Var);
                loop0: while (true) {
                    if (f0VarT == null) {
                        qVarE = null;
                        break;
                    }
                    if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                qVarE = qVar;
                                androidx.compose.runtime.collection.b bVar2 = null;
                                while (qVarE != null) {
                                    if (qVarE instanceof e0) {
                                        break loop0;
                                    }
                                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                            if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    qVarE = qVar2;
                                                } else {
                                                    if (bVar2 == null) {
                                                        bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                    }
                                                    if (qVarE != null) {
                                                        bVar2.b(qVarE);
                                                        qVarE = null;
                                                    }
                                                    bVar2.b(qVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    qVarE = androidx.compose.ui.node.k.e(bVar2);
                                }
                            }
                            qVar = qVar.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                }
                e0 e0Var2 = (e0) qVarE;
                if (e0Var2 == null) {
                    return bVar;
                }
                int iOrdinal2 = e0Var2.Q0().ordinal();
                if (iOrdinal2 == 0) {
                    return v(e0Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return w(e0Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return b.y;
                }
                if (iOrdinal2 != 3) {
                    coil3.g.a();
                    return null;
                }
                b bVarW = w(e0Var2, i);
                b bVar3 = bVarW != bVar ? bVarW : null;
                return bVar3 == null ? v(e0Var2, i) : bVar3;
            }
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x020f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0216 A[ADDED_TO_REGION, LOOP:9: B:153:0x0216->B:160:0x0228, LOOP_START, PHI: r12
  0x0216: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:152:0x0214, B:160:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:157:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0225  */
    /* JADX WARN: Code duplicated, block: B:159:0x0227  */
    /* JADX WARN: Code duplicated, block: B:161:0x022e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0236  */
    /* JADX WARN: Code duplicated, block: B:168:0x0242 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x01ad A[SYNTHETIC] */
    public static final boolean x(e0 e0Var) {
        androidx.compose.runtime.collection.b bVar;
        int i;
        e0 e0Var2;
        c0 c0Var;
        a1 a1Var;
        char c;
        a1 a1Var2;
        p pVar = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner();
        e0 e0VarF = pVar.f();
        c0 c0VarQ0 = e0Var.Q0();
        if (e0VarF == e0Var) {
            e0Var.M0(c0VarQ0, c0VarQ0);
            return true;
        }
        int i2 = 0;
        if ((e0VarF == null || e0VarF.L) && !e0Var.L && !((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).a.G()) {
            return false;
        }
        char c2 = 16;
        if (e0VarF != null) {
            bVar = new androidx.compose.runtime.collection.b(new e0[16]);
            if (!e0VarF.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar = e0VarF.e.B;
            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF);
            while (f0VarT != null) {
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            androidx.compose.ui.q qVarE = qVar;
                            androidx.compose.runtime.collection.b bVar2 = null;
                            while (qVarE != null) {
                                if (qVarE instanceof e0) {
                                    bVar.b((e0) qVarE);
                                } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                        if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                qVarE = qVar2;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar2.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar2.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar2);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var2 = f0VarT.d0) == null) ? null : (w1) a1Var2.f;
            }
        } else {
            bVar = null;
        }
        Object[] objArr = new e0[16];
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar3 = e0Var.e.B;
        androidx.compose.ui.node.f0 f0VarT2 = androidx.compose.ui.node.k.t(e0Var);
        int i4 = 1;
        int i5 = 0;
        while (f0VarT2 != null) {
            if ((((androidx.compose.ui.q) f0VarT2.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                while (qVar3 != null) {
                    if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.ui.q qVarE2 = qVar3;
                        androidx.compose.runtime.collection.b bVar3 = null;
                        while (qVarE2 != null) {
                            if (qVarE2 instanceof e0) {
                                e0 e0Var3 = (e0) qVarE2;
                                Boolean boolValueOf = bVar != null ? Boolean.valueOf(bVar.j(e0Var3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (objArr.length < i6) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(objArr, i2, objArr2, i2, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i5] = e0Var3;
                                    i5 = i6;
                                }
                                if (e0Var3 == e0VarF) {
                                    i4 = i2;
                                }
                            } else {
                                if ((qVarE2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE2 instanceof androidx.compose.ui.node.j)) {
                                    int i7 = i2;
                                    for (androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) qVarE2).M; qVar4 != null; qVar4 = qVar4.C) {
                                        if ((qVar4.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                qVarE2 = qVar4;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE2 != null) {
                                                    bVar3.b(qVarE2);
                                                    qVarE2 = null;
                                                }
                                                bVar3.b(qVar4);
                                            }
                                        }
                                    }
                                    c = 16;
                                    if (i7 == 1) {
                                        c2 = 16;
                                    }
                                    i2 = 0;
                                }
                                qVarE2 = androidx.compose.ui.node.k.e(bVar3);
                                c2 = c;
                                i2 = 0;
                            }
                            c = 16;
                            qVarE2 = androidx.compose.ui.node.k.e(bVar3);
                            c2 = c;
                            i2 = 0;
                        }
                    }
                    qVar3 = qVar3.B;
                    c2 = c2;
                    i2 = 0;
                }
            }
            char c3 = c2;
            f0VarT2 = f0VarT2.v();
            qVar3 = (f0VarT2 == null || (a1Var = f0VarT2.d0) == null) ? null : (w1) a1Var.f;
            c2 = c3;
            i2 = 0;
        }
        if (i4 == 0 || e0VarF == null || d(e0VarF, false)) {
            androidx.compose.ui.node.k.p(e0Var, new androidx.compose.animation.z(e0Var, 1));
            int iOrdinal = e0Var.Q0().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).i(e0Var);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        coil3.g.a();
                        return false;
                    }
                    ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(e0Var)).getFocusOwner()).i(e0Var);
                }
            }
            c0 c0Var2 = c0.z;
            c0 c0Var3 = c0.e;
            if (i4 != 0 && e0VarF != null) {
                e0VarF.M0(c0Var3, c0Var2);
            }
            c0 c0Var4 = c0.y;
            if (bVar != null) {
                int i8 = bVar.z - 1;
                Object[] objArr3 = bVar.e;
                if (i8 < objArr3.length) {
                    while (i8 >= 0) {
                        e0 e0Var4 = (e0) objArr3[i8];
                        if (pVar.f() == e0Var) {
                            e0Var4.M0(c0Var4, c0Var2);
                            i8--;
                        }
                    }
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            e0Var2 = (e0) objArr[i];
                            if (pVar.f() == e0Var) {
                                if (e0Var2 == e0VarF) {
                                    c0Var = c0Var3;
                                } else {
                                    c0Var = c0Var2;
                                }
                                e0Var2.M0(c0Var, c0Var4);
                                i--;
                            }
                        }
                        if (pVar.f() == e0Var) {
                            e0Var.M0(c0VarQ0, c0Var3);
                            if (pVar.f() != e0Var) {
                                return true;
                            }
                        }
                    } else if (pVar.f() == e0Var) {
                        e0Var.M0(c0VarQ0, c0Var3);
                        if (pVar.f() != e0Var) {
                            return true;
                        }
                    }
                } else {
                    i = i5 - 1;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            e0Var2 = (e0) objArr[i];
                            if (pVar.f() == e0Var) {
                                if (e0Var2 == e0VarF) {
                                    c0Var = c0Var3;
                                } else {
                                    c0Var = c0Var2;
                                }
                                e0Var2.M0(c0Var, c0Var4);
                                i--;
                            }
                        }
                        if (pVar.f() == e0Var) {
                            e0Var.M0(c0VarQ0, c0Var3);
                            if (pVar.f() != e0Var) {
                                return true;
                            }
                        }
                    } else if (pVar.f() == e0Var) {
                        e0Var.M0(c0VarQ0, c0Var3);
                        if (pVar.f() != e0Var) {
                            return true;
                        }
                    }
                }
            } else {
                i = i5 - 1;
                if (i < objArr.length) {
                    while (i >= 0) {
                        e0Var2 = (e0) objArr[i];
                        if (pVar.f() == e0Var) {
                            if (e0Var2 == e0VarF) {
                                c0Var = c0Var3;
                            } else {
                                c0Var = c0Var2;
                            }
                            e0Var2.M0(c0Var, c0Var4);
                            i--;
                        }
                    }
                    if (pVar.f() == e0Var) {
                        e0Var.M0(c0VarQ0, c0Var3);
                        if (pVar.f() != e0Var) {
                            return true;
                        }
                    }
                } else if (pVar.f() == e0Var) {
                    e0Var.M0(c0VarQ0, c0Var3);
                    if (pVar.f() != e0Var) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean y(e0 e0Var, androidx.compose.animation.h hVar) {
        Object[] objArr = new e0[16];
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar = e0Var.e;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 == null) {
            androidx.compose.ui.node.k.b(bVar, qVar);
        } else {
            bVar.b(qVar2);
        }
        int i = 0;
        while (true) {
            int i2 = bVar.z;
            if (i2 == 0) {
                break;
            }
            androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar.k(i2 - 1);
            if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                androidx.compose.ui.node.k.b(bVar, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.runtime.collection.b bVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof e0) {
                                e0 e0Var2 = (e0) qVarE;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = e0Var2;
                                i = i3;
                            } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                int i4 = 0;
                                for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                    if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar2.b(qVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar2);
                        }
                        break;
                    }
                    qVarE = qVarE.C;
                }
            }
        }
        Arrays.sort(objArr, 0, i, f0.e);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                e0 e0Var3 = (e0) objArr[i5];
                if (s(e0Var3) && a(e0Var3, hVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean z(e0 e0Var, androidx.compose.animation.h hVar) {
        Object[] objArr = new e0[16];
        if (!e0Var.e.K) {
            androidx.compose.ui.internal.a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar = e0Var.e;
        androidx.compose.ui.q qVar2 = qVar.C;
        if (qVar2 == null) {
            androidx.compose.ui.node.k.b(bVar, qVar);
        } else {
            bVar.b(qVar2);
        }
        int i = 0;
        while (true) {
            int i2 = bVar.z;
            if (i2 == 0) {
                break;
            }
            androidx.compose.ui.q qVarE = (androidx.compose.ui.q) bVar.k(i2 - 1);
            if ((qVarE.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0) {
                androidx.compose.ui.node.k.b(bVar, qVarE);
            } else {
                while (qVarE != null) {
                    if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                        androidx.compose.runtime.collection.b bVar2 = null;
                        while (qVarE != null) {
                            if (qVarE instanceof e0) {
                                e0 e0Var2 = (e0) qVarE;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = e0Var2;
                                i = i3;
                            } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                int i4 = 0;
                                for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                    if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            qVarE = qVar3;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (qVarE != null) {
                                                bVar2.b(qVarE);
                                                qVarE = null;
                                            }
                                            bVar2.b(qVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            qVarE = androidx.compose.ui.node.k.e(bVar2);
                        }
                        break;
                    }
                    qVarE = qVarE.C;
                }
            }
        }
        Arrays.sort(objArr, 0, i, f0.e);
        for (int i5 = 0; i5 < i; i5++) {
            e0 e0Var3 = (e0) objArr[i5];
            if (s(e0Var3) && l(e0Var3, hVar)) {
                return true;
            }
        }
        return false;
    }
}
