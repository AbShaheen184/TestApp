package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements y0, CoroutineScope {
    public final /* synthetic */ y0 e;
    public final kotlin.coroutines.i y;

    public o1(y0 y0Var, kotlin.coroutines.i iVar) {
        this.e = y0Var;
        this.y = iVar;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.i getCoroutineContext() {
        return this.y;
    }

    @Override // androidx.compose.runtime.t2
    public final Object getValue() {
        return this.e.getValue();
    }

    @Override // androidx.compose.runtime.y0
    public final void setValue(Object obj) {
        this.e.setValue(obj);
    }
}
