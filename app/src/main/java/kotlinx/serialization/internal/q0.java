package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends e0 {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlinx.serialization.descriptors.e eVar) {
        super(eVar);
        eVar.getClass();
        this.b = eVar.a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return this.b;
    }
}
