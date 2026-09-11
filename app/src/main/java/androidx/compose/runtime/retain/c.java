package androidx.compose.runtime.retain;

import androidx.collection.j0;
import androidx.collection.o0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d {
    public boolean y;
    public boolean z;
    public boolean e = true;
    public final o0 A = new o0();

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:5:0x000d->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[EDGE_INSN: B:23:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0051], SYNTHETIC] */
    public final void a() {
        o0 o0Var = this.A;
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
                                j0 j0Var = (j0) obj;
                                Object[] objArr2 = j0Var.a;
                                int i4 = j0Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
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
