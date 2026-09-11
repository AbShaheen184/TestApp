package kotlinx.coroutines.selects;

import kotlin.coroutines.i;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface SelectInstance<R> {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    i getContext();

    void selectInRegistrationPhase(Object obj);

    boolean trySelect(Object obj, Object obj2);
}
