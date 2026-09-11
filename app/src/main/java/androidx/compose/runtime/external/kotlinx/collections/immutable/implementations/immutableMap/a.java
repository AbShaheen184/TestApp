package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.collection.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends v implements kotlin.jvm.internal.markers.c {
    public final f A;
    public Object B;

    public a(f fVar, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.A = fVar;
        this.B = obj2;
    }

    @Override // androidx.collection.v, java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // androidx.collection.v, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.B;
        this.B = obj;
        d dVar = (d) this.A.y;
        androidx.compose.runtime.internal.i iVar = dVar.A;
        Object obj3 = this.y;
        if (!iVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z = dVar.z;
        if (!z) {
            iVar.put(obj3, obj);
        } else {
            if (!z) {
                org.mozilla.javascript.typedarrays.c.a();
                return null;
            }
            n nVar = dVar.e[dVar.y];
            Object obj4 = nVar.e[nVar.z];
            iVar.put(obj3, obj);
            dVar.d(obj4 != null ? obj4.hashCode() : 0, iVar.y, obj4, 0);
        }
        dVar.D = iVar.A;
        return obj2;
    }
}
