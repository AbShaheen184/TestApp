package androidx.constraintlayout.core.widgets;

import androidx.appcompat.widget.c2;
import androidx.constraintlayout.core.widgets.analyzer.n;
import androidx.constraintlayout.core.widgets.analyzer.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final androidx.constraintlayout.core.widgets.analyzer.b K0;
    public ArrayList p0 = new ArrayList();
    public final c2 q0 = new c2(this);
    public final androidx.constraintlayout.core.widgets.analyzer.e r0;
    public int s0;
    public androidx.constraintlayout.widget.f t0;
    public boolean u0;
    public final androidx.constraintlayout.core.c v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public e() {
        androidx.constraintlayout.core.widgets.analyzer.e eVar = new androidx.constraintlayout.core.widgets.analyzer.e();
        eVar.b = true;
        eVar.c = true;
        eVar.f = new ArrayList();
        new ArrayList();
        eVar.h = null;
        eVar.i = new androidx.constraintlayout.core.widgets.analyzer.b();
        eVar.g = new ArrayList();
        eVar.d = this;
        eVar.e = this;
        this.r0 = eVar;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new androidx.constraintlayout.core.c();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new androidx.constraintlayout.core.widgets.analyzer.b();
    }

    public static void Q(d dVar, androidx.constraintlayout.widget.f fVar, androidx.constraintlayout.core.widgets.analyzer.b bVar) {
        int i;
        int i2;
        if (fVar == null) {
            return;
        }
        int i3 = dVar.f0;
        int[] iArr = dVar.s;
        if (i3 == 8 || (dVar instanceof h) || (dVar instanceof a)) {
            bVar.e = 0;
            bVar.f = 0;
            return;
        }
        int[] iArr2 = dVar.o0;
        bVar.a = iArr2[0];
        bVar.b = iArr2[1];
        bVar.c = dVar.n();
        bVar.d = dVar.k();
        bVar.i = false;
        bVar.j = 0;
        boolean z = bVar.a == 3;
        boolean z2 = bVar.b == 3;
        boolean z3 = z && dVar.V > 0.0f;
        boolean z4 = z2 && dVar.V > 0.0f;
        if (z && dVar.q(0) && dVar.q == 0 && !z3) {
            bVar.a = 2;
            if (z2 && dVar.r == 0) {
                bVar.a = 1;
            }
            z = false;
        }
        if (z2 && dVar.q(1) && dVar.r == 0 && !z4) {
            bVar.b = 2;
            if (z && dVar.q == 0) {
                bVar.b = 1;
            }
            z2 = false;
        }
        if (dVar.x()) {
            bVar.a = 1;
            z = false;
        }
        if (dVar.y()) {
            bVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                bVar.a = 1;
            } else if (!z2) {
                if (bVar.b == 1) {
                    i2 = bVar.d;
                } else {
                    bVar.a = 2;
                    fVar.b(dVar, bVar);
                    i2 = bVar.f;
                }
                bVar.a = 1;
                bVar.c = (int) (dVar.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                bVar.b = 1;
            } else if (!z) {
                if (bVar.a == 1) {
                    i = bVar.c;
                } else {
                    bVar.b = 2;
                    fVar.b(dVar, bVar);
                    i = bVar.e;
                }
                bVar.b = 1;
                int i4 = dVar.W;
                float f = dVar.V;
                if (i4 == -1) {
                    bVar.d = (int) (i / f);
                } else {
                    bVar.d = (int) (f * i);
                }
            }
        }
        fVar.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
        bVar.j = 0;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void C(c2 c2Var) {
        super.C(c2Var);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.p0.get(i)).C(c2Var);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((d) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(d dVar, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            b[] bVarArr = this.B0;
            if (i2 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i3 = this.y0;
            bVarArr2[i3] = new b(dVar, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i4 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i5 = this.z0;
            bVarArr4[i5] = new b(dVar, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(androidx.constraintlayout.core.c cVar) {
        e eVar;
        androidx.constraintlayout.core.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            d dVar = (d) this.p0.get(i);
            boolean[] zArr = dVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar2 = (d) this.p0.get(i2);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i3 = 0; i3 < aVar.q0; i3++) {
                        d dVar3 = aVar.p0[i3];
                        if (aVar.s0 || dVar3.c()) {
                            int i4 = aVar.r0;
                            if (i4 == 0 || i4 == 1) {
                                dVar3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar4 = (d) this.p0.get(i5);
            dVar4.getClass();
            boolean z2 = dVar4 instanceof g;
            if (z2 || (dVar4 instanceof h)) {
                if (z2) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g gVar = (g) ((d) it.next());
                for (int i6 = 0; i6 < gVar.q0; i6++) {
                    if (hashSet.contains(gVar.p0[i6])) {
                        gVar.b(cVar, zR);
                        hashSet.remove(gVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (androidx.constraintlayout.core.c.p) {
            HashSet<d> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar5 = (d) this.p0.get(i7);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            eVar = this;
            cVar2 = cVar;
            eVar.a(this, cVar2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (d dVar6 : hashSet2) {
                j.b(this, cVar2, dVar6);
                dVar6.b(cVar2, zR);
            }
        } else {
            eVar = this;
            cVar2 = cVar;
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = (d) eVar.p0.get(i8);
                if (dVar7 instanceof e) {
                    int[] iArr = dVar7.o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        dVar7.H(1);
                    }
                    if (i10 == 2) {
                        dVar7.I(1);
                    }
                    dVar7.b(cVar2, zR);
                    if (i9 == 2) {
                        dVar7.H(i9);
                    }
                    if (i10 == 2) {
                        dVar7.I(i10);
                    }
                } else {
                    j.b(this, cVar2, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar2, zR);
                    }
                }
            }
        }
        if (eVar.y0 > 0) {
            j.a(this, cVar2, null, 0);
        }
        if (eVar.z0 > 0) {
            j.a(this, cVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    public final boolean O(int i, boolean z) {
        boolean z2;
        androidx.constraintlayout.core.widgets.analyzer.e eVar = this.r0;
        ArrayList<o> arrayList = (ArrayList) eVar.f;
        e eVar2 = (e) eVar.d;
        boolean z3 = false;
        int iJ = eVar2.j(0);
        int iJ2 = eVar2.j(1);
        int iO = eVar2.o();
        int iP = eVar2.p();
        if (z && (iJ == 2 || iJ2 == 2)) {
            for (o oVar : arrayList) {
                if (oVar.f == i && !oVar.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    eVar2.H(1);
                    eVar2.J(eVar.e(eVar2, 0));
                    eVar2.d.e.d(eVar2.n());
                }
            } else if (z && iJ2 == 2) {
                eVar2.I(1);
                eVar2.G(eVar.e(eVar2, 1));
                eVar2.e.e.d(eVar2.k());
            }
        }
        int[] iArr = eVar2.o0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iN = eVar2.n() + iO;
                eVar2.d.i.d(iN);
                eVar2.d.e.d(iN - iO);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iK = eVar2.k() + iP;
                eVar2.e.i.d(iK);
                eVar2.e.e.d(iK - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        eVar.i();
        for (o oVar2 : arrayList) {
            if (oVar2.f == i && (oVar2.b != eVar2 || oVar2.g)) {
                oVar2.e();
            }
        }
        for (o oVar3 : arrayList) {
            if (oVar3.f == i && (z2 || oVar3.b != eVar2)) {
                if (!oVar3.h.j || !oVar3.i.j || (!(oVar3 instanceof androidx.constraintlayout.core.widgets.analyzer.c) && !oVar3.e.j)) {
                    eVar2.H(iJ);
                    eVar2.I(iJ2);
                    return z3;
                }
            }
        }
        z3 = true;
        eVar2.H(iJ);
        eVar2.I(iJ2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:361:0x0616  */
    /* JADX WARN: Code duplicated, block: B:375:0x0645  */
    /* JADX WARN: Code duplicated, block: B:400:0x068e  */
    /* JADX WARN: Code duplicated, block: B:405:0x069f  */
    /* JADX WARN: Code duplicated, block: B:412:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:415:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:417:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e5 A[Catch: Exception -> 0x06f3, LOOP:12: B:423:0x06e3->B:424:0x06e5, LOOP_END, TryCatch #4 {Exception -> 0x06f3, blocks: (B:422:0x06d7, B:424:0x06e5, B:427:0x06fa), top: B:549:0x06d7 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x072c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0732 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:448:0x0756 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:459:0x0781 A[Catch: Exception -> 0x0722, TryCatch #6 {Exception -> 0x0722, blocks: (B:434:0x071b, B:441:0x072e, B:443:0x0732, B:445:0x0738, B:446:0x0752, B:448:0x0756, B:450:0x075c, B:454:0x0772, B:457:0x077d, B:459:0x0781, B:461:0x0787), top: B:553:0x071b }] */
    /* JADX WARN: Code duplicated, block: B:473:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:479:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:481:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:483:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:485:0x0802  */
    /* JADX WARN: Code duplicated, block: B:488:0x0811  */
    /* JADX WARN: Code duplicated, block: B:490:0x081a A[LOOP:15: B:489:0x0818->B:490:0x081a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:494:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:499:0x083b A[LOOP:14: B:498:0x0839->B:499:0x083b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:502:0x086f  */
    /* JADX WARN: Code duplicated, block: B:506:0x0881  */
    /* JADX WARN: Code duplicated, block: B:511:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:512:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:515:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:516:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:518:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:520:0x08d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:523:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:526:0x08ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:531:0x0905  */
    /* JADX WARN: Code duplicated, block: B:533:0x0909  */
    /* JADX WARN: Code duplicated, block: B:534:0x090b  */
    /* JADX WARN: Code duplicated, block: B:538:0x091a  */
    /* JADX WARN: Code duplicated, block: B:599:0x06c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v77 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r33v0, types: [androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.e] */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v118, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v86, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v69, types: [int] */
    /* JADX WARN: Type inference failed for: r6v83, types: [int] */
    public final void P() {
        ?? r22;
        c cVar;
        int i;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i2;
        boolean zR;
        ?? r13;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        boolean[] zArr;
        boolean[] zArr2;
        int i5;
        boolean z7;
        int iMax;
        ?? r5;
        ?? r18;
        boolean z8;
        int iMax2;
        ?? r14;
        boolean z9;
        boolean z10;
        ?? r15;
        ?? r16;
        int i6;
        boolean z11;
        boolean z12;
        boolean z13;
        ?? r17;
        ?? r19;
        int i7;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zR2;
        int size;
        int i8;
        boolean z14;
        d dVar;
        boolean z15;
        int i9;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        c cVar2;
        d dVar2;
        n nVar;
        n nVar2;
        int iB;
        int i10;
        n nVar3;
        n nVar4;
        boolean z16;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        boolean z17;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size2 = this.p0.size();
        int iMax7 = Math.max(0, n());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.o0;
        int i12 = iArr[1];
        int i13 = iArr[0];
        int i14 = this.s0;
        c cVar3 = this.I;
        c cVar4 = this.H;
        if (i14 == 0 && j.c(this.C0, 1)) {
            androidx.constraintlayout.widget.f fVar = this.t0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            B();
            ArrayList arrayList3 = this.p0;
            int size3 = arrayList3.size();
            for (int i17 = 0; i17 < size3; i17++) {
                ((d) arrayList3.get(i17)).B();
            }
            boolean z18 = this.u0;
            if (i15 == 1) {
                E(0, n());
            } else {
                cVar4.l(0);
                this.X = 0;
            }
            int i18 = 0;
            boolean z19 = false;
            boolean z20 = false;
            while (i18 < size3) {
                int[] iArr2 = iArr;
                d dVar3 = (d) arrayList3.get(i18);
                int i19 = i18;
                if (dVar3 instanceof h) {
                    h hVar = (h) dVar3;
                    z17 = z19;
                    if (hVar.t0 == 1) {
                        int i20 = hVar.q0;
                        if (i20 != -1) {
                            hVar.M(i20);
                        } else if (hVar.r0 != -1 && x()) {
                            hVar.M(n() - hVar.r0);
                        } else if (x()) {
                            hVar.M((int) ((hVar.p0 * n()) + 0.5f));
                        }
                        z17 = true;
                    }
                } else {
                    z17 = z19;
                    if ((dVar3 instanceof a) && ((a) dVar3).P() == 0) {
                        z19 = z17;
                        z20 = true;
                    }
                    i18 = i19 + 1;
                    iArr = iArr2;
                }
                z19 = z17;
                i18 = i19 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z19) {
                for (int i21 = 0; i21 < size3; i21 = i11 + 1) {
                    d dVar4 = (d) arrayList3.get(i21);
                    if (dVar4 instanceof h) {
                        h hVar2 = (h) dVar4;
                        i11 = i21;
                        if (hVar2.t0 == 1) {
                            androidx.constraintlayout.core.widgets.analyzer.h.c(0, hVar2, fVar, z18);
                        }
                    } else {
                        i11 = i21;
                    }
                }
            }
            androidx.constraintlayout.core.widgets.analyzer.h.c(0, this, fVar, z18);
            if (z20) {
                for (int i22 = 0; i22 < size3; i22++) {
                    d dVar5 = (d) arrayList3.get(i22);
                    if (dVar5 instanceof a) {
                        a aVar = (a) dVar5;
                        if (aVar.P() == 0 && aVar.O()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.c(1, aVar, fVar, z18);
                        }
                    }
                }
            }
            if (i16 == 1) {
                F(0, k());
            } else {
                cVar3.l(0);
                this.Y = 0;
            }
            int i23 = 0;
            boolean z21 = false;
            boolean z22 = false;
            while (i23 < size3) {
                d dVar6 = (d) arrayList3.get(i23);
                int i24 = i23;
                if (dVar6 instanceof h) {
                    h hVar3 = (h) dVar6;
                    if (hVar3.t0 == 0) {
                        int i25 = hVar3.q0;
                        if (i25 != -1) {
                            hVar3.M(i25);
                        } else if (hVar3.r0 != -1 && y()) {
                            hVar3.M(k() - hVar3.r0);
                        } else if (y()) {
                            hVar3.M((int) ((hVar3.p0 * k()) + 0.5f));
                        }
                        z21 = true;
                    }
                } else if ((dVar6 instanceof a) && ((a) dVar6).P() == 1) {
                    z22 = true;
                }
                i23 = i24 + 1;
            }
            if (z21) {
                for (int i26 = 0; i26 < size3; i26++) {
                    d dVar7 = (d) arrayList3.get(i26);
                    if (dVar7 instanceof h) {
                        h hVar4 = (h) dVar7;
                        if (hVar4.t0 == 0) {
                            androidx.constraintlayout.core.widgets.analyzer.h.i(1, hVar4, fVar);
                        }
                    }
                }
            }
            androidx.constraintlayout.core.widgets.analyzer.h.i(0, this, fVar);
            if (z22) {
                for (int i27 = 0; i27 < size3; i27++) {
                    d dVar8 = (d) arrayList3.get(i27);
                    if (dVar8 instanceof a) {
                        a aVar2 = (a) dVar8;
                        if (aVar2.P() == 1 && aVar2.O()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i28 = 0; i28 < size3; i28++) {
                d dVar9 = (d) arrayList3.get(i28);
                if (dVar9.w() && androidx.constraintlayout.core.widgets.analyzer.h.a(dVar9)) {
                    Q(dVar9, fVar, androidx.constraintlayout.core.widgets.analyzer.h.a);
                    if (!(dVar9 instanceof h)) {
                        androidx.constraintlayout.core.widgets.analyzer.h.c(0, dVar9, fVar, z18);
                        androidx.constraintlayout.core.widgets.analyzer.h.i(0, dVar9, fVar);
                    } else if (((h) dVar9).t0 == 0) {
                        androidx.constraintlayout.core.widgets.analyzer.h.i(0, dVar9, fVar);
                    } else {
                        androidx.constraintlayout.core.widgets.analyzer.h.c(0, dVar9, fVar, z18);
                    }
                }
            }
            for (int i29 = 0; i29 < size2; i29++) {
                d dVar10 = (d) this.p0.get(i29);
                if (dVar10.w() && !(dVar10 instanceof h) && !(dVar10 instanceof a) && !(dVar10 instanceof g) && !dVar10.E) {
                    int iJ = dVar10.j(0);
                    int iJ2 = dVar10.j(1);
                    if (iJ != 3 || dVar10.q == 1 || iJ2 != 3 || dVar10.r == 1) {
                        Q(dVar10, this.t0, new androidx.constraintlayout.core.widgets.analyzer.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        androidx.constraintlayout.core.c cVar5 = this.v0;
        if (size2 > 2 && ((i13 == 2 || i12 == 2) && j.c(this.C0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY))) {
            androidx.constraintlayout.widget.f fVar2 = this.t0;
            ArrayList arrayList4 = this.p0;
            int size4 = arrayList4.size();
            int i30 = 0;
            while (true) {
                if (i30 >= size4) {
                    cVar = cVar4;
                    int i31 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i31 < size4) {
                        int i32 = i31;
                        d dVar11 = (d) arrayList4.get(i31);
                        ArrayList arrayList11 = arrayList5;
                        ?? r6 = r22[0];
                        ArrayList arrayList12 = arrayList6;
                        ?? r7 = r22[1];
                        ArrayList arrayList13 = arrayList7;
                        int[] iArr3 = dVar11.o0;
                        ArrayList arrayList14 = arrayList8;
                        if (!androidx.constraintlayout.core.widgets.analyzer.h.h(r6, r7, iArr3[0], iArr3[1])) {
                            Q(dVar11, fVar2, this.K0);
                        }
                        boolean z23 = dVar11 instanceof h;
                        if (z23) {
                            h hVar5 = (h) dVar11;
                            if (hVar5.t0 == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(hVar5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z16 = z23;
                            if (hVar5.t0 == 1) {
                                arrayList = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList.add(hVar5);
                            } else {
                                arrayList = arrayList11;
                            }
                        } else {
                            z16 = z23;
                            arrayList = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (dVar11 instanceof i) {
                            if (dVar11 instanceof a) {
                                a aVar3 = (a) dVar11;
                                if (aVar3.P() == 0) {
                                    arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                    arrayList2.add(aVar3);
                                } else {
                                    arrayList2 = arrayList12;
                                }
                                if (aVar3.P() == 1) {
                                    ArrayList arrayList15 = arrayList14 == null ? new ArrayList() : arrayList14;
                                    arrayList15.add(aVar3);
                                    arrayList14 = arrayList15;
                                }
                                arrayList6 = arrayList2;
                            } else {
                                arrayList = arrayList;
                                fVar2 = fVar2;
                                i iVar = (i) dVar11;
                                arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList6.add(iVar);
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(iVar);
                            }
                            if (dVar11.H.f == null && dVar11.J.f == null && !z16 && !(dVar11 instanceof a)) {
                                if (arrayList9 == null) {
                                    arrayList9 = new ArrayList();
                                }
                                ArrayList arrayList16 = arrayList9;
                                arrayList16.add(dVar11);
                                arrayList9 = arrayList16;
                            }
                            if (dVar11.I.f != null && dVar11.K.f == null && dVar11.L.f == null && !z16 && !(dVar11 instanceof a)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(dVar11);
                                arrayList10 = arrayList17;
                            }
                            i31 = i32 + 1;
                            arrayList5 = arrayList;
                            fVar2 = fVar2;
                        } else {
                            arrayList6 = arrayList12;
                        }
                        arrayList8 = arrayList14;
                        if (dVar11.H.f == null) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList18 = arrayList9;
                            arrayList18.add(dVar11);
                            arrayList9 = arrayList18;
                        }
                        if (dVar11.I.f != null) {
                        }
                        i31 = i32 + 1;
                        arrayList5 = arrayList;
                        fVar2 = fVar2;
                    }
                    ArrayList arrayList19 = arrayList5;
                    ArrayList<i> arrayList20 = arrayList6;
                    ArrayList arrayList21 = arrayList7;
                    ArrayList<i> arrayList22 = arrayList8;
                    ArrayList<n> arrayList23 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b((h) it.next(), 0, arrayList23, null);
                        }
                    }
                    n nVar5 = null;
                    int i33 = 0;
                    if (arrayList20 != null) {
                        for (i iVar2 : arrayList20) {
                            n nVarB = androidx.constraintlayout.core.widgets.analyzer.h.b(iVar2, i33, arrayList23, nVar5);
                            iVar2.M(i33, nVarB, arrayList23);
                            nVarB.a(arrayList23);
                            nVar5 = null;
                            i33 = 0;
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it2.next()).d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it3.next()).d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it4.next()).d, 0, arrayList23, null);
                        }
                    }
                    n nVar6 = null;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b((d) it5.next(), 0, arrayList23, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it6 = arrayList21.iterator();
                        while (it6.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b((h) it6.next(), 1, arrayList23, null);
                        }
                    }
                    int i34 = 1;
                    if (arrayList22 != null) {
                        for (i iVar3 : arrayList22) {
                            n nVarB2 = androidx.constraintlayout.core.widgets.analyzer.h.b(iVar3, i34, arrayList23, nVar6);
                            iVar3.M(i34, nVarB2, arrayList23);
                            nVarB2.a(arrayList23);
                            nVar6 = null;
                            i34 = 1;
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it7.next()).d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it8.next()).d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it9.next()).d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b(((c) it10.next()).d, 1, arrayList23, null);
                        }
                    }
                    boolean z24 = true;
                    if (arrayList10 != null) {
                        Iterator it11 = arrayList10.iterator();
                        while (it11.hasNext()) {
                            androidx.constraintlayout.core.widgets.analyzer.h.b((d) it11.next(), 1, arrayList23, null);
                        }
                    }
                    int i35 = 0;
                    while (i35 < size4) {
                        d dVar12 = (d) arrayList4.get(i35);
                        int[] iArr4 = dVar12.o0;
                        boolean z25 = z24;
                        if (iArr4[0] == 3 && iArr4[z25 ? 1 : 0] == 3) {
                            int i36 = dVar12.m0;
                            int size5 = arrayList23.size();
                            int i37 = 0;
                            while (true) {
                                if (i37 >= size5) {
                                    i10 = i35;
                                    nVar3 = null;
                                    break;
                                }
                                i10 = i35;
                                nVar3 = (n) arrayList23.get(i37);
                                int i38 = size5;
                                if (i36 == nVar3.b) {
                                    break;
                                }
                                i37++;
                                size5 = i38;
                                i35 = i10;
                            }
                            int i39 = dVar12.n0;
                            int size6 = arrayList23.size();
                            int i40 = 0;
                            while (true) {
                                if (i40 >= size6) {
                                    nVar4 = null;
                                    break;
                                }
                                nVar4 = (n) arrayList23.get(i40);
                                int i41 = size6;
                                if (i39 == nVar4.b) {
                                    break;
                                }
                                i40++;
                                size6 = i41;
                            }
                            if (nVar3 != null && nVar4 != null) {
                                nVar3.c(0, nVar4);
                                nVar4.c = 2;
                                arrayList23.remove(nVar3);
                            }
                        } else {
                            i10 = i35;
                        }
                        i35 = i10 + 1;
                        z24 = true;
                    }
                    if (arrayList23.size() <= 1) {
                        break;
                    }
                    int i42 = 0;
                    if (r22[0] == 2) {
                        int i43 = 0;
                        nVar = null;
                        for (n nVar7 : arrayList23) {
                            if (nVar7.c != 1) {
                                int iB2 = nVar7.b(cVar5, i42);
                                if (iB2 > i43) {
                                    nVar = nVar7;
                                    i43 = iB2;
                                }
                                i42 = 0;
                            }
                        }
                        if (nVar != null) {
                            H(1);
                            J(i43);
                        } else {
                            nVar = null;
                        }
                    } else {
                        nVar = null;
                    }
                    if (r22[1] == 2) {
                        int i44 = 0;
                        nVar2 = null;
                        for (n nVar8 : arrayList23) {
                            if (nVar8.c != 0 && (iB = nVar8.b(cVar5, 1)) > i44) {
                                nVar2 = nVar8;
                                i44 = iB;
                            }
                        }
                        if (nVar2 != null) {
                            I(1);
                            G(i44);
                        } else {
                            nVar2 = null;
                        }
                    } else {
                        nVar2 = null;
                    }
                    if (nVar != null || nVar2 != null) {
                        if (i13 == 2) {
                            if (iMax7 >= n() || iMax7 <= 0) {
                                iMax7 = n();
                            } else {
                                J(iMax7);
                                this.D0 = true;
                            }
                        }
                        if (i12 == 2) {
                            if (iMax8 >= k() || iMax8 <= 0) {
                                iMax8 = k();
                            } else {
                                G(iMax8);
                                this.E0 = true;
                            }
                        }
                        i = iMax7;
                        z = true;
                        break;
                    }
                } else {
                    d dVar13 = (d) arrayList4.get(i30);
                    ?? r8 = r22[0];
                    ?? r9 = r22[1];
                    int i45 = i30;
                    int[] iArr5 = dVar13.o0;
                    cVar = cVar4;
                    if (androidx.constraintlayout.core.widgets.analyzer.h.h(r8, r9, iArr5[0], iArr5[1]) && !(dVar13 instanceof g)) {
                        i30 = i45 + 1;
                        cVar4 = cVar;
                    }
                }
            }
            if (!R(64) || R(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            cVar5.getClass();
            cVar5.g = false;
            if (this.C0 == 0 && z2) {
                c = 1;
                cVar5.g = true;
            } else {
                c = 1;
            }
            ArrayList arrayList24 = this.p0;
            if (r22[0] != 2 || r22[c] == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.y0 = 0;
            this.z0 = 0;
            for (i2 = 0; i2 < size2; i2++) {
                dVar2 = (d) this.p0.get(i2);
                if (dVar2 instanceof e) {
                    ((e) dVar2).P();
                }
            }
            zR = R(64);
            r13 = z;
            i3 = 0;
            z4 = true;
            while (z4) {
                i4 = i3 + 1;
                try {
                    cVar5.t();
                    this.y0 = 0;
                    this.z0 = 0;
                    g(cVar5);
                    for (i9 = 0; i9 < size2; i9++) {
                        ((d) this.p0.get(i9)).g(cVar5);
                    }
                    N(cVar5);
                    try {
                        weakReference = this.F0;
                        if (weakReference != null || weakReference.get() == null) {
                            z5 = z3;
                        } else {
                            z5 = z3;
                            try {
                                cVar5.f(cVar5.k((c) this.F0.get()), cVar5.k(cVar3), 0, 5);
                                this.F0 = null;
                            } catch (Exception e) {
                                e = e;
                                z15 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z6 = z15;
                                zArr = j.a;
                                if (z6) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar5, zR2);
                                    size = this.p0.size();
                                    i8 = 0;
                                    z14 = false;
                                    while (i8 < size) {
                                        dVar = (d) this.p0.get(i8);
                                        dVar.L(cVar5, zR2);
                                        boolean[] zArr3 = zArr;
                                        boolean z26 = zR2;
                                        if (dVar.h == -1) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        i8++;
                                        zArr = zArr3;
                                        zR2 = z26;
                                        z14 = z14;
                                    }
                                    zArr2 = zArr;
                                    z7 = z14;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar5, zR);
                                    for (i5 = 0; i5 < size2; i5++) {
                                        ((d) this.p0.get(i5)).L(cVar5, zR);
                                    }
                                    z7 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i7 = 0; i7 < size2; i7++) {
                                        d dVar14 = (d) this.p0.get(i7);
                                        iMax3 = Math.max(iMax3, dVar14.n() + dVar14.X);
                                        iMax4 = Math.max(iMax4, dVar14.k() + dVar14.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.b0, iMax4);
                                    r13 = r13;
                                    z7 = z7;
                                    if (i13 == 2) {
                                        r13 = r13;
                                        z7 = z7;
                                        J(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                    if (i12 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r5 = 1;
                                    r22[0] = 1;
                                    z8 = true;
                                    r18 = 1;
                                } else {
                                    r5 = 1;
                                    r18 = r13;
                                    z8 = z7;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r5] = r5;
                                    r19 = r5;
                                    z9 = r19 == true ? 1 : 0;
                                } else {
                                    r14 = r18;
                                }
                                if (r14 == 0) {
                                    z9 = z8;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z13 = z9;
                                        if (n() > i) {
                                            this.D0 = r5;
                                            r22[0] = r5;
                                            J(i);
                                            ?? r110 = r5;
                                            z13 = r110 == true ? 1 : 0;
                                            r17 = r110;
                                        }
                                    }
                                    r14 = r19;
                                    r17 = r14;
                                    r17 = r14;
                                    z13 = z9;
                                    z13 = z9;
                                    r15 = r17;
                                    r15 = r17;
                                    z10 = z13;
                                    z10 = z13;
                                    if (r22[r5] != 2) {
                                    }
                                    if (i4 > i6) {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = false;
                                    } else {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = z11;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z4 = z12;
                                } else {
                                    z9 = z8;
                                    r14 = r19;
                                    r15 = r14;
                                    z10 = z9;
                                }
                                r15 = r17;
                                z10 = z13;
                                r16 = r15;
                                i6 = 8;
                                z11 = z10;
                                if (i4 > i6) {
                                    r15 = r17;
                                    z10 = z13;
                                    z12 = false;
                                } else {
                                    r15 = r17;
                                    z10 = z13;
                                    z12 = z11;
                                }
                                i3 = i4;
                                z3 = z5;
                                cVar3 = cVar3;
                                r13 = r16;
                                z4 = z12;
                            }
                        }
                        weakReference2 = this.H0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            cVar5.f(cVar5.k(this.K), cVar5.k((c) this.H0.get()), 0, 5);
                            this.H0 = null;
                        }
                        weakReference3 = this.G0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            cVar2 = cVar;
                            try {
                                cVar = cVar2;
                                cVar5.f(cVar5.k((c) this.G0.get()), cVar5.k(cVar2), 0, 5);
                                this.G0 = null;
                            } catch (Exception e2) {
                                e = e2;
                                cVar = cVar2;
                                z15 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z6 = z15;
                                zArr = j.a;
                                if (z6) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar5, zR2);
                                    size = this.p0.size();
                                    i8 = 0;
                                    z14 = false;
                                    while (i8 < size) {
                                        dVar = (d) this.p0.get(i8);
                                        dVar.L(cVar5, zR2);
                                        boolean[] zArr4 = zArr;
                                        boolean z27 = zR2;
                                        if (dVar.h == -1) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        i8++;
                                        zArr = zArr4;
                                        zR2 = z27;
                                        z14 = z14;
                                    }
                                    zArr2 = zArr;
                                    z7 = z14;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar5, zR);
                                    while (i5 < size2) {
                                        ((d) this.p0.get(i5)).L(cVar5, zR);
                                    }
                                    z7 = false;
                                }
                                if (z5) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i7 < size2) {
                                        d dVar15 = (d) this.p0.get(i7);
                                        iMax3 = Math.max(iMax3, dVar15.n() + dVar15.X);
                                        iMax4 = Math.max(iMax4, dVar15.k() + dVar15.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax3);
                                    iMax6 = Math.max(this.b0, iMax4);
                                    r13 = r13;
                                    z7 = z7;
                                    if (i13 == 2) {
                                        r13 = r13;
                                        z7 = z7;
                                        J(iMax5);
                                        r22[0] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                    if (i12 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z7 = true;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r5 = 1;
                                    r22[0] = 1;
                                    z8 = true;
                                    r18 = 1;
                                } else {
                                    r5 = 1;
                                    r18 = r13;
                                    z8 = z7;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r5] = r5;
                                    r19 = r5;
                                    z9 = r19 == true ? 1 : 0;
                                } else {
                                    r14 = r18;
                                }
                                if (r14 == 0) {
                                    z9 = z8;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z13 = z9;
                                        if (n() > i) {
                                            this.D0 = r5;
                                            r22[0] = r5;
                                            J(i);
                                            ?? r111 = r5;
                                            z13 = r111 == true ? 1 : 0;
                                            r17 = r111;
                                        }
                                    }
                                    r14 = r19;
                                    r17 = r14;
                                    r17 = r14;
                                    z13 = z9;
                                    z13 = z9;
                                    r15 = r17;
                                    r15 = r17;
                                    z10 = z13;
                                    z10 = z13;
                                    if (r22[r5] != 2) {
                                    }
                                    if (i4 > i6) {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = false;
                                    } else {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = z11;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z4 = z12;
                                } else {
                                    z9 = z8;
                                    r14 = r19;
                                    r15 = r14;
                                    z10 = z9;
                                }
                                r15 = r17;
                                z10 = z13;
                                r16 = r15;
                                i6 = 8;
                                z11 = z10;
                                if (i4 > i6) {
                                    r15 = r17;
                                    z10 = z13;
                                    z12 = false;
                                } else {
                                    r15 = r17;
                                    z10 = z13;
                                    z12 = z11;
                                }
                                i3 = i4;
                                z3 = z5;
                                cVar3 = cVar3;
                                r13 = r16;
                                z4 = z12;
                            }
                        }
                        weakReference4 = this.I0;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                                try {
                                    cVar5.f(cVar5.k(this.J), cVar5.k((c) this.I0.get()), 0, 5);
                                    try {
                                        this.I0 = null;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z15 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        z6 = z15;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    z15 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z6 = z15;
                                    zArr = j.a;
                                    if (z6) {
                                        zArr[2] = false;
                                        zR2 = R(64);
                                        L(cVar5, zR2);
                                        size = this.p0.size();
                                        i8 = 0;
                                        z14 = false;
                                        while (i8 < size) {
                                            dVar = (d) this.p0.get(i8);
                                            dVar.L(cVar5, zR2);
                                            boolean[] zArr5 = zArr;
                                            boolean z28 = zR2;
                                            if (dVar.h == -1) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                            }
                                            i8++;
                                            zArr = zArr5;
                                            zR2 = z28;
                                            z14 = z14;
                                        }
                                        zArr2 = zArr;
                                        z7 = z14;
                                    } else {
                                        zArr2 = zArr;
                                        L(cVar5, zR);
                                        while (i5 < size2) {
                                            ((d) this.p0.get(i5)).L(cVar5, zR);
                                        }
                                        z7 = false;
                                    }
                                    if (z5) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i7 < size2) {
                                            d dVar16 = (d) this.p0.get(i7);
                                            iMax3 = Math.max(iMax3, dVar16.n() + dVar16.X);
                                            iMax4 = Math.max(iMax4, dVar16.k() + dVar16.Y);
                                        }
                                        iMax5 = Math.max(this.a0, iMax3);
                                        iMax6 = Math.max(this.b0, iMax4);
                                        r13 = r13;
                                        z7 = z7;
                                        if (i13 == 2) {
                                            r13 = r13;
                                            z7 = z7;
                                            J(iMax5);
                                            r22[0] = 2;
                                            r13 = 1;
                                            z7 = true;
                                        }
                                        if (i12 == 2) {
                                            G(iMax6);
                                            r22[1] = 2;
                                            r13 = 1;
                                            z7 = true;
                                        }
                                    }
                                    iMax = Math.max(this.a0, n());
                                    if (iMax > n()) {
                                        J(iMax);
                                        r5 = 1;
                                        r22[0] = 1;
                                        z8 = true;
                                        r18 = 1;
                                    } else {
                                        r5 = 1;
                                        r18 = r13;
                                        z8 = z7;
                                    }
                                    iMax2 = Math.max(this.b0, k());
                                    if (iMax2 > k()) {
                                        G(iMax2);
                                        r22[r5] = r5;
                                        r19 = r5;
                                        z9 = r19 == true ? 1 : 0;
                                    } else {
                                        r14 = r18;
                                    }
                                    if (r14 == 0) {
                                        z9 = z8;
                                        if (r22[0] == 2) {
                                            r17 = r14;
                                            z13 = z9;
                                            if (n() > i) {
                                                this.D0 = r5;
                                                r22[0] = r5;
                                                J(i);
                                                ?? r112 = r5;
                                                z13 = r112 == true ? 1 : 0;
                                                r17 = r112;
                                            }
                                        }
                                        r14 = r19;
                                        r17 = r14;
                                        r17 = r14;
                                        z13 = z9;
                                        z13 = z9;
                                        r15 = r17;
                                        r15 = r17;
                                        z10 = z13;
                                        z10 = z13;
                                        if (r22[r5] != 2) {
                                        }
                                        if (i4 > i6) {
                                            r15 = r17;
                                            z10 = z13;
                                            z12 = false;
                                        } else {
                                            r15 = r17;
                                            z10 = z13;
                                            z12 = z11;
                                        }
                                        i3 = i4;
                                        z3 = z5;
                                        cVar3 = cVar3;
                                        r13 = r16;
                                        z4 = z12;
                                    } else {
                                        z9 = z8;
                                        r14 = r19;
                                        r15 = r14;
                                        z10 = z9;
                                    }
                                    r15 = r17;
                                    z10 = z13;
                                    r16 = r15;
                                    i6 = 8;
                                    z11 = z10;
                                    if (i4 > i6) {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = false;
                                    } else {
                                        r15 = r17;
                                        z10 = z13;
                                        z12 = z11;
                                    }
                                    i3 = i4;
                                    z3 = z5;
                                    cVar3 = cVar3;
                                    r13 = r16;
                                    z4 = z12;
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        }
                        cVar5.p();
                        z6 = true;
                    } catch (Exception e6) {
                        e = e6;
                        z5 = z3;
                    }
                } catch (Exception e7) {
                    e = e7;
                    z5 = z3;
                    z15 = z4;
                }
                zArr = j.a;
                if (z6) {
                    zArr[2] = false;
                    zR2 = R(64);
                    L(cVar5, zR2);
                    size = this.p0.size();
                    i8 = 0;
                    z14 = false;
                    while (i8 < size) {
                        dVar = (d) this.p0.get(i8);
                        dVar.L(cVar5, zR2);
                        boolean[] zArr6 = zArr;
                        boolean z29 = zR2;
                        if (dVar.h == -1 || dVar.i != -1) {
                            z14 = true;
                        }
                        i8++;
                        zArr = zArr6;
                        zR2 = z29;
                        z14 = z14;
                    }
                    zArr2 = zArr;
                    z7 = z14;
                } else {
                    zArr2 = zArr;
                    L(cVar5, zR);
                    while (i5 < size2) {
                        ((d) this.p0.get(i5)).L(cVar5, zR);
                    }
                    z7 = false;
                }
                if (z5 && i4 < 8 && zArr2[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i7 < size2) {
                        d dVar17 = (d) this.p0.get(i7);
                        iMax3 = Math.max(iMax3, dVar17.n() + dVar17.X);
                        iMax4 = Math.max(iMax4, dVar17.k() + dVar17.Y);
                    }
                    iMax5 = Math.max(this.a0, iMax3);
                    iMax6 = Math.max(this.b0, iMax4);
                    r13 = r13;
                    z7 = z7;
                    if (i13 == 2 && n() < iMax5) {
                        r13 = r13;
                        z7 = z7;
                        J(iMax5);
                        r22[0] = 2;
                        r13 = 1;
                        z7 = true;
                    }
                    if (i12 == 2 && k() < iMax6) {
                        G(iMax6);
                        r22[1] = 2;
                        r13 = 1;
                        z7 = true;
                    }
                }
                iMax = Math.max(this.a0, n());
                if (iMax > n()) {
                    J(iMax);
                    r5 = 1;
                    r22[0] = 1;
                    z8 = true;
                    r18 = 1;
                } else {
                    r5 = 1;
                    r18 = r13;
                    z8 = z7;
                }
                iMax2 = Math.max(this.b0, k());
                if (iMax2 > k()) {
                    G(iMax2);
                    r22[r5] = r5;
                    r19 = r5;
                    z9 = r19 == true ? 1 : 0;
                } else {
                    r14 = r18;
                }
                if (r14 == 0) {
                    z9 = z8;
                    if (r22[0] == 2 && i > 0) {
                        r17 = r14;
                        z13 = z9;
                        if (n() > i) {
                            this.D0 = r5;
                            r22[0] = r5;
                            J(i);
                            ?? r113 = r5;
                            z13 = r113 == true ? 1 : 0;
                            r17 = r113;
                        }
                    }
                    r14 = r19;
                    r17 = r14;
                    r17 = r14;
                    z13 = z9;
                    z13 = z9;
                    r15 = r17;
                    r15 = r17;
                    z10 = z13;
                    z10 = z13;
                    if (r22[r5] != 2 && iMax8 > 0 && k() > iMax8) {
                        this.E0 = r5;
                        r22[r5] = r5;
                        G(iMax8);
                        i6 = 8;
                        r16 = 1;
                        z11 = true;
                    }
                    if (i4 > i6) {
                        r15 = r17;
                        z10 = z13;
                        z12 = false;
                    } else {
                        r15 = r17;
                        z10 = z13;
                        z12 = z11;
                    }
                    i3 = i4;
                    z3 = z5;
                    cVar3 = cVar3;
                    r13 = r16;
                    z4 = z12;
                } else {
                    z9 = z8;
                    r14 = r19;
                    r15 = r14;
                    z10 = z9;
                }
                r15 = r17;
                z10 = z13;
                r16 = r15;
                i6 = 8;
                z11 = z10;
                if (i4 > i6) {
                    r15 = r17;
                    z10 = z13;
                    z12 = false;
                } else {
                    r15 = r17;
                    z10 = z13;
                    z12 = z11;
                }
                i3 = i4;
                z3 = z5;
                cVar3 = cVar3;
                r13 = r16;
                z4 = z12;
            }
            this.p0 = arrayList24;
            if (r13 != 0) {
                r22[0] = i13;
                r22[1] = i12;
            }
            C(cVar5.l);
        }
        cVar = cVar4;
        i = iMax7;
        z = false;
        if (R(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        cVar5.getClass();
        cVar5.g = false;
        if (this.C0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList25 = this.p0;
        if (r22[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.y0 = 0;
        this.z0 = 0;
        while (i2 < size2) {
            dVar2 = (d) this.p0.get(i2);
            if (dVar2 instanceof e) {
                ((e) dVar2).P();
            }
        }
        zR = R(64);
        r13 = z;
        i3 = 0;
        z4 = true;
        while (z4) {
            i4 = i3 + 1;
            cVar5.t();
            this.y0 = 0;
            this.z0 = 0;
            g(cVar5);
            while (i9 < size2) {
                ((d) this.p0.get(i9)).g(cVar5);
            }
            N(cVar5);
            weakReference = this.F0;
            if (weakReference != null) {
                z5 = z3;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar5.f(cVar5.k(this.K), cVar5.k((c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar2 = cVar;
                    cVar = cVar2;
                    cVar5.f(cVar5.k((c) this.G0.get()), cVar5.k(cVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar5.p();
                z6 = true;
            } else {
                z5 = z3;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar5.f(cVar5.k(this.K), cVar5.k((c) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    cVar2 = cVar;
                    cVar = cVar2;
                    cVar5.f(cVar5.k((c) this.G0.get()), cVar5.k(cVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar5.p();
                z6 = true;
            }
            zArr = j.a;
            if (z6) {
                zArr[2] = false;
                zR2 = R(64);
                L(cVar5, zR2);
                size = this.p0.size();
                i8 = 0;
                z14 = false;
                while (i8 < size) {
                    dVar = (d) this.p0.get(i8);
                    dVar.L(cVar5, zR2);
                    boolean[] zArr7 = zArr;
                    boolean z210 = zR2;
                    if (dVar.h == -1) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i8++;
                    zArr = zArr7;
                    zR2 = z210;
                    z14 = z14;
                }
                zArr2 = zArr;
                z7 = z14;
            } else {
                zArr2 = zArr;
                L(cVar5, zR);
                while (i5 < size2) {
                    ((d) this.p0.get(i5)).L(cVar5, zR);
                }
                z7 = false;
            }
            if (z5) {
                iMax3 = 0;
                iMax4 = 0;
                while (i7 < size2) {
                    d dVar18 = (d) this.p0.get(i7);
                    iMax3 = Math.max(iMax3, dVar18.n() + dVar18.X);
                    iMax4 = Math.max(iMax4, dVar18.k() + dVar18.Y);
                }
                iMax5 = Math.max(this.a0, iMax3);
                iMax6 = Math.max(this.b0, iMax4);
                r13 = r13;
                z7 = z7;
                if (i13 == 2) {
                    r13 = r13;
                    z7 = z7;
                    J(iMax5);
                    r22[0] = 2;
                    r13 = 1;
                    z7 = true;
                }
                if (i12 == 2) {
                    G(iMax6);
                    r22[1] = 2;
                    r13 = 1;
                    z7 = true;
                }
            }
            iMax = Math.max(this.a0, n());
            if (iMax > n()) {
                J(iMax);
                r5 = 1;
                r22[0] = 1;
                z8 = true;
                r18 = 1;
            } else {
                r5 = 1;
                r18 = r13;
                z8 = z7;
            }
            iMax2 = Math.max(this.b0, k());
            if (iMax2 > k()) {
                G(iMax2);
                r22[r5] = r5;
                r19 = r5;
                z9 = r19 == true ? 1 : 0;
            } else {
                r14 = r18;
            }
            if (r14 == 0) {
                z9 = z8;
                if (r22[0] == 2) {
                    r17 = r14;
                    z13 = z9;
                    if (n() > i) {
                        this.D0 = r5;
                        r22[0] = r5;
                        J(i);
                        ?? r114 = r5;
                        z13 = r114 == true ? 1 : 0;
                        r17 = r114;
                    }
                }
                r14 = r19;
                r17 = r14;
                r17 = r14;
                z13 = z9;
                z13 = z9;
                r15 = r17;
                r15 = r17;
                z10 = z13;
                z10 = z13;
                if (r22[r5] != 2) {
                }
                if (i4 > i6) {
                    r15 = r17;
                    z10 = z13;
                    z12 = false;
                } else {
                    r15 = r17;
                    z10 = z13;
                    z12 = z11;
                }
                i3 = i4;
                z3 = z5;
                cVar3 = cVar3;
                r13 = r16;
                z4 = z12;
            } else {
                z9 = z8;
                r14 = r19;
                r15 = r14;
                z10 = z9;
            }
            r15 = r17;
            z10 = z13;
            r16 = r15;
            i6 = 8;
            z11 = z10;
            if (i4 > i6) {
                r15 = r17;
                z10 = z13;
                z12 = false;
            } else {
                r15 = r17;
                z10 = z13;
                z12 = z11;
            }
            i3 = i4;
            z3 = z5;
            cVar3 = cVar3;
            r13 = r16;
            z4 = z12;
        }
        this.p0 = arrayList25;
        if (r13 != 0) {
            r22[0] = i13;
            r22[1] = i12;
        }
        C(cVar5.l);
    }

    public final boolean R(int i) {
        return (this.C0 & i) == i;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.z();
    }
}
