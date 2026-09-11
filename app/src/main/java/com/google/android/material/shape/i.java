package com.google.android.material.shape;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t1 {
    public final int o;

    public i(int i) {
        this.o = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final void C(y yVar, float f) {
        j jVar = (j) yVar;
        float[] fArr = jVar.Y;
        if (fArr != null) {
            int i = this.o;
            if (fArr[i] != f) {
                fArr[i] = f;
                com.google.android.datatransport.runtime.scheduling.jobscheduling.l lVar = jVar.a0;
                if (lVar != null) {
                    float fH = jVar.h();
                    MaterialButton materialButton = (MaterialButton) lVar.y;
                    int i2 = (int) (fH * 0.11f);
                    if (materialButton.U != i2) {
                        materialButton.U = i2;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.t1
    public final float u(y yVar) {
        float[] fArr = ((j) yVar).Y;
        if (fArr != null) {
            return fArr[this.o];
        }
        return 0.0f;
    }
}
