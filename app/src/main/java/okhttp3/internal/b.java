package okhttp3.internal;

import com.app.mlounge.ui.screens.player.j0;
import com.google.android.material.shape.k;
import kotlin.collections.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k {
    public final kotlin.jvm.internal.e b;
    public final Object c;
    public final k d;

    public b(kotlin.jvm.internal.e eVar, Object obj, k kVar) {
        obj.getClass();
        kVar.getClass();
        this.b = eVar;
        this.c = obj;
        this.d = kVar;
    }

    @Override // com.google.android.material.shape.k
    public final Object J(kotlin.jvm.internal.e eVar) {
        if (!eVar.equals(this.b)) {
            return this.d.J(eVar);
        }
        Class clsA = eVar.a();
        clsA.getClass();
        return clsA.cast(this.c);
    }

    @Override // com.google.android.material.shape.k
    public final k K(kotlin.jvm.internal.e eVar, Object obj) {
        kotlin.jvm.internal.e eVar2 = this.b;
        boolean zEquals = eVar.equals(eVar2);
        k bVar = this.d;
        if (!zEquals) {
            k kVarK = bVar.K(eVar, null);
            bVar = kVarK == bVar ? this : new b(eVar2, this.c, kVarK);
        }
        return obj != null ? new b(eVar, obj, bVar) : bVar;
    }

    public final String toString() {
        return o.R(o.d0(kotlin.sequences.k.r(kotlin.sequences.k.o(this, new j0(27)))), null, "{", "}", new j0(28), 25);
    }
}
