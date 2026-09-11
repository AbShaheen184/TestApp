package com.appsalt.internal;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements i3 {
    public final x a;
    public final o0 b;
    public final Channel c;
    public final Channel d;
    public kotlin.coroutines.jvm.internal.i e;
    public kotlin.coroutines.jvm.internal.i f;
    public Socket g;
    public Job h;

    public k0(x xVar, o0 o0Var) {
        this.a = xVar;
        this.b = o0Var;
        kotlin.coroutines.d dVar = null;
        Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.c = channelChannel$default;
        this.d = channelChannel$default;
        int i = 2;
        this.e = new androidx.activity.compose.n(i, 4, dVar);
        this.f = new androidx.activity.compose.n(i, 5, dVar);
    }

    @Override // com.appsalt.internal.i3
    public final Channel a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsalt.internal.i3
    public final void b(kotlin.jvm.functions.p pVar) {
        this.f = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    @Override // com.appsalt.internal.i3
    public final Object c(String str, int i, t tVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object lVar;
        Object lVar2;
        g4 g4Var = this.b.a;
        try {
            g4Var.getClass();
            kotlin.k kVarC = this.a.c(tVar.e, str);
            if (kVarC == null) {
                return new kotlin.l(new l4(str));
            }
            InetAddress inetAddress = (InetAddress) kVarC.e;
            e0 e0Var = (e0) kVarC.y;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, i);
            long jB = kotlin.time.e.b();
            try {
                Socket socket = new Socket();
                socket.connect(inetSocketAddress);
                lVar2 = socket;
            } catch (Throwable th) {
                lVar2 = new kotlin.l(th);
            }
            if (kotlin.m.a(lVar2) != null) {
                return new kotlin.l(new r3());
            }
            Socket socket2 = (Socket) lVar2;
            int iF = (int) kotlin.time.a.f(kotlin.time.f.a(jB));
            this.h = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(cVar.getContext()), null, null, new com.app.mlounge.ui.e0(this, socket2, this, null), 3, null);
            this.g = socket2;
            lVar = new m4(e0Var.a, inetAddress.getAddress(), e0Var.b, iF);
        } catch (Throwable th2) {
            lVar = new kotlin.l(th2);
        }
        if (kotlin.m.a(lVar) != null) {
            g4Var.getClass();
        }
        return lVar;
    }

    @Override // com.appsalt.internal.i3
    public final void d(Throwable th) {
        this.b.a.getClass();
        this.c.close(th);
        Job job = this.h;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        try {
            Socket socket = this.g;
            if (socket != null) {
                socket.close();
            }
        } catch (Throwable unused) {
        }
        this.g = null;
    }

    @Override // com.appsalt.internal.i3
    public final Object e(byte[] bArr, kotlin.coroutines.jvm.internal.c cVar) {
        Object objWithContext = BuildersKt.withContext(cVar.getContext(), new androidx.compose.animation.core.f(this, bArr, (kotlin.coroutines.d) null, 20), cVar);
        return objWithContext == kotlin.coroutines.intrinsics.a.e ? objWithContext : kotlin.y.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsalt.internal.i3
    public final void f(kotlin.jvm.functions.p pVar) {
        this.e = (kotlin.coroutines.jvm.internal.i) pVar;
    }
}
