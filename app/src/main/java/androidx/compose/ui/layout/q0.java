package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface q0 {
    r0 a(s0 s0Var, List list, long j);

    default int b(s sVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new k((p0) list.get(i2), t.y, u.e, 0));
        }
        return a(new w(sVar, sVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    default int e(s sVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new k((p0) list.get(i2), t.e, u.y, 0));
        }
        return a(new w(sVar, sVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }

    default int g(s sVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new k((p0) list.get(i2), t.e, u.e, 0));
        }
        return a(new w(sVar, sVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.b.b(0, i, 7)).b();
    }

    default int h(s sVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new k((p0) list.get(i2), t.y, u.y, 0));
        }
        return a(new w(sVar, sVar.getLayoutDirection()), arrayList, androidx.compose.ui.unit.b.b(i, 0, 13)).a();
    }
}
