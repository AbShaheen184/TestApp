package androidx.activity.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends androidx.activity.result.c {
    public final a a;

    public t(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) throws Exception {
        androidx.activity.result.g gVar = this.a.a;
        if (gVar != null) {
            gVar.a(obj);
        } else {
            net.luminis.tls.engine.impl.c.r("Launcher has not been initialized");
        }
    }
}
