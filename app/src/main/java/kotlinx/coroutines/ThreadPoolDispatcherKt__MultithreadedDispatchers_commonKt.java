package kotlinx.coroutines;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt {
    @DelicateCoroutinesApi
    @ExperimentalCoroutinesApi
    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, str);
    }
}
