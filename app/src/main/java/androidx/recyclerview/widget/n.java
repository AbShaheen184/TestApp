package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {
    public static final ThreadLocal B = new ThreadLocal();
    public static final androidx.constraintlayout.core.e C = new androidx.constraintlayout.core.e(2);
    public ArrayList A;
    public ArrayList e;
    public long y;
    public long z;

    public static p0 c(RecyclerView recyclerView, int i, long j) {
        int iJ = recyclerView.C.J();
        for (int i2 = 0; i2 < iJ; i2++) {
            p0 p0VarG = RecyclerView.G(recyclerView.C.I(i2));
            if (p0VarG.c == i && !p0VarG.f()) {
                return null;
            }
        }
        i0 i0Var = recyclerView.z;
        try {
            recyclerView.M();
            p0 p0VarL = i0Var.l(i, j);
            if (p0VarL != null) {
                if (!p0VarL.e() || p0VarL.f()) {
                    i0Var.a(p0VarL, false);
                } else {
                    i0Var.i(p0VarL.a);
                }
            }
            return p0VarL;
        } finally {
            recyclerView.N(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.O && this.y == 0) {
            this.y = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        androidx.media3.common.util.e eVar = recyclerView.z0;
        eVar.a = i;
        eVar.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cb  */
    public final void b(long j) {
        m mVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        m mVar2;
        ArrayList arrayList = this.A;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            androidx.media3.common.util.e eVar = recyclerView3.z0;
            if (windowVisibility == 0) {
                eVar.c(recyclerView3, false);
                i += eVar.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                androidx.media3.common.util.e eVar2 = recyclerView4.z0;
                int iAbs = Math.abs(eVar2.b) + Math.abs(eVar2.a);
                for (int i5 = 0; i5 < eVar2.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        mVar2 = new m();
                        arrayList.add(mVar2);
                    } else {
                        mVar2 = (m) arrayList.get(i3);
                    }
                    int[] iArr = eVar2.c;
                    int i6 = iArr[i5 + 1];
                    mVar2.a = i6 <= iAbs;
                    mVar2.b = iAbs;
                    mVar2.c = i6;
                    mVar2.d = recyclerView4;
                    mVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, C);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (mVar = (m) arrayList.get(i7)).d) != null; i7++) {
            p0 p0VarC = c(recyclerView, mVar.e, mVar.a ? Long.MAX_VALUE : j);
            if (p0VarC != null && p0VarC.b != null && p0VarC.e() && !p0VarC.f() && (recyclerView2 = (RecyclerView) p0VarC.b.get()) != null) {
                if (recyclerView2.a0 && recyclerView2.C.J() != 0) {
                    i0 i0Var = recyclerView2.z;
                    z zVar = recyclerView2.j0;
                    if (zVar != null) {
                        zVar.e();
                    }
                    c0 c0Var = recyclerView2.J;
                    if (c0Var != null) {
                        c0Var.h0(i0Var);
                        recyclerView2.J.i0(i0Var);
                    }
                    i0Var.a.clear();
                    i0Var.g();
                }
                androidx.media3.common.util.e eVar3 = recyclerView2.z0;
                eVar3.c(recyclerView2, true);
                if (eVar3.d != 0) {
                    try {
                        int i8 = androidx.core.os.e.a;
                        Trace.beginSection("RV Nested Prefetch");
                        l0 l0Var = recyclerView2.A0;
                        v vVar = recyclerView2.I;
                        l0Var.d = 1;
                        l0Var.e = vVar.a();
                        l0Var.g = false;
                        l0Var.h = false;
                        l0Var.i = false;
                        for (int i9 = 0; i9 < eVar3.d * 2; i9 += 2) {
                            c(recyclerView2, eVar3.c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = androidx.core.os.e.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            mVar.a = false;
            mVar.b = 0;
            mVar.c = 0;
            mVar.d = null;
            mVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.e;
        try {
            int i = androidx.core.os.e.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.z);
                }
            }
            this.y = 0L;
        } finally {
            this.y = 0L;
            int i3 = androidx.core.os.e.a;
            Trace.endSection();
        }
    }
}
