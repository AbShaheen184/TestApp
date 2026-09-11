package kotlinx.coroutines.internal;

import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Synchronized_commonKt {
    @InternalCoroutinesApi
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m97synchronized(Object obj, kotlin.jvm.functions.a aVar) {
        T t;
        synchronized (obj) {
            t = (T) aVar.invoke();
        }
        return t;
    }
}
