package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements kotlinx.serialization.a {
    public final kotlinx.serialization.a a;
    public final u0 b;

    public k0(kotlinx.serialization.a aVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = new u0(aVar.d());
    }

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        if (bVar.r()) {
            return bVar.p(this.a);
        }
        return null;
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        if (obj != null) {
            nVar.p(this.a, obj);
        } else {
            nVar.m();
        }
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k0.class == obj.getClass() && kotlin.jvm.internal.l.a(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
