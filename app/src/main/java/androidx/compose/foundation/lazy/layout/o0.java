package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.l2;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public Job a;
    public androidx.compose.animation.core.n b;

    public o0() {
        l2 l2Var = androidx.compose.animation.core.e.j;
        Float fValueOf = Float.valueOf(0.0f);
        this.b = new androidx.compose.animation.core.n(l2Var, fValueOf, (androidx.compose.animation.core.s) l2Var.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a(float f, androidx.compose.ui.unit.c cVar, CoroutineScope coroutineScope) {
        if (f <= cVar.V(p0.a)) {
            return;
        }
        androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
        kotlin.coroutines.d dVar = null;
        kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
        androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
        try {
            float fFloatValue = ((Number) this.b.y.getValue()).floatValue();
            Job job = this.a;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            androidx.compose.animation.core.n nVar = this.b;
            if (nVar.C) {
                this.b = androidx.compose.animation.core.e.h(nVar, fFloatValue - f);
            } else {
                this.b = new androidx.compose.animation.core.n(androidx.compose.animation.core.e.j, Float.valueOf(-f), null, 60);
            }
            this.a = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.c1(this, dVar, 8), 3, null);
        } finally {
            androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
        }
    }
}
