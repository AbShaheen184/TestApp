package kotlinx.coroutines.selects;

import kotlin.coroutines.i;
import kotlin.jvm.internal.c0;
import kotlin.y;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class OnTimeout {
    private final long timeMillis;

    public OnTimeout(long j) {
        this.timeMillis = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(final SelectInstance<?> selectInstance, Object obj) {
        if (this.timeMillis <= 0) {
            selectInstance.selectInRegistrationPhase(y.a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.register$lambda$0(selectInstance, this);
            }
        };
        selectInstance.getClass();
        SelectImplementation selectImplementation = (SelectImplementation) selectInstance;
        i context = selectImplementation.getContext();
        selectImplementation.disposeOnCompletion(DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(SelectInstance selectInstance, OnTimeout onTimeout) {
        selectInstance.trySelect(onTimeout, y.a);
    }

    public final SelectClause0 getSelectClause() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        onTimeout$selectClause$1.getClass();
        c0.c(3, onTimeout$selectClause$1);
        return new SelectClause0Impl(this, onTimeout$selectClause$1, null, 4, null);
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }
}
