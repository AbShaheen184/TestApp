package coil3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;

    public /* synthetic */ l(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Dispatchers.getMain().getImmediate();
            case 1:
                return (coil3.disk.g) coil3.disk.h.a.getValue();
            case 2:
                List listF0 = kotlin.collections.o.f0((List) coil3.util.j.a.getValue(), new androidx.constraintlayout.core.e(7));
                ArrayList arrayList = new ArrayList();
                int size = listF0.size();
                for (int i = 0; i < size; i++) {
                    ((coil3.network.okhttp.internal.f) listF0.get(i)).getClass();
                    arrayList.add(new kotlin.k(new coil3.network.j(new androidx.compose.runtime.saveable.f(19)), a0.a(w.class)));
                }
                return arrayList;
            default:
                List listF1 = kotlin.collections.o.f0((List) coil3.util.j.b.getValue(), new androidx.constraintlayout.core.e(8));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listF1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((coil3.svg.internal.a) listF1.get(i2)).getClass();
                    arrayList2.add(new coil3.svg.e());
                }
                return arrayList2;
        }
    }
}
