package kotlin.coroutines;

import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {
    private final h key;

    public a(h hVar) {
        hVar.getClass();
        this.key = hVar;
    }

    @Override // kotlin.coroutines.i
    public /* bridge */ <R> R fold(R r, p pVar) {
        return (R) com.google.android.material.resources.g.d(this, r, pVar);
    }

    @Override // kotlin.coroutines.i
    public /* bridge */ <E extends g> E get(h hVar) {
        return (E) com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.g
    public h getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.i
    public /* bridge */ i minusKey(h hVar) {
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public /* bridge */ i plus(i iVar) {
        return com.google.android.material.resources.g.k(iVar, this);
    }
}
