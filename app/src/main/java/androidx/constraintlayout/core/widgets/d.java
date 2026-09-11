package androidx.constraintlayout.core.widgets;

import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.constraintlayout.core.widgets.analyzer.k;
import androidx.constraintlayout.core.widgets.analyzer.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public d S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public androidx.constraintlayout.core.widgets.analyzer.c b;
    public int b0;
    public androidx.constraintlayout.core.widgets.analyzer.c c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public boolean j;
    public final float[] j0;
    public boolean k;
    public final d[] k0;
    public boolean l;
    public final d[] l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public k d = null;
    public m e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public d() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        c cVar = new c(this, 2);
        this.H = cVar;
        c cVar2 = new c(this, 3);
        this.I = cVar2;
        c cVar3 = new c(this, 4);
        this.J = cVar3;
        c cVar4 = new c(this, 5);
        this.K = cVar4;
        c cVar5 = new c(this, 6);
        this.L = cVar5;
        c cVar6 = new c(this, 8);
        this.M = cVar6;
        c cVar7 = new c(this, 9);
        this.N = cVar7;
        c cVar8 = new c(this, 7);
        this.O = cVar8;
        this.P = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new d[]{null, null};
        this.l0 = new d[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A() {
        d dVar = this.S;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c) arrayList.get(i)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) arrayList.get(i);
            cVar.c = false;
            cVar.b = 0;
        }
    }

    public void C(c2 c2Var) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i) {
        this.Z = i;
        this.D = i > 0;
    }

    public final void E(int i, int i2) {
        if (this.j) {
            return;
        }
        this.H.l(i);
        this.J.l(i2);
        this.X = i;
        this.T = i2 - i;
        this.j = true;
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.D) {
            this.L.l(i + this.Z);
        }
        this.k = true;
    }

    public final void G(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void H(int i) {
        this.o0[0] = i;
    }

    public final void I(int i) {
        this.o0[1] = i;
    }

    public final void J(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void K(boolean z, boolean z2) {
        int i;
        int i2;
        k kVar = this.d;
        boolean z3 = z & kVar.g;
        m mVar = this.e;
        boolean z4 = z2 & mVar.g;
        int i3 = kVar.h.g;
        int i4 = mVar.h.g;
        int i5 = kVar.i.g;
        int i6 = mVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void L(androidx.constraintlayout.core.c cVar, boolean z) {
        int i;
        int i2;
        m mVar;
        k kVar;
        cVar.getClass();
        int iN = androidx.constraintlayout.core.c.n(this.H);
        int iN2 = androidx.constraintlayout.core.c.n(this.I);
        int iN3 = androidx.constraintlayout.core.c.n(this.J);
        int iN4 = androidx.constraintlayout.core.c.n(this.K);
        if (z && (kVar = this.d) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar = kVar.h;
            if (fVar.j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar2 = kVar.i;
                if (fVar2.j) {
                    iN = fVar.g;
                    iN3 = fVar2.g;
                }
            }
        }
        if (z && (mVar = this.e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar3 = mVar.h;
            if (fVar3.j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar4 = mVar.i;
                if (fVar4.j) {
                    iN2 = fVar3.g;
                    iN4 = fVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.u;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(e eVar, androidx.constraintlayout.core.c cVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.b(eVar, cVar, this);
            hashSet.remove(this);
            b(cVar, eVar.R(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).d.a(eVar, cVar, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).d.a(eVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).d.a(eVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
  0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [androidx.constraintlayout.core.widgets.d] */
    public void b(androidx.constraintlayout.core.c cVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        d dVar;
        e eVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        d dVar2;
        e eVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        c cVar2;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        c cVar3;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        c cVar4;
        int i20;
        c cVar5;
        androidx.constraintlayout.core.h hVar;
        androidx.constraintlayout.core.h hVar2;
        androidx.constraintlayout.core.h hVar3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        androidx.constraintlayout.core.h hVar4;
        androidx.constraintlayout.core.h hVar5;
        androidx.constraintlayout.core.h hVar6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        androidx.constraintlayout.core.h hVar7;
        int i25;
        float f2;
        ?? r27;
        m mVar;
        boolean z12;
        k kVar;
        int i26;
        int i27;
        boolean zU;
        int i28;
        boolean zV;
        k kVar2;
        m mVar2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i29;
        HashSet hashSet2;
        androidx.constraintlayout.core.c cVar6 = cVar;
        c cVar7 = this.H;
        androidx.constraintlayout.core.h hVarK = cVar6.k(cVar7);
        c cVar8 = this.J;
        androidx.constraintlayout.core.h hVarK2 = cVar6.k(cVar8);
        c cVar9 = this.I;
        androidx.constraintlayout.core.h hVarK3 = cVar6.k(cVar9);
        c cVar10 = this.K;
        androidx.constraintlayout.core.h hVarK4 = cVar6.k(cVar10);
        c cVar11 = this.L;
        androidx.constraintlayout.core.h hVarK5 = cVar6.k(cVar11);
        d dVar3 = this.S;
        if (dVar3 != null) {
            int[] iArr2 = dVar3.o0;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i30 = iArr2[1] == 2 ? 1 : 0;
            int i31 = this.p;
            if (i31 != 1) {
                if (i31 == 2) {
                    i3 = 0;
                } else if (i31 != 3) {
                }
                i2 = i30;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i29 = i;
                while (true) {
                    if (i29 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i32 = size;
                    hashSet2 = ((c) arrayList.get(i29)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i32;
                }
            } else {
                i6 = i3;
            }
            z2 = this.j;
            if (z2 || this.k) {
                if (z2) {
                    cVar6.d(hVarK, this.X);
                    cVar6.d(hVarK2, this.X + this.T);
                    if (i6 != 0 && (dVar2 = this.S) != null) {
                        eVar2 = (e) dVar2;
                        weakReference3 = eVar2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || cVar7.d() > ((c) eVar2.G0.get()).d()) {
                            eVar2.G0 = new WeakReference(cVar7);
                        }
                        weakReference4 = eVar2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || cVar8.d() > ((c) eVar2.I0.get()).d()) {
                            eVar2.I0 = new WeakReference(cVar8);
                        }
                    }
                }
                if (this.k) {
                    cVar6.d(hVarK3, this.Y);
                    cVar6.d(hVarK4, this.Y + this.U);
                    hashSet = cVar11.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar6.d(hVarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (dVar = this.S) != null) {
                        eVar = (e) dVar;
                        weakReference = eVar.F0;
                        if (weakReference != null || weakReference.get() == null || cVar9.d() > ((c) eVar.F0.get()).d()) {
                            eVar.F0 = new WeakReference(cVar9);
                        }
                        weakReference2 = eVar.H0;
                        if (weakReference2 != null || weakReference2.get() == null || cVar10.d() > ((c) eVar.H0.get()).d()) {
                            eVar.H0 = new WeakReference(cVar10);
                        }
                    }
                }
                if (this.j && this.k) {
                    ?? r12 = i;
                    this.j = r12;
                    this.k = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (kVar2 = this.d) == null || (mVar2 = this.e) == null) {
                cVar2 = cVar11;
                zArr3 = zArr2;
            } else {
                cVar2 = cVar11;
                androidx.constraintlayout.core.widgets.analyzer.f fVar = kVar2.h;
                zArr3 = zArr2;
                if (fVar.j && kVar2.i.j && mVar2.h.j && mVar2.i.j) {
                    cVar6.d(hVarK, fVar.g);
                    cVar6.d(hVarK2, this.d.i.g);
                    cVar6.d(hVarK3, this.e.h.g);
                    cVar6.d(hVarK4, this.e.i.g);
                    cVar6.d(hVarK5, this.e.k.g);
                    if (this.S == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !u()) {
                            cVar6.f(cVar6.k(this.S.J), hVarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || v()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            cVar6.f(cVar6.k(this.S.K), hVarK4, 0, 8);
                        }
                    }
                    this.j = z13;
                    this.k = z13;
                    return;
                }
            }
            if (this.S != null) {
                if (t(0)) {
                    ((e) this.S).M(this, 0);
                    zU = true;
                    i28 = 1;
                } else {
                    zU = u();
                    i28 = 1;
                }
                if (t(i28)) {
                    ((e) this.S).M(this, i28);
                    zV = true;
                } else {
                    zV = v();
                }
                if (zU && i6 != 0 && this.f0 != 8 && cVar7.f == null && cVar8.f == null) {
                    cVar6.f(cVar6.k(this.S.J), hVarK2, 0, 1);
                }
                if (!zV && i5 != 0 && this.f0 != 8 && cVar9.f == null && cVar10.f == null && cVar2 == null) {
                    cVar6.f(cVar6.k(this.S.K), hVarK4, 0, 1);
                }
                z4 = zV;
                z3 = zU;
            } else {
                cVar7 = cVar7;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i33 = this.W;
            this.z = i33;
            f = this.V;
            this.A = f;
            i14 = this.q;
            i15 = this.r;
            if (f > 0.0f) {
                cVar3 = cVar10;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i27 = i15;
                    } else {
                        i27 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i27 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.z = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                cVar2 = cVar2;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i27;
                            int[] iArr3 = this.s;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i34 = this.z;
                                i19 = -1;
                                if (i34 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                cVar4 = this.O;
                                boolean z14 = !cVar4.h();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.n;
                                int[] iArr4 = this.B;
                                if (i20 != 2) {
                                    cVar5 = cVar2;
                                    hVar = hVarK;
                                    hVar2 = hVarK2;
                                    hVar3 = hVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    cVar5 = cVar2;
                                    hVar = hVarK;
                                    hVar2 = hVarK2;
                                    hVar3 = hVarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    hVar4 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x058a: MOVE (r5v1 'hVar4' androidx.constraintlayout.core.h) = (r33v0 androidx.constraintlayout.core.h) (LINE:1419) in method: androidx.constraintlayout.core.widgets.d.b(androidx.constraintlayout.core.c, boolean):void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 androidx.constraintlayout.core.h
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1910
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.b(androidx.constraintlayout.core.c, boolean):void");
                                }

                                public boolean c() {
                                    return this.f0 != 8;
                                }

                                /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
                                /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
                                /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
                                /* JADX WARN: Code duplicated, block: B:231:0x0402  */
                                /* JADX WARN: Code duplicated, block: B:240:0x041f  */
                                /* JADX WARN: Code duplicated, block: B:257:0x0452  */
                                /* JADX WARN: Code duplicated, block: B:259:0x0458  */
                                /* JADX WARN: Code duplicated, block: B:270:0x046d  */
                                /* JADX WARN: Code duplicated, block: B:275:0x0477  */
                                /* JADX WARN: Code duplicated, block: B:277:0x047b  */
                                /* JADX WARN: Code duplicated, block: B:278:0x047d  */
                                /* JADX WARN: Code duplicated, block: B:281:0x0485  */
                                /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r3
  0x0493: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
                                /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
                                /* JADX WARN: Code duplicated, block: B:294:0x04af  */
                                /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
                                /* JADX WARN: Code duplicated, block: B:337:0x0521  */
                                public final void d(androidx.constraintlayout.core.c cVar, boolean z, boolean z2, boolean z3, boolean z4, androidx.constraintlayout.core.h hVar, androidx.constraintlayout.core.h hVar2, int i, boolean z5, c cVar2, c cVar3, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
                                    boolean z12;
                                    boolean z13;
                                    int iMin;
                                    boolean z14;
                                    int i10;
                                    int i11;
                                    boolean z15;
                                    androidx.constraintlayout.core.h hVarK;
                                    androidx.constraintlayout.core.h hVarK2;
                                    c cVar4;
                                    androidx.constraintlayout.core.h hVar3;
                                    int i12;
                                    int i13;
                                    boolean z16;
                                    boolean z17;
                                    boolean z18;
                                    boolean z19;
                                    d dVar;
                                    boolean z20;
                                    int iMin2;
                                    boolean z21;
                                    int i14;
                                    int iE;
                                    int i15;
                                    int i16;
                                    HashSet hashSet;
                                    boolean z22;
                                    int i17;
                                    int i18;
                                    int i19;
                                    int i20;
                                    int i21;
                                    boolean z23;
                                    boolean z24;
                                    int i22;
                                    cVar = cVar;
                                    int i23 = i8;
                                    int i24 = i9;
                                    androidx.constraintlayout.core.h hVarK3 = cVar.k(cVar2);
                                    androidx.constraintlayout.core.h hVarK4 = cVar.k(cVar3);
                                    androidx.constraintlayout.core.h hVarK5 = cVar.k(cVar2.f);
                                    androidx.constraintlayout.core.h hVarK6 = cVar.k(cVar3.f);
                                    boolean zH = cVar2.h();
                                    boolean zH2 = cVar3.h();
                                    boolean zH3 = this.O.h();
                                    int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
                                    if (zH3) {
                                        i25++;
                                    }
                                    int i26 = i25;
                                    int i27 = z6 ? 3 : i6;
                                    int iE2 = androidx.constraintlayout.core.g.e(i);
                                    boolean z25 = (iE2 == 0 || iE2 == 1 || iE2 != 2 || i27 == 4) ? false : true;
                                    int i28 = this.h;
                                    if (i28 == -1 || !z) {
                                        i28 = i3;
                                        z12 = z25;
                                    } else {
                                        this.h = -1;
                                        z12 = false;
                                    }
                                    int i29 = this.i;
                                    if (i29 == -1 || z) {
                                        z13 = z12;
                                    } else {
                                        this.i = -1;
                                        i28 = i29;
                                        z13 = false;
                                    }
                                    boolean z26 = z13;
                                    if (this.f0 == 8) {
                                        z14 = false;
                                        iMin = 0;
                                    } else {
                                        iMin = i28;
                                        z14 = z26;
                                    }
                                    if (z11) {
                                        if (!zH && !zH2 && !zH3) {
                                            cVar.d(hVarK3, i2);
                                        } else if (zH && !zH2) {
                                            i10 = 8;
                                            cVar.e(hVarK3, hVarK5, cVar2.e(), 8);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = 8;
                                    }
                                    if (z14 != 0) {
                                        if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                                            if (i23 == -2) {
                                                i23 = iMin;
                                            }
                                            if (i24 == -2) {
                                                i24 = iMin;
                                            }
                                            if (iMin > 0 && i27 != 1) {
                                                iMin = 0;
                                            }
                                            if (i23 > 0) {
                                                cVar.f(hVarK4, hVarK3, i23, 8);
                                                iMin = Math.max(iMin, i23);
                                            }
                                            if (i24 > 0) {
                                                if (!z2 || i27 != 1) {
                                                    cVar.g(hVarK4, hVarK3, i24, 8);
                                                }
                                                iMin = Math.min(iMin, i24);
                                            }
                                            if (i27 == 1) {
                                                if (z2) {
                                                    cVar.e(hVarK4, hVarK3, iMin, 8);
                                                } else if (z8) {
                                                    cVar.e(hVarK4, hVarK3, iMin, 5);
                                                    cVar.g(hVarK4, hVarK3, iMin, 8);
                                                } else {
                                                    cVar.e(hVarK4, hVarK3, iMin, 5);
                                                    cVar.g(hVarK4, hVarK3, iMin, 8);
                                                }
                                            } else if (i27 == 2) {
                                                int i30 = cVar2.e;
                                                if (i30 == 3 || i30 == 5) {
                                                    hVarK = cVar.k(this.S.i(3));
                                                    hVarK2 = cVar.k(this.S.i(5));
                                                } else {
                                                    hVarK = cVar.k(this.S.i(2));
                                                    hVarK2 = cVar.k(this.S.i(4));
                                                }
                                                androidx.constraintlayout.core.b bVarL = cVar.l();
                                                int i31 = i23;
                                                bVarL.d.g(hVarK4, -1.0f);
                                                bVarL.d.g(hVarK3, 1.0f);
                                                bVarL.d.g(hVarK2, f2);
                                                bVarL.d.g(hVarK, -f2);
                                                cVar.c(bVarL);
                                                if (z2) {
                                                    z14 = false;
                                                }
                                                z15 = z4;
                                                i11 = i31;
                                            } else {
                                                i11 = i23;
                                                z15 = true;
                                            }
                                        } else {
                                            int iMax = Math.max(i23, iMin);
                                            if (i24 > 0) {
                                                iMax = Math.min(i24, iMax);
                                            }
                                            cVar.e(hVarK4, hVarK3, iMax, 8);
                                            z15 = z4;
                                            i11 = i23;
                                            z14 = false;
                                        }
                                        if (z11 || z8) {
                                            boolean z27 = z15;
                                            if (i26 >= 2 && z2 && z27) {
                                                cVar.f(hVarK3, hVar, 0, 8);
                                                c cVar5 = this.L;
                                                boolean z28 = z || cVar5.f == null;
                                                if (!z && (cVar4 = cVar5.f) != null) {
                                                    d dVar2 = cVar4.d;
                                                    if (dVar2.V != 0.0f) {
                                                        int[] iArr = dVar2.o0;
                                                        if (iArr[0] == 3 && iArr[1] == 3) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                    } else {
                                                        z28 = false;
                                                    }
                                                }
                                                if (z28) {
                                                    cVar.f(hVar2, hVarK4, 0, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        if (zH || zH2 || zH3) {
                                            if (zH && !zH2) {
                                                cVar3 = cVar3;
                                                hVarK4 = hVarK4;
                                                z15 = z15;
                                                hVar3 = hVarK6;
                                                z20 = z2;
                                                i22 = (z2 && (cVar2.f.d instanceof a)) ? 8 : 5;
                                            } else if (zH || !zH2) {
                                                hVar3 = hVarK6;
                                                if (zH && zH2) {
                                                    d dVar3 = cVar2.f.d;
                                                    d dVar4 = cVar3.f.d;
                                                    z15 = z15;
                                                    d dVar5 = this.S;
                                                    int i32 = 6;
                                                    if (z14) {
                                                        if (i27 == 0) {
                                                            if (i24 != 0 || i11 != 0) {
                                                                i20 = 5;
                                                                i21 = 5;
                                                                z23 = true;
                                                                z24 = false;
                                                                z17 = true;
                                                            } else if (hVarK5.C && hVar3.C) {
                                                                cVar.e(hVarK3, hVarK5, cVar2.e(), 8);
                                                                cVar.e(hVarK4, hVar3, -cVar3.e(), 8);
                                                                return;
                                                            } else {
                                                                i20 = 8;
                                                                i21 = 8;
                                                                z23 = false;
                                                                z24 = true;
                                                                z17 = false;
                                                            }
                                                            if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                                cVar = cVar;
                                                                i27 = i27;
                                                                hVarK3 = hVarK3;
                                                                hVarK4 = hVarK4;
                                                                z18 = z24;
                                                                hVar2 = hVar2;
                                                                i12 = i20;
                                                                hVarK5 = hVarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = 4;
                                                            } else {
                                                                cVar = cVar;
                                                                hVarK3 = hVarK3;
                                                                hVarK4 = hVarK4;
                                                                z18 = z24;
                                                                i12 = i20;
                                                                hVarK5 = hVarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = i21;
                                                                i27 = i27;
                                                                hVar2 = hVar2;
                                                            }
                                                        } else {
                                                            if (i27 == 2) {
                                                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                                    i12 = 5;
                                                                } else {
                                                                    cVar = cVar;
                                                                    i27 = i27;
                                                                    hVarK3 = hVarK3;
                                                                    hVarK4 = hVarK4;
                                                                    hVarK5 = hVarK5;
                                                                    i32 = 6;
                                                                    i12 = 5;
                                                                    i13 = 5;
                                                                }
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = false;
                                                                hVar2 = hVar2;
                                                            } else if (i27 == 1) {
                                                                i12 = 8;
                                                            } else if (i27 == 3) {
                                                                i27 = i27;
                                                                if (this.z != -1) {
                                                                    if (z6) {
                                                                        if (i7 == 2 || i7 == 1) {
                                                                            i18 = 5;
                                                                            i19 = 4;
                                                                        } else {
                                                                            i18 = 8;
                                                                            i19 = 5;
                                                                        }
                                                                        i13 = i19;
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    } else {
                                                                        if (i24 > 0) {
                                                                            cVar = cVar;
                                                                            hVar2 = hVar2;
                                                                            hVarK3 = hVarK3;
                                                                            hVarK4 = hVarK4;
                                                                            hVarK5 = hVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                        } else if (i24 != 0 || i11 != 0) {
                                                                            cVar = cVar;
                                                                            hVar2 = hVar2;
                                                                            hVarK3 = hVarK3;
                                                                            hVarK4 = hVarK4;
                                                                            hVarK5 = hVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 4;
                                                                        } else if (z9) {
                                                                            i18 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                                            i13 = 4;
                                                                            z16 = true;
                                                                            z17 = true;
                                                                            z18 = true;
                                                                        } else {
                                                                            cVar = cVar;
                                                                            hVar2 = hVar2;
                                                                            hVarK3 = hVarK3;
                                                                            hVarK4 = hVarK4;
                                                                            hVarK5 = hVarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 8;
                                                                        }
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    }
                                                                    i12 = i18;
                                                                    cVar = cVar;
                                                                } else if (z9) {
                                                                    cVar = cVar;
                                                                    hVar2 = hVar2;
                                                                    hVarK3 = hVarK3;
                                                                    hVarK4 = hVarK4;
                                                                    hVarK5 = hVarK5;
                                                                    i12 = 8;
                                                                    i32 = z2 ? 5 : 4;
                                                                } else {
                                                                    cVar = cVar;
                                                                    hVar2 = hVar2;
                                                                    hVarK3 = hVarK3;
                                                                    hVarK4 = hVarK4;
                                                                    hVarK5 = hVarK5;
                                                                    i12 = 8;
                                                                    i32 = 8;
                                                                }
                                                                i13 = 5;
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            } else {
                                                                i12 = 5;
                                                                i13 = 4;
                                                                z16 = false;
                                                                z17 = false;
                                                            }
                                                            i13 = 4;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = false;
                                                            hVar2 = hVar2;
                                                        }
                                                        if (z17 || hVarK5 != hVar3 || dVar3 == dVar5) {
                                                            z19 = true;
                                                        } else {
                                                            z17 = false;
                                                            z19 = false;
                                                        }
                                                        if (z16) {
                                                            if (z14 && !z7 && !z9 && hVarK5 == hVar && hVar3 == hVar2) {
                                                                i32 = 8;
                                                                z20 = false;
                                                                i17 = 8;
                                                                z22 = false;
                                                            } else {
                                                                z20 = z2;
                                                                z22 = z19;
                                                                i17 = i12;
                                                            }
                                                            androidx.constraintlayout.core.h hVar4 = hVarK5;
                                                            dVar = dVar4;
                                                            cVar.b(hVarK3, hVar4, cVar2.e(), f, hVar3, hVarK4, cVar3.e(), i32);
                                                            hVarK5 = hVar4;
                                                            i12 = i17;
                                                            z19 = z22;
                                                        } else {
                                                            dVar = dVar4;
                                                            z20 = z2;
                                                        }
                                                        if (this.f0 != 8 && ((hashSet = cVar3.a) == null || hashSet.size() <= 0)) {
                                                            return;
                                                        }
                                                        if (z17) {
                                                            if (z20 && hVarK5 != hVar3 && !z14 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                                                i12 = 6;
                                                            }
                                                            cVar.f(hVarK3, hVarK5, cVar2.e(), i12);
                                                            cVar.g(hVarK4, hVar3, -cVar3.e(), i12);
                                                        }
                                                        if (z20 || !z10 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                                            iMin2 = i13;
                                                            z21 = z19;
                                                        } else {
                                                            iMin2 = 6;
                                                            i12 = 6;
                                                            z21 = true;
                                                        }
                                                        if (z21) {
                                                            if (z18 && (!z9 || z3)) {
                                                                if (dVar3 != dVar5 && dVar != dVar5) {
                                                                    i32 = iMin2;
                                                                }
                                                                if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                                    i32 = 5;
                                                                }
                                                                if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                                    i32 = 5;
                                                                }
                                                                if (z9) {
                                                                    i16 = 5;
                                                                } else {
                                                                    i16 = i32;
                                                                }
                                                                iMin2 = Math.max(i16, iMin2);
                                                            }
                                                            if (z20) {
                                                                iMin2 = Math.min(i12, iMin2);
                                                                if (z6 || z9 || !(dVar3 == dVar5 || dVar == dVar5)) {
                                                                    i15 = iMin2;
                                                                } else {
                                                                    i15 = 4;
                                                                }
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                            cVar.e(hVarK3, hVarK5, cVar2.e(), i15);
                                                            cVar.e(hVarK4, hVar3, -cVar3.e(), i15);
                                                        }
                                                        if (z20) {
                                                            if (hVar == hVarK5) {
                                                                iE = cVar2.e();
                                                            } else {
                                                                iE = 0;
                                                            }
                                                            if (hVarK5 != hVar) {
                                                                cVar.f(hVarK3, hVar, iE, 5);
                                                            }
                                                        }
                                                        if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                                            i14 = 5;
                                                        } else if (z14 && i27 == 3) {
                                                            cVar.f(hVarK4, hVarK3, 0, 8);
                                                            i14 = 5;
                                                        } else {
                                                            i14 = 5;
                                                            cVar.f(hVarK4, hVarK3, 0, 5);
                                                        }
                                                    } else {
                                                        if (hVarK5.C && hVar3.C) {
                                                            cVar.b(hVarK3, hVarK5, cVar2.e(), f, hVar3, hVarK4, cVar3.e(), 8);
                                                            if (z2 && z15) {
                                                                int iE3 = cVar3.f != null ? cVar3.e() : 0;
                                                                if (hVar3 != hVar2) {
                                                                    cVar.f(hVar2, hVarK4, iE3, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        i12 = 5;
                                                        i13 = 4;
                                                        z16 = true;
                                                        z17 = true;
                                                    }
                                                    z18 = false;
                                                    if (z17) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (z16) {
                                                        if (z14) {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        } else {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        }
                                                        androidx.constraintlayout.core.h hVar5 = hVarK5;
                                                        dVar = dVar4;
                                                        cVar.b(hVarK3, hVar5, cVar2.e(), f, hVar3, hVarK4, cVar3.e(), i32);
                                                        hVarK5 = hVar5;
                                                        i12 = i17;
                                                        z19 = z22;
                                                    } else {
                                                        dVar = dVar4;
                                                        z20 = z2;
                                                    }
                                                    if (this.f0 != 8) {
                                                    }
                                                    if (z17) {
                                                        if (z20) {
                                                            i12 = 6;
                                                        }
                                                        cVar.f(hVarK3, hVarK5, cVar2.e(), i12);
                                                        cVar.g(hVarK4, hVar3, -cVar3.e(), i12);
                                                    }
                                                    if (z20) {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    } else {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    }
                                                    if (z21) {
                                                        if (z18) {
                                                            if (dVar3 != dVar5) {
                                                                i32 = iMin2;
                                                            }
                                                            if (dVar3 instanceof h) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (dVar3 instanceof a) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i32;
                                                            }
                                                            iMin2 = Math.max(i16, iMin2);
                                                        }
                                                        if (z20) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6) {
                                                                i15 = iMin2;
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                        } else {
                                                            i15 = iMin2;
                                                        }
                                                        cVar.e(hVarK3, hVarK5, cVar2.e(), i15);
                                                        cVar.e(hVarK4, hVar3, -cVar3.e(), i15);
                                                    }
                                                    if (z20) {
                                                        if (hVar == hVarK5) {
                                                            iE = cVar2.e();
                                                        } else {
                                                            iE = 0;
                                                        }
                                                        if (hVarK5 != hVar) {
                                                            cVar.f(hVarK3, hVar, iE, 5);
                                                        }
                                                    }
                                                    if (z20) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 5;
                                                    }
                                                }
                                                i22 = i14;
                                            } else {
                                                hVar3 = hVarK6;
                                                cVar.e(hVarK4, hVar3, -cVar3.e(), 8);
                                                if (z2) {
                                                    cVar.f(hVarK3, hVar, 0, 5);
                                                    cVar3 = cVar3;
                                                    i14 = 5;
                                                    hVarK4 = hVarK4;
                                                    z15 = z15;
                                                }
                                                z20 = z2;
                                                i22 = i14;
                                            }
                                            if (z20 || !z15) {
                                                return;
                                            }
                                            int iE4 = cVar3.f != null ? cVar3.e() : 0;
                                            if (hVar3 != hVar2) {
                                                cVar.f(hVar2, hVarK4, iE4, i22);
                                                return;
                                            }
                                            return;
                                        }
                                        hVar3 = hVarK6;
                                        i14 = 5;
                                        z20 = z2;
                                        i22 = i14;
                                        if (z20) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (z5) {
                                        cVar.e(hVarK4, hVarK3, 0, 3);
                                        if (i4 > 0) {
                                            cVar.f(hVarK4, hVarK3, i4, i10);
                                        }
                                        if (i5 < Integer.MAX_VALUE) {
                                            cVar.g(hVarK4, hVarK3, i5, i10);
                                        }
                                    } else {
                                        cVar.e(hVarK4, hVarK3, iMin, i10);
                                    }
                                    z15 = z4;
                                    i11 = i23;
                                    if (z11) {
                                    }
                                    boolean z29 = z15;
                                    if (i26 >= 2) {
                                    }
                                }

                                public final void e(int i, d dVar, int i2, int i3) {
                                    boolean z;
                                    if (i == 7) {
                                        if (i2 != 7) {
                                            if (i2 == 2 || i2 == 4) {
                                                e(2, dVar, i2, 0);
                                                e(4, dVar, i2, 0);
                                                i(7).a(dVar.i(i2), 0);
                                                return;
                                            } else {
                                                if (i2 == 3 || i2 == 5) {
                                                    e(3, dVar, i2, 0);
                                                    e(5, dVar, i2, 0);
                                                    i(7).a(dVar.i(i2), 0);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        c cVarI = i(2);
                                        c cVarI2 = i(4);
                                        c cVarI3 = i(3);
                                        c cVarI4 = i(5);
                                        boolean z2 = true;
                                        if ((cVarI == null || !cVarI.h()) && (cVarI2 == null || !cVarI2.h())) {
                                            e(2, dVar, 2, 0);
                                            e(4, dVar, 4, 0);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if ((cVarI3 == null || !cVarI3.h()) && (cVarI4 == null || !cVarI4.h())) {
                                            e(3, dVar, 3, 0);
                                            e(5, dVar, 5, 0);
                                        } else {
                                            z2 = false;
                                        }
                                        if (z && z2) {
                                            i(7).a(dVar.i(7), 0);
                                            return;
                                        } else if (z) {
                                            i(8).a(dVar.i(8), 0);
                                            return;
                                        } else {
                                            if (z2) {
                                                i(9).a(dVar.i(9), 0);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i == 8 && (i2 == 2 || i2 == 4)) {
                                        c cVarI5 = i(2);
                                        c cVarI6 = dVar.i(i2);
                                        c cVarI7 = i(4);
                                        cVarI5.a(cVarI6, 0);
                                        cVarI7.a(cVarI6, 0);
                                        i(8).a(cVarI6, 0);
                                        return;
                                    }
                                    if (i == 9 && (i2 == 3 || i2 == 5)) {
                                        c cVarI8 = dVar.i(i2);
                                        i(3).a(cVarI8, 0);
                                        i(5).a(cVarI8, 0);
                                        i(9).a(cVarI8, 0);
                                        return;
                                    }
                                    if (i == 8 && i2 == 8) {
                                        i(2).a(dVar.i(2), 0);
                                        i(4).a(dVar.i(4), 0);
                                        i(8).a(dVar.i(i2), 0);
                                        return;
                                    }
                                    if (i == 9 && i2 == 9) {
                                        i(3).a(dVar.i(3), 0);
                                        i(5).a(dVar.i(5), 0);
                                        i(9).a(dVar.i(i2), 0);
                                        return;
                                    }
                                    c cVarI9 = i(i);
                                    c cVarI10 = dVar.i(i2);
                                    if (cVarI9.i(cVarI10)) {
                                        if (i == 6) {
                                            c cVarI11 = i(3);
                                            c cVarI12 = i(5);
                                            if (cVarI11 != null) {
                                                cVarI11.j();
                                            }
                                            if (cVarI12 != null) {
                                                cVarI12.j();
                                            }
                                        } else if (i == 3 || i == 5) {
                                            c cVarI13 = i(6);
                                            if (cVarI13 != null) {
                                                cVarI13.j();
                                            }
                                            c cVarI14 = i(7);
                                            if (cVarI14.f != cVarI10) {
                                                cVarI14.j();
                                            }
                                            c cVarF = i(i).f();
                                            c cVarI15 = i(9);
                                            if (cVarI15.h()) {
                                                cVarF.j();
                                                cVarI15.j();
                                            }
                                        } else if (i == 2 || i == 4) {
                                            c cVarI16 = i(7);
                                            if (cVarI16.f != cVarI10) {
                                                cVarI16.j();
                                            }
                                            c cVarF2 = i(i).f();
                                            c cVarI17 = i(8);
                                            if (cVarI17.h()) {
                                                cVarF2.j();
                                                cVarI17.j();
                                            }
                                        }
                                        cVarI9.a(cVarI10, i3);
                                    }
                                }

                                public final void f(c cVar, c cVar2, int i) {
                                    if (cVar.d == this) {
                                        e(cVar.e, cVar2.d, cVar2.e, i);
                                    }
                                }

                                public final void g(androidx.constraintlayout.core.c cVar) {
                                    cVar.k(this.H);
                                    cVar.k(this.I);
                                    cVar.k(this.J);
                                    cVar.k(this.K);
                                    if (this.Z > 0) {
                                        cVar.k(this.L);
                                    }
                                }

                                public final void h() {
                                    if (this.d == null) {
                                        k kVar = new k(this);
                                        kVar.h.e = 4;
                                        kVar.i.e = 5;
                                        kVar.f = 0;
                                        this.d = kVar;
                                    }
                                    if (this.e == null) {
                                        m mVar = new m(this);
                                        androidx.constraintlayout.core.widgets.analyzer.f fVar = new androidx.constraintlayout.core.widgets.analyzer.f(mVar);
                                        mVar.k = fVar;
                                        mVar.l = null;
                                        mVar.h.e = 6;
                                        mVar.i.e = 7;
                                        fVar.e = 8;
                                        mVar.f = 1;
                                        this.e = mVar;
                                    }
                                }

                                public c i(int i) {
                                    switch (androidx.constraintlayout.core.g.e(i)) {
                                        case 0:
                                            return null;
                                        case 1:
                                            return this.H;
                                        case 2:
                                            return this.I;
                                        case 3:
                                            return this.J;
                                        case 4:
                                            return this.K;
                                        case 5:
                                            return this.L;
                                        case 6:
                                            return this.O;
                                        case 7:
                                            return this.M;
                                        case 8:
                                            return this.N;
                                        default:
                                            net.luminis.tls.engine.impl.c.m(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.B(i));
                                            return null;
                                    }
                                }

                                public final int j(int i) {
                                    int[] iArr = this.o0;
                                    if (i == 0) {
                                        return iArr[0];
                                    }
                                    if (i == 1) {
                                        return iArr[1];
                                    }
                                    return 0;
                                }

                                public final int k() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.U;
                                }

                                public final d l(int i) {
                                    c cVar;
                                    c cVar2;
                                    if (i != 0) {
                                        if (i == 1 && (cVar2 = (cVar = this.K).f) != null && cVar2.f == cVar) {
                                            return cVar2.d;
                                        }
                                        return null;
                                    }
                                    c cVar3 = this.J;
                                    c cVar4 = cVar3.f;
                                    if (cVar4 == null || cVar4.f != cVar3) {
                                        return null;
                                    }
                                    return cVar4.d;
                                }

                                public final d m(int i) {
                                    c cVar;
                                    c cVar2;
                                    if (i != 0) {
                                        if (i == 1 && (cVar2 = (cVar = this.I).f) != null && cVar2.f == cVar) {
                                            return cVar2.d;
                                        }
                                        return null;
                                    }
                                    c cVar3 = this.H;
                                    c cVar4 = cVar3.f;
                                    if (cVar4 == null || cVar4.f != cVar3) {
                                        return null;
                                    }
                                    return cVar4.d;
                                }

                                public final int n() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.T;
                                }

                                public final int o() {
                                    d dVar = this.S;
                                    return (dVar == null || !(dVar instanceof e)) ? this.X : ((e) dVar).w0 + this.X;
                                }

                                public final int p() {
                                    d dVar = this.S;
                                    return (dVar == null || !(dVar instanceof e)) ? this.Y : ((e) dVar).x0 + this.Y;
                                }

                                /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
                                public final boolean q(int i) {
                                    if (i == 0) {
                                        if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                                        return true;
                                    }
                                    return false;
                                }

                                public final boolean r(int i, int i2) {
                                    c cVar;
                                    c cVar2;
                                    c cVar3;
                                    c cVar4;
                                    if (i == 0) {
                                        c cVar5 = this.H;
                                        c cVar6 = cVar5.f;
                                        if (cVar6 == null || !cVar6.c || (cVar4 = (cVar3 = this.J).f) == null || !cVar4.c) {
                                            return false;
                                        }
                                        return (cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f.d()) >= i2;
                                    }
                                    c cVar7 = this.I;
                                    c cVar8 = cVar7.f;
                                    if (cVar8 == null || !cVar8.c || (cVar2 = (cVar = this.K).f) == null || !cVar2.c) {
                                        return false;
                                    }
                                    return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f.d()) >= i2;
                                }

                                public final void s(int i, int i2, int i3, int i4, d dVar) {
                                    i(i).b(dVar.i(i2), i3, i4, true);
                                }

                                public final boolean t(int i) {
                                    c cVar;
                                    c cVar2;
                                    int i2 = i * 2;
                                    c[] cVarArr = this.P;
                                    c cVar3 = cVarArr[i2];
                                    c cVar4 = cVar3.f;
                                    return (cVar4 == null || cVar4.f == cVar3 || (cVar2 = (cVar = cVarArr[i2 + 1]).f) == null || cVar2.f != cVar) ? false : true;
                                }

                                public String toString() {
                                    StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n("");
                                    sbN.append(this.g0 != null ? androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("id: "), this.g0, " ") : "");
                                    sbN.append("(");
                                    sbN.append(this.X);
                                    sbN.append(", ");
                                    sbN.append(this.Y);
                                    sbN.append(") - (");
                                    sbN.append(this.T);
                                    sbN.append(" x ");
                                    return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.U, ")", sbN);
                                }

                                public final boolean u() {
                                    c cVar = this.H;
                                    c cVar2 = cVar.f;
                                    if (cVar2 != null && cVar2.f == cVar) {
                                        return true;
                                    }
                                    c cVar3 = this.J;
                                    c cVar4 = cVar3.f;
                                    return cVar4 != null && cVar4.f == cVar3;
                                }

                                public final boolean v() {
                                    c cVar = this.I;
                                    c cVar2 = cVar.f;
                                    if (cVar2 != null && cVar2.f == cVar) {
                                        return true;
                                    }
                                    c cVar3 = this.K;
                                    c cVar4 = cVar3.f;
                                    return cVar4 != null && cVar4.f == cVar3;
                                }

                                public final boolean w() {
                                    return this.g && this.f0 != 8;
                                }

                                public boolean x() {
                                    if (this.j) {
                                        return true;
                                    }
                                    return this.H.c && this.J.c;
                                }

                                public boolean y() {
                                    if (this.k) {
                                        return true;
                                    }
                                    return this.I.c && this.K.c;
                                }

                                public void z() {
                                    this.H.j();
                                    this.I.j();
                                    this.J.j();
                                    this.K.j();
                                    this.L.j();
                                    this.M.j();
                                    this.N.j();
                                    this.O.j();
                                    this.S = null;
                                    this.C = 0.0f;
                                    this.T = 0;
                                    this.U = 0;
                                    this.V = 0.0f;
                                    this.W = -1;
                                    this.X = 0;
                                    this.Y = 0;
                                    this.Z = 0;
                                    this.a0 = 0;
                                    this.b0 = 0;
                                    this.c0 = 0.5f;
                                    this.d0 = 0.5f;
                                    int[] iArr = this.o0;
                                    iArr[0] = 1;
                                    iArr[1] = 1;
                                    this.e0 = null;
                                    this.f0 = 0;
                                    this.h0 = 0;
                                    this.i0 = 0;
                                    float[] fArr = this.j0;
                                    fArr[0] = -1.0f;
                                    fArr[1] = -1.0f;
                                    this.n = -1;
                                    this.o = -1;
                                    int[] iArr2 = this.B;
                                    iArr2[0] = Integer.MAX_VALUE;
                                    iArr2[1] = Integer.MAX_VALUE;
                                    this.q = 0;
                                    this.r = 0;
                                    this.v = 1.0f;
                                    this.y = 1.0f;
                                    this.u = Integer.MAX_VALUE;
                                    this.x = Integer.MAX_VALUE;
                                    this.t = 0;
                                    this.w = 0;
                                    this.z = -1;
                                    this.A = 1.0f;
                                    boolean[] zArr = this.f;
                                    zArr[0] = true;
                                    zArr[1] = true;
                                    this.E = false;
                                    boolean[] zArr2 = this.R;
                                    zArr2[0] = false;
                                    zArr2[1] = false;
                                    this.g = true;
                                    int[] iArr3 = this.s;
                                    iArr3[0] = 0;
                                    iArr3[1] = 0;
                                    this.h = -1;
                                    this.i = -1;
                                }
                            }
