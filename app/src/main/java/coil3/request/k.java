package coil3.request;

import androidx.lifecycle.v;
import java.util.concurrent.CancellationException;
import kotlin.y;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o, androidx.lifecycle.f {
    public final androidx.lifecycle.p e;
    public final Job y;

    public k(androidx.lifecycle.p pVar, Job job) {
        this.e = pVar;
        this.y = job;
    }

    @Override // coil3.request.o
    public final Object b(coil3.p pVar) throws Throwable {
        Object objJ = kotlin.math.a.j(this.e, pVar);
        return objJ == kotlin.coroutines.intrinsics.a.e ? objJ : y.a;
    }

    @Override // coil3.request.o
    public final void complete() {
        this.e.b(this);
    }

    @Override // coil3.request.o
    public final void start() {
        this.e.a(this);
    }

    @Override // androidx.lifecycle.f
    public final void w(v vVar) {
        Job.DefaultImpls.cancel$default(this.y, (CancellationException) null, 1, (Object) null);
    }
}
