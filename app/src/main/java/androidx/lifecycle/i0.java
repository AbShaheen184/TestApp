package androidx.lifecycle;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public final LinkedHashMap a;
    public final androidx.compose.runtime.internal.c b;

    public i0() {
        this.a = new LinkedHashMap();
        this.b = new androidx.compose.runtime.internal.c(kotlin.collections.v.e);
    }

    public final Object a(String str) {
        Object value;
        androidx.compose.runtime.internal.c cVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.A;
        try {
            MutableStateFlow mutableStateFlow = (MutableStateFlow) linkedHashMap2.get(str);
            if (mutableStateFlow != null && (value = mutableStateFlow.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) cVar.z).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public i0(kotlin.collections.builders.e eVar) {
        this.a = new LinkedHashMap();
        this.b = new androidx.compose.runtime.internal.c(eVar);
    }
}
