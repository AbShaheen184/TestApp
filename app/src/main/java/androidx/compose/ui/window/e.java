package androidx.compose.ui.window;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final e A;
    public static final e B;
    public static final e C;
    public static final e z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new e(i, 0);
        A = new e(i, 1);
        B = new e(i, 2);
        C = new e(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
