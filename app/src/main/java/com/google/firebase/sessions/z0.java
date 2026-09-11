package com.google.firebase.sessions;

import android.util.Log;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public final /* synthetic */ e1 A;
    public int e;
    public /* synthetic */ FlowCollector y;
    public /* synthetic */ Throwable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e1 e1Var, kotlin.coroutines.d dVar) {
        super(3, dVar);
        this.A = e1Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z0 z0Var = new z0(this.A, (kotlin.coroutines.d) obj3);
        z0Var.y = (FlowCollector) obj;
        z0Var.z = (Throwable) obj2;
        return z0Var.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            FlowCollector flowCollector = this.y;
            Throwable th = this.z;
            p0 p0VarA = this.A.b.a(null);
            k0 k0Var = new k0(p0VarA, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + p0VarA.a);
            this.y = null;
            this.e = 1;
            Object objEmit = flowCollector.emit(k0Var, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return kotlin.y.a;
    }
}
