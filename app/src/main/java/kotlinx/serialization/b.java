package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final List e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, ArrayList arrayList) {
        String strL;
        str.getClass();
        if (arrayList.size() == 1) {
            strL = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.l(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            strL = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(strL, null);
        this.e = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, String str, b bVar) {
        super(str, bVar);
        list.getClass();
        this.e = list;
    }
}
