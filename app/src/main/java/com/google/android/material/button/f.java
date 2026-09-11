package com.google.android.material.button;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.core.view.b {
    public final /* synthetic */ int A;
    public final /* synthetic */ View B;

    public /* synthetic */ f(View view, int i) {
        this.A = i;
        this.B = view;
    }

    @Override // androidx.core.view.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.A) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.B).A);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        int i;
        int i2 = this.A;
        View view2 = this.B;
        View.AccessibilityDelegate accessibilityDelegate = this.e;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i3 = MaterialButtonToggleGroup.N;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).L));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.B);
                accessibilityNodeInfo2.setChecked(checkableImageButton.A);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = dVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) view2).U);
                break;
        }
    }
}
