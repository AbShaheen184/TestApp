package androidx.compose.runtime.internal;

import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.y;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static final m b = new m(0, new long[0], new Object[0]);

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final f c(int i, kotlin.d dVar, r rVar) {
        Object objQ = rVar.Q();
        if (objQ == androidx.compose.runtime.m.a) {
            objQ = new f(i, true, dVar);
            rVar.l0(objQ);
        }
        f fVar = (f) objQ;
        if (!fVar.z.equals(dVar)) {
            fVar.z = dVar;
            if (fVar.y) {
                q1 q1Var = fVar.A;
                if (q1Var != null) {
                    y yVar = q1Var.a;
                    if (yVar != null) {
                        yVar.s(q1Var, null);
                    }
                    fVar.A = null;
                }
                ArrayList arrayList = fVar.B;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        q1 q1Var2 = (q1) arrayList.get(i2);
                        y yVar2 = q1Var2.a;
                        if (yVar2 != null) {
                            yVar2.s(q1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return fVar;
    }

    public static final boolean d(q1 q1Var, q1 q1Var2) {
        return q1Var == null || !q1Var.a() || q1Var.equals(q1Var2) || kotlin.jvm.internal.l.a(q1Var.c, q1Var2.c);
    }
}
