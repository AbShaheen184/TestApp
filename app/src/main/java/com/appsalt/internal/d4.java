package com.appsalt.internal;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 implements i3 {
    public final x a;
    public final o0 b;
    public final Channel c;
    public final Channel d;
    public kotlin.coroutines.jvm.internal.i e;
    public kotlin.coroutines.jvm.internal.i f;
    public DatagramSocket g;

    public d4(x xVar, o0 o0Var) {
        this.a = xVar;
        this.b = o0Var;
        kotlin.coroutines.d dVar = null;
        Channel channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.c = channelChannel$default;
        this.d = channelChannel$default;
        int i = 2;
        this.e = new androidx.activity.compose.n(i, 12, dVar);
        this.f = new androidx.activity.compose.n(i, 13, dVar);
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
                DatagramSocket datagramSocket = new DatagramSocket();
                this.g = datagramSocket;
                datagramSocket.connect(inetSocketAddress);
                lVar2 = kotlin.y.a;
            } catch (Throwable th) {
                lVar2 = new kotlin.l(th);
            }
            if (kotlin.m.a(lVar2) != null) {
                return new kotlin.l(new r3());
            }
            int iF = (int) kotlin.time.a.f(kotlin.time.f.a(jB));
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(cVar.getContext()), null, null, new y3(this, inetAddress, i, this, null), 3, null);
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
        g4 g4Var = this.b.a;
        g4Var.getClass();
        g4Var.getClass();
        this.c.close(th);
        try {
            DatagramSocket datagramSocket = this.g;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        } catch (Throwable unused) {
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // com.appsalt.internal.i3
    public final Object e(byte[] bArr, kotlin.coroutines.jvm.internal.c cVar) {
        q3 q3Var;
        Object lVar;
        d4 d4Var;
        if (cVar instanceof q3) {
            q3Var = (q3) cVar;
            int i = q3Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3Var.B = i - Integer.MIN_VALUE;
            } else {
                q3Var = new q3(this, cVar);
            }
        } else {
            q3Var = new q3(this, cVar);
        }
        Object obj = q3Var.z;
        int i2 = q3Var.B;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            try {
                DatagramSocket datagramSocket = this.g;
                if (datagramSocket != null) {
                    o0 o0Var = this.b;
                    int length = bArr.length;
                    o0Var.a.getClass();
                    DatagramSocket datagramSocket2 = this.g;
                    if (datagramSocket2 != null) {
                        datagramSocket2.send(new DatagramPacket(bArr, bArr.length, datagramSocket.getInetAddress(), datagramSocket.getPort()));
                        lVar = yVar;
                    } else {
                        lVar = null;
                    }
                } else {
                    lVar = null;
                }
            } catch (Throwable th) {
                lVar = new kotlin.l(th);
            }
            Throwable thA = kotlin.m.a(lVar);
            if (thA != null) {
                q3Var.e = this;
                q3Var.y = lVar;
                q3Var.B = 1;
                d(thA);
                if (yVar != aVar) {
                    d4Var = this;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lVar = q3Var.y;
        d4Var = (d4) q3Var.e;
        kotlin.a.e(obj);
        ?? r12 = d4Var.f;
        Boolean bool = Boolean.TRUE;
        q3Var.e = lVar;
        q3Var.y = null;
        q3Var.B = 2;
        return r12.invoke(bool, q3Var) == aVar ? aVar : yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsalt.internal.i3
    public final void f(kotlin.jvm.functions.p pVar) {
        this.e = (kotlin.coroutines.jvm.internal.i) pVar;
    }
}
