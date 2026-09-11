package com.app.mlounge.ui.screens.search;

import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.x0;
import com.app.mlounge.ui.viewmodel.y0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ int z;

    public /* synthetic */ d(y0 y0Var, int i, int i2) {
        this.e = i2;
        this.y = y0Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.e) {
            case 0:
                y0 y0Var = this.y;
                MutableStateFlow mutableStateFlow = y0Var.J;
                int iIntValue = ((Number) mutableStateFlow.getValue()).intValue();
                int i = this.z;
                if (iIntValue != i) {
                    mutableStateFlow.setValue(Integer.valueOf(i));
                    String str = (String) y0Var.h.getValue();
                    if (str.length() >= 2 && ((Number) y0Var.H.getValue()).intValue() == 3) {
                        if (i == 0) {
                            zIsEmpty = ((List) y0Var.v.getValue()).isEmpty();
                        } else if (i != 1) {
                            zIsEmpty = i != 2 ? ((List) y0Var.B.getValue()).isEmpty() : ((List) y0Var.z.getValue()).isEmpty();
                        } else {
                            zIsEmpty = ((List) y0Var.x.getValue()).isEmpty();
                        }
                        if (zIsEmpty) {
                            Job job = y0Var.Q;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                            }
                            y0Var.Q = BuildersKt__Builders_commonKt.launch$default(l0.g(y0Var), null, null, new x0(y0Var, str, null, 1), 3, null);
                        }
                    }
                }
                break;
            default:
                y0 y0Var2 = this.y;
                MutableStateFlow mutableStateFlow2 = y0Var2.H;
                int iIntValue2 = ((Number) mutableStateFlow2.getValue()).intValue();
                int i2 = this.z;
                if (iIntValue2 != i2) {
                    mutableStateFlow2.setValue(Integer.valueOf(i2));
                    String str2 = (String) y0Var2.h.getValue();
                    if (str2.length() >= 2) {
                        switch (i2) {
                            case 0:
                                zIsEmpty2 = ((List) y0Var2.j.getValue()).isEmpty();
                                break;
                            case 1:
                                zIsEmpty2 = ((List) y0Var2.l.getValue()).isEmpty();
                                break;
                            case 2:
                                zIsEmpty2 = ((List) y0Var2.n.getValue()).isEmpty();
                                break;
                            case 3:
                                int iIntValue3 = ((Number) y0Var2.J.getValue()).intValue();
                                if (iIntValue3 == 0) {
                                    zIsEmpty2 = ((List) y0Var2.v.getValue()).isEmpty();
                                } else if (iIntValue3 == 1) {
                                    zIsEmpty2 = ((List) y0Var2.x.getValue()).isEmpty();
                                } else if (iIntValue3 == 2) {
                                    zIsEmpty2 = ((List) y0Var2.z.getValue()).isEmpty();
                                } else {
                                    zIsEmpty2 = ((List) y0Var2.B.getValue()).isEmpty();
                                }
                                break;
                            case 4:
                                zIsEmpty2 = ((List) y0Var2.p.getValue()).isEmpty();
                                break;
                            case 5:
                                zIsEmpty2 = ((List) y0Var2.r.getValue()).isEmpty();
                                break;
                            case 6:
                                zIsEmpty2 = ((List) y0Var2.t.getValue()).isEmpty();
                                break;
                            default:
                                zIsEmpty2 = true;
                                break;
                        }
                        if (zIsEmpty2) {
                            Job job2 = y0Var2.Q;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                            }
                            y0Var2.Q = BuildersKt__Builders_commonKt.launch$default(l0.g(y0Var2), null, null, new x0(y0Var2, str2, null, 4), 3, null);
                        }
                    }
                }
                break;
        }
        return y.a;
    }
}
