package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.t {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        switch (this.e) {
            case 0:
                p.c((c0) this.y, (p) this.z, vVar, nVar);
                break;
            default:
                androidx.core.view.m mVar = (androidx.core.view.m) this.y;
                androidx.core.view.n nVar2 = (androidx.core.view.n) this.z;
                mVar.getClass();
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    mVar.b(nVar2);
                }
                break;
        }
    }
}
