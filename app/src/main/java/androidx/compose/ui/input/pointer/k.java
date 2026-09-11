package androidx.compose.ui.input.pointer;

import androidx.compose.foundation.text.selection.q0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.r1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    public final androidx.compose.ui.q c;
    public final androidx.compose.ui.input.pointer.util.c d;
    public final androidx.collection.s e;
    public d1 f;
    public m g;
    public boolean h;
    public boolean i;
    public boolean j;

    public k(androidx.compose.ui.q qVar) {
        this.c = qVar;
        androidx.compose.ui.input.pointer.util.c cVar = new androidx.compose.ui.input.pointer.util.c();
        cVar.c = new long[2];
        this.d = cVar;
        this.e = new androidx.collection.s(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // androidx.compose.ui.input.pointer.l
    public final boolean a(androidx.collection.s sVar, androidx.compose.ui.layout.x xVar, q0 q0Var, boolean z) {
        androidx.compose.ui.input.pointer.util.c cVar;
        androidx.collection.s sVar2;
        Object obj;
        boolean z2;
        boolean z3;
        m mVar;
        int i;
        int i2;
        boolean z4;
        boolean zA = super.a(sVar, xVar, q0Var, z);
        ?? E = this.c;
        boolean z5 = true;
        if (E.K) {
            ?? bVar = 0;
            while (E != 0) {
                if (E instanceof r1) {
                    this.f = androidx.compose.ui.node.k.r((r1) E, 16);
                } else if ((E.z & 16) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                    androidx.compose.ui.q qVar = ((androidx.compose.ui.node.j) E).M;
                    int i3 = 0;
                    while (qVar != null) {
                        if ((qVar.z & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                E = E;
                                bVar = bVar;
                                bVar = bVar;
                                E = qVar;
                            } else {
                                if (bVar == 0) {
                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                }
                                if (E != 0) {
                                    bVar.b(E);
                                    E = 0;
                                }
                                bVar.b(qVar);
                            }
                        } else {
                            E = E;
                            bVar = bVar;
                        }
                        qVar = qVar.C;
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
                E = androidx.compose.ui.node.k.e(bVar);
            }
            if (this.f != null) {
                int iG = sVar.g();
                int i4 = 0;
                while (true) {
                    cVar = this.d;
                    sVar2 = this.e;
                    if (i4 >= iG) {
                        break;
                    }
                    long jD = sVar.d(i4);
                    v vVar = (v) sVar.h(i4);
                    if (cVar.c(jD)) {
                        boolean z6 = z5;
                        long j = vVar.g;
                        ArrayList arrayList = vVar.k;
                        long j2 = vVar.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            kotlin.collections.u uVar = kotlin.collections.u.e;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? uVar : arrayList).size());
                            List list = arrayList == null ? uVar : arrayList;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list2 = list;
                                c cVar2 = (c) list.get(i5);
                                androidx.collection.s sVar3 = sVar2;
                                long j3 = jD;
                                long j4 = cVar2.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = cVar2.a;
                                    d1 d1Var = this.f;
                                    d1Var.getClass();
                                    arrayList2.add(new c(j5, d1Var.D(xVar, j4), cVar2.c));
                                }
                                i5++;
                                size = size;
                                list = list2;
                                sVar2 = sVar3;
                                jD = j3;
                                vVar = vVar;
                            }
                            androidx.collection.s sVar4 = sVar2;
                            long j6 = jD;
                            d1 d1Var2 = this.f;
                            d1Var2.getClass();
                            long jD2 = d1Var2.D(xVar, j);
                            d1 d1Var3 = this.f;
                            d1Var3.getClass();
                            v vVar2 = new v(vVar.a, vVar.b, d1Var3.D(xVar, j2), vVar.d, vVar.e, vVar.f, jD2, vVar.h, vVar.i, arrayList2, vVar.j, vVar.l);
                            v vVar3 = vVar.o;
                            if (vVar3 == null) {
                                vVar3 = vVar;
                            }
                            vVar2.o = vVar3;
                            v vVar4 = vVar.o;
                            if (vVar4 != null) {
                                vVar = vVar4;
                            }
                            vVar2.o = vVar;
                            sVar4.e(j6, vVar2);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    iG = iG;
                    z5 = z4;
                    zA = zA;
                }
                boolean z7 = zA;
                boolean z8 = z5;
                if (sVar2.g() == 0) {
                    cVar.b = 0;
                    this.a.g();
                    return z8;
                }
                int i6 = cVar.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    if (sVar.c(cVar.c[i6]) < 0 && i6 < (i2 = cVar.b)) {
                        int i7 = i2 - 1;
                        int i8 = i6;
                        while (i8 < i7) {
                            long[] jArr = cVar.c;
                            int i9 = i8 + 1;
                            jArr[i8] = jArr[i9];
                            i8 = i9;
                        }
                        cVar.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(sVar2.g());
                int iG2 = sVar2.g();
                for (int i10 = 0; i10 < iG2; i10++) {
                    arrayList3.add(sVar2.h(i10));
                }
                m mVar2 = new m(arrayList3, q0Var);
                int size2 = arrayList3.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i11);
                    if (q0Var.a(((v) obj).a)) {
                        break;
                    }
                    i11++;
                }
                v vVar5 = (v) obj;
                if (vVar5 != null) {
                    boolean z9 = vVar5.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || vVar5.h)) {
                            d1 d1Var4 = this.f;
                            d1Var4.getClass();
                            long j7 = d1Var4.z;
                            long j8 = vVar5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i12 = (int) (j7 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat > ((float) i12) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z10 = this.i;
                    boolean z11 = this.h;
                    if (z10 == z11 || !((i = mVar2.f) == 3 || i == 4 || i == 5)) {
                        int i13 = mVar2.f;
                        if (i13 == 4 && z11 && !this.j) {
                            mVar2.f = 3;
                        } else if (i13 == 5 && z10 && z9) {
                            mVar2.f = 3;
                        }
                    } else {
                        mVar2.f = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && mVar2.f == 3 && (mVar = this.g) != null) {
                    ?? r1 = mVar.a;
                    int size3 = r1.size();
                    ?? r5 = mVar2.a;
                    if (size3 != r5.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = r5.size();
                    ?? r6 = z2;
                    while (true) {
                        if (r6 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!androidx.compose.ui.geometry.b.b(((v) r1.get(r6)).c, ((v) r5.get(r6)).c)) {
                            z3 = z8;
                            break;
                        }
                        r6++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.g = mVar2;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.ui.input.pointer.l
    public final void b(q0 q0Var) {
        super.b(q0Var);
        m mVar = this.g;
        if (mVar == null) {
            return;
        }
        this.h = this.i;
        ?? r1 = mVar.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            v vVar = (v) r1.get(i);
            boolean z = vVar.d;
            long j = vVar.a;
            boolean zA = q0Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.e(j);
            }
        }
        this.i = false;
        this.j = mVar.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        androidx.compose.runtime.collection.b bVar = this.a;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((k) objArr[i2]).c();
        }
        ?? E = this.c;
        ?? bVar2 = 0;
        while (E != 0) {
            if (E instanceof r1) {
                ((r1) E).E();
            } else if ((E.z & 16) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                androidx.compose.ui.q qVar = ((androidx.compose.ui.node.j) E).M;
                int i3 = 0;
                E = E;
                bVar2 = bVar2;
                while (qVar != null) {
                    if ((qVar.z & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            bVar2 = bVar2;
                            E = qVar;
                        } else {
                            if (bVar2 == 0) {
                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                            }
                            if (E != 0) {
                                bVar2.b(E);
                                E = 0;
                            }
                            bVar2.b(qVar);
                        }
                    }
                    qVar = qVar.C;
                    E = E;
                    bVar2 = bVar2;
                }
                if (i3 == 1) {
                }
            }
            E = androidx.compose.ui.node.k.e(bVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(q0 q0Var) {
        androidx.collection.s sVar = this.e;
        boolean z = false;
        z = false;
        if (sVar.g() != 0) {
            androidx.compose.ui.q qVar = this.c;
            if (qVar.K) {
                m mVar = this.g;
                mVar.getClass();
                d1 d1Var = this.f;
                d1Var.getClass();
                long j = d1Var.z;
                ?? E = qVar;
                ?? bVar = 0;
                while (E != 0) {
                    if (E instanceof r1) {
                        ((r1) E).D(mVar, n.z, j);
                    } else if ((E.z & 16) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                        androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                        int i = 0;
                        while (qVar2 != null) {
                            if ((qVar2.z & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    E = E;
                                    bVar = bVar;
                                    bVar = bVar;
                                    E = qVar2;
                                } else {
                                    if (bVar == 0) {
                                        bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
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
                        if (i == 1) {
                            E = E;
                            bVar = bVar;
                        } else {
                            E = E;
                            bVar = bVar;
                        }
                    }
                    E = androidx.compose.ui.node.k.e(bVar);
                }
                if (qVar.K) {
                    androidx.compose.runtime.collection.b bVar2 = this.a;
                    Object[] objArr = bVar2.e;
                    int i2 = bVar2.z;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((k) objArr[i3]).d(q0Var);
                    }
                }
                z = true;
            }
        }
        b(q0Var);
        sVar.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(q0 q0Var, boolean z) {
        if (this.e.g() == 0) {
            return false;
        }
        ?? E = this.c;
        if (!E.K) {
            return false;
        }
        m mVar = this.g;
        mVar.getClass();
        d1 d1Var = this.f;
        d1Var.getClass();
        long j = d1Var.z;
        ?? E2 = E;
        ?? bVar = 0;
        while (E2 != 0) {
            if (E2 instanceof r1) {
                ((r1) E2).D(mVar, n.e, j);
            } else if ((E2.z & 16) != 0 && (E2 instanceof androidx.compose.ui.node.j)) {
                androidx.compose.ui.q qVar = ((androidx.compose.ui.node.j) E2).M;
                int i = 0;
                while (qVar != null) {
                    if ((qVar.z & 16) != 0) {
                        i++;
                        if (i == 1) {
                            E2 = E2;
                            bVar = bVar;
                            bVar = bVar;
                            E2 = qVar;
                        } else {
                            if (bVar == 0) {
                                bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                            }
                            if (E2 != 0) {
                                bVar.b(E2);
                                E2 = 0;
                            }
                            bVar.b(qVar);
                        }
                    } else {
                        E2 = E2;
                        bVar = bVar;
                    }
                    qVar = qVar.C;
                    E2 = E2;
                    bVar = bVar;
                }
                if (i == 1) {
                    E2 = E2;
                    bVar = bVar;
                } else {
                    E2 = E2;
                    bVar = bVar;
                }
            }
            E2 = androidx.compose.ui.node.k.e(bVar);
        }
        if (E.K) {
            androidx.compose.runtime.collection.b bVar2 = this.a;
            Object[] objArr = bVar2.e;
            int i2 = bVar2.z;
            for (int i3 = 0; i3 < i2; i3++) {
                k kVar = (k) objArr[i3];
                this.f.getClass();
                kVar.e(q0Var, z);
            }
        }
        if (E.K) {
            ?? bVar3 = 0;
            while (E != 0) {
                if (E instanceof r1) {
                    ((r1) E).D(mVar, n.y, j);
                } else if ((E.z & 16) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                    androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                    int i4 = 0;
                    while (qVar2 != null) {
                        if ((qVar2.z & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                E = E;
                                bVar3 = bVar3;
                                bVar3 = bVar3;
                                E = qVar2;
                            } else {
                                if (bVar3 == 0) {
                                    bVar3 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                }
                                if (E != 0) {
                                    bVar3.b(E);
                                    E = 0;
                                }
                                bVar3.b(qVar2);
                            }
                        } else {
                            E = E;
                            bVar3 = bVar3;
                        }
                        qVar2 = qVar2.C;
                        E = E;
                        bVar3 = bVar3;
                    }
                    if (i4 == 1) {
                        E = E;
                        bVar3 = bVar3;
                    } else {
                        E = E;
                        bVar3 = bVar3;
                    }
                }
                E = androidx.compose.ui.node.k.e(bVar3);
            }
        }
        return true;
    }

    public final void f(long j, androidx.collection.j0 j0Var) {
        androidx.compose.ui.input.pointer.util.c cVar = this.d;
        if (cVar.c(j) && j0Var.g(this) < 0) {
            cVar.e(j);
            this.e.f(j);
        }
        androidx.compose.runtime.collection.b bVar = this.a;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((k) objArr[i2]).f(j, j0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
