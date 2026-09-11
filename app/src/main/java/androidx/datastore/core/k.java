package androidx.datastore.core;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new k(this.z, dVar, 0);
            case 1:
                return new k(this.z, dVar, 1);
            default:
                return new k(this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((k) create((FlowCollector) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            case 1:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    this.y = 1;
                    Object objE = z.e(this.z, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 1:
                int i2 = this.y;
                kotlin.y yVar = kotlin.y.a;
                z zVar = this.z;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    com.google.firebase.messaging.o oVar = zVar.i;
                    this.y = 1;
                    Object objAwait = ((CompletableDeferred) oVar.z).await(this);
                    if (objAwait != aVar2) {
                        objAwait = yVar;
                    }
                    if (objAwait != aVar2) {
                    }
                    return aVar2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Flow flowConflate = FlowKt.conflate(zVar.i().e());
                androidx.compose.foundation.text.input.internal.a aVar3 = new androidx.compose.foundation.text.input.internal.a(zVar, 2);
                this.y = 2;
                if (flowConflate.collect(aVar3, this) != aVar2) {
                    return yVar;
                }
                return aVar2;
            default:
                z zVar2 = this.z;
                a0 a0Var = zVar2.h;
                int i3 = this.y;
                kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            kotlin.a.e(obj);
                        } else {
                            if (i3 != 2) {
                                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.a.e(obj);
                        }
                        return (g1) obj;
                    }
                    kotlin.a.e(obj);
                    if (a0Var.b() instanceof j0) {
                        return a0Var.b();
                    }
                    this.y = 1;
                    if (z.f(zVar2, this) == aVar4) {
                        return aVar4;
                    }
                    this.y = 2;
                    obj = z.g(zVar2, false, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    return (g1) obj;
                } catch (Throwable th) {
                    return new w0(th, -1);
                }
        }
    }
}
