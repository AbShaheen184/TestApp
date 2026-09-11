package androidx.compose.ui.scrollcapture;

import kotlin.jvm.functions.l;
import kotlin.jvm.internal.m;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements l {
    public static final b A;
    public static final b B;
    public static final b z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new b(i, 0);
        A = new b(i, 1);
        B = new b(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                ((Number) obj).longValue();
                return y.a;
            case 1:
                return Integer.valueOf(((j) obj).b);
            default:
                return Integer.valueOf(((j) obj).c.b());
        }
    }
}
