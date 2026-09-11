package androidx.compose.runtime.snapshots;

import androidx.collection.f0;
import androidx.compose.animation.core.g0;
import androidx.compose.runtime.n1;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final kotlin.jvm.functions.l a;
    public boolean c;
    public androidx.activity.y h;
    public s i;
    public final AtomicReference b = new AtomicReference(null);
    public final g0 d = new g0(this, 13);
    public final androidx.activity.compose.g e = new androidx.activity.compose.g(this, 29);
    public final androidx.compose.runtime.collection.b f = new androidx.compose.runtime.collection.b(new s[16]);
    public final Object g = new Object();
    public long j = -1;

    public t(kotlin.jvm.functions.l lVar) {
        this.a = lVar;
    }

    public final void a() {
        synchronized (this.g) {
            androidx.compose.runtime.collection.b bVar = this.f;
            Object[] objArr = bVar.e;
            int i = bVar.z;
            for (int i2 = 0; i2 < i; i2++) {
                s sVar = (s) objArr[i2];
                sVar.e.a();
                sVar.f.a();
                sVar.l.a();
                sVar.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:14:0x002e->B:25:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0011, B:26:0x007a, B:28:0x0082, B:33:0x0092, B:30:0x0087, B:11:0x0022, B:14:0x002e, B:16:0x0043, B:18:0x0051, B:20:0x005b, B:21:0x0066, B:25:0x0073, B:34:0x0098), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a A[EDGE_INSN: B:46:0x007a->B:26:0x007a BREAK  A[LOOP:1: B:14:0x002e->B:25:0x0073], SYNTHETIC] */
    public final void b(Object obj) {
        int i;
        synchronized (this.g) {
            try {
                androidx.compose.runtime.collection.b bVar = this.f;
                int i2 = bVar.z;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = bVar.e;
                    if (i3 < i2) {
                        s sVar = (s) objArr[i3];
                        f0 f0Var = (f0) sVar.f.k(obj);
                        if (f0Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = f0Var.b;
                            int[] iArr = f0Var.c;
                            long[] jArr = f0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                sVar.c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!sVar.f.j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = bVar.e;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        bVar.z = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        androidx.compose.runtime.t.b("Unexpected notification");
                        com.google.gson.b.b();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                androidx.compose.runtime.collection.b bVar = this.f;
                Object[] objArr = bVar.e;
                int i = bVar.z;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((s) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01c8  */
    public final void d(Object obj, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar) {
        Object obj2;
        s sVar;
        boolean z;
        f0 f0Var;
        f b0Var;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        synchronized (this.g) {
            androidx.compose.runtime.collection.b bVar = this.f;
            Object[] objArr = bVar.e;
            int i2 = bVar.z;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((s) obj2).a == lVar) {
                    break;
                } else {
                    i3++;
                }
            }
            sVar = (s) obj2;
            z = true;
            if (sVar == null) {
                lVar.getClass();
                kotlin.jvm.internal.c0.c(1, lVar);
                sVar = new s(lVar);
                bVar.b(sVar);
            }
        }
        s sVar2 = this.i;
        long j2 = this.j;
        if (j2 != -1 && j2 != androidx.compose.runtime.internal.k.b()) {
            StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j2, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbM.append(androidx.compose.runtime.internal.k.b());
            sbM.append(", name=");
            sbM.append(Thread.currentThread().getName());
            sbM.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            n1.a(sbM.toString());
        }
        try {
            this.i = sVar;
            this.j = androidx.compose.runtime.internal.k.b();
            androidx.activity.compose.g gVar = this.e;
            Object obj5 = sVar.b;
            f0 f0Var2 = sVar.c;
            int i4 = sVar.d;
            sVar.b = obj;
            sVar.c = (f0) sVar.f.g(obj);
            if (sVar.d == -1) {
                sVar.d = Long.hashCode(n.j().g());
            }
            androidx.compose.runtime.q qVar = sVar.i;
            androidx.compose.runtime.collection.b bVarI = androidx.compose.runtime.s.i();
            try {
                bVarI.b(qVar);
                if (gVar == null) {
                    aVar.invoke();
                    f0Var = f0Var2;
                } else {
                    f fVar = (f) n.b.v();
                    if (fVar instanceof b0) {
                        f0Var = f0Var2;
                        if (((b0) fVar).t == androidx.compose.runtime.internal.k.b()) {
                            kotlin.jvm.functions.l lVar2 = ((b0) fVar).r;
                            kotlin.jvm.functions.l lVar3 = ((b0) fVar).s;
                            try {
                                ((b0) fVar).r = n.k(gVar, lVar2, true);
                                ((b0) fVar).s = lVar3;
                                aVar.invoke();
                                ((b0) fVar).r = lVar2;
                                ((b0) fVar).s = lVar3;
                            } catch (Throwable th) {
                                ((b0) fVar).r = lVar2;
                                ((b0) fVar).s = lVar3;
                                throw th;
                            }
                        }
                    } else {
                        f0Var = f0Var2;
                    }
                    if (fVar == null || (fVar instanceof b)) {
                        b0Var = new b0(fVar instanceof b ? (b) fVar : null, gVar, null, true, false);
                    } else {
                        b0Var = fVar.u(gVar);
                    }
                    try {
                        f fVarJ = b0Var.j();
                        try {
                            aVar.invoke();
                            f.q(fVarJ);
                            b0Var.c();
                        } catch (Throwable th2) {
                            try {
                                f.q(fVarJ);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    b0Var.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVarI.k(bVarI.z - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                bVarI.k(bVarI.z - 1);
                Object obj6 = sVar.b;
                obj6.getClass();
                int i5 = sVar.d;
                f0 f0Var3 = sVar.c;
                if (f0Var3 != null) {
                    long[] jArr3 = f0Var3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j3 = jArr3[i6];
                            boolean z2 = z;
                            obj4 = obj5;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j3 & 255) < 128) {
                                        i = i8;
                                        int i9 = (i6 << 3) + i;
                                        jArr2 = jArr3;
                                        Object obj7 = f0Var3.b[i9];
                                        j = j3;
                                        boolean z3 = f0Var3.c[i9] != i5 ? z2 : false;
                                        if (z3) {
                                            sVar.c(obj6, obj7);
                                        }
                                        if (z3) {
                                            f0Var3.f(i9);
                                        }
                                    } else {
                                        i = i8;
                                        jArr2 = jArr3;
                                        j = j3;
                                    }
                                    j3 = j >> 8;
                                    i8 = i + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i7 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            z = z2;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                } else {
                    obj3 = obj5;
                }
                sVar.b = obj3;
                sVar.c = f0Var;
                sVar.d = i4;
                this.i = sVar2;
                this.j = j2;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            this.i = sVar2;
            this.j = j2;
            throw th7;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        g0 g0Var = this.d;
        n.e(n.a);
        synchronized (n.c) {
            n.h = kotlin.collections.o.W(n.h, g0Var);
        }
        this.h = new androidx.activity.y(g0Var, 2);
    }
}
