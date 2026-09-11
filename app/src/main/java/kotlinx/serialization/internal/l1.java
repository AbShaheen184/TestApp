package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements kotlinx.serialization.a {
    public static final l1 b = new l1();
    public final /* synthetic */ l0 a = new l0();

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        this.a.a(bVar);
        return kotlin.y.a;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        kotlin.y yVar = (kotlin.y) obj;
        yVar.getClass();
        this.a.b(nVar, yVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return this.a.d();
    }
}
