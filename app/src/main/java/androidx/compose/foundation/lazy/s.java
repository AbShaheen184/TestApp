package androidx.compose.foundation.lazy;

import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.b1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ ArrayList z;

    public /* synthetic */ s(y0 y0Var, ArrayList arrayList, List list, boolean z, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = arrayList;
        this.A = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        switch (this.e) {
            case 0:
                b1Var.e = true;
                ArrayList arrayList = this.z;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((u) arrayList.get(i)).j(b1Var);
                }
                ?? r0 = this.A;
                int size2 = r0.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((u) r0.get(i2)).j(b1Var);
                }
                b1Var.e = false;
                this.y.getValue();
                break;
            default:
                b1Var.e = true;
                ArrayList arrayList2 = this.z;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((androidx.compose.foundation.lazy.grid.o) arrayList2.get(i3)).j(b1Var);
                }
                ?? r1 = this.A;
                int size4 = r1.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((androidx.compose.foundation.lazy.grid.o) r1.get(i4)).j(b1Var);
                }
                b1Var.e = false;
                this.y.getValue();
                break;
        }
        return kotlin.y.a;
    }
}
