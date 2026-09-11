package com.app.mlounge.data.local.prefs;

import java.io.IOException;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.q {
    public int e;
    public /* synthetic */ FlowCollector y;
    public /* synthetic */ Throwable z;

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = new b(3, (kotlin.coroutines.d) obj3);
        bVar.y = (FlowCollector) obj;
        bVar.z = (Throwable) obj2;
        return bVar.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector = this.y;
        Throwable th = this.z;
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            if (!(th instanceof IOException)) {
                throw th;
            }
            androidx.datastore.preferences.core.a aVar = new androidx.datastore.preferences.core.a(true);
            this.y = null;
            this.z = null;
            this.e = 1;
            Object objEmit = flowCollector.emit(aVar, this);
            kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar2) {
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
    }
}
