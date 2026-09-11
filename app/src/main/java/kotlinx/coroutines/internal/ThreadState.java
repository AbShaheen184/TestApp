package kotlinx.coroutines.internal;

import kotlin.coroutines.i;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class ThreadState {
    public final i context;
    private final ThreadContextElement<Object>[] elements;
    private int i;
    private final Object[] values;

    public ThreadState(i iVar, int i) {
        this.context = iVar;
        this.values = new Object[i];
        this.elements = new ThreadContextElement[i];
    }

    public final void append(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.elements;
        this.i = i + 1;
        threadContextElement.getClass();
        threadContextElementArr[i] = threadContextElement;
    }

    public final void restore(i iVar) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement<Object> threadContextElement = this.elements[length];
            threadContextElement.getClass();
            threadContextElement.restoreThreadContext(iVar, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
