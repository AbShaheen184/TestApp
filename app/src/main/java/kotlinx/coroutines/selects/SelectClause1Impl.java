package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SelectClause1Impl<Q> implements SelectClause1<Q> {
    private final Object clauseObject;
    private final q onCancellationConstructor;
    private final q processResFunc;
    private final q regFunc;

    public SelectClause1Impl(Object obj, q qVar, q qVar2, q qVar3) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.processResFunc = qVar2;
        this.onCancellationConstructor = qVar3;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public Object getClauseObject() {
        return this.clauseObject;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getOnCancellationConstructor() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getProcessResFunc() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.SelectClause
    public q getRegFunc() {
        return this.regFunc;
    }

    public /* synthetic */ SelectClause1Impl(Object obj, q qVar, q qVar2, q qVar3, int i, f fVar) {
        this(obj, qVar, qVar2, (i & 8) != 0 ? null : qVar3);
    }
}
