package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final androidx.collection.o0 a;
    public androidx.appcompat.widget.x b;
    public final androidx.collection.p0 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final androidx.compose.ui.r i;

    public v() {
        long[] jArr = androidx.collection.w0.a;
        this.a = new androidx.collection.o0();
        androidx.collection.p0 p0Var = androidx.collection.x0.a;
        this.c = new androidx.collection.p0();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new s(this);
    }

    public static int e(int[] iArr, e0 e0Var) {
        int i = e0Var.i();
        int iC = e0Var.c() + i;
        int iMax = 0;
        while (i < iC) {
            int iB = e0Var.b() + iArr[i];
            iArr[i] = iB;
            iMax = Math.max(iMax, iB);
            i++;
        }
        return iMax;
    }

    public final void a(int i, Object obj) {
        androidx.privacysandbox.ads.adservices.java.internal.a.C(this.a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0092 A[EDGE_INSN: B:107:0x0092->B:33:0x0092 BREAK  A[LOOP:2: B:21:0x005a->B:32:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[LOOP:2: B:21:0x005a->B:32:0x008f, LOOP_END] */
    public final void c(int i, int i2, ArrayList arrayList, androidx.appcompat.widget.x xVar, j2 j2Var, boolean z, int i3, boolean z2, int i4, int i5) throws Throwable {
        Throwable th;
        androidx.appcompat.widget.x xVar2 = this.b;
        this.b = xVar;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            e0 e0Var = (e0) arrayList.get(i6);
            int iA = e0Var.a();
            for (int i7 = 0; i7 < iA; i7++) {
                e0Var.d(i7);
            }
        }
        androidx.collection.o0 o0Var = this.a;
        if (o0Var.i()) {
            d();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = o0Var.b;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        androidx.collection.p0 p0Var = this.c;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j = jArr[i8];
                int i9 = i8;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i9 != length) {
                        break;
                        break;
                    }
                    i8 = i9 + 1;
                } else {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    long j2 = j;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j2 & 255) < 128) {
                            p0Var.a(objArr[(i9 << 3) + i11]);
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i9 != length) {
                        break;
                    } else {
                        i8 = i9 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            e0 e0Var2 = (e0) arrayList.get(i12);
            p0Var.l(e0Var2.getKey());
            int iA2 = e0Var2.a();
            for (int i13 = 0; i13 < iA2; i13++) {
                e0Var2.d(i13);
            }
            androidx.privacysandbox.ads.adservices.java.internal.a.C(this.a.k(e0Var2.getKey()));
        }
        int[] iArr = new int[i3];
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z3 && xVar2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    kotlin.collections.r.B(new u(xVar2, 2), arrayList3);
                }
                if (arrayList3.size() > 0) {
                    e0 e0Var3 = (e0) arrayList3.get(0);
                    e(iArr, e0Var3);
                    Object objG = o0Var.g(e0Var3.getKey());
                    objG.getClass();
                    androidx.privacysandbox.ads.adservices.java.internal.a.C(objG);
                    e0Var3.h(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i3, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    kotlin.collections.r.B(new u(xVar2, 0), arrayList2);
                }
                if (arrayList2.size() > 0) {
                    e0 e0Var4 = (e0) arrayList2.get(0);
                    e(iArr, e0Var4);
                    Object objG2 = o0Var.g(e0Var4.getKey());
                    objG2.getClass();
                    androidx.privacysandbox.ads.adservices.java.internal.a.C(objG2);
                    e0Var4.h(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i3, 0);
            }
        }
        Object[] objArr2 = p0Var.b;
        long[] jArr2 = p0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            Throwable th2 = null;
            int i14 = 0;
            while (true) {
                long j3 = jArr2[i14];
                th = th2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    long j4 = j3;
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j4 & 255) < 128) {
                            androidx.privacysandbox.ads.adservices.java.internal.a.C(o0Var.g(objArr2[(i14 << 3) + i16]));
                        }
                        j4 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                th2 = th;
            }
        } else {
            th = null;
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                kotlin.collections.r.B(new u(xVar, 3), arrayList4);
            }
            if (arrayList4.size() > 0) {
                e0 e0Var5 = (e0) arrayList4.get(0);
                Object objG3 = o0Var.g(e0Var5.getKey());
                objG3.getClass();
                androidx.privacysandbox.ads.adservices.java.internal.a.C(objG3);
                e(iArr, e0Var5);
                if (!z) {
                    throw th;
                }
                ((e0) kotlin.collections.o.K(arrayList)).h(0);
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                kotlin.collections.r.B(new u(xVar, 1), arrayList5);
            }
            if (arrayList5.size() > 0) {
                e0 e0Var6 = (e0) arrayList5.get(0);
                Object objG4 = o0Var.g(e0Var6.getKey());
                objG4.getClass();
                androidx.privacysandbox.ads.adservices.java.internal.a.C(objG4);
                e(iArr, e0Var6);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        p0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void d() {
        androidx.collection.o0 o0Var = this.a;
        if (o0Var.j()) {
            Object[] objArr = o0Var.c;
            long[] jArr = o0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                androidx.privacysandbox.ads.adservices.java.internal.a.C(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            o0Var.a();
        }
    }
}
