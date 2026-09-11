package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements w {
    public final /* synthetic */ kotlinx.serialization.a a;

    public y(kotlinx.serialization.a aVar) {
        this.a = aVar;
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.internal.w
    public final kotlinx.serialization.a[] c() {
        return new kotlinx.serialization.a[]{this.a};
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        throw new IllegalStateException("unsupported");
    }
}
