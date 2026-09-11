package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StackFrameContinuation<T> implements d<T>, kotlin.coroutines.jvm.internal.d {
    private final i context;
    private final d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(d<? super T> dVar, i iVar) {
        this.uCont = dVar;
        this.context = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d<T> dVar = this.uCont;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public i getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
