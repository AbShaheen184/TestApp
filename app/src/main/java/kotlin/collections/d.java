package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements RandomAccess {
    public final e e;
    public final int y;
    public final int z;

    public d(e eVar, int i, int i2) {
        this.e = eVar;
        this.y = i;
        com.google.android.material.textfield.p.d(i, i2, eVar.b());
        this.z = i2 - i;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.z;
        if (i < 0 || i >= i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return null;
        }
        return this.e.get(this.y + i);
    }

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i, int i2) {
        com.google.android.material.textfield.p.d(i, i2, this.z);
        int i3 = this.y;
        return new d(this.e, i + i3, i3 + i2);
    }
}
