package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.compose.runtime.snapshots.x implements t2 {
    public d0 A = new d0(androidx.compose.runtime.snapshots.n.j().g());
    public final kotlin.jvm.functions.a y;
    public final f z;

    public e0(f fVar, kotlin.jvm.functions.a aVar) {
        this.y = aVar;
        this.z = fVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final void b(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.A = (d0) yVar;
    }

    @Override // androidx.compose.runtime.snapshots.w
    public final androidx.compose.runtime.snapshots.y c() {
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a3 A[EDGE_INSN: B:101:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #1 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:93:0x0023 }] */
    public final d0 g(d0 d0Var, androidx.compose.runtime.snapshots.f fVar, boolean z, kotlin.jvm.functions.a aVar) {
        d0 d0Var2;
        f fVar2;
        int i;
        if (d0Var.c(this, fVar)) {
            if (z) {
                androidx.compose.runtime.collection.b bVarI = s.i();
                Object[] objArr = bVarI.e;
                int i2 = bVarI.z;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((q) objArr[i3]).b();
                }
                try {
                    androidx.collection.f0 f0Var = d0Var.e;
                    androidx.appcompat.widget.c2 c2Var = n2.a;
                    androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) c2Var.v();
                    if (gVar == null) {
                        gVar = new androidx.compose.runtime.internal.g();
                        c2Var.X(gVar);
                    }
                    int i4 = gVar.a;
                    Object[] objArr2 = f0Var.b;
                    int[] iArr = f0Var.c;
                    long[] jArr = f0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        androidx.compose.runtime.snapshots.w wVar = (androidx.compose.runtime.snapshots.w) objArr2[i9];
                                        gVar.a = i4 + iArr[i9];
                                        kotlin.jvm.functions.l lVarE = fVar.e();
                                        if (lVarE != null) {
                                            lVarE.invoke(wVar);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    gVar.a = i4;
                } finally {
                    Object[] objArr3 = bVarI.e;
                    int i10 = bVarI.z;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((q) objArr3[i11]).a();
                    }
                }
            }
            return d0Var;
        }
        androidx.collection.f0 f0Var2 = new androidx.collection.f0();
        androidx.appcompat.widget.c2 c2Var2 = n2.a;
        androidx.compose.runtime.internal.g gVar2 = (androidx.compose.runtime.internal.g) c2Var2.v();
        if (gVar2 == null) {
            gVar2 = new androidx.compose.runtime.internal.g();
            c2Var2.X(gVar2);
        }
        int i12 = gVar2.a;
        androidx.compose.runtime.collection.b bVarI2 = s.i();
        Object[] objArr4 = bVarI2.e;
        int i13 = bVarI2.z;
        for (int i14 = 0; i14 < i13; i14++) {
            ((q) objArr4[i14]).b();
        }
        try {
            gVar2.a = i12 + 1;
            Object objJ = androidx.compose.runtime.snapshots.r.j(new androidx.compose.foundation.layout.s0(this, gVar2, f0Var2, i12, 3), aVar);
            gVar2.a = i12;
            Object[] objArr5 = bVarI2.e;
            int i15 = bVarI2.z;
            for (int i16 = 0; i16 < i15; i16++) {
                ((q) objArr5[i16]).a();
            }
            Object obj = androidx.compose.runtime.snapshots.n.c;
            synchronized (obj) {
                try {
                    androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
                    Object obj2 = d0Var.f;
                    if (obj2 == d0.h || (fVar2 = this.z) == null || !fVar2.b(objJ, obj2)) {
                        d0 d0Var3 = this.A;
                        synchronized (obj) {
                            androidx.compose.runtime.snapshots.y yVarM = androidx.compose.runtime.snapshots.n.m(d0Var3, this);
                            yVarM.a(d0Var3);
                            yVarM.a = fVarJ.g();
                            d0Var2 = (d0) yVarM;
                            d0Var2.e = f0Var2;
                            d0Var2.g = d0Var2.d(this, fVarJ);
                            d0Var2.f = objJ;
                        }
                        return d0Var2;
                    }
                    d0Var.e = f0Var2;
                    d0Var.g = d0Var.d(this, fVarJ);
                    d0Var2 = d0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            androidx.compose.runtime.internal.g gVar3 = (androidx.compose.runtime.internal.g) n2.a.v();
            if (gVar3 == null || gVar3.a != 0) {
                return d0Var2;
            }
            androidx.compose.runtime.snapshots.n.j().m();
            synchronized (obj) {
                androidx.compose.runtime.snapshots.f fVarJ2 = androidx.compose.runtime.snapshots.n.j();
                d0Var2.c = fVarJ2.g();
                d0Var2.d = fVarJ2.h();
                return d0Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = bVarI2.e;
            int i17 = bVarI2.z;
            for (int i18 = 0; i18 < i17; i18++) {
                ((q) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        kotlin.jvm.functions.l lVarE = androidx.compose.runtime.snapshots.n.j().e();
        if (lVarE != null) {
            lVarE.invoke(this);
        }
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        return g((d0) androidx.compose.runtime.snapshots.n.i(this.A, fVarJ), fVarJ, true, this.y).f;
    }

    public final d0 h() {
        androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
        return g((d0) androidx.compose.runtime.snapshots.n.i(this.A, fVarJ), fVarJ, false, this.y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        d0 d0Var = (d0) androidx.compose.runtime.snapshots.n.h(this.A);
        sb.append(d0Var.c(this, androidx.compose.runtime.snapshots.n.j()) ? String.valueOf(d0Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
