package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.y0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ y0 C;
    public final /* synthetic */ kotlin.jvm.functions.a D;
    public final /* synthetic */ String e;
    public final /* synthetic */ CoroutineScope y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public h0(String str, CoroutineScope coroutineScope, kotlin.jvm.functions.a aVar, y0 y0Var, y0 y0Var2, y0 y0Var3, kotlin.jvm.functions.a aVar2) {
        this.e = str;
        this.y = coroutineScope;
        this.z = aVar;
        this.A = y0Var;
        this.B = y0Var2;
        this.C = y0Var3;
        this.D = aVar2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66) {
            int action = keyEvent.getAction();
            y0 y0Var = this.C;
            String str = this.e;
            y0 y0Var2 = this.B;
            y0 y0Var3 = this.A;
            if (action == 0) {
                if (str != null) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                    keyEvent.getRepeatCount();
                    ((Boolean) y0Var3.getValue()).booleanValue();
                    ((Boolean) y0Var2.getValue()).booleanValue();
                }
                if (keyEvent.getRepeatCount() == 0) {
                    y0Var3.setValue(Boolean.TRUE);
                    if (((Job) y0Var.getValue()) == null) {
                        String str2 = this.e;
                        kotlin.jvm.functions.a aVar = this.D;
                        y0 y0Var4 = this.B;
                        y0 y0Var5 = this.C;
                        y0Var5.setValue(BuildersKt__Builders_commonKt.launch$default(this.y, null, null, new androidx.compose.animation.core.f(str2, aVar, y0Var4, y0Var5, null, 12), 3, null));
                    }
                }
            } else if (action == 1) {
                if (str != null) {
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    ((Boolean) y0Var3.getValue()).booleanValue();
                    ((Boolean) y0Var2.getValue()).booleanValue();
                }
                if (((Boolean) y0Var3.getValue()).booleanValue()) {
                    Boolean bool = Boolean.FALSE;
                    y0Var3.setValue(bool);
                    Job job = (Job) y0Var.getValue();
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    y0Var.setValue(null);
                    if (((Boolean) y0Var2.getValue()).booleanValue()) {
                        if (str != null) {
                            kotlin.o oVar3 = com.app.mlounge.util.a.a;
                        }
                        y0Var2.setValue(bool);
                    } else {
                        if (str != null) {
                            kotlin.o oVar4 = com.app.mlounge.util.a.a;
                        }
                        this.z.invoke();
                    }
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
