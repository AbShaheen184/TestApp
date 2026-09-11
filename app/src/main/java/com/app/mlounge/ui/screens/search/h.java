package com.app.mlounge.ui.screens.search;

import android.view.KeyEvent;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.p;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.m1;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements l {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ k2 y;
    public final /* synthetic */ androidx.compose.ui.focus.l z;

    public /* synthetic */ h(k2 k2Var, androidx.compose.ui.focus.l lVar, y0 y0Var, int i) {
        this.e = i;
        this.y = k2Var;
        this.z = lVar;
        this.A = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent.getClass();
                int keyCode = keyEvent.getKeyCode();
                int action = keyEvent.getAction();
                y0 y0Var = this.A;
                boolean z = true;
                if (action == 0 && !((Boolean) y0Var.getValue()).booleanValue() && (keyCode == 23 || keyCode == 66)) {
                    y0Var.setValue(Boolean.TRUE);
                } else {
                    androidx.compose.ui.focus.l lVar = this.z;
                    int i = 6;
                    if (action == 0 && ((Boolean) y0Var.getValue()).booleanValue() && (keyCode == 4 || keyCode == 97 || keyCode == 20 || keyCode == 19)) {
                        y0Var.setValue(Boolean.FALSE);
                        k2 k2Var = this.y;
                        if (k2Var != null) {
                            ((m1) k2Var).a();
                        }
                        ((p) lVar).g(keyCode == 19 ? 5 : 6, true);
                    } else if (action == 0 && !((Boolean) y0Var.getValue()).booleanValue() && (keyCode == 20 || keyCode == 19 || keyCode == 21 || keyCode == 22)) {
                        switch (keyCode) {
                            case 19:
                                i = 5;
                                break;
                            case 20:
                                break;
                            case 21:
                                i = 3;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        ((p) lVar).g(i, true);
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent2.getClass();
                int keyCode2 = keyEvent2.getKeyCode();
                int action2 = keyEvent2.getAction();
                y0 y0Var2 = this.A;
                boolean z2 = true;
                if (action2 == 0 && !((Boolean) y0Var2.getValue()).booleanValue() && (keyCode2 == 23 || keyCode2 == 66)) {
                    y0Var2.setValue(Boolean.TRUE);
                } else {
                    androidx.compose.ui.focus.l lVar2 = this.z;
                    int i2 = 6;
                    if (action2 == 0 && ((Boolean) y0Var2.getValue()).booleanValue() && (keyCode2 == 4 || keyCode2 == 97 || keyCode2 == 20 || keyCode2 == 19)) {
                        y0Var2.setValue(Boolean.FALSE);
                        k2 k2Var2 = this.y;
                        if (k2Var2 != null) {
                            ((m1) k2Var2).a();
                        }
                        ((p) lVar2).g(keyCode2 == 19 ? 5 : 6, true);
                    } else if (action2 == 0 && !((Boolean) y0Var2.getValue()).booleanValue() && (keyCode2 == 20 || keyCode2 == 19 || keyCode2 == 21 || keyCode2 == 22)) {
                        switch (keyCode2) {
                            case 19:
                                i2 = 5;
                                break;
                            case 20:
                                break;
                            case 21:
                                i2 = 3;
                                break;
                            default:
                                i2 = 4;
                                break;
                        }
                        ((p) lVar2).g(i2, true);
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                KeyEvent keyEvent3 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent3.getClass();
                int keyCode3 = keyEvent3.getKeyCode();
                int action3 = keyEvent3.getAction();
                y0 y0Var3 = this.A;
                boolean z3 = true;
                if (action3 == 0 && !((Boolean) y0Var3.getValue()).booleanValue() && (keyCode3 == 23 || keyCode3 == 66)) {
                    y0Var3.setValue(Boolean.TRUE);
                } else {
                    androidx.compose.ui.focus.l lVar3 = this.z;
                    if (action3 == 0 && ((Boolean) y0Var3.getValue()).booleanValue() && (keyCode3 == 4 || keyCode3 == 97 || keyCode3 == 20 || keyCode3 == 19)) {
                        y0Var3.setValue(Boolean.FALSE);
                        k2 k2Var3 = this.y;
                        if (k2Var3 != null) {
                            ((m1) k2Var3).a();
                        }
                        ((p) lVar3).g(keyCode3 == 19 ? 5 : 6, true);
                    } else if (action3 == 0 && !((Boolean) y0Var3.getValue()).booleanValue() && (keyCode3 == 20 || keyCode3 == 19)) {
                        ((p) lVar3).g(keyCode3 == 19 ? 5 : 6, true);
                    } else {
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
            case 3:
                KeyEvent keyEvent4 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent4.getClass();
                int keyCode4 = keyEvent4.getKeyCode();
                int action4 = keyEvent4.getAction();
                y0 y0Var4 = this.A;
                boolean z4 = true;
                if (action4 == 0 && !((Boolean) y0Var4.getValue()).booleanValue() && (keyCode4 == 23 || keyCode4 == 66)) {
                    y0Var4.setValue(Boolean.TRUE);
                } else {
                    androidx.compose.ui.focus.l lVar4 = this.z;
                    if (action4 == 0 && ((Boolean) y0Var4.getValue()).booleanValue() && (keyCode4 == 4 || keyCode4 == 97 || keyCode4 == 20 || keyCode4 == 19)) {
                        y0Var4.setValue(Boolean.FALSE);
                        k2 k2Var4 = this.y;
                        if (k2Var4 != null) {
                            ((m1) k2Var4).a();
                        }
                        ((p) lVar4).g(keyCode4 == 19 ? 5 : 6, true);
                    } else if (action4 == 0 && !((Boolean) y0Var4.getValue()).booleanValue() && (keyCode4 == 20 || keyCode4 == 19)) {
                        ((p) lVar4).g(keyCode4 == 19 ? 5 : 6, true);
                    } else {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
            default:
                KeyEvent keyEvent5 = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent5.getClass();
                int keyCode5 = keyEvent5.getKeyCode();
                int action5 = keyEvent5.getAction();
                y0 y0Var5 = this.A;
                boolean z5 = true;
                if (action5 == 0 && !((Boolean) y0Var5.getValue()).booleanValue() && (keyCode5 == 23 || keyCode5 == 66)) {
                    y0Var5.setValue(Boolean.TRUE);
                } else {
                    androidx.compose.ui.focus.l lVar5 = this.z;
                    int i3 = 6;
                    if (action5 == 0 && ((Boolean) y0Var5.getValue()).booleanValue() && (keyCode5 == 4 || keyCode5 == 97 || keyCode5 == 20 || keyCode5 == 19)) {
                        y0Var5.setValue(Boolean.FALSE);
                        k2 k2Var5 = this.y;
                        if (k2Var5 != null) {
                            ((m1) k2Var5).a();
                        }
                        ((p) lVar5).g(keyCode5 == 19 ? 5 : 6, true);
                    } else if (action5 == 0 && !((Boolean) y0Var5.getValue()).booleanValue() && (keyCode5 == 20 || keyCode5 == 19 || keyCode5 == 21 || keyCode5 == 22)) {
                        switch (keyCode5) {
                            case 19:
                                i3 = 5;
                                break;
                            case 20:
                                break;
                            case 21:
                                i3 = 3;
                                break;
                            default:
                                i3 = 4;
                                break;
                        }
                        ((p) lVar5).g(i3, true);
                    } else {
                        z5 = false;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }
}
