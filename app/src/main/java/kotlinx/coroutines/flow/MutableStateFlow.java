package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface MutableStateFlow<T> extends StateFlow<T>, MutableSharedFlow<T> {
    boolean compareAndSet(T t, T t2);

    @Override // kotlinx.coroutines.flow.StateFlow
    T getValue();

    void setValue(T t);
}
