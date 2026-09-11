package com.app.mlounge.ui.screens.services;

import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.e1;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ e1 y;

    public /* synthetic */ f(e1 e1Var) {
        this.y = e1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                e1 e1Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var), null, null, new com.app.mlounge.ui.screens.adult.e(e1Var, str, str2, null, 16), 3, null);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = s.A(1);
                n.j(this.y, (r) obj, iA);
                break;
        }
        return y.a;
    }

    public /* synthetic */ f(e1 e1Var, int i) {
        this.y = e1Var;
    }
}
