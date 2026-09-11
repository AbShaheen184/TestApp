package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.text.z0;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.l0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t {
    public Job b;
    public w c;
    public MutableSharedFlow d;

    @Override // androidx.compose.ui.text.input.s
    public final void a(androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.k kVar, androidx.compose.animation.core.a aVar, androidx.compose.foundation.text.s sVar) {
        k(new androidx.activity.compose.c(xVar, this, kVar, aVar, sVar, 3));
    }

    @Override // androidx.compose.ui.text.input.s
    public final void b() {
        k(null);
    }

    @Override // androidx.compose.ui.text.input.s
    public final void d() {
        Job job = this.b;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.b = null;
        MutableSharedFlow mutableSharedFlowJ = j();
        if (mutableSharedFlowJ != null) {
            mutableSharedFlowJ.resetReplayCache();
        }
    }

    @Override // androidx.compose.ui.text.input.s
    public final void f(androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.x xVar2) {
        w wVar = this.c;
        if (wVar != null) {
            boolean z = (l0.b(wVar.h.b, xVar2.b) && kotlin.jvm.internal.l.a(wVar.h.c, xVar2.c)) ? false : true;
            wVar.h = xVar2;
            int size = wVar.j.size();
            for (int i = 0; i < size; i++) {
                x xVar3 = (x) ((WeakReference) wVar.j.get(i)).get();
                if (xVar3 != null) {
                    xVar3.g = xVar2;
                }
            }
            s sVar = wVar.m;
            synchronized (sVar.c) {
                sVar.j = null;
                sVar.l = null;
                sVar.k = null;
                sVar.m = null;
                sVar.n = null;
            }
            if (kotlin.jvm.internal.l.a(xVar, xVar2)) {
                if (z) {
                    o oVar = wVar.b;
                    int iF = l0.f(xVar2.b);
                    int iE = l0.e(xVar2.b);
                    l0 l0Var = wVar.h.c;
                    int iF2 = l0Var != null ? l0.f(l0Var.a) : -1;
                    l0 l0Var2 = wVar.h.c;
                    oVar.l().updateSelection((View) oVar.y, iF, iE, iF2, l0Var2 != null ? l0.e(l0Var2.a) : -1);
                    return;
                }
                return;
            }
            if (xVar != null && (!kotlin.jvm.internal.l.a(xVar.a.y, xVar2.a.y) || (l0.b(xVar.b, xVar2.b) && !kotlin.jvm.internal.l.a(xVar.c, xVar2.c)))) {
                o oVar2 = wVar.b;
                oVar2.l().restartInput((View) oVar2.y);
                return;
            }
            int size2 = wVar.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                x xVar4 = (x) ((WeakReference) wVar.j.get(i2)).get();
                if (xVar4 != null) {
                    androidx.compose.ui.text.input.x xVar5 = wVar.h;
                    o oVar3 = wVar.b;
                    if (xVar4.k) {
                        xVar4.g = xVar5;
                        if (xVar4.i) {
                            oVar3.l().updateExtractedText((View) oVar3.y, xVar4.h, r.d(xVar5));
                        }
                        l0 l0Var3 = xVar5.c;
                        long j = xVar5.b;
                        int iF3 = l0Var3 != null ? l0.f(l0Var3.a) : -1;
                        l0 l0Var4 = xVar5.c;
                        oVar3.l().updateSelection((View) oVar3.y, l0.f(j), l0.e(j), iF3, l0Var4 != null ? l0.e(l0Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.s
    public final void g(androidx.compose.ui.text.input.x xVar, androidx.compose.ui.text.input.q qVar, j0 j0Var, z0 z0Var, androidx.compose.ui.geometry.c cVar, androidx.compose.ui.geometry.c cVar2) {
        w wVar = this.c;
        if (wVar != null) {
            s sVar = wVar.m;
            synchronized (sVar.c) {
                try {
                    sVar.j = xVar;
                    sVar.l = qVar;
                    sVar.k = j0Var;
                    sVar.m = cVar;
                    sVar.n = cVar2;
                    if (sVar.e || sVar.d) {
                        sVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.s
    public final void h(androidx.compose.ui.geometry.c cVar) {
        Rect rect;
        w wVar = this.c;
        if (wVar != null) {
            wVar.l = new Rect(kotlin.math.a.F(cVar.a), kotlin.math.a.F(cVar.b), kotlin.math.a.F(cVar.c), kotlin.math.a.F(cVar.d));
            if (!wVar.j.isEmpty() || (rect = wVar.l) == null) {
                return;
            }
            wVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final MutableSharedFlow j() {
        MutableSharedFlow mutableSharedFlow = this.d;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!androidx.compose.foundation.text.handwriting.e.a) {
            return null;
        }
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.d = mutableSharedFlowMutableSharedFlow$default;
        return mutableSharedFlowMutableSharedFlow$default;
    }

    public final void k(androidx.activity.compose.c cVar) {
        q qVar = this.a;
        if (qVar == null) {
            return;
        }
        Job jobLaunch$default = null;
        byte b = 0;
        androidx.compose.animation.core.f fVar = new androidx.compose.animation.core.f((Object) cVar, (Object) this, (Object) qVar, (kotlin.coroutines.d) (0 == true ? 1 : 0), 2);
        if (qVar.K) {
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(qVar.z0(), null, CoroutineStart.UNDISPATCHED, new androidx.activity.compose.p(qVar, fVar, b == true ? 1 : 0, 11), 1, null);
        }
        this.b = jobLaunch$default;
    }
}
