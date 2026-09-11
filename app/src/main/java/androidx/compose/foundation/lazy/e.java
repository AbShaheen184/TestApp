package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ z y;

    public /* synthetic */ e(z zVar, int i) {
        this.e = i;
        this.y = zVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf(this.y.i().n);
            case 1:
                z zVar = this.y;
                return new kotlin.k(Integer.valueOf(zVar.g()), Integer.valueOf(zVar.h()));
            default:
                z zVar2 = this.y;
                return new kotlin.k(Integer.valueOf(zVar2.g()), Integer.valueOf(zVar2.h()));
        }
    }
}
