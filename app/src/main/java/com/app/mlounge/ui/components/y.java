package com.app.mlounge.ui.components;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements kotlin.jvm.functions.l {
    public final /* synthetic */ androidx.compose.ui.focus.y A;
    public final /* synthetic */ androidx.compose.ui.focus.y B;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.focus.y z;

    public /* synthetic */ y(boolean z, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, int i) {
        this.e = i;
        this.y = z;
        this.z = yVar;
        this.A = yVar2;
        this.B = yVar3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent.getClass();
                int keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() != 0) {
                    return Boolean.FALSE;
                }
                boolean z = true;
                switch (keyCode) {
                    case 19:
                        if (!this.y) {
                            androidx.compose.ui.focus.y.a(this.z);
                        } else {
                            androidx.compose.ui.focus.y.a(this.A);
                        }
                        break;
                    case 20:
                    case 22:
                        break;
                    case 21:
                        androidx.compose.ui.focus.y.a(this.B);
                        break;
                    default:
                        z = false;
                        break;
                }
                return Boolean.valueOf(z);
            default:
                KeyEvent keyEvent2 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent2.getClass();
                int keyCode2 = keyEvent2.getKeyCode();
                if (keyEvent2.getAction() != 0) {
                    return Boolean.FALSE;
                }
                boolean z2 = true;
                switch (keyCode2) {
                    case 19:
                        if (!this.y) {
                            androidx.compose.ui.focus.y.a(this.z);
                        } else {
                            androidx.compose.ui.focus.y.a(this.A);
                        }
                        break;
                    case 20:
                    case 21:
                        break;
                    case 22:
                        androidx.compose.ui.focus.y.a(this.B);
                        break;
                    default:
                        z2 = false;
                        break;
                }
                return Boolean.valueOf(z2);
        }
    }
}
