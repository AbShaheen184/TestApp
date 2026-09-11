package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.internal.ThreadLocalElement;
import kotlinx.coroutines.internal.ThreadLocalKey;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContextElementKt {
    public static final <T> ThreadContextElement<T> asContextElement(ThreadLocal<T> threadLocal, T t) {
        return new ThreadLocalElement(t, threadLocal);
    }

    public static /* synthetic */ ThreadContextElement asContextElement$default(ThreadLocal threadLocal, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = threadLocal.get();
        }
        return asContextElement(threadLocal, obj);
    }

    public static final Object ensurePresent(ThreadLocal<?> threadLocal, d<? super y> dVar) {
        if (dVar.getContext().get(new ThreadLocalKey(threadLocal)) != null) {
            return y.a;
        }
        StringBuilder sb = new StringBuilder("ThreadLocal ");
        sb.append(threadLocal);
        i context = dVar.getContext();
        sb.append(" is missing from context ");
        sb.append(context);
        throw new IllegalStateException(sb.toString().toString());
    }

    private static final Object ensurePresent$$forInline(ThreadLocal<?> threadLocal, d<? super y> dVar) {
        throw null;
    }

    public static final Object isPresent(ThreadLocal<?> threadLocal, d<? super Boolean> dVar) {
        return Boolean.valueOf(dVar.getContext().get(new ThreadLocalKey(threadLocal)) != null);
    }

    private static final Object isPresent$$forInline(ThreadLocal<?> threadLocal, d<? super Boolean> dVar) {
        throw null;
    }
}
