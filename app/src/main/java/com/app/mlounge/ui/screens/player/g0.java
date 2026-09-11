package com.app.mlounge.ui.screens.player;

import android.view.KeyEvent;
import androidx.compose.runtime.d1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ kotlin.jvm.functions.l B;
    public final /* synthetic */ androidx.compose.runtime.y0 C;
    public final /* synthetic */ d1 D;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ float z;

    public g0(boolean z, kotlin.jvm.functions.a aVar, float f, long j, kotlin.jvm.functions.l lVar, androidx.compose.runtime.y0 y0Var, d1 d1Var) {
        this.e = z;
        this.y = aVar;
        this.z = f;
        this.A = j;
        this.B = lVar;
        this.C = y0Var;
        this.D = d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (androidx.compose.ui.input.key.c.c(keyEvent) == 2 && this.e) {
            int keyCode = keyEvent.getKeyCode();
            kotlin.jvm.functions.a aVar = this.y;
            d1 d1Var = this.D;
            androidx.compose.runtime.y0 y0Var = this.C;
            if (keyCode != 66) {
                float fG = this.z;
                switch (keyCode) {
                    case 21:
                        aVar.invoke();
                        if (((Boolean) y0Var.getValue()).booleanValue()) {
                            fG = d1Var.g();
                        }
                        d1Var.h(fG - 0.02f);
                        y0Var.setValue(Boolean.TRUE);
                        break;
                    case 22:
                        aVar.invoke();
                        if (((Boolean) y0Var.getValue()).booleanValue()) {
                            fG = d1Var.g();
                        }
                        d1Var.h(fG + 0.02f);
                        y0Var.setValue(Boolean.TRUE);
                        break;
                    case 23:
                        if (((Boolean) y0Var.getValue()).booleanValue()) {
                            j = this.A;
                            if (j > 0) {
                                this.B.invoke(Long.valueOf((long) (d1Var.g() * j)));
                                y0Var.setValue(Boolean.FALSE);
                            }
                        }
                        aVar.invoke();
                        break;
                }
                z = true;
            } else {
                if (((Boolean) y0Var.getValue()).booleanValue()) {
                    j = this.A;
                    if (j > 0) {
                        this.B.invoke(Long.valueOf((long) (d1Var.g() * j)));
                        y0Var.setValue(Boolean.FALSE);
                    }
                }
                aVar.invoke();
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
