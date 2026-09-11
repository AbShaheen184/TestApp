package androidx.compose.foundation.layout;

import androidx.compose.foundation.text.i1;
import androidx.compose.foundation.text.k1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s0(ArrayList arrayList, androidx.compose.ui.layout.s0 s0Var, int i, ArrayList arrayList2) {
        this.e = 2;
        float f = androidx.compose.material3.j.a;
        this.z = arrayList;
        this.A = s0Var;
        this.y = i;
        this.B = arrayList2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1[] c1VarArr = (androidx.compose.ui.layout.c1[]) this.z;
                t0 t0Var = (t0) this.A;
                int[] iArr = (int[]) this.B;
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                int length = c1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    androidx.compose.ui.layout.c1 c1Var = c1VarArr[i];
                    int i3 = i2 + 1;
                    c1Var.getClass();
                    Object objK = c1Var.K();
                    q0 q0Var = objK instanceof q0 ? (q0) objK : null;
                    b bVar = q0Var != null ? q0Var.c : null;
                    int i4 = this.y;
                    androidx.compose.ui.layout.b1.i(b1Var, c1Var, iArr[i2], bVar != null ? bVar.f(i4, c1Var.y, androidx.compose.ui.unit.m.e) : t0Var.b.a(c1Var.y, i4));
                    i++;
                    i2 = i3;
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.foundation.text.i0 i0Var = (androidx.compose.foundation.text.i0) this.z;
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) this.A;
                androidx.compose.ui.layout.c1 c1Var2 = (androidx.compose.ui.layout.c1) this.B;
                androidx.compose.ui.layout.b1 b1Var2 = (androidx.compose.ui.layout.b1) obj;
                int i5 = i0Var.c;
                i1 i1Var = i0Var.b;
                androidx.compose.ui.text.input.e0 e0Var = i0Var.d;
                k1 k1Var = (k1) i0Var.e.invoke();
                i1Var.a(androidx.compose.foundation.gestures.k1.y, androidx.compose.foundation.text.n0.h(b1Var2, i5, e0Var, k1Var != null ? k1Var.a : null, s0Var.getLayoutDirection() == androidx.compose.ui.unit.m.y, c1Var2.e), this.y, c1Var2.e);
                androidx.compose.ui.layout.b1.l(b1Var2, c1Var2, Math.round(-i1Var.a.g()), 0);
                return kotlin.y.a;
            case 2:
                ArrayList arrayList = (ArrayList) this.z;
                androidx.compose.ui.layout.s0 s0Var2 = (androidx.compose.ui.layout.s0) this.A;
                float f = androidx.compose.material3.j.c;
                ArrayList arrayList2 = (ArrayList) this.B;
                androidx.compose.ui.layout.b1 b1Var3 = (androidx.compose.ui.layout.b1) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    List list = (List) arrayList.get(i6);
                    int size2 = list.size();
                    int[] iArr2 = new int[size2];
                    int i7 = 0;
                    while (i7 < size2) {
                        iArr2[i7] = ((androidx.compose.ui.layout.c1) list.get(i7)).e + (i7 < list.size() + (-1) ? s0Var2.g0(f) : 0);
                        i7++;
                    }
                    int[] iArr3 = new int[size2];
                    h.b.c(s0Var2, this.y, iArr2, s0Var2.getLayoutDirection(), iArr3);
                    int size3 = list.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        androidx.compose.ui.layout.b1.i(b1Var3, (androidx.compose.ui.layout.c1) list.get(i8), iArr3[i8], ((Number) arrayList2.get(i6)).intValue());
                    }
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.e0 e0Var2 = (androidx.compose.runtime.e0) this.z;
                androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) this.A;
                androidx.collection.f0 f0Var = (androidx.collection.f0) this.B;
                if (obj == e0Var2) {
                    net.luminis.tls.engine.impl.c.r("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof androidx.compose.runtime.snapshots.w) {
                    int i9 = gVar.a - this.y;
                    int iD = f0Var.d(obj);
                    f0Var.g(Math.min(i9, iD >= 0 ? f0Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ s0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.y = i;
    }

    public /* synthetic */ s0(androidx.compose.ui.layout.c1[] c1VarArr, t0 t0Var, int i, int[] iArr) {
        this.e = 0;
        this.z = c1VarArr;
        this.A = t0Var;
        this.y = i;
        this.B = iArr;
    }
}
