package androidx.compose.ui.semantics;

import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.ui.platform.i0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements x, Iterable, kotlin.jvm.internal.markers.a {
    public boolean A;
    public final o0 e;
    public androidx.collection.w y;
    public boolean z;

    public l() {
        long[] jArr = w0.a;
        this.e = new o0();
    }

    @Override // androidx.compose.ui.semantics.x
    public final void b(w wVar, Object obj) {
        boolean z = obj instanceof a;
        o0 o0Var = this.e;
        if (z && o0Var.c(wVar)) {
            Object objG = o0Var.g(wVar);
            objG.getClass();
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.a;
            if (str == null) {
                str = aVar.a;
            }
            kotlin.d dVar = aVar2.b;
            if (dVar == null) {
                dVar = aVar.b;
            }
            o0Var.m(wVar, new a(str, dVar));
        } else {
            o0Var.m(wVar, obj);
        }
        wVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final l c() {
        l lVar = new l();
        lVar.z = this.z;
        lVar.A = this.A;
        o0 o0Var = lVar.e;
        o0Var.getClass();
        o0 o0Var2 = this.e;
        o0Var2.getClass();
        Object[] objArr = o0Var2.b;
        Object[] objArr2 = o0Var2.c;
        long[] jArr = o0Var2.a;
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
                            int i4 = (i << 3) + i3;
                            o0Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return lVar;
    }

    public final Object d(w wVar) {
        Object objG = this.e.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final void e(l lVar) {
        o0 o0Var = lVar.e;
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
        long[] jArr = o0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        w wVar = (w) obj;
                        o0 o0Var2 = this.e;
                        Object objG = o0Var2.g(wVar);
                        wVar.getClass();
                        Object objInvoke = wVar.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            o0Var2.m(wVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.e, lVar.e) && this.z == lVar.z && this.A == lVar.A;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + androidx.privacysandbox.ads.adservices.java.internal.a.f(this.e.hashCode() * 31, 31, this.z);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        androidx.collection.w wVar = this.y;
        if (wVar == null) {
            o0 o0Var = this.e;
            o0Var.getClass();
            androidx.collection.w wVar2 = new androidx.collection.w(o0Var);
            this.y = wVar2;
            wVar = wVar2;
        }
        return ((androidx.collection.j) wVar.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.z) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.A) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        o0 o0Var = this.e;
        Object[] objArr = o0Var.b;
        Object[] objArr2 = o0Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((w) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return i0.q(this) + "{ " + ((Object) sb) + " }";
    }
}
