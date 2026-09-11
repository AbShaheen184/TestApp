package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class StackTraceFrame implements d {
    private final d callerFrame;
    private final StackTraceElement stackTraceElement;

    public StackTraceFrame(d dVar, StackTraceElement stackTraceElement) {
        this.callerFrame = dVar;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public d getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
