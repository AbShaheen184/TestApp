package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements CoroutineScope, z1 {
    public static final h A = new h();
    public final kotlin.coroutines.i e;
    public final c2 y = this;
    public volatile kotlin.coroutines.i z;

    public c2(kotlin.coroutines.i iVar) {
        this.e = iVar;
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
        d();
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
        d();
    }

    public final void d() {
        synchronized (this.y) {
            try {
                kotlin.coroutines.i iVar = this.z;
                if (iVar == null) {
                    this.z = A;
                } else {
                    JobKt.cancel(iVar, (CancellationException) new k0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.i getCoroutineContext() {
        kotlin.coroutines.i iVarPlus;
        kotlin.coroutines.i iVar = this.z;
        if (iVar == null || iVar == A) {
            androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) this.e.get(androidx.compose.runtime.tooling.d.y);
            kotlin.coroutines.i b2Var = dVar != null ? new b2(CoroutineExceptionHandler.Key, dVar, this) : kotlin.coroutines.j.e;
            synchronized (this.y) {
                try {
                    iVarPlus = this.z;
                    if (iVarPlus == null) {
                        kotlin.coroutines.i iVar2 = this.e;
                        iVarPlus = iVar2.plus(JobKt.Job((Job) iVar2.get(Job.Key))).plus(kotlin.coroutines.j.e).plus(b2Var);
                    } else if (iVarPlus == A) {
                        kotlin.coroutines.i iVar3 = this.e;
                        CompletableJob completableJobJob = JobKt.Job((Job) iVar3.get(Job.Key));
                        completableJobJob.cancel((CancellationException) new k0(0));
                        iVarPlus = iVar3.plus(completableJobJob).plus(kotlin.coroutines.j.e).plus(b2Var);
                    }
                    this.z = iVarPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar = iVarPlus;
        }
        iVar.getClass();
        return iVar;
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
    }
}
