package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    public g(kotlin.coroutines.d dVar) {
        super(dVar);
        if (dVar == null || dVar.getContext() == j.e) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.i getContext() {
        return j.e;
    }
}
