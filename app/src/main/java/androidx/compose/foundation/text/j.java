package androidx.compose.foundation.text;

import android.os.Trace;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.runtime.snapshots.b bVarC;
        int i = this.e;
        Object obj = this.C;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (i) {
            case 0:
                androidx.compose.ui.text.m0 m0Var = (androidx.compose.ui.text.m0) obj5;
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) obj4;
                String str = (String) obj3;
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) obj2;
                androidx.compose.ui.text.font.d dVar = (androidx.compose.ui.text.font.d) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    androidx.compose.runtime.snapshots.f fVarJ = androidx.compose.runtime.snapshots.n.j();
                    androidx.compose.runtime.snapshots.b bVar = fVarJ instanceof androidx.compose.runtime.snapshots.b ? (androidx.compose.runtime.snapshots.b) fVarJ : null;
                    if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        androidx.compose.runtime.snapshots.f fVarJ2 = bVarC.j();
                        try {
                            androidx.compose.ui.text.m0 m0VarH = androidx.compose.ui.text.d0.h(m0Var, mVar);
                            kotlin.collections.u uVar = kotlin.collections.u.e;
                            new androidx.compose.ui.text.platform.d(str, m0VarH, uVar, uVar, dVar, cVar).c();
                            androidx.compose.runtime.snapshots.f.q(fVarJ2);
                            bVarC.w().d();
                            bVarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            androidx.compose.runtime.snapshots.f.q(fVarJ2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            bVarC.c();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                com.google.common.util.concurrent.a1 a1Var = (com.google.common.util.concurrent.a1) obj5;
                com.google.common.util.concurrent.y0 y0Var = (com.google.common.util.concurrent.y0) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                com.google.common.util.concurrent.f0 f0Var = (com.google.common.util.concurrent.f0) obj;
                if (a1Var.isDone()) {
                    y0Var.n(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i2 = com.google.common.util.concurrent.f0.B;
                        if (f0Var.compareAndSet(com.google.common.util.concurrent.e0.e, com.google.common.util.concurrent.e0.y)) {
                            a1Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
