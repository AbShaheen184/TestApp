package androidx.compose.runtime;

import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.compose.runtime.internal.b {
    public CancellableContinuationImpl a;
    public kotlin.jvm.functions.l b;

    @Override // androidx.compose.runtime.internal.b
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // androidx.compose.runtime.internal.b
    public final void b(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.a;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.resumeWith(kotlin.a.b(th));
        }
    }
}
