package androidx.compose.runtime.snapshots;

import androidx.appcompat.widget.c2;
import androidx.collection.p0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final androidx.compose.runtime.saveable.m a = new androidx.compose.runtime.saveable.m(2);
    public static final c2 b = new c2(3);
    public static final Object c = new Object();
    public static l d;
    public static long e;
    public static final j f;
    public static final androidx.appcompat.widget.x g;
    public static Object h;
    public static Object i;
    public static final a j;
    public static final androidx.compose.runtime.internal.a k;

    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[], java.io.Serializable] */
    static {
        l lVar = l.B;
        d = lVar;
        long j2 = 1;
        e = j2 + j2;
        j jVar = new j();
        jVar.c = new long[16];
        jVar.d = new int[16];
        ?? r5 = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            r5[i2] = i3;
            i2 = i3;
        }
        jVar.e = r5;
        f = jVar;
        androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(4, (byte) 0);
        xVar.z = new int[16];
        xVar.A = new androidx.compose.runtime.internal.o[16];
        g = xVar;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        h = uVar;
        i = uVar;
        long j3 = e;
        e = j2 + j3;
        a aVar = new a(j3, lVar, null, new androidx.compose.runtime.saveable.m(1));
        d = d.f(aVar.b);
        j = aVar;
        k = new androidx.compose.runtime.internal.a(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, b bVar, l lVar) {
        long[] jArr;
        l lVar2;
        long[] jArr2;
        int i2;
        int i3;
        y yVarS;
        p0 p0VarX = bVar.x();
        if (p0VarX != null) {
            long jG = bVar.g();
            l lVarE = bVar.d().f(jG).e(bVar.j);
            Object[] objArr = p0VarX.b;
            long[] jArr3 = p0VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                w wVar = (w) objArr[(i4 << 3) + i7];
                                y yVarC = wVar.c();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                y yVarS2 = s(yVarC, j2, lVar);
                                if (yVarS2 != null && (yVarS = s(yVarC, jG, lVarE)) != null && !yVarS2.equals(yVarS)) {
                                    y yVarS3 = s(yVarC, jG, bVar.d());
                                    if (yVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    y yVarD = wVar.d(yVarS, yVarS2, yVarS3);
                                    if (yVarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(yVarS2, yVarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            lVarE = lVarE;
                        }
                        jArr = jArr3;
                        lVar2 = lVarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        lVar2 = lVarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    lVarE = lVar2;
                }
            }
        }
        return null;
    }

    public static final void c(f fVar) {
        long j2;
        if (d.d(fVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(fVar.g());
        sb.append(", disposed=");
        sb.append(fVar.c);
        sb.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            j jVar = f;
            j2 = jVar.a > 0 ? ((long[]) jVar.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final l d(l lVar, long j2, long j3) {
        while (kotlin.jvm.internal.l.c(j2, j3) < 0) {
            lVar = lVar.f(j2);
            j2 += (long) 1;
        }
        return lVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object e(kotlin.jvm.functions.l lVar) {
        p0 p0Var;
        Object objV;
        a aVar = j;
        synchronized (c) {
            try {
                p0Var = aVar.h;
                if (p0Var != null) {
                    k.addAndGet(1);
                }
                objV = v(aVar, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (p0Var != null) {
            try {
                ?? r4 = h;
                int size = r4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((kotlin.jvm.functions.p) r4.get(i2)).invoke(new androidx.compose.runtime.collection.d(p0Var), aVar);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            f();
            if (p0Var != null) {
                Object[] objArr = p0Var.b;
                long[] jArr = p0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((w) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
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
                }
            }
        }
        return objV;
    }

    public static final void f() {
        androidx.appcompat.widget.x xVar = g;
        int i2 = xVar.y;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            androidx.compose.runtime.internal.o oVar = ((androidx.compose.runtime.internal.o[]) xVar.A)[i3];
            Object obj = oVar != null ? oVar.get() : null;
            if (obj != null && p((w) obj)) {
                if (i4 != i3) {
                    ((androidx.compose.runtime.internal.o[]) xVar.A)[i4] = oVar;
                    int[] iArr = (int[]) xVar.z;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((androidx.compose.runtime.internal.o[]) xVar.A)[i5] = null;
            ((int[]) xVar.z)[i5] = 0;
        }
        if (i4 != i2) {
            xVar.y = i4;
        }
    }

    public static final f g(f fVar, kotlin.jvm.functions.l lVar, boolean z) {
        boolean z2 = fVar instanceof b;
        if (z2 || fVar == null) {
            return new b0(z2 ? (b) fVar : null, lVar, null, false, z);
        }
        return new c0(fVar, lVar, false, z);
    }

    public static final y h(y yVar) {
        y yVarS;
        f fVarJ = j();
        y yVarS2 = s(yVar, fVarJ.g(), fVarJ.d());
        if (yVarS2 != null) {
            return yVarS2;
        }
        synchronized (c) {
            f fVarJ2 = j();
            yVarS = s(yVar, fVarJ2.g(), fVarJ2.d());
        }
        if (yVarS != null) {
            return yVarS;
        }
        r();
        throw null;
    }

    public static final y i(y yVar, f fVar) {
        y yVarS;
        y yVarS2 = s(yVar, fVar.g(), fVar.d());
        if (yVarS2 != null) {
            return yVarS2;
        }
        synchronized (c) {
            yVarS = s(yVar, fVar.g(), fVar.d());
        }
        if (yVarS != null) {
            return yVarS;
        }
        r();
        throw null;
    }

    public static final f j() {
        f fVar = (f) b.v();
        return fVar == null ? j : fVar;
    }

    public static final kotlin.jvm.functions.l k(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new m(lVar, lVar2, 0);
    }

    public static final kotlin.jvm.functions.l l(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new m(lVar, lVar2, 1);
    }

    public static final y m(y yVar, w wVar) {
        long j2 = e;
        j jVar = f;
        if (jVar.a > 0) {
            j2 = ((long[]) jVar.c)[0];
        }
        long j3 = j2 - ((long) 1);
        y yVar2 = null;
        y yVar3 = null;
        for (y yVarC = wVar.c(); yVarC != null; yVarC = yVarC.b) {
            long j4 = yVarC.a;
            if (j4 != 0) {
                if (j4 != 0 && kotlin.jvm.internal.l.c(j4, j3) <= 0 && !l.B.d(j4)) {
                    if (yVar3 != null) {
                        if (kotlin.jvm.internal.l.c(yVarC.a, yVar3.a) >= 0) {
                            yVar2 = yVar3;
                            break;
                        }
                        break;
                    }
                    yVar3 = yVarC;
                }
            }
            yVar2 = yVarC;
            break;
        }
        if (yVar2 != null) {
            yVar2.a = Long.MAX_VALUE;
            return yVar2;
        }
        y yVarB = yVar.b(Long.MAX_VALUE);
        yVarB.b = wVar.c();
        wVar.b(yVarB);
        return yVarB;
    }

    public static final void n(f fVar, w wVar) {
        fVar.t(fVar.h() + 1);
        kotlin.jvm.functions.l lVarI = fVar.i();
        if (lVarI != null) {
            lVarI.invoke(wVar);
        }
    }

    public static final y o(y yVar, x xVar, f fVar, y yVar2) {
        y yVarM;
        if (fVar.f()) {
            fVar.n(xVar);
        }
        long jG = fVar.g();
        if (yVar2.a == jG) {
            return yVar2;
        }
        synchronized (c) {
            yVarM = m(yVar, xVar);
        }
        yVarM.a = jG;
        if (yVar2.a != 1) {
            fVar.n(xVar);
        }
        return yVarM;
    }

    public static final boolean p(w wVar) {
        y yVar;
        long j2 = e;
        j jVar = f;
        if (jVar.a > 0) {
            j2 = ((long[]) jVar.c)[0];
        }
        y yVar2 = null;
        y yVarC = null;
        int i2 = 0;
        for (y yVarC2 = wVar.c(); yVarC2 != null; yVarC2 = yVarC2.b) {
            long j3 = yVarC2.a;
            if (j3 != 0) {
                if (kotlin.jvm.internal.l.c(j3, j2) >= 0) {
                    i2++;
                } else if (yVar2 == null) {
                    i2++;
                    yVar2 = yVarC2;
                } else {
                    if (kotlin.jvm.internal.l.c(yVarC2.a, yVar2.a) < 0) {
                        yVar = yVar2;
                        yVar2 = yVarC2;
                    } else {
                        yVar = yVarC2;
                    }
                    if (yVarC == null) {
                        yVarC = wVar.c();
                        y yVar3 = yVarC;
                        while (true) {
                            if (yVarC == null) {
                                yVarC = yVar3;
                                break;
                            }
                            if (kotlin.jvm.internal.l.c(yVarC.a, j2) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.l.c(yVar3.a, yVarC.a) < 0) {
                                yVar3 = yVarC;
                            }
                            yVarC = yVarC.b;
                        }
                    }
                    yVar2.a = 0L;
                    yVar2.a(yVarC);
                    yVar2 = yVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(w wVar) {
        if (p(wVar)) {
            androidx.appcompat.widget.x xVar = g;
            int i2 = xVar.y;
            int iIdentityHashCode = System.identityHashCode(wVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = xVar.y - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) xVar.z)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        androidx.compose.runtime.internal.o oVar = ((androidx.compose.runtime.internal.o[]) xVar.A)[i6];
                        if (wVar == (oVar != null ? oVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) xVar.z)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = xVar.y;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(xVar.y + 1);
                                        break;
                                    }
                                    if (((int[]) xVar.z)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    androidx.compose.runtime.internal.o oVar2 = ((androidx.compose.runtime.internal.o[]) xVar.A)[i6];
                                    if ((oVar2 != null ? oVar2.get() : null) == wVar) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                androidx.compose.runtime.internal.o oVar3 = ((androidx.compose.runtime.internal.o[]) xVar.A)[i8];
                                if ((oVar3 != null ? oVar3.get() : null) == wVar) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            androidx.compose.runtime.internal.o[] oVarArr = (androidx.compose.runtime.internal.o[]) xVar.A;
            int length = oVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                androidx.compose.runtime.internal.o[] oVarArr2 = new androidx.compose.runtime.internal.o[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(oVarArr, i10, oVarArr2, i12, i2 - i10);
                System.arraycopy((androidx.compose.runtime.internal.o[]) xVar.A, 0, oVarArr2, 0, i10);
                kotlin.collections.n.C(i12, i10, i2, (int[]) xVar.z, iArr);
                kotlin.collections.n.G(0, i10, 6, (int[]) xVar.z, iArr);
                xVar.A = oVarArr2;
                xVar.z = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(oVarArr, i10, oVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) xVar.z;
                kotlin.collections.n.C(i13, i10, i2, iArr2, iArr2);
            }
            ((androidx.compose.runtime.internal.o[]) xVar.A)[i10] = new androidx.compose.runtime.internal.o(wVar);
            ((int[]) xVar.z)[i10] = iIdentityHashCode;
            xVar.y++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final y s(y yVar, long j2, l lVar) {
        y yVar2 = null;
        while (yVar != null) {
            long j3 = yVar.a;
            if (j3 != 0 && kotlin.jvm.internal.l.c(j3, j2) <= 0 && !lVar.d(j3) && (yVar2 == null || kotlin.jvm.internal.l.c(yVar2.a, yVar.a) < 0)) {
                yVar2 = yVar;
            }
            yVar = yVar.b;
        }
        if (yVar2 != null) {
            return yVar2;
        }
        return null;
    }

    public static final y t(y yVar, w wVar) {
        y yVarS;
        f fVarJ = j();
        kotlin.jvm.functions.l lVarE = fVarJ.e();
        if (lVarE != null) {
            lVarE.invoke(wVar);
        }
        y yVarS2 = s(yVar, fVarJ.g(), fVarJ.d());
        if (yVarS2 != null) {
            return yVarS2;
        }
        synchronized (c) {
            f fVarJ2 = j();
            y yVarC = wVar.c();
            yVarC.getClass();
            yVarS = s(yVarC, fVarJ2.g(), fVarJ2.d());
            if (yVarS == null) {
                r();
                throw null;
            }
        }
        return yVarS;
    }

    public static final void u(int i2) {
        j jVar = f;
        int i3 = ((int[]) jVar.e)[i2];
        jVar.g(i3, jVar.a - 1);
        jVar.a--;
        long[] jArr = (long[]) jVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.l.c(jArr[i5], j2) <= 0) {
                break;
            }
            jVar.g(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) jVar.c;
        int i6 = jVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < jVar.a && kotlin.jvm.internal.l.c(jArr2[i7], jArr2[i8]) < 0) {
                if (kotlin.jvm.internal.l.c(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                jVar.g(i7, i3);
                i3 = i7;
            } else {
                if (kotlin.jvm.internal.l.c(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                jVar.g(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) jVar.e)[i2] = jVar.b;
        jVar.b = i2;
    }

    public static final Object v(a aVar, kotlin.jvm.functions.l lVar) {
        long j2 = aVar.b;
        Object objInvoke = lVar.invoke(d.c(j2));
        long j3 = e;
        e = ((long) 1) + j3;
        l lVarC = d.c(j2);
        d = lVarC;
        aVar.b = j3;
        aVar.a = lVarC;
        aVar.g = 0;
        aVar.h = null;
        aVar.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final y w(y yVar, w wVar, f fVar) {
        y yVarS;
        if (fVar.f()) {
            fVar.n(wVar);
        }
        long jG = fVar.g();
        y yVarS2 = s(yVar, jG, fVar.d());
        if (yVarS2 == null) {
            r();
            throw null;
        }
        if (yVarS2.a == fVar.g()) {
            return yVarS2;
        }
        synchronized (c) {
            yVarS = s(wVar.c(), jG, fVar.d());
            if (yVarS == null) {
                r();
                throw null;
            }
            if (yVarS.a != jG) {
                y yVarM = m(yVarS, wVar);
                yVarM.a(yVarS);
                yVarM.a = fVar.g();
                yVarS = yVarM;
            }
        }
        if (yVarS2.a != 1) {
            fVar.n(wVar);
        }
        return yVarS;
    }
}
