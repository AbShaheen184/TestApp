package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ b3 A;
    public final /* synthetic */ c B;
    public final /* synthetic */ long C;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, b3 b3Var, c cVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = jVar;
        this.A = b3Var;
        this.B = cVar;
        this.C = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        i iVar = new i(this.z, this.A, this.B, this.C, dVar);
        iVar.y = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.z;
        com.app.mlounge.data.music.e eVar = jVar.P;
        int i = this.e;
        try {
            try {
                if (i == 0) {
                    kotlin.a.e(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.y).getCoroutineContext());
                    jVar.S = true;
                    m2 m2Var = jVar.M;
                    androidx.compose.foundation.i1 i1Var = androidx.compose.foundation.i1.e;
                    h hVar = new h(this.A, jVar, this.B, this.C, job, null);
                    this.e = 1;
                    Object objF = m2Var.f(i1Var, hVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                eVar.A();
                jVar.S = false;
                eVar.h(null);
                jVar.Q = false;
                return kotlin.y.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            jVar.S = false;
            eVar.h(null);
            jVar.Q = false;
            throw th;
        }
    }
}
