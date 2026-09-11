package androidx.compose.runtime;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.coroutines.g {
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public e(e eVar) {
        this.e = 1;
        this.y = eVar;
        this.z = new androidx.compose.foundation.lazy.layout.b1(1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    public final Object a(kotlin.coroutines.d dVar, kotlin.jvm.functions.l lVar) {
        i1 i1Var;
        boolean z;
        Object result;
        switch (this.e) {
            case 0:
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
                cancellableContinuationImpl.initCancellability();
                androidx.compose.runtime.internal.c cVar = (androidx.compose.runtime.internal.c) this.z;
                d dVar2 = new d();
                dVar2.a = cancellableContinuationImpl;
                dVar2.b = lVar;
                cancellableContinuationImpl.invokeOnCancellation(new androidx.compose.foundation.text.z0(cVar.m(dVar2, (r1) this.y), 1));
                return cancellableContinuationImpl.getResult();
            case 1:
                if (dVar instanceof i1) {
                    i1Var = (i1) dVar;
                    int i = i1Var.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        i1Var.A = i - Integer.MIN_VALUE;
                    } else {
                        i1Var = new i1(this, dVar);
                    }
                } else {
                    i1Var = new i1(this, dVar);
                }
                Object obj = i1Var.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i2 = i1Var.A;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.z;
                    i1Var.e = lVar;
                    i1Var.A = 1;
                    synchronized (b1Var.y) {
                        z = b1Var.e;
                    }
                    if (z) {
                        result = kotlin.y.a;
                    } else {
                        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(com.google.android.material.shape.e.g(i1Var), 1);
                        cancellableContinuationImpl2.initCancellability();
                        synchronized (b1Var.y) {
                            ((ArrayList) b1Var.z).add(cancellableContinuationImpl2);
                        }
                        cancellableContinuationImpl2.invokeOnCancellation(new androidx.compose.foundation.text.c0(2, b1Var, cancellableContinuationImpl2));
                        result = cancellableContinuationImpl2.getResult();
                        if (result != aVar) {
                            result = kotlin.y.a;
                        }
                    }
                    if (result != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = i1Var.e;
                kotlin.a.e(obj);
                e eVar = (e) this.y;
                i1Var.e = null;
                i1Var.A = 2;
                Object objA = eVar.a(i1Var, lVar);
                if (objA != aVar) {
                    return objA;
                }
                return aVar;
            default:
                androidx.compose.ui.platform.s0 s0Var = (androidx.compose.ui.platform.s0) this.z;
                CancellableContinuationImpl cancellableContinuationImpl3 = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
                cancellableContinuationImpl3.initCancellability();
                androidx.compose.ui.platform.t0 t0Var = new androidx.compose.ui.platform.t0(cancellableContinuationImpl3, this, lVar);
                if (kotlin.jvm.internal.l.a(s0Var.e, (Choreographer) this.y)) {
                    synchronized (s0Var.z) {
                        s0Var.B.add(t0Var);
                        if (!s0Var.E) {
                            s0Var.E = true;
                            s0Var.e.postFrameCallback(s0Var.F);
                        }
                        break;
                    }
                    cancellableContinuationImpl3.invokeOnCancellation(new androidx.compose.animation.c(8, s0Var, t0Var));
                } else {
                    ((Choreographer) this.y).postFrameCallback(t0Var);
                    cancellableContinuationImpl3.invokeOnCancellation(new androidx.compose.animation.c(9, this, t0Var));
                }
                return cancellableContinuationImpl3.getResult();
        }
    }

    @Override // kotlin.coroutines.i
    public final Object fold(Object obj, kotlin.jvm.functions.p pVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.material.resources.g.d(this, obj, pVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.g get(kotlin.coroutines.h hVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.material.resources.g.f(this, hVar);
    }

    @Override // kotlin.coroutines.g
    public kotlin.coroutines.h getKey() {
        return f.z;
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.i minusKey(kotlin.coroutines.h hVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.material.resources.g.h(this, hVar);
    }

    @Override // kotlin.coroutines.i
    public final kotlin.coroutines.i plus(kotlin.coroutines.i iVar) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return com.google.android.material.resources.g.k(iVar, this);
    }

    public e(Choreographer choreographer, androidx.compose.ui.platform.s0 s0Var) {
        this.e = 2;
        this.y = choreographer;
        this.z = s0Var;
    }

    public e(r1 r1Var) {
        this.e = 0;
        this.y = r1Var;
        this.z = new androidx.compose.runtime.internal.c();
    }
}
