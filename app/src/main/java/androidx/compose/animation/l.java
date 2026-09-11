package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public static final l A;
    public static final l z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new l(i, 0);
        A = new l(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                long j = ((androidx.compose.ui.unit.l) obj).a;
                long j2 = ((androidx.compose.ui.unit.l) obj2).a;
                long j3 = 1;
                return androidx.compose.animation.core.e.m(0.0f, 400.0f, new androidx.compose.ui.unit.l((j3 & 4294967295L) | (j3 << 32)), 1);
            default:
                m0 m0Var = (m0) obj2;
                return Boolean.valueOf(((m0) obj) == m0Var && m0Var == m0.z);
        }
    }
}
