package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ m2 A;
    public final /* synthetic */ a y;
    public final /* synthetic */ androidx.appcompat.view.menu.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(a aVar, androidx.appcompat.view.menu.d dVar, m2 m2Var) {
        super(0);
        this.y = aVar;
        this.z = dVar;
        this.A = m2Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        androidx.appcompat.view.menu.d dVar = this.z;
        a aVar = this.y;
        aVar.removeOnAttachStateChangeListener(dVar);
        androidx.datastore.preferences.protobuf.h1.p(aVar).a.remove(this.A);
        return kotlin.y.a;
    }
}
