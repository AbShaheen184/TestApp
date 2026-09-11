package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadLocalElement<T> implements ThreadContextElement<T> {
    private final h key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal) {
        this.value = t;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    public <R> R fold(R r, p pVar) {
        return (R) ThreadContextElement.DefaultImpls.fold(this, r, pVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    public <E extends g> E get(h hVar) {
        if (l.a(getKey(), hVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.g
    public h getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    public i minusKey(h hVar) {
        return l.a(getKey(), hVar) ? j.e : this;
    }

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    public i plus(i iVar) {
        return ThreadContextElement.DefaultImpls.plus(this, iVar);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(i iVar, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(i iVar) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
