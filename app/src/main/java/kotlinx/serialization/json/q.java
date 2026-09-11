package kotlinx.serialization.json;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements kotlinx.serialization.a {
    public static final q a = new q();
    public static final kotlinx.serialization.descriptors.f b = com.google.android.material.resources.g.a("kotlinx.serialization.json.JsonNull", kotlinx.serialization.descriptors.g.z, new kotlinx.serialization.descriptors.e[0]);

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        com.google.android.material.sidesheet.b.d(bVar);
        if (bVar.r()) {
            throw new kotlinx.serialization.json.internal.g("Expected 'null' literal");
        }
        return p.INSTANCE;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        ((p) obj).getClass();
        com.google.android.material.sidesheet.b.b(nVar);
        nVar.m();
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
