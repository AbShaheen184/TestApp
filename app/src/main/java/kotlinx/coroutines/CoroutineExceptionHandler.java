package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface CoroutineExceptionHandler extends g {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <R> R fold(CoroutineExceptionHandler coroutineExceptionHandler, R r, p pVar) {
            return (R) com.google.android.material.resources.g.d(coroutineExceptionHandler, r, pVar);
        }

        public static <E extends g> E get(CoroutineExceptionHandler coroutineExceptionHandler, h hVar) {
            return (E) com.google.android.material.resources.g.f(coroutineExceptionHandler, hVar);
        }

        public static i minusKey(CoroutineExceptionHandler coroutineExceptionHandler, h hVar) {
            return com.google.android.material.resources.g.h(coroutineExceptionHandler, hVar);
        }

        public static i plus(CoroutineExceptionHandler coroutineExceptionHandler, i iVar) {
            return com.google.android.material.resources.g.k(iVar, coroutineExceptionHandler);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Key implements h {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlin.coroutines.g
    /* synthetic */ h getKey();

    void handleException(i iVar, Throwable th);

    @Override // kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);
}
