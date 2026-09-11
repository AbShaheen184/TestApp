package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlin.collections.e;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {
    public final c e;
    public final int y;
    public final int z;

    public a(c cVar, int i, int i2) {
        this.e = cVar;
        this.y = i;
        t1.g(i, i2, cVar.b());
        this.z = i2 - i;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        t1.e(i, this.z);
        return this.e.get(this.y + i);
    }

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i, int i2) {
        t1.g(i, i2, this.z);
        int i3 = this.y;
        return new a(this.e, i + i3, i3 + i2);
    }
}
