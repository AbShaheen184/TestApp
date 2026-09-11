package androidx.compose.runtime.internal;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b implements a0 {
    public static final j A = new j(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m.e, 0);

    public final j b(p1 p1Var, w2 w2Var) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVarU = this.e.u(p1Var.hashCode(), p1Var, w2Var, 0);
        return lVarU == null ? this : new j((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.m) lVarU.z, this.y + lVarU.y);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof p1) {
            return super.containsKey((p1) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof w2) {
            return super.containsValue((w2) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof p1) {
            return (w2) super.get((p1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p1) ? obj2 : (w2) super.getOrDefault((p1) obj, (w2) obj2);
    }
}
