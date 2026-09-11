package kotlinx.coroutines.selects;

import kotlin.coroutines.d;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectKt {
    private static final int TRY_SELECT_ALREADY_SELECTED = 3;
    private static final int TRY_SELECT_CANCELLED = 2;
    private static final int TRY_SELECT_REREGISTER = 1;
    private static final int TRY_SELECT_SUCCESSFUL = 0;
    private static final q DUMMY_PROCESS_RESULT_FUNCTION = new q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kotlin.jvm.functions.q
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };
    private static final Symbol STATE_REG = new Symbol("STATE_REG");
    private static final Symbol STATE_COMPLETED = new Symbol("STATE_COMPLETED");
    private static final Symbol STATE_CANCELLED = new Symbol("STATE_CANCELLED");
    private static final Symbol NO_RESULT = new Symbol("NO_RESULT");
    private static final Symbol PARAM_CLAUSE_0 = new Symbol("PARAM_CLAUSE_0");

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrySelectDetailedResult TrySelectDetailedResult(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    public static final Symbol getPARAM_CLAUSE_0() {
        return PARAM_CLAUSE_0;
    }

    public static final <R> Object select(l lVar, d<? super R> dVar) {
        SelectImplementation selectImplementation = new SelectImplementation(dVar.getContext());
        lVar.invoke(selectImplementation);
        return selectImplementation.doSelect(dVar);
    }

    private static final <R> Object select$$forInline(l lVar, d<? super R> dVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean tryResume(CancellableContinuation<? super y> cancellableContinuation, q qVar) {
        Object objTryResume = cancellableContinuation.tryResume(y.a, null, qVar);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void OnCancellationConstructor$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void ProcessResultFunction$annotations() {
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void RegistrationFunction$annotations() {
    }
}
