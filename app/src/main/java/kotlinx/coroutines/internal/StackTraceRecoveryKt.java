package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.k;
import kotlin.l;
import kotlin.m;
import kotlin.text.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = _COROUTINE.a.f(new Exception(), _COROUTINE.a.class.getSimpleName());
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object lVar;
        Object lVar2;
        try {
            lVar = kotlin.coroutines.jvm.internal.a.class.getCanonicalName();
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (m.a(lVar) != null) {
            lVar = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) lVar;
        try {
            lVar2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            lVar2 = new l(th2);
        }
        if (m.a(lVar2) != null) {
            lVar2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) lVar2;
    }

    private static final <E extends Throwable> k causeAndStacktrace(E e) {
        Throwable cause = e.getCause();
        if (cause == null || !cause.getClass().equals(e.getClass())) {
            return new k(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return new k(cause, stackTrace);
            }
        }
        return new k(e, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i = 0;
        if (iFirstFrameIndex == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i2 = 0; i2 < iFirstFrameIndex; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + iFirstFrameIndex] = (StackTraceElement) it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(d dVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = dVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            dVar = dVar.getCallerFrame();
            if (dVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = dVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.l.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.l.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.l.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (kotlin.jvm.internal.l.a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return r.O(stackTraceElement.getClassName(), "_COROUTINE", false);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e, d dVar) {
        k kVarCauseAndStacktrace = causeAndStacktrace(e);
        Throwable th = (Throwable) kVarCauseAndStacktrace.e;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) kVarCauseAndStacktrace.y;
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (thTryCopyException != null) {
            ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(dVar);
            if (!arrayDequeCreateStackTrace.isEmpty()) {
                if (th != e) {
                    mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
                }
                return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
            }
        }
        return e;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i = length2 - 1;
            if (kotlin.jvm.internal.l.a(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                break;
            }
            if (i < 0) {
                length2 = -1;
                break;
            }
            length2 = i;
        }
        int i2 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i3 = 0;
        int i4 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends Throwable> E unwrapImpl(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && e2.getClass().equals(e.getClass())) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e2;
                }
            }
        }
        return e;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e, kotlin.coroutines.d<?> dVar) {
        return e;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e) {
        return e;
    }

    public static final <E extends Throwable> E unwrap(E e) {
        return e;
    }

    public static final Object recoverAndThrow(Throwable th, kotlin.coroutines.d<?> dVar) throws Throwable {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, kotlin.coroutines.d<?> dVar) throws Throwable {
        throw th;
    }
}
