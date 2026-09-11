package com.app.mlounge.ui.screens.player;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Map E;
    public final /* synthetic */ String F;
    public final /* synthetic */ z0 e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z0 z0Var, String str, String str2, boolean z, int i, int i2, int i3, Map map, String str3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = z0Var;
        this.y = str;
        this.z = str2;
        this.A = z;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = map;
        this.F = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d0(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        d0Var.invokeSuspend(yVar);
        return yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        androidx.media3.exoplayer.g gVar;
        Object value2;
        kotlin.a.e(obj);
        z0 z0Var = this.e;
        MutableStateFlow mutableStateFlow = z0Var.e;
        if (z0Var.g == null) {
            String str = this.y;
            z0Var.l = str;
            String str2 = this.z;
            z0Var.m = str2;
            String str3 = this.F;
            z0Var.n = str3;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, o0.a((o0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, -536870913, 3)));
            if (kotlin.text.k.d0(str)) {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value2, o0.a((o0) value2, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "No playable link found.", null, false, false, null, null, false, false, false, 0, -8388609, 3)));
            } else {
                if (this.A) {
                    HashMap map = new HashMap();
                    map.put(androidx.media3.exoplayer.analytics.k.c.a, 144179200);
                    com.google.android.material.motion.a.q(!false);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackMs", 3000, "0", 0);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackAfterRebufferMs", 5000, "0", 0);
                    androidx.media3.exoplayer.g.a("minBufferMs", 15000, "bufferForPlaybackMs", 3000);
                    androidx.media3.exoplayer.g.a("minBufferMs", 15000, "bufferForPlaybackAfterRebufferMs", 5000);
                    androidx.media3.exoplayer.g.a("maxBufferMs", 50000, "minBufferMs", 15000);
                    com.google.android.material.motion.a.q(!false);
                    com.google.android.material.motion.a.q(!false);
                    gVar = new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 15000, 15000, 50000, 50000, 3000, 3000, 5000, 5000, -1, true, true, map);
                } else {
                    HashMap map2 = new HashMap();
                    map2.put(androidx.media3.exoplayer.analytics.k.c.a, 144179200);
                    com.google.android.material.motion.a.q(!false);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackMs", 500, "0", 0);
                    androidx.media3.exoplayer.g.a("bufferForPlaybackAfterRebufferMs", 2000, "0", 0);
                    androidx.media3.exoplayer.g.a("minBufferMs", 8000, "bufferForPlaybackMs", 500);
                    androidx.media3.exoplayer.g.a("minBufferMs", 8000, "bufferForPlaybackAfterRebufferMs", 2000);
                    androidx.media3.exoplayer.g.a("maxBufferMs", 30000, "minBufferMs", 8000);
                    com.google.android.material.motion.a.q(!false);
                    com.google.android.material.motion.a.q(!false);
                    gVar = new androidx.media3.exoplayer.g(new androidx.media3.exoplayer.upstream.d(), 8000, 8000, 30000, 30000, 500, 500, 2000, 2000, -1, true, true, map2);
                }
                Context context = z0Var.d;
                context.getClass();
                androidx.media3.exoplayer.k kVar = new androidx.media3.exoplayer.k(context, new coil3.memory.c(context, 6));
                com.google.android.material.motion.a.q(!kVar.z);
                kVar.f = new androidx.activity.y(gVar, 4);
                com.google.android.material.motion.a.q(!kVar.z);
                kVar.o = 30000L;
                com.google.android.material.motion.a.q(!kVar.z);
                kVar.p = 30000L;
                com.google.android.material.motion.a.q(!kVar.z);
                kVar.z = true;
                androidx.media3.exoplayer.c0 c0Var = new androidx.media3.exoplayer.c0(kVar);
                androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                jVar.getClass();
                androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
                iVar.i(3, true);
                c0Var.O(iVar.a());
                z0Var.g = c0Var;
                c0Var.m.a(new y0(z0Var));
                kotlin.coroutines.d dVar = null;
                if (!kotlin.text.k.d0(str2)) {
                    BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var), Dispatchers.getIO(), null, new androidx.room.coroutines.f(z0Var, str2, dVar, 11), 2, null);
                }
                Job job = z0Var.h;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                z0Var.h = BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var), null, null, new v0(z0Var, dVar, 3), 3, null);
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(z0Var), null, null, new u0(z0Var, str3, str, this.E, this.B, this.C, this.D, null), 3, null);
            }
        }
        return kotlin.y.a;
    }
}
