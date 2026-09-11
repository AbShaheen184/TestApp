package com.google.android.material.textfield;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.android.material.internal.i {
    public final /* synthetic */ n e;

    public l(n nVar) {
        this.e = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.e.b().a();
    }

    @Override // com.google.android.material.internal.i, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.e.b().b();
    }
}
