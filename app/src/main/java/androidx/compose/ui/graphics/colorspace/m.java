package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ m(q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.i
    public final double a(double d) {
        switch (this.a) {
            case 0:
                q qVar = this.b;
                return com.google.android.material.resources.c.a(qVar.k.a(d), qVar.e, qVar.f);
            default:
                q qVar2 = this.b;
                return qVar2.n.a(com.google.android.material.resources.c.a(d, qVar2.e, qVar2.f));
        }
    }
}
