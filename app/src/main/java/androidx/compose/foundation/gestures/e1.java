package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ Channel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Channel channel, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e1 e1Var = new e1(this.z, dVar);
        e1Var.y = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        int i = this.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.y, null, null, new d1(2, 0, null), 3, null);
                Channel channel = this.z;
                this.y = jobLaunch$default;
                this.e = 1;
                obj = channel.receive(this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jobLaunch$default = (Job) this.y;
                kotlin.a.e(obj);
            }
            c1 c1Var = (c1) obj;
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            return c1Var;
        } catch (Throwable th) {
            Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }
}
