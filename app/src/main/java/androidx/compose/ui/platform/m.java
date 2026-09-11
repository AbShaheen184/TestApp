package androidx.compose.ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.core.view.b {
    public final /* synthetic */ u A;
    public final /* synthetic */ androidx.compose.ui.node.f0 B;
    public final /* synthetic */ u C;

    public m(u uVar, androidx.compose.ui.node.f0 f0Var, u uVar2) {
        this.A = uVar;
        this.B = f0Var;
        this.C = uVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        this.e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        u uVar = this.A;
        a0 a0Var = uVar.V;
        if (a0Var.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        androidx.compose.ui.node.f0 f0Var = this.B;
        androidx.compose.ui.node.f0 f0VarV = f0Var.v();
        while (true) {
            if (f0VarV == null) {
                f0VarV = null;
                break;
            } else if (f0VarV.d0.f(8)) {
                break;
            } else {
                f0VarV = f0VarV.v();
            }
        }
        Integer numValueOf = f0VarV != null ? Integer.valueOf(f0VarV.y) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == uVar.getSemanticsOwner().a().g) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        dVar.b = iIntValue;
        u uVar2 = this.C;
        accessibilityNodeInfo.setParent(uVar2, iIntValue);
        int i = f0Var.y;
        int iD = a0Var.Z.d(i);
        if (iD != -1) {
            androidx.compose.ui.viewinterop.h hVarP = i0.p(uVar.getAndroidViewsHandler$ui(), iD);
            if (hVarP != null) {
                accessibilityNodeInfo.setTraversalBefore(hVarP);
            } else {
                accessibilityNodeInfo.setTraversalBefore(uVar2, iD);
            }
            u.c(uVar, i, accessibilityNodeInfo, a0Var.b0);
        }
        int iD2 = a0Var.a0.d(i);
        if (iD2 != -1) {
            androidx.compose.ui.viewinterop.h hVarP2 = i0.p(uVar.getAndroidViewsHandler$ui(), iD2);
            if (hVarP2 != null) {
                accessibilityNodeInfo.setTraversalAfter(hVarP2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(uVar2, iD2);
            }
            u.c(uVar, i, accessibilityNodeInfo, a0Var.c0);
        }
    }
}
