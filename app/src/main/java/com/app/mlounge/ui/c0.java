package com.app.mlounge.ui;

import androidx.compose.runtime.y0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ c0(y0 y0Var, y0 y0Var2, int i) {
        this.e = i;
        this.y = y0Var;
        this.z = y0Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Job job = (Job) this.y.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.z.setValue(Boolean.FALSE);
                break;
            case 1:
                this.y.setValue(null);
                this.z.setValue(Boolean.FALSE);
                break;
            case 2:
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(Boolean.TRUE);
                break;
            default:
                com.app.mlounge.ui.screens.settings.e0.a(this.y, this.z);
                break;
        }
        return kotlin.y.a;
    }
}
