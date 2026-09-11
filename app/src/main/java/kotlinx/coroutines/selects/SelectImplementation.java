package kotlinx.coroutines.selects;

import com.google.gson.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.o;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private final i context;
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.STATE_REG;
    private List<SelectImplementation<R>.ClauseData> clauses = new ArrayList(2);
    private int indexInSegment = -1;
    private Object internalResult = SelectKt.NO_RESULT;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final q onCancellationConstructor;
        private final Object param;
        private final q processResFunc;
        private final q regFunc;

        public ClauseData(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.clauseObject = obj;
            this.regFunc = qVar;
            this.processResFunc = qVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qVar3;
        }

        public final q createOnCancellationAction(SelectInstance<?> selectInstance, Object obj) {
            q qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return (q) qVar.invoke(selectInstance, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, d<? super R> dVar) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                obj2.getClass();
                return ((l) obj2).invoke(dVar);
            }
            obj2.getClass();
            return ((p) obj2).invoke(obj, dVar);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> selectImplementation) {
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            return ((SelectImplementation) selectImplementation).internalResult == SelectKt.NO_RESULT;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {453, 456}, m = "doSelectSuspend")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectImplementation<R> selectImplementation, d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {729}, m = "processResultAndInvokeBlockRecoveringException")
    public static final class C00661 extends c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00661(SelectImplementation<R> selectImplementation, d<? super C00661> dVar) {
            super(dVar);
            this.this$0 = selectImplementation;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    public SelectImplementation(i iVar) {
        this.context = iVar;
    }

    private final void checkClauseObject(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == obj) {
                net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.o(obj, "Cannot use select clauses on the same object: "));
                return;
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData clauseData) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        state$volatile$FU.set(this, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(d<? super R> dVar) {
        Object obj = state$volatile$FU.get(this);
        obj.getClass();
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj2), dVar);
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, d<? super R> dVar) {
        return selectImplementation.isSelected() ? selectImplementation.complete(dVar) : selectImplementation.doSelectSuspend(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object doSelectSuspend(d<? super R> dVar) {
        AnonymousClass1 anonymousClass1;
        SelectImplementation selectImplementation;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        Object obj2 = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (waitUntilSelected(anonymousClass1) != obj2) {
                selectImplementation = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SelectImplementation selectImplementation2 = (SelectImplementation) anonymousClass1.L$0;
        kotlin.a.e(obj);
        selectImplementation = selectImplementation2;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        Object objComplete = selectImplementation.complete(anonymousClass1);
        return objComplete == obj2 ? obj2 : objComplete;
    }

    private final SelectImplementation<R>.ClauseData findClause(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (((ClauseData) obj3).clauseObject == obj) {
                obj2 = obj3;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Object obj = state$volatile$FU.get(this);
        return obj == SelectKt.STATE_REG || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        return state$volatile$FU.get(this) == SelectKt.STATE_CANCELLED;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object processResultAndInvokeBlockRecoveringException(SelectImplementation<R>.ClauseData clauseData, Object obj, d<? super R> dVar) {
        C00661 c00661;
        if (dVar instanceof C00661) {
            c00661 = (C00661) dVar;
            int i = c00661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00661.label = i - Integer.MIN_VALUE;
            } else {
                c00661 = new C00661(this, dVar);
            }
        } else {
            c00661 = new C00661(this, dVar);
        }
        Object obj2 = c00661.result;
        int i2 = c00661.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(obj2);
                return obj2;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj2);
        Object objProcessResult = clauseData.processResult(obj);
        c00661.label = 1;
        Object objInvokeBlock = clauseData.invokeBlock(objProcessResult, c00661);
        Object obj3 = kotlin.coroutines.intrinsics.a.e;
        return objInvokeBlock == obj3 ? obj3 : objInvokeBlock;
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: register");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        selectImplementation.register(clauseData, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
        clauseDataFindClause.getClass();
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        while (true) {
            Object obj3 = state$volatile$FU.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (kotlin.jvm.internal.l.a(obj3, SelectKt.STATE_COMPLETED) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (kotlin.jvm.internal.l.a(obj3, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (kotlin.jvm.internal.l.a(obj3, SelectKt.STATE_REG)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
                    List listP = com.google.common.base.c.p(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listP)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    b.u(obj3, "Unexpected state: ");
                    return 0;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                ArrayList arrayListW = o.W((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, arrayListW)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                    }
                }
                return 1;
            }
            SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
            if (clauseDataFindClause == null) {
                continue;
            } else {
                q qVarCreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj3, clauseDataFindClause)) {
                        this.internalResult = obj2;
                        if (SelectKt.tryResume((CancellableContinuation) obj3, qVarCreateOnCancellationAction)) {
                            return 0;
                        }
                        this.internalResult = SelectKt.NO_RESULT;
                        return 2;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj3);
            }
        }
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lVar.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object waitUntilSelected(d<? super y> dVar) {
        y yVar;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = SelectKt.STATE_REG;
            yVar = y.a;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, cancellableContinuationImpl)) {
                        CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl, this);
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            } else {
                if (!(obj instanceof List)) {
                    if (obj instanceof ClauseData) {
                        cancellableContinuationImpl.resume(yVar, ((ClauseData) obj).createOnCancellationAction(this, this.internalResult));
                        break;
                    }
                    b.u(obj, "unexpected state: ");
                    return null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                Symbol symbol2 = SelectKt.STATE_REG;
                do {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, symbol2)) {
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            reregisterClause(it.next());
                        }
                        break;
                    }
                } while (atomicReferenceFieldUpdater3.get(this) == obj);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(d<? super R> dVar) {
        return doSelect$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public i getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_COMPLETED) {
                return;
            }
            Symbol symbol = SelectKt.STATE_CANCELLED;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    List<SelectImplementation<R>.ClauseData> list = this.clauses;
                    if (list == null) {
                        return;
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((ClauseData) it.next()).dispose();
                    }
                    this.internalResult = SelectKt.NO_RESULT;
                    this.clauses = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @kotlin.c
    @ExperimentalCoroutinesApi
    public void onTimeout(long j, l lVar) {
        SelectBuilder.DefaultImpls.onTimeout(this, j, lVar);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z) {
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z) {
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            list.getClass();
            list.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        return SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, l lVar) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lVar, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, p pVar) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, pVar, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, p pVar) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p, pVar, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, p pVar) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, pVar);
    }
}
