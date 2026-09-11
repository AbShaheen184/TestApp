package kotlinx.coroutines.debug.internal;

import com.google.android.material.resources.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.sequences.j;
import kotlin.y;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugCoroutineInfoImpl {
    private final WeakReference<i> _context;
    public volatile WeakReference<d> _lastObservedFrame;
    public volatile String _state = DebugCoroutineInfoImplKt.CREATED;
    private final StackTraceFrame creationStackBottom;
    public volatile Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", l = {Token.TO_DOUBLE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements p {
        final /* synthetic */ StackTraceFrame $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StackTraceFrame stackTraceFrame, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$bottom = stackTraceFrame;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = DebugCoroutineInfoImpl.this.new AnonymousClass1(this.$bottom, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(j jVar, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(jVar, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                j jVar = (j) this.L$0;
                DebugCoroutineInfoImpl debugCoroutineInfoImpl = DebugCoroutineInfoImpl.this;
                d callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                Object objYieldFrames = debugCoroutineInfoImpl.yieldFrames(jVar, callerFrame, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objYieldFrames == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", l = {Token.SETCONST}, m = "yieldFrames")
    public static final class C00471 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C00471(kotlin.coroutines.d<? super C00471> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugCoroutineInfoImpl.this.yieldFrames(null, null, this);
        }
    }

    public DebugCoroutineInfoImpl(i iVar, StackTraceFrame stackTraceFrame, long j) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j;
        this._context = new WeakReference<>(iVar);
    }

    private final List<StackTraceElement> creationStackTrace() {
        StackTraceFrame stackTraceFrame = this.creationStackBottom;
        if (stackTraceFrame != null) {
            kotlin.sequences.i iVarG = g.g(new AnonymousClass1(stackTraceFrame, null));
            if (iVarG.hasNext()) {
                Object next = iVarG.next();
                if (!iVarG.hasNext()) {
                    return com.google.common.base.c.p(next);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (iVarG.hasNext()) {
                    arrayList.add(iVarG.next());
                }
                return arrayList;
            }
        }
        return u.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0056 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object yieldFrames(kotlin.sequences.j r6, kotlin.coroutines.jvm.internal.d r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C00471
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C00471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r6
            java.lang.Object r7 = r0.L$1
            kotlin.coroutines.jvm.internal.d r7 = (kotlin.coroutines.jvm.internal.d) r7
            java.lang.Object r1 = r0.L$0
            kotlin.sequences.j r1 = (kotlin.sequences.j) r1
            kotlin.a.e(r8)
            r8 = r6
            r6 = r1
            goto L59
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L3a:
            kotlin.a.e(r8)
            r8 = r7
            r7 = r5
        L3f:
            if (r8 != 0) goto L42
            goto L63
        L42:
            java.lang.StackTraceElement r1 = r8.getStackTraceElement()
            if (r1 == 0) goto L56
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r2
            r6.b(r1, r0)
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            return r6
        L56:
            r4 = r8
            r8 = r7
            r7 = r4
        L59:
            kotlin.coroutines.jvm.internal.d r7 = r7.getCallerFrame()
            if (r7 == 0) goto L63
            r4 = r8
            r8 = r7
            r7 = r4
            goto L3f
        L63:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.yieldFrames(kotlin.sequences.j, kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d):java.lang.Object");
    }

    public final i getContext() {
        return this._context.get();
    }

    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final d getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<d> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        d lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return u.e;
        }
        ArrayList arrayList = new ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(d dVar) {
        this._lastObservedFrame = dVar != null ? new WeakReference<>(dVar) : null;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }

    public final synchronized void updateState$kotlinx_coroutines_core(String str, kotlin.coroutines.d<?> dVar, boolean z) {
        try {
            if (l.a(this._state, DebugCoroutineInfoImplKt.RUNNING) && l.a(str, DebugCoroutineInfoImplKt.RUNNING) && z) {
                this.unmatchedResume++;
            } else if (this.unmatchedResume > 0 && l.a(str, DebugCoroutineInfoImplKt.SUSPENDED)) {
                this.unmatchedResume--;
                return;
            }
            if (l.a(this._state, str) && l.a(str, DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
                return;
            }
            this._state = str;
            setLastObservedFrame$kotlinx_coroutines_core(dVar instanceof d ? (d) dVar : null);
            this.lastObservedThread = l.a(str, DebugCoroutineInfoImplKt.RUNNING) ? Thread.currentThread() : null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
