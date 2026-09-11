package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements kotlinx.serialization.a {
    public final Object a = kotlin.a.c(kotlin.i.e, new kotlinx.coroutines.debug.internal.b(this));

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        kotlinx.serialization.descriptors.e eVarD = d();
        kotlinx.serialization.encoding.a aVarN = bVar.n(eVarD);
        int iS = aVarN.s(d());
        if (iS != -1) {
            throw new kotlinx.serialization.d(androidx.privacysandbox.ads.adservices.java.internal.a.l(iS, "Unexpected index "));
        }
        aVarN.h(eVarD);
        return kotlin.y.a;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        obj.getClass();
        nVar.a(d()).s(d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return (kotlinx.serialization.descriptors.e) this.a.getValue();
    }
}
