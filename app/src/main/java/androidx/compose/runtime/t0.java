package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements z1, CoroutineExceptionHandler {
    public Job A;
    public final kotlin.coroutines.i e;
    public final kotlin.jvm.functions.p y;
    public final CoroutineScope z;

    public t0(kotlin.coroutines.i iVar, kotlin.jvm.functions.p pVar) {
        this.e = iVar;
        this.y = pVar;
        this.z = CoroutineScopeKt.CoroutineScope(iVar.plus(this));
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
        Job job = this.A;
        if (job != null) {
            job.cancel((CancellationException) new k0(1));
        }
        this.A = null;
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
        Job job = this.A;
        if (job != null) {
            job.cancel((CancellationException) new k0(1));
        }
        this.A = null;
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
        Job job = this.A;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        this.A = BuildersKt__Builders_commonKt.launch$default(this.z, null, null, this.y, 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.i
    public final /* bridge */ Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        return CoroutineExceptionHandler.DefaultImpls.fold(this, obj, pVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        return CoroutineExceptionHandler.DefaultImpls.get(this, hVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.g
    public final kotlin.coroutines.h getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(kotlin.coroutines.i iVar, Throwable th) throws Throwable {
        androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) iVar.get(androidx.compose.runtime.tooling.d.y);
        if (dVar != null) {
            okhttp3.internal.platform.android.g.L(th, new androidx.activity.compose.f(16, dVar, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.e.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(iVar, th);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i minusKey(kotlin.coroutines.h hVar) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, hVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler, kotlin.coroutines.i
    public final /* bridge */ kotlin.coroutines.i plus(kotlin.coroutines.i iVar) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, iVar);
    }
}
