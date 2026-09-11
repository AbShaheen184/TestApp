package androidx.compose.foundation.text.selection;

import com.app.mlounge.ui.viewmodel.z1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b0(int i, androidx.compose.runtime.e1 e1Var) {
        this.e = 1;
        this.y = i;
        this.z = e1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf(((androidx.compose.ui.text.j0) ((w) this.z).e).b.d(this.y));
            case 1:
                ((androidx.compose.runtime.e1) this.z).h(this.y);
                return kotlin.y.a;
            case 2:
                com.app.mlounge.ui.viewmodel.i0 i0Var = (com.app.mlounge.ui.viewmodel.i0) this.z;
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(i0Var), null, null, new com.app.mlounge.ui.screens.player.s0(i0Var, this.y, (kotlin.coroutines.d) null, 2), 3, null);
                return kotlin.y.a;
            default:
                z1 z1Var = (z1) this.z;
                z1Var.j.h(this.y);
                return kotlin.y.a;
        }
    }

    public /* synthetic */ b0(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }
}
