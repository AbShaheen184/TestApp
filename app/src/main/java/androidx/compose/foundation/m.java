package androidx.compose.foundation;

import androidx.compose.foundation.gestures.x2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        kotlin.coroutines.d dVar2 = null;
        Object obj = this.b;
        kotlin.y yVar2 = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        switch (i) {
            case 0:
                Object objI = kotlin.math.a.i(yVar, new l((n) obj, dVar2, i3), dVar);
                return objI == aVar ? objI : yVar2;
            case 1:
                final k0 k0Var = (k0) obj;
                kotlin.jvm.functions.l lVar = (!k0Var.S || k0Var.j0 == null) ? null : new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.i0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                k0 k0Var2 = k0Var;
                                kotlin.jvm.functions.a aVar2 = k0Var2.j0;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (k0Var2.k0) {
                                    ((androidx.compose.ui.hapticfeedback.a) androidx.compose.ui.node.k.h(k0Var2, androidx.compose.ui.platform.l1.l)).a(0);
                                }
                                break;
                            default:
                                k0 k0Var3 = k0Var;
                                if (k0Var3.S) {
                                    k0Var3.T.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                j0 j0Var = new j0(k0Var, null);
                kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.i0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                k0 k0Var2 = k0Var;
                                kotlin.jvm.functions.a aVar2 = k0Var2.j0;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (k0Var2.k0) {
                                    ((androidx.compose.ui.hapticfeedback.a) androidx.compose.ui.node.k.h(k0Var2, androidx.compose.ui.platform.l1.l)).a(0);
                                }
                                break;
                            default:
                                k0 k0Var3 = k0Var;
                                if (k0Var3.S) {
                                    k0Var3.T.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                androidx.compose.foundation.gestures.l0 l0Var = x2.a;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.g(yVar, j0Var, lVar, (kotlin.jvm.functions.l) null, lVar2, (kotlin.coroutines.d) null), dVar);
                if (objCoroutineScope != aVar) {
                    objCoroutineScope = yVar2;
                }
                return objCoroutineScope == aVar ? objCoroutineScope : yVar2;
            case 2:
                androidx.compose.foundation.text.selection.c1 c1Var = (androidx.compose.foundation.text.selection.c1) obj;
                androidx.compose.foundation.text.selection.q0 q0Var = c1Var.A;
                androidx.compose.foundation.text.selection.a1 a1Var = c1Var.z;
                androidx.compose.ui.input.pointer.l0 l0Var2 = (androidx.compose.ui.input.pointer.l0) yVar;
                l0Var2.getClass();
                Object objI2 = kotlin.math.a.i(yVar, new androidx.compose.foundation.text.handwriting.c(new androidx.appcompat.widget.x(androidx.compose.ui.node.k.t(l0Var2).Y), q0Var, a1Var, null), dVar);
                if (objI2 != aVar) {
                    objI2 = yVar2;
                }
                return objI2 == aVar ? objI2 : yVar2;
            case 3:
                Object objI3 = kotlin.math.a.i(yVar, new androidx.compose.foundation.text.contextmenu.gestures.b(new c(1, (androidx.compose.foundation.text.contextmenu.modifier.g) obj, androidx.compose.foundation.text.contextmenu.modifier.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 2), dVar2, i3), dVar);
                if (objI3 != aVar) {
                    objI3 = yVar2;
                }
                return objI3 == aVar ? objI3 : yVar2;
            case 4:
                Object objI4 = kotlin.math.a.i(yVar, new androidx.compose.foundation.text.handwriting.c((androidx.compose.foundation.text.handwriting.d) obj, null), dVar);
                return objI4 == aVar ? objI4 : yVar2;
            case 5:
                Object objL0 = ((androidx.compose.ui.input.pointer.l0) yVar).L0(new androidx.compose.foundation.text.contextmenu.gestures.b((kotlin.jvm.functions.l) obj, dVar2, i2), dVar);
                return objL0 == aVar ? objL0 : yVar2;
            case 6:
                Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.u0(yVar, (androidx.compose.foundation.text.x0) obj, dVar2, i3), dVar);
                if (objCoroutineScope2 != aVar) {
                    objCoroutineScope2 = yVar2;
                }
                return objCoroutineScope2 == aVar ? objCoroutineScope2 : yVar2;
            default:
                Object objD = x2.d(yVar, new com.app.mlounge.ui.screens.player.m((com.app.mlounge.ui.screens.player.z0) obj, 9), dVar);
                return objD == aVar ? objD : yVar2;
        }
    }
}
