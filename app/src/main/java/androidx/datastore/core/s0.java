package androidx.datastore.core;

import java.util.LinkedHashMap;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements DisposableHandle {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.e) {
            case 0:
                String str = (String) this.y;
                t0 t0Var = (t0) this.z;
                synchronized (u0.b) {
                    LinkedHashMap linkedHashMap = u0.c;
                    u0 u0Var = (u0) linkedHashMap.get(str);
                    if (u0Var != null) {
                        u0Var.a.remove(t0Var);
                        if (u0Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            u0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                HandlerContext.invokeOnTimeout$lambda$3((HandlerContext) this.y, (Runnable) this.z);
                return;
        }
    }
}
