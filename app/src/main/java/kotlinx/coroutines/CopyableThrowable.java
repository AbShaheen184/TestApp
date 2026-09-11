package kotlinx.coroutines;

import java.lang.Throwable;
import kotlinx.coroutines.CopyableThrowable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalCoroutinesApi
public interface CopyableThrowable<T extends Throwable & CopyableThrowable<T>> {
    T createCopy();
}
