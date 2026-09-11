package androidx.compose.foundation.lazy.layout;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.compose.ui.node.w0 {
    public e b;
    public CompletableDeferred c;

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new e(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.w0
    public final /* bridge */ /* synthetic */ void f(androidx.compose.ui.q qVar) {
    }

    public final Object g(kotlin.coroutines.jvm.internal.c cVar) {
        CompletableDeferred completableDeferredCompletableDeferred$default = this.c;
        if (completableDeferredCompletableDeferred$default == null) {
            completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.c = completableDeferredCompletableDeferred$default;
            e eVar = this.b;
            if (eVar != null && eVar.K) {
                eVar.L0();
            }
        }
        Object objAwait = completableDeferredCompletableDeferred$default.await(cVar);
        return objAwait == kotlin.coroutines.intrinsics.a.e ? objAwait : kotlin.y.a;
    }

    public final int hashCode() {
        return 234;
    }
}
