package kotlinx.coroutines.selects;

import kotlin.c;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface SelectBuilder<R> {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <R, P, Q> void invoke(SelectBuilder<? super R> selectBuilder, SelectClause2<? super P, ? extends Q> selectClause2, p pVar) {
            selectBuilder.invoke(selectClause2, null, pVar);
        }

        @c
        @ExperimentalCoroutinesApi
        public static <R> void onTimeout(SelectBuilder<? super R> selectBuilder, long j, l lVar) {
            OnTimeoutKt.onTimeout(selectBuilder, j, lVar);
        }
    }

    void invoke(SelectClause0 selectClause0, l lVar);

    <Q> void invoke(SelectClause1<? extends Q> selectClause1, p pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p, p pVar);

    <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, p pVar);

    @c
    @ExperimentalCoroutinesApi
    void onTimeout(long j, l lVar);
}
