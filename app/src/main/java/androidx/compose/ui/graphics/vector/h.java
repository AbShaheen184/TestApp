package androidx.compose.ui.graphics.vector;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public static final h A;
    public static final h z;
    public final /* synthetic */ int y;

    static {
        int i = 0;
        z = new h(i, 0);
        A = new h(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.y) {
            case 0:
                return new androidx.compose.ui.graphics.k(new PathMeasure());
            default:
                return kotlin.y.a;
        }
    }
}
