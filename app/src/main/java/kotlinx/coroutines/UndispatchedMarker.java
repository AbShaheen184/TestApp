package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class UndispatchedMarker implements g, h {
    public static final UndispatchedMarker INSTANCE = new UndispatchedMarker();

    private UndispatchedMarker() {
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r, p pVar) {
        return (R) com.google.android.material.resources.g.d(this, r, pVar);
    }

    @Override // kotlin.coroutines.i
    public <E extends g> E get(h hVar) {
        return (E) com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public i minusKey(h hVar) {
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public i plus(i iVar) {
        return com.google.android.material.resources.g.k(iVar, this);
    }

    @Override // kotlin.coroutines.g
    public h getKey() {
        return this;
    }
}
