package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.collections.i {
    public final /* synthetic */ int e;
    public final b y;

    public /* synthetic */ i(b bVar, int i) {
        this.e = i;
        this.y = bVar;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.e) {
            case 0:
                b bVar = this.y;
                bVar.getClass();
                return bVar.y;
            default:
                b bVar2 = this.y;
                bVar2.getClass();
                return bVar2.y;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                b bVar = this.y;
                Object obj2 = bVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && bVar.containsKey(entry.getKey());
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                m mVar = this.y.e;
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(0);
                }
                return new j(mVar, nVarArr);
            default:
                m mVar2 = this.y.e;
                n[] nVarArr2 = new n[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    nVarArr2[i2] = new o(1);
                }
                return new j(mVar2, nVarArr2);
        }
    }
}
