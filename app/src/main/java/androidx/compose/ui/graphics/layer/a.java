package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.t;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public static final a A;
    public static final a z;
    public final /* synthetic */ int y;

    static {
        int i = 1;
        z = new a(i, 0);
        A = new a(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                break;
            default:
                androidx.compose.ui.graphics.drawscope.d.p0((androidx.compose.ui.graphics.drawscope.d) obj, t.h, 0L, 0L, Token.ELSE);
                break;
        }
        return y.a;
    }
}
