package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface ThreadContextElement<S> extends g {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <S, R> R fold(ThreadContextElement<S> threadContextElement, R r, p pVar) {
            return (R) com.google.android.material.resources.g.d(threadContextElement, r, pVar);
        }

        public static <S, E extends g> E get(ThreadContextElement<S> threadContextElement, h hVar) {
            return (E) com.google.android.material.resources.g.f(threadContextElement, hVar);
        }

        public static <S> i minusKey(ThreadContextElement<S> threadContextElement, h hVar) {
            return com.google.android.material.resources.g.h(threadContextElement, hVar);
        }

        public static <S> i plus(ThreadContextElement<S> threadContextElement, i iVar) {
            return com.google.android.material.resources.g.k(iVar, threadContextElement);
        }
    }

    @Override // kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlin.coroutines.g
    /* synthetic */ h getKey();

    @Override // kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    void restoreThreadContext(i iVar, S s);

    S updateThreadContext(i iVar);
}
