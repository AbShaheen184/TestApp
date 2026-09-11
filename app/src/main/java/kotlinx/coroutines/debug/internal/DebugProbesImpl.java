package kotlinx.coroutines.debug.internal;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import com.app.mlounge.ui.screens.player.j0;
import com.google.android.gms.dynamite.f;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.a0;
import kotlin.collections.n;
import kotlin.collections.o;
import kotlin.collections.r;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.d;
import kotlin.io.h;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import kotlin.sequences.g;
import kotlin.sequences.k;
import kotlin.y;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<d, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final l dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final /* synthetic */ AtomicInteger installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ AtomicLong sequenceNumber;
    private static Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class CoroutineOwner<T> implements kotlin.coroutines.d<T>, d {
        public final kotlin.coroutines.d<T> delegate;
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(kotlin.coroutines.d<? super T> dVar, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = dVar;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // kotlin.coroutines.jvm.internal.d
        public d getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public i getContext() {
            return this.delegate.getContext();
        }

        @Override // kotlin.coroutines.jvm.internal.d
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(obj);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = _COROUTINE.a.f(new Exception(), _COROUTINE.b.class.getSimpleName());
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        installations = new AtomicInteger(0);
        sequenceNumber = new AtomicLong(0L);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) o.M(debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String state$kotlinx_coroutines_core = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
            StringBuilder sbN = c.n(str);
            c.y(sbN, getDebugString(job), ", continuation is ", state$kotlinx_coroutines_core, " at line ");
            sbN.append(stackTraceElement);
            sbN.append('\n');
            sb.append(sbN.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            StringBuilder sbN2 = c.n(str);
            sbN2.append(getDebugString(job));
            sbN2.append('\n');
            sb.append(sbN2.toString());
            str = str + '\t';
        }
        Iterator it = job.getChildren().iterator();
        while (it.hasNext()) {
            build((Job) it.next(), map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> kotlin.coroutines.d<T> createOwner(kotlin.coroutines.d<? super T> dVar, StackTraceFrame stackTraceFrame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return dVar;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(dVar, new DebugCoroutineInfoImpl(dVar.getContext(), stackTraceFrame, getSequenceNumber().incrementAndGet()));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final p pVar) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return k.r(k.q(new h(3, o.D(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
                /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
                @Override // kotlin.jvm.functions.l
                public final R invoke(CoroutineOwner<?> coroutineOwner) {
                    i context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return pVar.invoke(coroutineOwner, context);
                }
            }));
        }
        net.luminis.tls.engine.impl.c.r("Debug probes are not installed");
        return null;
    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            net.luminis.tls.engine.impl.c.r("Debug probes are not installed");
            return;
        }
        printStream.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        g gVar = new g(o.D(getCapturedCoroutines()), true, new j0(24));
        Comparator comparator = new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return com.google.android.material.resources.c.f(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
            }
        };
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        r.B(comparator, arrayList);
        for (CoroutineOwner coroutineOwner : arrayList) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            printStream.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((kotlin.jvm.internal.l.a(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.getState$kotlinx_coroutines_core()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                printStream.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(printStream, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(printStream, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String str, Thread thread, List<StackTraceElement> list) {
        Object lVar;
        if (kotlin.jvm.internal.l.a(str, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                lVar = thread.getStackTrace();
            } catch (Throwable th) {
                lVar = new kotlin.l(th);
            }
            if (lVar instanceof kotlin.l) {
                lVar = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) lVar;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (kotlin.jvm.internal.l.a(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && kotlin.jvm.internal.l.a(stackTraceElement.getMethodName(), "resumeWith") && kotlin.jvm.internal.l.a(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i++;
                }
                kotlin.k kVarFindContinuationStartIndex = findContinuationStartIndex(i, stackTraceElementArr, list);
                int iIntValue = ((Number) kVarFindContinuationStartIndex.e).intValue();
                int iIntValue2 = ((Number) kVarFindContinuationStartIndex.y).intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i) - iIntValue) - 1) - iIntValue2);
                    int i2 = i - iIntValue2;
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList.add(stackTraceElementArr[i3]);
                    }
                    int size = list.size();
                    for (int i4 = iIntValue + 1; i4 < size; i4++) {
                        arrayList.add(list.get(i4));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    private final kotlin.k findContinuationStartIndex(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((i - 1) - i2, stackTraceElementArr, list);
            if (iFindIndexOfFrame != -1) {
                return new kotlin.k(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i2));
            }
        }
        return new kotlin.k(-1, 0);
    }

    private final int findIndexOfFrame(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) n.Q(i, stackTraceElementArr);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (kotlin.jvm.internal.l.a(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && kotlin.jvm.internal.l.a(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && kotlin.jvm.internal.l.a(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private final l getDynamicAttach() {
        Object lVar;
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            objNewInstance.getClass();
            c0.c(1, objNewInstance);
            lVar = (l) objNewInstance;
        } catch (Throwable th) {
            lVar = new kotlin.l(th);
        }
        return (l) (lVar instanceof kotlin.l ? null : lVar);
    }

    private final /* synthetic */ AtomicInteger getInstallations() {
        return installations;
    }

    private final /* synthetic */ AtomicLong getSequenceNumber() {
        return sequenceNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        i context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return kotlin.text.r.O(stackTraceElement.getClassName(), "kotlinx.coroutines", false);
    }

    private final CoroutineOwner<?> owner(kotlin.coroutines.d<?> dVar) {
        d dVar2 = dVar instanceof d ? (d) dVar : null;
        if (dVar2 != null) {
            return owner(dVar2);
        }
        return null;
    }

    private final void printStackTrace(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> coroutineOwner) {
        d dVarRealCaller;
        capturedCoroutinesMap.remove(coroutineOwner);
        d lastObservedFrame$kotlinx_coroutines_core = coroutineOwner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (dVarRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(dVarRealCaller);
    }

    private final d realCaller(d dVar) {
        do {
            dVar = dVar.getCallerFrame();
            if (dVar == null) {
                return null;
            }
        } while (dVar.getStackTraceElement() == null);
        return dVar;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (kotlin.jvm.internal.l.a(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length2 = i2;
            }
        }
        int i3 = i + 1;
        if (!sanitizeStackTraces) {
            int i4 = length - i3;
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(stackTrace[i5 + i3]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i3) + 1);
        while (i3 < length) {
            if (isInternalMethod(stackTrace[i3])) {
                arrayList2.add(stackTrace[i3]);
                int i6 = i3 + 1;
                while (i6 < length && isInternalMethod(stackTrace[i6])) {
                    i6++;
                }
                int i7 = i6 - 1;
                int i8 = i7;
                while (i8 > i3 && stackTrace[i8].getFileName() == null) {
                    i8--;
                }
                if (i8 > i3 && i8 < i7) {
                    arrayList2.add(stackTrace[i8]);
                }
                arrayList2.add(stackTrace[i7]);
                i3 = i6;
            } else {
                arrayList2.add(stackTrace[i3]);
                i3++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        f fVar = new f(new b(0));
        fVar.setDaemon(true);
        fVar.setName("Coroutines Debugger Cleaner");
        fVar.start();
        weakRefCleanerThread = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return y.a;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(d dVar, String str) {
        boolean z;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<d, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(dVar);
            if (debugCoroutineInfoImplRemove != null) {
                z = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(dVar);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                d lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                d dVarRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (dVarRealCaller != null) {
                    concurrentWeakMap.remove(dVarRealCaller);
                }
                z = true;
            }
            dVar.getClass();
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(str, (kotlin.coroutines.d) dVar, z);
            d dVarRealCaller2 = realCaller(dVar);
            if (dVarRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(dVarRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final void updateState(kotlin.coroutines.d<?> dVar, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && dVar.getContext() == j.e) {
                return;
            }
            if (kotlin.jvm.internal.l.a(str, DebugCoroutineInfoImplKt.RUNNING)) {
                d dVar2 = dVar instanceof d ? (d) dVar : null;
                if (dVar2 == null) {
                    return;
                }
                updateRunningState(dVar2, str);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(dVar);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, dVar, str);
        }
    }

    public final void dumpCoroutines(PrintStream printStream) {
        synchronized (printStream) {
            INSTANCE.dumpCoroutinesSynchronized(printStream);
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return k.r(k.q(new h(3, o.D(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.l
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    i context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        net.luminis.tls.engine.impl.c.r("Debug probes are not installed");
        return null;
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            i context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.Key);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            sbX.append(lValueOf);
            sbX.append(",\n                    \"dispatcher\": ");
            sbX.append(stringRepr2);
            sbX.append(",\n                    \"sequenceNumber\": ");
            sbX.append(debugCoroutineInfo.getSequenceNumber());
            sbX.append(",\n                    \"state\": \"");
            sbX.append(debugCoroutineInfo.getState());
            sbX.append("\"\n                } \n                ");
            arrayList3.add(kotlin.text.l.D(sbX.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("["), o.R(arrayList3, null, null, null, null, 63), ']'), arrayList.toArray(new Thread[0]), arrayList2.toArray(new d[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return k.r(k.q(new h(3, o.D(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kotlin.jvm.functions.l
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    i context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        net.luminis.tls.engine.impl.c.r("Debug probes are not installed");
        return null;
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo debugCoroutineInfo, List<StackTraceElement> list) {
        return enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo.getState(), debugCoroutineInfo.getLastObservedThread(), list);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo debugCoroutineInfo) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(debugCoroutineInfo, debugCoroutineInfo.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb.append(fileName != null ? toStringRepr(fileName) : null);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(kotlin.text.l.D(sb.toString()));
        }
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(new StringBuilder("["), o.R(arrayList, null, null, null, null, 63), ']');
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            net.luminis.tls.engine.impl.c.r("Debug probes are not installed");
            return null;
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.Key) != null) {
                arrayList.add(obj);
            }
        }
        int iU = a0.u(kotlin.collections.p.y(arrayList, 10));
        if (iU < 16) {
            iU = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
        for (CoroutineOwner coroutineOwner : arrayList) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb, "");
        return sb.toString();
    }

    public final void install$kotlinx_coroutines_core() {
        l lVar;
        if (getInstallations().incrementAndGet() > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return getInstallations().get() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> kotlin.coroutines.d<T> probeCoroutineCreated$kotlinx_coroutines_core(kotlin.coroutines.d<? super T> dVar) {
        if (isInstalled$kotlinx_coroutines_debug() && (!(ignoreCoroutinesWithEmptyContext && dVar.getContext() == j.e) && owner(dVar) == null)) {
            return createOwner(dVar, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return dVar;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(kotlin.coroutines.d<?> dVar) {
        updateState(dVar, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(kotlin.coroutines.d<?> dVar) {
        updateState(dVar, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z) {
        enableCreationStackTraces = z;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z) {
        ignoreCoroutinesWithEmptyContext = z;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z) {
        sanitizeStackTraces = z;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        l lVar;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            net.luminis.tls.engine.impl.c.r("Agent was not installed");
            return;
        }
        if (getInstallations().decrementAndGet() != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(d dVar) {
        while (!(dVar instanceof CoroutineOwner)) {
            dVar = dVar.getCallerFrame();
            if (dVar == null) {
                return null;
            }
        }
        return (CoroutineOwner) dVar;
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }

    private final void updateState(CoroutineOwner<?> coroutineOwner, kotlin.coroutines.d<?> dVar, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            coroutineOwner.info.updateState$kotlinx_coroutines_core(str, dVar, true);
        }
    }
}
