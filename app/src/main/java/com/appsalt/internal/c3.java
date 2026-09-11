package com.appsalt.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 {
    public final androidx.media3.exoplayer.dash.manifest.t a;
    public final int b;
    public final o0 c;
    public final kotlin.coroutines.i d;
    public final ReceiveChannel e;
    public final Channel f;
    public final androidx.activity.compose.b g;
    public final Job h;
    public boolean i;
    public final int j;

    public c3(androidx.media3.exoplayer.dash.manifest.t tVar, int i, o0 o0Var, kotlin.coroutines.i iVar) {
        this.a = tVar;
        this.b = i;
        this.c = o0Var;
        this.d = iVar;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(iVar);
        kotlin.coroutines.d dVar = null;
        this.f = ChannelKt.Channel$default(4096, null, null, 6, null);
        this.g = new androidx.activity.compose.b(1);
        if (i != 1) {
            this.h = BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new androidx.compose.animation.core.z0(this, dVar, 10), 3, null);
        }
        this.e = i != 2 ? ProduceKt.produce$default(CoroutineScope, null, 4096, new t2(this, null), 1, null) : ChannelKt.Channel$default(0, null, null, 7, null);
        this.j = hashCode();
    }

    public static final ArrayList a(c3 c3Var, byte[] bArr) {
        c3Var.getClass();
        if (bArr.length < 4) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = i + 4;
            int i3 = ByteBuffer.wrap(kotlin.collections.n.I(bArr, i, i2)).order(ByteOrder.BIG_ENDIAN).getInt();
            i += i3 + 4;
            if (bArr.length < i) {
                break;
            }
            arrayList.add(kotlin.collections.n.I(bArr, i2, i3 + i2));
        } while (i + 4 < bArr.length);
        return arrayList;
    }

    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        SendChannel.DefaultImpls.close$default(this.f, null, 1, null);
        if (this.b != 2) {
            try {
                ((net.luminis.quic.stream.e) this.a.y).e.g();
            } catch (Throwable unused) {
            }
        }
        Job job = this.h;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        this.g.getClass();
    }
}
