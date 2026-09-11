package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements androidx.compose.ui.t {
    public final androidx.compose.runtime.d1 e = new androidx.compose.runtime.d1(1.0f);

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return com.google.android.material.resources.g.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.t
    public final float g() {
        return this.e.g();
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.i minusKey(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.i plus(kotlin.coroutines.i iVar) {
        return com.google.android.material.resources.g.k(iVar, this);
    }
}
