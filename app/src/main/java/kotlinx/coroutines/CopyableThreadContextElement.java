package kotlinx.coroutines;

import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@DelicateCoroutinesApi
@ExperimentalCoroutinesApi
public interface CopyableThreadContextElement<S> extends ThreadContextElement<S> {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <S, R> R fold(CopyableThreadContextElement<S> copyableThreadContextElement, R r, p pVar) {
            return (R) ThreadContextElement.DefaultImpls.fold(copyableThreadContextElement, r, pVar);
        }

        public static <S, E extends g> E get(CopyableThreadContextElement<S> copyableThreadContextElement, h hVar) {
            return (E) ThreadContextElement.DefaultImpls.get(copyableThreadContextElement, hVar);
        }

        public static <S> i minusKey(CopyableThreadContextElement<S> copyableThreadContextElement, h hVar) {
            return ThreadContextElement.DefaultImpls.minusKey(copyableThreadContextElement, hVar);
        }

        public static <S> i plus(CopyableThreadContextElement<S> copyableThreadContextElement, i iVar) {
            return ThreadContextElement.DefaultImpls.plus(copyableThreadContextElement, iVar);
        }
    }

    CopyableThreadContextElement<S> copyForChild();

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.g
    /* synthetic */ h getKey();

    i mergeForChild(g gVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlinx.coroutines.ThreadContextElement, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);
}
