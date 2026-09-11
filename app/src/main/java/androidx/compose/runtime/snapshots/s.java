package androidx.compose.runtime.snapshots;

import androidx.collection.f0;
import androidx.collection.o0;
import androidx.collection.p0;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.e0;
import androidx.compose.ui.node.n1;
import androidx.datastore.preferences.protobuf.h1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final kotlin.jvm.functions.l a;
    public Object b;
    public f0 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final o0 e = h1.g();
    public final o0 f = new o0();
    public final p0 g = new p0();
    public final androidx.compose.runtime.collection.b h = new androidx.compose.runtime.collection.b(new e0[16]);
    public final androidx.compose.runtime.q i = new androidx.compose.runtime.q(this, 1);
    public final o0 l = h1.g();
    public final HashMap m = new HashMap();

    public s(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.s.a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    public final void b(Object obj, int i, Object obj2, f0 f0Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int iC = f0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = f0Var.c[iC];
        }
        f0Var.b[iC] = obj;
        f0Var.c[iC] = i;
        if ((obj instanceof e0) && i2 != i) {
            d0 d0VarH = ((e0) obj).h();
            this.m.put(obj, d0VarH.f);
            f0 f0Var2 = d0VarH.e;
            o0 o0Var = this.l;
            h1.w(o0Var, obj);
            Object[] objArr = f0Var2.b;
            long[] jArr = f0Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                w wVar = (w) objArr[(i3 << 3) + i5];
                                if (wVar instanceof x) {
                                    ((x) wVar).f(2);
                                }
                                h1.e(o0Var, wVar, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof x) {
                ((x) obj).f(2);
            }
            h1.e(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        o0 o0Var = this.e;
        h1.v(o0Var, obj2, obj);
        if (!(obj2 instanceof e0) || o0Var.c(obj2)) {
            return;
        }
        h1.w(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0064->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[EDGE_INSN: B:48:0x00ae->B:30:0x00ae BREAK  A[LOOP:2: B:16:0x0064->B:28:0x009f], SYNTHETIC] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        o0 o0Var = this.f;
        long[] jArr3 = o0Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = o0Var.b[i6];
                        j2 = j4;
                        f0 f0Var = (f0) o0Var.c[i6];
                        obj.getClass();
                        boolean zP = ((n1) obj).p();
                        if (zP) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zP;
                        } else {
                            Object[] objArr = f0Var.b;
                            int[] iArr = f0Var.c;
                            long[] jArr4 = f0Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zP;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zP = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zP = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zP;
                            }
                        }
                        if (!z) {
                            o0Var.l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
