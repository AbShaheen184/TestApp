package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.compose.runtime.snapshots.y {
    public static final Object h = new Object();
    public long c;
    public int d;
    public androidx.collection.f0 e;
    public Object f;
    public int g;

    public d0(long j) {
        super(j);
        androidx.collection.f0 f0Var = androidx.collection.t0.a;
        f0Var.getClass();
        this.e = f0Var;
        this.f = h;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        d0 d0Var = (d0) yVar;
        this.e = d0Var.e;
        this.f = d0Var.f;
        this.g = d0Var.g;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final androidx.compose.runtime.snapshots.y b(long j) {
        return new d0(j);
    }

    public final boolean c(e0 e0Var, androidx.compose.runtime.snapshots.f fVar) {
        boolean z;
        boolean z2;
        Object obj = androidx.compose.runtime.snapshots.n.c;
        synchronized (obj) {
            z = true;
            z2 = (this.c == fVar.g() && this.d == fVar.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != d(e0Var, fVar))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = fVar.g();
            this.d = fVar.h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[LOOP:4: B:48:0x00d2->B:49:0x00d4, LOOP_END] */
    public final int d(e0 e0Var, androidx.compose.runtime.snapshots.f fVar) throws Throwable {
        androidx.collection.f0 f0Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.snapshots.y yVarG;
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            f0Var = this.e;
        }
        int i6 = 7;
        if (f0Var.e == 0) {
            return 7;
        }
        androidx.compose.runtime.collection.b bVarI = s.i();
        Object[] objArr2 = bVarI.e;
        int i7 = bVarI.z;
        for (int i8 = 0; i8 < i7; i8++) {
            ((q) objArr2[i8]).b();
        }
        try {
            Object[] objArr3 = f0Var.b;
            int[] iArr = f0Var.c;
            long[] jArr2 = f0Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i9 = 0;
                while (true) {
                    long j = jArr2[i9];
                    if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8;
                        int i11 = 8 - ((~(i9 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j & 255) < 128) {
                                int i13 = (i9 << 3) + i12;
                                Object obj = objArr3[i13];
                                i4 = i6;
                                int i14 = iArr[i13];
                                i5 = i10;
                                androidx.compose.runtime.snapshots.w wVar = (androidx.compose.runtime.snapshots.w) obj;
                                if (i14 == 1) {
                                    if (wVar instanceof e0) {
                                        try {
                                            e0 e0Var2 = (e0) wVar;
                                            yVarG = e0Var2.g((d0) androidx.compose.runtime.snapshots.n.i(e0Var2.A, fVar), fVar, false, e0Var2.y);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr4 = bVarI.e;
                                            int i15 = bVarI.z;
                                            for (int i16 = 0; i16 < i15; i16++) {
                                                ((q) objArr4[i16]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        yVarG = androidx.compose.runtime.snapshots.n.i(wVar.c(), fVar);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(yVarG)) * 31) + Long.hashCode(yVarG.a);
                                }
                            } else {
                                i4 = i6;
                                i5 = i10;
                            }
                            j >>= i5;
                            i12++;
                            i6 = i4;
                            jArr2 = jArr2;
                            i10 = i5;
                        }
                        jArr = jArr2;
                        i3 = i6;
                        if (i11 != i10) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                        i3 = i6;
                    }
                    if (i9 != length) {
                        i9++;
                        i6 = i3;
                        jArr2 = jArr;
                    } else {
                        i6 = iIdentityHashCode;
                    }
                }
                objArr = bVarI.e;
                i = bVarI.z;
                for (i2 = 0; i2 < i; i2++) {
                    ((q) objArr[i2]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i6;
            objArr = bVarI.e;
            i = bVarI.z;
            while (i2 < i) {
                ((q) objArr[i2]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
