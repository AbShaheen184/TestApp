package com.google.firebase.sessions;

import android.util.Log;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ e1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(e1 e1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a1(this.z, dVar, 0);
            default:
                return new a1(this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    e1 e1Var = this.z;
                    Flow flowM60catch = FlowKt.m60catch(e1Var.e.b(), new z0(e1Var, null));
                    androidx.compose.foundation.text.input.internal.a aVar = new androidx.compose.foundation.text.input.internal.a(e1Var, 11);
                    this.y = 1;
                    Object objCollect = flowM60catch.collect(aVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                kotlin.coroutines.d dVar = null;
                e1 e1Var2 = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        androidx.datastore.core.e eVar = e1Var2.e;
                        c1 c1Var = new c1(e1Var2, dVar, 0);
                        this.y = 1;
                        Object objA = eVar.a(c1Var, this);
                        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    break;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    k0 k0Var = e1Var2.h;
                    if (k0Var == null) {
                        kotlin.jvm.internal.l.f("localSessionData");
                        throw null;
                    }
                    e1Var2.d.getClass();
                    e1Var2.h = k0.a(k0Var, null, j1.a(), null, 5);
                }
                return kotlin.y.a;
        }
    }
}
