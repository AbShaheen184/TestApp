package com.app.mlounge.ui.components;

import androidx.compose.runtime.y0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ a(kotlin.jvm.functions.a aVar, y0 y0Var, int i) {
        this.e = i;
        this.y = aVar;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.z.setValue(Boolean.FALSE);
                kotlin.jvm.functions.a aVar = this.y;
                if (aVar != null) {
                    aVar.invoke();
                }
                return kotlin.y.a;
            case 1:
                this.z.setValue(Boolean.FALSE);
                kotlin.jvm.functions.a aVar2 = this.y;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                return kotlin.y.a;
            case 2:
                this.z.setValue(Boolean.FALSE);
                kotlin.jvm.functions.a aVar3 = this.y;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                return kotlin.y.a;
            case 3:
                this.z.setValue(Boolean.FALSE);
                kotlin.jvm.functions.a aVar4 = this.y;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
                return kotlin.y.a;
            case 4:
                this.z.setValue(Boolean.TRUE);
                this.y.invoke();
                break;
            case 5:
                y0 y0Var = this.z;
                if (((Boolean) y0Var.getValue()).booleanValue()) {
                    y0Var.setValue(Boolean.FALSE);
                } else {
                    this.y.invoke();
                }
                return kotlin.y.a;
            default:
                this.y.invoke();
                this.z.setValue(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
