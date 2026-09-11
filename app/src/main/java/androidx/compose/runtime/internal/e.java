package androidx.compose.runtime.internal;

import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.ui.focus.y;
import com.app.mlounge.ui.screens.player.i0;
import com.app.mlounge.ui.screens.player.o0;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
        this.E = obj6;
        this.F = obj7;
        this.G = obj8;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                ((f) this.z).k(this.A, this.B, this.C, this.D, this.E, this.F, this.G, (r) obj, s.A(this.y) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                i0.k((String) this.z, (o0) this.A, (y) this.B, (kotlin.jvm.functions.a) this.C, (kotlin.jvm.functions.a) this.D, (kotlin.jvm.functions.l) this.E, (kotlin.jvm.functions.a) this.F, (kotlin.jvm.functions.l) this.G, (r) obj, s.A(this.y | 1));
                break;
        }
        return kotlin.y.a;
    }
}
