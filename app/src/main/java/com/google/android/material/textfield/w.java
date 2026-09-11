package com.google.android.material.textfield;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends androidx.core.view.b {
    public final TextInputLayout A;

    public w(TextInputLayout textInputLayout) {
        this.A = textInputLayout;
    }

    @Override // androidx.core.view.b
    public final void d(View view, androidx.core.view.accessibility.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
        this.e.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.A;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.S0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        u uVar = textInputLayout.y;
        l0 l0Var = uVar.y;
        if (l0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(l0Var);
            accessibilityNodeInfo.setTraversalAfter(l0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.A);
        }
        if (!zIsEmpty) {
            dVar.r(text);
        } else if (!TextUtils.isEmpty(string)) {
            dVar.r(string);
            if (!z && placeholderText != null) {
                dVar.r(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            dVar.r(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                dVar.m(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                dVar.r(string);
            }
            dVar.q(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        l0 l0Var2 = textInputLayout.H.y;
        if (l0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(l0Var2);
        }
        textInputLayout.z.b().m(dVar);
    }

    @Override // androidx.core.view.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.A.z.b().n(accessibilityEvent);
    }
}
