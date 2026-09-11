package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final p countAll;
    private static final p findOne;
    private static final p updateState;

    static {
        final int i = 1;
        countAll = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (g) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (g) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (g) obj2);
                }
            }
        };
        final int i2 = 2;
        findOne = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (g) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (g) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (g) obj2);
                }
            }
        };
        final int i3 = 0;
        updateState = new p() { // from class: kotlinx.coroutines.internal.b
            @Override // kotlin.jvm.functions.p
            public final Object invoke(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        return ThreadContextKt.updateState$lambda$2((ThreadState) obj, (g) obj2);
                    case 1:
                        return ThreadContextKt.countAll$lambda$0(obj, (g) obj2);
                    default:
                        return ThreadContextKt.findOne$lambda$1((ThreadContextElement) obj, (g) obj2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, g gVar) {
        if (!(gVar instanceof ThreadContextElement)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadContextElement<?> findOne$lambda$1(ThreadContextElement<?> threadContextElement, g gVar) {
        if (threadContextElement != null) {
            return threadContextElement;
        }
        if (gVar instanceof ThreadContextElement) {
            return (ThreadContextElement) gVar;
        }
        return null;
    }

    public static final void restoreThreadContext(i iVar, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(iVar);
            return;
        }
        Object objFold = iVar.fold(null, findOne);
        objFold.getClass();
        ((ThreadContextElement) objFold).restoreThreadContext(iVar, obj);
    }

    public static final Object threadContextElements(i iVar) {
        Object objFold = iVar.fold(0, countAll);
        objFold.getClass();
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, g gVar) {
        if (gVar instanceof ThreadContextElement) {
            ThreadContextElement<?> threadContextElement = (ThreadContextElement) gVar;
            threadState.append(threadContextElement, threadContextElement.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(i iVar, Object obj) {
        if (obj == null) {
            obj = threadContextElements(iVar);
        }
        if (obj == 0) {
            return NO_THREAD_ELEMENTS;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new ThreadState(iVar, ((Number) obj).intValue()), updateState);
        }
        obj.getClass();
        return ((ThreadContextElement) obj).updateThreadContext(iVar);
    }
}
