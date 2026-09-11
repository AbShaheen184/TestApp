package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.t2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ t2 y;

    public /* synthetic */ k0(t2 t2Var, int i) {
        this.e = i;
        this.y = t2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.e;
        t2 t2Var = this.y;
        switch (i) {
            case 0:
                return new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) t2Var.getValue()).a);
            case 1:
                androidx.compose.animation.core.p pVar = m0.a;
                return new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) t2Var.getValue()).a);
            case 2:
                return Boolean.valueOf(((Number) t2Var.getValue()).floatValue() > 0.0f);
            case 3:
                return Boolean.valueOf(((Number) t2Var.getValue()).floatValue() > 0.0f);
            case 4:
                List list = (List) t2Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.l.a(((androidx.navigation.i) obj).y.e, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return Float.valueOf(((Number) t2Var.getValue()).floatValue());
        }
    }
}
