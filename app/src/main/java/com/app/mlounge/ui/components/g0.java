package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.y0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ y0 C;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ y0 z;

    public g0(CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar, y0 y0Var, y0 y0Var2, kotlin.jvm.functions.a aVar2, y0 y0Var3) {
        this.e = coroutineScope;
        this.y = aVar;
        this.z = y0Var;
        this.A = y0Var2;
        this.B = aVar2;
        this.C = y0Var3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66) {
            int action = keyEvent.getAction();
            y0 y0Var = this.C;
            y0 y0Var2 = this.z;
            y0 y0Var3 = this.A;
            if (action != 0) {
                if (action == 1) {
                    if (((Boolean) y0Var2.getValue()).booleanValue()) {
                        Boolean bool = Boolean.FALSE;
                        y0Var2.setValue(bool);
                        Job job = (Job) y0Var3.getValue();
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        y0Var3.setValue(null);
                        if (((Boolean) y0Var.getValue()).booleanValue()) {
                            y0Var.setValue(bool);
                        } else {
                            this.y.invoke();
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                y0Var2.setValue(Boolean.TRUE);
                if (((Job) y0Var3.getValue()) == null) {
                    y0Var3.setValue(BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new androidx.compose.animation.b0((Object) this.B, y0Var, y0Var3, (kotlin.coroutines.d) null, 29), 3, null));
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
