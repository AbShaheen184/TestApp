package androidx.compose.ui.window;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new d(i, 0);
        A = new d(i, 1);
        B = new d(i, 2);
        C = new d(i, 3);
        D = new d(i, 4);
        E = new d(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.y;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
                ((androidx.compose.ui.semantics.x) obj).b(androidx.compose.ui.semantics.t.x, yVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
                ((androidx.compose.ui.semantics.x) obj).b(androidx.compose.ui.semantics.t.w, yVar);
                break;
            case 4:
                break;
            default:
                z zVar = (z) obj;
                if (zVar.isAttachedToWindow()) {
                    zVar.n();
                }
                break;
        }
        return yVar;
    }
}
