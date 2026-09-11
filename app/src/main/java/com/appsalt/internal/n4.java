package com.appsalt.internal;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 {
    public final g4 a;
    public final w b;
    public final CoroutineScope c;
    public CoroutineScope d;
    public okhttp3.internal.ws.e e;
    public final com.google.android.material.internal.b f;
    public final okhttp3.y g;
    public final Channel h;
    public final Channel i;

    public n4(g4 g4Var, w wVar) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.a = g4Var;
        this.b = wVar;
        this.c = CoroutineScope;
        this.d = CoroutineScopeKt.plus(CoroutineScope, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(5);
        this.f = bVar;
        okhttp3.x xVar = new okhttp3.x();
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(this);
        if (!cVar.equals(xVar.m)) {
            xVar.E = null;
        }
        xVar.m = cVar;
        TimeUnit.SECONDS.getClass();
        xVar.B = okhttp3.internal.g.b("interval", 60L);
        xVar.b = bVar;
        xVar.b(com.google.common.base.c.s(okhttp3.z.HTTP_1_1));
        this.g = new okhttp3.y(xVar);
        this.h = ChannelKt.Channel$default(128, null, null, 6, null);
        this.i = ChannelKt.Channel$default(128, null, null, 6, null);
    }

    public final void a() {
        SendChannel.DefaultImpls.close$default(this.h, null, 1, null);
        SendChannel.DefaultImpls.close$default(this.i, null, 1, null);
        this.f.h();
        okhttp3.internal.ws.e eVar = this.e;
        if (eVar != null) {
            eVar.b(1000, null);
        }
        ((ThreadPoolExecutor) this.g.a.s()).shutdown();
        this.e = null;
    }

    public final void b(okhttp3.internal.ws.e eVar) {
        if (!kotlin.jvm.internal.l.a(this.e, eVar)) {
            okhttp3.internal.connection.m mVar = eVar.h;
            mVar.getClass();
            mVar.cancel();
        }
        CoroutineScopeKt.cancel$default(this.d, null, 1, null);
        CoroutineScope coroutineScopePlus = CoroutineScopeKt.plus(this.c, JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        this.d = coroutineScopePlus;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopePlus, null, null, new com.app.mlounge.ui.screens.adult.e(this, null, 25), 3, null);
    }
}
