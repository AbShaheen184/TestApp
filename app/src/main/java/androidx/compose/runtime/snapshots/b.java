package androidx.compose.runtime.snapshots;

import androidx.collection.p0;
import androidx.collection.x0;
import androidx.compose.runtime.n1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b extends f {
    public static final int[] n = new int[0];
    public final kotlin.jvm.functions.l e;
    public final kotlin.jvm.functions.l f;
    public int g;
    public p0 h;
    public ArrayList i;
    public l j;
    public int[] k;
    public int l;
    public boolean m;

    public b(long j, l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3) {
        super(j, lVar);
        this.e = lVar2;
        this.f = lVar3;
        this.j = l.B;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (n.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(p0 p0Var) {
        this.h = p0Var;
    }

    public b C(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) throws Throwable {
        if (this.c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = n.c;
        synchronized (obj) {
            try {
                long j = n.e;
                long j2 = 1;
                n.e = j + j2;
                n.d = n.d.f(j);
                l lVarD = d();
                r(lVarD.f(j));
                try {
                    c cVar = new c(j, n.d(lVarD, g() + j2, j), n.k(lVar, e(), true), n.l(lVar2, i()), this);
                    if (this.m || this.c) {
                        return cVar;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j3 = n.e;
                        n.e = j3 + j2;
                        s(j3);
                        n.d = n.d.f(g());
                    }
                    r(n.d(d(), jG + j2, g()));
                    return cVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void b() {
        n.d = n.d.c(g()).b(this.j);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (n.c) {
            o();
        }
        l();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public int h() {
        return this.g;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public kotlin.jvm.functions.l i() {
        return this.f;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // androidx.compose.runtime.snapshots.f
    public void l() {
        if (this.l <= 0) {
            n1.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        p0 p0VarX = x();
        if (p0VarX != null) {
            if (this.m) {
                n1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = p0VarX.b;
            long[] jArr = p0VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (y yVarC = ((w) objArr[(i2 << 3) + i4]).c(); yVarC != null; yVarC = yVarC.b) {
                                    long j2 = yVarC.a;
                                    if (j2 == jG || kotlin.collections.o.G(this.j, Long.valueOf(j2))) {
                                        androidx.compose.runtime.saveable.m mVar = n.a;
                                        yVarC.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void n(w wVar) {
        p0 p0VarX = x();
        if (p0VarX == null) {
            p0 p0Var = x0.a;
            p0VarX = new p0();
            B(p0VarX);
        }
        p0VarX.a(wVar);
    }

    @Override // androidx.compose.runtime.snapshots.f
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            n.u(this.k[i]);
        }
        o();
    }

    @Override // androidx.compose.runtime.snapshots.f
    public void t(int i) {
        this.g = i;
    }

    @Override // androidx.compose.runtime.snapshots.f
    public f u(kotlin.jvm.functions.l lVar) throws Throwable {
        if (this.c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = n.c;
        synchronized (obj) {
            try {
                long j = n.e;
                long j2 = 1;
                n.e = j + j2;
                n.d = n.d.f(j);
                try {
                    d dVar = new d(j, n.d(d(), jG + j2, j), n.k(lVar, e(), true), this);
                    if (this.m || this.c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j3 = n.e;
                        n.e = j3 + j2;
                        s(j3);
                        n.d = n.d.f(g());
                    }
                    r(n.d(d(), jG2 + j2, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (n.c) {
            long j2 = n.e;
            j = 1;
            n.e = j2 + j;
            s(j2);
            n.d = n.d.f(g());
        }
        r(n.d(d(), jG + j, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    public r w() {
        HashMap mapB;
        ?? r3;
        p0 p0Var;
        long j;
        long j2;
        p0 p0VarX = x();
        if (p0VarX != null) {
            long j3 = n.j.b;
            mapB = n.b(j3, this, n.d.c(j3));
        } else {
            mapB = null;
        }
        kotlin.collections.u uVar = kotlin.collections.u.e;
        synchronized (n.c) {
            try {
                n.c(this);
                if (p0VarX == null || p0VarX.d == 0) {
                    b();
                    a aVar = n.j;
                    p0 p0Var2 = aVar.h;
                    n.v(aVar, n.a);
                    if (p0Var2 == null || !p0Var2.h()) {
                        r3 = uVar;
                        p0Var = null;
                    } else {
                        r3 = n.h;
                        p0Var = p0Var2;
                    }
                } else {
                    a aVar2 = n.j;
                    r rVarZ = z(n.e, p0VarX, mapB, n.d.c(aVar2.b));
                    if (!rVarZ.equals(i.b)) {
                        return rVarZ;
                    }
                    b();
                    p0Var = aVar2.h;
                    n.v(aVar2, n.a);
                    B(null);
                    aVar2.h = null;
                    r3 = n.h;
                }
                this.m = true;
                if (p0Var != null) {
                    androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(p0Var);
                    if (!p0Var.g()) {
                        int size = r3.size();
                        for (int i = 0; i < size; i++) {
                            ((kotlin.jvm.functions.p) r3.get(i)).invoke(dVar, this);
                        }
                    }
                }
                if (p0VarX != null && p0VarX.h()) {
                    androidx.compose.runtime.collection.d dVar2 = new androidx.compose.runtime.collection.d(p0VarX);
                    int size2 = r3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((kotlin.jvm.functions.p) r3.get(i2)).invoke(dVar2, this);
                    }
                }
                synchronized (n.c) {
                    try {
                        p();
                        n.f();
                        if (p0Var != null) {
                            Object[] objArr = p0Var.b;
                            long[] jArr = p0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                n.q((w) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (p0VarX != null) {
                            Object[] objArr2 = p0VarX.b;
                            long[] jArr2 = p0VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                n.q((w) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                n.q((w) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return i.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p0 x() {
        return this.h;
    }

    @Override // androidx.compose.runtime.snapshots.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public kotlin.jvm.functions.l e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[LOOP:3: B:79:0x01a7->B:80:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final r z(long j, p0 p0Var, HashMap map, l lVar) {
        ArrayList arrayList;
        ArrayList arrayListX;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        w wVar;
        y yVar;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        y yVarD;
        l lVarE = d().f(g()).e(this.j);
        Object[] objArr3 = p0Var.b;
        long[] jArr3 = p0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListX = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            w wVar2 = (w) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            y yVarC = wVar2.c();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            y yVarS = n.s(yVarC, j, lVar);
                            if (yVarS == null) {
                                lVar3 = lVarE;
                                arrayList4 = arrayListX;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListX;
                                j2 = j3;
                                y yVarS2 = n.s(yVarC, g(), lVarE);
                                if (yVarS2 == null) {
                                    lVar3 = lVarE;
                                } else {
                                    lVar3 = lVarE;
                                    if (yVarS2.a != 1 && !yVarS.equals(yVarS2)) {
                                        y yVarS3 = n.s(yVarC, g(), d());
                                        if (yVarS3 == null) {
                                            n.r();
                                            throw null;
                                        }
                                        if (map == null || (yVarD = (y) map.get(yVarS)) == null) {
                                            yVarD = wVar2.d(yVarS2, yVarS, yVarS3);
                                        }
                                        if (yVarD == null) {
                                            return new h(this);
                                        }
                                        if (!yVarD.equals(yVarS3)) {
                                            if (yVarD.equals(yVarS)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new kotlin.k(wVar2, yVarS.b(g())));
                                                arrayListX = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayListX.add(wVar2);
                                                arrayList2 = arrayList6;
                                            } else {
                                                arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList2.add(!yVarD.equals(yVarS2) ? new kotlin.k(wVar2, yVarD) : new kotlin.k(wVar2, yVarS2.b(g())));
                                            }
                                        }
                                        arrayListX = arrayList4;
                                    }
                                }
                            }
                            arrayList2 = arrayList5;
                            arrayListX = arrayList4;
                        } else {
                            lVar3 = lVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        lVarE = lVar3;
                    }
                    lVar2 = lVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    lVar2 = lVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    lVarE = lVar2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    kotlin.k kVar = (kotlin.k) arrayList2.get(i2);
                    wVar = (w) kVar.e;
                    yVar = (y) kVar.y;
                    yVar.a = j;
                    synchronized (n.c) {
                        yVar.b = wVar.c();
                        wVar.b(yVar);
                    }
                }
            }
            if (arrayListX != null) {
                size = arrayListX.size();
                for (i = 0; i < size; i++) {
                    p0Var.l((w) arrayListX.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListX = kotlin.collections.o.X(arrayList3, arrayListX);
                }
                this.i = arrayListX;
            }
            return i.b;
        }
        arrayList = null;
        arrayListX = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                kotlin.k kVar2 = (kotlin.k) arrayList2.get(i2);
                wVar = (w) kVar2.e;
                yVar = (y) kVar2.y;
                yVar.a = j;
                synchronized (n.c) {
                    yVar.b = wVar.c();
                    wVar.b(yVar);
                }
            }
        }
        if (arrayListX != null) {
            size = arrayListX.size();
            while (i < size) {
                p0Var.l((w) arrayListX.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListX = kotlin.collections.o.X(arrayList3, arrayListX);
            }
            this.i = arrayListX;
        }
        return i.b;
    }
}
