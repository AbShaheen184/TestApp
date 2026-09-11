package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements TextWatcher {
    public int e;
    public final /* synthetic */ EditText y;
    public final /* synthetic */ TextInputLayout z;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.z = textInputLayout;
        this.y = editText;
        this.e = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.z;
        textInputLayout.w(!textInputLayout.Y0, false);
        if (textInputLayout.I) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.Q) {
            textInputLayout.x(editable);
        }
        EditText editText = this.y;
        int lineCount = editText.getLineCount();
        int i = this.e;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.R0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.e = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
