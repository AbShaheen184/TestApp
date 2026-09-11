package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final e2 A;
    public static final e2 z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new e2(i, 0);
        A = new e2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.y) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
