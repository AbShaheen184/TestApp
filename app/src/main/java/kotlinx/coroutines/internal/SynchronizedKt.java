package kotlinx.coroutines.internal;

import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SynchronizedKt {
    @InternalCoroutinesApi
    public static final <T> T synchronizedImpl(Object obj, kotlin.jvm.functions.a aVar) {
        T t;
        synchronized (obj) {
            t = (T) aVar.invoke();
        }
        return t;
    }

    @InternalCoroutinesApi
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }
}
