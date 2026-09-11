package androidx.compose.ui.viewinterop;

import android.view.WindowInsets;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.m1;
import androidx.core.view.s0;
import androidx.core.view.z1;
import java.util.HashMap;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ f0 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(v vVar, f0 f0Var, int i) {
        super(1);
        this.y = i;
        this.z = vVar;
        this.A = f0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsC;
        switch (this.y) {
            case 0:
                m1 m1Var = (m1) obj;
                androidx.compose.ui.platform.u uVar = m1Var instanceof androidx.compose.ui.platform.u ? (androidx.compose.ui.platform.u) m1Var : null;
                v vVar = this.z;
                if (uVar != null) {
                    HashMap<h, f0> holderToLayoutNode = uVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    f0 f0Var = this.A;
                    holderToLayoutNode.put(vVar, f0Var);
                    uVar.getAndroidViewsHandler$ui().addView(vVar);
                    uVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(f0Var, vVar);
                    vVar.setImportantForAccessibility(1);
                    s0.m(vVar, new androidx.compose.ui.platform.m(uVar, f0Var, uVar));
                }
                if (vVar.getView().getParent() != vVar) {
                    vVar.addView(vVar.getView());
                }
                break;
            case 1:
                i.d(this.z, this.A);
                break;
            default:
                f0 f0Var2 = this.A;
                v vVar2 = this.z;
                i.d(vVar2, f0Var2);
                ((androidx.compose.ui.platform.u) vVar2.z).g0 = true;
                int[] iArr = vVar2.K;
                int i = iArr[0];
                int i2 = iArr[1];
                vVar2.getView().getLocationOnScreen(iArr);
                long j = vVar2.L;
                long jU = ((x) obj).u();
                vVar2.L = jU;
                z1 z1Var = vVar2.M;
                if (z1Var != null && ((i != iArr[0] || i2 != iArr[1] || !androidx.compose.ui.unit.l.a(j, jU)) && (windowInsetsC = vVar2.m(z1Var).c()) != null)) {
                    vVar2.getView().dispatchApplyWindowInsets(windowInsetsC);
                }
                break;
        }
        return y.a;
    }
}
