package androidx.compose.runtime.internal;

import androidx.compose.runtime.a2;
import androidx.compose.runtime.z1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements z1 {
    public final Set e;
    public final androidx.compose.runtime.collection.b y = new androidx.compose.runtime.collection.b(new a2[16]);

    public h(Set set) {
        this.e = set;
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
        androidx.compose.runtime.collection.b bVar = this.y;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            z1 z1Var = ((a2) objArr[i2]).a;
            this.e.remove(z1Var);
            z1Var.c();
        }
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
    }
}
