package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;

/* JADX INFO: loaded from: classes.dex */
public final class BuildersKt {
    public static final <T> Deferred<T> async(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.async(coroutineScope, iVar, coroutineStart, pVar);
    }

    public static final <T> Object invoke(CoroutineDispatcher coroutineDispatcher, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.invoke(coroutineDispatcher, pVar, dVar);
    }

    public static final Job launch(CoroutineScope coroutineScope, i iVar, CoroutineStart coroutineStart, p pVar) {
        return BuildersKt__Builders_commonKt.launch(coroutineScope, iVar, coroutineStart, pVar);
    }

    public static final <T> T runBlocking(i iVar, p pVar) {
        return (T) BuildersKt__BuildersKt.runBlocking(iVar, pVar);
    }

    public static final <T> Object withContext(i iVar, p pVar, d<? super T> dVar) {
        return BuildersKt__Builders_commonKt.withContext(iVar, pVar, dVar);
    }
}
