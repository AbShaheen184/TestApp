package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.util.List;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.i;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DebuggerInfo implements Serializable {
    private final Long coroutineId;
    private final String dispatcher;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final String lastObservedThreadName;
    private final String lastObservedThreadState;
    private final String name;
    private final long sequenceNumber;
    private final String state;

    public DebuggerInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, i iVar) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) iVar.get(CoroutineId.Key);
        this.coroutineId = coroutineId != null ? Long.valueOf(coroutineId.getId()) : null;
        f fVar = (f) iVar.get(e.e);
        this.dispatcher = fVar != null ? fVar.toString() : null;
        CoroutineName coroutineName = (CoroutineName) iVar.get(CoroutineName.Key);
        this.name = coroutineName != null ? coroutineName.getName() : null;
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
    }

    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    public final String getDispatcher() {
        return this.dispatcher;
    }

    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }
}
