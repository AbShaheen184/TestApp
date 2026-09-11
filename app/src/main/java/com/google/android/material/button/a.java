package com.google.android.material.button;

import com.google.android.material.shape.y;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends t1 {
    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final void C(y yVar, float f) {
        ((MaterialButton) yVar).setDisplayedWidthIncrease(f);
    }

    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final float u(y yVar) {
        return ((MaterialButton) yVar).getDisplayedWidthIncrease();
    }
}
