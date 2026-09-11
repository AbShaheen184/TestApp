package coil3.compose;

import android.os.Trace;
import androidx.compose.animation.b0;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.node.h0;
import androidx.room.z;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.compose.ui.graphics.painter.b implements z1 {
    public static final z T = new z(1);
    public androidx.compose.ui.graphics.m E;
    public boolean F;
    public Job G;
    public CoroutineScope I;
    public kotlin.jvm.functions.l K;
    public m N;
    public c O;
    public final MutableStateFlow P;
    public final StateFlow Q;
    public final MutableStateFlow R;
    public final StateFlow S;
    public final h1 C = androidx.compose.runtime.s.r(null);
    public float D = 1.0f;
    public long H = 9205357640488583168L;
    public kotlin.jvm.functions.l J = T;
    public androidx.compose.ui.layout.j L = androidx.compose.ui.layout.i.b;
    public int M = 1;

    public i(c cVar) {
        this.O = cVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(cVar);
        this.P = MutableStateFlow;
        this.Q = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(d.a);
        this.R = MutableStateFlow2;
        this.S = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final coil3.request.g j(i iVar, coil3.request.g gVar, boolean z) {
        coil3.request.d dVarA = coil3.request.g.a(gVar);
        dVarA.d = new androidx.media3.common.util.b(29, gVar, iVar);
        coil3.request.f fVar = gVar.s;
        if (fVar.g == null) {
            dVarA.l = coil3.size.i.a;
        }
        if (fVar.h == null) {
            androidx.compose.ui.layout.j jVar = iVar.L;
            int i = coil3.compose.internal.h.b;
            dVarA.m = (kotlin.jvm.internal.l.a(jVar, androidx.compose.ui.layout.i.b) || kotlin.jvm.internal.l.a(jVar, androidx.compose.ui.layout.i.c)) ? coil3.size.g.y : coil3.size.g.e;
        }
        if (fVar.i == null) {
            dVarA.n = coil3.size.d.y;
        }
        if (z) {
            kotlin.coroutines.j jVar2 = kotlin.coroutines.j.e;
            dVarA.f = jVar2;
            dVarA.g = jVar2;
            dVarA.h = jVar2;
        }
        return dVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void k(i iVar, h hVar) {
        coil3.request.j jVar;
        androidx.compose.ui.graphics.painter.b bVarA;
        kotlin.jvm.functions.l lVar;
        Object objA;
        z1 z1Var;
        z1 z1Var2;
        MutableStateFlow mutableStateFlow = iVar.R;
        h hVar2 = (h) mutableStateFlow.getValue();
        h hVar3 = (h) iVar.J.invoke(hVar);
        mutableStateFlow.setValue(hVar3);
        androidx.compose.ui.layout.j jVar2 = iVar.L;
        if (!(hVar3 instanceof g)) {
            if (hVar3 instanceof e) {
                jVar = ((e) hVar3).b;
            } else {
                bVarA = null;
            }
            if (bVarA == null) {
                bVarA = hVar3.a();
            }
            iVar.C.setValue(bVarA);
            if (hVar2.a() != hVar3.a()) {
                objA = hVar2.a();
                if (objA instanceof z1) {
                    z1Var = (z1) objA;
                } else {
                    z1Var = null;
                }
                if (z1Var != null) {
                    z1Var.b();
                }
                Object objA2 = hVar3.a();
                z1Var2 = objA2 instanceof z1 ? (z1) objA2 : null;
                if (z1Var2 != null) {
                    z1Var2.c();
                }
            }
            lVar = iVar.K;
            if (lVar != null) {
                lVar.invoke(hVar3);
            }
        }
        jVar = ((g) hVar3).b;
        coil3.transition.g gVarA = ((coil3.transition.f) coil3.m.d(jVar.b(), coil3.request.i.a)).a(k.a, jVar);
        if (gVarA instanceof coil3.transition.c) {
            androidx.compose.ui.graphics.painter.b bVarA2 = hVar2.a();
            if (!(hVar2 instanceof f)) {
                bVarA2 = null;
            }
            androidx.compose.ui.graphics.painter.b bVarA3 = hVar3.a();
            kotlin.time.g gVar = kotlin.time.a.y;
            bVarA = new p(bVarA2, bVarA3, jVar2, com.google.common.base.b.u(((coil3.transition.c) gVarA).c, kotlin.time.c.MILLISECONDS), ((jVar instanceof coil3.request.p) && ((coil3.request.p) jVar).g) ? false : true, ((Boolean) coil3.m.d(jVar.b(), k.c)).booleanValue());
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            bVarA = hVar3.a();
        }
        iVar.C.setValue(bVarA);
        if (hVar2.a() != hVar3.a()) {
            objA = hVar2.a();
            if (objA instanceof z1) {
                z1Var = (z1) objA;
            } else {
                z1Var = null;
            }
            if (z1Var != null) {
                z1Var.b();
            }
            Object objA3 = hVar3.a();
            if (objA3 instanceof z1) {
            }
            if (z1Var2 != null) {
                z1Var2.c();
            }
        }
        lVar = iVar.K;
        if (lVar != null) {
            lVar.invoke(hVar3);
        }
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
        Job job = this.G;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.G = null;
        Object objL = l();
        z1 z1Var = objL instanceof z1 ? (z1) objL : null;
        if (z1Var != null) {
            z1Var.a();
        }
        this.F = false;
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
        Job job = this.G;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.G = null;
        Object objL = l();
        z1 z1Var = objL instanceof z1 ? (z1) objL : null;
        if (z1Var != null) {
            z1Var.b();
        }
        this.F = false;
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objL = l();
            z1 z1Var = objL instanceof z1 ? (z1) objL : null;
            if (z1Var != null) {
                z1Var.c();
            }
            m();
            this.F = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.D = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(androidx.compose.ui.graphics.m mVar) {
        this.E = mVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        androidx.compose.ui.graphics.painter.b bVarL = l();
        if (bVarL != null) {
            return bVarL.h();
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jD = bVar.d();
        if (!androidx.compose.ui.geometry.e.a(this.H, jD)) {
            this.H = jD;
        }
        androidx.compose.ui.graphics.painter.b bVarL = l();
        if (bVarL != null) {
            bVarL.g(h0Var, bVar.d(), this.D, this.E);
        }
    }

    public final androidx.compose.ui.graphics.painter.b l() {
        return (androidx.compose.ui.graphics.painter.b) this.C.getValue();
    }

    public final void m() {
        c cVar = this.O;
        if (cVar == null) {
            return;
        }
        CoroutineScope coroutineScope = this.I;
        if (coroutineScope == null) {
            kotlin.jvm.internal.l.f("scope");
            throw null;
        }
        b0 b0Var = new b0(this, cVar, (kotlin.coroutines.d) null, 24);
        kotlin.coroutines.i coroutineContext = coroutineScope.getCoroutineContext();
        int i = coil3.compose.internal.h.b;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.Key);
        Job jobLaunch = (coroutineDispatcher == null || coroutineDispatcher.equals(Dispatchers.getUnconfined())) ? BuildersKt.launch(coroutineScope, Dispatchers.getUnconfined(), CoroutineStart.UNDISPATCHED, b0Var) : BuildersKt.launch(CoroutineScopeKt.CoroutineScope(new coil3.compose.internal.d(coroutineScope.getCoroutineContext())), new coil3.compose.internal.e(coroutineDispatcher), CoroutineStart.UNDISPATCHED, b0Var);
        Job job = this.G;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.G = jobLaunch;
    }

    public final void n(c cVar) {
        if (kotlin.jvm.internal.l.a(this.O, cVar)) {
            return;
        }
        this.O = cVar;
        if (cVar == null) {
            Job job = this.G;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.G = null;
        } else if (this.F) {
            m();
        }
        if (cVar != null) {
            this.P.setValue(cVar);
        }
    }
}
