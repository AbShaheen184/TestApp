package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.y1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements y1 {
    public final e2 a;
    public androidx.compose.ui.e b;
    public final androidx.compose.runtime.h1 c = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.l(0));
    public final androidx.collection.o0 d;

    public v(e2 e2Var, androidx.compose.ui.e eVar) {
        this.a = e2Var;
        this.b = eVar;
        long[] jArr = androidx.collection.w0.a;
        this.d = new androidx.collection.o0();
    }

    @Override // androidx.compose.animation.core.y1
    public final Object b() {
        return this.a.f().b();
    }

    @Override // androidx.compose.animation.core.y1
    public final Object c() {
        return this.a.f().c();
    }
}
