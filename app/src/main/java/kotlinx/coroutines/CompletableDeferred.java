package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.g;
import kotlin.coroutines.h;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface CompletableDeferred<T> extends Deferred<T> {
    boolean complete(T t);

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ g get(h hVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.g
    /* synthetic */ h getKey();

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i minusKey(h hVar);

    @Override // kotlinx.coroutines.Deferred, kotlinx.coroutines.Job, kotlin.coroutines.i
    /* synthetic */ i plus(i iVar);

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static <T, R> R fold(CompletableDeferred<T> completableDeferred, R r, p pVar) {
            return (R) Deferred.DefaultImpls.fold(completableDeferred, r, pVar);
        }

        public static <T, E extends g> E get(CompletableDeferred<T> completableDeferred, h hVar) {
            return (E) Deferred.DefaultImpls.get(completableDeferred, hVar);
        }

        public static <T> i minusKey(CompletableDeferred<T> completableDeferred, h hVar) {
            return Deferred.DefaultImpls.minusKey(completableDeferred, hVar);
        }

        public static <T> i plus(CompletableDeferred<T> completableDeferred, i iVar) {
            return Deferred.DefaultImpls.plus(completableDeferred, iVar);
        }

        @c
        public static <T> Job plus(CompletableDeferred<T> completableDeferred, Job job) {
            return Deferred.DefaultImpls.plus((Deferred) completableDeferred, job);
        }
    }
}
