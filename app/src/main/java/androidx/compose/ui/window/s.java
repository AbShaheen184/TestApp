package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final s A;
    public static final s z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new s(i, 0);
        A = new s(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
