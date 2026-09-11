package androidx.compose.runtime.collection;

import androidx.collection.j0;
import androidx.collection.o0;
import androidx.collection.u0;
import androidx.transition.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final o0 a;

    public /* synthetic */ a(o0 o0Var) {
        this.a = o0Var;
    }

    public static final Object a(o0 o0Var) {
        Object objG = o0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof j0)) {
            o0Var.k(null);
            return objG;
        }
        j0 j0Var = (j0) objG;
        if (j0Var.h()) {
            k.m("List is empty.");
            return null;
        }
        int i = j0Var.b - 1;
        Object objF = j0Var.f(i);
        j0Var.k(i);
        objF.getClass();
        if (j0Var.h()) {
            o0Var.k(null);
        }
        if (j0Var.b == 1) {
            o0Var.m(null, j0Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final j0 b(o0 o0Var) {
        if (o0Var.i()) {
            j0 j0Var = u0.b;
            j0Var.getClass();
            return j0Var;
        }
        j0 j0Var2 = new j0();
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof j0) {
                                j0Var2.b((j0) obj);
                            } else {
                                obj.getClass();
                                j0Var2.a(obj);
                            }
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
        return j0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a.equals(((a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
