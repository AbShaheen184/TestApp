package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements kotlin.jvm.functions.a {
    public final /* synthetic */ m1 e;

    public l1(m1 m1Var) {
        this.e = m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.collection.j0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.s0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.collection.j0] */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        ArrayList arrayList = this.e.a;
        androidx.collection.o0 o0Var = new androidx.collection.o0(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r5 = (s0) arrayList.get(i);
            Object obj = r5.b;
            int i2 = r5.a;
            Object r0Var = obj != null ? new r0(Integer.valueOf(i2), r5.b) : Integer.valueOf(i2);
            int iF = o0Var.f(r0Var);
            boolean z = iF < 0;
            Object obj2 = z ? null : o0Var.c[iF];
            if (obj2 != null) {
                if (obj2 instanceof androidx.collection.j0) {
                    ?? r9 = (androidx.collection.j0) obj2;
                    r9.a(r5);
                    r5 = r9;
                } else {
                    Object[] objArr = androidx.collection.u0.a;
                    ?? j0Var = new androidx.collection.j0(2);
                    j0Var.a(obj2);
                    j0Var.a(r5);
                    r5 = j0Var;
                }
            }
            if (z) {
                int i3 = ~iF;
                o0Var.b[i3] = r0Var;
                o0Var.c[i3] = r5;
            } else {
                o0Var.c[iF] = r5;
            }
        }
        return new androidx.compose.runtime.collection.a(o0Var);
    }
}
