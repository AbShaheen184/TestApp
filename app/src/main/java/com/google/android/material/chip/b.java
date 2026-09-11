package com.google.android.material.chip;

import android.graphics.Typeface;
import com.google.android.material.internal.h;
import com.google.android.material.resources.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.material.resources.g
    public final void i(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                h hVar = (h) this.b;
                hVar.d = true;
                e eVar = (e) hVar.e.get();
                if (eVar != null) {
                    eVar.A();
                    eVar.invalidateSelf();
                }
                break;
        }
    }

    @Override // com.google.android.material.resources.g
    public final void j(Typeface typeface, boolean z) {
        switch (this.a) {
            case 0:
                Chip chip = (Chip) this.b;
                e eVar = chip.B;
                chip.setText(eVar.i1 ? eVar.k0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    h hVar = (h) this.b;
                    hVar.d = true;
                    e eVar2 = (e) hVar.e.get();
                    if (eVar2 != null) {
                        eVar2.A();
                        eVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    private final void n(int i) {
    }
}
