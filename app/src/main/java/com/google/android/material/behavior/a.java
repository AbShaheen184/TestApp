package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ View y;
    public final /* synthetic */ androidx.coordinatorlayout.widget.a z;

    public /* synthetic */ a(androidx.coordinatorlayout.widget.a aVar, View view, int i) {
        this.e = i;
        this.z = aVar;
        this.y = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.e) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.z;
                if (z && hideBottomViewOnScrollBehavior.j == 1) {
                    hideBottomViewOnScrollBehavior.r(this.y);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.z;
                if (z && hideViewOnScrollBehavior.j == 1) {
                    hideViewOnScrollBehavior.s(this.y);
                    break;
                }
                break;
        }
    }
}
