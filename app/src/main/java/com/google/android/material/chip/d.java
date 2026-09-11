package com.google.android.material.chip;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.app.mlounge.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.customview.widget.a {
    public final /* synthetic */ Chip N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.N = chip;
    }

    @Override // androidx.customview.widget.a
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.T;
        Chip chip = this.N;
        if (!chip.c() || (eVar = chip.B) == null || !eVar.q0 || chip.E == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // androidx.customview.widget.a
    public final void o(int i, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.T);
            return;
        }
        Chip chip = this.N;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        dVar.b(androidx.core.view.accessibility.b.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        dVar.k(Button.class.getName());
    }

    @Override // androidx.customview.widget.a
    public final void p(int i, boolean z) {
        Chip chip = this.N;
        if (i == 1) {
            chip.J = z;
        }
        e eVar = chip.B;
        boolean z2 = chip.J;
        boolean zR = false;
        if (eVar.r0 != null) {
            zR = eVar.R(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : e.l1);
        }
        if (zR) {
            chip.refreshDrawableState();
        }
    }
}
