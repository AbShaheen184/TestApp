package com.google.android.material.textfield;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(n nVar, int i) {
        super(nVar);
        this.e = i;
    }

    @Override // com.google.android.material.textfield.o
    public void q() {
        switch (this.e) {
            case 0:
                n nVar = this.b;
                nVar.L = null;
                CheckableImageButton checkableImageButton = nVar.D;
                checkableImageButton.setOnLongClickListener(null);
                p.v(checkableImageButton, null);
                break;
        }
    }
}
