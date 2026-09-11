package androidx.navigation.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.navigation.u {
    public final i f;
    public final androidx.compose.runtime.internal.f g;

    public j(i iVar, String str, androidx.compose.runtime.internal.f fVar) {
        super(iVar, str);
        this.f = iVar;
        this.g = fVar;
    }

    @Override // androidx.navigation.u
    public final androidx.navigation.t a() {
        return (h) super.a();
    }

    @Override // androidx.navigation.u
    public final androidx.navigation.t b() {
        return new h(this.f, this.g);
    }
}
