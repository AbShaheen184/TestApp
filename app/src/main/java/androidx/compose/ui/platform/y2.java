package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.w1 A;
    public final /* synthetic */ androidx.lifecycle.v B;
    public final /* synthetic */ z2 C;
    public final /* synthetic */ View D;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ kotlin.jvm.internal.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(kotlin.jvm.internal.z zVar, androidx.compose.runtime.w1 w1Var, androidx.lifecycle.v vVar, z2 z2Var, View view, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = zVar;
        this.A = w1Var;
        this.B = vVar;
        this.C = z2Var;
        this.D = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        y2 y2Var = new y2(this.z, this.A, this.B, this.C, this.D, dVar);
        y2Var.y = obj;
        return y2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Job jobLaunch$default;
        int i = this.e;
        z2 z2Var = this.C;
        androidx.lifecycle.v vVar = this.B;
        kotlin.y yVar = kotlin.y.a;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                try {
                    b2 b2Var = (b2) this.z.e;
                    if (b2Var != null) {
                        StateFlow stateFlowA = b3.a(this.D.getContext().getApplicationContext());
                        b2Var.e.h(((Number) stateFlowA.getValue()).floatValue());
                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.activity.compose.p(stateFlowA, b2Var, null, 18), 3, null);
                    } else {
                        jobLaunch$default = null;
                    }
                    androidx.compose.runtime.w1 w1Var = this.A;
                    this.y = jobLaunch$default;
                    this.e = 1;
                    Object objWithContext = BuildersKt.withContext(w1Var.a, new androidx.compose.animation.core.z0(w1Var, new androidx.compose.runtime.v1(w1Var, null), androidx.compose.runtime.s.o(getContext()), (kotlin.coroutines.d) null), this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objWithContext != aVar) {
                        objWithContext = yVar;
                    }
                    if (objWithContext != aVar) {
                        objWithContext = yVar;
                    }
                    if (objWithContext == aVar) {
                        return aVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jobLaunch$default = null;
                    if (jobLaunch$default != null) {
                        Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                    }
                    vVar.getLifecycle().b(z2Var);
                    throw th;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jobLaunch$default = (Job) this.y;
                kotlin.a.e(obj);
            }
            if (jobLaunch$default != null) {
                Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            }
            vVar.getLifecycle().b(z2Var);
            return yVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
