package androidx.compose.runtime.snapshots;

import androidx.collection.p0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final b o;
    public boolean p;

    public c(long j, l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, b bVar) {
        super(j, lVar, lVar2, lVar3);
        this.o = bVar;
        bVar.k();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final r w() throws Throwable {
        c cVar;
        b bVar = this.o;
        if (bVar.m || bVar.c) {
            return new h(this);
        }
        p0 p0Var = this.h;
        long j = this.b;
        HashMap mapB = p0Var != null ? n.b(bVar.g(), this, this.o.d()) : null;
        Object obj = n.c;
        synchronized (obj) {
            try {
                n.c(this);
                try {
                    if (p0Var == null || p0Var.d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        r rVarZ = cVar.z(this.o.g(), p0Var, mapB, this.o.d());
                        if (!rVarZ.equals(i.b)) {
                            return rVarZ;
                        }
                        p0 p0VarX = cVar.o.x();
                        if (p0VarX != null) {
                            p0VarX.j(p0Var);
                        } else {
                            cVar.o.B(p0Var);
                            cVar.h = null;
                        }
                    }
                    if (kotlin.jvm.internal.l.c(cVar.o.g(), j) < 0) {
                        cVar.o.v();
                    }
                    b bVar2 = cVar.o;
                    bVar2.r(bVar2.d().c(j).b(cVar.j));
                    cVar.o.A(j);
                    b bVar3 = cVar.o;
                    int i = cVar.d;
                    cVar.d = -1;
                    if (i >= 0) {
                        int[] iArr = bVar3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                        iArrCopyOf[length] = i;
                        bVar3.k = iArrCopyOf;
                    } else {
                        bVar3.getClass();
                    }
                    b bVar4 = cVar.o;
                    l lVar = cVar.j;
                    bVar4.getClass();
                    synchronized (obj) {
                        bVar4.j = bVar4.j.e(lVar);
                        b bVar5 = cVar.o;
                        int[] iArr2 = cVar.k;
                        bVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = bVar5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                                iArr2 = iArrCopyOf2;
                            }
                            bVar5.k = iArr2;
                        }
                    }
                    cVar.m = true;
                    if (!cVar.p) {
                        cVar.p = true;
                        cVar.o.l();
                    }
                    return i.b;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
