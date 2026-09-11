package androidx.compose.foundation.lazy;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ a0(int i, int i2, int i3) {
        this.e = i3;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new z(this.y, this.z);
            default:
                return new androidx.compose.foundation.lazy.grid.x(this.y, this.z);
        }
    }
}
