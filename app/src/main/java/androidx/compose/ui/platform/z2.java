package androidx.compose.ui.platform;

import android.view.View;
import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 implements androidx.lifecycle.t {
    public final /* synthetic */ kotlin.jvm.internal.z A;
    public final /* synthetic */ View B;
    public final /* synthetic */ CoroutineScope e;
    public final /* synthetic */ androidx.compose.runtime.e y;
    public final /* synthetic */ androidx.compose.runtime.w1 z;

    public z2(CoroutineScope coroutineScope, androidx.compose.runtime.e eVar, androidx.compose.runtime.w1 w1Var, kotlin.jvm.internal.z zVar, View view) {
        this.e = coroutineScope;
        this.y = eVar;
        this.z = w1Var;
        this.A = zVar;
        this.B = view;
    }

    @Override // androidx.lifecycle.t
    public final void g(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        CancellableContinuation cancellableContinuationY;
        boolean z;
        switch (x2.a[nVar.ordinal()]) {
            case 1:
                BuildersKt__Builders_commonKt.launch$default(this.e, null, CoroutineStart.UNDISPATCHED, new y2(this.A, this.z, vVar, this, this.B, null), 1, null);
                return;
            case 2:
                androidx.compose.runtime.e eVar = this.y;
                if (eVar != null) {
                    androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) eVar.z;
                    synchronized (b1Var.y) {
                        try {
                            synchronized (b1Var.y) {
                                z = b1Var.e;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) b1Var.z;
                                b1Var.z = (ArrayList) b1Var.A;
                                b1Var.A = arrayList;
                                b1Var.e = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((kotlin.coroutines.d) arrayList.get(i)).resumeWith(kotlin.y.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                androidx.compose.runtime.w1 w1Var = this.z;
                synchronized (w1Var.c) {
                    if (w1Var.t) {
                        w1Var.t = false;
                        cancellableContinuationY = w1Var.y();
                    } else {
                        cancellableContinuationY = null;
                    }
                    break;
                }
                if (cancellableContinuationY != null) {
                    cancellableContinuationY.resumeWith(kotlin.y.a);
                    return;
                }
                return;
            case 3:
                androidx.compose.runtime.w1 w1Var2 = this.z;
                synchronized (w1Var2.c) {
                    w1Var2.t = true;
                }
                return;
            case 4:
                this.z.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                coil3.g.a();
                return;
        }
    }
}
