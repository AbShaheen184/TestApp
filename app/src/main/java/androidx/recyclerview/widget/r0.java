package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends androidx.core.view.b {
    public final RecyclerView A;
    public final q0 B;

    public r0(RecyclerView recyclerView) {
        this.A = recyclerView;
        q0 q0Var = this.B;
        if (q0Var != null) {
            this.B = q0Var;
        } else {
            this.B = new q0(this);
        }
    }

    @Override // androidx.core.view.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.A.I()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().T(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        this.e.onInitializeAccessibilityNodeInfo(view, dVar.a);
        RecyclerView recyclerView = this.A;
        if (recyclerView.I() || recyclerView.getLayoutManager() == null) {
            return;
        }
        c0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.U(recyclerView2.z, recyclerView2.A0, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r7
  0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.core.view.b
    public final boolean g(View view, int i, Bundle bundle) {
        int iF;
        int iD;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A;
        if (!recyclerView.I() && recyclerView.getLayoutManager() != null) {
            c0 layoutManager = recyclerView.getLayoutManager();
            i0 i0Var = layoutManager.b.z;
            int iHeight = layoutManager.n;
            int iWidth = layoutManager.m;
            Rect rect = new Rect();
            if (layoutManager.b.getMatrix().isIdentity() && layoutManager.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iF = layoutManager.b.canScrollVertically(1) ? (iHeight - layoutManager.F()) - layoutManager.C() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    iD = (iWidth - layoutManager.D()) - layoutManager.E();
                } else {
                    iD = 0;
                }
            } else if (i != 8192) {
                iF = 0;
                iD = 0;
            } else {
                iF = layoutManager.b.canScrollVertically(-1) ? -((iHeight - layoutManager.F()) - layoutManager.C()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    iD = -((iWidth - layoutManager.D()) - layoutManager.E());
                } else {
                    iD = 0;
                }
            }
            if (iF != 0 || iD != 0) {
                layoutManager.b.Y(iD, iF, true);
                return true;
            }
        }
        return false;
    }
}
