package androidx.room.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements kotlin.coroutines.g {
    public static final com.google.firebase.heartbeatinfo.e y = new com.google.firebase.heartbeatinfo.e();
    public final q e;

    public r(q qVar) {
        this.e = qVar;
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
        return y;
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
