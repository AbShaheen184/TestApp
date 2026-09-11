package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements kotlin.coroutines.g {
    public final l1 e;
    public final z y;

    public l1(l1 l1Var, z zVar) {
        this.e = l1Var;
        this.y = zVar;
    }

    public final void a(z zVar) {
        if (this.y == zVar) {
            net.luminis.tls.engine.impl.c.r("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        l1 l1Var = this.e;
        if (l1Var != null) {
            l1Var.a(zVar);
        }
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return com.google.android.material.resources.g.d(this, obj, pVar);
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.g
    public final kotlin.coroutines.h getKey() {
        return k1.e;
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i minusKey(kotlin.coroutines.h hVar) {
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i plus(kotlin.coroutines.i iVar) {
        return com.google.android.material.resources.g.k(iVar, this);
    }
}
