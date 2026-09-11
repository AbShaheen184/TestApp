package androidx.lifecycle;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ e(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        switch (this.e) {
            case 0:
                new HashMap();
                i[] iVarArr = (i[]) this.y;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            default:
                if (nVar != n.ON_CREATE) {
                    net.luminis.tls.engine.impl.c.e(nVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    vVar.getLifecycle().b(this);
                    ((m0) this.y).b();
                    return;
                }
        }
    }
}
