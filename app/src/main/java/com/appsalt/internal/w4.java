package com.appsalt.internal;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 {
    public final androidx.compose.runtime.internal.c a;
    public final Channel b;
    public final Channel c;
    public final kotlin.coroutines.i d;
    public final CoroutineScope e;
    public final coil3.memory.c f;

    public w4(androidx.compose.runtime.internal.c cVar, Channel channel, Channel channel2, g4 g4Var, CoroutineDispatcher coroutineDispatcher) {
        this.a = cVar;
        this.b = channel;
        this.c = channel2;
        this.d = coroutineDispatcher;
        this.e = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
        this.f = new coil3.memory.c(g4Var);
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r17v4, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.appsalt.internal.c3, com.appsalt.internal.y0] */
    /* JADX WARN: Type inference failed for: r8v20 */
    public final Object a(int i, kotlin.coroutines.jvm.internal.c cVar) {
        c4 c4Var;
        Object objG;
        w4 w4Var;
        y0 y0Var;
        Object lVar;
        c3 c3Var;
        w4 w4Var2;
        net.luminis.quic.stream.e eVarF;
        NonCancellable nonCancellable;
        androidx.compose.foundation.text.u0 u0Var;
        Object obj;
        y0 y0Var2;
        Object obj2;
        NonCancellable nonCancellable2;
        androidx.compose.foundation.text.u0 u0Var2;
        if (cVar instanceof c4) {
            c4Var = (c4) cVar;
            int i2 = c4Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4Var.C = i2 - Integer.MIN_VALUE;
            } else {
                c4Var = new c4(this, cVar);
            }
        } else {
            c4Var = new c4(this, cVar);
        }
        Object objDoSelect = c4Var.A;
        int i3 = c4Var.C;
        int i4 = 2;
        ?? r13 = 0;
        Object obj3 = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i3 == 0) {
                kotlin.a.e(objDoSelect);
                androidx.compose.runtime.internal.c cVar2 = this.a;
                c4Var.e = this;
                c4Var.C = 1;
                objG = cVar2.g(i, c4Var);
                if (objG != aVar) {
                    w4Var = this;
                }
                return aVar;
            }
            if (i3 == 1) {
                w4Var = (w4) c4Var.e;
                kotlin.a.e(objDoSelect);
                objG = ((kotlin.m) objDoSelect).e;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Object obj4 = c4Var.e;
                        kotlin.a.e(objDoSelect);
                        return obj4;
                    }
                    if (i3 != 4) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) c4Var.e;
                    kotlin.a.e(objDoSelect);
                    throw th;
                }
                y0Var2 = c4Var.z;
                c3Var = c4Var.y;
                w4 w4Var3 = (w4) c4Var.e;
                try {
                    kotlin.a.e(objDoSelect);
                    y0Var = y0Var2;
                    w4Var2 = w4Var3;
                } catch (Throwable th2) {
                    th = th2;
                    w4Var2 = w4Var3;
                    obj = null;
                    aVar = aVar;
                    y0Var = y0Var2;
                    r13 = obj;
                    c3 c3Var2 = c3Var;
                    nonCancellable = NonCancellable.INSTANCE;
                    u0Var = new androidx.compose.foundation.text.u0(c3Var2, y0Var, w4Var2, r13, 10);
                    c4Var.e = th;
                    c4Var.y = r13;
                    c4Var.z = r13;
                    c4Var.C = 4;
                    if (BuildersKt.withContext(nonCancellable, u0Var, c4Var) == aVar) {
                        return aVar;
                    }
                    throw th;
                }
            }
            try {
                obj2 = ((kotlin.m) objDoSelect).e;
                nonCancellable2 = NonCancellable.INSTANCE;
                u0Var2 = new androidx.compose.foundation.text.u0(c3Var, y0Var, w4Var2, r13, 10);
                c4Var.e = obj2;
                c4Var.y = null;
                c4Var.z = null;
                c4Var.C = 3;
                if (BuildersKt.withContext(nonCancellable2, u0Var2, c4Var) == aVar) {
                    return aVar;
                }
                return obj2;
            } catch (Throwable th3) {
                th = th3;
                obj3 = null;
                aVar = aVar;
                y0Var2 = y0Var;
                obj = obj3;
                y0Var = y0Var2;
                r13 = obj;
                c3 c3Var3 = c3Var;
                nonCancellable = NonCancellable.INSTANCE;
                u0Var = new androidx.compose.foundation.text.u0(c3Var3, y0Var, w4Var2, r13, 10);
                c4Var.e = th;
                c4Var.y = r13;
                c4Var.z = r13;
                c4Var.C = 4;
                if (BuildersKt.withContext(nonCancellable, u0Var, c4Var) == aVar) {
                    return aVar;
                }
                throw th;
            }
            Throwable thA = kotlin.m.a(objG);
            if (thA != null) {
                return new kotlin.l(thA);
            }
            y0Var = (y0) objG;
            w4Var.getClass();
            try {
                y0Var.getClass();
                net.luminis.quic.impl.i iVar = y0Var.a;
                iVar.getClass();
                net.luminis.quic.stream.n nVar = iVar.W;
                nVar.getClass();
                try {
                    eVarF = nVar.f(true, 10000L, TimeUnit.DAYS, new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(nVar, 15));
                } catch (TimeoutException unused) {
                    com.google.gson.b.l();
                    eVarF = null;
                }
                lVar = new c3(new androidx.media3.exoplayer.dash.manifest.t(eVarF, 17), 3, (o0) w4Var.f.z, w4Var.d);
            } catch (Throwable th4) {
                lVar = new kotlin.l(th4);
            }
            Throwable thA2 = kotlin.m.a(lVar);
            if (thA2 != null) {
                return new kotlin.l(thA2);
            }
            c3 c3Var4 = (c3) lVar;
            try {
                Channel channel = w4Var.b;
                try {
                    o0 o0Var = (o0) w4Var.f.z;
                    com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(c3Var4, channel, o0Var, false, 17);
                    c3Var = c3Var4;
                    try {
                        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(w4Var.e, null, null, new androidx.compose.animation.core.c1(new com.google.firebase.messaging.o(c3Var4, w4Var.c, o0Var, false, 16), r13, 23), 3, null);
                        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(w4Var.e, null, null, new androidx.compose.animation.core.c1(oVar, r13, 24), 3, null);
                        SelectImplementation selectImplementation = new SelectImplementation(c4Var.getContext());
                        selectImplementation.invoke(deferredAsync$default.getOnAwait(), new androidx.compose.runtime.t1(i4, 7, r13));
                        selectImplementation.invoke(deferredAsync$default2.getOnAwait(), new androidx.compose.runtime.t1(i4, 8, r13));
                        c4Var.e = w4Var;
                        try {
                            c4Var.y = c3Var;
                            c4Var.z = y0Var;
                            c4Var.C = 2;
                            objDoSelect = selectImplementation.doSelect(c4Var);
                            if (objDoSelect != aVar) {
                                w4Var2 = w4Var;
                                obj2 = ((kotlin.m) objDoSelect).e;
                                nonCancellable2 = NonCancellable.INSTANCE;
                                u0Var2 = new androidx.compose.foundation.text.u0(c3Var, y0Var, w4Var2, r13, 10);
                                c4Var.e = obj2;
                                c4Var.y = null;
                                c4Var.z = null;
                                c4Var.C = 3;
                                if (BuildersKt.withContext(nonCancellable2, u0Var2, c4Var) == aVar) {
                                    return aVar;
                                }
                                return obj2;
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th = th5;
                            w4Var2 = w4Var;
                            c3 c3Var5 = c3Var;
                            nonCancellable = NonCancellable.INSTANCE;
                            u0Var = new androidx.compose.foundation.text.u0(c3Var5, y0Var, w4Var2, r13, 10);
                            c4Var.e = th;
                            c4Var.y = r13;
                            c4Var.z = r13;
                            c4Var.C = 4;
                            if (BuildersKt.withContext(nonCancellable, u0Var, c4Var) == aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        w4Var2 = w4Var;
                        y0Var2 = y0Var;
                        obj = obj3;
                        y0Var = y0Var2;
                        r13 = obj;
                        c3 c3Var6 = c3Var;
                        nonCancellable = NonCancellable.INSTANCE;
                        u0Var = new androidx.compose.foundation.text.u0(c3Var6, y0Var, w4Var2, r13, 10);
                        c4Var.e = th;
                        c4Var.y = r13;
                        c4Var.z = r13;
                        c4Var.C = 4;
                        if (BuildersKt.withContext(nonCancellable, u0Var, c4Var) == aVar) {
                            return aVar;
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c3Var = c3Var4;
                }
            } catch (Throwable th8) {
                th = th8;
                c3Var = c3Var4;
            }
        } catch (Throwable th9) {
            return new kotlin.l(th9);
        }
    }
}
