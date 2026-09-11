package androidx.compose.ui;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.i1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q implements androidx.compose.ui.node.i {
    public q B;
    public q C;
    public i1 D;
    public d1 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public androidx.compose.ui.draw.b J;
    public boolean K;
    public CoroutineScope y;
    public int z;
    public q e = this;
    public int A = -1;

    public boolean A0() {
        return !(this instanceof androidx.compose.foundation.t);
    }

    public void B0() {
        if (this.K) {
            androidx.compose.ui.internal.a.b("node attached multiple times");
        }
        if (this.E == null) {
            androidx.compose.ui.internal.a.b("attach invoked on a node without a coordinator");
        }
        this.K = true;
        this.H = true;
    }

    public void C0() {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("Cannot detach a node that is not attached");
        }
        if (this.H) {
            androidx.compose.ui.internal.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.I) {
            androidx.compose.ui.internal.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.K = false;
        CoroutineScope coroutineScope = this.y;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel(coroutineScope, new s("The Modifier.Node was detached", 2));
            this.y = null;
        }
    }

    public void G0() {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("reset() called on an unattached node");
        }
        F0();
    }

    public void H0() {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.H) {
            androidx.compose.ui.internal.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.H = false;
        D0();
        this.I = true;
    }

    public void I0() {
        if (!this.K) {
            androidx.compose.ui.internal.a.b("node detached multiple times");
        }
        if (this.E == null) {
            androidx.compose.ui.internal.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.I) {
            androidx.compose.ui.internal.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.I = false;
        androidx.compose.ui.draw.b bVar = this.J;
        if (bVar != null) {
            bVar.invoke();
        }
        E0();
    }

    public void J0(q qVar) {
        this.e = qVar;
    }

    public void K0(d1 d1Var) {
        this.E = d1Var;
    }

    public final CoroutineScope z0() {
        CoroutineScope coroutineScope = this.y;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getCoroutineContext().plus(JobKt.Job((Job) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getCoroutineContext().get(Job.Key))));
        this.y = CoroutineScope;
        return CoroutineScope;
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
    }
}
