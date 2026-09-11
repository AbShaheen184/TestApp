package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements kotlin.coroutines.g {
    public final kotlin.coroutines.h e;
    public final c0 y;

    public a(kotlin.coroutines.h hVar, c0 c0Var) {
        c0Var.getClass();
        this.e = hVar;
        this.y = c0Var;
    }

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return com.google.android.material.resources.g.d(this, obj, pVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.g
    public final kotlin.coroutines.h getKey() {
        return this.e;
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
