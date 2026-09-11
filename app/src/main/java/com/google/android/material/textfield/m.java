package com.google.android.material.textfield;

import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.a;
        l lVar = nVar.S;
        if (nVar.P == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.P;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.P.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.P.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.P = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().l(nVar.P);
        nVar.j(nVar.b());
    }
}
