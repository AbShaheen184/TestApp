package androidx.compose.animation;

import android.content.Context;
import android.view.Choreographer;
import android.view.MotionEvent;
import androidx.compose.ui.node.b2;
import androidx.compose.ui.platform.d3;
import androidx.compose.ui.platform.e3;
import androidx.compose.ui.platform.v1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Object obj2) {
        super(1);
        this.y = i;
        this.z = obj;
        this.A = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.foundation.text.input.internal.x xVar;
        switch (this.y) {
            case 0:
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) this.z;
                float fG = ((l0) this.A).c.g();
                b1Var.getClass();
                long j = 0;
                androidx.compose.ui.layout.b1.b(b1Var, c1Var);
                c1Var.h0(androidx.compose.ui.unit.j.c((j & 4294967295L) | (j << 32), c1Var.B), fG, null);
                return kotlin.y.a;
            case 1:
                androidx.compose.ui.layout.b1.p((androidx.compose.ui.layout.b1) obj, (androidx.compose.ui.layout.c1) this.z, ((androidx.compose.ui.graphics.o) this.A).L);
                return kotlin.y.a;
            case 2:
                androidx.compose.ui.layout.b1.p((androidx.compose.ui.layout.b1) obj, (androidx.compose.ui.layout.c1) this.z, ((androidx.compose.ui.graphics.o0) this.A).W);
                return kotlin.y.a;
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                androidx.compose.ui.input.pointer.a0 a0Var = (androidx.compose.ui.input.pointer.a0) this.A;
                if (motionEvent.getActionMasked() == 0) {
                    ((com.google.firebase.messaging.o) this.z).z = ((Boolean) ((androidx.compose.ui.input.pointer.b0) a0Var.e()).invoke(motionEvent)).booleanValue() ? androidx.compose.ui.input.pointer.z.y : androidx.compose.ui.input.pointer.z.z;
                } else {
                    ((androidx.compose.ui.input.pointer.b0) a0Var.e()).invoke(motionEvent);
                }
                return kotlin.y.a;
            case 4:
                Context context = (Context) this.z;
                Context applicationContext = context.getApplicationContext();
                androidx.compose.ui.platform.k0 k0Var = (androidx.compose.ui.platform.k0) this.A;
                applicationContext.registerComponentCallbacks(k0Var);
                return new androidx.activity.compose.k(8, context, k0Var);
            case 5:
                Context context2 = (Context) this.z;
                Context applicationContext2 = context2.getApplicationContext();
                androidx.compose.ui.platform.l0 l0Var = (androidx.compose.ui.platform.l0) this.A;
                applicationContext2.registerComponentCallbacks(l0Var);
                return new androidx.activity.compose.k(9, context2, l0Var);
            case 6:
                return new v1((androidx.compose.foundation.text.input.internal.w) this.z, new z((androidx.compose.ui.platform.o0) this.A, 8));
            case 7:
                v1 v1Var = (v1) this.z;
                synchronized (v1Var.c) {
                    try {
                        v1Var.e = true;
                        androidx.compose.runtime.collection.b bVar = v1Var.d;
                        Object[] objArr = bVar.e;
                        int i = bVar.z;
                        for (int i2 = 0; i2 < i; i2++) {
                            androidx.compose.ui.text.input.m mVar = (androidx.compose.ui.text.input.m) ((b2) objArr[i2]).get();
                            if (mVar != null && (xVar = mVar.b) != null) {
                                xVar.closeConnection();
                                mVar.b = null;
                            }
                        }
                        v1Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                androidx.compose.ui.text.input.y yVar = ((androidx.compose.ui.platform.o0) this.A).y;
                yVar.b.set(null);
                yVar.a.d();
                return kotlin.y.a;
            case 8:
                androidx.compose.ui.platform.s0 s0Var = (androidx.compose.ui.platform.s0) this.z;
                androidx.compose.ui.platform.t0 t0Var = (androidx.compose.ui.platform.t0) this.A;
                synchronized (s0Var.z) {
                    s0Var.B.remove(t0Var);
                }
                return kotlin.y.a;
            case 9:
                ((Choreographer) ((androidx.compose.runtime.e) this.z).y).removeFrameCallback((androidx.compose.ui.platform.t0) this.A);
                return kotlin.y.a;
            case 10:
                androidx.compose.ui.platform.l lVar = (androidx.compose.ui.platform.l) obj;
                kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.A;
                e3 e3Var = (e3) this.z;
                if (!e3Var.z) {
                    androidx.lifecycle.p lifecycle = lVar.a.getLifecycle();
                    e3Var.B = pVar;
                    if (e3Var.A == null) {
                        e3Var.A = lifecycle;
                        lifecycle.a(e3Var);
                    } else if (((androidx.lifecycle.x) lifecycle).d.compareTo(androidx.lifecycle.o.z) >= 0) {
                        e3Var.y.B(new androidx.compose.runtime.internal.f(1330788943, true, new d3(e3Var, pVar, 1)));
                    }
                }
                return kotlin.y.a;
            case 11:
                ((androidx.compose.ui.node.f0) this.z).d0(((androidx.compose.ui.r) obj).d((androidx.compose.ui.r) this.A));
                return kotlin.y.a;
            case 12:
                androidx.compose.ui.window.z zVar = (androidx.compose.ui.window.z) this.z;
                zVar.setPositionProvider((androidx.compose.ui.window.c0) this.A);
                zVar.n();
                return new androidx.compose.ui.window.j();
            default:
                Throwable th2 = (Throwable) obj;
                androidx.concurrent.futures.i iVar = (androidx.concurrent.futures.i) this.z;
                if (th2 == null) {
                    Object completed = ((Deferred) this.A).getCompleted();
                    iVar.d = true;
                    androidx.concurrent.futures.k kVar = iVar.b;
                    if (kVar != null && kVar.y.l(completed)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar.d = true;
                    androidx.concurrent.futures.k kVar2 = iVar.b;
                    if (kVar2 != null && kVar2.y.cancel(true)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                } else {
                    iVar.d = true;
                    androidx.concurrent.futures.k kVar3 = iVar.b;
                    if (kVar3 != null && kVar3.y.m(th2)) {
                        iVar.a = null;
                        iVar.b = null;
                        iVar.c = null;
                    }
                }
                return kotlin.y.a;
        }
    }
}
