package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends androidx.core.view.b {
    public final r0 A;
    public final WeakHashMap B = new WeakHashMap();

    public q0(r0 r0Var) {
        this.A = r0Var;
    }

    @Override // androidx.core.view.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.e.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public final com.app.mlounge.data.music.e b(View view) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // androidx.core.view.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        r0 r0Var = this.A;
        RecyclerView recyclerView = r0Var.A;
        RecyclerView recyclerView2 = r0Var.A;
        boolean zI = recyclerView.I();
        View.AccessibilityDelegate accessibilityDelegate = this.e;
        if (zI || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().V(view, dVar);
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            bVar.d(view, dVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // androidx.core.view.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.e.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public final boolean g(View view, int i, Bundle bundle) {
        r0 r0Var = this.A;
        RecyclerView recyclerView = r0Var.A;
        RecyclerView recyclerView2 = r0Var.A;
        if (recyclerView.I() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            if (bVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        i0 i0Var = recyclerView2.getLayoutManager().b.z;
        return false;
    }

    @Override // androidx.core.view.b
    public final void h(View view, int i) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // androidx.core.view.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.B.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
