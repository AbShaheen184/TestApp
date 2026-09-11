package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements kotlinx.serialization.a {
    public static final j0 a = new j0();
    public static final i0 b = i0.a;

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        throw new kotlinx.serialization.d("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        ((Void) obj).getClass();
        throw new kotlinx.serialization.d("'kotlin.Nothing' cannot be serialized");
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
