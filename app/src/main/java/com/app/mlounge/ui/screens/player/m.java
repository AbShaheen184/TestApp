package com.app.mlounge.ui.screens.player;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ z0 y;

    public /* synthetic */ m(z0 z0Var, int i) {
        this.e = i;
        this.y = z0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String str;
        Object value;
        androidx.media3.exoplayer.c0 c0Var;
        switch (this.e) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                z0.k(this.y, f, null, null, 6);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                z0.k(this.y, null, num, null, 5);
                break;
            case 2:
                Integer num2 = (Integer) obj;
                num2.getClass();
                z0.k(this.y, null, null, num2, 3);
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                z0 z0Var = this.y;
                MutableStateFlow mutableStateFlow = z0Var.e;
                while (true) {
                    Object value2 = mutableStateFlow.getValue();
                    MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                    long j = jLongValue;
                    z0 z0Var2 = z0Var;
                    if (mutableStateFlow2.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, j, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -262145, 3))) {
                        b1 b1Var = ((o0) mutableStateFlow2.getValue()).n;
                        if (b1Var != null && (str = ((o0) mutableStateFlow2.getValue()).t) != null) {
                            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var2), null, null, new androidx.compose.foundation.d(str, j, z0Var2, b1Var, null, 5), 3, null);
                        }
                        return kotlin.y.a;
                    }
                    mutableStateFlow = mutableStateFlow2;
                    jLongValue = j;
                    z0Var = z0Var2;
                }
                break;
            case 4:
                long jLongValue2 = ((Long) obj).longValue();
                z0 z0Var3 = this.y;
                androidx.media3.exoplayer.c0 c0Var2 = z0Var3.g;
                if (c0Var2 != null) {
                    c0Var2.G(jLongValue2);
                }
                Job job = z0Var3.j;
                kotlin.coroutines.d dVar = null;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                z0Var3.j = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var3), null, null, new v0(z0Var3, dVar, 1), 3, null);
                return kotlin.y.a;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                this.y.j(str2, true);
                return kotlin.y.a;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                z0 z0Var4 = this.y;
                MutableStateFlow mutableStateFlow3 = z0Var4.e;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -9, 3)));
                if (zBooleanValue && (c0Var = z0Var4.g) != null) {
                    c0Var.G(((o0) mutableStateFlow3.getValue()).k);
                }
                androidx.media3.exoplayer.c0 c0Var3 = z0Var4.g;
                if (c0Var3 != null) {
                    c0Var3.M(true);
                }
                return kotlin.y.a;
            case 7:
                i0.a(this.y, (a) obj);
                return kotlin.y.a;
            case 8:
                b1 b1Var2 = (b1) obj;
                b1Var2.getClass();
                z0 z0Var5 = this.y;
                z0Var5.h(b1Var2);
                z0Var5.j("subtitle", false);
                return kotlin.y.a;
            default:
                this.y.i();
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }
}
