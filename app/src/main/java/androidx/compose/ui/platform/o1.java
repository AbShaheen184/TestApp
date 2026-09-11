package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.savedstate.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(boolean z, androidx.savedstate.e eVar, String str) {
        super(0);
        this.y = z;
        this.z = eVar;
        this.A = str;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        if (this.y) {
            androidx.savedstate.e eVar = this.z;
            String str = this.A;
            androidx.savedstate.internal.a aVar = eVar.a;
            synchronized (aVar.c) {
            }
        }
        return kotlin.y.a;
    }
}
