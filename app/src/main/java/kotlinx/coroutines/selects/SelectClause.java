package kotlinx.coroutines.selects;

import kotlin.jvm.functions.q;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface SelectClause {
    Object getClauseObject();

    q getOnCancellationConstructor();

    q getProcessResFunc();

    q getRegFunc();
}
