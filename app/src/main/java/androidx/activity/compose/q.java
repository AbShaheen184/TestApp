package androidx.activity.compose;

import androidx.activity.d0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.activity.compose.internal.b {
    public final CoroutineScope c;
    public kotlin.jvm.functions.p d;
    public Channel e;
    public Job f;
    public boolean g;

    public q(CoroutineScope coroutineScope, u uVar) {
        super(uVar);
        this.c = coroutineScope;
        this.d = new n(2, 0, null);
    }

    @Override // androidx.activity.compose.internal.b
    public final void e() {
        Channel channel = this.e;
        if (channel != null) {
            channel.cancel(new CancellationException("onBack cancelled"));
        }
        Job job = this.f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // androidx.activity.compose.internal.b
    public final void f() {
        if (this.e != null && !this.g) {
            e();
        }
        kotlin.coroutines.d dVar = null;
        if (this.e == null) {
            this.g = false;
            this.e = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);
            this.f = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new p(this, dVar, 0), 3, null);
        }
        Channel channel = this.e;
        if (channel != null) {
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
        }
        this.g = false;
    }

    @Override // androidx.activity.compose.internal.b
    public final void g(androidx.activity.a aVar) {
        Channel channel = this.e;
        if (channel != null) {
            ChannelResult.m42boximpl(channel.mo28trySendJP2dKIU(aVar));
        }
    }

    @Override // androidx.activity.compose.internal.b
    public final void h() {
        e();
        if (super.d()) {
            this.g = true;
            this.e = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);
            this.f = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new p(this, (kotlin.coroutines.d) null, 0), 3, null);
        }
    }

    public final void j(boolean z) {
        Job job;
        if (!z && super.d() && (job = this.f) != null && !job.isActive()) {
            e();
        }
        ((d0) this.a).e(z);
        ((androidx.activity.compose.internal.a) this.b).f(z);
    }
}
