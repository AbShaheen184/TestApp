package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.compose.ui.q implements androidx.compose.ui.relocation.a, androidx.compose.ui.node.u1, androidx.compose.ui.input.key.e, androidx.compose.ui.node.v, androidx.compose.ui.node.z1 {
    public final androidx.compose.animation.e L = new androidx.compose.animation.e(this, 13);
    public final /* synthetic */ u M;

    public k(u uVar) {
        this.M = uVar;
    }

    @Override // androidx.compose.ui.relocation.a
    public final Object H(androidx.compose.ui.node.d1 d1Var, androidx.compose.ui.draw.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        long jW = d1Var.W(0L);
        androidx.compose.ui.geometry.c cVar2 = (androidx.compose.ui.geometry.c) bVar.invoke();
        androidx.compose.ui.geometry.c cVarI = cVar2 != null ? cVar2.i(jW) : null;
        if (cVarI != null) {
            this.M.requestRectangleOnScreen(new Rect((int) cVarI.a, (int) cVarI.b, (int) cVarI.c, (int) cVarI.d), false);
        }
        return kotlin.y.a;
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        return s0Var.f0(c1VarF.e, c1VarF.y, kotlin.collections.v.e, this.L, new androidx.compose.animation.e0(c1VarF, 5));
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean g(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // androidx.compose.ui.input.key.e
    public final boolean x(KeyEvent keyEvent) {
        androidx.compose.ui.focus.f fVar;
        int[] iArr = androidx.compose.ui.focus.h.a;
        long jB = androidx.compose.ui.input.key.c.b(keyEvent);
        boolean z = true;
        if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.b)) {
            fVar = new androidx.compose.ui.focus.f(2);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.c)) {
            fVar = new androidx.compose.ui.focus.f(1);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.p)) {
            fVar = new androidx.compose.ui.focus.f(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.g)) {
            fVar = new androidx.compose.ui.focus.f(4);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.f)) {
            fVar = new androidx.compose.ui.focus.f(3);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.d) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.C)) {
            fVar = new androidx.compose.ui.focus.f(5);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.e) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.D)) {
            fVar = new androidx.compose.ui.focus.f(6);
        } else if (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.h) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.r) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.E)) {
            fVar = new androidx.compose.ui.focus.f(7);
        } else {
            fVar = (androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.a) || androidx.compose.ui.input.key.a.a(jB, androidx.compose.ui.input.key.a.u)) ? new androidx.compose.ui.focus.f(8) : null;
        }
        if (fVar != null) {
            int i = fVar.a;
            if (androidx.compose.ui.input.key.c.c(keyEvent) == 2) {
                u uVar = this.M;
                androidx.compose.ui.focus.e0 e0VarF = ((androidx.compose.ui.focus.p) uVar.getFocusOwner()).f();
                if (e0VarF == null || !e0VarF.L || !uVar.x(i)) {
                    Boolean boolE = ((androidx.compose.ui.focus.p) uVar.getFocusOwner()).e(i, uVar.getEmbeddedViewFocusRect(), new androidx.compose.animation.e(fVar, 12));
                    if (!(boolE != null ? boolE.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer numC = androidx.compose.ui.focus.h.c(i);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = uVar.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, uVar.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(uVar)) {
                                return ((androidx.compose.ui.focus.p) uVar.getFocusOwner()).h(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
    }
}
