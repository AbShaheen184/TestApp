package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.f0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q0 {
    public final /* synthetic */ v a;
    public final /* synthetic */ f0 b;

    public d(v vVar, f0 f0Var) {
        this.a = vVar;
        this.b = f0Var;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        v vVar = this.a;
        int childCount = vVar.getChildCount();
        kotlin.collections.v vVar2 = kotlin.collections.v.e;
        if (childCount == 0) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), vVar2, b.A);
        }
        if (androidx.compose.ui.unit.a.j(j) != 0) {
            vVar.getChildAt(0).setMinimumWidth(androidx.compose.ui.unit.a.j(j));
        }
        if (androidx.compose.ui.unit.a.i(j) != 0) {
            vVar.getChildAt(0).setMinimumHeight(androidx.compose.ui.unit.a.i(j));
        }
        int iJ = androidx.compose.ui.unit.a.j(j);
        int iH = androidx.compose.ui.unit.a.h(j);
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        layoutParams.getClass();
        int iK = h.k(vVar, iJ, iH, layoutParams.width);
        int i = androidx.compose.ui.unit.a.i(j);
        int iG = androidx.compose.ui.unit.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = vVar.getLayoutParams();
        layoutParams2.getClass();
        vVar.measure(iK, h.k(vVar, i, iG, layoutParams2.height));
        return s0Var.q(vVar.getMeasuredWidth(), vVar.getMeasuredHeight(), vVar2, new c(vVar, this.b, 1));
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        v vVar = this.a;
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        layoutParams.getClass();
        vVar.measure(iMakeMeasureSpec, h.k(vVar, 0, i, layoutParams.height));
        return vVar.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        v vVar = this.a;
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        layoutParams.getClass();
        vVar.measure(h.k(vVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return vVar.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        v vVar = this.a;
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        layoutParams.getClass();
        vVar.measure(iMakeMeasureSpec, h.k(vVar, 0, i, layoutParams.height));
        return vVar.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        v vVar = this.a;
        ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
        layoutParams.getClass();
        vVar.measure(h.k(vVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return vVar.getMeasuredHeight();
    }
}
