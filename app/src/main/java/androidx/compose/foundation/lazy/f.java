package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.k1;
import androidx.compose.foundation.lazy.layout.q0;
import androidx.compose.foundation.lazy.layout.u0;
import androidx.compose.runtime.e0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements q0 {
    public final e0 a;
    public final /* synthetic */ z b;
    public final /* synthetic */ boolean c;

    public f(z zVar, boolean z) {
        this.b = zVar;
        this.c = z;
        this.a = androidx.compose.runtime.s.k(new e(zVar, 0));
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int a() {
        z zVar = this.b;
        return (int) (zVar.i().o == k1.e ? zVar.i().g() & 4294967295L : zVar.i().g() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float b() {
        z zVar = this.b;
        return (zVar.g() * 500) + zVar.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final int c() {
        z zVar = this.b;
        return (-zVar.i().l) + zVar.i().p;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final float d() {
        z zVar = this.b;
        int iG = zVar.g();
        int iH = zVar.h();
        return zVar.d() ? (iG * 500) + iH + 100 : (iG * 500) + iH;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final Object e(int i, u0 u0Var) {
        Object objK = z.k(this.b, i, u0Var);
        return objK == kotlin.coroutines.intrinsics.a.e ? objK : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.q0
    public final androidx.compose.ui.semantics.c f() {
        boolean z = this.c;
        e0 e0Var = this.a;
        return z ? new androidx.compose.ui.semantics.c(((Number) e0Var.getValue()).intValue(), 1) : new androidx.compose.ui.semantics.c(1, ((Number) e0Var.getValue()).intValue());
    }
}
