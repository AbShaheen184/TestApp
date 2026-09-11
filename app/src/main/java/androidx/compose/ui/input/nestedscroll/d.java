package androidx.compose.ui.input.nestedscroll;

import androidx.compose.animation.z;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public i a;
    public i b;
    public m c = new z(this, 3);
    public CoroutineScope d;

    /* JADX WARN: Code duplicated, block: B:80:0x0118  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r7v15 */
    public final Object a(long j, long j2, kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i;
        i iVar;
        i iVar2;
        z1 z1Var;
        a1 a1Var;
        long j3;
        z1 z1Var2;
        a1 a1Var2;
        ?? E;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.e;
        int i3 = bVar2.z;
        if (i3 == 0) {
            kotlin.a.e(obj);
            i iVar3 = this.a;
            int i4 = 262144;
            if (iVar3 == null || !iVar3.K) {
                i = 262144;
                iVar = null;
            } else {
                if (!iVar3.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                q qVar = iVar3.e.B;
                f0 f0VarT = k.t(iVar3);
                loop0: while (true) {
                    if (f0VarT == null) {
                        i = i4;
                        z1Var2 = null;
                        break;
                    }
                    if ((((q) f0VarT.d0.g).A & i4) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & i4) != 0) {
                                ?? r13 = qVar;
                                ?? bVar3 = 0;
                                while (r13 != 0) {
                                    if (r13 instanceof z1) {
                                        z1Var2 = (z1) r13;
                                        i = i4;
                                        if (l.a(iVar3.i(), z1Var2.i()) && i.class == z1Var2.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i = i4;
                                        if ((r13.z & i) != 0 && (r13 instanceof androidx.compose.ui.node.j)) {
                                            q qVar2 = ((androidx.compose.ui.node.j) r13).M;
                                            int i5 = 0;
                                            while (qVar2 != null) {
                                                if ((qVar2.z & i) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        E = r13;
                                                        bVar3 = bVar3;
                                                        bVar3 = bVar3;
                                                        E = qVar2;
                                                    } else {
                                                        if (bVar3 == 0) {
                                                            bVar3 = new androidx.compose.runtime.collection.b(new q[16]);
                                                        }
                                                        if (E != 0) {
                                                            bVar3.b(E);
                                                            E = 0;
                                                        }
                                                        bVar3.b(qVar2);
                                                    }
                                                } else {
                                                    E = r13;
                                                    bVar3 = bVar3;
                                                }
                                                qVar2 = qVar2.C;
                                                E = E;
                                                bVar3 = bVar3;
                                            }
                                            if (i5 == 1) {
                                                E = r13;
                                                bVar3 = bVar3;
                                            }
                                        }
                                        i4 = i;
                                        r13 = E;
                                        bVar3 = bVar3;
                                    }
                                    E = r13;
                                    bVar3 = bVar3;
                                    E = k.e(bVar3);
                                    i4 = i;
                                    r13 = E;
                                    bVar3 = bVar3;
                                }
                            }
                            qVar = qVar.B;
                            i4 = i4;
                        }
                    }
                    int i6 = i4;
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var2 = f0VarT.d0) == null) ? null : (w1) a1Var2.f;
                    i4 = i6;
                }
                iVar = (i) z1Var2;
            }
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (iVar == null) {
                i iVar4 = this.b;
                if (iVar4 != null) {
                    bVar2.z = 1;
                    Object objM = iVar4.m(j, j2, bVar2);
                    if (objM != aVar) {
                        obj = objM;
                        j3 = ((androidx.compose.ui.unit.q) obj).a;
                    }
                    return aVar;
                }
                j3 = 0;
            } else {
                i iVar5 = this.a;
                if (iVar5 == null || !iVar5.K) {
                    iVar2 = null;
                } else {
                    if (!iVar5.e.K) {
                        androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                    }
                    q qVar3 = iVar5.e.B;
                    f0 f0VarT2 = k.t(iVar5);
                    loop3: while (true) {
                        if (f0VarT2 == null) {
                            z1Var = null;
                            break;
                        }
                        if ((((q) f0VarT2.d0.g).A & i) != 0) {
                            while (qVar3 != null) {
                                if ((qVar3.z & i) != 0) {
                                    ?? E2 = qVar3;
                                    ?? bVar4 = 0;
                                    while (E2 != 0) {
                                        if (E2 instanceof z1) {
                                            z1 z1Var3 = (z1) E2;
                                            if (l.a(iVar5.i(), z1Var3.i()) && i.class == z1Var3.getClass()) {
                                                z1Var = z1Var3;
                                                break loop3;
                                            }
                                        } else if ((E2.z & i) != 0 && (E2 instanceof androidx.compose.ui.node.j)) {
                                            q qVar4 = ((androidx.compose.ui.node.j) E2).M;
                                            int i7 = 0;
                                            while (qVar4 != null) {
                                                if ((qVar4.z & i) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        E2 = E2;
                                                        bVar4 = bVar4;
                                                        bVar4 = bVar4;
                                                        E2 = qVar4;
                                                    } else {
                                                        if (bVar4 == 0) {
                                                            bVar4 = new androidx.compose.runtime.collection.b(new q[16]);
                                                        }
                                                        if (E2 != 0) {
                                                            bVar4.b(E2);
                                                            E2 = 0;
                                                        }
                                                        bVar4.b(qVar4);
                                                    }
                                                } else {
                                                    E2 = E2;
                                                    bVar4 = bVar4;
                                                }
                                                qVar4 = qVar4.C;
                                                E2 = E2;
                                                bVar4 = bVar4;
                                            }
                                            if (i7 == 1) {
                                                E2 = E2;
                                                bVar4 = bVar4;
                                            } else {
                                                E2 = E2;
                                                bVar4 = bVar4;
                                            }
                                        }
                                        E2 = k.e(bVar4);
                                    }
                                }
                                qVar3 = qVar3.B;
                            }
                        }
                        f0VarT2 = f0VarT2.v();
                        qVar3 = (f0VarT2 == null || (a1Var = f0VarT2.d0) == null) ? null : (w1) a1Var.f;
                    }
                    iVar2 = (i) z1Var;
                }
                if (iVar2 != null) {
                    bVar2.z = 2;
                    Object objM2 = iVar2.m(j, j2, bVar2);
                    if (objM2 != aVar) {
                        obj = objM2;
                        j3 = ((androidx.compose.ui.unit.q) obj).a;
                    }
                    return aVar;
                }
                j3 = 0;
            }
        } else if (i3 == 1) {
            kotlin.a.e(obj);
            j3 = ((androidx.compose.ui.unit.q) obj).a;
        } else {
            if (i3 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            j3 = ((androidx.compose.ui.unit.q) obj).a;
        }
        return new androidx.compose.ui.unit.q(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Object b(long j, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        long j2;
        a1 a1Var;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.z = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objC0 = cVar2.e;
        int i2 = cVar2.z;
        if (i2 == 0) {
            kotlin.a.e(objC0);
            i iVar = this.a;
            i iVar2 = null;
            z1 z1Var = null;
            iVar2 = null;
            if (iVar != null && iVar.K) {
                if (!iVar.e.K) {
                    androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
                }
                q qVar = iVar.e.B;
                f0 f0VarT = k.t(iVar);
                loop0: while (f0VarT != null) {
                    if ((((q) f0VarT.d0.g).A & 262144) != 0) {
                        while (qVar != null) {
                            if ((qVar.z & 262144) != 0) {
                                ?? bVar = 0;
                                ?? E = qVar;
                                while (E != 0) {
                                    if (E instanceof z1) {
                                        z1 z1Var2 = (z1) E;
                                        if (l.a(iVar.i(), z1Var2.i()) && i.class == z1Var2.getClass()) {
                                            z1Var = z1Var2;
                                            break loop0;
                                        }
                                    } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                        q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                        int i3 = 0;
                                        while (qVar2 != null) {
                                            if ((qVar2.z & 262144) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    E = E;
                                                    bVar = bVar;
                                                    bVar = bVar;
                                                    E = qVar2;
                                                } else {
                                                    if (bVar == 0) {
                                                        bVar = new androidx.compose.runtime.collection.b(new q[16]);
                                                    }
                                                    if (E != 0) {
                                                        bVar.b(E);
                                                        E = 0;
                                                    }
                                                    bVar.b(qVar2);
                                                }
                                            } else {
                                                E = E;
                                                bVar = bVar;
                                            }
                                            qVar2 = qVar2.C;
                                            E = E;
                                            bVar = bVar;
                                        }
                                        if (i3 == 1) {
                                            E = E;
                                            bVar = bVar;
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                    }
                                    E = k.e(bVar);
                                }
                            }
                            qVar = qVar.B;
                        }
                    }
                    f0VarT = f0VarT.v();
                    qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                }
                iVar2 = (i) z1Var;
            }
            if (iVar2 != null) {
                cVar2.z = 1;
                objC0 = iVar2.c0(j, cVar2);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objC0 == aVar) {
                    return aVar;
                }
            } else {
                j2 = 0;
            }
            return new androidx.compose.ui.unit.q(j2);
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(objC0);
        j2 = ((androidx.compose.ui.unit.q) objC0).a;
        return new androidx.compose.ui.unit.q(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.a, kotlin.jvm.internal.m] */
    public final CoroutineScope c() {
        CoroutineScope coroutineScope = (CoroutineScope) this.c.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        net.luminis.tls.engine.impl.c.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
