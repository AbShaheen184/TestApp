package androidx.compose.runtime;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ o1 y;

    public /* synthetic */ p2(o1 o1Var, int i) {
        this.e = i;
        this.y = o1Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                this.y.setValue(obj);
                break;
            default:
                this.y.setValue(obj);
                break;
        }
        return kotlin.y.a;
    }
}
