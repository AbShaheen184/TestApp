package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final /* synthetic */ androidx.collection.f a;
    public final /* synthetic */ p b;

    public o(p pVar, androidx.collection.f fVar) {
        this.b = pVar;
        this.a = fVar;
    }

    @Override // androidx.transition.j
    public final void d(m mVar) {
        ((ArrayList) this.a.get(this.b.y)).remove(mVar);
        mVar.x(this);
    }
}
