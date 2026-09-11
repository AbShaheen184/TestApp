package com.app.mlounge.ui.screens.settings;

import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.g1;
import com.app.mlounge.ui.viewmodel.k1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ k1 y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ d(k1 k1Var, y0 y0Var, int i) {
        this.e = i;
        this.y = k1Var;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.y.f(true);
                    this.z.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                k1 k1Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var), null, null, new g1(k1Var, str, null, 3), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                k1 k1Var2 = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var2), null, null, new androidx.compose.ui.scrollcapture.c(k1Var2, fFloatValue, null), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                k1 k1Var3 = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str2, null, 2), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
