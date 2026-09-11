package kotlinx.coroutines.sync;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class MutexImpl$onLock$2 extends j implements q {
    public static final MutexImpl$onLock$2 INSTANCE = new MutexImpl$onLock$2();

    public MutexImpl$onLock$2() {
        super(3, MutexImpl.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(MutexImpl mutexImpl, Object obj, Object obj2) {
        return mutexImpl.onLockProcessResult(obj, obj2);
    }
}
