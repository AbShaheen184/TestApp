package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends CoroutineDispatcher {
    public static final kotlin.o H = new kotlin.o(j0.E);
    public static final q0 I = new q0(0);
    public boolean D;
    public boolean E;
    public final androidx.compose.runtime.e G;
    public final Choreographer e;
    public final Handler y;
    public final Object z = new Object();
    public final kotlin.collections.k A = new kotlin.collections.k();
    public ArrayList B = new ArrayList();
    public ArrayList C = new ArrayList();
    public final r0 F = new r0(this);

    public s0(Choreographer choreographer, Handler handler) {
        this.e = choreographer;
        this.y = handler;
        this.G = new androidx.compose.runtime.e(choreographer, this);
    }

    public static final void a(s0 s0Var) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (s0Var.z) {
                kotlin.collections.k kVar = s0Var.A;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (s0Var.z) {
                    kotlin.collections.k kVar2 = s0Var.A;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (s0Var.z) {
                if (s0Var.A.isEmpty()) {
                    z = false;
                    s0Var.D = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo86dispatch(kotlin.coroutines.i iVar, Runnable runnable) {
        synchronized (this.z) {
            this.A.addLast(runnable);
            if (!this.D) {
                this.D = true;
                this.y.post(this.F);
                if (!this.E) {
                    this.E = true;
                    this.e.postFrameCallback(this.F);
                }
            }
        }
    }
}
