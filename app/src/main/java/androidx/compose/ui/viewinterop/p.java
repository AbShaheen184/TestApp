package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.focus.e0;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.y = i;
        this.z = qVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.y) {
            case 0:
                androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) obj;
                q qVar = this.z;
                View viewC = i.c(qVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    androidx.compose.ui.focus.l focusOwner = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(qVar)).getFocusOwner();
                    View viewV = androidx.compose.ui.node.k.v(qVar);
                    Integer numC = androidx.compose.ui.focus.h.c(aVar.a);
                    int[] iArr = new int[2];
                    viewV.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    e0 e0VarF = androidx.compose.ui.focus.d.f(((androidx.compose.ui.focus.p) focusOwner).c);
                    Rect rect = null;
                    androidx.compose.ui.geometry.c cVarJ = e0VarF != null ? androidx.compose.ui.focus.d.j(e0VarF) : null;
                    if (cVarJ != null) {
                        int i = (int) cVarJ.a;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) cVarJ.b;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) cVarJ.c) + i2) - i3, (((int) cVarJ.d) + i5) - i6);
                    }
                    if (!androidx.compose.ui.focus.h.b(viewC, numC, rect)) {
                        aVar.b = true;
                    }
                }
                break;
            default:
                i.c(this.z);
                break;
        }
        return y.a;
    }
}
