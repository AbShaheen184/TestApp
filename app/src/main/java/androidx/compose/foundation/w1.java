package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ w1(androidx.compose.foundation.text.n1 n1Var, androidx.compose.ui.layout.c1 c1Var, int i) {
        this.e = 1;
        this.A = n1Var;
        this.y = c1Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.runtime.u uVar;
        long[] jArr;
        androidx.compose.runtime.u uVar2;
        long[] jArr2;
        int i;
        switch (this.e) {
            case 0:
                y1 y1Var = (y1) this.A;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) this.y;
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                int iG = y1Var.L.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                int i2 = this.z;
                if (iG > i2) {
                    iG = i2;
                }
                int i3 = -iG;
                boolean z = y1Var.M;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                b1Var.e = true;
                androidx.compose.ui.layout.b1.m(b1Var, c1Var, i4, i3);
                b1Var.e = false;
                break;
            case 1:
                androidx.compose.foundation.text.n1 n1Var = (androidx.compose.foundation.text.n1) this.A;
                androidx.compose.ui.layout.c1 c1Var2 = (androidx.compose.ui.layout.c1) this.y;
                androidx.compose.ui.layout.b1 b1Var2 = (androidx.compose.ui.layout.b1) obj;
                int i5 = n1Var.c;
                androidx.compose.foundation.text.i1 i1Var = n1Var.b;
                androidx.compose.ui.text.input.e0 e0Var = n1Var.d;
                androidx.compose.foundation.text.k1 k1Var = (androidx.compose.foundation.text.k1) n1Var.e.invoke();
                i1Var.a(androidx.compose.foundation.gestures.k1.e, androidx.compose.foundation.text.n0.h(b1Var2, i5, e0Var, k1Var != null ? k1Var.a : null, false, c1Var2.e), this.z, c1Var2.y);
                androidx.compose.ui.layout.b1.l(b1Var2, c1Var2, 0, Math.round(-i1Var.a.g()));
                break;
            default:
                androidx.compose.runtime.q1 q1Var = (androidx.compose.runtime.q1) this.A;
                androidx.collection.f0 f0Var = (androidx.collection.f0) this.y;
                androidx.compose.runtime.u uVar3 = (androidx.compose.runtime.u) obj;
                int i6 = q1Var.e;
                int i7 = this.z;
                if (i6 == i7 && kotlin.jvm.internal.l.a(f0Var, q1Var.f) && (uVar3 instanceof androidx.compose.runtime.y)) {
                    long[] jArr3 = f0Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        int i12 = (i8 << 3) + i11;
                                        Object obj2 = f0Var.b[i12];
                                        boolean z2 = f0Var.c[i12] != i7;
                                        if (z2) {
                                            i = i9;
                                            androidx.compose.runtime.y yVar = (androidx.compose.runtime.y) uVar3;
                                            uVar2 = uVar3;
                                            androidx.collection.o0 o0Var = yVar.D;
                                            androidx.datastore.preferences.protobuf.h1.v(o0Var, obj2, q1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof androidx.compose.runtime.e0) {
                                                androidx.compose.runtime.e0 e0Var2 = (androidx.compose.runtime.e0) obj2;
                                                if (!o0Var.c(e0Var2)) {
                                                    androidx.datastore.preferences.protobuf.h1.w(yVar.G, e0Var2);
                                                }
                                                androidx.collection.o0 o0Var2 = q1Var.g;
                                                if (o0Var2 != null) {
                                                    o0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            uVar2 = uVar3;
                                            jArr2 = jArr3;
                                            i = i9;
                                        }
                                        if (z2) {
                                            f0Var.f(i12);
                                        }
                                    } else {
                                        uVar2 = uVar3;
                                        jArr2 = jArr3;
                                        i = i9;
                                    }
                                    j >>= i;
                                    i11++;
                                    i9 = i;
                                    uVar3 = uVar2;
                                    jArr3 = jArr2;
                                }
                                uVar = uVar3;
                                jArr = jArr3;
                                if (i10 == i9) {
                                }
                            } else {
                                uVar = uVar3;
                                jArr = jArr3;
                            }
                            if (i8 != length) {
                                i8++;
                                uVar3 = uVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ w1(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.A = obj;
        this.z = i;
        this.y = obj2;
    }
}
